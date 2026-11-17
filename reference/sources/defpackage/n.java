package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ lu n;
    public final /* synthetic */ m22 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(lu luVar, m22 m22Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = luVar;
        this.o = m22Var;
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
            case 1:
                break;
            case 2:
                break;
        }
        return ((n) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        m22 m22Var = this.o;
        lu luVar = this.n;
        switch (b) {
            case 0:
                return new n(luVar, m22Var, m10Var, (byte) 0);
            case 1:
                return new n(luVar, m22Var, m10Var, (byte) 1);
            case 2:
                return new n(luVar, m22Var, m10Var, (byte) 2);
            default:
                return new n(luVar, m22Var, m10Var, (byte) 3);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        m22 m22Var = this.o;
        lu luVar = this.n;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (z) {
                    if (z) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                ui1 ui1Var = luVar.x;
                if (ui1Var == null) {
                    return j23Var;
                }
                l22 l22Var = new l22(m22Var);
                this.m = true;
                return ui1Var.b(l22Var, this) == y20Var ? y20Var : j23Var;
            case 1:
                boolean z2 = this.m;
                if (z2) {
                    if (z2) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                ui1 ui1Var2 = luVar.x;
                if (ui1Var2 == null) {
                    return j23Var;
                }
                l22 l22Var2 = new l22(m22Var);
                this.m = true;
                return ui1Var2.b(l22Var2, this) == y20Var ? y20Var : j23Var;
            case 2:
                boolean z3 = this.m;
                if (z3) {
                    if (z3) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                ui1 ui1Var3 = luVar.x;
                if (ui1Var3 == null) {
                    return j23Var;
                }
                this.m = true;
                return ui1Var3.b(m22Var, this) == y20Var ? y20Var : j23Var;
            default:
                boolean z4 = this.m;
                if (z4) {
                    if (z4) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                ui1 ui1Var4 = luVar.x;
                if (ui1Var4 == null) {
                    return j23Var;
                }
                n22 n22Var = new n22(m22Var);
                this.m = true;
                return ui1Var4.b(n22Var, this) == y20Var ? y20Var : j23Var;
        }
    }
}
