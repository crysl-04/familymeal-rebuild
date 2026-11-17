package defpackage;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class or0 extends wc2 implements gy1, mi0 {
    public static final /* synthetic */ int q = 0;
    public final gi1 k;
    public final li1 l;
    public final int m;
    public final g2 n;
    public final int o;
    public final eh p;

    static {
        new g2(hh.k, (byte) 21);
        new g2(jh.k, (byte) 21);
        new g2(uh.k, (byte) 21);
        new g2(yh.k, (byte) 21);
    }

    public or0(g2 g2Var, int i, int i2, vc2[] vc2VarArr) {
        super((gh) g2Var.i, vc2VarArr);
        this.n = g2Var;
        this.o = i;
        this.m = i2;
        long j = i;
        this.p = new eh(this, j);
        this.k = ii1.m(i);
        long j2 = i2;
        u8 u8Var = ni1.h;
        this.l = j2 == 1 ? new li1((byte) 4) : j == 1 ? new li1((byte) 5) : new li1((byte) 6);
    }

    @Override // defpackage.gy1
    public final void B0(boolean z, boolean z2, double[] dArr) {
        int length = dArr.length;
        g2 g2Var = this.n;
        or0 or0VarQ = g2Var.q(length, 1);
        gh ghVar = (gh) g2Var.i;
        for (int i = 0; i < dArr.length; i++) {
            or0VarQ.i2(i, ghVar.k.f(dArr[i]));
        }
        vc2[] vc2VarArr = (vc2[]) or0VarQ.j;
        uc2 uc2Var = ghVar.k;
        u8 u8Var = pp2.h;
        int length2 = vc2VarArr.length;
        long j = this.o;
        long j2 = this.m;
        long j3 = length2;
        BigDecimal[] bigDecimalArr = lg1.a;
        int intExact = Math.toIntExact(Math.min(Math.min(j, j2), j3));
        vc2[] vc2VarArr2 = (vc2[]) uc2Var.j(intExact);
        for (int i2 = 0; i2 < intExact; i2++) {
            for (int i3 = 0; i3 <= i2; i3++) {
                vc2VarArr2[i3] = (vc2) (z ? ((vc2) H(i3, i2)).T0().get() : H(i2, i3));
            }
            vc2 vc2VarK = uc2Var.k();
            for (int i4 = 0; i4 < i2; i4++) {
                vc2VarK = vc2VarK.z1((vc2) vc2VarArr2[i4].i(vc2VarArr[i4]));
            }
            vc2 vc2VarM0 = vc2VarArr[i2].m0(vc2VarK);
            if (!z2) {
                vc2VarM0 = vc2VarM0.T0().I1(vc2VarArr2[i2].T0()).T0();
            }
            vc2VarArr[i2] = (vc2) vc2VarM0.get();
        }
        for (int i5 = 0; i5 < dArr.length; i5++) {
            dArr[i5] = or0VarQ.A(i5);
        }
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.m;
    }

    @Override // defpackage.re1
    public final fy1 C0() {
        return this.n;
    }

    @Override // defpackage.ck1, java.util.function.Consumer
    /* JADX INFO: renamed from: D1 */
    public final void accept(k1 k1Var) {
        for (long j = 0; j < k1Var.B1(); j++) {
            for (long j2 = 0; j2 < k1Var.h1(); j2++) {
                y0(j2, j, k1Var.H(j2, j));
            }
        }
    }

    @Override // defpackage.gz2, defpackage.ak1
    public final void E(long j, long j2) {
        this.p.E(j, j2);
    }

    @Override // defpackage.gy1
    public final void E0(k1 k1Var, boolean z, boolean z2) {
        int length;
        vc2[] vc2VarArr = (vc2[]) this.j;
        uc2 uc2Var = ((gh) this.n.i).k;
        int i = this.o;
        if (i > 0) {
            u8 u8Var = op2.h;
            length = vc2VarArr.length / i;
        } else {
            length = 0;
        }
        if (length <= 64) {
            op2.c(vc2VarArr, i, 0, length, k1Var, z, z2, uc2Var);
            return;
        }
        u8 u8Var2 = op2.h;
        u8Var2.a = 64;
        u8Var2.b(0, length, new lp2(vc2VarArr, i, k1Var, z, z2, uc2Var, (byte) 0));
    }

    @Override // defpackage.ck1
    public final void G0(long j, a1 a1Var) {
        this.p.G0(j, a1Var);
    }

    @Override // defpackage.gz2
    public final ep2 H0(int i, int i2) {
        return new ep2(this, this.k, i, i2);
    }

    @Override // defpackage.re1, defpackage.i1
    public final a1 I(long j) {
        return this.p.I(j);
    }

    @Override // defpackage.bk1
    public final void I0(long j, long j2, double d) {
        this.p.I0(j, j2, d);
    }

    @Override // defpackage.re1, defpackage.k1
    public final double J(int i, int i2) {
        return A((i2 * this.o) + i);
    }

    @Override // defpackage.j1
    public final void J0(im imVar) {
        this.p.J0(imVar);
    }

    @Override // defpackage.gz2, defpackage.ak1
    public final void K(long j, long j2) {
        this.p.K(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    @Override // defpackage.gz2
    public final void K1(a1 a1Var, a1 a1Var2) {
        or0 or0VarL2;
        int intExact = Math.toIntExact(a1Var.count() / ((long) this.o));
        or0 or0VarL3 = null;
        if (intExact != Math.toIntExact(a1Var2.count() / ((long) this.m))) {
            a42.a();
            throw null;
        }
        boolean z = a1Var instanceof or0;
        boolean z2 = !z;
        boolean z3 = a1Var2 instanceof or0;
        boolean z4 = !z3;
        if (z) {
            or0VarL2 = l2(a1Var);
        } else if (a1Var instanceof wz2) {
            re1 re1Var = ((wz2) a1Var).k;
            if (re1Var instanceof or0) {
                or0VarL2 = (or0) re1Var;
            } else {
                or0VarL2 = null;
            }
        } else {
            or0VarL2 = null;
        }
        if (z3) {
            or0VarL3 = l2(a1Var2);
        } else if (a1Var2 instanceof wz2) {
            re1 re1Var2 = ((wz2) a1Var2).k;
            if (re1Var2 instanceof or0) {
                or0VarL3 = (or0) re1Var2;
            }
        }
        g2 g2Var = this.n;
        Comparable[] comparableArr = this.j;
        if (intExact == 0) {
            Arrays.fill(comparableArr, ((gh) g2Var.i).k.k());
            return;
        }
        if (or0VarL2 == null || or0VarL3 == null) {
            a(this, a1Var, intExact, a1Var2);
            return;
        }
        this.l.b((vc2[]) comparableArr, (vc2[]) or0VarL2.j, z2, intExact, (vc2[]) or0VarL3.j, z4, ((gh) g2Var.i).k);
    }

    @Override // defpackage.gz2
    public final gp2 L0(int... iArr) {
        return new gp2(this, this.k, iArr);
    }

    @Override // defpackage.gz2
    public final dp2 N0(int... iArr) {
        return new dp2(this, this.k, iArr);
    }

    @Override // defpackage.i1
    public final a1 N1(long j) {
        return this.p.I(j);
    }

    @Override // defpackage.gy1
    public final void O(k1 k1Var, boolean z, boolean z2) {
        int length;
        vc2[] vc2VarArr = (vc2[]) this.j;
        uc2 uc2Var = ((gh) this.n.i).k;
        int i = this.o;
        if (i > 0) {
            u8 u8Var = pp2.h;
            length = vc2VarArr.length / i;
        } else {
            length = 0;
        }
        if (length <= 64) {
            pp2.c(vc2VarArr, i, 0, length, k1Var, z, z2, uc2Var);
            return;
        }
        u8 u8Var2 = pp2.h;
        u8Var2.a = 64;
        u8Var2.b(0, length, new lp2(vc2VarArr, i, k1Var, z, z2, uc2Var, (byte) 1));
    }

    @Override // defpackage.zk, defpackage.yj1
    public final void O1(c23 c23Var) {
        int length;
        Comparable[] comparableArr = (vc2[]) this.j;
        int i = this.o;
        if (i > 0) {
            u8 u8Var = xg1.h;
            length = comparableArr.length / i;
        } else {
            length = 0;
        }
        if (length > 64) {
            u8 u8Var2 = xg1.h;
            u8Var2.a = 64;
            u8Var2.b(0, length, new fj0((byte) 1, i, comparableArr, c23Var));
        } else {
            int i2 = i * length;
            u8 u8Var3 = xg1.h;
            for (int i3 = 0; i3 < i2; i3++) {
                comparableArr[i3] = c23Var.b(comparableArr[i3]);
            }
        }
    }

    @Override // defpackage.bk1
    public final void Q(long j, long j2, sm smVar) {
        this.p.Q(j, j2, smVar);
    }

    @Override // defpackage.re1
    public final re1 Q0() {
        return new wz2(this);
    }

    @Override // defpackage.bk1
    public final void S0(long j, long j2, Comparable comparable) {
        this.p.S0(j, j2, comparable);
    }

    @Override // defpackage.no2
    public final int T() {
        return this.m;
    }

    @Override // defpackage.re1
    public final gy1 U() {
        Comparable[] comparableArr = this.j;
        int length = comparableArr.length;
        Object[] objArr = (Object[]) Array.newInstance(comparableArr.getClass().getComponentType(), length);
        System.arraycopy(comparableArr, 0, objArr, 0, length);
        return new or0(this.n, this.o, this.m, (vc2[]) ((Comparable[]) objArr));
    }

    @Override // defpackage.bk1
    public final void W0(long j, long j2, c23 c23Var) {
        y0(j, j2, (vc2) c23Var.b((vc2) H(j, j2)));
    }

    @Override // defpackage.y72, defpackage.xj1
    public final void Z(a1 a1Var) {
        int length;
        int length2;
        boolean z = a1Var instanceof c00;
        g2 g2Var = this.n;
        Comparable[] comparableArr = this.j;
        if (z) {
            final vc2[] vc2VarArr = (vc2[]) comparableArr;
            final re1 re1Var = ((c00) a1Var).k;
            final uc2 uc2Var = ((gh) g2Var.i).k;
            final int i = this.o;
            if (i > 0) {
                u8 u8Var = gj0.h;
                length2 = vc2VarArr.length / i;
            } else {
                length2 = 0;
            }
            if (length2 <= 256) {
                gj0.a(vc2VarArr, i, 0, length2, re1Var, uc2Var);
                return;
            }
            u8 u8Var2 = gj0.h;
            u8Var2.a = 256;
            final byte b = 1;
            u8Var2.b(0, length2, new sb0() { // from class: cj0
                @Override // defpackage.sb0
                public final void a(int i2, int i3) {
                    switch (b) {
                        case 0:
                            gj0.d(vc2VarArr, i, i2, i3, re1Var, uc2Var);
                            break;
                        default:
                            gj0.a(vc2VarArr, i, i2, i3, re1Var, uc2Var);
                            break;
                    }
                }
            });
            return;
        }
        if (!(a1Var instanceof wz2)) {
            super.Z(a1Var);
            return;
        }
        final vc2[] vc2VarArr2 = (vc2[]) comparableArr;
        final re1 re1Var2 = ((wz2) a1Var).k;
        final uc2 uc2Var2 = ((gh) g2Var.i).k;
        final int i2 = this.o;
        if (i2 > 0) {
            u8 u8Var3 = gj0.h;
            length = vc2VarArr2.length / i2;
        } else {
            length = 0;
        }
        if (length <= 256) {
            gj0.d(vc2VarArr2, i2, 0, length, re1Var2, uc2Var2);
            return;
        }
        u8 u8Var4 = gj0.h;
        u8Var4.a = 256;
        final byte b2 = 0;
        u8Var4.b(0, length, new sb0() { // from class: cj0
            @Override // defpackage.sb0
            public final void a(int i3, int i4) {
                switch (b2) {
                    case 0:
                        gj0.d(vc2VarArr2, i2, i3, i4, re1Var2, uc2Var2);
                        break;
                    default:
                        gj0.a(vc2VarArr2, i2, i3, i4, re1Var2, uc2Var2);
                        break;
                }
            }
        });
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.o;
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        this.p.b0(d, i, i2);
    }

    @Override // defpackage.re1
    public final re1 e1(re1 re1Var) {
        long j = this.o;
        long jB1 = re1Var.B1();
        g2 g2Var = this.n;
        or0 or0Var = (or0) g2Var.b(j, jB1);
        int i = this.m;
        if (i == 0) {
            return or0Var;
        }
        if (re1Var instanceof or0) {
            or0Var.l.b((vc2[]) or0Var.j, (vc2[]) this.j, false, i, (vc2[]) l2(re1Var).j, false, ((gh) g2Var.i).k);
            return or0Var;
        }
        or0Var.K1(this, re1Var);
        return or0Var;
    }

    @Override // defpackage.y72, defpackage.zk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof or0)) {
            return false;
        }
        or0 or0Var = (or0) obj;
        if (this.m != or0Var.m) {
            return false;
        }
        g2 g2Var = or0Var.n;
        g2 g2Var2 = this.n;
        if (g2Var2 == null) {
            if (g2Var != null) {
                return false;
            }
        } else if (!g2Var2.equals(g2Var)) {
            return false;
        }
        return this.o == or0Var.o;
    }

    @Override // defpackage.i1
    public final a1 g0(long j) {
        return this.p.u(j);
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return (vc2) this.p.H(i, i2);
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.o;
    }

    @Override // defpackage.y72, defpackage.zk
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + this.m) * 31;
        g2 g2Var = this.n;
        return ((iHashCode + (g2Var == null ? 0 : g2Var.hashCode())) * 31) + this.o;
    }

    @Override // defpackage.gz2
    public final gz2 j0() {
        return new ip2(this, this.k);
    }

    public final or0 l2(a1 a1Var) {
        int length;
        if (a1Var instanceof or0) {
            return (or0) a1Var;
        }
        boolean z = a1Var instanceof k1;
        g2 g2Var = this.n;
        if (!z) {
            return (or0) g2Var.d(a1Var);
        }
        k1 k1Var = (k1) a1Var;
        g2Var.getClass();
        int iZ1 = k1Var.Z1();
        or0 or0VarQ = g2Var.q(iZ1, k1Var.T());
        vc2[] vc2VarArr = (vc2[]) or0VarQ.j;
        uc2 uc2Var = ((gh) g2Var.i).k;
        if (iZ1 > 0) {
            u8 u8Var = gj0.h;
            length = vc2VarArr.length / iZ1;
        } else {
            length = 0;
        }
        if (length > 256) {
            u8 u8Var2 = gj0.h;
            u8Var2.a = 256;
            u8Var2.b(0, length, new dj0(vc2VarArr, iZ1, k1Var, uc2Var));
        } else {
            gj0.b(vc2VarArr, iZ1, 0, length, k1Var, uc2Var);
        }
        return or0VarQ;
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        this.p.q0(d, i, i2);
    }

    @Override // defpackage.gy1
    public final void q1(boolean z, boolean z2, double[] dArr) {
        int length = dArr.length;
        g2 g2Var = this.n;
        or0 or0VarQ = g2Var.q(length, 1);
        gh ghVar = (gh) g2Var.i;
        for (int i = 0; i < dArr.length; i++) {
            or0VarQ.i2(i, ghVar.k.f(dArr[i]));
        }
        vc2[] vc2VarArr = (vc2[]) or0VarQ.j;
        uc2 uc2Var = ghVar.k;
        u8 u8Var = op2.h;
        int length2 = vc2VarArr.length;
        long j = this.o;
        long j2 = this.m;
        long j3 = length2;
        BigDecimal[] bigDecimalArr = lg1.a;
        int intExact = Math.toIntExact(Math.min(Math.min(j, j2), j3));
        vc2[] vc2VarArr2 = (vc2[]) uc2Var.j(intExact);
        for (int i2 = intExact - 1; i2 >= 0; i2--) {
            for (int i3 = i2; i3 < intExact; i3++) {
                vc2VarArr2[i3] = (vc2) (z ? ((vc2) H(i3, i2)).T0().get() : H(i2, i3));
            }
            vc2 vc2VarK = uc2Var.k();
            for (int i4 = i2 + 1; i4 < intExact; i4++) {
                vc2VarK = vc2VarK.z1((vc2) vc2VarArr2[i4].i(vc2VarArr[i4]));
            }
            vc2 vc2VarM0 = vc2VarArr[i2].m0(vc2VarK);
            if (!z2) {
                vc2VarM0 = vc2VarM0.T0().I1(vc2VarArr2[i2].T0()).T0();
            }
            vc2VarArr[i2] = (vc2) vc2VarM0.get();
        }
        for (int i5 = 0; i5 < dArr.length; i5++) {
            dArr[i5] = or0VarQ.A(i5);
        }
    }

    @Override // defpackage.re1
    public final Comparable r0(q22 q22Var) {
        long size = q22Var.size();
        g2 g2Var = this.n;
        gy1 gy1Var = (gy1) g2Var.b(1L, size);
        gy1 gy1Var2 = (gy1) g2Var.b(1L, 1L);
        gy1 gy1Var3 = (gy1) g2Var.m(q22Var);
        gy1Var3.O1(((gh) g2Var.i).i.u());
        gy1Var.K1(gy1Var3, this);
        gy1Var2.K1(gy1Var, q22Var);
        return (vc2) gy1Var2.G(0L);
    }

    @Override // defpackage.zk
    public final String toString() {
        return k1.l0(this);
    }

    @Override // defpackage.re1, defpackage.i1
    public final a1 u(long j) {
        return this.p.u(j);
    }

    @Override // defpackage.gz2
    public final fp2 v0(int i, int i2) {
        return new fp2(this, this.k, i, i2);
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        this.p.y0(j, j2, comparable);
    }

    @Override // defpackage.mi0
    public final no2 build() {
        return this;
    }
}
