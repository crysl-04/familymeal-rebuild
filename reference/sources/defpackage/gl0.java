package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gl0 extends mq2 implements zp0 {
    public /* synthetic */ int l;

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((gl0) p((m10) obj2, Integer.valueOf(((Number) obj).intValue()))).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        gl0 gl0Var = new gl0(2, m10Var);
        gl0Var.l = ((Number) obj).intValue();
        return gl0Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        m02.y(obj);
        return Boolean.valueOf(this.l > 0);
    }
}
