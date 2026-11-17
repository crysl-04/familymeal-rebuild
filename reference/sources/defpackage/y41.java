package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y41 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z41 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y41(z41 z41Var, Object obj, byte b) {
        this.a = b;
        this.b = z41Var;
        this.c = obj;
    }

    public final r41 b() {
        z41 z41Var = this.b;
        l41 l41Var = (l41) z41Var.q.g(this.c);
        if (l41Var != null) {
            return (r41) z41Var.m.g(l41Var);
        }
        return null;
    }

    public final boolean c() {
        wv1 wv1Var;
        switch (this.a) {
            case 0:
                return true;
            default:
                r41 r41VarB = b();
                if (r41VarB == null || (wv1Var = r41VarB.f) == null) {
                    return true;
                }
                return wv1Var.c();
        }
    }

    private final void a() {
    }
}
