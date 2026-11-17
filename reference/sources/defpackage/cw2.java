package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cw2 implements j02 {
    public final View a;
    public final eg b;
    public final g6 c;
    public boolean d;
    public vp0 e;
    public vp0 f;
    public vv2 g;
    public nu0 h;
    public final ArrayList i;
    public final d51 j;
    public Rect k;
    public final p30 l;
    public final uj1 m;
    public t n;

    public cw2(View view, t6 t6Var, g6 g6Var) {
        eg egVar = new eg(view);
        this.a = view;
        this.b = egVar;
        this.c = g6Var;
        this.e = new ss2((byte) 13);
        this.f = new ss2((byte) 14);
        this.g = new vv2("", qw2.b, 4);
        this.h = nu0.g;
        this.i = new ArrayList();
        this.j = vs.N(g81.i, new xu1(this, (byte) 16));
        this.l = new p30(t6Var, egVar);
        this.m = new uj1(new bw2[16]);
    }

    @Override // defpackage.j02
    public final void a() {
        i(bw2.h);
    }

    @Override // defpackage.j02
    public final void b(vv2 vv2Var, vv2 vv2Var2) {
        boolean z = (qw2.b(this.g.b, vv2Var2.b) && uz0.g(this.g.c, vv2Var2.c)) ? false : true;
        this.g = vv2Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            n72 n72Var = (n72) ((WeakReference) this.i.get(i)).get();
            if (n72Var != null) {
                n72Var.d = vv2Var2;
            }
        }
        p30 p30Var = this.l;
        synchronized (p30Var.c) {
            p30Var.j = null;
            p30Var.l = null;
            p30Var.k = null;
            p30Var.m = z9.j;
            p30Var.n = null;
            p30Var.o = null;
        }
        if (uz0.g(vv2Var, vv2Var2)) {
            if (z) {
                eg egVar = this.b;
                int iF = qw2.f(vv2Var2.b);
                int iE = qw2.e(vv2Var2.b);
                qw2 qw2Var = this.g.c;
                int iF2 = qw2Var != null ? qw2.f(qw2Var.a) : -1;
                qw2 qw2Var2 = this.g.c;
                ((InputMethodManager) ((d51) egVar.j).getValue()).updateSelection((View) egVar.i, iF, iE, iF2, qw2Var2 != null ? qw2.e(qw2Var2.a) : -1);
                return;
            }
            return;
        }
        if (vv2Var != null && (!uz0.g(vv2Var.a.i, vv2Var2.a.i) || (qw2.b(vv2Var.b, vv2Var2.b) && !uz0.g(vv2Var.c, vv2Var2.c)))) {
            eg egVar2 = this.b;
            ((InputMethodManager) ((d51) egVar2.j).getValue()).restartInput((View) egVar2.i);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            n72 n72Var2 = (n72) ((WeakReference) this.i.get(i2)).get();
            if (n72Var2 != null) {
                vv2 vv2Var3 = this.g;
                eg egVar3 = this.b;
                if (n72Var2.h) {
                    n72Var2.d = vv2Var3;
                    if (n72Var2.f) {
                        ((InputMethodManager) ((d51) egVar3.j).getValue()).updateExtractedText((View) egVar3.i, n72Var2.e, ys.e0(vv2Var3));
                    }
                    qw2 qw2Var3 = vv2Var3.c;
                    long j = vv2Var3.b;
                    int iF3 = qw2Var3 != null ? qw2.f(qw2Var3.a) : -1;
                    qw2 qw2Var4 = vv2Var3.c;
                    ((InputMethodManager) ((d51) egVar3.j).getValue()).updateSelection((View) egVar3.i, qw2.f(j), qw2.e(j), iF3, qw2Var4 != null ? qw2.e(qw2Var4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.j02
    public final void c() {
        i(bw2.j);
    }

    @Override // defpackage.j02
    public final void d(vv2 vv2Var, xp1 xp1Var, jw2 jw2Var, aa aaVar, r72 r72Var, r72 r72Var2) {
        p30 p30Var = this.l;
        synchronized (p30Var.c) {
            p30Var.j = vv2Var;
            p30Var.l = xp1Var;
            p30Var.k = jw2Var;
            p30Var.m = aaVar;
            p30Var.n = r72Var;
            p30Var.o = r72Var2;
            if (p30Var.e || p30Var.d) {
                p30Var.a();
            }
        }
    }

    @Override // defpackage.j02
    public final void e() {
        i(bw2.k);
    }

    @Override // defpackage.j02
    public final void f() {
        this.d = false;
        this.e = new ss2((byte) 11);
        this.f = new ss2((byte) 12);
        this.k = null;
        i(bw2.i);
    }

    @Override // defpackage.j02
    public final void g(r72 r72Var) {
        Rect rect;
        this.k = new Rect(ie1.x(r72Var.a), ie1.x(r72Var.b), ie1.x(r72Var.c), ie1.x(r72Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.j02
    public final void h(vv2 vv2Var, nu0 nu0Var, qb qbVar, v10 v10Var) {
        this.d = true;
        this.g = vv2Var;
        this.h = nu0Var;
        this.e = qbVar;
        this.f = v10Var;
        i(bw2.h);
    }

    public final void i(bw2 bw2Var) {
        this.m.b(bw2Var);
        if (this.n == null) {
            t tVar = new t(this, (byte) 12);
            this.c.execute(tVar);
            this.n = tVar;
        }
    }
}
