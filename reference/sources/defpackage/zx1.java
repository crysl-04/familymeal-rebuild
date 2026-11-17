package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zx1 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ ay1 n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zx1(ay1 ay1Var, String str, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = ay1Var;
        this.o = str;
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
        return ((zx1) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        String str = this.o;
        ay1 ay1Var = this.n;
        switch (b) {
            case 0:
                return new zx1(ay1Var, str, m10Var, (byte) 0);
            default:
                return new zx1(ay1Var, str, m10Var, (byte) 1);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        String str = this.o;
        y20 y20Var = y20.h;
        ay1 ay1Var = this.n;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    tw1 tw1Var = ay1Var.b;
                    this.m = true;
                    if (tw1Var.b(str, this) == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                ay1Var.u.setValue(Boolean.TRUE);
                return j23Var;
            default:
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    tw1 tw1Var2 = ay1Var.b;
                    this.m = true;
                    obj = tw1Var2.d(str, this);
                    if (obj == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z2) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                dy1 dy1Var = (dy1) obj;
                if (dy1Var == null) {
                    return j23Var;
                }
                Double d = dy1Var.f;
                String strM = d != null ? t03.M(d.doubleValue()) : null;
                if (strM == null) {
                    strM = "";
                }
                ay1Var.k.setValue(strM);
                ay1Var.v = dy1Var.m;
                ay1Var.w = dy1Var.n;
                return j23Var;
        }
    }
}
