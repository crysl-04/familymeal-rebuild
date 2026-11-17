package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class eh implements j1, d1, i1, no2, e1, bk1, ck1, ak1, k1, mo2, mi0 {
    public final long h;
    public final zk i;
    public final long j;

    static {
        gh ghVar = hh.k;
        gh ghVar2 = jh.k;
        gh ghVar3 = uh.k;
        vh vhVar = wh.k;
        vh vhVar2 = xh.k;
        gh ghVar4 = yh.k;
        zh zhVar = ai.k;
        vh vhVar3 = ci.k;
        vh vhVar4 = di.k;
        vh vhVar5 = ei.k;
        vh vhVar6 = fi.k;
    }

    public eh(zk zkVar, long j) {
        this.i = zkVar;
        this.j = j;
        this.h = j != 0 ? zkVar.count() / j : 0L;
    }

    @Override // defpackage.k1, defpackage.a1
    public final double A(int i) {
        return this.i.A(i);
    }

    @Override // defpackage.dk1, defpackage.zj1
    public final void B(long j, Comparable comparable) {
        this.i.B(j, comparable);
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.h;
    }

    @Override // defpackage.k1, defpackage.a1
    public final int C(long j) {
        return this.i.C(j);
    }

    @Override // defpackage.k1
    public final int C1(long j, long j2) {
        return this.i.C((j2 * this.j) + j);
    }

    @Override // defpackage.k1, defpackage.a1
    public final int D(int i) {
        return this.i.D(i);
    }

    @Override // defpackage.ak1
    public final void E(long j, long j2) {
        long j3 = this.j;
        this.i.j(j * j3, j2 * j3, 1L, j3);
    }

    @Override // defpackage.bk1, defpackage.yj1
    public final void F(long j, double d) {
        this.i.F(j, d);
    }

    @Override // defpackage.k1, defpackage.a1
    public final Comparable G(long j) {
        return this.i.G(j);
    }

    @Override // defpackage.ck1
    public final void G0(long j, a1 a1Var) {
        long jMin = Math.min(this.h, a1Var.count());
        boolean zA0 = this.i.a0();
        long j2 = 0;
        long j3 = this.j;
        if (zA0) {
            while (j2 < jMin) {
                y((j2 * j3) + j, a1Var.z(j2));
                j2++;
            }
        } else {
            while (j2 < jMin) {
                B((j2 * j3) + j, a1Var.G(j2));
                j2++;
            }
        }
    }

    @Override // defpackage.yj1
    public final void G1(a1 a1Var, f32 f32Var) {
        zk zkVar = this.i;
        zkVar.A0(zkVar.count(), a1Var, f32Var);
    }

    @Override // defpackage.k1
    public final Comparable H(long j, long j2) {
        return this.i.G((j2 * this.j) + j);
    }

    @Override // defpackage.bk1
    public final void I0(long j, long j2, double d) {
        this.i.F((j2 * this.j) + j, d);
    }

    @Override // defpackage.k1
    public final double J(int i, int i2) {
        return this.i.z((((long) i2) * this.j) + ((long) i));
    }

    @Override // defpackage.j1
    public final void J0(im imVar) {
        long j = this.h;
        long j2 = this.j;
        long jMin = Math.min(j2, j);
        this.i.M0(0L, (jMin * j2) + jMin, j2 + 1, imVar);
    }

    @Override // defpackage.ak1
    public final void K(long j, long j2) {
        this.i.j(j, j2, this.j, this.h);
    }

    @Override // defpackage.k1
    public final int M(int i, int i2) {
        return this.i.C((((long) i2) * this.j) + ((long) i));
    }

    @Override // defpackage.k1
    public final long M1(int i, int i2) {
        return this.i.s((((long) i2) * this.j) + ((long) i));
    }

    @Override // defpackage.dk1
    public final void P1(float f, long j, long j2) {
        this.i.w1(f, (j2 * this.j) + j);
    }

    @Override // defpackage.bk1
    public final void Q(long j, long j2, sm smVar) {
        long j3 = this.j;
        long jMin = Math.min(j3 - j, this.h - j2);
        zk zkVar = this.i;
        zkVar.d0((j2 * j3) + j, ((j2 + jMin) * j3) + j + jMin, j3 + 1, smVar);
    }

    @Override // defpackage.i1
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final dh I(long j) {
        long j2 = this.h;
        long j3 = this.j;
        return new dh(this.i, j, (j2 * j3) + j, j3);
    }

    @Override // defpackage.bk1
    public final void S0(long j, long j2, Comparable comparable) {
        this.i.g((j2 * this.j) + j, comparable);
    }

    @Override // defpackage.no2
    public final int T() {
        return Math.toIntExact(this.h);
    }

    @Override // defpackage.bk1
    public final void W0(long j, long j2, c23 c23Var) {
        this.i.n((j2 * this.j) + j, c23Var);
    }

    @Override // defpackage.dk1
    public final void Y1(long j, long j2, double d) {
        this.i.y((j2 * this.j) + j, d);
    }

    @Override // defpackage.k1
    public final float Z0(int i, int i2) {
        return this.i.K0((((long) i2) * this.j) + ((long) i));
    }

    @Override // defpackage.no2
    public final int Z1() {
        return Math.toIntExact(this.j);
    }

    @Override // defpackage.e1
    public final void a(dk1 dk1Var) {
        this.i.F0(dk1Var);
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        this.i.y((((long) i2) * this.j) + ((long) i), d);
    }

    @Override // defpackage.k1
    public final long b1(long j, long j2) {
        return this.i.s((j2 * this.j) + j);
    }

    @Override // defpackage.k1
    public final byte c0(int i, int i2) {
        return this.i.w((((long) i2) * this.j) + ((long) i));
    }

    @Override // defpackage.no2, defpackage.mo2
    public final long count() {
        return this.i.count();
    }

    @Override // defpackage.k1, defpackage.a1
    public final short d(int i) {
        return this.i.d(i);
    }

    @Override // defpackage.k1, defpackage.a1
    public final short e(long j) {
        return this.i.e(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh)) {
            return false;
        }
        eh ehVar = (eh) obj;
        return this.j == ehVar.j && this.h == ehVar.h && this.i.equals(ehVar.i);
    }

    @Override // defpackage.bk1, defpackage.yj1
    public final void f(int i, double d) {
        this.i.f(i, d);
    }

    @Override // defpackage.bk1, defpackage.yj1
    public final void g(long j, Comparable comparable) {
        this.i.g(j, comparable);
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.j;
    }

    public final int hashCode() {
        long j = this.h;
        int iHashCode = (this.i.hashCode() + ((((int) (j ^ (j >>> 32))) + 31) * 31)) * 31;
        long j2 = this.j;
        return iHashCode + ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // defpackage.k1
    public final short i1(int i, int i2) {
        return this.i.e((((long) i2) * this.j) + ((long) i));
    }

    @Override // defpackage.i1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final dh u(long j) {
        long j2 = this.j;
        long j3 = j * j2;
        return new dh(this.i, j3, j3 + j2, 1L);
    }

    @Override // defpackage.d1
    public final Comparable k() {
        im imVarM = this.i.h.h.m(3);
        J0(imVarM);
        return (Comparable) imVarM.get();
    }

    @Override // defpackage.bk1, defpackage.yj1
    public final void n(long j, c23 c23Var) {
        this.i.n(j, c23Var);
    }

    @Override // defpackage.dk1, defpackage.zj1
    public final void o(int i, double d) {
        this.i.o(i, d);
    }

    @Override // defpackage.dk1, defpackage.zj1
    public final void p(int i, float f) {
        this.i.p(i, f);
    }

    @Override // defpackage.k1, defpackage.a1
    public final float q(int i) {
        return this.i.q(i);
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        this.i.F((((long) i2) * this.j) + ((long) i), d);
    }

    @Override // defpackage.k1, defpackage.a1
    public final long r(int i) {
        return this.i.r(i);
    }

    @Override // defpackage.zj1
    public final void reset() {
        this.i.reset();
    }

    @Override // defpackage.k1, defpackage.a1
    public final long s(long j) {
        return this.i.s(j);
    }

    @Override // defpackage.j1, defpackage.z0
    public final void t(long j, im imVar) {
        this.i.t(j, imVar);
    }

    public final String toString() {
        return k1.l0(this);
    }

    @Override // defpackage.k1, defpackage.a1
    public final byte v(int i) {
        return this.i.v(i);
    }

    @Override // defpackage.yj1
    public final void v1(tm tmVar, a1 a1Var) {
        zk zkVar = this.i;
        zkVar.D0(zkVar.count(), tmVar, a1Var);
    }

    @Override // defpackage.k1, defpackage.a1
    public final byte w(long j) {
        return this.i.w(j);
    }

    @Override // defpackage.z0
    public final void w0(long j, im imVar) {
        this.i.M0(0L, j, 1L, imVar);
    }

    @Override // defpackage.j1
    public final void x(long j, long j2, im imVar) {
        this.i.t((j2 * this.j) + j, imVar);
    }

    @Override // defpackage.k1
    public final short x0(long j, long j2) {
        return this.i.e((j2 * this.j) + j);
    }

    @Override // defpackage.dk1, defpackage.zj1
    public final void y(long j, double d) {
        this.i.y(j, d);
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        this.i.B((j2 * this.j) + j, comparable);
    }

    @Override // defpackage.k1
    public final double y1(long j, long j2) {
        return this.i.z((j2 * this.j) + j);
    }

    @Override // defpackage.k1, defpackage.a1
    public final double z(long j) {
        return this.i.z(j);
    }

    @Override // defpackage.k1
    public final byte z0(long j, long j2) {
        return this.i.w((j2 * this.j) + j);
    }

    @Override // defpackage.mi0
    public final no2 build() {
        return this;
    }
}
