package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tm2 extends r22 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ um2 i;

    public /* synthetic */ tm2(um2 um2Var, byte b) {
        this.h = b;
        this.i = um2Var;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        byte b = this.h;
        um2 um2Var = this.i;
        switch (b) {
            case 0:
                return um2Var.F.A(i);
            default:
                return um2Var.G.j[i];
        }
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        byte b = this.h;
        um2 um2Var = this.i;
        switch (b) {
            case 0:
                um2Var.F.o(i, d);
                break;
            default:
                um2Var.G.j[i] = d;
                break;
        }
    }

    @Override // defpackage.mo2
    public final int size() {
        byte b = this.h;
        um2 um2Var = this.i;
        switch (b) {
            case 0:
                break;
        }
        return um2Var.u.d();
    }
}
