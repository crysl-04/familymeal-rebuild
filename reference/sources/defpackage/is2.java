package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class is2 extends c92 implements zp0 {
    public boolean j;
    public /* synthetic */ m10 k;
    public final /* synthetic */ x20 l;
    public final /* synthetic */ k22 m;
    public final /* synthetic */ aq0 n;
    public final /* synthetic */ a20 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is2(x20 x20Var, k22 k22Var, aq0 aq0Var, a20 a20Var, m10 m10Var) {
        super(2, m10Var);
        this.l = x20Var;
        this.m = k22Var;
        this.n = aq0Var;
        this.o = a20Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((is2) p((m10) obj2, (sq2) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        is2 is2Var = new is2(this.l, this.m, this.n, this.o, m10Var);
        is2Var.k = (m10) obj;
        return is2Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        boolean z = this.j;
        if (!z) {
            m02.y(obj);
            sq2 sq2Var = (sq2) this.k;
            this.j = true;
            Object objF = ns2.f(sq2Var, this.l, this.m, this.n, this.o, this);
            y20 y20Var = y20.h;
            if (objF == y20Var) {
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
