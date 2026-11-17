package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pe1 implements cf0 {
    public final int h;
    public final cf0 i;
    public final int j;
    public final /* synthetic */ byte k;
    public final re1 l;
    public final Object m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pe1(re1 re1Var, re1 re1Var2) {
        this(re1Var2, Math.toIntExact(re1Var.count() / re1Var2.h1()), re1Var2.T());
        this.k = (byte) 1;
        this.l = re1Var;
        this.m = re1Var2;
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.h;
    }

    @Override // defpackage.no2
    public final int T() {
        return this.h;
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.j;
    }

    @Override // defpackage.e1
    public final void a(dk1 dk1Var) {
        byte b = this.k;
        Object obj = this.m;
        re1 re1Var = this.l;
        switch (b) {
            case 0:
                gz2 gz2Var = (gz2) dk1Var;
                this.i.a(gz2Var);
                gz2Var.G1((gy1) re1Var, (f32) obj);
                break;
            default:
                ((gz2) dk1Var).K1(re1Var, (re1) obj);
                break;
        }
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.j;
    }

    public final String toString() {
        return this.j + "x" + this.h + " " + String.valueOf(getClass());
    }

    public pe1(cf0 cf0Var, int i, int i2) {
        this.i = cf0Var;
        this.j = i;
        this.h = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pe1(gy1 gy1Var, f32 f32Var, pe1 pe1Var) {
        this(pe1Var, pe1Var.j, pe1Var.h);
        this.k = (byte) 0;
        this.l = gy1Var;
        this.m = f32Var;
    }
}
