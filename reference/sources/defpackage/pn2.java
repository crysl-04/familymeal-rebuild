package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pn2 extends sn2 {
    public h0 c;
    public int d;
    public int e;

    public pn2(long j, h0 h0Var) {
        super(j);
        this.c = h0Var;
    }

    @Override // defpackage.sn2
    public final void a(sn2 sn2Var) {
        synchronized (ia2.g0) {
            sn2Var.getClass();
            this.c = ((pn2) sn2Var).c;
            this.d = ((pn2) sn2Var).d;
            this.e = ((pn2) sn2Var).e;
        }
    }

    @Override // defpackage.sn2
    public final sn2 b(long j) {
        return new pn2(j, this.c);
    }
}
