package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u50 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u50(Object obj, int i, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.o = obj;
        this.n = i;
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
        return ((u50) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        int i = this.n;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                return new u50((b81) obj2, i, m10Var, (byte) 0);
            default:
                return new u50((m71) obj2, i, m10Var, (byte) 1);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        int i = this.n;
        Object obj2 = this.o;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                b81 b81Var = (b81) obj2;
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
                if (b81Var.j.b() || b81Var.h() == i) {
                    return j23Var;
                }
                this.m = true;
                return b81.l(b81Var, i, this) == y20Var ? y20Var : j23Var;
            default:
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    h71 h71Var = ((m71) obj2).w;
                    this.m = true;
                    return h71Var.b(i, this) == y20Var ? y20Var : j23Var;
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
