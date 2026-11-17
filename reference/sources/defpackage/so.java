package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class so extends qg1 implements ko, r31 {
    public x00 v;
    public boolean w;

    public static final r72 J0(so soVar, pn1 pn1Var, h6 h6Var) {
        r72 r72Var;
        if (soVar.u && soVar.w) {
            pn1 pn1VarX = cu.X(soVar);
            if (!pn1Var.V0().u) {
                pn1Var = null;
            }
            if (pn1Var != null && (r72Var = (r72) h6Var.a()) != null) {
                return r72Var.i(pn1VarX.M(pn1Var, false).d());
            }
        }
        return null;
    }

    @Override // defpackage.ko
    public final Object Y(pn1 pn1Var, h6 h6Var, n10 n10Var) {
        Object objX = vs.x(new ro(this, pn1Var, h6Var, new zi((Object) this, (Object) pn1Var, (Object) h6Var, (byte) 2), null), n10Var);
        return objX == y20.h ? objX : j23.a;
    }

    @Override // defpackage.r31
    public final void q(t31 t31Var) {
        this.w = true;
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
