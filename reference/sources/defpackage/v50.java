package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v50 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ b81 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v50(b81 b81Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = b81Var;
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
        return ((v50) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        b81 b81Var = this.n;
        switch (b) {
            case 0:
                return new v50(b81Var, m10Var, (byte) 0);
            default:
                return new v50(b81Var, m10Var, (byte) 1);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        Object obj2 = j23.a;
        b81 b81Var = this.n;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                try {
                    if (!z) {
                        m02.y(obj);
                        int iH = b81Var.h() + 1;
                        this.m = true;
                        if (b81Var.f(iH, this) == y20Var) {
                            obj2 = y20Var;
                        }
                    } else {
                        if (!z) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m02.y(obj);
                    }
                    return obj2;
                } catch (IllegalArgumentException unused) {
                    return obj2;
                }
            default:
                boolean z2 = this.m;
                try {
                    if (!z2) {
                        m02.y(obj);
                        int iH2 = b81Var.h() - 1;
                        this.m = true;
                        if (b81Var.f(iH2, this) == y20Var) {
                            obj2 = y20Var;
                        }
                    } else {
                        if (!z2) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m02.y(obj);
                    }
                    return obj2;
                } catch (IllegalArgumentException unused2) {
                    return obj2;
                }
        }
    }
}
