package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y30 extends mq2 implements zp0 {
    public boolean l;
    public final /* synthetic */ ga2 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ vp0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(m10 m10Var, vp0 vp0Var, ga2 ga2Var, boolean z, boolean z2) {
        super(2, m10Var);
        this.m = ga2Var;
        this.n = z;
        this.o = z2;
        this.p = vp0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((y30) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new y30(m10Var, this.p, this.m, this.n, this.o);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        boolean z = this.l;
        if (z) {
            if (z) {
                m02.y(obj);
                return obj;
            }
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m02.y(obj);
        vp0 vp0Var = this.p;
        ga2 ga2Var = this.m;
        boolean z2 = this.o;
        boolean z3 = this.n;
        a40 a40Var = new a40(null, vp0Var, ga2Var, z2, z3);
        this.l = true;
        Object objL = ga2Var.l(z3, a40Var, this);
        y20 y20Var = y20.h;
        return objL == y20Var ? y20Var : objL;
    }
}
