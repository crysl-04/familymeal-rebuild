package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xy2 {
    public final long a;
    public final long b;
    public final boolean c;

    public xy2(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final xy2 a(xy2 xy2Var) {
        return new xy2(up1.e(this.a, xy2Var.a), Math.max(this.b, xy2Var.b), this.c || xy2Var.c);
    }
}
