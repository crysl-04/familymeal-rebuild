package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v10 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ p81 i;

    public /* synthetic */ v10(p81 p81Var, byte b) {
        this.h = b;
        this.i = p81Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        p81 p81Var = this.i;
        switch (b) {
            case 0:
                t31 t31Var = (t31) obj;
                kw2 kw2VarD = p81Var.d();
                if (kw2VarD != null) {
                    kw2VarD.c = t31Var;
                }
                return j23Var;
            case 1:
                lu1 lu1Var = p81Var.t;
                vv2 vv2Var = (vv2) obj;
                String str = vv2Var.a.i;
                od odVar = p81Var.j;
                if (!uz0.g(str, odVar != null ? odVar.i : null)) {
                    p81Var.k.setValue(qs0.h);
                    if (((Boolean) lu1Var.getValue()).booleanValue()) {
                        lu1Var.setValue(Boolean.FALSE);
                    } else {
                        p81Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = qw2.b;
                p81Var.f(j);
                p81Var.e(j);
                p81Var.u.h(vv2Var);
                e72 e72Var = p81Var.b;
                oz ozVar = e72Var.a;
                if (ozVar != null) {
                    ozVar.s(e72Var, null);
                }
                return j23Var;
            case 2:
                p81Var.r.C(((mu0) obj).a);
                return j23Var;
            case 3:
                return Boolean.valueOf(p81Var.r.C(((mu0) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                p81Var.q.setValue(bool);
                return j23Var;
        }
    }
}
