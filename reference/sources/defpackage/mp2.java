package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mp2 implements sb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ double[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ k1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ mp2(double[] dArr, int i, k1 k1Var, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = dArr;
        this.c = i;
        this.d = k1Var;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.sb0
    public final void a(int i, int i2) {
        switch (this.a) {
            case 0:
                op2.a(this.b, this.c, i, i2, this.d, this.e, this.f);
                break;
            default:
                pp2.a(this.b, this.c, i, i2, this.d, this.e, this.f);
                break;
        }
    }
}
