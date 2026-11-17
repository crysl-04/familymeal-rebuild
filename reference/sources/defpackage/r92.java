package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r92 extends m31 implements vp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ s92 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r92(s92 s92Var, byte b) {
        super(1);
        this.i = b;
        this.j = s92Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.i;
        s92 s92Var = this.j;
        switch (b) {
            case 0:
                return Double.valueOf(s92Var.n.a(cy1.l(((Number) obj).doubleValue(), s92Var.e, s92Var.f)));
            default:
                return Double.valueOf(cy1.l(s92Var.k.a(((Number) obj).doubleValue()), s92Var.e, s92Var.f));
        }
    }
}
