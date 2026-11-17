package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gl2 extends sn2 {
    public Object c;

    public gl2(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.sn2
    public final void a(sn2 sn2Var) {
        sn2Var.getClass();
        this.c = ((gl2) sn2Var).c;
    }

    @Override // defpackage.sn2
    public final sn2 b(long j) {
        return new gl2(j, this.c);
    }
}
