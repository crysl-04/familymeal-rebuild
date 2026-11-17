package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x01 extends v01 {
    public final z01 l;
    public final y01 m;
    public final jt n;
    public final Object o;

    public x01(z01 z01Var, y01 y01Var, jt jtVar, Object obj) {
        this.l = z01Var;
        this.m = y01Var;
        this.n = jtVar;
        this.o = obj;
    }

    @Override // defpackage.v01
    public final boolean m() {
        return false;
    }

    @Override // defpackage.v01
    public final void n(Throwable th) {
        jt jtVar = this.n;
        jt jtVarW = z01.W(jtVar);
        z01 z01Var = this.l;
        y01 y01Var = this.m;
        Object obj = this.o;
        if (jtVarW == null || !z01Var.f0(y01Var, jtVarW, obj)) {
            y01Var.h.e(new oa1(2), 2);
            jt jtVarW2 = z01.W(jtVar);
            if (jtVarW2 == null || !z01Var.f0(y01Var, jtVarW2, obj)) {
                z01Var.y(z01Var.I(y01Var, obj));
            }
        }
    }
}
