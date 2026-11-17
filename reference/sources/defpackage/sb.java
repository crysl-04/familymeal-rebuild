package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sb extends mq2 implements vp0 {
    public final /* synthetic */ tb l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(tb tbVar, Object obj, m10 m10Var) {
        super(1, m10Var);
        this.l = tbVar;
        this.m = obj;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        sb sbVar = new sb(this.l, this.m, (m10) obj);
        j23 j23Var = j23.a;
        sbVar.r(j23Var);
        return j23Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        m02.y(obj);
        tb tbVar = this.l;
        tbVar.c();
        Object objB = tbVar.b(this.m);
        tbVar.c.i.setValue(objB);
        tbVar.e.setValue(objB);
        return j23.a;
    }
}
