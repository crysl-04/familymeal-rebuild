package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i70 implements ue1 {
    public final /* synthetic */ byte h;
    public final ue1 i;
    public final Enum j;
    public final Enum k;

    public /* synthetic */ i70(ue1 ue1Var, Enum r2, Enum r3, byte b) {
        this.h = b;
        this.i = ue1Var;
        this.j = r2;
        this.k = r3;
    }

    @Override // defpackage.ue1
    public final int U(int i) {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.i.U(i);
    }

    @Override // defpackage.ue1
    public final int a0(int i) {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.i.a0(i);
    }

    @Override // defpackage.ue1
    public final int d0(int i) {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.i.d0(i);
    }

    @Override // defpackage.ue1
    public final ny1 e(long j) {
        byte b = this.h;
        Enum r1 = this.j;
        Enum r2 = this.k;
        ue1 ue1Var = this.i;
        switch (b) {
            case 0:
                rz0 rz0Var = (rz0) r2;
                oz0 oz0Var = (oz0) r1;
                rz0 rz0Var2 = rz0.h;
                oz0 oz0Var2 = oz0.i;
                if (rz0Var == rz0Var2) {
                    return new rj0(oz0Var == oz0Var2 ? ue1Var.a0(k00.h(j)) : ue1Var.U(k00.h(j)), k00.d(j) ? k00.h(j) : 32767, (byte) 0);
                }
                return new rj0(k00.e(j) ? k00.i(j) : 32767, oz0Var == oz0Var2 ? ue1Var.g(k00.i(j)) : ue1Var.d0(k00.i(j)), (byte) 0);
            case 1:
                ef1 ef1Var = (ef1) r2;
                df1 df1Var = (df1) r1;
                ef1 ef1Var2 = ef1.h;
                df1 df1Var2 = df1.i;
                if (ef1Var == ef1Var2) {
                    return new rj0(df1Var == df1Var2 ? ue1Var.a0(k00.h(j)) : ue1Var.U(k00.h(j)), k00.d(j) ? k00.h(j) : 32767, (byte) 1);
                }
                return new rj0(k00.e(j) ? k00.i(j) : 32767, df1Var == df1Var2 ? ue1Var.g(k00.i(j)) : ue1Var.d0(k00.i(j)), (byte) 1);
            default:
                yn1 yn1Var = (yn1) r2;
                xn1 xn1Var = (xn1) r1;
                yn1 yn1Var2 = yn1.h;
                xn1 xn1Var2 = xn1.i;
                if (yn1Var == yn1Var2) {
                    return new rj0(xn1Var == xn1Var2 ? ue1Var.a0(k00.h(j)) : ue1Var.U(k00.h(j)), k00.d(j) ? k00.h(j) : 32767, (byte) 2);
                }
                return new rj0(k00.e(j) ? k00.i(j) : 32767, xn1Var == xn1Var2 ? ue1Var.g(k00.i(j)) : ue1Var.d0(k00.i(j)), (byte) 2);
        }
    }

    @Override // defpackage.ue1
    public final int g(int i) {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.i.g(i);
    }

    @Override // defpackage.ue1
    public final Object l() {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.i.l();
    }
}
