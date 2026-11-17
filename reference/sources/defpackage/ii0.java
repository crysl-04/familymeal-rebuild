package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.Format;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ii0 {
    public static final wk q = new wk((byte) 10);
    public static final String r = UUID.randomUUID().toString();
    public final ds1 a;
    public final wk b;
    public final HashMap c;
    public final HashSet d;
    public transient boolean e;
    public final jh0 f;
    public BigDecimal g;
    public final BigDecimal h;
    public int i;
    public final HashSet j;
    public boolean k;
    public boolean l;
    public final boolean m;
    public final HashSet n;
    public final ArrayList o;
    public final hi0 p;

    public ii0(ii0 ii0Var, boolean z, boolean z2) {
        this.c = new HashMap();
        this.d = new HashSet();
        this.e = false;
        this.f = new jh0();
        BigDecimal bigDecimal = om.a;
        this.g = bigDecimal;
        this.h = bigDecimal;
        this.i = 0;
        this.l = false;
        this.n = new HashSet();
        this.o = new ArrayList();
        this.p = new hi0();
        this.b = ii0Var.b;
        this.a = ii0Var.a;
        this.i = ii0Var.i;
        BigDecimal bigDecimal2 = ii0Var.h;
        if (bigDecimal2 != null && bigDecimal2.signum() != 0) {
            this.h = this.h.add(bigDecimal2);
        }
        for (e33 e33Var : Collections.unmodifiableList(ii0Var.o)) {
            ArrayList arrayList = this.o;
            e33Var.getClass();
            arrayList.add(new e33(e33Var));
        }
        Set setF = ii0Var.f();
        this.j = ii0Var.j;
        this.m = z || ii0Var.m;
        this.k = ii0Var.k;
        for (zh0 zh0Var : ii0Var.e()) {
            if (z) {
                if (!z2) {
                    this.c.put(zh0Var.k, new zh0(zh0Var, this, false));
                } else if (zh0Var.t() || (zh0Var.o() && (!zh0Var.y || zh0Var.V()))) {
                    this.c.put(zh0Var.k, new zh0(zh0Var, this, false));
                }
            } else if (!z2) {
                this.c.put(zh0Var.k, new zh0(zh0Var, this, true));
            } else if (zh0Var.t() || (zh0Var.o() && (!zh0Var.y || zh0Var.V()))) {
                this.c.put(zh0Var.k, new zh0(zh0Var, this, true).G(setF));
            }
        }
    }

    public final zh0 A(String str) {
        li1 li1Var = (li1) this.b.i;
        HashMap map = this.c;
        if (map.containsKey(str)) {
            wg.m(wi0.h("This model already contains an expression named \"", str, "\"!"));
            return null;
        }
        li1Var.getClass();
        zh0 zh0Var = new zh0(str, this);
        map.put(str, zh0Var);
        return zh0Var;
    }

    public final e33 B(String str) {
        li1 li1Var = (li1) this.b.l;
        if (this.m) {
            li1.g("This model is a work copy - its set of variables cannot be modified!");
            return null;
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        li1Var.getClass();
        e33 e33Var = new e33(str, size);
        arrayList.add(e33Var);
        return e33Var;
    }

    public final zh0 C() {
        zh0 zh0Var = new zh0("Generated/Aggregated Objective", this);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.o;
            if (i >= arrayList.size()) {
                break;
            }
            e33 e33Var = (e33) arrayList.get(i);
            if (e33Var.t()) {
                zh0Var.K(((e33) zh0Var.v.o.get(i)).p, mg1.A(e33Var.i));
            }
            i++;
        }
        zh0Var.p = mg1.A(this.h);
        for (zh0 zh0Var2 : this.c.values()) {
            if (zh0Var2.t()) {
                BigDecimal bigDecimal = zh0Var2.i;
                boolean z = bigDecimal.compareTo(om.b) != 0;
                if (zh0Var2.T()) {
                    for (lo2 lo2Var : zh0Var2.u.keySet()) {
                        BigDecimal bigDecimalO = zh0Var.O(lo2Var, false);
                        BigDecimal bigDecimalO2 = zh0Var2.O(lo2Var, false);
                        if (z) {
                            bigDecimalO2 = bigDecimal.multiply(bigDecimalO2);
                        }
                        zh0Var.K(lo2Var, bigDecimalO.add(bigDecimalO2));
                    }
                }
                if (zh0Var2.U()) {
                    Map map = zh0Var2.x;
                    Iterator it = (map != null ? map.keySet() : Collections.EMPTY_SET).iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            li1.c();
                            return null;
                        }
                        BigDecimal bigDecimalQ = zh0Var.Q();
                        BigDecimal bigDecimalQ2 = zh0Var2.Q();
                        if (z) {
                            bigDecimalQ2 = bigDecimal.multiply(bigDecimalQ2);
                        }
                        zh0Var.L(bigDecimalQ.add(bigDecimalQ2));
                    }
                } else {
                    continue;
                }
            }
        }
        return zh0Var;
    }

    public final void D() {
        boolean zB;
        if (((TreeSet) this.b.k).contains(h22.f)) {
            do {
                Set setF = f();
                zB = false;
                for (zh0 zh0Var : e()) {
                    if (!zB && zh0Var.o() && !zh0Var.y && !zh0Var.r) {
                        Map map = zh0Var.x;
                        if ((map != null ? map.size() : 0) == 0) {
                            BigDecimal bigDecimalF = zh0Var.F(setF);
                            BigDecimal bigDecimal = zh0Var.j;
                            BigDecimal bigDecimalSubtract = bigDecimal != null ? bigDecimal.subtract(bigDecimalF) : null;
                            BigDecimal bigDecimal2 = zh0Var.l;
                            BigDecimal bigDecimalSubtract2 = bigDecimal2 != null ? bigDecimal2.subtract(bigDecimalF) : null;
                            HashSet hashSet = this.n;
                            hashSet.clear();
                            hashSet.addAll(zh0Var.u.keySet());
                            hashSet.removeAll(setF);
                            if (zh0Var.q) {
                                hashSet.removeIf(new ai0(this, zh0Var, (byte) 1));
                            }
                            zB |= h22.f.b(zh0Var, hashSet, bigDecimalSubtract, bigDecimalSubtract2, this.a.b);
                        }
                    }
                }
            } while (zB);
        }
        this.p.a(this.o);
    }

    public final void E(String str) {
        this.c.remove(str);
    }

    public final void F() {
        boolean zV = v();
        ArrayList arrayList = this.o;
        int i = 0;
        if (zV) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                e33 e33Var = (e33) obj;
                if (e33Var.q && e33Var.o() && e33Var.q) {
                    BigDecimal bigDecimal = e33Var.l;
                    if (bigDecimal != null && bigDecimal.scale() > 0) {
                        e33Var.L(bigDecimal.setScale(0, RoundingMode.FLOOR));
                    }
                    BigDecimal bigDecimal2 = e33Var.j;
                    if (bigDecimal2 != null && bigDecimal2.scale() > 0) {
                        e33Var.I(bigDecimal2.setScale(0, RoundingMode.CEILING));
                    }
                }
            }
        }
        Set setF = f();
        Iterator it = ((TreeSet) this.b.k).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            HashMap map = this.c;
            if (!zHasNext) {
                if (zV) {
                    Iterator it2 = map.values().iterator();
                    while (it2.hasNext()) {
                        ((zh0) it2.next()).q();
                    }
                    return;
                }
                return;
            }
            gi0 gi0Var = (gi0) it.next();
            if (gi0Var instanceof g22) {
                int size2 = arrayList.size();
                int i3 = i;
                while (i3 < size2) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    e33 e33Var2 = (e33) obj2;
                    if (!this.j.contains(e33Var2.p)) {
                        if (e33Var2.t()) {
                            int iSignum = e33Var2.i.signum();
                            int i4 = this.i;
                            if ((i4 == 1 && iSignum == -1) || (i4 == 2 && iSignum == 1)) {
                                if (e33Var2.s()) {
                                    e33Var2.J(e33Var2.j);
                                } else {
                                    e33Var2.r = true;
                                }
                            } else if ((i4 == 1 && iSignum == 1) || (i4 == 2 && iSignum == -1)) {
                                if (e33Var2.v()) {
                                    e33Var2.J(e33Var2.l);
                                } else {
                                    e33Var2.r = true;
                                }
                            }
                        } else if (e33Var2.s == null) {
                            e33Var2.K(om.a);
                            BigDecimal bigDecimalA = mg1.A(e33Var2.E());
                            e33Var2.x(bigDecimalA);
                            e33Var2.B(bigDecimalA);
                        }
                    }
                }
            } else {
                boolean z = gi0Var instanceof e22;
                ds1 ds1Var = this.a;
                BigDecimal bigDecimal3 = null;
                if (z) {
                    e22 e22Var = (e22) gi0Var;
                    for (zh0 zh0Var : map.values()) {
                        if (e22Var.a(zh0Var)) {
                            switch (e22Var.j) {
                                case 0:
                                    int size3 = zh0Var.u.size();
                                    Map map2 = zh0Var.x;
                                    int size4 = map2 != null ? map2.size() : 0;
                                    int i5 = size3 + size4;
                                    wo1 wo1Var = ds1Var.a;
                                    wo1 wo1Var2 = ds1Var.b;
                                    if (size3 > 0) {
                                        Iterator it3 = zh0Var.u.values().iterator();
                                        while (it3.hasNext()) {
                                            if (wo1Var.E((BigDecimal) it3.next())) {
                                                zh0Var.q = true;
                                                i5--;
                                            }
                                        }
                                    }
                                    if (size4 > 0) {
                                        Map map3 = zh0Var.x;
                                        Iterator it4 = (map3 != null ? map3.values() : Collections.EMPTY_SET).iterator();
                                        while (it4.hasNext()) {
                                            if (wo1Var.E((BigDecimal) it4.next())) {
                                                zh0Var.q = true;
                                                i5--;
                                            }
                                        }
                                    }
                                    if (i5 == 0) {
                                        zh0Var.y = true;
                                        BigDecimal bigDecimalR = zh0Var.R();
                                        BigDecimal bigDecimal4 = zh0Var.j;
                                        BigDecimal bigDecimal5 = zh0Var.l;
                                        if (bigDecimal4 != null && wo1Var2.z(bigDecimal4, bigDecimalR)) {
                                            zh0Var.X();
                                        }
                                        if (bigDecimal5 != null && wo1Var2.A(bigDecimal5, bigDecimalR)) {
                                            zh0Var.X();
                                        }
                                    }
                                    break;
                                default:
                                    BigDecimal bigDecimal6 = zh0Var.i;
                                    for (Map.Entry entry : zh0Var.u.entrySet()) {
                                        e33 e33VarL = zh0Var.v.l((lo2) entry.getKey());
                                        BigDecimal bigDecimal7 = e33VarL.i;
                                        BigDecimal bigDecimalMultiply = bigDecimal6.multiply((BigDecimal) entry.getValue());
                                        if (bigDecimal7 != null) {
                                            bigDecimalMultiply = bigDecimal7.add(bigDecimalMultiply);
                                        }
                                        e33VarL.D(bigDecimalMultiply);
                                    }
                                    zh0Var.D(bigDecimal3);
                                    break;
                            }
                        }
                        bigDecimal3 = null;
                    }
                } else {
                    if (!(gi0Var instanceof f22)) {
                        throw new a42("Unknown simplifier type: ".concat(gi0Var.getClass().getName()), (byte) 0);
                    }
                    f22 f22Var = (f22) gi0Var;
                    for (zh0 zh0Var2 : map.values()) {
                        if (!zh0Var2.y && !zh0Var2.r && zh0Var2.o() && !zh0Var2.V() && !zh0Var2.y) {
                            Map map4 = zh0Var2.x;
                            if ((map4 != null ? map4.size() : 0) == 0) {
                                BigDecimal bigDecimalF = zh0Var2.F(setF);
                                BigDecimal bigDecimal8 = zh0Var2.j;
                                BigDecimal bigDecimalSubtract = bigDecimal8 != null ? bigDecimal8.subtract(bigDecimalF) : null;
                                BigDecimal bigDecimal9 = zh0Var2.l;
                                BigDecimal bigDecimalSubtract2 = bigDecimal9 != null ? bigDecimal9.subtract(bigDecimalF) : null;
                                HashSet hashSet = this.n;
                                hashSet.clear();
                                hashSet.addAll(zh0Var2.u.keySet());
                                hashSet.removeAll(setF);
                                if (zh0Var2.q) {
                                    hashSet.removeIf(new ai0(this, zh0Var2, (byte) 0));
                                }
                                f22Var.b(zh0Var2, hashSet, bigDecimalSubtract, bigDecimalSubtract2, ds1Var.b);
                                hashSet.clear();
                            }
                        }
                    }
                }
            }
            i = 0;
        }
    }

    public final void G(fi0 fi0Var, boolean z) {
        jh0 jh0Var = this.f;
        jh0Var.getClass();
        long jOrdinal = 1 << fi0Var.ordinal();
        if (jOrdinal == 0 || ((jOrdinal - 1) & jOrdinal) != 0) {
            wg.m("Mask must have exactly one bit set!");
            return;
        }
        long j = jh0Var.a;
        if (z) {
            jh0Var.a = j | jOrdinal;
        } else {
            jh0Var.a = j & (~jOrdinal);
        }
    }

    public final boolean H(gs1 gs1Var) {
        return I(gs1Var, this.a.b, cl.c);
    }

    public final boolean I(gs1 gs1Var, wo1 wo1Var, al alVar) {
        Objects.requireNonNull(wo1Var);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        boolean zC = ((long) size) == gs1Var.l.count();
        while (zC) {
            if (i >= size) {
                for (zh0 zh0Var : this.c.values()) {
                    zC &= zh0Var.C(zh0Var.N(gs1Var), wo1Var, alVar);
                }
                break;
            }
            zC &= ((e33) arrayList.get(i)).M(gs1Var.G(i), wo1Var, alVar, this.k);
            i++;
        }
        return zC;
    }

    public final zh0 a() {
        HashMap map = this.c;
        int size = map.size();
        String strH = jp1.h(size, "EXPR");
        while (map.containsKey(strH)) {
            size++;
            strH = jp1.h(size, "EXPR");
        }
        return A(strH);
    }

    public final e33 b() {
        return B("X" + this.o.size());
    }

    public final Stream c() {
        return this.o.stream().filter(new m5((byte) 11)).filter(new m5((byte) 9));
    }

    public final Stream d() {
        return this.c.values().stream().filter(new m5((byte) 10));
    }

    public final Collection e() {
        return Collections.unmodifiableCollection(this.c.values());
    }

    public final Set f() {
        HashSet hashSet = this.d;
        hashSet.clear();
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e33 e33Var = (e33) obj;
            if (e33Var.p()) {
                hashSet.add(e33Var.p);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public final List g() {
        hi0 hi0Var = this.p;
        int[] iArr = hi0Var.a;
        ArrayList arrayList = this.o;
        if (iArr == null || iArr.length != arrayList.size()) {
            hi0Var.a(arrayList);
        }
        return Collections.unmodifiableList(hi0Var.b);
    }

    public final List h() {
        hi0 hi0Var = this.p;
        int[] iArr = hi0Var.c;
        ArrayList arrayList = this.o;
        if (iArr == null || iArr.length != arrayList.size()) {
            hi0Var.a(arrayList);
        }
        return Collections.unmodifiableList(hi0Var.d);
    }

    public final List i() {
        hi0 hi0Var = this.p;
        int[] iArr = hi0Var.e;
        ArrayList arrayList = this.o;
        if (iArr == null || iArr.length != arrayList.size()) {
            hi0Var.a(arrayList);
        }
        return Collections.unmodifiableList(hi0Var.f);
    }

    public final List j() {
        hi0 hi0Var = this.p;
        int[] iArr = hi0Var.g;
        ArrayList arrayList = this.o;
        if (iArr == null || iArr.length != arrayList.size()) {
            hi0Var.a(arrayList);
        }
        return Collections.unmodifiableList(hi0Var.h);
    }

    public final e33 k(int i) {
        return (e33) this.o.get(i);
    }

    public final e33 l(lo2 lo2Var) {
        return (e33) this.o.get(lo2Var.h);
    }

    public final gs1 m() {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        dh dhVarC = dh.m.c(size);
        boolean z = true;
        for (int i = 0; i < size; i++) {
            e33 e33Var = (e33) arrayList.get(i);
            if (e33Var.E() != null) {
                dhVarC.set(i, e33Var.E());
            } else if (e33Var.p()) {
                dhVarC.set(i, e33Var.j);
            } else if (e33Var.s() && e33Var.v()) {
                mm mmVar = om.U;
                BigDecimal bigDecimalAdd = e33Var.j.add(e33Var.l);
                BigDecimal bigDecimal = om.c;
                mmVar.getClass();
                dhVarC.set(i, bigDecimalAdd.divide(bigDecimal, lg1.b));
            } else if (e33Var.s()) {
                dhVarC.set(i, e33Var.j);
            } else if (e33Var.v()) {
                dhVarC.set(i, e33Var.l);
            } else {
                dhVarC.set(i, om.a);
                z = false;
            }
        }
        return new gs1(z ? is1.APPROXIMATE : is1.UNEXPLORED, Double.NaN, dhVarC);
    }

    public final gs1 n() {
        wo1 wo1Var = this.a.b;
        gs1 gs1VarM = m();
        if (gs1VarM.m.a()) {
            return I(gs1VarM, wo1Var, cl.c) ? gs1VarM.f1(is1.FEASIBLE).u1(C().N(gs1VarM).doubleValue()) : gs1VarM.f1(is1.APPROXIMATE);
        }
        return gs1VarM.f1(is1.INFEASIBLE);
    }

    public final int o(int i) {
        hi0 hi0Var = this.p;
        int[] iArr = hi0Var.a;
        ArrayList arrayList = this.o;
        if (iArr == null || iArr.length != arrayList.size()) {
            hi0Var.a(arrayList);
        }
        return hi0Var.a[i];
    }

    public final int p(e33 e33Var) {
        return o(e33Var.p.h);
    }

    public final int q(int i) {
        hi0 hi0Var = this.p;
        int[] iArr = hi0Var.e;
        ArrayList arrayList = this.o;
        if (iArr == null || iArr.length != arrayList.size()) {
            hi0Var.a(arrayList);
        }
        return hi0Var.e[i];
    }

    public final int r(int i) {
        hi0 hi0Var = this.p;
        int[] iArr = hi0Var.g;
        ArrayList arrayList = this.o;
        if (iArr == null || iArr.length != arrayList.size()) {
            hi0Var.a(arrayList);
        }
        return hi0Var.g[i];
    }

    public final boolean s() {
        boolean z = false;
        for (zh0 zh0Var : this.c.values()) {
            z |= zh0Var.o() && !zh0Var.y && zh0Var.U();
        }
        return z;
    }

    public final boolean t() {
        boolean z = false;
        for (zh0 zh0Var : this.c.values()) {
            z |= zh0Var.U() && (zh0Var.t() || (zh0Var.o() && !zh0Var.y));
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x020c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0215  */
    /* JADX WARN: Code duplicated, block: B:67:0x021e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0227  */
    /* JADX WARN: Code duplicated, block: B:71:0x023c  */
    /* JADX WARN: Code duplicated, block: B:80:0x024f A[SYNTHETIC] */
    public final String toString() {
        String str;
        ds1 ds1Var;
        wo1 wo1Var;
        String str2;
        ci1 ci1Var;
        Comparable comparableJ;
        wo1 wo1Var2;
        Object objValueOf;
        ci1 ci1Var2;
        StringBuilder sb = new StringBuilder("############################################\n");
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            str = "\n";
            ds1Var = this.a;
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            e33 e33Var = (e33) obj;
            wo1 wo1Var3 = ds1Var.f;
            e33Var.b(sb, wo1Var3);
            e33Var.c(sb, wo1Var3);
            e33Var.d(sb, wo1Var3);
            sb.append("\n");
        }
        gs1 gs1VarM = m();
        for (zh0 zh0Var : this.c.values()) {
            wo1 wo1Var4 = ds1Var.f;
            zh0Var.b(sb, wo1Var4);
            sb.append(zh0Var.k);
            sb.append(": ");
            HashMap map = zh0Var.u;
            ii0 ii0Var = zh0Var.v;
            if (zh0Var.U() && zh0Var.T()) {
                g52 g52Var = l52.q;
                int size2 = ii0Var.o.size();
                j4 j4Var = new j4(g52.R(size2, size2), (byte) 1);
                k42 k42Var = new k42(j4Var, new g2(g52.R(1, size2)));
                if (zh0Var.U()) {
                    Iterator it = zh0Var.x.entrySet().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        entry.getKey().getClass();
                        li1.c();
                        return null;
                    }
                }
                if (zh0Var.T()) {
                    for (Map.Entry entry2 : map.entrySet()) {
                        ((gy1) ((re1) ((g2) k42Var.i).i)).o(((lo2) entry2.getKey()).h, ((BigDecimal) entry2.getValue()).doubleValue());
                        wo1Var4 = wo1Var4;
                    }
                }
                wo1Var = wo1Var4;
                BigDecimal bigDecimalR = zh0Var.R();
                ix0 ix0Var = ((j4) k42Var.j).j;
                ix0Var.i = bigDecimalR != null ? ((fy1) ix0Var.j).h().e(bigDecimalR) : null;
                ci1Var2 = k42Var;
            } else {
                wo1Var = wo1Var4;
                if (zh0Var.U() && !zh0Var.T()) {
                    g52 g52Var2 = l52.q;
                    int size3 = ii0Var.o.size();
                    j4 j4Var2 = new j4(g52.R(size3, size3), (byte) 1);
                    if (zh0Var.U()) {
                        Iterator it2 = zh0Var.x.entrySet().iterator();
                        if (it2.hasNext()) {
                            Map.Entry entry3 = (Map.Entry) it2.next();
                            entry3.getKey().getClass();
                            li1.c();
                            return null;
                        }
                    }
                    BigDecimal bigDecimalR2 = zh0Var.R();
                    ix0 ix0Var2 = j4Var2.j;
                    ix0Var2.i = bigDecimalR2 != null ? ((fy1) ix0Var2.j).h().e(bigDecimalR2) : null;
                    ci1Var2 = j4Var2;
                } else if (zh0Var.U() || !zh0Var.T()) {
                    str2 = str;
                    g52 g52Var3 = l52.q;
                    BigDecimal bigDecimalR3 = zh0Var.R();
                    ix0 ix0Var3 = new ix0(ii0Var.o.size(), g52Var3);
                    ix0Var3.i = bigDecimalR3 != null ? ((fy1) ix0Var3.j).h().e(bigDecimalR3) : null;
                    ci1Var = ix0Var3;
                } else {
                    g52 g52Var4 = l52.q;
                    j4 j4Var3 = new j4(g52.R(1, ii0Var.o.size()), (byte) 0);
                    if (zh0Var.T()) {
                        for (Map.Entry entry4 : map.entrySet()) {
                            ((gy1) j4Var3.i).o(((lo2) entry4.getKey()).h, ((BigDecimal) entry4.getValue()).doubleValue());
                            str = str;
                        }
                    }
                    str2 = str;
                    BigDecimal bigDecimalR4 = zh0Var.R();
                    ix0 ix0Var4 = j4Var3.j;
                    ix0Var4.i = bigDecimalR4 != null ? ((fy1) ix0Var4.j).h().e(bigDecimalR4) : null;
                    ci1Var = j4Var3;
                }
                comparableJ = ci1Var.j(new q22(gs1VarM, (byte) 1));
                if (comparableJ instanceof BigDecimal) {
                    wo1Var2 = wo1Var;
                    objValueOf = wo1Var2.v((BigDecimal) comparableJ);
                } else {
                    wo1Var2 = wo1Var;
                    wo1Var2.getClass();
                    if (comparableJ instanceof vo1) {
                        objValueOf = (Comparable) ((vo1) comparableJ).M0(wo1Var2);
                    } else {
                        objValueOf = Double.valueOf(wo1Var2.u(xo1.c1(comparableJ)));
                    }
                }
                sb.append(objValueOf);
                if (zh0Var.t()) {
                    sb.append(" (");
                    sb.append(wo1Var2.v(zh0Var.i));
                    sb.append(")");
                }
                zh0Var.d(sb, wo1Var2);
                sb.append(str2);
                str = str2;
            }
            str2 = str;
            ci1Var = ci1Var2;
            comparableJ = ci1Var.j(new q22(gs1VarM, (byte) 1));
            if (comparableJ instanceof BigDecimal) {
                wo1Var2 = wo1Var;
                objValueOf = wo1Var2.v((BigDecimal) comparableJ);
            } else {
                wo1Var2 = wo1Var;
                wo1Var2.getClass();
                if (comparableJ instanceof vo1) {
                    objValueOf = (Comparable) ((vo1) comparableJ).M0(wo1Var2);
                } else {
                    objValueOf = Double.valueOf(wo1Var2.u(xo1.c1(comparableJ)));
                }
            }
            sb.append(objValueOf);
            if (zh0Var.t()) {
                sb.append(" (");
                sb.append(wo1Var2.v(zh0Var.i));
                sb.append(")");
            }
            zh0Var.d(sb, wo1Var2);
            sb.append(str2);
            str = str2;
        }
        sb.append("############################################\n");
        return sb.toString();
    }

    public final boolean u() {
        boolean z = false;
        for (zh0 zh0Var : this.c.values()) {
            z |= zh0Var.t() && zh0Var.U();
        }
        return z;
    }

    public final boolean v() {
        if (this.k) {
            return false;
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; !z && i < size; i++) {
            e33 e33Var = (e33) arrayList.get(i);
            z |= e33Var.q && !e33Var.p();
        }
        return z;
    }

    public final boolean w(Set set) {
        if (set.size() <= 0) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!((e33) this.o.get(((lo2) it.next()).h)).q) {
                return false;
            }
        }
        return true;
    }

    public final boolean x(fi0 fi0Var) {
        jh0 jh0Var = this.f;
        jh0Var.getClass();
        long jOrdinal = 1 << fi0Var.ordinal();
        if (jOrdinal != 0 && ((jOrdinal - 1) & jOrdinal) == 0) {
            return (jh0Var.a & jOrdinal) != 0;
        }
        wg.m("Mask must have exactly one bit set!");
        return false;
    }

    public final void y(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        HashMap map = this.c;
        String str = r;
        zh0 zh0Var = (zh0) map.get(str);
        if (zh0Var == null) {
            zh0 zh0VarC = C();
            if (!zh0VarC.U()) {
                zh0Var = new zh0(zh0VarC, this, false);
                map.put(str, zh0Var);
            }
        }
        if (zh0Var == null) {
            C();
            return;
        }
        zh0Var.j = mg1.A(bigDecimal);
        zh0Var.B(bigDecimal2);
        if (zh0Var.o()) {
            zh0Var.J(zh0Var.u.keySet(), zh0Var.j, zh0Var.l);
        }
    }

    public final gs1 z() {
        if (!this.m && ((TreeSet) this.b.k).size() > 0) {
            F();
        }
        this.i = 2;
        bi0 bi0Var = new bi0(this);
        gs1 gs1VarF = bi0Var.f(null);
        if (gs1VarF.m.a()) {
            int iCount = (int) gs1VarF.l.count();
            ArrayList arrayList = this.o;
            if (iCount == arrayList.size()) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    e33 e33Var = (e33) arrayList.get(i);
                    if (!e33Var.p()) {
                        e33Var.K(this.a.g.v(gs1VarF.G(i)));
                    }
                }
            }
        }
        gs1 gs1VarM = m();
        gs1 gs1VarU1 = gs1VarF.a1(gs1VarM).u1(C().N(gs1VarM).doubleValue());
        bi0Var.j();
        return gs1VarU1;
    }

    public ii0() {
        ds1 ds1Var = new ds1();
        ds1Var.a = wo1.G(14);
        ds1Var.b = ds1.n;
        ds1Var.c = Integer.MAX_VALUE;
        ds1Var.d = Integer.MAX_VALUE;
        byte b = 1;
        ds1Var.e = true;
        ds1Var.f = mg1.o;
        wo1 wo1VarG = wo1.G(14);
        RoundingMode roundingMode = RoundingMode.HALF_DOWN;
        wo1 wo1VarL = wo1VarG.L(roundingMode);
        wo1 wo1Var = new wo1((NumberFormat) ((Format) wo1VarL.i), new MathContext(0, wo1VarL.k.getRoundingMode()), wo1VarL.o);
        ds1Var.g = new wo1((NumberFormat) ((Format) wo1Var.i), wo1Var.k, Integer.MIN_VALUE);
        ds1Var.h = eq.DAY.i;
        ds1Var.i = eq.HOUR.i;
        q10 q10Var = new q10();
        q10Var.a = wo1.H(16, 12).L(roundingMode);
        q10Var.b = new p10((byte) 0);
        q10Var.c = new p10(b);
        q10Var.d = h32.p + h32.o;
        q10Var.e = new j5(b);
        q10Var.f = new j5((byte) 2);
        ds1Var.j = q10Var;
        ds1Var.k = ez0.a;
        ds1Var.l = new yy((byte) 20);
        ds1Var.m = fu1.j.h.getAsInt();
        this.c = new HashMap();
        this.d = new HashSet();
        this.e = false;
        this.f = new jh0();
        BigDecimal bigDecimal = om.a;
        this.g = bigDecimal;
        this.h = bigDecimal;
        this.i = 0;
        this.l = false;
        this.n = new HashSet();
        this.o = new ArrayList();
        this.p = new hi0();
        this.b = q;
        this.a = ds1Var;
        this.j = new HashSet();
        this.m = false;
        this.k = false;
    }
}
