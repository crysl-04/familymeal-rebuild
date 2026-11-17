package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a90 implements k1, dk1 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ oj2 k;

    public /* synthetic */ a90(oj2 oj2Var, int i, int i2, byte b) {
        this.h = b;
        this.i = i;
        this.j = i2;
        this.k = oj2Var;
    }

    @Override // defpackage.k1
    public final Comparable H(long j, long j2) {
        return Double.valueOf(y1(j, j2));
    }

    @Override // defpackage.k1
    public final double J(int i, int i2) {
        byte b = this.h;
        oj2 oj2Var = this.k;
        switch (b) {
            case 0:
                return ((d90) oj2Var).G[i][i2];
            default:
                return ((um2) oj2Var).E[i].A(i2);
        }
    }

    @Override // defpackage.no2
    public final int T() {
        byte b = this.h;
        oj2 oj2Var = this.k;
        switch (b) {
            case 0:
                return ((d90) oj2Var).u.h();
            default:
                return ((um2) oj2Var).u.h();
        }
    }

    @Override // defpackage.no2
    public final int Z1() {
        byte b = this.h;
        oj2 oj2Var = this.k;
        switch (b) {
            case 0:
                return ((d90) oj2Var).s;
            default:
                return ((um2) oj2Var).s;
        }
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        byte b = this.h;
        int i3 = this.j;
        int i4 = this.i;
        oj2 oj2Var = this.k;
        switch (b) {
            case 0:
                d90 d90Var = (d90) oj2Var;
                d90Var.G[i][i2] = d;
                if (i >= i4 && i2 < i3) {
                    double[] dArr = d90Var.F;
                    dArr[i2] = dArr[i2] - d;
                    break;
                }
                break;
            default:
                um2 um2Var = (um2) oj2Var;
                um2Var.E[i].o(i2, d);
                if (i >= i4 && i2 < i3) {
                    um2Var.G.f(i2, -d);
                    break;
                }
                break;
        }
    }

    public final String toString() {
        return k1.l0(this);
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        Y1(j, j2, xo1.c1(comparable));
    }
}
