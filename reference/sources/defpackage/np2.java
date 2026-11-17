package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class np2 implements sb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ k1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ np2(float[] fArr, int i, k1 k1Var, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = fArr;
        this.c = i;
        this.d = k1Var;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.sb0
    public final void a(int i, int i2) {
        switch (this.a) {
            case 0:
                op2.b(this.b, this.c, i, i2, this.d, this.e, this.f);
                break;
            default:
                pp2.b(this.b, this.c, i, i2, this.d, this.e, this.f);
                break;
        }
    }
}
