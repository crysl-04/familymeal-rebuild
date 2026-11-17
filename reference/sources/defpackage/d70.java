package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d70 extends mq2 implements zp0 {
    public u72 l;
    public dd m;
    public boolean n;
    public final /* synthetic */ float o;
    public final /* synthetic */ e70 p;
    public final /* synthetic */ w71 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d70(float f, e70 e70Var, w71 w71Var, m10 m10Var) {
        super(2, m10Var);
        this.o = f;
        this.p = e70Var;
        this.q = w71Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((d70) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new d70(this.o, this.p, this.q, m10Var);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        float f;
        u72 u72Var;
        dd ddVar;
        boolean z = this.n;
        if (!z) {
            m02.y(obj);
            f = this.o;
            if (Math.abs(f) > 1.0f) {
                u72 u72Var2 = new u72();
                u72Var2.h = f;
                u72 u72Var3 = new u72();
                dd ddVarB = ie1.b(0.0f, f, 28);
                try {
                    e70 e70Var = this.p;
                    u60 u60Var = e70Var.a;
                    qb qbVar = new qb(u72Var3, this.q, u72Var2, e70Var);
                    this.l = u72Var2;
                    this.m = ddVarB;
                    this.n = true;
                    Object objF = cy1.f(ddVarB, u60Var, false, qbVar, this);
                    y20 y20Var = y20.h;
                    if (objF == y20Var) {
                        return y20Var;
                    }
                    u72Var = u72Var2;
                    f = u72Var.h;
                } catch (CancellationException unused) {
                    u72Var = u72Var2;
                    ddVar = ddVarB;
                    u72Var.h = ((Number) ddVar.a()).floatValue();
                }
            }
        } else {
            if (!z) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ddVar = this.m;
            u72Var = this.l;
            try {
                m02.y(obj);
            } catch (CancellationException unused2) {
                u72Var.h = ((Number) ddVar.a()).floatValue();
            }
            f = u72Var.h;
        }
        return new Float(f);
    }
}
