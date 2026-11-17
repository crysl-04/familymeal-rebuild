package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c9 implements j02 {
    public k81 a;
    public dn2 b;
    public q81 c;
    public qi2 d;

    @Override // defpackage.j02
    public final void a() {
        j(null);
    }

    @Override // defpackage.j02
    public final void b(vv2 vv2Var, vv2 vv2Var2) {
        q81 q81Var = this.c;
        if (q81Var != null) {
            boolean z = (qw2.b(q81Var.h.b, vv2Var2.b) && uz0.g(q81Var.h.c, vv2Var2.c)) ? false : true;
            q81Var.h = vv2Var2;
            int size = q81Var.j.size();
            for (int i = 0; i < size; i++) {
                o72 o72Var = (o72) ((WeakReference) q81Var.j.get(i)).get();
                if (o72Var != null) {
                    o72Var.g = vv2Var2;
                }
            }
            l81 l81Var = q81Var.m;
            synchronized (l81Var.c) {
                l81Var.j = null;
                l81Var.l = null;
                l81Var.k = null;
                l81Var.m = null;
                l81Var.n = null;
            }
            if (uz0.g(vv2Var, vv2Var2)) {
                if (z) {
                    ix0 ix0Var = q81Var.b;
                    int iF = qw2.f(vv2Var2.b);
                    int iE = qw2.e(vv2Var2.b);
                    qw2 qw2Var = q81Var.h.c;
                    int iF2 = qw2Var != null ? qw2.f(qw2Var.a) : -1;
                    qw2 qw2Var2 = q81Var.h.c;
                    ix0Var.F().updateSelection((View) ix0Var.i, iF, iE, iF2, qw2Var2 != null ? qw2.e(qw2Var2.a) : -1);
                    return;
                }
                return;
            }
            if (vv2Var != null && (!uz0.g(vv2Var.a.i, vv2Var2.a.i) || (qw2.b(vv2Var.b, vv2Var2.b) && !uz0.g(vv2Var.c, vv2Var2.c)))) {
                ix0 ix0Var2 = q81Var.b;
                ix0Var2.F().restartInput((View) ix0Var2.i);
                return;
            }
            int size2 = q81Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                o72 o72Var2 = (o72) ((WeakReference) q81Var.j.get(i2)).get();
                if (o72Var2 != null) {
                    vv2 vv2Var3 = q81Var.h;
                    ix0 ix0Var3 = q81Var.b;
                    if (o72Var2.k) {
                        o72Var2.g = vv2Var3;
                        if (o72Var2.i) {
                            ix0Var3.F().updateExtractedText((View) ix0Var3.i, o72Var2.h, r02.F(vv2Var3));
                        }
                        qw2 qw2Var3 = vv2Var3.c;
                        long j = vv2Var3.b;
                        int iF3 = qw2Var3 != null ? qw2.f(qw2Var3.a) : -1;
                        qw2 qw2Var4 = vv2Var3.c;
                        ix0Var3.F().updateSelection((View) ix0Var3.i, qw2.f(j), qw2.e(j), iF3, qw2Var4 != null ? qw2.e(qw2Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.j02
    public final void c() {
        ol2 ol2Var;
        k81 k81Var = this.a;
        if (k81Var == null || (ol2Var = (ol2) vs.z(k81Var, uz.q)) == null) {
            return;
        }
        ((m80) ol2Var).b();
    }

    @Override // defpackage.j02
    public final void d(vv2 vv2Var, xp1 xp1Var, jw2 jw2Var, aa aaVar, r72 r72Var, r72 r72Var2) {
        q81 q81Var = this.c;
        if (q81Var != null) {
            l81 l81Var = q81Var.m;
            synchronized (l81Var.c) {
                l81Var.j = vv2Var;
                l81Var.l = xp1Var;
                l81Var.k = jw2Var;
                l81Var.m = r72Var;
                l81Var.n = r72Var2;
                if (l81Var.e || l81Var.d) {
                    l81Var.a();
                }
            }
        }
    }

    @Override // defpackage.j02
    public final void e() {
        ol2 ol2Var;
        k81 k81Var = this.a;
        if (k81Var == null || (ol2Var = (ol2) vs.z(k81Var, uz.q)) == null) {
            return;
        }
        ((m80) ol2Var).a();
    }

    @Override // defpackage.j02
    public final void f() {
        dn2 dn2Var = this.b;
        if (dn2Var != null) {
            dn2Var.a(null);
        }
        this.b = null;
        qj1 qj1VarI = i();
        if (qj1VarI != null) {
            qi2 qi2Var = (qi2) qj1VarI;
            synchronized (qi2Var) {
                qi2Var.u(qi2Var.o() + ((long) qi2Var.r), qi2Var.q, qi2Var.o() + ((long) qi2Var.r), qi2Var.o() + ((long) qi2Var.r) + ((long) qi2Var.s));
            }
        }
    }

    @Override // defpackage.j02
    public final void g(r72 r72Var) {
        Rect rect;
        q81 q81Var = this.c;
        if (q81Var != null) {
            q81Var.l = new Rect(ie1.x(r72Var.a), ie1.x(r72Var.b), ie1.x(r72Var.c), ie1.x(r72Var.d));
            if (!q81Var.j.isEmpty() || (rect = q81Var.l) == null) {
                return;
            }
            q81Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.j02
    public final void h(vv2 vv2Var, nu0 nu0Var, qb qbVar, v10 v10Var) {
        j(new u3(vv2Var, this, nu0Var, qbVar, v10Var, (byte) 1));
    }

    public final qj1 i() {
        qi2 qi2Var = this.d;
        if (qi2Var != null) {
            return qi2Var;
        }
        if (!so2.a) {
            return null;
        }
        qi2 qi2VarD = tz0.d(2, dp.j);
        this.d = qi2VarD;
        return qi2VarD;
    }

    public final void j(u3 u3Var) {
        k81 k81Var = this.a;
        if (k81Var == null) {
            return;
        }
        dn2 dn2Var = null;
        this.b = k81Var.u ? ie1.p(k81Var.x0(), null, new h(k81Var, new b9(u3Var, this, k81Var, dn2Var, (byte) 0), dn2Var, (byte) 20), 1) : null;
    }

    public final void k(k81 k81Var) {
        k81 k81Var2 = this.a;
        if (k81Var2 != k81Var) {
            dx0.c("Expected textInputModifierNode to be " + k81Var + " but was " + k81Var2);
        }
        this.a = null;
    }
}
