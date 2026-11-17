package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h52 extends wh implements gy1, mi0 {
    public static final g52 q = new g52((byte) 0);
    public final fi1 l;
    public final wg m;
    public final int n;
    public final int o;
    public final eh p;

    public h52(int i, int i2, float[] fArr) {
        super(fArr);
        this.o = i;
        this.n = i2;
        long j = i;
        this.p = new eh(this, j);
        this.l = ii1.o(i, i2);
        long j2 = i2;
        u8 u8Var = ni1.h;
        this.m = j2 == 1 ? new wg((byte) 25) : j == 1 ? new wg((byte) 26) : new wg((byte) 27);
    }

    @Override // defpackage.gy1
    public final void B0(boolean z, boolean z2, double[] dArr) {
        int length = dArr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) dArr[i];
        }
        u8 u8Var = pp2.h;
        m02.p(z, z, z2, length, this.j, Math.max(1, this.o), fArr);
        for (int i2 = 0; i2 < length; i2++) {
            dArr[i2] = fArr[i2];
        }
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.n;
    }

    @Override // defpackage.re1
    public final fy1 C0() {
        return q;
    }

    @Override // defpackage.k1
    public final int C1(long j, long j2) {
        return this.p.C1(j, j2);
    }

    @Override // defpackage.ck1, java.util.function.Consumer
    /* JADX INFO: renamed from: D1 */
    public final void accept(k1 k1Var) {
        this.p.accept(k1Var);
    }

    @Override // defpackage.gz2, defpackage.ak1
    public final void E(long j, long j2) {
        this.p.E(j, j2);
    }

    @Override // defpackage.gy1
    public final void E0(k1 k1Var, boolean z, boolean z2) {
        int length;
        float[] fArr = this.j;
        int i = this.o;
        if (i > 0) {
            u8 u8Var = op2.h;
            length = fArr.length / i;
        } else {
            length = 0;
        }
        if (length <= 64) {
            op2.b(fArr, i, 0, length, k1Var, z, z2);
            return;
        }
        u8 u8Var2 = op2.h;
        u8Var2.a = 64;
        u8Var2.b(0, length, new np2(fArr, i, k1Var, z, z2, (byte) 0));
    }

    @Override // defpackage.ck1
    public final void G0(long j, a1 a1Var) {
        this.p.G0(j, a1Var);
    }

    @Override // defpackage.zk, defpackage.yj1
    public final void G1(a1 a1Var, f32 f32Var) {
        this.p.G1(a1Var, f32Var);
    }

    @Override // defpackage.gz2
    public final ep2 H0(int i, int i2) {
        return new ep2(this, this.l, i, i2);
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
        return this.p.J(i, i2);
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
        h52 h52Var;
        int intExact = Math.toIntExact(a1Var.count() / ((long) this.o));
        h52 h52Var2 = null;
        if (intExact != Math.toIntExact(a1Var2.count() / ((long) this.n))) {
            a42.a();
            throw null;
        }
        boolean z = a1Var instanceof h52;
        boolean z2 = !z;
        boolean z3 = a1Var2 instanceof h52;
        boolean z4 = !z3;
        if (z) {
            h52Var = (h52) a1Var;
        } else if (a1Var instanceof tz2) {
            re1 re1Var = ((tz2) a1Var).k;
            if (re1Var instanceof h52) {
                h52Var = (h52) re1Var;
            } else {
                h52Var = null;
            }
        } else {
            h52Var = null;
        }
        if (z3) {
            h52Var2 = (h52) a1Var2;
        } else if (a1Var2 instanceof tz2) {
            re1 re1Var2 = ((tz2) a1Var2).k;
            if (re1Var2 instanceof h52) {
                h52Var2 = (h52) re1Var2;
            }
        }
        float[] fArr = this.j;
        if (intExact == 0) {
            Arrays.fill(fArr, 0.0f);
            return;
        }
        if (h52Var == null || h52Var2 == null) {
            a(this, a1Var, intExact, a1Var2);
            return;
        }
        this.m.e(fArr, h52Var.j, z2, intExact, h52Var2.j, z4);
    }

    @Override // defpackage.gz2
    public final gp2 L0(int... iArr) {
        return new gp2(this, this.l, iArr);
    }

    @Override // defpackage.no2
    public final boolean N() {
        return this.p.N();
    }

    @Override // defpackage.gz2
    public final dp2 N0(int... iArr) {
        return new dp2(this, this.l, iArr);
    }

    @Override // defpackage.i1
    public final a1 N1(long j) {
        return this.p.I(j);
    }

    @Override // defpackage.gy1
    public final void O(k1 k1Var, boolean z, boolean z2) {
        int length;
        float[] fArr = this.j;
        int i = this.o;
        if (i > 0) {
            u8 u8Var = pp2.h;
            length = fArr.length / i;
        } else {
            length = 0;
        }
        if (length <= 64) {
            pp2.b(fArr, i, 0, length, k1Var, z, z2);
            return;
        }
        u8 u8Var2 = pp2.h;
        u8Var2.a = 64;
        u8Var2.b(0, length, new np2(fArr, i, k1Var, z, z2, (byte) 1));
    }

    @Override // defpackage.zk, defpackage.yj1
    public final void O1(c23 c23Var) {
        d2(0, this.o * this.n, 1, c23Var);
    }

    @Override // defpackage.bk1
    public final void Q(long j, long j2, sm smVar) {
        this.p.Q(j, j2, smVar);
    }

    @Override // defpackage.no2
    public final boolean R0() {
        return this.p.R0();
    }

    @Override // defpackage.wh, defpackage.a1
    public final double S(a1 a1Var) {
        return this.p.S(a1Var);
    }

    @Override // defpackage.bk1
    public final void S0(long j, long j2, Comparable comparable) {
        this.p.S0(j, j2, comparable);
    }

    @Override // defpackage.no2
    public final int T() {
        return this.n;
    }

    @Override // defpackage.bk1
    public final void W0(long j, long j2, c23 c23Var) {
        this.p.W0(j, j2, c23Var);
    }

    @Override // defpackage.k1
    public final double[][] X() {
        return this.p.X();
    }

    @Override // defpackage.ck1
    public final void X0(long j, a1 a1Var) {
        this.p.G0(j, a1Var);
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.o;
    }

    @Override // defpackage.k1
    public final f1 a2() {
        eh ehVar = this.p;
        ehVar.getClass();
        return new f1(ehVar);
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        this.p.b0(d, i, i2);
    }

    @Override // defpackage.k1
    public final long b1(long j, long j2) {
        return this.p.b1(j, j2);
    }

    @Override // defpackage.a1, defpackage.k1
    public final af0 c() {
        return this.p.c();
    }

    @Override // defpackage.re1
    public final re1 e1(re1 re1Var) {
        int length;
        wg wgVar;
        h52 h52Var;
        long j = this.o;
        long jB1 = re1Var.B1();
        g52 g52Var = q;
        h52 h52Var2 = (h52) g52Var.b(j, jB1);
        int i = this.n;
        if (i == 0) {
            return h52Var2;
        }
        boolean z = re1Var instanceof h52;
        if (!z) {
            h52Var2.K1(this, re1Var);
            return h52Var2;
        }
        wg wgVar2 = h52Var2.m;
        float[] fArr = h52Var2.j;
        if (z) {
            h52Var = (h52) re1Var;
            wgVar = wgVar2;
        } else {
            h52 h52Var3 = (h52) g52Var.a(re1Var.h1(), re1Var.B1()).build();
            float[] fArr2 = h52Var3.j;
            int i2 = h52Var3.o;
            byte b = 0;
            if (i2 > 0) {
                u8 u8Var = gj0.h;
                length = fArr2.length / i2;
            } else {
                length = 0;
            }
            if (length > 256) {
                u8 u8Var2 = gj0.h;
                u8Var2.a = 256;
                u8Var2.b(0, length, new fj0(b, i2, fArr2, re1Var));
            } else {
                u8 u8Var3 = gj0.h;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = b;
                    while (i5 < i2) {
                        fArr2[i4] = (float) re1Var.J(i5, i3);
                        i5++;
                        i4++;
                        wgVar2 = wgVar2;
                    }
                    i3++;
                    b = 0;
                }
            }
            wgVar = wgVar2;
            h52Var = h52Var3;
        }
        wgVar.e(fArr, this.j, false, i, h52Var.j, false);
        return h52Var2;
    }

    @Override // defpackage.wh, defpackage.zk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && (obj instanceof h52)) {
            h52 h52Var = (h52) obj;
            if (this.n == h52Var.n && this.o == h52Var.o) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ck1
    public final boolean f0(k1 k1Var) {
        return this.p.f0(k1Var);
    }

    @Override // defpackage.i1
    public final a1 g0(long j) {
        return this.p.u(j);
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return (Double) this.p.H(i, i2);
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.o;
    }

    @Override // defpackage.wh, defpackage.zk
    public final int hashCode() {
        return (((super.hashCode() * 31) + this.n) * 31) + this.o;
    }

    @Override // defpackage.gz2
    public final gz2 j0() {
        return new ip2(this, this.l);
    }

    @Override // defpackage.re1, defpackage.d1
    public final Comparable k() {
        return (Double) this.p.k();
    }

    @Override // defpackage.ck1
    public final void k0(re1 re1Var, tm tmVar, re1 re1Var2) {
        float[] fArr = this.j;
        int length = fArr.length;
        int i = this.o;
        int i2 = length / i;
        int iZ1 = re1Var.Z1();
        int iT = re1Var.T();
        int iZ2 = re1Var2.Z1();
        int iT2 = re1Var2.T();
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 % iT;
            int i5 = i3 % iT2;
            int i6 = 0;
            while (i6 < i) {
                int i7 = i3;
                fArr[(i7 * i) + i6] = tmVar.h((float) re1Var.J(i6 % iZ1, i4), (float) re1Var2.J(i6 % iZ2, i5));
                i6++;
                i3 = i7;
            }
            i3++;
        }
    }

    @Override // defpackage.d1
    public final Comparable p1() {
        return (Double) this.p.k();
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        this.p.q0(d, i, i2);
    }

    @Override // defpackage.gy1
    public final void q1(boolean z, boolean z2, double[] dArr) {
        int length = dArr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) dArr[i];
        }
        u8 u8Var = op2.h;
        m02.p(!z, z, z2, length, this.j, Math.max(1, this.o), fArr);
        for (int i2 = 0; i2 < length; i2++) {
            dArr[i2] = fArr[i2];
        }
    }

    @Override // defpackage.re1
    public final Comparable r0(q22 q22Var) {
        long size = q22Var.size();
        g52 g52Var = q;
        gy1 gy1Var = (gy1) g52Var.b(1L, size);
        gy1 gy1Var2 = (gy1) g52Var.b(1L, 1L);
        gy1Var.K1(q22Var, this);
        gy1Var2.K1(gy1Var, q22Var);
        return (Double) gy1Var2.G(0L);
    }

    @Override // defpackage.bk1
    public final void t1(sm smVar) {
        this.p.t1(smVar);
    }

    @Override // defpackage.zk
    public final String toString() {
        return k1.l0(this);
    }

    @Override // defpackage.re1, defpackage.i1
    public final a1 u(long j) {
        return this.p.u(j);
    }

    @Override // defpackage.a1
    public final double[] u0() {
        return this.p.u0();
    }

    @Override // defpackage.gz2
    public final fp2 v0(int i, int i2) {
        return new fp2(this, this.l, i, i2);
    }

    @Override // defpackage.zk, defpackage.yj1
    public final void v1(tm tmVar, a1 a1Var) {
        this.p.v1(tmVar, a1Var);
    }

    @Override // defpackage.re1, defpackage.j1
    public final void x(long j, long j2, im imVar) {
        this.p.x(j, j2, imVar);
    }

    @Override // defpackage.k1
    public final short x0(long j, long j2) {
        return this.p.x0(j, j2);
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        this.p.y0(j, j2, comparable);
    }

    @Override // defpackage.k1
    public final byte z0(long j, long j2) {
        return this.p.z0(j, j2);
    }

    @Override // defpackage.a1, defpackage.k1
    public final bf0 c() {
        return this.p.c();
    }

    @Override // defpackage.mi0
    public final no2 build() {
        return this;
    }
}
