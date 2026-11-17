package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t50 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ o60 i;

    public /* synthetic */ t50(o60 o60Var, byte b) {
        this.h = b;
        this.i = o60Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        o60 o60Var = this.i;
        switch (b) {
            case 0:
                hq hqVar = o60Var.c;
                ab0 ab0Var = (ab0) obj;
                int i = ab0Var.a;
                Long lB = o60Var.b();
                if (lB != null) {
                    iq iqVarB = hqVar.b(hqVar.b(lB.longValue()).e);
                    if (o60Var.a.c(iqVarB.a)) {
                        o60Var.e.setValue(iqVarB);
                    }
                }
                o60Var.g.setValue(ab0Var);
                break;
            case 1:
                Long l = (Long) obj;
                lu1 lu1Var = o60Var.f;
                if (l == null) {
                    lu1Var.setValue(null);
                } else {
                    dq dqVarA = o60Var.c.a(l.longValue());
                    lu1Var.setValue(o60Var.a.c(dqVarA.h) ? dqVarA : null);
                }
                break;
            default:
                iq iqVarB2 = o60Var.c.b(((Long) obj).longValue());
                if (o60Var.a.c(iqVarB2.a)) {
                    o60Var.e.setValue(iqVarB2);
                }
                break;
        }
        return j23Var;
    }
}
