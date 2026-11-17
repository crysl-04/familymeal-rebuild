package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b23 implements rg {
    public final l41 h;
    public final ArrayList i = new ArrayList();
    public Object j;

    public b23(l41 l41Var) {
        this.h = l41Var;
        this.j = l41Var;
    }

    public final void a() {
        this.i.clear();
        this.j = this.h;
        this.h.Q();
    }

    @Override // defpackage.rg
    public final void c(int i, Object obj) {
        ((l41) this.j).C(i, (l41) obj);
    }

    @Override // defpackage.rg
    public final void d(Object obj) {
        this.i.add(this.j);
        this.j = obj;
    }

    @Override // defpackage.rg
    public final void e() {
        s72 rectManager;
        z5 autofillManager;
        s72 rectManager2;
        l41 l41Var = (l41) this.j;
        ln1 ln1Var = l41Var.L;
        if (!l41Var.I()) {
            ax0.a("onReuse is only expected on attached node");
        }
        z41 z41Var = l41Var.N;
        if (z41Var != null) {
            z41Var.i(false);
        }
        l41Var.z = false;
        if (l41Var.U) {
            l41Var.U = false;
        } else {
            qg1 qg1Var = l41Var.L.e;
            for (qg1 qg1Var2 = qg1Var; qg1Var2 != null; qg1Var2 = qg1Var2.l) {
                if (qg1Var2.u) {
                    qg1Var2.E0();
                }
            }
            for (qg1 qg1Var3 = qg1Var; qg1Var3 != null; qg1Var3 = qg1Var3.l) {
                if (qg1Var3.u) {
                    qg1Var3.G0();
                }
            }
            while (qg1Var != null) {
                if (qg1Var.u) {
                    qg1Var.A0();
                }
                qg1Var = qg1Var.l;
            }
        }
        int i = l41Var.i;
        t6 t6Var = l41Var.u;
        if (t6Var != null && (rectManager2 = t6Var.getRectManager()) != null) {
            rectManager2.h(l41Var);
        }
        l41Var.i = tg2.a.addAndGet(1);
        t6 t6Var2 = l41Var.u;
        if (t6Var2 != null) {
            t6Var2.getLayoutNodes().g(i);
            t6Var2.getLayoutNodes().h(l41Var.i, l41Var);
        }
        for (qg1 qg1Var4 = ln1Var.f; qg1Var4 != null; qg1Var4 = qg1Var4.m) {
            qg1Var4.z0();
        }
        ln1Var.e();
        if (ln1Var.c(8)) {
            l41Var.G();
        }
        l41.X(l41Var);
        t6 t6Var3 = l41Var.u;
        if (t6Var3 != null && (autofillManager = t6Var3.getAutofillManager()) != null) {
            t6 t6Var4 = autofillManager.j;
            ix0 ix0Var = autofillManager.h;
            ti1 ti1Var = autofillManager.o;
            if (ti1Var.e(i)) {
                ix0Var.K(t6Var4, i, false);
            }
            rg2 rg2VarW = l41Var.w();
            if (rg2VarW != null && rg2VarW.h.b(ah2.r)) {
                ti1Var.a(l41Var.i);
                ix0Var.K(t6Var4, l41Var.i, true);
            }
        }
        t6 t6Var5 = l41Var.u;
        if (t6Var5 == null || (rectManager = t6Var5.getRectManager()) == null) {
            return;
        }
        rectManager.g(l41Var);
    }

    @Override // defpackage.rg
    public final void f(int i, Object obj) {
    }

    @Override // defpackage.rg
    public final void g() {
        t6 t6Var = this.h.u;
        if (t6Var != null) {
            t6Var.u();
        }
    }

    @Override // defpackage.rg
    public final void h(int i, int i2, int i3) {
        ((l41) this.j).M(i, i2, i3);
    }

    @Override // defpackage.rg
    public final Object i() {
        return this.j;
    }

    @Override // defpackage.rg
    public final void j(int i, int i2) {
        ((l41) this.j).R(i, i2);
    }

    @Override // defpackage.rg
    public final void r() {
        ArrayList arrayList = this.i;
        this.j = arrayList.remove(arrayList.size() - 1);
    }
}
