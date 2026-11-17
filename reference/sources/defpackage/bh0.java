package defpackage;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class bh0 {
    public static final b82 a = new b82("^[a-z0-9_]{1,64}$");
    public static final SecureRandom b = new SecureRandom();

    public static bp1 a(List list, Map map) {
        map.getClass();
        Iterator it = list.iterator();
        bp1 bp1VarB = bp1.f;
        while (it.hasNext()) {
            z62 z62Var = (z62) it.next();
            uv0 uv0Var = (uv0) map.get(z62Var.a);
            if (uv0Var != null) {
                bp1VarB = bp1VarB.b(uv0Var.d.c(z62Var.b / 100.0d));
            }
        }
        return bp1VarB;
    }

    public static boolean b(double d, double d2, double d3) {
        return Math.abs(d) <= Double.MAX_VALUE && d >= d2 && d <= d3;
    }

    public static na1 c(uv0 uv0Var) {
        uv0Var.getClass();
        na1 na1VarQ = lt.q();
        if (!a.b(uv0Var.a)) {
            wi0.u("id", "编号格式无效", na1VarQ);
        }
        if (!d(40, uv0Var.b)) {
            wi0.u("name", "名称需为 1–40 个字符，且不能有首尾空格", na1VarQ);
        }
        if (!d(20, uv0Var.c)) {
            wi0.u("category", "类别需为 1–20 个字符", na1VarQ);
        }
        bp1 bp1Var = uv0Var.d;
        double d = bp1Var.a;
        double d2 = bp1Var.e;
        double d3 = bp1Var.d;
        double d4 = bp1Var.c;
        double d5 = bp1Var.b;
        if (!b(d, 0.0d, 900.0d)) {
            wi0.u("kcal", "每 100g 热量需在 0–900 kcal", na1VarQ);
        }
        for (wt1 wt1Var : lt.Q(new wt1("protein", Double.valueOf(d5)), new wt1("fat", Double.valueOf(d4)), new wt1("carb", Double.valueOf(d3)), new wt1("fiber", Double.valueOf(d2)))) {
            String str = (String) wt1Var.h;
            if (!b(((Number) wt1Var.i).doubleValue(), 0.0d, 100.0d)) {
                wi0.u(str, "每 100g 含量需在 0–100 g", na1VarQ);
            }
        }
        if (d5 + d4 + d3 + d2 > 100.000001d) {
            wi0.u("total", "蛋白、脂肪、碳水、纤维之和不能超过 100 g", na1VarQ);
        }
        return lt.e(na1VarQ);
    }

    public static boolean d(int i, String str) {
        str.getClass();
        if (!co2.X(str) && str.length() <= i && str.equals(co2.g0(str).toString())) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (!Character.isISOControl(str.charAt(i2))) {
                }
            }
            return true;
        }
        return false;
    }

    public static String e(String str) {
        qy0 qy0Var = new qy0(1, 10, 1);
        ArrayList arrayList = new ArrayList(ev.o0(qy0Var, 10));
        Iterator it = qy0Var.iterator();
        while (((py0) it).j) {
            ((jy0) it).nextInt();
            arrayList.add(Character.valueOf("abcdefghijklmnopqrstuvwxyz0123456789".charAt(b.nextInt(36))));
        }
        return wi0.h(str, "_", dv.E0(arrayList, "", null, null, null, 62));
    }

    public static na1 f(dy1 dy1Var, int i) {
        int iIntValue;
        int i2;
        dy1Var.getClass();
        Set set = dy1Var.k;
        as0 as0Var = dy1Var.h;
        Integer num = dy1Var.d;
        na1 na1VarQ = lt.q();
        if (!a.b(dy1Var.a)) {
            wi0.u("id", "编号格式无效", na1VarQ);
        }
        if (!d(40, dy1Var.b)) {
            wi0.u("name", "称呼需为 1–40 个字符，且不能有首尾空格", na1VarQ);
        }
        if (num != null && ((i2 = i - 110) > (iIntValue = num.intValue()) || iIntValue > i)) {
            na1VarQ.add(new m32("birthYear", wi0.f(i2, i, "出生年份需在 ", "–")));
        }
        Double d = dy1Var.e;
        if (d != null && !b(d.doubleValue(), 50.0d, 250.0d)) {
            wi0.u("height", "身高需在 50–250 cm", na1VarQ);
        }
        Double d2 = dy1Var.f;
        if (d2 != null && !b(d2.doubleValue(), 10.0d, 300.0d)) {
            wi0.u("weight", "体重需在 10–300 kg", na1VarQ);
        }
        Double d3 = dy1Var.i;
        if (d3 != null && !b(d3.doubleValue(), 10.0d, 300.0d)) {
            wi0.u("targetWeight", "目标体重需在 10–300 kg", na1VarQ);
        }
        if (num != null) {
            boolean z = i - num.intValue() < 18;
            as0 as0Var2 = as0.l;
            if (z && as0Var != as0Var2) {
                wi0.u("goal", "未满 18 岁只能选择「成长」", na1VarQ);
            }
            if (!z && as0Var == as0Var2) {
                wi0.u("goal", "成年人请选择减脂、维持或增肌", na1VarQ);
            }
        }
        if (set.size() > 20) {
            wi0.u("excluded", "忌口类别最多 20 个", na1VarQ);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!d(20, (String) it.next())) {
                wi0.u("excluded", "忌口类别需为 1–20 个字符", na1VarQ);
            }
        }
        if (!b(dy1Var.m, -300.0d, 300.0d)) {
            wi0.u("manual", "校准值超出范围", na1VarQ);
        }
        e40 e40Var = dy1Var.l;
        if (e40Var != null) {
            List<wt1> listQ = lt.Q(new wt1(e40Var.a, new uu(500.0d, 6000.0d)), new wt1(e40Var.b, new uu(0.0d, 1000.0d)), new wt1(e40Var.c, new uu(0.0d, 1000.0d)), new wt1(e40Var.d, new uu(0.0d, 1000.0d)), new wt1(e40Var.e, new uu(0.0d, 1000.0d)));
            if (!listQ.isEmpty()) {
                for (wt1 wt1Var : listQ) {
                    ap1 ap1Var = (ap1) wt1Var.h;
                    wu wuVar = (wu) wt1Var.i;
                    if (!b(ap1Var.a, ((Number) wuVar.a()).doubleValue(), ((Number) wuVar.b()).doubleValue()) || (ap1Var.a() && !b(ap1Var.b, ap1Var.a, ((Number) wuVar.b()).doubleValue()))) {
                        wi0.u("manual", "手动目标数值超出范围，或上限小于下限（热量 500–6000 kcal，其余 0–1000 g）", na1VarQ);
                        break;
                    }
                }
            }
        }
        return lt.e(na1VarQ);
    }

    public static na1 g(j62 j62Var, Set set) {
        Set set2 = j62Var.i;
        List<z62> list = j62Var.g;
        na1 na1VarQ = lt.q();
        if (!a.b(j62Var.a)) {
            wi0.u("id", "编号格式无效", na1VarQ);
        }
        if (!d(40, j62Var.b)) {
            wi0.u("name", "名称需为 1–40 个字符，且不能有首尾空格", na1VarQ);
        }
        if (j62Var.c.isEmpty()) {
            wi0.u("meals", "至少选择一个餐次", na1VarQ);
        }
        int i = j62Var.e;
        if (1 > i || i >= 21) {
            wi0.u("servings", "基准份数需在 1–20", na1VarQ);
        }
        int i2 = j62Var.f;
        if (1 > i2 || i2 >= 21) {
            wi0.u("minDiners", "最少用餐人数需在 1–20", na1VarQ);
        }
        int size = list.size();
        if (1 > size || size >= 41) {
            wi0.u("ingredients", "食材需为 1–40 种", na1VarQ);
        }
        ArrayList arrayList = new ArrayList(ev.o0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((z62) it.next()).a);
        }
        if (dv.U0(arrayList).size() != list.size()) {
            wi0.u("ingredients", "同一种食材只能添加一次", na1VarQ);
        }
        for (z62 z62Var : list) {
            if (!set.contains(z62Var.a)) {
                na1VarQ.add(new m32("ingredients", wi0.h("引用了不存在的食材 '", co2.f0(64, z62Var.a), "'")));
            }
            if (!b(z62Var.b, 0.1d, 5000.0d)) {
                wi0.u("ingredients", "食材用量需在 0.1–5000 g", na1VarQ);
            }
        }
        if (set2.size() > 20) {
            wi0.u("tags", "标签最多 20 个", na1VarQ);
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            if (!d(20, (String) it2.next())) {
                wi0.u("tags", "标签需为 1–20 个字符", na1VarQ);
            }
        }
        bp1 bp1Var = j62Var.h;
        if (!b(bp1Var.a, 0.0d, 10000.0d)) {
            wi0.u("total", "整道菜热量需在 0–10000 kcal", na1VarQ);
        }
        Iterator it3 = lt.Q(Double.valueOf(bp1Var.b), Double.valueOf(bp1Var.c), Double.valueOf(bp1Var.d), Double.valueOf(bp1Var.e)).iterator();
        while (it3.hasNext()) {
            if (!b(((Number) it3.next()).doubleValue(), 0.0d, 2000.0d)) {
                wi0.u("total", "整道菜营养素需在 0–2000 g", na1VarQ);
            }
        }
        return lt.e(na1VarQ);
    }

    public static na1 h(LocalDate localDate, double d, LocalDate localDate2) {
        localDate2.getClass();
        na1 na1VarQ = lt.q();
        if (!b(d, 10.0d, 300.0d)) {
            wi0.u("weight", "体重需在 10–300 kg", na1VarQ);
        }
        if (localDate.isAfter(localDate2)) {
            wi0.u("date", "日期不能晚于今天", na1VarQ);
        }
        if (localDate.isBefore(localDate2.minusYears(5L))) {
            wi0.u("date", "日期不能早于 5 年前", na1VarQ);
        }
        return lt.e(na1VarQ);
    }
}
