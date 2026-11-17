package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w00 extends mq2 implements zp0 {
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ x00 n;
    public final /* synthetic */ t23 o;
    public final /* synthetic */ vo p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w00(x00 x00Var, t23 t23Var, vo voVar, long j, m10 m10Var) {
        super(2, m10Var);
        this.n = x00Var;
        this.o = t23Var;
        this.p = voVar;
        this.q = j;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((w00) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        w00 w00Var = new w00(this.n, this.o, this.p, this.q, m10Var);
        w00Var.m = obj;
        return w00Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        x00 x00Var = this.n;
        lo loVar = x00Var.A;
        boolean z = this.l;
        CancellationException cancellationException = null;
        try {
            try {
                if (!z) {
                    m02.y(obj);
                    s01 s01VarE = ys.E(((x20) this.m).f());
                    x00Var.D = true;
                    qe2 qe2Var = x00Var.w;
                    ek1 ek1Var = ek1.h;
                    v00 v00Var = new v00(this.o, x00Var, this.p, this.q, s01VarE, null);
                    this.l = true;
                    Object objG = qe2Var.g(ek1Var, v00Var, this);
                    y20 y20Var = y20.h;
                    if (objG == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                loVar.b();
                x00Var.D = false;
                loVar.a(null);
                x00Var.B = false;
                return j23.a;
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (Throwable th) {
            x00Var.D = false;
            loVar.a(cancellationException);
            x00Var.B = false;
            throw th;
        }
    }
}
