package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lf2 extends mq2 implements zp0 {
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ pf2 p;
    public final /* synthetic */ qz2 q;
    public final /* synthetic */ float r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf2(Object obj, Object obj2, pf2 pf2Var, qz2 qz2Var, float f, m10 m10Var) {
        super(2, m10Var);
        this.n = obj;
        this.o = obj2;
        this.p = pf2Var;
        this.q = qz2Var;
        this.r = f;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((lf2) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        lf2 lf2Var = new lf2(this.n, this.o, this.p, this.q, this.r, m10Var);
        lf2Var.m = obj;
        return lf2Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        boolean z = this.l;
        j23 j23Var = j23.a;
        m10 m10Var = null;
        pf2 pf2Var = this.p;
        if (!z) {
            m02.y(obj);
            x20 x20Var = (x20) this.m;
            Object obj2 = this.n;
            Object obj3 = this.o;
            if (uz0.g(obj2, obj3)) {
                pf2Var.o = null;
                if (uz0.g(pf2Var.c.getValue(), obj2)) {
                    return j23Var;
                }
            } else {
                pf2Var.s();
            }
            boolean zG = uz0.g(obj2, obj3);
            float f = this.r;
            if (!zG) {
                qz2 qz2Var = this.q;
                qz2Var.q(obj2);
                qz2Var.n(0L);
                pf2Var.b.setValue(obj2);
                qz2Var.j(f);
            }
            pf2Var.x(f);
            if (pf2Var.n.j()) {
                ie1.p(x20Var, null, new qj(pf2Var, m10Var, (byte) 9), 3);
            } else {
                pf2Var.m = Long.MIN_VALUE;
            }
            this.l = true;
            Object objA = pf2Var.A(this);
            y20 y20Var = y20.h;
            if (objA == y20Var) {
                return y20Var;
            }
        } else {
            if (!z) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        pf2Var.w();
        return j23Var;
    }
}
