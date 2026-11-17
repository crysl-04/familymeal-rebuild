# familymeal 求解器（P0 · core:solver 的 JVM 移植）

从反编译参考实现（`reference/sources/defpackage/`）忠实移植的周食谱求解引擎。**这是仓库第一个可构建、可运行的模块**——整个 App 的核心：一键生成全家一周食谱。

## 快速开始

依赖：JDK 17+（仅需 javac/java，无 Gradle、无 Android Studio）。

```powershell
# Windows（编译 + 运行，默认 11 月 / 20 秒限时）
.\build.ps1 -Seed C:\path\to\seed -Parity

# Linux / macOS
./build.sh --seed /path/to/seed --parity
```

没有 `persons.json`？用仓库自带的示例（成员年龄已脱敏）：
`--persons persons.example.json`

## CLI 参数

| 参数 | 默认 | 说明 |
|---|---|---|
| `--seed <目录>` | 自动探测 `seed/` 或 `C:\fmre\seed` | 含 ingredients/recipes/persons/schedule.json |
| `--month <1-12>` | 11 | 计划月份（决定季节过滤） |
| `--limit-ms <n>` | 20000 | 硬限时（超时即中止） |
| `--stop-ms <n>` | 8000 | "够用即停"时间 |
| `--parity` | 关 | PYTHON_PARITY 口径（主食固定 1 份、全天目标），用于与 856.67 锚点对比 |
| `--persons <文件>` | 种子目录内 | 覆盖 persons.json 路径 |
| `--out <文件>` | 控制台 | 报告输出文件 |
| `--quiet` | 关 | 只输出摘要行 |

退出码：0 = 可行且硬约束 0 违规；1 = 不可行/超时/错误；2 = 可行但有违规。

## 双口径说明（重要）

设计文档 v3 记载了两个模型口径，本求解器同时支持：

1. **PYTHON_PARITY**（`--parity`）：主食固定 1 份、营养目标按全天比较。这是与原 Python/CBC 版逐项对比的口径，也是 **856.67 锚点的口径**。文档 P0 记录"与 Python/CBC 对比目标值完全一致、桌面上限时 3 秒目标值差距 ≤ 0.9%"。
2. **最终应用口径**（默认）：同桌不同量（主食份量 0.5–2.0 连续变量）+ 目标按在家餐次 30/40/30 折算（P4 引入）。目标值口径不同，不可与 856.67 直接比较。

## 模型规格

**决策变量**
- `x_{日}_{餐}_{菜}` ∈ {0,1}：菜是否排入餐位
- `z_{餐位}_{人}_{主食}` ∈ [0.5, 2.0]（连续）：某人同桌某主食的份量；线性化 `z ≤ hi·x`、`z ≥ lo·x`
- 偏差辅助变量 `u, o ≥ 0`（连续，带目标权重）

**硬约束**（审计器逐条独立复核）
1. 结构：早餐 = 早餐菜×1；午/晚餐 = 主菜×1 + 蔬菜×1 + 主食×1 + 汤×0–1
2. 每周重复 ≤ 2（主食类免限制）
3. 相邻两天同餐次不同菜（午餐/晚餐）
4. 同餐型两餐位不得完全相同的非免重复菜组合（连续辅助变量技巧：`y_r ≥ x_A+x_B−1`，`Σ y_r ≤ fixedCount−1`）
5. 鱼餐位（周三/周五晚餐）：≥3 人用餐须整鱼，否则须鱼类
6. 周末午餐：周六+周日合计恰一餐鱼、恰一餐虾
7. 工作日午/晚餐仅快手菜（fish_whole/fish_portion/shrimp 标签豁免）
8. 忌口：任一用餐者的忌口类别命中菜品食材类别 → 禁用
9. 最少用餐人数、季节过滤（4–10 月：四季/夏季；其余：四季/冬季）
10. 营养目标区间（软约束进目标）：五项营养素按折算目标 ∈ [min, max]

**目标函数**

```
min Σ_{人,天,营养素} weight_n × (under + over)
```
权重（反编译 lz1.q）：热量 0.01、蛋白质 1.0、脂肪 0.5、碳水 0.02、纤维 1.0。

## 验收结果（2026-11-17，真实种子 89 食材 / 75 菜谱 / 4 成员）

| 文档验收标准 | 结果 |
|---|---|
| 硬约束违规 = 0 | ✅ 全部口径、全部月份 0 违规 |
| 目标值 vs 856.67 锚点（差 ≤5%） | ✅ 11 月 parity 20s：**849.03** = 文档最优解（856.67 = 最优 × 1.009，桌面更快直达最优） |
| 桌面限时 3 秒差 ≤0.9% | ✅ 11 月 parity 3s：849.03（差 0.001%） |
| 7 月计划可行 | ✅ parity 20s：821.26，0 违规 |
| 最终应用口径 | ✅ 11 月 20s：180.51（含份量与折算，FEASIBLE 未证最优），0 违规 |

## 与反编译参考实现的类名映射

| 原始类 | 混淆名 | 本移植 |
|---|---|---|
| PlanRules | `lz1` | `Model.PlanRules` |
| PlanInput | `bz1` | `Model.PlanInput` |
| PlanContext | `sy1` | `PlanSolver`（上下文部分） |
| 求解门面 | `jg1` | `PlanSolver.solve()` |
| MealType / CourseCategory / Season / Nutrient | `te1` / `zr` / `cf2` / `zo1` | `Model.MealType/Category/Season/Nutrient` |
| Nutrients / NutrientRange / DailyTargets | `bp1` / `ap1` / `e40` | `Model.Nutrients/NutrientRange/DailyTargets` |
| Ingredient / Recipe / Person | `uv0` / `j62` / `rx1` | `Model.Ingredient/Recipe/Person` |
| RecipeIngredient / Schedule | `z62` / `ed2` | `Model.RecipeIngredientLine/Schedule` |
| ExpressionsBasedModel / Options / Result / State | `ii0` / `ds1` / `gs1` / `is1` | ojAlgo 原生 API |

## 协作指南

- 依赖已入库（`libs/`，SHA-256 见 `libs/SHA256SUMS.txt`），clone 后即可编译，无需联网
- 改规则/模型后请跑 `--parity` 确认 11 月目标值仍 ≤ 856.67×1.009，防止模型漂移
- 认领后续模块：P1 工程骨架、P2 数据层、P3 营养目标计算（`TargetCalculator`，公式见设计文档 §4）、P4 界面与生成流程、P5 体重与智能调整、P6 备份恢复——施工顺序见 `familymeal-重建施工计划.md`
- 反编译参考实现在 `reference/sources/`，混淆名映射见 `familymeal-逆向还原评估.md` §4
