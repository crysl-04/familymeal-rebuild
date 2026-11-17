package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rv0 implements kn2 {
    public Float h;
    public Float i;
    public final lu1 j;
    public os2 k;
    public boolean l;
    public boolean m;
    public long n;
    public final /* synthetic */ tv0 o;

    public rv0(tv0 tv0Var, Float f, Float f2, qv0 qv0Var) {
        this.o = tv0Var;
        this.h = f;
        this.i = f2;
        this.j = rz1.x(f);
        this.k = new os2(qv0Var, aa3.Q, this.h, this.i, null);
    }

    @Override // defpackage.kn2
    public final Object getValue() {
        return this.j.getValue();
    }
}
