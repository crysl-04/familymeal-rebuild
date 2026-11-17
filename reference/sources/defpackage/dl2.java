package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dl2 extends sn2 {
    public int c;

    public dl2(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.sn2
    public final void a(sn2 sn2Var) {
        sn2Var.getClass();
        this.c = ((dl2) sn2Var).c;
    }

    @Override // defpackage.sn2
    public final sn2 b(long j) {
        return new dl2(this.c, j);
    }
}
