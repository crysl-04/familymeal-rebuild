package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class wc2 extends y72 {
    @Override // defpackage.ry1, defpackage.a1
    public final double A(int i) {
        return ((vc2[]) this.j)[i].A0();
    }

    @Override // defpackage.ry1, defpackage.a1
    public final int D(int i) {
        return ((vc2) this.j[i]).U0();
    }

    @Override // defpackage.ry1
    public final void U0(int i, Comparable comparable) {
        Comparable[] comparableArr = this.j;
        comparableArr[i] = (vc2) ((vc2) ((vc2) comparableArr[i]).i0((vc2) this.h.k.n(comparable))).get();
    }

    @Override // defpackage.ry1, defpackage.a1
    public final short d(int i) {
        return (short) ((vc2) this.j[i]).U0();
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        Comparable[] comparableArr = this.j;
        comparableArr[i] = (vc2) ((vc2) ((vc2) comparableArr[i]).i0((vc2) this.h.k.f(d))).get();
    }

    @Override // defpackage.a1
    public final void m1(double d, yj1 yj1Var) {
        vc2[] vc2VarArr = (vc2[]) this.j;
        for (int i = 0; i < vc2VarArr.length; i++) {
            ((ry1) yj1Var).U0(i, (Comparable) ((vc2) vc2VarArr[i].h(d)).get());
        }
    }

    @Override // defpackage.ry1, defpackage.a1
    public final float q(int i) {
        return ((vc2[]) this.j)[i].d0();
    }

    @Override // defpackage.ry1, defpackage.a1
    public final long r(int i) {
        return ((vc2) this.j[i]).a0();
    }

    @Override // defpackage.ry1, defpackage.a1
    public final byte v(int i) {
        return (byte) ((vc2) this.j[i]).U0();
    }
}
