package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ll1 extends lm1 {
    public final fy f;
    public pk1 g;
    public final lu1 h;
    public final hu1 i;
    public final iu1 j;

    public ll1(fy fyVar) {
        super(new qk1((pk1) dv.G0((List) fyVar.b().e.h.getValue())), true);
        this.f = fyVar;
        this.h = rz1.x(Boolean.FALSE);
        this.i = new hu1(0.0f);
        this.j = new iu1(2);
    }

    @Override // defpackage.lm1
    public final void a() {
        this.h.setValue(Boolean.FALSE);
        this.i.h(0.0f);
        this.j.h(2);
        this.g = null;
    }

    @Override // defpackage.lm1
    public final void b() {
        lu1 lu1Var = this.h;
        if (!((Boolean) lu1Var.getValue()).booleanValue()) {
            g();
        }
        pk1 pk1Var = this.g;
        if (pk1Var != null) {
            this.f.e(pk1Var, false);
        }
        lu1Var.setValue(Boolean.FALSE);
        this.i.h(0.0f);
        this.j.h(2);
        this.g = null;
    }

    @Override // defpackage.lm1
    public final void c(jm1 jm1Var) {
        this.h.setValue(Boolean.TRUE);
        this.i.h(jm1Var.b);
        this.j.h(jm1Var.a);
    }

    @Override // defpackage.lm1
    public final void d(jm1 jm1Var) {
        g();
        this.h.setValue(Boolean.TRUE);
        this.i.h(jm1Var.b);
        this.j.h(jm1Var.a);
    }

    public final void g() {
        fy fyVar = this.f;
        List list = (List) fyVar.b().e.h.getValue();
        if (list.size() < 2) {
            return;
        }
        pk1 pk1Var = (pk1) dv.F0(list);
        pk1 pk1Var2 = (pk1) list.get(list.size() - 2);
        fyVar.g(pk1Var);
        fyVar.g(pk1Var2);
        this.g = pk1Var;
    }
}
