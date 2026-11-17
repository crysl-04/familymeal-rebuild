package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ji1 implements sb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ double[][] b;
    public final /* synthetic */ double[][] c;
    public final /* synthetic */ double[][] d;

    public /* synthetic */ ji1(double[][] dArr, double[][] dArr2, double[][] dArr3, byte b) {
        this.a = b;
        this.b = dArr;
        this.c = dArr2;
        this.d = dArr3;
    }

    @Override // defpackage.sb0
    public final void a(int i, int i2) {
        byte b = this.a;
        double[][] dArr = this.d;
        double[][] dArr2 = this.c;
        double[][] dArr3 = this.b;
        switch (b) {
            case 0:
                for (int i3 = i; i3 < i2; i3++) {
                    double[] dArr4 = dArr3[i3];
                    double[] dArr5 = dArr2[i3];
                    int length = dArr5.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        double d = dArr5[i4];
                        double[] dArr6 = dArr[i4];
                        aa3.w(dArr4, 0, d, dArr6, 0, 0, Math.min(dArr4.length, dArr6.length));
                    }
                }
                break;
            default:
                for (int i5 = i; i5 < i2; i5++) {
                    double[] dArr7 = dArr3[i5];
                    lt.v(0.0d, dArr7.length, dArr7);
                    double[] dArr8 = dArr2[i5];
                    int length2 = dArr8.length;
                    for (int i6 = 0; i6 < length2; i6++) {
                        double d2 = dArr8[i6];
                        double[] dArr9 = dArr[i6];
                        aa3.w(dArr7, 0, d2, dArr9, 0, 0, Math.min(dArr7.length, dArr9.length));
                    }
                }
                break;
        }
    }
}
