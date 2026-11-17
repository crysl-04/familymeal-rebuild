package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ lu m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(lu luVar, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.m = luVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        x20 x20Var = (x20) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                ((o) p(m10Var, x20Var)).r(j23Var);
                break;
            default:
                ((o) p(m10Var, x20Var)).r(j23Var);
                break;
        }
        return j23Var;
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        lu luVar = this.m;
        switch (b) {
            case 0:
                return new o(luVar, m10Var, (byte) 0);
            default:
                return new o(luVar, m10Var, (byte) 1);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        m10 m10Var = null;
        lu luVar = this.m;
        switch (b) {
            case 0:
                m02.y(obj);
                if (luVar.K == null) {
                    ut0 ut0Var = new ut0();
                    ui1 ui1Var = luVar.x;
                    if (ui1Var != null) {
                        ie1.p(luVar.x0(), null, new h(ui1Var, ut0Var, m10Var, (byte) 0), 3);
                    }
                    luVar.K = ut0Var;
                }
                break;
            default:
                m02.y(obj);
                ut0 ut0Var2 = luVar.K;
                if (ut0Var2 != null) {
                    vt0 vt0Var = new vt0(ut0Var2);
                    ui1 ui1Var2 = luVar.x;
                    if (ui1Var2 != null) {
                        ie1.p(luVar.x0(), null, new h(ui1Var2, vt0Var, m10Var, (byte) 1), 3);
                    }
                    luVar.K = null;
                }
                break;
        }
        return j23Var;
    }
}
