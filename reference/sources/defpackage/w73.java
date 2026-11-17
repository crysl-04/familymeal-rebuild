package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class w73 extends c83 {
    public final WindowInsets.Builder e;

    public w73(q83 q83Var) {
        super(q83Var);
        WindowInsets windowInsetsB = q83Var.b();
        this.e = windowInsetsB != null ? new WindowInsets.Builder(windowInsetsB) : new WindowInsets.Builder();
    }

    @Override // defpackage.c83
    public q83 b() {
        a();
        q83 q83VarC = q83.c(this.e.build(), null);
        ox0[] ox0VarArr = this.b;
        m83 m83Var = q83VarC.a;
        m83Var.v(ox0VarArr);
        m83Var.u(null);
        m83Var.y(this.c);
        m83Var.z(this.d);
        return q83VarC;
    }

    @Override // defpackage.c83
    public void e(ox0 ox0Var) {
        this.e.setMandatorySystemGestureInsets(ox0Var.d());
    }

    @Override // defpackage.c83
    public void f(ox0 ox0Var) {
        this.e.setSystemGestureInsets(ox0Var.d());
    }

    @Override // defpackage.c83
    public void g(ox0 ox0Var) {
        this.e.setSystemWindowInsets(ox0Var.d());
    }

    @Override // defpackage.c83
    public void h(ox0 ox0Var) {
        this.e.setTappableElementInsets(ox0Var.d());
    }

    public w73() {
        this.e = new WindowInsets.Builder();
    }
}
