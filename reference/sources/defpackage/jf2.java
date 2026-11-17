package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jf2 extends mq2 implements vp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ pf2 n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ qz2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf2(pf2 pf2Var, Object obj, qz2 qz2Var, m10 m10Var, byte b) {
        super(1, m10Var);
        this.l = b;
        this.n = pf2Var;
        this.o = obj;
        this.p = qz2Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        m10 m10Var = (m10) obj;
        switch (b) {
            case 0:
                return new jf2(this.n, this.o, this.p, m10Var, (byte) 0).r(j23Var);
            default:
                return new jf2(this.n, this.o, this.p, m10Var, (byte) 1).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        float f;
        byte b = this.l;
        j23 j23Var = j23.a;
        y20 y20Var = y20.h;
        pf2 pf2Var = this.n;
        Object obj2 = this.o;
        qz2 qz2Var = this.p;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    if2 if2Var = new if2(pf2Var, obj2, qz2Var, null);
                    this.m = true;
                    return vs.x(if2Var, this) == y20Var ? y20Var : j23Var;
                }
                if (z) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    pf2Var.r();
                    lu1 lu1Var = pf2Var.b;
                    pf2Var.m = Long.MIN_VALUE;
                    pf2Var.x(0.0f);
                    if (obj2.equals(pf2Var.c.getValue())) {
                        f = -4.0f;
                    } else {
                        f = obj2.equals(lu1Var.getValue()) ? -5.0f : -3.0f;
                    }
                    qz2Var.q(obj2);
                    qz2Var.n(0L);
                    lu1Var.setValue(obj2);
                    pf2Var.x(0.0f);
                    pf2Var.n(obj2);
                    qz2Var.j(f);
                    if (f == -3.0f) {
                        this.m = true;
                        if (pf2Var.A(this) == y20Var) {
                            return y20Var;
                        }
                    }
                } else {
                    if (!z2) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                qz2Var.i();
                return j23Var;
        }
    }
}
