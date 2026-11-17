package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kq1 {
    public final Runnable a;
    public final yq2 b = new yq2(new o9((Object) this, (byte) 28));

    public kq1(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(qo0 qo0Var, e91 e91Var) {
        qo0Var.getClass();
        final h91 h91VarG = e91Var.g();
        if (h91VarG.h == x81.h) {
            return;
        }
        fq1 fq1Var = new fq1(qo0Var, new gq1(qo0Var, e91Var));
        qo0Var.a.add(fq1Var);
        fq1Var.g(false);
        wk.d(b().c, fq1Var);
        final o70 o70Var = new o70(fq1Var, this, h91VarG);
        h91VarG.a(o70Var);
        qo0Var.c.add(new AutoCloseable() { // from class: hq1
            @Override // java.lang.AutoCloseable
            public final void close() {
                h91VarG.f(o70Var);
            }
        });
    }

    public final iq1 b() {
        return (iq1) this.b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().c.f(new dq1(onBackInvokedDispatcher, 0), 1);
        b().c.f(new dq1(onBackInvokedDispatcher, 1000000), 0);
    }
}
