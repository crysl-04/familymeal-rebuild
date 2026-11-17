package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj0 implements sb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fj0(byte b, int i, Object obj, Object obj2) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // defpackage.sb0
    public final void a(int i, int i2) {
        byte b = this.a;
        Object obj = this.d;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                float[] fArr = (float[]) obj2;
                re1 re1Var = (re1) obj;
                int i4 = i3 * i;
                while (i < i2) {
                    int i5 = 0;
                    while (i5 < i3) {
                        fArr[i4] = (float) re1Var.J(i5, i);
                        i5++;
                        i4++;
                    }
                    i++;
                }
                break;
            case 1:
                Comparable[] comparableArr = (Comparable[]) obj2;
                c23 c23Var = (c23) obj;
                int i6 = i3 * i2;
                for (int i7 = i * i3; i7 < i6; i7++) {
                    comparableArr[i7] = c23Var.b(comparableArr[i7]);
                }
                break;
            default:
                double[] dArr = (double[]) obj2;
                ys.K(dArr, i3 * i, i3 * i2, 1, dArr, (c23) obj);
                break;
        }
    }
}
