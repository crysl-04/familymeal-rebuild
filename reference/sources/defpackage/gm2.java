package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gm2 {
    public int[] c;
    public int[] d;
    public int[] i;
    public double[] j;
    public int a = 0;
    public int[] b = null;
    public int[] e = null;
    public int[] f = null;
    public double[] g = null;
    public int h = 0;

    public gm2(int i, int i2) {
        int[] iArr = new int[Math.max(1, i)];
        this.d = iArr;
        this.i = new int[iArr.length + 1];
        int[] iArr2 = new int[Math.max(16, i2)];
        this.c = iArr2;
        this.j = new double[iArr2.length];
    }

    public final void a(int i, double d) {
        int i2 = this.h;
        int[] iArr = this.c;
        if (i2 >= iArr.length) {
            this.c = h7.m0(iArr, i2 + 1);
            this.j = h7.l0(this.h + 1, this.j);
        }
        int[] iArr2 = this.c;
        int i3 = this.h;
        iArr2[i3] = i;
        this.j[i3] = d;
        this.h = i3 + 1;
    }

    public final void b(int i) {
        this.d = h7.m0(this.d, this.a + 1);
        int[] iArrM0 = h7.m0(this.i, this.a + 2);
        this.i = iArrM0;
        int[] iArr = this.d;
        int i2 = this.a;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.a = i3;
        iArrM0[i3] = this.h;
    }
}
