package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class nm1 {
    public wk a;
    public boolean b;

    public final void a() {
        wk wkVar = this.a;
        if (wkVar == null) {
            li1.g("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            wkVar.h(this, null);
        }
        om1 om1Var = (om1) wkVar.j;
        v3 v3Var = (v3) wkVar.i;
        if (equals(om1Var.h) && -1 == om1Var.g) {
            lm1 lm1VarC = om1Var.f;
            if (lm1VarC == null) {
                lm1VarC = om1Var.c(-1);
            }
            om1Var.f = null;
            om1Var.g = 0;
            om1Var.h = null;
            if (lm1VarC == null) {
                ((kq1) v3Var.a).a.run();
            } else {
                lm1VarC.b();
            }
            om1Var.a.i(null, pm1.l);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
