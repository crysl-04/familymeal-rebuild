package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vb2 implements c91, AutoCloseable {
    public final String h;
    public final ub2 i;
    public boolean j;

    public vb2(String str, ub2 ub2Var) {
        this.h = str;
        this.i = ub2Var;
    }

    public final void d(k42 k42Var, h91 h91Var) {
        k42Var.getClass();
        h91Var.getClass();
        if (this.j) {
            li1.g("Already attached to lifecycleOwner");
            return;
        }
        this.j = true;
        h91Var.a(this);
        k42Var.h(this.h, (lb0) this.i.b.e);
    }

    @Override // defpackage.c91
    public final void e(e91 e91Var, w81 w81Var) {
        if (w81Var == w81.ON_DESTROY) {
            this.j = false;
            e91Var.g().f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
