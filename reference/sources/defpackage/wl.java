package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wl extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ d12 o;
    public final /* synthetic */ ry2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl(d12 d12Var, ry2 ry2Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.o = d12Var;
        this.p = ry2Var;
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
        return ((wl) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        switch (this.l) {
            case 0:
                wl wlVar = new wl(this.o, this.p, m10Var, (byte) 0);
                wlVar.n = obj;
                return wlVar;
            default:
                wl wlVar2 = new wl(this.o, this.p, m10Var, (byte) 1);
                wlVar2.n = obj;
                return wlVar2;
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        ry2 ry2Var = this.p;
        d12 d12Var = this.o;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    vl vlVar = new vl((x20) this.n, ry2Var, null);
                    this.m = true;
                    return ou.l(d12Var, vlVar, this) == y20Var ? y20Var : j23Var;
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
                    yl ylVar = new yl((x20) this.n, ry2Var, null);
                    this.m = true;
                    return ((tq2) d12Var).J0(ylVar, this) == y20Var ? y20Var : j23Var;
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
