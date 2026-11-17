package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ku2 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ oz2 i;

    public /* synthetic */ ku2(oz2 oz2Var, byte b) {
        this.h = b;
        this.i = oz2Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        oz2 oz2Var = this.i;
        j92 j92Var = (j92) obj;
        switch (b) {
            case 0:
                j92Var.c(((Number) oz2Var.q.getValue()).floatValue());
                break;
            default:
                j92Var.c(((Number) oz2Var.q.getValue()).floatValue());
                break;
        }
        return j23Var;
    }
}
