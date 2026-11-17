package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sv0 extends mq2 implements zp0 {
    public /* synthetic */ float l;

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((sv0) p((m10) obj2, Float.valueOf(((Number) obj).floatValue()))).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        sv0 sv0Var = new sv0(2, m10Var);
        sv0Var.l = ((Number) obj).floatValue();
        return sv0Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        m02.y(obj);
        return Boolean.valueOf(this.l > 0.0f);
    }
}
