package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class co1 {
    public static final wo1 j;
    public static final MathContext k;
    public static final MathContext l;
    public static final AtomicInteger m;
    public final ArrayList a = new ArrayList();
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public double e = h32.a;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;

    static {
        wo1 wo1VarG = wo1.G(12);
        j = wo1VarG;
        k = wo1VarG.L(RoundingMode.FLOOR).k;
        l = wo1VarG.L(RoundingMode.CEILING).k;
        m = new AtomicInteger();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(bj bjVar, zh0 zh0Var) {
        int i;
        hh0 hh0Var;
        boolean z;
        byte b;
        Iterator it;
        double d;
        HashMap map = (HashMap) bjVar.a;
        final byte b2 = 1;
        this.b++;
        ii0 ii0Var = (ii0) bjVar.c;
        gs1 gs1Var = (gs1) bjVar.d;
        double d2 = h32.a;
        HashMap map2 = zh0Var.u;
        String str = zh0Var.k;
        double d3 = d2;
        double dMin = Double.POSITIVE_INFINITY;
        int i2 = 0;
        final byte b3 = 0;
        double d4 = d3;
        for (Iterator it2 = map2.entrySet().iterator(); it2.hasNext(); it2 = it2) {
            Map.Entry entry = (Map.Entry) it2.next();
            double dDoubleValue = ((BigDecimal) entry.getValue()).doubleValue();
            if (dDoubleValue != h32.a) {
                double d5 = d2;
                double dAbs = Math.abs(dDoubleValue);
                double dA = (gs1Var.l.A(((lo2) entry.getKey()).h) * dDoubleValue) + d4;
                double dMax = Math.max(d3, dAbs);
                d = dA;
                i2++;
                dMin = Math.min(dMin, dAbs);
                d3 = dMax;
                d2 = (dDoubleValue * dDoubleValue) + d5;
            } else {
                d = d4;
            }
            d4 = d;
        }
        double d6 = d4;
        double d7 = dMin;
        double dSqrt = Math.sqrt(d2);
        BigDecimal bigDecimal = zh0Var.j;
        double dMax2 = Double.NEGATIVE_INFINITY;
        if (bigDecimal != null) {
            dMax2 = Math.max(Double.NEGATIVE_INFINITY, bigDecimal.doubleValue() - d6);
        }
        BigDecimal bigDecimal2 = zh0Var.l;
        if (bigDecimal2 != null) {
            dMax2 = Math.max(dMax2, d6 - bigDecimal2.doubleValue());
        }
        double d8 = h32.a;
        if (dMax2 > d8 && dSqrt > d8) {
            d8 = dMax2 / dSqrt;
        }
        if (d8 <= this.e) {
            this.h++;
            ii0Var.E(str);
            return false;
        }
        if (i2 > this.d) {
            this.f++;
            ii0Var.E(str);
            return false;
        }
        if (((cz0) bjVar.b).a.B(d3, d7)) {
            this.g++;
            ii0Var.E(str);
            return false;
        }
        final wo1 wo1Var = j;
        map2.replaceAll(new BiFunction() { // from class: yh0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                byte b4 = b3;
                wo1 wo1Var2 = wo1Var;
                switch (b4) {
                    case 0:
                        return wo1Var2.v((BigDecimal) obj2);
                    default:
                        if (obj == null) {
                            return wo1Var2.v((BigDecimal) obj2);
                        }
                        li1.c();
                        return null;
                }
            }
        });
        Map map3 = zh0Var.x;
        if (map3 != null) {
            map3.replaceAll(new BiFunction() { // from class: yh0
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    byte b4 = b2;
                    wo1 wo1Var2 = wo1Var;
                    switch (b4) {
                        case 0:
                            return wo1Var2.v((BigDecimal) obj2);
                        default:
                            if (obj == null) {
                                return wo1Var2.v((BigDecimal) obj2);
                            }
                            li1.c();
                            return null;
                    }
                }
            });
        }
        if (zh0Var.s()) {
            zh0Var.x(wo1Var.L(RoundingMode.FLOOR).v(zh0Var.j));
        }
        if (zh0Var.v()) {
            zh0Var.B(wo1Var.L(RoundingMode.CEILING).v(zh0Var.l));
        }
        if (zh0Var.o()) {
            zh0Var.J(map2.keySet(), zh0Var.j, zh0Var.l);
        }
        ao1 ao1Var = new ao1(zh0Var);
        zh0 zh0Var2 = (zh0) map.get(ao1Var);
        ArrayList arrayList = this.a;
        int iCompareTo = -1;
        if (zh0Var2 == null) {
            Collection collectionValues = ii0Var.c.values();
            if (!zh0Var.o() || zh0Var.y || zh0Var.U()) {
                i = iCompareTo;
                hh0Var = null;
                break;
            }
            Set setKeySet = map2.keySet();
            Iterator it3 = collectionValues.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    i = iCompareTo;
                    hh0Var = null;
                    break;
                }
                zh0 zh0Var3 = (zh0) it3.next();
                if (zh0Var3.o() && !zh0Var3.y && !zh0Var3.k.equals(str)) {
                    Set setKeySet2 = zh0Var3.u.keySet();
                    if (setKeySet2.equals(setKeySet)) {
                        Iterator it4 = setKeySet2.iterator();
                        BigDecimal bigDecimal3 = null;
                        while (true) {
                            if (!it4.hasNext()) {
                                it = it3;
                                i = iCompareTo;
                                break;
                            }
                            i = iCompareTo;
                            lo2 lo2Var = (lo2) it4.next();
                            it = it3;
                            BigDecimal bigDecimalO = zh0Var3.O(lo2Var, false);
                            BigDecimal bigDecimalO2 = zh0Var.O(lo2Var, false);
                            if (bigDecimalO2.signum() == 0 || bigDecimalO.signum() == 0) {
                                if (bigDecimalO2.signum() != 0 || bigDecimalO.signum() != 0) {
                                    bigDecimal3 = null;
                                    break;
                                }
                                iCompareTo = i;
                                it3 = it;
                            } else {
                                BigDecimal bigDecimalDivide = bigDecimalO.divide(bigDecimalO2, h22.h);
                                if (bigDecimal3 != null) {
                                    if (bigDecimalDivide.compareTo(bigDecimal3) != 0) {
                                        bigDecimal3 = null;
                                        break;
                                    }
                                } else {
                                    bigDecimal3 = bigDecimalDivide;
                                }
                                iCompareTo = i;
                                it3 = it;
                            }
                        }
                        if (bigDecimal3 != null) {
                            hh0Var = new hh0(zh0Var3, bigDecimal3);
                            break;
                        }
                        iCompareTo = i;
                        it3 = it;
                    } else {
                        continue;
                    }
                }
            }
            if (hh0Var != null) {
                zh0 zh0Var4 = (zh0) hh0Var.h;
                BigDecimal bigDecimal4 = (BigDecimal) hh0Var.i;
                boolean z2 = bigDecimal4.signum() > 0;
                BigDecimal bigDecimal5 = z2 ? zh0Var4.j : zh0Var4.l;
                BigDecimal bigDecimalDivide2 = bigDecimal5 == null ? null : bigDecimal5.divide(bigDecimal4, k);
                BigDecimal bigDecimal6 = z2 ? zh0Var4.l : zh0Var4.j;
                BigDecimal bigDecimalDivide3 = bigDecimal6 == null ? null : bigDecimal6.divide(bigDecimal4, l);
                ao1 ao1Var2 = new ao1(zh0Var4);
                Object obj = map.get(ao1Var2);
                BigDecimal bigDecimal7 = zh0Var.j;
                if (obj == zh0Var4) {
                    if (bigDecimal7 == null && bigDecimalDivide2 != null) {
                        zh0Var.x(bigDecimalDivide2);
                    }
                    if (zh0Var.l == null && bigDecimalDivide3 != null) {
                        zh0Var.B(bigDecimalDivide3);
                    }
                    BigDecimal bigDecimal8 = zh0Var.j;
                    BigDecimal bigDecimal9 = zh0Var.l;
                    int iCompareTo2 = bigDecimal8 == null ? bigDecimalDivide2 == null ? 0 : i : bigDecimalDivide2 == null ? 1 : bigDecimal8.compareTo(bigDecimalDivide2);
                    int iCompareTo3 = bigDecimal9 == null ? bigDecimalDivide3 == null ? 0 : i : bigDecimalDivide3 == null ? 1 : bigDecimal9.compareTo(bigDecimalDivide3) * (-1);
                    if (iCompareTo2 < 0 || iCompareTo3 < 0 || (iCompareTo2 <= 0 && iCompareTo3 <= 0)) {
                        this.i++;
                        ii0Var.E(str);
                        return false;
                    }
                    ii0Var.E(zh0Var4.k);
                    map.remove(ao1Var2);
                    b = 1;
                    arrayList.removeIf(new xh0(ao1Var2, b));
                } else {
                    BigDecimal bigDecimal10 = zh0Var.l;
                    int iCompareTo4 = bigDecimal7 == null ? bigDecimalDivide2 == null ? 0 : i : bigDecimalDivide2 == null ? 1 : bigDecimal7.compareTo(bigDecimalDivide2);
                    int iCompareTo5 = bigDecimal10 == null ? bigDecimalDivide3 == null ? 0 : i : bigDecimalDivide3 == null ? 1 : bigDecimal10.compareTo(bigDecimalDivide3) * (-1);
                    if (iCompareTo4 < 0 || iCompareTo5 < 0 || (iCompareTo4 <= 0 && iCompareTo5 <= 0)) {
                        this.i++;
                        ii0Var.E(str);
                        return false;
                    }
                }
            }
            z = 1;
            map.put(ao1Var, zh0Var);
            arrayList.add(new bo1(str, ao1Var, d8));
            return z;
        }
        BigDecimal bigDecimal11 = zh0Var2.j;
        BigDecimal bigDecimal12 = zh0Var2.l;
        if (zh0Var.j == null && bigDecimal11 != null) {
            zh0Var.x(bigDecimal11);
        }
        if (zh0Var.l == null && bigDecimal12 != null) {
            zh0Var.B(bigDecimal12);
        }
        BigDecimal bigDecimal13 = zh0Var.j;
        BigDecimal bigDecimal14 = zh0Var.l;
        int iCompareTo6 = bigDecimal13 == null ? bigDecimal11 == null ? 0 : -1 : bigDecimal11 == null ? 1 : bigDecimal13.compareTo(bigDecimal11);
        if (bigDecimal14 != null) {
            iCompareTo = bigDecimal12 == null ? 1 : (-1) * bigDecimal14.compareTo(bigDecimal12);
        } else if (bigDecimal12 == null) {
            iCompareTo = 0;
        }
        if (iCompareTo6 < 0 || iCompareTo < 0 || (iCompareTo6 <= 0 && iCompareTo <= 0)) {
            this.i++;
            ii0Var.E(str);
            return false;
        }
        ii0Var.E(zh0Var2.k);
        map.remove(ao1Var);
        b = 1;
        arrayList.removeIf(new xh0(ao1Var, b));
        z = b;
        map.put(ao1Var, zh0Var);
        arrayList.add(new bo1(str, ao1Var, d8));
        return z;
    }

    public final void b(bj bjVar) {
        int size = ((ii0) bjVar.c).o.size();
        cz0 cz0Var = (cz0) bjVar.b;
        this.c = Math.max((int) cz0Var.i, Math.min(size / cz0Var.h, (int) cz0Var.g));
        this.d = Math.max((int) cz0Var.l, Math.min(size / cz0Var.k, (int) cz0Var.j));
        this.e = cz0Var.b.w();
        this.a.clear();
        this.b = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public final int c(bj bjVar) {
        ArrayList arrayList = this.a;
        if (arrayList.size() > this.c) {
            arrayList.sort(Comparator.comparingDouble(new sn1((byte) 6)));
            int size = arrayList.size() - this.c;
            for (int i = 0; i < size; i++) {
                bo1 bo1Var = (bo1) arrayList.get(i);
                ((ii0) bjVar.c).E(bo1Var.b);
                ((HashMap) bjVar.a).remove(bo1Var.c);
            }
            arrayList.subList(0, size).clear();
        }
        return arrayList.size();
    }

    public abstract int d(bj bjVar);

    public final boolean e() {
        return this.a.size() < this.c;
    }

    public final zh0 f(bj bjVar) {
        return ((ii0) bjVar.c).A("CUT_" + g().h + "_" + m.incrementAndGet());
    }

    public dz0 g() {
        return dz0.i;
    }
}
