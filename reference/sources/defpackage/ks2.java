package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ks2 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ aq0 n;
    public final /* synthetic */ k22 o;
    public final /* synthetic */ z02 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ks2(aq0 aq0Var, k22 k22Var, z02 z02Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = aq0Var;
        this.o = k22Var;
        this.p = z02Var;
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
        return ((ks2) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        switch (this.l) {
            case 0:
                return new ks2(this.n, this.o, this.p, m10Var, (byte) 0);
            default:
                return new ks2(this.n, this.o, this.p, m10Var, (byte) 1);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        z02 z02Var = this.p;
        k22 k22Var = this.o;
        aq0 aq0Var = this.n;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    up1 up1Var = new up1(z02Var.c);
                    this.m = true;
                    return aq0Var.c(k22Var, up1Var, this) == y20Var ? y20Var : j23Var;
                }
                if (z) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    up1 up1Var2 = new up1(z02Var.c);
                    this.m = true;
                    return aq0Var.c(k22Var, up1Var2, this) == y20Var ? y20Var : j23Var;
                }
                if (z2) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
