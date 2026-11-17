package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i10 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;

    public /* synthetic */ i10(vp0 vp0Var, boolean z) {
        this.h = (byte) 2;
        this.j = vp0Var;
        this.i = z;
    }

    @Override // defpackage.kp0
    public final Object a() {
        qj1 qj1VarI;
        byte b = this.h;
        j23 j23Var = j23.a;
        boolean z = this.i;
        Object obj = this.j;
        switch (b) {
            case 0:
                kp0 kp0Var = (kp0) obj;
                if (z) {
                    kp0Var.a();
                }
                break;
            case 1:
                c9 c9Var = (c9) obj;
                if (z && (qj1VarI = c9Var.i()) != null) {
                    ((qi2) qj1VarI).q(j23Var);
                }
                break;
            default:
                ((vp0) obj).h(Boolean.valueOf(!z));
                break;
        }
        return j23Var;
    }

    public /* synthetic */ i10(boolean z, Object obj, byte b) {
        this.h = b;
        this.i = z;
        this.j = obj;
    }
}
