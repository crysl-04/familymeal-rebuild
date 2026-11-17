package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class op extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ ui1 n;
    public final /* synthetic */ ll2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op(ui1 ui1Var, ll2 ll2Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = ui1Var;
        this.o = ll2Var;
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
        return ((op) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        switch (this.l) {
            case 0:
                return new op(this.n, this.o, m10Var, (byte) 0);
            default:
                return new op(this.n, this.o, m10Var, (byte) 1);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) throws Throwable {
        byte b = this.l;
        ll2 ll2Var = this.o;
        ui1 ui1Var = this.n;
        j23 j23Var = j23.a;
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
                qi2 qi2Var = ui1Var.a;
                np npVar = new np(ll2Var, (byte) 0);
                this.m = true;
                qi2.j(qi2Var, npVar, this);
                return y20Var;
            default:
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
                qi2 qi2Var2 = ui1Var.a;
                np npVar2 = new np(ll2Var, (byte) 1);
                this.m = true;
                qi2.j(qi2Var2, npVar2, this);
                return y20Var;
        }
    }
}
