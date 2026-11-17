package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qv2 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ vp0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qv2(vp0 vp0Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = vp0Var;
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
        return ((qv2) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        vp0 vp0Var = this.n;
        switch (b) {
            case 0:
                return new qv2(vp0Var, m10Var, (byte) 0);
            default:
                return new qv2(vp0Var, m10Var, (byte) 1);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        vp0 vp0Var = this.n;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    this.m = true;
                    if (vp0Var.h(this) == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                return j23.a;
            default:
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    this.m = true;
                    Object objH = vp0Var.h(this);
                    return objH == y20Var ? y20Var : objH;
                }
                if (z2) {
                    m02.y(obj);
                    return obj;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
