package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tx2 extends ld2 implements Runnable {
    public final long l;

    public tx2(long j, n10 n10Var) {
        super(n10Var, n10Var.e());
        this.l = j;
    }

    @Override // defpackage.v, defpackage.z01
    public final String V() {
        return super.V() + "(timeMillis=" + this.l + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt.C(this.j);
        A(new sx2("Timed out waiting for " + this.l + " ms", this));
    }
}
