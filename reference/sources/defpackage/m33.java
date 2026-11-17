package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m33 extends tt1 {
    public final lu1 e = rz1.x(new wj2(0));
    public final lu1 f = rz1.x(Boolean.FALSE);
    public final g33 g;
    public final lu1 h;
    public float i;
    public ln j;

    public m33(ks0 ks0Var) {
        g33 g33Var = new g33(ks0Var);
        g33Var.f = new xu1(this, (byte) 19);
        this.g = g33Var;
        this.h = new lu1(j23.a, c5.f0);
        this.i = 1.0f;
    }

    @Override // defpackage.tt1
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.tt1
    public final void b(ln lnVar) {
        this.j = lnVar;
    }

    @Override // defpackage.tt1
    public final long d() {
        return ((wj2) this.e.getValue()).a;
    }

    @Override // defpackage.tt1
    public final void e(td0 td0Var) {
        ln lnVar = this.j;
        g33 g33Var = this.g;
        if (lnVar == null) {
            lnVar = (ln) g33Var.g.getValue();
        }
        if (((Boolean) this.f.getValue()).booleanValue() && td0Var.getLayoutDirection() == u31.i) {
            long jX = td0Var.X();
            eg egVarF = td0Var.F();
            long jQ = egVarF.q();
            egVarF.g().l();
            try {
                ((g2) egVarF.i).M(-1.0f, 1.0f, jX);
                g33Var.e(td0Var, this.i, lnVar);
                wi0.r(egVarF, jQ);
            } catch (Throwable th) {
                wi0.r(egVarF, jQ);
                throw th;
            }
        } else {
            g33Var.e(td0Var, this.i, lnVar);
        }
        this.h.getValue();
    }
}
