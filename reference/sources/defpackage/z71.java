package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z71 extends mq2 implements zp0 {
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b81 n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z71(b81 b81Var, int i, m10 m10Var) {
        super(2, m10Var);
        this.n = b81Var;
        this.o = i;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((z71) p((m10) obj2, (wd2) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        z71 z71Var = new z71(this.n, this.o, m10Var);
        z71Var.m = obj;
        return z71Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        boolean z = this.l;
        if (!z) {
            m02.y(obj);
            wd2 wd2Var = (wd2) this.m;
            b81 b81Var = this.n;
            w71 w71Var = new w71(wd2Var, b81Var, (byte) 0);
            e90 e90Var = ((u71) b81Var.f.getValue()).i;
            this.l = true;
            Object objM = vs.m(w71Var, this.o, 100, e90Var, this);
            y20 y20Var = y20.h;
            if (objM == y20Var) {
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
