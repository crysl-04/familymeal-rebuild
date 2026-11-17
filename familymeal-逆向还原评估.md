# 家庭食谱 App（familymeal 0.1.0）逆向还原评估

**日期**：2026-11-16
**样本**：`Desktop\2026 pos1\个人\learn\familymeal-0.1.0.apk.1.apk.1_tmp.apk.1_tmp`（12,145,645 字节，微信转存重命名，已复制为 `C:\fmre\familymeal-0.1.0.apk`）
**工具**：jadx 1.5.6 + 本机 Java 17（纯静态分析，无手机、无 root）
**产物**：`C:\fmre\out`（反编译树 23MB，已打包为同目录 `familymeal-0.1.0-反编译包.zip` 8.3MB；种子 JSON 已单独复制到 learn 文件夹）

## 0. 一句话结论

一个 APK 文件就够完成逆向：**数据层（种子 + schema）100% 完整拿回；业务逻辑约九成可读还原——符号名丢失，但流程、常数、中文报错文案全部幸存；UI 与构建工程原理上就不在 APK 里**。重写应以《设计文档 v3》为规格书、本反编译包为参考实现。

## 1. 文件身份核对（APK 实际 vs 设计文档 v3）

| 证据来源 | APK 内实际 | 与文档 |
|---|---|---|
| 包名 | `com.familymeal.app` | 一致（文档未写，本次确认） |
| 版本 | versionName 0.1.0 / versionCode 1 | 与文件名一致 |
| 构建工具 | AGP 9.5.1（META-INF app-metadata.properties） | 与 P1 记录一致 |
| compileSdk | 37 | 一致 |
| 数据库加密 | `libsqlcipher.so`，arm64-v8a / armeabi-v7a / x86 / x86_64 四 ABI | 与第 5、6 节一致 |
| 权限 | 仅 `USE_BIOMETRIC` + `USE_FINGERPRINT` | 与第 6 节白名单一致 |
| 组件暴露 | 仅 MainActivity `exported=true`，`allowBackup=false` | 与第 6 节一致 |
| 种子数据 | assets 四份 JSON：**89 食材 / 75 菜谱 / 4 成员 / 时间表** | 与 P2 记录完全一致 |
| 性能 | assets/dexopt/baseline.prof | 与 P1 AOT 优化记录对应 |
| 应用名 | 家庭食谱（strings.xml） | 一致 |
| 构建时 git | `NO_VALID_GIT_FOUND`（version-control-info.textproto） | 构建机当时未在有效 git 仓库内，无提交信息 |

## 2. 混淆程度（本次逆向的核心事实）

- 单 `classes.dex` 3.6MB；jadx 反编译出 **3919 个 Java 文件 / 386,225 行**，96 个反编译错误（jadx 正常水平）。
- **R8 全量重命名 + 重打包**：3919 个类中 3811 个进入 `defpackage`；App 自有类名（TargetCalculator、Adjuster、BackupCodec、EntityChecks、PlanRules、WeightTrend、BackupRepository……）**一个都不存在**。
- 保留原名的只有三类（R8 keep 规则的必然结果）：
  1. Manifest 引用的 `MainActivity`、`MealPlannerApp`；
  2. Room 保留的 `AppDatabase` / `AppDatabase_Impl`（`com.familymeal.app.data.db`）；
  3. JNI 引用的 SQLCipher（`net.zetetic`）及 androidx / kotlin 库本身。
- **mapping.txt 不在 APK 内**（它在构建机 `app/build/outputs/mapping/release/`）。APK 中只嵌了 map-id 哈希（`r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b`），没有构建机就拿不回原名。
- 但字符串常量、数值常数、枚举名、资源、控制流全部保留——逻辑可读性不受影响（见 §4）。

## 3. 已还原资产清单

