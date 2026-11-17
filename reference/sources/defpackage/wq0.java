package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wq0 extends co1 {
    public static final wo1 q;
    public static final wo1 r;
    public static final wo1 s;
    public boolean[] n = null;
    public ci0 o = null;
    public final HashSet p = new HashSet();

    static {
        RoundingMode roundingMode = RoundingMode.CEILING;
        wo1 wo1Var = co1.j;
        q = wo1Var.L(roundingMode);
        r = wo1Var.L(RoundingMode.FLOOR);
        s = wo1.G(14);
    }

    @Override // defpackage.co1
    public final int d(bj bjVar) {
        boolean[] zArr;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        boolean z;
        wo1 wo1Var;
        wq0 wq0Var = this;
        b(bjVar);
        HashSet hashSet = wq0Var.p;
        hashSet.clear();
        ii0 ii0Var = (ii0) bjVar.c;
        u23 u23Var = (u23) bjVar.e;
        cz0 cz0Var = (cz0) bjVar.b;
        ci0 ci0Var = u23Var != null ? (ci0) u23Var.d().orElse(null) : null;
        if (ci0Var == null) {
            return 0;
        }
        int iD = ci0Var.d();
        int iB = ci0Var.b();
        boolean z2 = true;
        if (wq0Var.o != ci0Var || (zArr = wq0Var.n) == null) {
            int iD2 = ci0Var.d();
            int iB2 = ci0Var.b();
            boolean[] zArr2 = new boolean[iD2 + iB2];
            for (int i = 0; i < iD2; i++) {
                if (ii0Var.k(ci0Var.f(i)).q) {
                    zArr2[i] = true;
                }
            }
            for (int i2 = 0; i2 < iB2; i2++) {
                mg1 mg1Var = (mg1) ci0Var.e(i2).getKey();
                if (mg1Var.q() && (((bigDecimal = mg1Var.j) == null || bigDecimal.stripTrailingZeros().scale() <= 0) && ((bigDecimal2 = mg1Var.l) == null || bigDecimal2.stripTrailingZeros().scale() <= 0))) {
                    zArr2[iD2 + i2] = true;
                }
            }
            wq0Var.n = zArr2;
            wq0Var.o = ci0Var;
            zArr = zArr2;
        }
        Iterator it = u23Var.g(zArr, cz0Var).iterator();
        while (it.hasNext()) {
            mh0 mh0Var = (mh0) it.next();
            int i3 = iD + iB;
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (true) {
                z = z2;
                if (i4 >= i3) {
                    break;
                }
                double dA = mh0Var.i.A(i4);
                if (dA != 0.0d) {
                    arrayList.add(Long.valueOf(i4));
                    arrayList.add(Long.valueOf(Math.round(dA * 1.0E10d)));
                }
                i4++;
                z2 = z;
            }
            double d = mh0Var.k;
            zk zkVar = mh0Var.i;
            arrayList.add(Long.valueOf(Math.round(d * 1.0E10d)));
            if (hashSet.add(arrayList)) {
                zh0 zh0VarF = f(bjVar);
                HashMap map = zh0VarF.u;
                String str = zh0VarF.k;
                zh0VarF.x(BigDecimal.valueOf(mh0Var.k));
                int i5 = 0;
                while (true) {
                    wo1Var = s;
                    if (i5 >= iD) {
                        break;
                    }
                    double dA2 = zkVar.A(i5);
                    HashSet hashSet2 = hashSet;
                    ii0 ii0Var2 = ii0Var;
                    if (!wo1.D(dA2, wo1Var.j)) {
                        int iF = ci0Var.f(i5);
                        BigDecimal bigDecimalV = wo1Var.v(pz1.C(Double.valueOf(dA2)));
                        if (ci0Var.c(i5)) {
                            zh0VarF.E(iF, bigDecimalV.negate());
                        } else {
                            zh0VarF.E(iF, bigDecimalV);
                        }
                    }
                    i5++;
                    hashSet = hashSet2;
                    ii0Var = ii0Var2;
                }
                HashSet hashSet3 = hashSet;
                ii0 ii0Var3 = ii0Var;
                int i6 = 0;
                while (i6 < iB) {
                    double dA3 = zkVar.A(iD + i6);
                    Iterator it2 = it;
                    if (!wo1.D(dA3, wo1Var.j)) {
                        ih0 ih0VarE = ci0Var.e(i6);
                        mg1 mg1Var2 = (mg1) ih0VarE.getKey();
                        cs1 cs1Var = (cs1) ih0VarE.getValue();
                        BigDecimal bigDecimalV2 = wo1Var.v(pz1.C(Double.valueOf(dA3)));
                        if (ci0Var.a(i6)) {
                            bigDecimalV2 = bigDecimalV2.scaleByPowerOfTen(mg1Var2.g());
                        }
                        if (cs1.i.equals(cs1Var)) {
                            zh0VarF.y(mg1Var2.j.multiply(bigDecimalV2));
                            mg1Var2.a(zh0VarF, bigDecimalV2);
                        }
                        if (cs1.l.equals(cs1Var)) {
                            BigDecimal bigDecimalNegate = bigDecimalV2.negate();
                            zh0VarF.y(mg1Var2.l.multiply(bigDecimalNegate));
                            mg1Var2.a(zh0VarF, bigDecimalNegate);
                        }
                    }
                    i6++;
                    it = it2;
                }
                Iterator it3 = it;
                BigDecimal bigDecimalSubtract = zh0VarF.j;
                ii0Var = ii0Var3;
                if (bigDecimalSubtract.abs().compareTo(cz0Var.f) > 0) {
                    ii0Var.E(str);
                } else {
                    BigDecimal bigDecimalMax = om.b;
                    Iterator it4 = map.entrySet().iterator();
                    while (it4.hasNext()) {
                        bigDecimalMax = bigDecimalMax.max(((BigDecimal) ((Map.Entry) it4.next()).getValue()).abs());
                    }
                    Iterator it5 = map.entrySet().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            zh0VarF.x(r.v(bigDecimalSubtract));
                            wq0Var = this;
                            if (!wq0Var.a(bjVar, zh0VarF)) {
                                break;
                            }
                            boolean z3 = ii0Var.a.e;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it5.next();
                        BigDecimal bigDecimal3 = (BigDecimal) entry.getValue();
                        if (co1.j.C(bigDecimalMax, bigDecimal3)) {
                            e33 e33VarK = ii0Var.k(((lo2) entry.getKey()).h);
                            BigDecimal bigDecimal4 = bigDecimal3.signum() > 0 ? e33VarK.l : e33VarK.j;
                            if (bigDecimal4 == null) {
                                ii0Var.E(str);
                            } else {
                                bigDecimalSubtract = bigDecimalSubtract.subtract(bigDecimal3.multiply(bigDecimal4));
                                it5.remove();
                            }
                        } else {
                            entry.setValue(q.v(bigDecimal3));
                        }
                    }
                    it = it3;
                    hashSet = hashSet3;
                }
                wq0Var = this;
                it = it3;
                hashSet = hashSet3;
            } else {
                wq0Var.b++;
                wq0Var.i++;
            }
            z2 = z;
        }
        return c(bjVar);
    }

    @Override // defpackage.co1
    public final dz0 g() {
        return dz0.k;
    }
}
