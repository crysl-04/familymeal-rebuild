package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class r32 extends bk2 {
    public final xi1 k;
    public volatile kx2 l;
    public volatile kx2 m;

    public r32(ig0 ig0Var, int i, String str) {
        super(ig0Var, hw.a.incrementAndGet());
        int i2 = jc1.a;
        this.k = new xi1(6);
        new mj1();
    }

    public kx2 b(long j, long j2, String str) {
        kx2 kx2Var;
        synchronized (this.k) {
            xi1 xi1Var = this.k;
            Object objD = xi1Var.d(j);
            if (objD == null) {
                kx2 kx2Var2 = new kx2(j, j2, str, this);
                xi1Var.f(j, kx2Var2);
                objD = kx2Var2;
            }
            kx2Var = (kx2) objD;
        }
        return kx2Var;
    }
}
