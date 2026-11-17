package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c90 extends r22 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ d90 i;

    public /* synthetic */ c90(d90 d90Var, byte b) {
        this.h = b;
        this.i = d90Var;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        byte b = this.h;
        d90 d90Var = this.i;
        switch (b) {
            case 0:
                return d90Var.G[d90Var.s][i];
            default:
                return d90Var.F[i];
        }
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        byte b = this.h;
        d90 d90Var = this.i;
        switch (b) {
            case 0:
                d90Var.G[d90Var.s][i] = d;
                break;
            default:
                d90Var.F[i] = d;
                break;
        }
    }

    @Override // defpackage.mo2
    public final int size() {
        byte b = this.h;
        d90 d90Var = this.i;
        switch (b) {
            case 0:
                break;
        }
        return d90Var.u.d();
    }
}
