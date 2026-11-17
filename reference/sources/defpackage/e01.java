package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e01 extends mq2 implements aq0 {
    public final /* synthetic */ f01 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e01(f01 f01Var, m10 m10Var) {
        super(3, m10Var);
        this.l = f01Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        e01 e01Var = new e01(this.l, (m10) obj3);
        j23 j23Var = j23.a;
        e01Var.r(j23Var);
        return j23Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        m02.y(obj);
        this.l.e.decrementAndGet();
        return j23.a;
    }
}
