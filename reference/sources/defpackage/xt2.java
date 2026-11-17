package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xt2 {
    public final od a;
    public final xw2 b;
    public final boolean c;
    public final e90 d;
    public final sm0 e;
    public wk f;
    public u31 g;

    public xt2(od odVar, xw2 xw2Var, boolean z, e90 e90Var, sm0 sm0Var) {
        this.a = odVar;
        this.b = xw2Var;
        this.c = z;
        this.d = e90Var;
        this.e = sm0Var;
    }

    public final void a(u31 u31Var) {
        wk wkVar = this.f;
        if (wkVar == null || u31Var != this.g || wkVar.w()) {
            this.g = u31Var;
            wkVar = new wk(this.a, p02.H(this.b, u31Var), ag0.h, this.d, this.e, this.c);
        }
        this.f = wkVar;
    }
}
