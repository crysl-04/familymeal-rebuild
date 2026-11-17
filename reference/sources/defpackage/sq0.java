package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sq0 implements sb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ double[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ double[] e;
    public final /* synthetic */ int f;

    public /* synthetic */ sq0(int i, double[] dArr, int i2, double[] dArr2, int i3, byte b) {
        this.a = b;
        this.b = i;
        this.c = dArr;
        this.d = i2;
        this.e = dArr2;
        this.f = i3;
    }

    @Override // defpackage.sb0
    public final void a(int i, int i2) {
        switch (this.a) {
            case 0:
                tq0.a(this.b, this.c, this.d, this.e, this.f, i, i2);
                return;
            case 1:
                jt1.a(this.b, this.c, this.d, this.e, this.f, i, i2);
                return;
        }
        while (i < i2) {
            int i3 = i * this.f;
            int i4 = this.b;
            double[] dArr = this.c;
            int i5 = this.d;
            double[] dArr2 = this.e;
            rz1.s(false, false, false, i4, dArr, i5, dArr2, i3);
            rz1.s(false, true, false, i4, dArr, i5, dArr2, i3);
            i++;
        }
    }
}
