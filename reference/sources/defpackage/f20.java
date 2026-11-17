package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class f20 extends mq2 implements zp0 {
    public /* synthetic */ Object l;
    public final /* synthetic */ d12 m;
    public final /* synthetic */ zt2 n;
    public final /* synthetic */ kv2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f20(d12 d12Var, zt2 zt2Var, kv2 kv2Var, m10 m10Var) {
        super(2, m10Var);
        this.m = d12Var;
        this.n = zt2Var;
        this.o = kv2Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        f20 f20Var = (f20) p((m10) obj2, (x20) obj);
        j23 j23Var = j23.a;
        f20Var.r(j23Var);
        return j23Var;
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        f20 f20Var = new f20(this.m, this.n, this.o, m10Var);
        f20Var.l = obj;
        return f20Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        m02.y(obj);
        x20 x20Var = (x20) this.l;
        d12 d12Var = this.m;
        m10 m10Var = null;
        ie1.p(x20Var, null, new e20(d12Var, this.n, m10Var, (byte) 0), 1);
        ie1.p(x20Var, null, new h(d12Var, this.o, m10Var, (byte) 13), 1);
        return j23.a;
    }
}
