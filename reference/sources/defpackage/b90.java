package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b90 extends r22 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ a1 j;

    public /* synthetic */ b90(a1 a1Var, int i, byte b) {
        this.h = b;
        this.i = i;
        this.j = a1Var;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        byte b = this.h;
        a1 a1Var = this.j;
        switch (b) {
            case 0:
                d90 d90Var = (d90) a1Var;
                return d90Var.G[i][d90Var.t];
            case 1:
                return ((gs1) a1Var).l.A(i);
            case 2:
                return ((oj2) a1Var).J(this.i, i);
            default:
                return ((um2) a1Var).I.A(i);
        }
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        byte b = this.h;
        int i2 = this.i;
        a1 a1Var = this.j;
        switch (b) {
            case 0:
                d90 d90Var = (d90) a1Var;
                int i3 = d90Var.t;
                double[][] dArr = d90Var.G;
                if (d90Var.u.b > 0) {
                    dArr[i][(i3 - d90Var.s) + i] = h32.b;
                }
                dArr[i][i3] = d;
                if (i >= i2) {
                    double[] dArr2 = d90Var.F;
                    dArr2[i3] = dArr2[i3] - d;
                    return;
                }
                return;
            case 1:
                throw new IllegalArgumentException();
            case 2:
                ((oj2) a1Var).b0(d, i2, i);
                return;
            default:
                um2 um2Var = (um2) a1Var;
                if (um2Var.u.b > 0) {
                    um2Var.E[i].o((um2Var.t - um2Var.s) + i, h32.b);
                }
                um2Var.I.o(i, d);
                if (i >= i2) {
                    um2Var.H -= d;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.mo2
    public final int size() {
        byte b = this.h;
        a1 a1Var = this.j;
        switch (b) {
            case 0:
                return ((d90) a1Var).s;
            case 1:
                return this.i;
            case 2:
                return ((oj2) a1Var).T();
            default:
                return ((um2) a1Var).s;
        }
    }
}
