package defpackage;

import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r93 implements iz, c91 {
    public final t6 h;
    public final oz i;
    public boolean j;
    public h91 k;
    public nx l = t03.s;

    public r93(t6 t6Var, oz ozVar) {
        this.h = t6Var;
        this.i = ozVar;
    }

    public final void d() {
        if (!this.j) {
            this.j = true;
            t6 t6Var = this.h;
            t6Var.getView().setTag(R.id.wrapped_composition_tag, null);
            h91 h91Var = this.k;
            if (h91Var != null) {
                h91Var.f(this);
            }
            this.k = null;
            kb0 kb0Var = t6Var.n;
            if (kb0Var != null) {
                kb0Var.i.a();
            }
            t6Var.n = null;
        }
        this.i.m();
    }

    @Override // defpackage.c91
    public final void e(e91 e91Var, w81 w81Var) {
        if (w81Var == w81.ON_DESTROY) {
            d();
        } else {
            if (w81Var != w81.ON_CREATE || this.j) {
                return;
            }
            f(this.l);
        }
    }

    public final void f(zp0 zp0Var) {
        this.h.setOnReadyForComposition(new uy1((Object) this, zp0Var, (byte) 29));
    }
}
