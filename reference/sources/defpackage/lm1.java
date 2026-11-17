package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class lm1 {
    public ou a;
    public List b;
    public List c;
    public boolean d;
    public wk e;

    public lm1(ou ouVar, boolean z) {
        this.a = ouVar;
        ag0 ag0Var = ag0.h;
        this.b = ag0Var;
        this.c = ag0Var;
        this.d = z;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(jm1 jm1Var);

    public abstract void d(jm1 jm1Var);

    public final void e() {
        wk wkVar = this.e;
        if (wkVar == null || !((gj1) wkVar.k).h(this)) {
            return;
        }
        om1 om1Var = (om1) wkVar.j;
        if (equals(om1Var.f)) {
            if (om1Var.g == -1) {
                a();
            }
            om1Var.f = null;
            om1Var.g = 0;
            om1Var.h = null;
        }
        om1Var.d.remove(this);
        om1Var.e.remove(this);
        this.e = null;
        om1Var.b();
    }

    public final void f(boolean z) {
        if (this.d != z) {
            this.d = z;
            wk wkVar = this.e;
            if (wkVar != null) {
                ((om1) wkVar.j).b();
            }
        }
    }
}
