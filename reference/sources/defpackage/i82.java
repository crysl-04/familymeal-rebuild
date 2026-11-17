package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i82 extends w implements r20 {
    public final /* synthetic */ mz i;
    public final /* synthetic */ j82 j;

    /* JADX WARN: Illegal instructions before constructor call */
    public i82(mz mzVar, j82 j82Var) {
        c5 c5Var = c5.M;
        this.i = mzVar;
        this.j = j82Var;
        super(c5Var);
    }

    @Override // defpackage.r20
    public final void n(o20 o20Var, Throwable th) throws Throwable {
        mz mzVar = this.i;
        j82 j82Var = this.j;
        ou.H(th, new h6(mzVar, j82Var, (byte) 11));
        r20 r20Var = (r20) j82Var.h.m(c5.M);
        if (r20Var == null) {
            throw th;
        }
        r20Var.n(o20Var, th);
    }
}
