package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lp2 implements sb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lp2(float[] fArr, float[] fArr2, boolean z, int i, float[] fArr3, boolean z2) {
        this.a = (byte) 2;
        this.b = fArr;
        this.d = fArr2;
        this.e = z;
        this.c = i;
        this.g = fArr3;
        this.f = z2;
    }

    @Override // defpackage.sb0
    public final void a(int i, int i2) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                op2.c((vc2[]) obj3, this.c, i, i2, (k1) obj2, this.e, this.f, (uc2) obj);
                break;
            case 1:
                pp2.c((vc2[]) obj3, this.c, i, i2, (k1) obj2, this.e, this.f, (uc2) obj);
                break;
            default:
                boolean z = this.f;
                ni1.d((float[]) obj3, i, i2, (float[]) obj2, this.e, this.c, (float[]) obj, z);
                break;
        }
    }

    public /* synthetic */ lp2(vc2[] vc2VarArr, int i, k1 k1Var, boolean z, boolean z2, uc2 uc2Var, byte b) {
        this.a = b;
        this.b = vc2VarArr;
        this.c = i;
        this.d = k1Var;
        this.e = z;
        this.f = z2;
        this.g = uc2Var;
    }
}
