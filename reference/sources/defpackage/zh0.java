package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zh0 extends mg1 {
    public BigDecimal p;
    public transient boolean q;
    public transient boolean r;
    public transient Boolean s;
    public transient BigDecimal t;
    public final HashMap u;
    public final ii0 v;
    public zh0 w;
    public Map x;
    public transient boolean y;
    public final boolean z;

    public zh0(zh0 zh0Var, ii0 ii0Var, boolean z) {
        super(zh0Var);
        this.p = null;
        this.q = false;
        this.r = false;
        this.s = null;
        this.t = null;
        this.w = null;
        this.y = false;
        this.v = ii0Var;
        this.p = zh0Var.R();
        if (z) {
            this.z = false;
            this.u = new HashMap(zh0Var.u);
            this.x = (Map) Optional.ofNullable(zh0Var.x).map(new j5((byte) 3)).orElse(null);
        } else {
            this.z = true;
            this.u = zh0Var.u;
            this.x = (Map) Optional.ofNullable(zh0Var.x).orElse(null);
        }
        if (zh0Var.q()) {
            this.s = Boolean.TRUE;
        } else {
            this.s = null;
        }
    }

    public final void E(int i, BigDecimal bigDecimal) {
        I(((e33) this.v.o.get(i)).p, mg1.A(bigDecimal));
    }

    public final BigDecimal F(Set set) {
        BigDecimal bigDecimalAdd = om.a;
        if (set.size() > 0) {
            for (lo2 lo2Var : this.u.keySet()) {
                if (set.contains(lo2Var)) {
                    bigDecimalAdd = bigDecimalAdd.add(O(lo2Var, false).multiply(this.v.k(lo2Var.h).E()));
                }
            }
            Map map = this.x;
            if (map != null) {
                Iterator it = map.keySet().iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    li1.c();
                    return null;
                }
            }
        }
        return bigDecimalAdd;
    }

    public final zh0 G(Set set) {
        int size = set.size();
        String str = this.k;
        ii0 ii0Var = this.v;
        if (size != 0) {
            boolean zU = U();
            HashMap map = this.u;
            if (zU || !Collections.disjoint(set, map.keySet())) {
                zh0 zh0Var = new zh0(str, ii0Var);
                zh0 zh0Var2 = this.w;
                if (zh0Var2 == null) {
                    zh0Var2 = this;
                }
                zh0Var.w = zh0Var2;
                BigDecimal bigDecimalAdd = om.a;
                for (Map.Entry entry : map.entrySet()) {
                    lo2 lo2Var = (lo2) entry.getKey();
                    BigDecimal bigDecimal = (BigDecimal) entry.getValue();
                    if (set.contains(lo2Var)) {
                        bigDecimalAdd = bigDecimalAdd.add(bigDecimal.multiply(ii0Var.k(lo2Var.h).E()));
                    } else {
                        zh0Var.K(lo2Var, bigDecimal);
                    }
                }
                Map map2 = this.x;
                if (map2 != null) {
                    Iterator it = map2.entrySet().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        if (entry2.getKey() != null) {
                            li1.c();
                            return null;
                        }
                        throw null;
                    }
                }
                if (s()) {
                    zh0Var.x(this.j.subtract(bigDecimalAdd));
                }
                if (v()) {
                    zh0Var.B(this.l.subtract(bigDecimalAdd));
                }
                if (q()) {
                    zh0Var.s = Boolean.TRUE;
                }
                if ("Generated/Aggregated Objective".equals(str)) {
                    BigDecimal bigDecimalAdd2 = R().add(bigDecimalAdd);
                    zh0Var.p = mg1.A(bigDecimalAdd2);
                    ii0Var.g = bigDecimalAdd2;
                }
                return zh0Var;
            }
        }
        if ("Generated/Aggregated Objective".equals(str)) {
            ii0Var.g = R();
        }
        return this;
    }

    public final BigDecimal H(Set set) {
        Iterator it = set.iterator();
        int iMax = Integer.MIN_VALUE;
        do {
            boolean zHasNext = it.hasNext();
            HashMap map = this.u;
            if (!zHasNext) {
                Iterator it2 = set.iterator();
                BigInteger bigIntegerGcd = null;
                while (it2.hasNext()) {
                    BigInteger bigIntegerUnscaledValue = ((BigDecimal) map.get((lo2) it2.next())).abs().setScale(iMax, RoundingMode.UNNECESSARY).unscaledValue();
                    bigIntegerGcd = bigIntegerGcd != null ? bigIntegerGcd.gcd(bigIntegerUnscaledValue) : bigIntegerUnscaledValue;
                    if (bigIntegerGcd.equals(BigInteger.ONE) && iMax > 0) {
                        break;
                    }
                }
                return new BigDecimal(bigIntegerGcd, iMax);
            }
            iMax = Math.max(iMax, ((BigDecimal) map.get((lo2) it.next())).stripTrailingZeros().scale());
        } while (iMax <= 8);
        return null;
    }

    public final void I(lo2 lo2Var, BigDecimal bigDecimal) {
        BigDecimal bigDecimal2 = (BigDecimal) this.u.get(lo2Var);
        if (bigDecimal2 != null) {
            K(lo2Var, bigDecimal.add(bigDecimal2));
        } else {
            K(lo2Var, bigDecimal);
        }
    }

    public final void J(Set set, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Map map;
        BigDecimal bigDecimalH;
        BigDecimal bigDecimalA;
        boolean z = this.u.size() == set.size();
        Boolean bool = this.s;
        ii0 ii0Var = this.v;
        if (bool != null) {
            if (!z || !bool.booleanValue() || (bigDecimalH = S()) == null) {
                return;
            }
        } else {
            if (set.size() == 0 || !ii0Var.w(set) || ((map = this.x) != null && !map.isEmpty())) {
                this.s = Boolean.FALSE;
                return;
            }
            bigDecimalH = H(set);
            if (bigDecimalH == null) {
                this.s = Boolean.FALSE;
                return;
            }
        }
        wo1 wo1Var = ii0Var.a.b;
        BigDecimal bigDecimalC = null;
        if (bigDecimal != null) {
            bigDecimalA = h22.a(bigDecimal, bigDecimalH, wo1Var);
            if (z) {
                x(bigDecimalA);
            }
        } else {
            bigDecimalA = null;
        }
        if (bigDecimal2 != null) {
            bigDecimalC = h22.c(bigDecimal2, bigDecimalH, wo1Var);
            if (z) {
                B(bigDecimalC);
            }
        }
        if (bigDecimalA != null && bigDecimalC != null && bigDecimalA.compareTo(bigDecimalC) > 0) {
            X();
        }
        if (z) {
            this.t = bigDecimalH;
        }
        this.s = Boolean.valueOf(bigDecimalH.scale() <= 0);
    }

    public final void K(lo2 lo2Var, BigDecimal bigDecimal) {
        int iSignum = bigDecimal.signum();
        HashMap map = this.u;
        if (iSignum == 0) {
            map.remove(lo2Var);
        } else {
            map.put(lo2Var, bigDecimal);
            this.v.j.add(lo2Var);
        }
    }

    public final void L(BigDecimal bigDecimal) {
        int iSignum = bigDecimal.signum();
        Map map = this.x;
        if (iSignum != 0) {
            if (map == null) {
                this.x = new HashMap();
            }
            this.x.put(null, bigDecimal);
            throw null;
        }
        if (map != null) {
            map.remove(null);
        }
    }

    public final double M(lo2 lo2Var, boolean z) {
        return O(lo2Var, z).doubleValue();
    }

    public final BigDecimal N(a1 a1Var) {
        BigDecimal bigDecimalR = R();
        Map map = this.x;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    li1.c();
                    return null;
                }
                Q();
                throw null;
            }
        }
        for (lo2 lo2Var : this.u.keySet()) {
            bigDecimalR = bigDecimalR.add(O(lo2Var, false).multiply((BigDecimal) a1Var.G(lo2Var.h)));
        }
        return bigDecimalR;
    }

    public final BigDecimal O(lo2 lo2Var, boolean z) {
        int iG;
        BigDecimal bigDecimal = (BigDecimal) this.u.get(lo2Var);
        if (bigDecimal == null) {
            return om.a;
        }
        return (!z || (iG = g()) == 0) ? bigDecimal : bigDecimal.scaleByPowerOfTen(iG);
    }

    public final BigDecimal P(e33 e33Var) {
        return O(e33Var.p, false);
    }

    public final BigDecimal Q() {
        Map map = this.x;
        BigDecimal bigDecimal = map != null ? (BigDecimal) map.get(null) : null;
        return bigDecimal == null ? om.a : bigDecimal;
    }

    public final BigDecimal R() {
        BigDecimal bigDecimal = this.p;
        return bigDecimal != null ? bigDecimal : om.a;
    }

    public final BigDecimal S() {
        if (this.t == null) {
            Set setKeySet = this.u.keySet();
            if (setKeySet.size() > 0 && !U() && this.v.w(setKeySet)) {
                this.t = H(setKeySet);
            }
        }
        return this.t;
    }

    public final boolean T() {
        return this.u.size() > 0;
    }

    public final boolean U() {
        Map map = this.x;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public final boolean V() {
        if (this.r) {
            return true;
        }
        BigDecimal bigDecimal = this.j;
        BigDecimal bigDecimal2 = this.l;
        return (bigDecimal == null || bigDecimal2 == null || bigDecimal.compareTo(bigDecimal2) <= 0) ? false : true;
    }

    public final void W(e33 e33Var, long j) {
        K(e33Var.p, BigDecimal.valueOf(j));
    }

    public final void X() {
        this.r = true;
        this.v.e = true;
    }

    @Override // defpackage.mg1
    public final void a(zh0 zh0Var, BigDecimal bigDecimal) {
        for (Map.Entry entry : this.u.entrySet()) {
            zh0Var.I((lo2) entry.getKey(), ((BigDecimal) entry.getValue()).multiply(bigDecimal));
        }
        Map map = this.x;
        if (map != null) {
            for (Map.Entry entry2 : map.entrySet()) {
                BigDecimal bigDecimalMultiply = ((BigDecimal) entry2.getValue()).multiply(bigDecimal);
                if (entry2.getKey() != null) {
                    li1.c();
                    return;
                }
                Map map2 = zh0Var.x;
                BigDecimal bigDecimal2 = map2 != null ? (BigDecimal) map2.get(null) : null;
                if (bigDecimal2 != null) {
                    zh0Var.L(bigDecimalMultiply.add(bigDecimal2));
                } else {
                    zh0Var.L(bigDecimalMultiply);
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.k.compareTo(((zh0) obj).k);
    }

    @Override // defpackage.mg1
    public final int e() {
        if (!q()) {
            jm jmVar = jm.L0;
            im imVarX = jmVar.x();
            im imVarY = jmVar.y();
            if (U()) {
                Iterator it = this.x.entrySet().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    li1.c();
                    return 0;
                }
                Iterator it2 = this.x.values().iterator();
                while (it2.hasNext()) {
                    BigDecimal bigDecimalAbs = ((BigDecimal) it2.next()).abs();
                    imVarX.d(bigDecimalAbs);
                    imVarY.d(bigDecimalAbs);
                }
                return mg1.f(imVarX, imVarY);
            }
            if (T()) {
                Iterator it3 = this.u.values().iterator();
                while (it3.hasNext()) {
                    BigDecimal bigDecimalAbs2 = ((BigDecimal) it3.next()).abs();
                    imVarX.d(bigDecimalAbs2);
                    imVarY.d(bigDecimalAbs2);
                }
                return mg1.f(imVarX, imVarY);
            }
        }
        return 0;
    }

    @Override // defpackage.mg1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof zh0)) {
            return false;
        }
        zh0 zh0Var = (zh0) obj;
        if (!Objects.equals(this.p, zh0Var.p) || !Objects.equals(this.u, zh0Var.u)) {
            return false;
        }
        Map map = this.x;
        Set setEntrySet = map != null ? map.entrySet() : Collections.EMPTY_SET;
        Map map2 = zh0Var.x;
        return Objects.equals(setEntrySet, map2 != null ? map2.entrySet() : Collections.EMPTY_SET) && this.z == zh0Var.z;
    }

    @Override // defpackage.mg1
    public final int hashCode() {
        return Objects.hash(this.p, this.u, this.x, Boolean.valueOf(this.z)) + (super.hashCode() * 31);
    }

    @Override // defpackage.mg1
    public final mg1 l() {
        zh0 zh0Var = this.w;
        return zh0Var != null ? zh0Var : this;
    }

    @Override // defpackage.mg1
    public final boolean q() {
        if (this.s == null) {
            J(this.u.keySet(), this.j, this.l);
        }
        return this.s.booleanValue();
    }

    public zh0(String str, ii0 ii0Var) {
        super(str);
        this.p = null;
        this.q = false;
        this.r = false;
        this.s = null;
        this.t = null;
        this.w = null;
        this.y = false;
        Objects.requireNonNull(ii0Var);
        this.v = ii0Var;
        this.z = false;
        this.u = new HashMap();
        this.x = null;
    }
}
