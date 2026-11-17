package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ ui1 n;
    public final /* synthetic */ m22 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m22 m22Var, ui1 ui1Var, m10 m10Var) {
        super(2, m10Var);
        this.l = (byte) 0;
        this.o = m22Var;
        this.n = ui1Var;
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
        }
        return ((l) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        m22 m22Var = this.o;
        ui1 ui1Var = this.n;
        switch (b) {
            case 0:
                return new l(m22Var, ui1Var, m10Var);
            case 1:
                return new l(ui1Var, m22Var, m10Var, (byte) 1);
            default:
                return new l(ui1Var, m22Var, m10Var, (byte) 2);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        m22 m22Var = this.o;
        ui1 ui1Var = this.n;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    n22 n22Var = new n22(m22Var);
                    this.m = true;
                    return ui1Var.b(n22Var, this) == y20Var ? y20Var : j23Var;
                }
                if (z) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    this.m = true;
                    return ui1Var.b(m22Var, this) == y20Var ? y20Var : j23Var;
                }
                if (z2) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.m;
                if (!z3) {
                    m02.y(obj);
                    this.m = true;
                    return ui1Var.b(m22Var, this) == y20Var ? y20Var : j23Var;
                }
                if (z3) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(ui1 ui1Var, m22 m22Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = ui1Var;
        this.o = m22Var;
    }
}
