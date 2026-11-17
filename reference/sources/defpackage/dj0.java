package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dj0 implements sb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dj0(vc2[] vc2VarArr, int i, k1 k1Var, uc2 uc2Var) {
        this.a = (byte) 0;
        this.b = vc2VarArr;
        this.c = i;
        this.d = k1Var;
        this.e = uc2Var;
    }

    @Override // defpackage.sb0
    public final void a(int i, int i2) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                gj0.b((vc2[]) obj3, this.c, i, i2, (k1) obj2, (uc2) obj);
                break;
            case 1:
                ni1.b((vc2[]) obj3, i, i2, (vc2[]) obj2, this.c, (vc2[]) obj);
                break;
            default:
                ni1.a((float[]) obj3, i, i2, (float[]) obj2, this.c, (float[]) obj);
                break;
        }
    }

    public /* synthetic */ dj0(byte b, int i, Object obj, Object obj2, Object obj3) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = i;
        this.e = obj3;
    }
}
