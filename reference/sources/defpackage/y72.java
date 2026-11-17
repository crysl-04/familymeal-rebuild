package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class y72 extends ry1 {
    public final Comparable[] j;

    public y72(y22 y22Var, Comparable[] comparableArr) {
        super(y22Var, comparableArr.length);
        this.j = comparableArr;
    }

    @Override // defpackage.ry1
    public final void Q1(int i, Comparable comparable) {
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = comparable;
        }
    }

    @Override // defpackage.ry1
    public final Comparable U1(int i) {
        return this.j[i];
    }

    public void Z(a1 a1Var) {
        uc2 uc2Var = this.h.k;
        u8 u8Var = gj0.h;
        Comparable[] comparableArr = this.j;
        int iMin = Math.min(comparableArr.length, a1Var.size());
        for (int i = 0; i < iMin; i++) {
            comparableArr[i] = uc2Var.n(a1Var.G(i));
        }
    }

    @Override // defpackage.ry1
    public final void b2(int i, int i2, int i3, a1 a1Var, f32 f32Var) {
        ls.L(this.j, i, i2, i3, a1Var, f32Var, this);
    }

    @Override // defpackage.ry1
    public final void c1(int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            Comparable[] comparableArr = this.j;
            Comparable comparable = comparableArr[i];
            comparableArr[i] = comparableArr[i2];
            comparableArr[i2] = comparable;
            i += i3;
            i2 += i3;
        }
    }

    @Override // defpackage.ry1
    public final void c2(int i, int i2, int i3, tm tmVar, a1 a1Var) {
        ls.L(this.j, i, i2, i3, this, tmVar, a1Var);
    }

    @Override // defpackage.ry1
    public final void d2(int i, int i2, int i3, c23 c23Var) {
        while (i < i2) {
            this.j[i] = c23Var.b(G(i));
            i += i3;
        }
    }

    @Override // defpackage.ry1
    public final void e2(int i, c23 c23Var) {
        Comparable[] comparableArr = this.j;
        comparableArr[i] = c23Var.b(comparableArr[i]);
    }

    @Override // defpackage.zk
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && (obj instanceof y72) && Arrays.equals(this.j, ((y72) obj).j);
    }

    @Override // defpackage.ry1
    public final void f2(long j, int i, a1 a1Var, f32 f32Var) {
        Comparable comparableG = a1Var.G(j);
        Comparable[] comparableArr = this.j;
        comparableArr[i] = f32Var.a(comparableG, comparableArr[i]);
    }

    @Override // defpackage.ry1
    public final void g2(long j, int i, tm tmVar, a1 a1Var) {
        Comparable[] comparableArr = this.j;
        comparableArr[i] = tmVar.a(comparableArr[i], a1Var.G(j));
    }

    @Override // defpackage.ry1
    public final void h2(int i, c23 c23Var) {
        Comparable[] comparableArr = this.j;
        comparableArr[i] = c23Var.b(comparableArr[i]);
    }

    @Override // defpackage.zk
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(this.j);
    }

    @Override // defpackage.ry1
    public final void i2(int i, Comparable comparable) {
        this.j[i] = this.h.k.n(comparable);
    }

    @Override // defpackage.ry1
    public final void j2(int i, int i2, int i3, im imVar) {
        while (i < i2) {
            imVar.d(this.j[i]);
            i += i3;
        }
    }

    @Override // defpackage.ry1
    public final void k2(int i, im imVar) {
        imVar.d(this.j[i]);
    }

    @Override // defpackage.ry1, defpackage.zj1
    public final void o(int i, double d) {
        this.j[i] = this.h.k.f(d);
    }

    @Override // defpackage.ry1, defpackage.zj1
    public final void p(int i, float f) {
        this.j[i] = this.h.k.f(f);
    }

    @Override // defpackage.zj1
    public final void reset() {
        Arrays.fill(this.j, this.h.k.f(h32.a));
    }
}
