package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ki0 implements g01 {
    public final x51 h;
    public double[] i;
    public final k52 j;
    public final wk k;
    public final g2 l;
    public final mm2 m;
    public final double[] n;
    public final double[] o;

    public ki0(wk wkVar, g2 g2Var, mm2 mm2Var, x51 x51Var, k52 k52Var, double[] dArr) {
        int i = k52Var.h;
        this.k = wkVar;
        this.l = g2Var;
        this.m = mm2Var;
        this.h = x51Var;
        this.j = k52Var;
        this.i = dArr;
        this.n = new double[i];
        this.o = new double[i];
    }

    @Override // defpackage.no2
    public final int T() {
        return this.j.h;
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.j.j;
    }

    @Override // defpackage.g01
    public final void x1(double[] dArr) {
        double[] dArr2;
        ly1 ly1Var = (ly1) this.l.i;
        int[] iArr = ly1Var.c;
        double[] dArr3 = this.n;
        int iMin = Math.min(dArr3.length, iArr.length);
        for (int i = 0; i < iMin; i++) {
            dArr3[i] = dArr[iArr[i]];
        }
        this.m.x1(dArr3);
        int[] iArr2 = ly1Var.c;
        int iMin2 = Math.min(iArr2.length, dArr3.length);
        int i2 = 0;
        while (true) {
            dArr2 = this.o;
            if (i2 >= iMin2) {
                break;
            }
            dArr2[iArr2[i2]] = dArr3[i2];
            i2++;
        }
        int length = this.i.length;
        int length2 = dArr3.length - length;
        System.arraycopy(dArr2, 0, dArr, 0, length2);
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = length2 + i3;
            dArr[i4] = (this.i[i3] * dArr2[i4]) + dArr[i4];
        }
    }
}
