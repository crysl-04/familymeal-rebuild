package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oq0 implements sb0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ double b;
    public final /* synthetic */ double[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ double f;
    public final /* synthetic */ double[] g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ double[] j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ oq0(double d, double[] dArr, int i, int i2, double d2, double[] dArr2, int i3, int i4, double[] dArr3, int i5, int i6) {
        this.b = d;
        this.c = dArr;
        this.d = i;
        this.e = i2;
        this.f = d2;
        this.g = dArr2;
        this.h = i3;
        this.i = i4;
        this.j = dArr3;
        this.k = i5;
        this.l = i6;
    }

    @Override // defpackage.sb0
    public final void a(int i, int i2) {
        switch (this.a) {
            case 0:
                int i3 = this.h;
                int i4 = (i * i3) + this.e;
                int i5 = this.l + i;
                pq0.d(this.d, i2 - i, this.b, this.c, i4, i3, this.g, this.i, this.k, this.f, this.j, i5, 1);
                break;
            default:
                int i6 = i2 - i;
                int i7 = this.d + i;
                double d = this.b;
                double[] dArr = this.c;
                p02.I(i6, d, dArr, i7, 1);
                pq0.c(i6, this.e, this.f, this.g, this.h + i, this.i, this.j, this.k, this.l, dArr, i7, 1);
                break;
        }
    }

    public /* synthetic */ oq0(int i, double d, double[] dArr, int i2, int i3, double[] dArr2, int i4, int i5, double d2, double[] dArr3, int i6) {
        this.d = i;
        this.b = d;
        this.c = dArr;
        this.e = i2;
        this.h = i3;
        this.g = dArr2;
        this.i = i4;
        this.k = i5;
        this.f = d2;
        this.j = dArr3;
        this.l = i6;
    }
}
