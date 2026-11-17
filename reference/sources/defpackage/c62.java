package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c62 extends x {
    public int k;
    public double[][] l;
    public e62 m;
    public int n;

    public c62() {
        super(l52.q);
    }

    public final double[][] A0(e1 e1Var, boolean z) {
        int i;
        int i2;
        reset();
        int iZ1 = e1Var.Z1();
        int iT = e1Var.T();
        if (z) {
            i2 = iT;
            i = iZ1;
        } else {
            i = iT;
            i2 = iZ1;
        }
        double[][] dArr = this.l;
        if (dArr != null && this.n == iZ1 && this.k == iT) {
            return dArr;
        }
        e62 e62Var = new e62(i2, i);
        this.m = e62Var;
        double[][] dArr2 = e62Var.h;
        this.l = dArr2;
        this.n = iZ1;
        this.k = iT;
        return dArr2;
    }

    public final void D0(double[][] dArr) {
        this.l = dArr;
        this.n = dArr.length;
        this.k = dArr.length > 0 ? dArr[0].length : 0;
        this.m = dArr.length > 0 ? new e62(dArr, dArr[0].length) : null;
    }

    @Override // defpackage.no2
    public final int T() {
        return this.k;
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.n;
    }
}
