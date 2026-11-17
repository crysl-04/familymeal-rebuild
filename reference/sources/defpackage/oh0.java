package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oh0 extends qh0 {
    public final rq j;
    public final /* synthetic */ sh0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh0(sh0 sh0Var, long j, rq rqVar) {
        super(j);
        this.k = sh0Var;
        this.j = rqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.E(this.k);
    }

    @Override // defpackage.qh0
    public final String toString() {
        return super.toString() + this.j;
    }
}