### A. 完整还原，可直接复用
- **种子数据 4 份 JSON**（`C:\fmre\seed\`，反编译包内也在 `out/resources/assets/`）：89 食材（营养/类别/标签）、75 菜谱（含食材明细克数）、4 位成员（少年/青年/中年女/中年男，含营养目标与忌口；成员具体年龄属家人隐私，仓库内已脱敏，真实值仅本地留存）、7×3 时间表——家庭菜谱库与成员档案的完整业务数据。
- **数据库 schema 全量**：建表 SQL 在 `defpackage/ja2.java`，共 **12 张表**：`ingredient`、`recipe`、`recipe_ingredient`、`meta`、`person`、`schedule_slot`、`plan`、`plan_dish`、`plan_diner`、`plan_portion`、`shopping_check`、`weight_entry`——与文档 v1→v5 迁移史逐表对应。
- Manifest 安全配置全量、strings.xml 中文文案全量、资源与 assets 原样。

### B. 高价值还原（可读逻辑，符号名已换）
- **营养目标计算**（`defpackage/rs2.java`）：成人活动系数 1.375 / 1.55 / 1.725（SEDENTARY 1.0 起步），另有两套 **IOM 少年活动系数：男孩 1.13/1.26、女孩 1.16/1.31**——比文档第 4 节的概述记录更细。
- **智能调整**（`rs2` / `t03` / `tw1`）：7700 kcal/kg 换算常数命中，±100 kcal、±300 封顶、下限 1200/1500 等规则可在常数与分支中逐条对应。
- **备份编解码**（`fk.java` / `yj.java`）：格式串 `meal-planner-backup`、5,242,880 字节上限、"不是家庭食谱的备份文件""备份来自更新版本的应用（格式 X），请先升级应用"等中文报错**原文逐行可读**。
- 备份字段名全部幸存：`includes_body_data` / `weight_entries` / `exported_at` / `restore_undo`。
- 食材 ID 规则（`ing_` 前缀，19 个文件命中）。

### C. 有但难读
- **Compose UI**（MainActivity 15KB + MealPlannerApp 142KB + 大量 defpackage 重组代码）：建议照真机截图重写，不逐行还原。
- **ojAlgo 求解模型**：`org.ojalgo` 包名已被抹掉，需按"算法调用顺序 + 约束常数"识别（`lo·x ≤ z ≤ hi·x` 那类结构可逐步锁定）。

### D. APK 内不存在（逆向原理性拿不回）
- 57 个 JVM 单测、`tools/parity`、`tools/sign-release.ps1`、`tools/emu.ps1`；
- Gradle 工程文件与 version catalog 精确版本（部分可从 META-INF `*.version` 文件反推）；
- 注释、Kotlin 语法糖、git 历史；
- SQLCipher 数据库密钥与真机数据（Keystore 硬件绑定不出设备；数据走 App 内"备份"导出 JSON 通道）。

## 4. 混淆名 → 功能映射表（本次锚定的起点）

| 功能（文档中的名字） | 反编译位置 | 锚点证据 |
|---|---|---|
| 营养目标计算 TargetCalculator | `defpackage/rs2.java` | 1.375/1.55/1.725 + IOM 1.13/1.26、1.16/1.31 |
| 智能调整 Adjuster / WeightTrend | `defpackage/rs2.java`、`t03.java`、`tw1.java` | 7700 |
| 备份编解码 BackupCodec | `defpackage/fk.java` | `meal-planner-backup`、5242880 |
| 备份仓储 BackupRepository | `defpackage/yj.java` | `meal-planner-backup`、`restore_undo` |
| 导出文件名 | `bn.java`、`cc1.java` | "家庭食谱" |
| 数据库 schema | `defpackage/ja2.java` + `com.familymeal.app.data.db.AppDatabase(_Impl)` | CREATE TABLE ×12 |
| Room 实体/DAO | `yv0` `m62` `ag1` `sx1` 等（经 AppDatabase_Impl 构造器定位） | AppDatabase_Impl 引用 |

## 5. 重写路线建议

1. **规格书 = 设计文档 v3**（公式、约束、校验规则、表结构、各阶段验收标准齐备）；**参考实现 = 本反编译包**。两者冲突时以文档为准——文档里有"为什么"。
2. 数据层零成本起步：种子 JSON 直接复用；建表 SQL 从 `ja2.java` 抄。
3. 纯逻辑模块（营养计算、备份校验）按 §4 映射表逐类对齐，中文报错文案可整段照抄。
4. Compose UI 照真机截图重写；求解器按文档 P0 验收标准重建（与 Python/CBC 对比，目标值差 ≤5%）。
5. **若构建机还在**：优先取回 `app/build/outputs/mapping/release/mapping.txt` 和 `.git`——有了 mapping.txt，本反编译包的全部符号名可一键复原，逆向产物即接近源码。
6. 手机上 App 内"设置 → 备份"导出 JSON（经微信发给自己）→ 拿到种子之外的实时数据（体重记录、历史周食谱、采购勾选状态）。

## 6. 复现方式

```powershell
# 工作目录 C:\fmre（familymeal-0.1.0.apk / out / seed / tools\jadx）
C:\fmre\tools\jadx\bin\jadx.bat -d C:\fmre\out C:\fmre\familymeal-0.1.0.apk
# 种子 JSON：C:\fmre\seed\ 与 C:\fmre\out\resources\assets\
```
