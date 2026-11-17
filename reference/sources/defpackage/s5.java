package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s5 implements mo2 {
    public final double[] h;
    public final double[] i;

    public s5(no2 no2Var) {
        int iZ1 = no2Var.Z1();
        this.h = new double[no2Var.T()];
        this.i = new double[iZ1];
    }

    public final gs1 j(double d, is1 is1Var, boolean z) {
        gs1 gs1Var = new gs1(is1Var, d, new xh(this.h));
        if ((is1Var.c() || z) && r10.m(is1Var) && this.i.length > 0) {
            gs1Var.i = new k5(this, (byte) 1);
        }
        return gs1Var;
    }

    @Override // defpackage.mo2
    public final int size() {
        return this.i.length;
    }

    public s5(int i) {
        this.i = new double[i];
        this.h = new double[i];
    }
}
