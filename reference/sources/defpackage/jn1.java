package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jn1 {
    public qg1 a;
    public int b;
    public fj1 c;
    public fj1 d;
    public boolean e;
    public final /* synthetic */ ln1 f;

    public jn1(ln1 ln1Var, qg1 qg1Var, int i, fj1 fj1Var, fj1 fj1Var2, boolean z) {
        this.f = ln1Var;
        this.a = qg1Var;
        this.b = i;
        this.c = fj1Var;
        this.d = fj1Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        pg1 pg1Var = (pg1) this.c.g(this.b + i);
        pg1 pg1Var2 = (pg1) this.d.g(this.b + i2);
        return uz0.g(pg1Var, pg1Var2) || pg1Var.getClass() == pg1Var2.getClass();
    }
}
