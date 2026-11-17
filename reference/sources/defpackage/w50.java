package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w50 extends mq2 implements zp0 {
    public boolean l;
    public final /* synthetic */ b81 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ qy0 o;
    public final /* synthetic */ iq p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(b81 b81Var, int i, qy0 qy0Var, iq iqVar, m10 m10Var) {
        super(2, m10Var);
        this.m = b81Var;
        this.n = i;
        this.o = qy0Var;
        this.p = iqVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((w50) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new w50(this.m, this.n, this.o, this.p, m10Var);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        boolean z = this.l;
        if (!z) {
            m02.y(obj);
            int i = (((this.n - this.o.h) * 12) + this.p.b) - 1;
            this.l = true;
            Object objL = b81.l(this.m, i, this);
            y20 y20Var = y20.h;
            if (objL == y20Var) {
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
