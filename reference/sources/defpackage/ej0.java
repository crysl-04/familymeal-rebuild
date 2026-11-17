package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ej0 implements sb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ double[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ re1 d;

    public /* synthetic */ ej0(double[] dArr, int i, re1 re1Var, byte b) {
        this.a = b;
        this.b = dArr;
        this.c = i;
        this.d = re1Var;
    }

    @Override // defpackage.sb0
    public final void a(int i, int i2) {
        byte b = this.a;
        re1 re1Var = this.d;
        int i3 = this.c;
        double[] dArr = this.b;
        switch (b) {
            case 0:
                int i4 = i3 * i;
                while (i < i2) {
                    int i5 = 0;
                    while (i5 < i3) {
                        dArr[i4] = re1Var.J(i, i5);
                        i5++;
                        i4++;
                    }
                    i++;
                }
                break;
            default:
                int i6 = i3 * i;
                while (i < i2) {
                    int i7 = 0;
                    while (i7 < i3) {
                        dArr[i6] = re1Var.J(i7, i);
                        i7++;
                        i6++;
                    }
                    i++;
                }
                break;
        }
    }
}
