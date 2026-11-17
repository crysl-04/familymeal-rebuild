package defpackage;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ry1 extends zk implements RandomAccess {
    public final int i;

    public ry1(y22 y22Var, int i) {
        super(y22Var);
        if (i <= 2147483639) {
            this.i = i;
        } else {
            wg.m("Array too large!");
            throw null;
        }
    }

    @Override // defpackage.a1
    public abstract double A(int i);

    @Override // defpackage.zk
    public final void A0(long j, a1 a1Var, f32 f32Var) {
        b2(0, Math.toIntExact(j), 1, a1Var, f32Var);
    }

    @Override // defpackage.zj1
    public final void B(long j, Comparable comparable) {
        i2((int) j, comparable);
    }

    @Override // defpackage.a1
    public final int C(long j) {
        return D((int) j);
    }

    @Override // defpackage.a1
    public int D(int i) {
        return d(i);
    }

    @Override // defpackage.zk
    public final void D0(long j, tm tmVar, a1 a1Var) {
        c2(0, Math.toIntExact(j), 1, tmVar, a1Var);
    }

    @Override // defpackage.yj1
    public final void F(long j, double d) {
        f((int) j, d);
    }

    @Override // defpackage.a1
    public final Comparable G(long j) {
        return U1((int) j);
    }

    @Override // defpackage.a1
    public final float K0(long j) {
        return q((int) j);
    }

    @Override // defpackage.zk
    public final void M0(long j, long j2, long j3, im imVar) {
        j2(Math.toIntExact(j), Math.toIntExact(j2), Math.toIntExact(j3), imVar);
    }

    public abstract void Q1(int i, Comparable comparable);

    public final void T1(Comparable comparable) {
        Q1(this.i, comparable);
    }

    public abstract void U0(int i, Comparable comparable);

    public abstract Comparable U1(int i);

    public abstract void b2(int i, int i2, int i3, a1 a1Var, f32 f32Var);

    public abstract void c1(int i, int i2, int i3, int i4);

    public abstract void c2(int i, int i2, int i3, tm tmVar, a1 a1Var);

    @Override // defpackage.mo2
    public final long count() {
        return this.i;
    }

    @Override // defpackage.a1
    public short d(int i) {
        return v(i);
    }

    @Override // defpackage.zk
    public final void d0(long j, long j2, long j3, c23 c23Var) {
        d2(Math.toIntExact(j), Math.toIntExact(j2), Math.toIntExact(j3), c23Var);
    }

    public abstract void d2(int i, int i2, int i3, c23 c23Var);

    @Override // defpackage.a1
    public final short e(long j) {
        return d((int) j);
    }

    public abstract void e2(int i, c23 c23Var);

    public abstract void f2(long j, int i, a1 a1Var, f32 f32Var);

    @Override // defpackage.yj1
    public final void g(long j, Comparable comparable) {
        U0((int) j, comparable);
    }

    public abstract void g2(long j, int i, tm tmVar, a1 a1Var);

    public abstract void h2(int i, c23 c23Var);

    public abstract void i2(int i, Comparable comparable);

    @Override // defpackage.zk
    public final void j(long j, long j2, long j3, long j4) {
        c1(Math.toIntExact(j), Math.toIntExact(j2), Math.toIntExact(j3), Math.toIntExact(j4));
    }

    public abstract void j2(int i, int i2, int i3, im imVar);

    public abstract void k2(int i, im imVar);

    @Override // defpackage.yj1
    public final void n(long j, c23 c23Var) {
        h2(Math.toIntExact(j), c23Var);
    }

    public abstract void o(int i, double d);

    public void p(int i, float f) {
        o(i, f);
    }

    @Override // defpackage.a1
    public abstract float q(int i);

    @Override // defpackage.a1
    public long r(int i) {
        return D(i);
    }

    @Override // defpackage.a1
    public final long s(long j) {
        return r((int) j);
    }

    @Override // defpackage.mo2
    public final int size() {
        return this.i;
    }

    @Override // defpackage.z0
    public final void t(long j, im imVar) {
        k2(Math.toIntExact(j), imVar);
    }

    @Override // defpackage.a1
    public abstract byte v(int i);

    @Override // defpackage.a1
    public final byte w(long j) {
        return v((int) j);
    }

    @Override // defpackage.zj1
    public final void w1(float f, long j) {
        p((int) j, f);
    }

    @Override // defpackage.zj1
    public final void y(long j, double d) {
        o((int) j, d);
    }

    @Override // defpackage.a1
    public final double z(long j) {
        return A((int) j);
    }
}
