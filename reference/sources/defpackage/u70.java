package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u70 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ kn2 i;

    public /* synthetic */ u70(kn2 kn2Var, byte b) {
        this.h = b;
        this.i = kn2Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        kn2 kn2Var = this.i;
        switch (b) {
            case 0:
                td0 td0Var = (td0) obj;
                long j = ((kv) kn2Var.getValue()).a;
                if (!r13.a(j, kv.g)) {
                    td0.H(td0Var, j, 0L, 126);
                }
                break;
            default:
                ((j92) obj).c(((Number) kn2Var.getValue()).floatValue());
                break;
        }
        return j23Var;
    }
}
