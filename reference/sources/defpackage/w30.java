package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w30 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ vu1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w30(m10 m10Var, vu1 vu1Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.o = vu1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        ru1 ru1Var = (ru1) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((w30) p(m10Var, ru1Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        switch (this.l) {
            case 0:
                w30 w30Var = new w30(m10Var, this.o, (byte) 0);
                w30Var.n = obj;
                return w30Var;
            default:
                w30 w30Var2 = new w30(m10Var, this.o, (byte) 1);
                w30Var2.n = obj;
                return w30Var2;
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        vu1 vu1Var = this.o;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (z) {
                    if (z) {
                        m02.y(obj);
                        return obj;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                this.m = true;
                Object objH = vu1Var.h(this);
                return objH == y20Var ? y20Var : objH;
            default:
                boolean z2 = this.m;
                if (z2) {
                    if (z2) {
                        m02.y(obj);
                        return obj;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                this.m = true;
                Object objH2 = vu1Var.h(this);
                return objH2 == y20Var ? y20Var : objH2;
        }
    }
}
