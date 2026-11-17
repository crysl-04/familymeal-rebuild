package defpackage;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.stream.StreamSupport;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rm2 extends pi0 implements gz2, sm2 {
    public static final jy1 r;
    public final cm2 n;
    public final int[] o;
    public final int[] p;
    public final fz2 q;

    static {
        int i = or0.q;
        g52 g52Var = h52.q;
        g52 g52Var2 = l52.q;
        r = new jy1((byte) 15);
    }

    public rm2(fy1 fy1Var, int i, int i2, IntBinaryOperator intBinaryOperator) {
        super(fy1Var, i, i2);
        d0(i, i2);
        y22 y22VarR = fy1Var.r();
        wo1 wo1Var = cm2.o;
        je1 je1Var = y22VarR.j;
        int iOrdinal = je1Var.ordinal();
        if (iOrdinal == 0) {
            pm pmVar = uw.j;
        } else if (iOrdinal == 1) {
            pm pmVar2 = u42.n;
        } else if (iOrdinal == 2) {
            pm pmVar3 = z52.k;
        } else if (iOrdinal != 5) {
            if (iOrdinal != 6) {
                pm pmVar4 = i32.i;
            } else {
                pm pmVar5 = qm.i;
            }
        }
        int iOrdinal2 = je1Var.ordinal();
        (iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 5 ? iOrdinal2 != 6 ? km.o : km.m : km.p : km.r : km.q : km.n).m();
        ns0 ns0VarA = ns0.a(y22VarR.j);
        this.n = new cm2(y22VarR, new ns0(Math.max(1L, intBinaryOperator.applyAsInt(i, i2)), ns0VarA.a, ns0VarA.c), size());
        int[] iArr = new int[i];
        this.o = iArr;
        this.p = new int[i];
        Arrays.fill(iArr, i2);
        this.q = fy1Var.l().a() ? ii1.o(i, i2) : ii1.m(i);
    }

    public static void A0(cm2 cm2Var, long j, long j2, pg2 pg2Var, gz2 gz2Var) {
        long jH1 = gz2Var.h1();
        long j3 = j * jH1;
        long j4 = j3 + jH1;
        int iQ1 = cm2Var.Q1((int) j3);
        if (iQ1 < 0) {
            iQ1 = -(iQ1 + 1);
        }
        int iQ2 = cm2Var.Q1((int) j4);
        if (iQ2 < 0) {
            iQ2 = -(iQ2 + 1);
        }
        while (iQ1 < iQ2) {
            gz2Var.S0(((long) cm2Var.l[iQ1]) % jH1, j2, (Comparable) ((vc2) cm2Var.n.U1(iQ1)).i(pg2Var));
            iQ1++;
        }
    }

    public static void D0(rm2 rm2Var, rm2 rm2Var2, gz2 gz2Var) {
        gz2Var.reset();
        boolean zA0 = rm2Var.a0();
        cm2 cm2Var = rm2Var.n;
        if (zA0) {
            StreamSupport.stream(rm2Var2.b(), false).forEach(new om2(cm2Var, gz2Var, (byte) 1));
            return;
        }
        if (rm2Var.j().isAssignableFrom(uw.class)) {
            StreamSupport.stream(rm2Var2.b(), false).forEach(new om2(cm2Var, gz2Var, (byte) 2));
            return;
        }
        if (rm2Var.j().isAssignableFrom(z52.class)) {
            StreamSupport.stream(rm2Var2.b(), false).forEach(new om2(cm2Var, gz2Var, (byte) 3));
        } else if (rm2Var.j().isAssignableFrom(u42.class)) {
            StreamSupport.stream(rm2Var2.b(), false).forEach(new om2(cm2Var, gz2Var, (byte) 0));
        } else {
            li1.g("Unsupported element type!");
        }
    }

    public static void d0(int i, int i2) {
        if (((long) i) * ((long) i2) <= 2147483647L) {
            return;
        }
        wg.m(wi0.g("Too large: ", i, " x ", i2, " – rows times columns must not exceed Integer.MAX_VALUE!"));
    }

    public final void F0(int i, int i2) {
        int[] iArr = this.o;
        iArr[i] = Math.min(i2, iArr[i]);
        int[] iArr2 = this.p;
        iArr2[i] = Math.max(i2 + 1, iArr2[i]);
    }

    @Override // defpackage.yj1
    public final void G1(a1 a1Var, f32 f32Var) {
        long jMin = Math.min(a1Var.count(), count());
        double d = h32.j;
        double d2 = h32.a;
        f32Var.getClass();
        boolean z = d - d2 == d2;
        boolean zA0 = a0();
        long j = 0;
        cm2 cm2Var = this.n;
        if (zA0) {
            if (!z) {
                while (j < jMin) {
                    y(j, a1Var.z(j) - z(j));
                    j++;
                }
                return;
            }
            am2 it = cm2Var.b().iterator();
            while (it.hasNext()) {
                it.c();
                double dZ = a1Var.z(it.D0());
                ry1 ry1Var = it.k;
                int i = it.h;
                ry1Var.o(i, dZ - ry1Var.A(i));
            }
            return;
        }
        if (!z) {
            while (j < jMin) {
                B(j, f32Var.a(a1Var.G(j), G(j)));
                j++;
            }
            return;
        }
        am2 it2 = cm2Var.b().iterator();
        while (it2.hasNext()) {
            it2.c();
            Comparable comparableG = a1Var.G(it2.D0());
            ry1 ry1Var2 = it2.k;
            int i2 = it2.h;
            ry1Var2.i2(i2, f32Var.a(comparableG, ry1Var2.U1(i2)));
        }
    }

    @Override // defpackage.gz2
    public final ep2 H0(int i, int i2) {
        return new ep2(new hp2(this), this.q, i, i2);
    }

    @Override // defpackage.bk1
    public final void I0(long j, long j2, double d) {
        this.n.F((((long) this.o.length) * j2) + j, d);
        F0((int) j, (int) j2);
    }

    @Override // defpackage.re1, defpackage.k1
    public final double J(int i, int i2) {
        return this.n.z((((long) i2) * ((long) this.o.length)) + ((long) i));
    }

    @Override // defpackage.gz2
    public final void K1(a1 a1Var, a1 a1Var2) {
        int intExact = Math.toIntExact(a1Var.count() / ((long) this.j));
        if (intExact != Math.toIntExact(a1Var2.count() / ((long) this.h))) {
            a42.a();
            throw null;
        }
        this.q.a(new hp2(this), a1Var, intExact, a1Var2);
    }

    @Override // defpackage.gz2
    public final gp2 L0(int... iArr) {
        return new gp2(new hp2(this), this.q, iArr);
    }

    @Override // defpackage.gz2
    public final dp2 N0(int... iArr) {
        return new dp2(new hp2(this), this.q, iArr);
    }

    @Override // defpackage.w0, defpackage.no2
    public final int P(int i) {
        long length = this.o.length;
        long jMin = ((long) i) * length;
        long j = jMin + length;
        cm2 cm2Var = this.n;
        int iQ1 = cm2Var.Q1((int) (j - 1));
        if (iQ1 < 0) {
            iQ1 = -(iQ1 + 2);
        }
        if (iQ1 >= 0) {
            jMin = Math.min(((long) cm2Var.l[iQ1]) + 1, j);
        }
        return j == jMin ? (int) length : (int) (jMin % length);
    }

    @Override // defpackage.no2
    public final int P0(int i) {
        long length = this.o.length;
        long j = ((long) i) * length;
        long jMin = ((long) (i + 1)) * length;
        cm2 cm2Var = this.n;
        int iQ1 = cm2Var.Q1((int) j);
        if (iQ1 < 0) {
            iQ1 = -(iQ1 + 1);
        }
        if (iQ1 < cm2Var.i) {
            jMin = Math.min(cm2Var.l[iQ1], jMin);
        }
        if (j == jMin) {
            return 0;
        }
        return (int) (jMin % length);
    }

    @Override // defpackage.bk1
    public final void S0(long j, long j2, Comparable comparable) {
        this.n.g((((long) this.o.length) * j2) + j, comparable);
        F0((int) j, (int) j2);
    }

    @Override // defpackage.w0, defpackage.no2
    public final int V(int i) {
        return this.p[i];
    }

    @Override // defpackage.bk1
    public final void W0(long j, long j2, c23 c23Var) {
        if (a0()) {
            Y1(j, j2, c23Var.a(y1(j, j2)));
        } else {
            y0(j, j2, c23Var.b(H(j, j2)));
        }
    }

    @Override // defpackage.re1
    public final cf0 W1(l52 l52Var) {
        int intExact = Math.toIntExact(((long) l52Var.i) / ((long) this.j));
        fy1 fy1Var = this.k;
        int i = this.h;
        if (!a0()) {
            return new pe1(l52Var, this);
        }
        rm2 rm2Var = new rm2(fy1Var, intExact, i, new nm2(this, (byte) 2));
        StreamSupport.stream(b(), false).forEach(new dj2(l52Var, intExact, rm2Var, (byte) 1));
        return rm2Var;
    }

    @Override // defpackage.k1, defpackage.a1
    public final bf0 b() {
        return new g1(this.n.b(), this.j);
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        long length = ((long) i2) * ((long) this.o.length);
        this.n.y(length + ((long) i), d);
        F0(i, i2);
    }

    @Override // defpackage.re1
    public final re1 e1(re1 re1Var) {
        int iT = re1Var.T();
        boolean z = re1Var instanceof rm2;
        int i = this.j;
        fy1 fy1Var = this.k;
        if (z) {
            rm2 rm2Var = new rm2(fy1Var, i, iT, new nm2(this, (byte) 0));
            D0(this, (rm2) re1Var, rm2Var);
            return rm2Var;
        }
        gy1 gy1Var = (gy1) fy1Var.q(i, iT);
        r1(re1Var, gy1Var);
        return gy1Var;
    }

    @Override // defpackage.pi0, defpackage.w0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && (obj instanceof rm2)) {
            rm2 rm2Var = (rm2) obj;
            cm2 cm2Var = rm2Var.n;
            cm2 cm2Var2 = this.n;
            if (cm2Var2 == null) {
                if (cm2Var != null) {
                    return false;
                }
            } else if (!cm2Var2.equals(cm2Var)) {
                return false;
            }
            if (Arrays.equals(this.o, rm2Var.o) && Arrays.equals(this.p, rm2Var.p)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.re1, defpackage.ko1
    public final re1 h(double d) {
        nm2 nm2Var = new nm2(this, (byte) 3);
        fy1 fy1Var = this.k;
        rm2 rm2Var = new rm2(fy1Var, this.j, this.h, nm2Var);
        if (a0()) {
            af0 af0Var = ((g1) b()).iterator().h;
            while (af0Var.hasNext()) {
                af0Var.next();
                rm2Var.y(af0Var.D0(), af0Var.A0() * d);
            }
        } else {
            vc2 vc2VarS = fy1Var.h().s(d);
            g1 it = ((g1) b()).iterator();
            af0 af0Var2 = it.h;
            while (af0Var2.hasNext()) {
                af0Var2.next();
                rm2Var.B(af0Var2.D0(), (Comparable) ((vc2) vc2VarS.i((Comparable) it.get())).get());
            }
        }
        return rm2Var;
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return this.n.G((((long) i2) * ((long) this.o.length)) + ((long) i));
    }

    @Override // defpackage.pi0, defpackage.w0
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        cm2 cm2Var = this.n;
        return Arrays.hashCode(this.p) + ((Arrays.hashCode(this.o) + ((iHashCode + (cm2Var == null ? 0 : cm2Var.hashCode())) * 31)) * 31);
    }

    @Override // defpackage.re1, defpackage.ko1
    public final re1 i(Comparable comparable) {
        nm2 nm2Var = new nm2(this, (byte) 4);
        fy1 fy1Var = this.k;
        rm2 rm2Var = new rm2(fy1Var, this.j, this.h, nm2Var);
        if (a0()) {
            double dC1 = xo1.c1(comparable);
            af0 af0Var = ((g1) b()).iterator().h;
            while (af0Var.hasNext()) {
                af0Var.next();
                rm2Var.y(af0Var.D0(), af0Var.A0() * dC1);
            }
        } else {
            tm tmVarW = fy1Var.i().W();
            g1 it = ((g1) b()).iterator();
            af0 af0Var2 = it.h;
            while (af0Var2.hasNext()) {
                af0Var2.next();
                rm2Var.B(af0Var2.D0(), tmVarW.a((Comparable) it.get(), comparable));
            }
        }
        return rm2Var;
    }

    @Override // defpackage.gz2
    public final gz2 j0() {
        return new ip2(new hp2(this), this.q);
    }

    @Override // defpackage.re1, defpackage.e1
    /* JADX INFO: renamed from: m */
    public final void a(gz2 gz2Var) {
        gz2Var.reset();
        this.n.b2(gz2Var);
    }

    @Override // defpackage.no2
    public final int n0(int i) {
        return this.o[i];
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        long length = ((long) i2) * ((long) this.o.length);
        this.n.F(length + ((long) i), d);
        F0(i, i2);
    }

    @Override // defpackage.re1
    public final void r1(final a1 a1Var, final gz2 gz2Var) {
        if (a1Var instanceof rm2) {
            D0(this, (rm2) a1Var, gz2Var);
            return;
        }
        if (!a0()) {
            gz2Var.K1(this, a1Var);
            return;
        }
        final long j = this.h;
        final long jB1 = gz2Var.B1();
        gz2Var.reset();
        StreamSupport.stream(b(), false).forEach(new Consumer() { // from class: pm2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bf0 bf0Var = (bf0) obj;
                long jQ1 = bf0Var.Q1();
                long jF0 = bf0Var.F0();
                double dA0 = bf0Var.A0();
                a1 a1Var2 = a1Var;
                boolean z = a1Var2 instanceof no2;
                long jMin = jB1;
                long jMax = 0;
                if (z) {
                    no2 no2Var = (no2) a1Var2;
                    int i = (int) jF0;
                    jMax = Math.max(no2Var.n0(i), 0L);
                    jMin = Math.min(no2Var.V(i), jMin);
                }
                long j2 = jMin;
                long j3 = jMax;
                while (j3 < j2) {
                    double dZ = a1Var2.z((j * j3) + jF0) * dA0;
                    a1 a1Var3 = a1Var2;
                    if (wo1.t(dZ, h32.a) != 0) {
                        gz2Var.I0(jQ1, j3, dZ);
                    }
                    j3++;
                    a1Var2 = a1Var3;
                }
            }
        });
    }

    @Override // defpackage.zj1
    public final void reset() {
        this.n.i = 0;
        Arrays.fill(this.o, this.h);
        Arrays.fill(this.p, 0);
    }

    @Override // defpackage.sm2
    public final k52 t0() {
        int i;
        cm2 cm2Var = this.n;
        int i2 = cm2Var.i;
        double[] dArr = new double[i2];
        int[] iArr = new int[i2];
        int i3 = this.h;
        int[] iArr2 = new int[i3 + 1];
        int i4 = 0;
        iArr2[0] = 0;
        am2 it = cm2Var.b().iterator();
        int i5 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            i = this.j;
            if (!zHasNext) {
                break;
            }
            it.c();
            long jD0 = it.D0();
            long j = i;
            int i6 = (int) (jD0 % j);
            int i7 = (int) (jD0 / j);
            while (i5 < i7) {
                i5++;
                iArr2[i5] = i4;
            }
            dArr[i4] = it.A0();
            iArr[i4] = i6;
            i4++;
        }
        while (i5 < i3) {
            i5++;
            iArr2[i5] = i4;
        }
        return new k52(i, i3, dArr, iArr, iArr2, (byte) 0);
    }

    @Override // defpackage.gz2
    public final fp2 v0(int i, int i2) {
        return new fp2(new hp2(this), this.q, i, i2);
    }

    @Override // defpackage.yj1
    public final void v1(tm tmVar, a1 a1Var) {
        long jMin = Math.min(count(), a1Var.count());
        double d = h32.a;
        boolean z = tmVar.c(d, h32.j) == d;
        boolean zA0 = a0();
        long j = 0;
        cm2 cm2Var = this.n;
        if (zA0) {
            if (!z) {
                while (j < jMin) {
                    y(j, tmVar.c(z(j), a1Var.z(j)));
                    j++;
                }
                return;
            }
            am2 it = cm2Var.b().iterator();
            while (it.hasNext()) {
                it.c();
                double dZ = a1Var.z(it.D0());
                ry1 ry1Var = it.k;
                int i = it.h;
                ry1Var.o(i, tmVar.c(ry1Var.A(i), dZ));
            }
            return;
        }
        if (!z) {
            while (j < jMin) {
                B(j, tmVar.a(G(j), a1Var.G(j)));
                j++;
            }
            return;
        }
        am2 it2 = cm2Var.b().iterator();
        while (it2.hasNext()) {
            it2.c();
            Comparable comparableG = a1Var.G(it2.D0());
            ry1 ry1Var2 = it2.k;
            int i2 = it2.h;
            ry1Var2.i2(i2, tmVar.a(ry1Var2.U1(i2), comparableG));
        }
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        this.n.B((((long) this.o.length) * j2) + j, comparable);
        F0((int) j, (int) j2);
    }
}
