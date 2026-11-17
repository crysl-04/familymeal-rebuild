package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hs extends mq2 implements zp0 {
    public final /* synthetic */ byte l = 0;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ks o;
    public final /* synthetic */ qk0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(ks ksVar, qk0 qk0Var, Object obj, m10 m10Var) {
        super(2, m10Var);
        this.o = ksVar;
        this.p = qk0Var;
        this.n = obj;
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
        return ((hs) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        qk0 qk0Var = this.p;
        ks ksVar = this.o;
        switch (b) {
            case 0:
                return new hs(ksVar, qk0Var, this.n, m10Var);
            default:
                hs hsVar = new hs(ksVar, qk0Var, m10Var);
                hsVar.n = obj;
                return hsVar;
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
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
                aq0 aq0Var = this.o.l;
                Object obj2 = this.n;
                this.m = true;
                return aq0Var.c(this.p, obj2, this) == y20Var ? y20Var : j23Var;
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
                x20 x20Var = (x20) this.n;
                x72 x72Var = new x72();
                ks ksVar = this.o;
                pk0 pk0Var = ksVar.k;
                js jsVar = new js(x72Var, x20Var, ksVar, this.p, (byte) 0);
                this.m = true;
                return pk0Var.a(jsVar, this) == y20Var ? y20Var : j23Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(ks ksVar, qk0 qk0Var, m10 m10Var) {
        super(2, m10Var);
        this.o = ksVar;
        this.p = qk0Var;
    }
}
