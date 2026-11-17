package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uu2 extends mq2 implements zp0 {
    public final /* synthetic */ byte l = 1;
    public boolean m;
    public final /* synthetic */ boolean n;
    public Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu2(p63 p63Var, ez1 ez1Var, String str, boolean z, m10 m10Var) {
        super(2, m10Var);
        this.o = p63Var;
        this.p = ez1Var;
        this.q = str;
        this.n = z;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        x20 x20Var = (x20) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((uu2) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (b) {
            case 0:
                return new uu2((sj1) obj3, this.n, (ui1) obj2, m10Var);
            default:
                return new uu2((p63) this.o, (ez1) obj3, (String) obj2, this.n, m10Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        Object objP;
        byte b = this.l;
        boolean z = this.n;
        Object obj2 = this.q;
        Object obj3 = this.p;
        y20 y20Var = y20.h;
        j23 j23Var = j23.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                sj1 sj1Var = (sj1) obj3;
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    m22 m22Var = (m22) sj1Var.getValue();
                    if (m22Var != null) {
                        ui1 ui1Var = (ui1) obj2;
                        gz0 n22Var = z ? new n22(m22Var) : new l22(m22Var);
                        if (ui1Var != null) {
                            this.o = sj1Var;
                            this.m = true;
                            if (ui1Var.b(n22Var, this) == y20Var) {
                                return y20Var;
                            }
                        }
                    }
                    return j23Var;
                }
                if (!z2) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sj1Var = (sj1) this.o;
                m02.y(obj);
                sj1Var.setValue(null);
                return j23Var;
            default:
                boolean z3 = this.m;
                if (!z3) {
                    m02.y(obj);
                    kz1 kz1Var = ((p63) this.o).b;
                    String str = ((ez1) obj3).a.a;
                    String str2 = (String) obj2;
                    this.m = true;
                    vy1 vy1VarP = kz1Var.a.p();
                    if (z) {
                        objP = cu.P(this, new uy1(vy1VarP, new vi2(str, str2), b2), vy1VarP.a, false, true);
                        if (objP != y20Var) {
                            objP = j23Var;
                        }
                        if (objP != y20Var) {
                            objP = j23Var;
                        }
                    } else {
                        objP = cu.P(this, new o40(str, str2, (byte) 1), vy1VarP.a, false, true);
                        if (objP != y20Var) {
                            objP = j23Var;
                        }
                        if (objP != y20Var) {
                            objP = j23Var;
                        }
                    }
                    if (objP == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z3) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                return j23Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu2(sj1 sj1Var, boolean z, ui1 ui1Var, m10 m10Var) {
        super(2, m10Var);
        this.p = sj1Var;
        this.n = z;
        this.q = ui1Var;
    }
}
