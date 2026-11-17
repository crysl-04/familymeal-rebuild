package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class gc1 extends w0 {
    public final re1 k;

    public gc1(re1 re1Var, int i, int i2) {
        super(i, i2);
        this.k = re1Var;
        re1Var.C0().h().k();
        re1Var.C0().h().c();
    }

    @Override // defpackage.re1
    public final fy1 C0() {
        return this.k.C0();
    }

    public gc1(re1 re1Var, long j, long j2) {
        this(re1Var, Math.toIntExact(j), Math.toIntExact(j2));
    }
}
