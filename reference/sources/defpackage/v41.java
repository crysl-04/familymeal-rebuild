package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v41 extends i41 {
    public final /* synthetic */ z41 b;
    public final /* synthetic */ zp0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(z41 z41Var, zp0 zp0Var, String str) {
        super(str);
        this.b = z41Var;
        this.c = zp0Var;
    }

    @Override // defpackage.ze1
    public final af1 c(bf1 bf1Var, List list, long j) {
        z41 z41Var = this.b;
        t41 t41Var = z41Var.o;
        t41Var.h = bf1Var.getLayoutDirection();
        t41Var.i = bf1Var.b();
        t41Var.j = bf1Var.n();
        boolean zU = bf1Var.u();
        zp0 zp0Var = this.c;
        if (zU || z41Var.h.o == null) {
            z41Var.k = 0;
            af1 af1Var = (af1) zp0Var.f(t41Var, new k00(j));
            return new u41(af1Var, z41Var, z41Var.k, af1Var, (byte) 1);
        }
        z41Var.l = 0;
        af1 af1Var2 = (af1) zp0Var.f(z41Var.p, new k00(j));
        return new u41(af1Var2, z41Var, z41Var.l, af1Var2, (byte) 0);
    }
}
