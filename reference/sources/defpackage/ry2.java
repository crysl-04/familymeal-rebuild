package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ry2 {
    public final lk1 a;
    public final tj1 b = new tj1(Boolean.FALSE);
    public rq c;

    public ry2(lk1 lk1Var) {
        this.a = lk1Var;
    }

    public final void a() {
        this.b.c.setValue(Boolean.FALSE);
    }

    public final boolean b() {
        tj1 tj1Var = this.b;
        return ((Boolean) tj1Var.b.getValue()).booleanValue() || ((Boolean) tj1Var.c.getValue()).booleanValue();
    }

    public final Object c(ek1 ek1Var, mq2 mq2Var) {
        m10 m10Var = null;
        nr nrVar = new nr(this, new qy2(this, m10Var, (byte) 0), ek1Var, m10Var, (byte) 3);
        lk1 lk1Var = this.a;
        lk1Var.getClass();
        Object objX = vs.x(new ik1(ek1Var, lk1Var, nrVar, null), mq2Var);
        return objX == y20.h ? objX : j23.a;
    }
}
