package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mf2 extends mq2 implements vp0 {
    public boolean l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ pf2 o;
    public final /* synthetic */ qz2 p;
    public final /* synthetic */ float q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf2(Object obj, Object obj2, pf2 pf2Var, qz2 qz2Var, float f, m10 m10Var) {
        super(1, m10Var);
        this.m = obj;
        this.n = obj2;
        this.o = pf2Var;
        this.p = qz2Var;
        this.q = f;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        qz2 qz2Var = this.p;
        float f = this.q;
        return new mf2(this.m, this.n, this.o, qz2Var, f, (m10) obj).r(j23.a);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        boolean z = this.l;
        if (!z) {
            m02.y(obj);
            lf2 lf2Var = new lf2(this.m, this.n, this.o, this.p, this.q, null);
            this.l = true;
            Object objX = vs.x(lf2Var, this);
            y20 y20Var = y20.h;
            if (objX == y20Var) {
                return y20Var;
            }
        } else {
            if (!z) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        return j23.a;
    }
}
