package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sx0 extends n73 implements Runnable, cq1, View.OnAttachStateChangeListener {
    public final u83 j;
    public boolean k;
    public boolean l;
    public q83 m;

    public sx0(u83 u83Var) {
        super(!u83Var.s ? 1 : 0);
        this.j = u83Var;
    }

    @Override // defpackage.cq1
    public final q83 a(View view, q83 q83Var) {
        this.m = q83Var;
        u83 u83Var = this.j;
        d33 d33Var = u83Var.q;
        m83 m83Var = q83Var.a;
        d33Var.f(p02.L(m83Var.h(8)));
        if (this.k) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.l) {
            u83Var.r.f(p02.L(m83Var.h(8)));
            u83.b(u83Var, q83Var);
        }
        return u83Var.s ? q83.b : q83Var;
    }

    @Override // defpackage.n73
    public final void b(v73 v73Var) {
        this.k = false;
        this.l = false;
        q83 q83Var = this.m;
        if (v73Var.a.b() > 0 && q83Var != null) {
            m83 m83Var = q83Var.a;
            u83 u83Var = this.j;
            u83Var.r.f(p02.L(m83Var.h(8)));
            u83Var.q.f(p02.L(m83Var.h(8)));
            u83.b(u83Var, q83Var);
        }
        this.m = null;
    }

    @Override // defpackage.n73
    public final void c(v73 v73Var) {
        this.k = true;
        this.l = true;
    }

    @Override // defpackage.n73
    public final q83 d(q83 q83Var, List list) {
        u83 u83Var = this.j;
        u83.b(u83Var, q83Var);
        return u83Var.s ? q83.b : q83Var;
    }

    @Override // defpackage.n73
    public final k42 e(v73 v73Var, k42 k42Var) {
        this.k = false;
        return k42Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.k) {
            this.k = false;
            this.l = false;
            q83 q83Var = this.m;
            if (q83Var != null) {
                u83 u83Var = this.j;
                u83Var.r.f(p02.L(q83Var.a.h(8)));
                u83.b(u83Var, q83Var);
                this.m = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
