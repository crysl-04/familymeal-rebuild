package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class rs2 {
    public static final Map a;
    public static final Map b;
    public static final Map c;

    static {
        Double dValueOf = Double.valueOf(1.2d);
        i3 i3Var = i3.SEDENTARY;
        wt1 wt1Var = new wt1(i3Var, dValueOf);
        Double dValueOf2 = Double.valueOf(1.375d);
        i3 i3Var2 = i3.LIGHT;
        wt1 wt1Var2 = new wt1(i3Var2, dValueOf2);
        Double dValueOf3 = Double.valueOf(1.55d);
        i3 i3Var3 = i3.MODERATE;
        wt1 wt1Var3 = new wt1(i3Var3, dValueOf3);
        Double dValueOf4 = Double.valueOf(1.725d);
        i3 i3Var4 = i3.ACTIVE;
        a = ee1.L(wt1Var, wt1Var2, wt1Var3, new wt1(i3Var4, dValueOf4));
        Double dValueOf5 = Double.valueOf(1.0d);
        b = ee1.L(new wt1(i3Var, dValueOf5), new wt1(i3Var2, Double.valueOf(1.13d)), new wt1(i3Var3, Double.valueOf(1.26d)), new wt1(i3Var4, Double.valueOf(1.42d)));
        c = ee1.L(new wt1(i3Var, dValueOf5), new wt1(i3Var2, Double.valueOf(1.16d)), new wt1(i3Var3, Double.valueOf(1.31d)), new wt1(i3Var4, Double.valueOf(1.56d)));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0350  */
    /* JADX WARN: Code duplicated, block: B:109:0x0362  */
    public static ps2 a(dy1 dy1Var, int i) {
        as0 as0Var;
        double d;
        double d2;
        double d3;
        double d4;
        uu uuVar;
        double dDoubleValue;
        dy1Var.getClass();
        i3 i3Var = dy1Var.g;
        ir0 ir0Var = dy1Var.c;
        as0 as0Var2 = dy1Var.h;
        e40 e40Var = dy1Var.l;
        Integer num = dy1Var.d;
        Integer numValueOf = num != null ? Integer.valueOf(i - num.intValue()) : null;
        qs2 qs2Var = qs2.j;
        as0 as0Var3 = as0.l;
        if (numValueOf == null && e40Var == null) {
            return new ps2(null, qs2Var, as0Var3, null, lt.P("请补全出生年份、身高和体重"), 56);
        }
        Integer numValueOf2 = num != null ? Integer.valueOf(i - num.intValue()) : null;
        boolean z = numValueOf2 == null || numValueOf2.intValue() < 18;
        as0 as0Var4 = as0.j;
        Integer num2 = numValueOf;
        if (z) {
            as0Var = as0Var3;
        } else {
            as0Var = as0Var2 == as0Var3 ? as0Var4 : as0Var2;
        }
        if (e40Var != null) {
            return new ps2(e40Var, qs2.h, as0Var, null, lt.P("使用手动设置的营养目标"), 56);
        }
        Double d5 = dy1Var.f;
        Double d6 = dy1Var.e;
        if (d5 == null || d6 == null || num2 == null) {
            return new ps2(null, qs2Var, as0Var, null, lt.P("请补全身高和体重"), 56);
        }
        if (num2.intValue() < 9) {
            return new ps2(null, qs2Var, as0Var, null, lt.P("9 岁以下暂不支持自动计算，请手动设置营养目标"), 56);
        }
        ArrayList arrayList = new ArrayList();
        if (z && as0Var2 != as0Var3) {
            arrayList.add("未满 18 岁，目标固定为「成长」，不设热量缺口");
        }
        qs2 qs2Var2 = qs2.i;
        ir0 ir0Var2 = ir0.i;
        as0 as0Var5 = as0Var;
        if (z) {
            double dDoubleValue2 = d5.doubleValue();
            double dDoubleValue3 = d6.doubleValue();
            int iIntValue = num2.intValue();
            ir0Var.getClass();
            i3Var.getClass();
            double d7 = dDoubleValue3 / 100.0d;
            if (ir0Var == ir0Var2) {
                dDoubleValue = (((903.0d * d7) + (dDoubleValue2 * 26.7d)) * ((Number) ee1.J(i3Var, b)).doubleValue()) + (113.5d - (((double) iIntValue) * 61.9d));
            } else {
                dDoubleValue = (((934.0d * d7) + (dDoubleValue2 * 10.0d)) * ((Number) ee1.J(i3Var, c)).doubleValue()) + (160.3d - (((double) iIntValue) * 30.8d));
            }
            e40 e40VarB = b(new ap1(ie1.w(dDoubleValue - 100.0d), ie1.w(dDoubleValue + 100.0d)), 1.0d, d5.doubleValue(), new uu(0.5d, 0.65d), num2.intValue() < 14 ? 20.0d : 25.0d);
            return new ps2(new e40(e40VarB.a, new ap1(Math.max(e40VarB.b.a, 60.0d)), e40VarB.c, e40VarB.d, e40VarB.e), qs2Var2, as0Var3, Double.valueOf(dDoubleValue), arrayList, 40);
        }
        double dDoubleValue4 = d5.doubleValue();
        double dDoubleValue5 = d6.doubleValue();
        int iIntValue2 = num2.intValue();
        ir0Var.getClass();
        double d8 = (((dDoubleValue5 * 6.25d) + (10.0d * dDoubleValue4)) - ((double) (iIntValue2 * 5))) + ((double) (ir0Var != ir0Var2 ? -161 : 5));
        double dL = cy1.l(dy1Var.m, -300.0d, 300.0d);
        double dDoubleValue6 = (((Number) ee1.J(i3Var, a)).doubleValue() * d8) + dL;
        double d9 = 0.0d;
        if (dL != 0.0d) {
            String str = dL > 0.0d ? "+" : "";
            arrayList.add("已按体重记录校准每日消耗 " + str + ie1.w(dL) + " kcal");
        }
        double dMax = Math.max(ir0Var == ir0.j ? 1200.0d : 1500.0d, d8);
        int iOrdinal = as0Var5.ordinal();
        if (iOrdinal == 0) {
            d = 1.0d;
            Double d10 = dy1Var.i;
            if (d10 == null || d10.doubleValue() < d5.doubleValue()) {
                double d11 = (dy1Var.j.i * 7700.0d) / 7.0d;
                Iterator it = lt.Q(Double.valueOf(500.0d), Double.valueOf(0.2d * dDoubleValue6), Double.valueOf(((d5.doubleValue() * 0.005d) * 7700.0d) / 7.0d)).iterator();
                if (!it.hasNext()) {
                    wg.p();
                    return null;
                }
                double dDoubleValue7 = ((Number) it.next()).doubleValue();
                while (it.hasNext()) {
                    dDoubleValue7 = Math.min(dDoubleValue7, ((Number) it.next()).doubleValue());
                    d8 = d8;
                }
                d2 = d8;
                double dMin = Math.min(d11, dDoubleValue7);
                if (dMin < d11 - 1.0d) {
                    arrayList.add("减重速度已按安全上限下调为每天少吃约 " + ie1.w(dMin) + " kcal");
                }
                double dMin2 = Math.min(dMin, dDoubleValue6 - dMax);
                if (dMin2 < 0.0d) {
                    dMin2 = 0.0d;
                }
                if (dMin2 < dMin - 1.0d) {
                    arrayList.add("已到每日最低摄入（" + ie1.w(dMax) + " kcal），热量缺口受限");
                }
                if (dMin2 > 0.0d) {
                    as0Var4 = as0Var5;
                }
                d9 = dMin2;
            } else {
                arrayList.add("目标体重不低于当前体重，按「维持」计算");
                d2 = d8;
            }
        } else if (iOrdinal != 2) {
            as0Var4 = as0Var5;
            d2 = d8;
            d = 1.0d;
        } else {
            d = 1.0d;
            as0Var4 = as0Var5;
            d9 = -Math.min(250.0d, 0.1d * dDoubleValue6);
            d2 = d8;
        }
        double d12 = dDoubleValue6 - d9;
        ap1 ap1Var = new ap1(ie1.w(Math.max(d12 - 100.0d, dMax)), ie1.w(Math.max(d12 + 100.0d, dMax + 200.0d)));
        int iOrdinal2 = as0Var4.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != 2) {
                d4 = d;
            } else {
                d3 = 1.6d;
            }
            if (as0Var4 == as0.i) {
                uuVar = new uu(0.45d, 0.6d);
            } else {
                uuVar = new uu(0.5d, 0.65d);
            }
            return new ps2(b(ap1Var, d4, d5.doubleValue(), uuVar, 25.0d), qs2Var2, as0Var4, Double.valueOf(d2), Double.valueOf(dDoubleValue6), d9, arrayList);
        }
        d3 = 1.2d;
        d4 = d3;
        if (as0Var4 == as0.i) {
            uuVar = new uu(0.45d, 0.6d);
        } else {
            uuVar = new uu(0.5d, 0.65d);
        }
        return new ps2(b(ap1Var, d4, d5.doubleValue(), uuVar, 25.0d), qs2Var2, as0Var4, Double.valueOf(d2), Double.valueOf(dDoubleValue6), d9, arrayList);
    }

    public static e40 b(ap1 ap1Var, double d, double d2, uu uuVar, double d3) {
        double d4 = (ap1Var.a + ap1Var.b) / 2.0d;
        return new e40(ap1Var, new ap1(ie1.w(d2 * d)), new ap1(ie1.w((0.2d * d4) / 9.0d), ie1.w((0.3d * d4) / 9.0d)), new ap1(ie1.w((Double.valueOf(uuVar.h).doubleValue() * d4) / 4.0d), ie1.w((Double.valueOf(uuVar.i).doubleValue() * d4) / 4.0d)), new ap1(d3));
    }
}
