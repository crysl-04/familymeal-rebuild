package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fv2 extends mq2 implements zp0 {
    public boolean l;
    public final /* synthetic */ kv2 m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv2(kv2 kv2Var, boolean z, m10 m10Var) {
        super(2, m10Var);
        this.m = kv2Var;
        this.n = z;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((fv2) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new fv2(this.m, this.n, m10Var);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        pu puVar;
        boolean z = this.l;
        od odVarP = null;
        j23 j23Var = j23.a;
        if (z) {
            if (z) {
                m02.y(obj);
                return j23Var;
            }
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m02.y(obj);
        kv2 kv2Var = this.m;
        if (!qw2.c(kv2Var.l().b)) {
            odVarP = pz1.p(kv2Var.l());
            if (this.n) {
                int iE = qw2.e(kv2Var.l().b);
                kv2Var.c.h(kv2.b(kv2Var.l().a, m02.a(iE, iE)));
                kv2Var.r(qs0.h);
            }
        }
        if (odVarP != null && (puVar = kv2Var.g) != null) {
            nu nuVarD0 = es.d0(odVarP);
            this.l = true;
            ((c6) puVar).a.E().setPrimaryClip(nuVarD0.a);
            y20 y20Var = y20.h;
            if (j23Var == y20Var) {
                return y20Var;
            }
        }
        return j23Var;
    }
}
