package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ie2 extends mq2 implements zp0 {
    public /* synthetic */ Object l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie2(long j, m10 m10Var) {
        super(2, m10Var);
        this.m = j;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        ie2 ie2Var = (ie2) p((m10) obj2, (oe2) obj);
        j23 j23Var = j23.a;
        ie2Var.r(j23Var);
        return j23Var;
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        ie2 ie2Var = new ie2(this.m, m10Var);
        ie2Var.l = obj;
        return ie2Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        m02.y(obj);
        qe2 qe2Var = ((oe2) this.l).a;
        qe2Var.d(qe2Var.k, this.m, 1);
        return j23.a;
    }
}
