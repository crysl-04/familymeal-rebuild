package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o92 implements yb0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ s92 i;

    public /* synthetic */ o92(s92 s92Var, byte b) {
        this.h = b;
        this.i = s92Var;
    }

    @Override // defpackage.yb0
    public final double a(double d) {
        byte b = this.h;
        s92 s92Var = this.i;
        switch (b) {
            case 0:
                return cy1.l(s92Var.k.a(d), s92Var.e, s92Var.f);
            default:
                return s92Var.n.a(cy1.l(d, s92Var.e, s92Var.f));
        }
    }
}
