package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vu2 extends mq2 implements aq0 {
    public boolean l;
    public /* synthetic */ k22 m;
    public /* synthetic */ long n;
    public final /* synthetic */ x20 o;
    public final /* synthetic */ sj1 p;
    public final /* synthetic */ ui1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu2(x20 x20Var, sj1 sj1Var, ui1 ui1Var, m10 m10Var) {
        super(3, m10Var);
        this.o = x20Var;
        this.p = sj1Var;
        this.q = ui1Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j = ((up1) obj2).a;
        sj1 sj1Var = this.p;
        ui1 ui1Var = this.q;
        vu2 vu2Var = new vu2(this.o, sj1Var, ui1Var, (m10) obj3);
        vu2Var.m = (k22) obj;
        vu2Var.n = j;
        return vu2Var.r(j23.a);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        boolean z = this.l;
        x20 x20Var = this.o;
        if (!z) {
            m02.y(obj);
            k22 k22Var = this.m;
            ie1.p(x20Var, null, new k((Object) this.p, this.n, this.q, (m10) null, (byte) 2), 3);
            this.l = true;
            obj = k22Var.g(this);
            y20 y20Var = y20.h;
            if (obj == y20Var) {
                return y20Var;
            }
        } else {
            if (!z) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        ie1.p(x20Var, null, new uu2(this.p, ((Boolean) obj).booleanValue(), this.q, null), 3);
        return j23.a;
    }
}
