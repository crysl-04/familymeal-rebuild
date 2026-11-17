package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class f22 extends gi0 {
    public final /* synthetic */ byte j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f22(int i, byte b) {
        super(i);
        this.j = b;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0190 A[PHI: r16
  0x0190: PHI (r16v3 java.math.BigDecimal) = (r16v1 java.math.BigDecimal), (r16v6 java.math.BigDecimal) binds: [B:99:0x0189, B:94:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x01d7 A[PHI: r19
  0x01d7: PHI (r19v3 java.math.BigDecimal) = (r19v1 java.math.BigDecimal), (r19v11 java.math.BigDecimal) binds: [B:116:0x01d0, B:111:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:320:0x049f  */
    /* JADX WARN: Code duplicated, block: B:364:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x0108  */
    /* JADX WARN: Code duplicated, block: B:72:0x0112  */
    /* JADX WARN: Code duplicated, block: B:77:0x012b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130  */
    public final boolean b(zh0 zh0Var, HashSet hashSet, BigDecimal bigDecimal, BigDecimal bigDecimal2, wo1 wo1Var) {
        boolean z;
        BigDecimal bigDecimalDivide;
        BigDecimal bigDecimalDivide2;
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalMultiply2;
        BigDecimal bigDecimalMultiply3;
        BigDecimal bigDecimalMultiply4;
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimalSubtract2;
        BigDecimal bigDecimalC;
        boolean z2;
        Iterator it;
        int iSignum;
        Iterator it2;
        e33 e33VarL;
        BigDecimal bigDecimal3;
        int iSignum2;
        switch (this.j) {
            case 0:
                zh0Var.J(hashSet, bigDecimal, bigDecimal2);
                return false;
            case 1:
                if (hashSet.isEmpty()) {
                    zh0Var.y = true;
                    return false;
                }
                if (zh0Var.U() || !zh0Var.T()) {
                    return false;
                }
                BigDecimal bigDecimalAdd = om.a;
                Iterator it3 = hashSet.iterator();
                BigDecimal bigDecimalAdd2 = bigDecimalAdd;
                while (it3.hasNext()) {
                    lo2 lo2Var = (lo2) it3.next();
                    e33 e33VarL2 = zh0Var.v.l(lo2Var);
                    BigDecimal bigDecimalO = zh0Var.O(lo2Var, false);
                    if (bigDecimalO.signum() < 0) {
                        if (bigDecimalAdd2 != null) {
                            bigDecimalAdd2 = e33VarL2.s() ? bigDecimalAdd2.add(bigDecimalO.multiply(e33VarL2.j)) : null;
                        }
                        if (bigDecimalAdd != null) {
                            bigDecimalAdd = e33VarL2.v() ? bigDecimalAdd.add(bigDecimalO.multiply(e33VarL2.l)) : null;
                        }
                    } else if (bigDecimalO.signum() > 0) {
                        if (bigDecimalAdd2 != null) {
                            bigDecimalAdd2 = e33VarL2.v() ? bigDecimalAdd2.add(bigDecimalO.multiply(e33VarL2.l)) : null;
                        }
                        if (bigDecimalAdd != null) {
                            if (e33VarL2.s()) {
                                bigDecimalAdd = bigDecimalAdd.add(bigDecimalO.multiply(e33VarL2.j));
                            }
                        }
                    }
                }
                if (bigDecimal2 == null) {
                    z = true;
                } else {
                    if (bigDecimalAdd != null && wo1Var.A(bigDecimal2, bigDecimalAdd)) {
                        zh0Var.X();
                    } else if (bigDecimalAdd2 != null && !wo1Var.A(bigDecimal2, bigDecimalAdd2)) {
                        z = true;
                    }
                    z = false;
                }
                if (bigDecimal != null) {
                    if (bigDecimalAdd2 != null && wo1Var.z(bigDecimal, bigDecimalAdd2)) {
                        zh0Var.X();
                        return false;
                    }
                    if (bigDecimalAdd == null || wo1Var.z(bigDecimal, bigDecimalAdd)) {
                        return false;
                    }
                }
                if (!z) {
                    return false;
                }
                zh0Var.y = true;
                return false;
            default:
                HashMap map = zh0Var.u;
                ii0 ii0Var = zh0Var.v;
                int size = hashSet.size();
                if (size == 0) {
                    zh0Var.y = true;
                    if (bigDecimal != null && wo1Var.A(om.a, bigDecimal)) {
                        zh0Var.X();
                    }
                    if (bigDecimal2 != null && wo1Var.z(om.a, bigDecimal2)) {
                        zh0Var.X();
                    }
                } else if (size == 1) {
                    MathContext mathContext = h22.i;
                    MathContext mathContext2 = h22.g;
                    zh0Var.y = true;
                    lo2 lo2Var2 = (lo2) hashSet.iterator().next();
                    e33 e33VarL3 = ii0Var.l(lo2Var2);
                    BigDecimal bigDecimalO2 = zh0Var.O(lo2Var2, false);
                    boolean z3 = bigDecimalO2.signum() == -1;
                    BigDecimal bigDecimalA = e33VarL3.j;
                    BigDecimal bigDecimalC2 = e33VarL3.l;
                    if (!zh0Var.p()) {
                        if (z3) {
                            bigDecimalDivide2 = bigDecimal2 != null ? bigDecimal2.divide(bigDecimalO2, mathContext2) : null;
                            bigDecimalDivide = bigDecimal != null ? bigDecimal.divide(bigDecimalO2, mathContext) : null;
                        } else {
                            BigDecimal bigDecimalDivide3 = bigDecimal != null ? bigDecimal.divide(bigDecimalO2, mathContext2) : null;
                            bigDecimalDivide = bigDecimal2 != null ? bigDecimal2.divide(bigDecimalO2, mathContext) : null;
                            bigDecimalDivide2 = bigDecimalDivide3;
                        }
                        if (bigDecimalA == null) {
                            bigDecimalA = bigDecimalDivide2;
                        } else if (bigDecimalDivide2 != null) {
                            bigDecimalA = bigDecimalA.max(bigDecimalDivide2);
                        }
                        if (bigDecimalC2 == null) {
                            bigDecimalC2 = bigDecimalDivide;
                        } else if (bigDecimalDivide != null) {
                            bigDecimalC2 = bigDecimalC2.min(bigDecimalDivide);
                        }
                        if (bigDecimalA != null && e33VarL3.q) {
                            bigDecimalA = h22.a(bigDecimalA, om.b, wo1Var);
                        }
                        if (bigDecimalC2 != null && e33VarL3.q) {
                            bigDecimalC2 = h22.c(bigDecimalC2, om.b, wo1Var);
                        }
                        if (!h22.b(zh0Var, e33VarL3, bigDecimalA, bigDecimalC2, wo1Var)) {
                            if (bigDecimalA == null || bigDecimalC2 == null || bigDecimalA.compareTo(bigDecimalC2) <= 0) {
                                e33VarL3.I(bigDecimalA);
                                e33VarL3.L(bigDecimalC2);
                            } else {
                                zh0Var.X();
                            }
                        }
                        return true;
                    }
                    om.U.getClass();
                    BigDecimal bigDecimalDivide4 = bigDecimal2.divide(bigDecimalO2, lg1.b);
                    if (!e33VarL3.M(bigDecimalDivide4, wo1Var, null, false)) {
                        zh0Var.X();
                        return false;
                    }
                    if (e33VarL3.q) {
                        bigDecimalDivide4 = bigDecimalDivide4.setScale(0, RoundingMode.HALF_EVEN);
                    }
                    if (!e33VarL3.p()) {
                        e33VarL3.J(bigDecimalDivide4);
                        return true;
                    }
                    if (wo1Var.s(bigDecimalDivide4, e33VarL3.E()) == null) {
                        zh0Var.X();
                    }
                } else {
                    if (size != 2) {
                        if (bigDecimal == null || zh0Var.U()) {
                            z2 = false;
                            if (bigDecimal2 != null && !zh0Var.U()) {
                                it = hashSet.iterator();
                                while (it.hasNext()) {
                                    lo2 lo2Var3 = (lo2) it.next();
                                    e33 e33VarL4 = ii0Var.l(lo2Var3);
                                    iSignum2 = ((BigDecimal) map.get(lo2Var3)).signum();
                                    if (iSignum2 > 0 || !e33VarL4.s() || e33VarL4.j.signum() < 0) {
                                        if (iSignum2 < 0 || !e33VarL4.v() || e33VarL4.l.signum() > 0) {
                                        }
                                    }
                                }
                                iSignum = bigDecimal2.signum();
                                if (iSignum < 0) {
                                    zh0Var.X();
                                } else {
                                    it2 = hashSet.iterator();
                                    while (it2.hasNext()) {
                                        e33VarL = ii0Var.l((lo2) it2.next());
                                        if (iSignum == 0) {
                                            bigDecimal3 = om.a;
                                            if (e33VarL.M(bigDecimal3, wo1Var, null, false)) {
                                                e33VarL.J(bigDecimal3);
                                            } else {
                                                zh0Var.X();
                                            }
                                        } else if (!e33VarL.F() && zh0Var.O(e33VarL.p, false).compareTo(bigDecimal2) > 0) {
                                            e33VarL.J(om.a);
                                        }
                                        z2 = true;
                                    }
                                }
                            }
                            return z2;
                        }
                        Iterator it4 = hashSet.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                lo2 lo2Var4 = (lo2) it4.next();
                                e33 e33VarL5 = ii0Var.l(lo2Var4);
                                int iSignum3 = ((BigDecimal) map.get(lo2Var4)).signum();
                                if (iSignum3 >= 0 || !e33VarL5.s() || e33VarL5.j.signum() < 0) {
                                    if (iSignum3 <= 0 || !e33VarL5.v() || e33VarL5.l.signum() > 0) {
                                        z2 = false;
                                    }
                                }
                            } else {
                                int iSignum4 = bigDecimal.signum();
                                if (iSignum4 > 0) {
                                    zh0Var.X();
                                } else {
                                    Iterator it5 = hashSet.iterator();
                                    z2 = false;
                                    while (it5.hasNext()) {
                                        e33 e33VarL6 = ii0Var.l((lo2) it5.next());
                                        if (iSignum4 == 0) {
                                            BigDecimal bigDecimal4 = om.a;
                                            if (e33VarL6.M(bigDecimal4, wo1Var, null, false)) {
                                                e33VarL6.J(bigDecimal4);
                                            } else {
                                                zh0Var.X();
                                            }
                                        } else if (e33VarL6.F() && zh0Var.O(e33VarL6.p, false).compareTo(bigDecimal) < 0) {
                                            e33VarL6.J(om.a);
                                        }
                                        z2 = true;
                                    }
                                }
                            }
                        }
                        if (bigDecimal2 != null) {
                            it = hashSet.iterator();
                            while (it.hasNext()) {
                                lo2 lo2Var5 = (lo2) it.next();
                                e33 e33VarL7 = ii0Var.l(lo2Var5);
                                iSignum2 = ((BigDecimal) map.get(lo2Var5)).signum();
                                if (iSignum2 > 0) {
                                }
                                if (iSignum2 < 0) {
                                }
                            }
                            iSignum = bigDecimal2.signum();
                            if (iSignum < 0) {
                                zh0Var.X();
                            } else {
                                it2 = hashSet.iterator();
                                while (it2.hasNext()) {
                                    e33VarL = ii0Var.l((lo2) it2.next());
                                    if (iSignum == 0) {
                                        bigDecimal3 = om.a;
                                        if (e33VarL.M(bigDecimal3, wo1Var, null, false)) {
                                            zh0Var.X();
                                        } else {
                                            e33VarL.J(bigDecimal3);
                                        }
                                    } else if (!e33VarL.F()) {
                                    }
                                    z2 = true;
                                }
                            }
                        }
                        return z2;
                        return false;
                    }
                    MathContext mathContext3 = h22.g;
                    MathContext mathContext4 = h22.i;
                    Iterator it6 = hashSet.iterator();
                    e33 e33VarL8 = ii0Var.l((lo2) it6.next());
                    BigDecimal bigDecimalP = zh0Var.P(e33VarL8);
                    boolean z4 = bigDecimalP.signum() == -1;
                    BigDecimal bigDecimalA2 = e33VarL8.j;
                    BigDecimal bigDecimal5 = e33VarL8.l;
                    if (z4) {
                        bigDecimalMultiply = bigDecimal5 != null ? bigDecimalP.multiply(bigDecimal5) : null;
                        if (bigDecimalA2 != null) {
                            bigDecimalMultiply2 = bigDecimalP.multiply(bigDecimalA2);
                        } else {
                            bigDecimalMultiply2 = null;
                        }
                    } else {
                        bigDecimalMultiply = bigDecimalA2 != null ? bigDecimalP.multiply(bigDecimalA2) : null;
                        if (bigDecimal5 != null) {
                            bigDecimalMultiply2 = bigDecimalP.multiply(bigDecimal5);
                        } else {
                            bigDecimalMultiply2 = null;
                        }
                    }
                    BigDecimal bigDecimal6 = bigDecimalMultiply;
                    BigDecimal bigDecimalMin = bigDecimalMultiply2;
                    e33 e33VarL9 = ii0Var.l((lo2) it6.next());
                    BigDecimal bigDecimalP2 = zh0Var.P(e33VarL9);
                    boolean z5 = bigDecimalP2.signum() == -1;
                    BigDecimal bigDecimal7 = e33VarL9.j;
                    boolean z6 = z5;
                    BigDecimal bigDecimal8 = e33VarL9.l;
                    if (z6) {
                        bigDecimalMultiply3 = bigDecimal8 != null ? bigDecimalP2.multiply(bigDecimal8) : null;
                        if (bigDecimal7 != null) {
                            bigDecimalMultiply4 = bigDecimalP2.multiply(bigDecimal7);
                        } else {
                            bigDecimalMultiply4 = null;
                        }
                    } else {
                        bigDecimalMultiply3 = bigDecimal7 != null ? bigDecimalP2.multiply(bigDecimal7) : null;
                        if (bigDecimal8 != null) {
                            bigDecimalMultiply4 = bigDecimalP2.multiply(bigDecimal8);
                        } else {
                            bigDecimalMultiply4 = null;
                        }
                    }
                    BigDecimal bigDecimalDivide5 = bigDecimal8;
                    BigDecimal bigDecimal9 = bigDecimalMultiply3;
                    BigDecimal bigDecimalDivide6 = bigDecimal7;
                    BigDecimal bigDecimalMin2 = bigDecimalMultiply4;
                    if (bigDecimal != null && bigDecimalMin != null && bigDecimalMin2 != null) {
                        if (wo1Var.z(bigDecimal, bigDecimalMin.add(bigDecimalMin2))) {
                            zh0Var.X();
                        }
                    }
                    if (bigDecimal2 == null || bigDecimal6 == null || bigDecimal9 == null || !wo1Var.A(bigDecimal2, bigDecimal6.add(bigDecimal9))) {
                        if (bigDecimal != null) {
                            if (bigDecimalMin2 != null) {
                                bigDecimalSubtract2 = bigDecimal.subtract(bigDecimalMin2);
                                if (bigDecimal6 != null) {
                                    bigDecimalSubtract2 = bigDecimal6.max(bigDecimalSubtract2);
                                }
                            } else {
                                bigDecimalSubtract2 = bigDecimal6;
                            }
                            if (bigDecimalMin != null) {
                                bigDecimalSubtract = bigDecimal.subtract(bigDecimalMin);
                                if (bigDecimal9 != null) {
                                    bigDecimalSubtract = bigDecimal9.max(bigDecimalSubtract);
                                }
                            } else {
                                bigDecimalSubtract = bigDecimal9;
                            }
                        } else {
                            bigDecimalSubtract = bigDecimal9;
                            bigDecimalSubtract2 = bigDecimal6;
                        }
                        if (bigDecimal2 != null) {
                            if (bigDecimal9 != null) {
                                BigDecimal bigDecimalSubtract3 = bigDecimal2.subtract(bigDecimal9);
                                bigDecimalMin = bigDecimalMin != null ? bigDecimalMin.min(bigDecimalSubtract3) : bigDecimalSubtract3;
                            }
                            if (bigDecimal6 != null) {
                                BigDecimal bigDecimalSubtract4 = bigDecimal2.subtract(bigDecimal6);
                                bigDecimalMin2 = bigDecimalMin2 != null ? bigDecimalMin2.min(bigDecimalSubtract4) : bigDecimalSubtract4;
                            }
                        }
                        if (bigDecimalSubtract2 == null) {
                            bigDecimalC = bigDecimal5;
                        } else if (z4) {
                            bigDecimalC = bigDecimalSubtract2.divide(bigDecimalP, mathContext4);
                        } else {
                            bigDecimalA2 = bigDecimalSubtract2.divide(bigDecimalP, mathContext3);
                            bigDecimalC = bigDecimal5;
                        }
                        if (bigDecimalMin != null) {
                            if (z4 != 0) {
                                bigDecimalA2 = bigDecimalMin.divide(bigDecimalP, mathContext3);
                            } else {
                                bigDecimalC = bigDecimalMin.divide(bigDecimalP, mathContext4);
                            }
                        }
                        if (bigDecimalSubtract != null) {
                            if (z6) {
                                bigDecimalDivide5 = bigDecimalSubtract.divide(bigDecimalP2, mathContext4);
                            } else {
                                bigDecimalDivide6 = bigDecimalSubtract.divide(bigDecimalP2, mathContext3);
                            }
                        }
                        if (bigDecimalMin2 != null) {
                            if (z6) {
                                bigDecimalDivide6 = bigDecimalMin2.divide(bigDecimalP2, mathContext3);
                            } else {
                                bigDecimalDivide5 = bigDecimalMin2.divide(bigDecimalP2, mathContext4);
                            }
                        }
                        BigDecimal bigDecimalA3 = bigDecimalDivide6;
                        BigDecimal bigDecimalC3 = bigDecimalDivide5;
                        if (e33VarL8.q) {
                            if (bigDecimalA2 != null) {
                                bigDecimalA2 = h22.a(bigDecimalA2, om.b, wo1Var);
                            }
                            if (bigDecimalC != null) {
                                bigDecimalC = h22.c(bigDecimalC, om.b, wo1Var);
                            }
                        }
                        if (e33VarL9.q) {
                            if (bigDecimalA3 != null) {
                                bigDecimalA3 = h22.a(bigDecimalA3, om.b, wo1Var);
                            }
                            if (bigDecimalC3 != null) {
                                bigDecimalC3 = h22.c(bigDecimalC3, om.b, wo1Var);
                            }
                        }
                        if (!h22.b(zh0Var, e33VarL8, bigDecimalA2, bigDecimalC, wo1Var)) {
                            if (bigDecimalA2 == null || bigDecimalC == null || bigDecimalA2.compareTo(bigDecimalC) <= 0) {
                                e33VarL8.I(bigDecimalA2);
                                e33VarL8.L(bigDecimalC);
                            } else {
                                zh0Var.X();
                            }
                        }
                        if (!h22.b(zh0Var, e33VarL9, bigDecimalA3, bigDecimalC3, wo1Var)) {
                            if (bigDecimalA3 == null || bigDecimalC3 == null || bigDecimalA3.compareTo(bigDecimalC3) <= 0) {
                                e33VarL9.I(bigDecimalA3);
                                e33VarL9.L(bigDecimalC3);
                            } else {
                                zh0Var.X();
                            }
                        }
                        if (e33VarL8.p() || e33VarL9.p()) {
                            return true;
                        }
                    } else {
                        zh0Var.X();
                    }
                }
                return false;
        }
    }
}
