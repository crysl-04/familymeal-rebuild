package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jd1 extends co1 {
    public static final wo1 n = wo1.G(8);

    public static double h(ii0 ii0Var, zh0 zh0Var, boolean z, boolean z2, gs1 gs1Var, BigDecimal bigDecimal) {
        double d;
        double dDoubleValue;
        double d2;
        double dDoubleValue2 = bigDecimal.subtract(bigDecimal.setScale(0, RoundingMode.FLOOR)).doubleValue();
        double d3 = 1.0d;
        double d4 = 1.0d - dDoubleValue2;
        double d5 = 0.0d;
        double d6 = 0.0d;
        for (Map.Entry entry : zh0Var.u.entrySet()) {
            int i = ((lo2) entry.getKey()).h;
            double d7 = d3;
            e33 e33VarK = ii0Var.k(i);
            if (z) {
                d = 0.0d;
                dDoubleValue = -((BigDecimal) entry.getValue()).doubleValue();
            } else {
                d = 0.0d;
                dDoubleValue = ((BigDecimal) entry.getValue()).doubleValue();
            }
            double dA = gs1Var.l.A(i);
            double dDoubleValue3 = e33VarK.j.doubleValue();
            double d8 = dA - dDoubleValue3;
            if (e33VarK.v()) {
                double dDoubleValue4 = e33VarK.l.doubleValue();
                if (dDoubleValue4 > dDoubleValue3 && d8 > (dDoubleValue4 - dDoubleValue3) / 2.0d) {
                    dDoubleValue = -dDoubleValue;
                    d8 = dDoubleValue4 - dA;
                }
            }
            double dFloor = dDoubleValue - Math.floor(dDoubleValue);
            boolean z3 = e33VarK.q;
            if (z2) {
                if (z3) {
                    if (dFloor <= dDoubleValue2) {
                        d2 = dFloor / dDoubleValue2;
                    } else {
                        dDoubleValue = d7 - dFloor;
                        d2 = dDoubleValue / d4;
                    }
                } else if (dDoubleValue > d) {
                    d2 = dDoubleValue / dDoubleValue2;
                } else {
                    dDoubleValue = -dDoubleValue;
                    d2 = dDoubleValue / d4;
                }
                d5 = (d8 * d2) + d5;
                d6 = (d2 * d2) + d6;
            } else if (z3) {
                double dFloor2 = Math.floor(dDoubleValue);
                d2 = dFloor <= dDoubleValue2 ? dFloor2 : ((dFloor - dDoubleValue2) / d4) + dFloor2;
                d5 = (d8 * d2) + d5;
                d6 = (d2 * d2) + d6;
            } else if (dDoubleValue < d) {
                d2 = dDoubleValue / d4;
                d5 = (d8 * d2) + d5;
                d6 = (d2 * d2) + d6;
            }
            d3 = d7;
        }
        double dFloor3 = z2 ? d3 - d5 : d5 - Math.floor(bigDecimal.doubleValue());
        if (dFloor3 <= 0.0d || d6 <= 0.0d) {
            return 0.0d;
        }
        return dFloor3 / Math.sqrt(d6);
    }

    public static boolean i(BigDecimal bigDecimal) {
        return bigDecimal != null && bigDecimal.stripTrailingZeros().scale() <= 0;
    }

    public static BigDecimal j(ii0 ii0Var, zh0 zh0Var, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z) {
        BigDecimal bigDecimal3;
        Iterator it = zh0Var.u.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            BigDecimal bigDecimal4 = (BigDecimal) entry.getValue();
            if (n.C(bigDecimal2, bigDecimal4)) {
                e33 e33VarK = ii0Var.k(((lo2) entry.getKey()).h);
                if (z) {
                    bigDecimal3 = bigDecimal4.signum() > 0 ? e33VarK.l : e33VarK.j;
                } else {
                    bigDecimal3 = bigDecimal4.signum() > 0 ? e33VarK.j : e33VarK.l;
                }
                if (bigDecimal3 == null) {
                    return null;
                }
                bigDecimal = bigDecimal.subtract(bigDecimal4.multiply(bigDecimal3));
                it.remove();
            }
        }
        return bigDecimal;
    }

    public static boolean k(e33 e33Var, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (!e33Var.v()) {
            return false;
        }
        BigDecimal bigDecimalSubtract = e33Var.l.subtract(bigDecimal2);
        return bigDecimalSubtract.signum() > 0 && bigDecimal.subtract(bigDecimal2).compareTo(bigDecimalSubtract.divide(om.c, lg1.b)) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x010f A[PHI: r18 r19 r20
  0x010f: PHI (r18v6 ii0) = (r18v5 ii0), (r18v7 ii0), (r18v7 ii0) binds: [B:46:0x0109, B:55:0x0158, B:57:0x0164] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r19v6 java.util.ArrayList) = (r19v5 java.util.ArrayList), (r19v7 java.util.ArrayList), (r19v7 java.util.ArrayList) binds: [B:46:0x0109, B:55:0x0158, B:57:0x0164] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r20v6 int) = (r20v5 int), (r20v7 int), (r20v7 int) binds: [B:46:0x0109, B:55:0x0158, B:57:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.co1
    public final int d(bj bjVar) {
        ii0 ii0Var;
        ArrayList arrayList;
        int i;
        byte b;
        int i2;
        HashMap map;
        BigDecimal bigDecimalDivide;
        jd1 jd1Var = this;
        bj bjVar2 = bjVar;
        b(bjVar);
        ii0 ii0Var2 = (ii0) bjVar2.c;
        ArrayList arrayList2 = new ArrayList(ii0Var2.e());
        int size = arrayList2.size();
        byte b2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            zh0 zh0Var = (zh0) obj;
            if (!jd1Var.e()) {
                break;
            }
            boolean zU = zh0Var.U();
            HashMap map2 = zh0Var.u;
            if (!zU) {
                if (zh0Var.U() || map2.size() <= 0 || !map2.keySet().stream().anyMatch(new xh0(zh0Var, b2)) || zh0Var.q()) {
                    ii0Var = ii0Var2;
                    arrayList = arrayList2;
                    i = size;
                    b = b2;
                    i2 = i3;
                } else {
                    if ((!zh0Var.v() || i(zh0Var.l)) && (!zh0Var.s() || i(zh0Var.j))) {
                        Iterator it = map2.entrySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (i((BigDecimal) entry.getValue())) {
                                    e33 e33VarK = ii0Var2.k(((lo2) entry.getKey()).h);
                                    if ((!e33VarK.s() || i(e33VarK.j)) && (!e33VarK.v() || i(e33VarK.l))) {
                                        b2 = b2;
                                        i3 = i3;
                                        ii0Var2 = ii0Var2;
                                        arrayList2 = arrayList2;
                                        size = size;
                                    }
                                }
                            } else {
                                ii0Var = ii0Var2;
                                arrayList = arrayList2;
                                i = size;
                                b = b2;
                                i2 = i3;
                            }
                        }
                    }
                    if (zh0Var.p()) {
                        ii0 ii0Var3 = (ii0) bjVar2.c;
                        gs1 gs1Var = (gs1) bjVar2.d;
                        BigDecimal bigDecimal = zh0Var.l;
                        if (bigDecimal != null) {
                            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((cz0) bjVar2.b).c);
                            Iterator it2 = map2.entrySet().iterator();
                            BigDecimal bigDecimalSubtract = bigDecimal;
                            while (true) {
                                if (it2.hasNext()) {
                                    Map.Entry entry2 = (Map.Entry) it2.next();
                                    int i4 = ((lo2) entry2.getKey()).h;
                                    e33 e33VarK2 = ii0Var3.k(i4);
                                    BigDecimal bigDecimal2 = (BigDecimal) entry2.getValue();
                                    if (e33VarK2.s()) {
                                        ii0 ii0Var4 = ii0Var2;
                                        BigDecimal bigDecimal3 = e33VarK2.j;
                                        ArrayList arrayList3 = arrayList2;
                                        int i5 = size;
                                        bigDecimalSubtract = k(e33VarK2, gs1Var.G((long) i4), bigDecimal3) ? bigDecimalSubtract.subtract(bigDecimal2.multiply(e33VarK2.l)) : bigDecimalSubtract.subtract(bigDecimal2.multiply(bigDecimal3));
                                        ii0Var2 = ii0Var4;
                                        arrayList2 = arrayList3;
                                        size = i5;
                                    } else {
                                        ii0Var = ii0Var2;
                                        arrayList = arrayList2;
                                        i = size;
                                        i2 = i3;
                                    }
                                } else {
                                    ii0Var = ii0Var2;
                                    arrayList = arrayList2;
                                    i = size;
                                    BigDecimal bigDecimalSubtract2 = bigDecimalSubtract.subtract(bigDecimalSubtract.setScale(0, RoundingMode.FLOOR));
                                    if (bigDecimalSubtract2.compareTo(bigDecimalValueOf) >= 0) {
                                        BigDecimal bigDecimalAdd = om.b;
                                        if (bigDecimalSubtract2.compareTo(bigDecimalAdd.subtract(bigDecimalValueOf)) <= 0) {
                                            BigDecimal bigDecimalSubtract3 = bigDecimalAdd.subtract(bigDecimalSubtract2);
                                            i2 = i3;
                                            if (h(ii0Var3, zh0Var, false, true, gs1Var, bigDecimalSubtract) <= jd1Var.e) {
                                                jd1Var.b++;
                                                jd1Var.h++;
                                            } else {
                                                zh0 zh0VarF = f(bjVar);
                                                String str = zh0VarF.k;
                                                HashMap map3 = zh0VarF.u;
                                                BigDecimal bigDecimal4 = bigDecimalAdd;
                                                for (Map.Entry entry3 : map2.entrySet()) {
                                                    int i6 = ((lo2) entry3.getKey()).h;
                                                    e33 e33VarK3 = ii0Var3.k(i6);
                                                    BigDecimal bigDecimalNegate = (BigDecimal) entry3.getValue();
                                                    BigDecimal bigDecimalG = gs1Var.G(i6);
                                                    BigDecimal bigDecimal5 = e33VarK3.j;
                                                    boolean zK = k(e33VarK3, bigDecimalG, bigDecimal5);
                                                    if (zK) {
                                                        bigDecimalNegate = bigDecimalNegate.negate();
                                                    }
                                                    if (e33VarK3.q) {
                                                        map = map3;
                                                        BigDecimal bigDecimalSubtract4 = bigDecimalNegate.subtract(bigDecimalNegate.setScale(0, RoundingMode.FLOOR));
                                                        bigDecimalDivide = bigDecimalSubtract4.compareTo(bigDecimalSubtract2) <= 0 ? bigDecimalSubtract4.divide(bigDecimalSubtract2, lg1.b) : om.b.subtract(bigDecimalSubtract4).divide(bigDecimalSubtract3, lg1.b);
                                                    } else {
                                                        map = map3;
                                                        bigDecimalDivide = bigDecimalNegate.signum() > 0 ? bigDecimalNegate.divide(bigDecimalSubtract2, lg1.b) : bigDecimalNegate.signum() < 0 ? bigDecimalNegate.negate().divide(bigDecimalSubtract3, lg1.b) : om.a;
                                                    }
                                                    if (zK) {
                                                        BigDecimal bigDecimalNegate2 = bigDecimalDivide.negate();
                                                        bigDecimalAdd = bigDecimalAdd.subtract(bigDecimalDivide.multiply(e33VarK3.l));
                                                        bigDecimalDivide = bigDecimalNegate2;
                                                    } else {
                                                        bigDecimalAdd = bigDecimalAdd.add(bigDecimalDivide.multiply(bigDecimal5));
                                                    }
                                                    zh0VarF.E(i6, bigDecimalDivide);
                                                    BigDecimal bigDecimalAbs = bigDecimalDivide.abs();
                                                    if (bigDecimalAbs.compareTo(bigDecimal4) > 0) {
                                                        bigDecimal4 = bigDecimalAbs;
                                                    }
                                                    map3 = map;
                                                }
                                                HashMap map4 = map3;
                                                if (map4.entrySet().isEmpty()) {
                                                    ii0Var3.E(str);
                                                    jd1Var = this;
                                                    bjVar2 = bjVar;
                                                } else {
                                                    BigDecimal bigDecimalJ = j(ii0Var3, zh0VarF, bigDecimalAdd, bigDecimal4, true);
                                                    if (bigDecimalJ == null || map4.entrySet().isEmpty()) {
                                                        jd1Var = this;
                                                        bjVar2 = bjVar;
                                                        ii0Var3.E(str);
                                                    } else {
                                                        zh0VarF.x(bigDecimalJ);
                                                        jd1Var = this;
                                                        bjVar2 = bjVar;
                                                        jd1Var.a(bjVar2, zh0VarF);
                                                    }
                                                }
                                            }
                                        } else {
                                            i2 = i3;
                                        }
                                    } else {
                                        i2 = i3;
                                    }
                                }
                            }
                        } else {
                            ii0Var = ii0Var2;
                            arrayList = arrayList2;
                            i = size;
                            i2 = i3;
                        }
                    } else {
                        ii0Var = ii0Var2;
                        arrayList = arrayList2;
                        i = size;
                        i2 = i3;
                        if (zh0Var.v()) {
                            jd1Var.l(bjVar2, zh0Var, true);
                        }
                        if (jd1Var.e() && zh0Var.s()) {
                            b = 0;
                            jd1Var.l(bjVar2, zh0Var, false);
                        }
                    }
                    b = 0;
                }
                b2 = b;
                i3 = i2;
                ii0Var2 = ii0Var;
                arrayList2 = arrayList;
                size = i;
            }
        }
        return c(bjVar);
    }

    @Override // defpackage.co1
    public final dz0 g() {
        return dz0.n;
    }

    public final void l(bj bjVar, zh0 zh0Var, boolean z) {
        gs1 gs1Var;
        Iterator it;
        BigDecimal bigDecimal;
        BigDecimal bigDecimalDivide;
        HashMap map = zh0Var.u;
        ii0 ii0Var = (ii0) bjVar.c;
        gs1 gs1Var2 = (gs1) bjVar.d;
        BigDecimal bigDecimal2 = z ? zh0Var.l : zh0Var.j;
        if (bigDecimal2 != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((cz0) bjVar.b).c);
            BigDecimal bigDecimalSubtract = bigDecimal2;
            boolean z2 = !z;
            if (!z) {
                bigDecimalSubtract = bigDecimalSubtract.negate();
            }
            for (Map.Entry entry : map.entrySet()) {
                int i = ((lo2) entry.getKey()).h;
                e33 e33VarK = ii0Var.k(i);
                BigDecimal bigDecimalNegate = (BigDecimal) entry.getValue();
                if (!z) {
                    bigDecimalNegate = bigDecimalNegate.negate();
                }
                BigDecimal bigDecimalG = gs1Var2.G(i);
                if (!e33VarK.s()) {
                    return;
                }
                BigDecimal bigDecimal3 = e33VarK.j;
                bigDecimalSubtract = k(e33VarK, bigDecimalG, bigDecimal3) ? bigDecimalSubtract.subtract(bigDecimalNegate.multiply(e33VarK.l)) : bigDecimalSubtract.subtract(bigDecimalNegate.multiply(bigDecimal3));
            }
            RoundingMode roundingMode = RoundingMode.FLOOR;
            BigDecimal bigDecimalSubtract2 = bigDecimalSubtract.subtract(bigDecimalSubtract.setScale(0, roundingMode));
            if (bigDecimalSubtract2.compareTo(bigDecimalValueOf) >= 0) {
                BigDecimal bigDecimal4 = om.b;
                if (bigDecimalSubtract2.compareTo(bigDecimal4.subtract(bigDecimalValueOf)) <= 0) {
                    BigDecimal bigDecimalSubtract3 = bigDecimal4.subtract(bigDecimalSubtract2);
                    BigDecimal scale = bigDecimalSubtract.setScale(0, roundingMode);
                    if (h(ii0Var, zh0Var, z2, false, gs1Var2, bigDecimalSubtract) <= this.e) {
                        this.b++;
                        this.h++;
                        return;
                    }
                    zh0 zh0VarF = f(bjVar);
                    String str = zh0VarF.k;
                    HashMap map2 = zh0VarF.u;
                    BigDecimal bigDecimal5 = om.a;
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int i2 = ((lo2) entry2.getKey()).h;
                        e33 e33VarK2 = ii0Var.k(i2);
                        BigDecimal bigDecimalNegate2 = (BigDecimal) entry2.getValue();
                        if (!z) {
                            bigDecimalNegate2 = bigDecimalNegate2.negate();
                        }
                        BigDecimal bigDecimal6 = bigDecimalSubtract2;
                        BigDecimal bigDecimalG2 = gs1Var2.G(i2);
                        BigDecimal bigDecimal7 = e33VarK2.j;
                        boolean zK = k(e33VarK2, bigDecimalG2, bigDecimal7);
                        if (zK) {
                            bigDecimalNegate2 = bigDecimalNegate2.negate();
                        }
                        HashMap map3 = map2;
                        if (e33VarK2.q) {
                            RoundingMode roundingMode2 = RoundingMode.FLOOR;
                            gs1Var = gs1Var2;
                            it = it2;
                            BigDecimal bigDecimalSubtract4 = bigDecimalNegate2.subtract(bigDecimalNegate2.setScale(0, roundingMode2));
                            bigDecimal = bigDecimal6;
                            bigDecimalDivide = bigDecimalSubtract4.compareTo(bigDecimal) <= 0 ? bigDecimalNegate2.setScale(0, roundingMode2) : bigDecimalNegate2.setScale(0, roundingMode2).add(bigDecimalSubtract4.subtract(bigDecimal).divide(bigDecimalSubtract3, lg1.b));
                        } else {
                            gs1Var = gs1Var2;
                            it = it2;
                            bigDecimal = bigDecimal6;
                            if (bigDecimalNegate2.signum() < 0) {
                                bigDecimalDivide = bigDecimalNegate2.divide(bigDecimalSubtract3, lg1.b);
                            }
                            map2 = map3;
                            bigDecimalSubtract2 = bigDecimal;
                            gs1Var2 = gs1Var;
                            it2 = it;
                        }
                        if (zK) {
                            BigDecimal bigDecimalNegate3 = bigDecimalDivide.negate();
                            scale = scale.subtract(bigDecimalDivide.multiply(e33VarK2.l));
                            bigDecimalDivide = bigDecimalNegate3;
                        } else {
                            scale = scale.add(bigDecimalDivide.multiply(bigDecimal7));
                        }
                        zh0VarF.E(i2, bigDecimalDivide);
                        BigDecimal bigDecimalAbs = bigDecimalDivide.abs();
                        if (bigDecimalAbs.compareTo(bigDecimal5) > 0) {
                            bigDecimal5 = bigDecimalAbs;
                        }
                        map2 = map3;
                        bigDecimalSubtract2 = bigDecimal;
                        gs1Var2 = gs1Var;
                        it2 = it;
                    }
                    HashMap map4 = map2;
                    if (map4.entrySet().isEmpty()) {
                        ii0Var.E(str);
                        return;
                    }
                    BigDecimal bigDecimalJ = j(ii0Var, zh0VarF, scale, bigDecimal5, false);
                    if (bigDecimalJ == null || map4.entrySet().isEmpty()) {
                        ii0Var.E(str);
                    } else {
                        zh0VarF.B(bigDecimalJ);
                        a(bjVar, zh0VarF);
                    }
                }
            }
        }
    }
}
