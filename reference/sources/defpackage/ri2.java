package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ri2 extends v0 {
    public long a;
    public rq b;

    @Override // defpackage.v0
    public final boolean a(u0 u0Var) {
        qi2 qi2Var = (qi2) u0Var;
        if (this.a >= 0) {
            return false;
        }
        long j = qi2Var.p;
        if (j < qi2Var.q) {
            qi2Var.q = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.v0
    public final m10[] b(u0 u0Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((qi2) u0Var).v(j);
    }
}
