package app.familymeal.solver;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import app.familymeal.solver.Model.MealType;
import app.familymeal.solver.Model.Nutrient;
import app.familymeal.solver.Model.PlanInput;
import app.familymeal.solver.Model.PlanRules;
import app.familymeal.solver.Model.Slot;
import app.familymeal.solver.SeedLoader.SeedData;

/**
 * CLI 入口：加载种子 → 建模求解 → 独立审计 → 输出报告。
 *
 * 用法：
 *   java app.familymeal.solver.Main --seed <目录> [--month 11] [--limit-ms 20000]
 *        [--stop-ms 8000] [--persons <persons.json>] [--out <报告.txt>] [--quiet]
 *
 * 退出码：0 = 可行且硬约束 0 违规；1 = 不可行/超时/错误；2 = 可行但有违规。
 */
public final class Main {

    public static void main(String[] args) throws Exception {
        Path seedDir = null;
        Path personsFile = null;
        int month = 11;
        long limitMs = 20_000;
        long stopMs = 8_000;
        Path out = null;
        boolean quiet = false;
        boolean parity = false;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--seed" -> seedDir = Paths.get(args[++i]);
                case "--persons" -> personsFile = Paths.get(args[++i]);
                case "--month" -> month = Integer.parseInt(args[++i]);
                case "--limit-ms" -> limitMs = Long.parseLong(args[++i]);
                case "--stop-ms" -> stopMs = Long.parseLong(args[++i]);
                case "--out" -> out = Paths.get(args[++i]);
                case "--quiet" -> quiet = true;
                case "--parity" -> parity = true;
                default -> {
                    System.err.println("未知参数: " + args[i]);
                    System.exit(2);
                }
            }
        }
        if (seedDir == null) {
            for (Path cand : List.of(Paths.get("seed"), Paths.get("C:/fmre/seed"))) {
                if (Files.exists(cand)) {
                    seedDir = cand;
                    break;
                }
            }
        }
        if (seedDir == null) {
            System.err.println("未找到种子目录：请用 --seed 指定包含 ingredients/recipes/persons/schedule.json 的目录");
            System.exit(2);
        }

        StringBuilder report = new StringBuilder();
        SeedData data;
        try {
            if (personsFile != null) {
                data = loadWithPersonsOverride(seedDir, personsFile);
            } else {
                data = SeedLoader.loadAndValidate(seedDir);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("种子数据校验失败：" + e.getMessage());
            System.exit(2);
            return;
        }

        report.append("=== familymeal 求解器 P0 验收 ===\n");
        report.append("种子目录: ").append(seedDir.toAbsolutePath()).append('\n');
        report.append("数据规模: ").append(data.ingredients().size()).append(" 食材 / ")
                .append(data.recipes().size()).append(" 菜谱 / ")
                .append(data.persons().size()).append(" 成员\n");
        report.append("月份: ").append(month).append("  限时: ").append(limitMs)
                .append(" ms（够用即停 ").append(Math.min(stopMs, limitMs)).append(" ms）\n\n");

        PlanRules rules = parity ? parityRules() : PlanRules.defaults();
        if (parity) {
            report.append("口径: PYTHON_PARITY（主食固定 1 份、全天目标，与 856.67 锚点同口径）\n");
        }
        PlanInput input = new PlanInput(data.recipes(), data.ingredients(), data.persons(),
                data.schedule(), month, rules, Map.of(), Map.of());
        PlanSolver solver = new PlanSolver(input);
        PlanSolver.SolveResult result = solver.solve(limitMs, stopMs);

        report.append("状态: ").append(result.status()).append('\n');
        report.append("建模耗时: ").append(result.buildMs()).append(" ms\n");
        report.append("求解耗时: ").append(result.solveMs()).append(" ms\n");
        if (!result.warnings().isEmpty()) {
            report.append("提示:\n");
            for (String w : result.warnings()) {
                report.append("  - ").append(w).append('\n');
            }
        }

        if (!result.feasible()) {
            report.append("消息: ").append(result.message()).append('\n');
            flush(report, out, quiet);
            System.exit(1);
            return;
        }

        report.append(String.format("目标值（加权营养偏差，越小越好）: %.2f%n", result.objective()));
        report.append('\n');

        // 独立审计
        Auditor auditor = new Auditor(input, solver);
        Auditor.AuditReport audit = auditor.audit(result);

        report.append("=== 硬约束审计 ===\n");
        if (audit.violations().isEmpty()) {
            report.append("硬约束违规: 0 项 ✅\n");
        } else {
            report.append("硬约束违规: ").append(audit.violations().size()).append(" 项 ❌\n");
            for (var v : audit.violations()) {
                report.append("  ").append(v).append('\n');
            }
        }
        report.append(String.format("重算目标值: %.2f（求解器 %.2f，差 %.4f）%n",
                audit.recomputedObjective(), result.objective(),
                Math.abs(audit.recomputedObjective() - result.objective())));
        report.append('\n');

        report.append("=== 周计划 ===\n");
        for (DayOfWeek day : DayOfWeek.values()) {
            for (MealType meal : MealType.values()) {
                Slot s = new Slot(day, meal);
                List<String> diners = data.schedule().diners(day, meal);
                if (diners.isEmpty()) {
                    continue;
                }
                Map<String, Double> sel = result.dishes().getOrDefault(s, Map.of());
                report.append(day).append(' ').append(meal.cn())
                        .append("（").append(String.join("、", diners)).append("）: ");
                List<String> names = new java.util.ArrayList<>();
                for (String id : sel.keySet()) {
                    String name = data.recipes().stream()
                            .filter(r -> r.id().equals(id)).findFirst()
                            .map(Model.Recipe::name).orElse(id);
                    names.add(name);
                }
                report.append(String.join(" + ", names)).append('\n');
                for (var pe : result.portions().entrySet()) {
                    if (pe.getKey().slot().equals(s)) {
                        String pid = pe.getKey().personId();
                        String rid = pe.getKey().recipeId();
                        String pname = data.persons().stream()
                                .filter(p -> p.id().equals(pid)).findFirst()
                                .map(Model.Person::name).orElse(pid);
                        String rname = data.recipes().stream()
                                .filter(r -> r.id().equals(rid)).findFirst()
                                .map(Model.Recipe::name).orElse(rid);
                        report.append(String.format("    %s × %s = %.2f 份%n", pname, rname,
                                pe.getValue()));
                    }
                }
            }
        }
        report.append('\n');

        // 营养报告（每人每天 5 项）
        report.append("=== 营养报告（按在家餐次折算后）===\n");
        String current = null;
        for (var row : audit.nutrientRows()) {
            if (!row.personId().equals(current)) {
                current = row.personId();
                report.append("-- ").append(current).append(" --\n");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("  ").append(row.day()).append(' ').append(row.nutrient().cn()).append(": ");
            sb.append(String.format("%.1f", row.intake()));
            if (row.under() > 1e-6) {
                sb.append("（偏低 ").append(String.format("%.1f", row.under())).append('）');
            } else if (row.over() > 1e-6) {
                sb.append("（偏高 ").append(String.format("%.1f", row.over())).append('）');
            } else {
                sb.append("（达标）");
            }
            if (!row.target().hasMax()) {
                sb.append("  目标≥").append(String.format("%.1f", row.target().min()));
            } else {
                sb.append("  目标").append(String.format("%.0f–%.0f",
                        row.target().min(), row.target().max()));
            }
            report.append(sb).append('\n');
        }

        flush(report, out, quiet);
        System.exit(audit.clean() ? 0 : 2);
    }

    /** PYTHON_PARITY 口径（设计文档 P4：主食固定 1 份、按全天目标比较） */
    private static PlanRules parityRules() {
        PlanRules d = PlanRules.defaults();
        return new PlanRules(d.structure(), d.maxRepeatsPerWeek(), d.repeatExemptCategories(),
                d.noConsecutiveDays(), d.noIdenticalSlots(), d.weekdayQuickOnly(),
                d.quickExemptTags(), d.fishSlots(), d.wholeFishMinDiners(),
                d.weekendLunchFishAndShrimp(), d.respectExclusions(), d.weights(),
                1.0, 1.0, null);
    }

    private static SeedData loadWithPersonsOverride(Path seedDir, Path personsFile) throws Exception {
        // 把 persons 副本临时复制进种子目录不可取（只读）；改为：先加载其余三份，
        // 再单独加载 persons 并做时间表引用校验。
        Path tmp = Files.createTempDirectory("fmseed");
        for (String f : List.of("ingredients.json", "recipes.json", "schedule.json")) {
            Files.copy(seedDir.resolve(f), tmp.resolve(f));
        }
        Files.copy(personsFile, tmp.resolve("persons.json"));
        SeedData data = SeedLoader.loadAndValidate(tmp);
        tmp.toFile().deleteOnExit();
        return data;
    }

    private static void flush(StringBuilder report, Path out, boolean quiet) throws Exception {
        if (quiet) {
            // 摘要行：状态 / 目标值 / 违规数
            String[] lines = report.toString().split("\n");
            for (String line : lines) {
                if (line.startsWith("状态:") || line.startsWith("目标值")
                        || line.startsWith("硬约束违规") || line.startsWith("消息:")
                        || line.startsWith("建模耗时") || line.startsWith("求解耗时")) {
                    System.out.println(line);
                }
            }
        } else {
            System.out.print(report);
        }
        if (out != null) {
            Files.writeString(out, report.toString(), StandardCharsets.UTF_8);
            System.out.println("报告已写入: " + out.toAbsolutePath());
        }
    }
}
