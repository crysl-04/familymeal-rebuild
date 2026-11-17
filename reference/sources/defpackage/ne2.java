package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ne2 extends mq2 implements zp0 {
    public qe2 l;
    public w72 m;
    public long n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ qe2 q;
    public final /* synthetic */ w72 r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne2(qe2 qe2Var, w72 w72Var, long j, m10 m10Var) {
        super(2, m10Var);
        this.q = qe2Var;
        this.r = w72Var;
        this.s = j;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((ne2) p((m10) obj2, (oe2) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        ne2 ne2Var = new ne2(this.q, this.r, this.s, m10Var);
        ne2Var.p = obj;
        return ne2Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        qe2 qe2Var;
        w72 w72Var;
        qe2 qe2Var2;
        long j;
        boolean z = this.o;
        ks1 ks1Var = ks1.i;
        if (!z) {
            m02.y(obj);
            oe2 oe2Var = (oe2) this.p;
            qe2Var = this.q;
            w71 w71Var = new w71(qe2Var, oe2Var, (byte) 1);
            tj0 tj0Var = qe2Var.c;
            w72 w72Var2 = this.r;
            long j2 = w72Var2.h;
            ks1 ks1Var2 = qe2Var.d;
            long j3 = this.s;
            float fE = qe2Var.e(ks1Var2 == ks1Var ? a43.b(j3) : a43.c(j3));
            this.p = qe2Var;
            this.l = qe2Var;
            this.m = w72Var2;
            this.n = j2;
            this.o = true;
            obj = tj0Var.a(w71Var, fE, this);
            y20 y20Var = y20.h;
            if (obj == y20Var) {
                return y20Var;
            }
            w72Var = w72Var2;
            qe2Var2 = qe2Var;
            j = j2;
        } else {
            if (!z) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.n;
            w72Var = this.m;
            qe2Var = this.l;
            qe2Var2 = (qe2) this.p;
            m02.y(obj);
        }
        float fE2 = qe2Var2.e(((Number) obj).floatValue());
        w72Var.h = qe2Var.d == ks1Var ? a43.a(j, fE2, 0.0f, 2) : a43.a(j, 0.0f, fE2, 1);
        return j23.a;
    }
}
