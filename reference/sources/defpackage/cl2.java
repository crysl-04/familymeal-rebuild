package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cl2 extends sn2 {
    public float c;

    public cl2(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.sn2
    public final void a(sn2 sn2Var) {
        sn2Var.getClass();
        this.c = ((cl2) sn2Var).c;
    }

    @Override // defpackage.sn2
    public final sn2 b(long j) {
        return new cl2(this.c, j);
    }
}
