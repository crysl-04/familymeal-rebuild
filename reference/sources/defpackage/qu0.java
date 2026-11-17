package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qu0 extends co1 {
    public static final wo1 n;
    public static final wo1 o;
    public static final wo1 p;

    static {
        RoundingMode roundingMode = RoundingMode.CEILING;
        wo1 wo1Var = co1.j;
        n = wo1Var.L(roundingMode);
        o = wo1Var.L(RoundingMode.FLOOR);
        p = wo1.G(4);
    }

    @Override // defpackage.co1
    public final int d(bj bjVar) {
        b(bjVar);
        ii0 ii0Var = (ii0) bjVar.c;
        ArrayList arrayList = new ArrayList(ii0Var.e());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zh0 zh0Var = (zh0) obj;
            if (!e()) {
                break;
            }
            if (!zh0Var.t() && zh0Var.o() && !zh0Var.U()) {
                boolean z = false;
                boolean z2 = false;
                for (Map.Entry entry : zh0Var.u.entrySet()) {
                    if (((BigDecimal) entry.getValue()).signum() != 0) {
                        e33 e33VarK = ii0Var.k(((lo2) entry.getKey()).h);
                        if (e33VarK.F()) {
                            z = true;
                        } else if (!e33VarK.p()) {
                            z2 = true;
                        }
                        if (z && z2) {
                            if (zh0Var.v()) {
                                i(bjVar, zh0Var, true);
                            }
                            if (!e() || !zh0Var.s()) {
                                break;
                            }
                            i(bjVar, zh0Var, false);
                            break;
                        }
                    }
                }
            }
        }
        return c(bjVar);
    }

    @Override // defpackage.co1
    public final dz0 g() {
        return dz0.l;
    }

    public final boolean h(bj bjVar, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z) {
        BigDecimal bigDecimal3 = BigDecimal.ONE;
        gs1 gs1Var = (gs1) bjVar.d;
        double dA = (gs1Var.l.A(i2) * bigDecimal.doubleValue()) + (gs1Var.l.A(i) * bigDecimal3.doubleValue());
        if ((z ? dA - bigDecimal2.doubleValue() : bigDecimal2.doubleValue() - dA) <= 0.0d) {
            return false;
        }
        zh0 zh0VarF = f(bjVar);
        zh0VarF.E(i, bigDecimal3);
        zh0VarF.E(i2, bigDecimal);
        if (z) {
            zh0VarF.B(bigDecimal2);
        } else {
            zh0VarF.x(bigDecimal2);
        }
        return a(bjVar, zh0VarF);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01f5  */
    public final void i(bj bjVar, zh0 zh0Var, boolean z) {
        int i;
        BigDecimal bigDecimal;
        int i2;
        ii0 ii0Var = (ii0) bjVar.c;
        gs1 gs1Var = (gs1) bjVar.d;
        double d = ((cz0) bjVar.b).c;
        BigDecimal bigDecimalNegate = z ? zh0Var.l : zh0Var.j;
        if (bigDecimalNegate != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            BigDecimal bigDecimalAdd = BigDecimal.ZERO;
            for (Map.Entry entry : zh0Var.u.entrySet()) {
                int i3 = ((lo2) entry.getKey()).h;
                BigDecimal bigDecimalNegate2 = (BigDecimal) entry.getValue();
                if (!z) {
                    bigDecimalNegate2 = bigDecimalNegate2.negate();
                }
                if (bigDecimalNegate2.signum() != 0) {
                    e33 e33VarK = ii0Var.k(i3);
                    BigDecimal bigDecimal2 = bigDecimalNegate2.signum() > 0 ? e33VarK.j : e33VarK.l;
                    if (bigDecimal2 == null) {
                        return;
                    }
                    bigDecimalAdd = bigDecimalAdd.add(bigDecimalNegate2.multiply(bigDecimal2));
                    arrayList.add(Integer.valueOf(i3));
                    arrayList2.add(bigDecimalNegate2);
                }
            }
            int size = arrayList.size();
            if (size >= 2) {
                if (!z) {
                    bigDecimalNegate = bigDecimalNegate.negate();
                }
                BigDecimal bigDecimalSubtract = bigDecimalNegate.subtract(bigDecimalAdd);
                if (bigDecimalSubtract.signum() >= 0) {
                    int i4 = 0;
                    while (i4 < size && e()) {
                        int iIntValue = ((Integer) arrayList.get(i4)).intValue();
                        if (ii0Var.k(iIntValue).F()) {
                            double dA = gs1Var.l.A(iIntValue);
                            if (dA >= d && dA <= 1.0d - d) {
                                BigDecimal bigDecimal3 = (BigDecimal) arrayList2.get(i4);
                                boolean z2 = bigDecimal3.signum() > 0;
                                BigDecimal bigDecimalSubtract2 = bigDecimalSubtract.subtract(bigDecimal3.abs());
                                if (bigDecimalSubtract2.signum() >= 0) {
                                    int i5 = 0;
                                    while (i5 < size && e()) {
                                        if (i5 != i4) {
                                            int iIntValue2 = ((Integer) arrayList.get(i5)).intValue();
                                            e33 e33VarK2 = ii0Var.k(iIntValue2);
                                            if (e33VarK2.F() || e33VarK2.p()) {
                                                i = i4;
                                            } else {
                                                BigDecimal bigDecimal4 = (BigDecimal) arrayList2.get(i5);
                                                BigDecimal bigDecimal5 = e33VarK2.j;
                                                int i6 = i4;
                                                BigDecimal bigDecimal6 = e33VarK2.l;
                                                if (bigDecimal5 == null || bigDecimal6 == null) {
                                                    i = i6;
                                                } else {
                                                    int iSignum = bigDecimal4.signum();
                                                    wo1 wo1Var = p;
                                                    if (iSignum > 0) {
                                                        int i7 = iIntValue;
                                                        BigDecimal bigDecimalAdd2 = bigDecimal5.add(bigDecimalSubtract2.divide(bigDecimal4, n.k));
                                                        if (e33VarK2.q) {
                                                            bigDecimalAdd2 = bigDecimalAdd2.setScale(0, RoundingMode.FLOOR);
                                                        }
                                                        BigDecimal bigDecimal7 = bigDecimalAdd2;
                                                        int i8 = i5;
                                                        BigDecimal bigDecimalSubtract3 = bigDecimal6.subtract(bigDecimal7);
                                                        if (bigDecimalSubtract3.signum() <= 0 || wo1Var.C(bigDecimal6.abs().max(BigDecimal.ONE), bigDecimalSubtract3)) {
                                                            i = i6;
                                                            iIntValue = i7;
                                                            i2 = i8;
                                                            bigDecimal = bigDecimalSubtract2;
                                                        } else if (z2) {
                                                            iIntValue = i7;
                                                            i2 = i8;
                                                            bigDecimal = bigDecimalSubtract2;
                                                            i = i6;
                                                            h(bjVar, iIntValue2, iIntValue, bigDecimalSubtract3, bigDecimal6, true);
                                                        } else {
                                                            iIntValue = i7;
                                                            i2 = i8;
                                                            bigDecimal = bigDecimalSubtract2;
                                                            i = i6;
                                                            h(bjVar, iIntValue2, iIntValue, bigDecimalSubtract3.negate(), bigDecimal7, true);
                                                        }
                                                    } else {
                                                        i = i6;
                                                        i2 = i5;
                                                        BigDecimal bigDecimal8 = bigDecimalSubtract2;
                                                        BigDecimal bigDecimalAdd3 = bigDecimal6.add(bigDecimal8.divide(bigDecimal4, o.k));
                                                        if (e33VarK2.q) {
                                                            bigDecimalAdd3 = bigDecimalAdd3.setScale(0, RoundingMode.CEILING);
                                                        }
                                                        BigDecimal bigDecimalSubtract4 = bigDecimalAdd3.subtract(bigDecimal5);
                                                        if (bigDecimalSubtract4.signum() <= 0 || wo1Var.C(bigDecimal5.abs().max(BigDecimal.ONE), bigDecimalSubtract4)) {
                                                            bigDecimal = bigDecimal8;
                                                        } else if (z2) {
                                                            bigDecimal = bigDecimal8;
                                                            h(bjVar, iIntValue2, iIntValue, bigDecimalSubtract4.negate(), bigDecimal5, false);
                                                        } else {
                                                            bigDecimal = bigDecimal8;
                                                            h(bjVar, iIntValue2, iIntValue, bigDecimalSubtract4, bigDecimalAdd3, false);
                                                        }
                                                    }
                                                }
                                            }
                                            bigDecimal = bigDecimalSubtract2;
                                            i2 = i5;
                                        } else {
                                            i = i4;
                                            bigDecimal = bigDecimalSubtract2;
                                            i2 = i5;
                                        }
                                        i5 = i2 + 1;
                                        bigDecimalSubtract2 = bigDecimal;
                                        i4 = i;
                                    }
                                }
                            }
                        }
                        i4++;
                    }
                }
            }
        }
    }
}
