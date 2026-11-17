package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zl0 {
    public final em0 a;
    public final t6 b;
    public final nj1 c;
    public final nj1 d;
    public boolean e;

    public zl0(em0 em0Var, t6 t6Var) {
        this.a = em0Var;
        this.b = t6Var;
        nj1 nj1Var = cd2.a;
        this.c = new nj1();
        this.d = new nj1();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        o6 o6Var = new o6(0, this, zl0.class, "invalidateNodes", "invalidateNodes()V", 0, (byte) 2);
        fj1 fj1Var = this.b.w0;
        if (!fj1Var.e(o6Var)) {
            fj1Var.a(o6Var);
        }
        this.e = true;
    }
}
