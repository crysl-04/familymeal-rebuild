package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qy2 extends mq2 implements vp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy2(Object obj, m10 m10Var, byte b) {
        super(1, m10Var);
        this.l = b;
        this.n = obj;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        Object obj2 = this.n;
        m10 m10Var = (m10) obj;
        switch (b) {
            case 0:
                return new qy2((ry2) obj2, m10Var, (byte) 0).r(j23Var);
            default:
                return new qy2((p63) obj2, m10Var, (byte) 1).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        Object obj2 = this.n;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    ry2 ry2Var = (ry2) obj2;
                    this.m = true;
                    rq rqVar = new rq(1, ls.F(this));
                    rqVar.u();
                    ry2Var.b.c.setValue(Boolean.TRUE);
                    ry2Var.c = rqVar;
                    if (rqVar.t() == y20Var) {
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
            default:
                boolean z2 = this.m;
                if (z2) {
                    if (z2) {
                        m02.y(obj);
                        return obj;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                p63 p63Var = (p63) obj2;
                kz1 kz1Var = p63Var.b;
                LocalDate localDateE = p63Var.e();
                localDateE.getClass();
                this.m = true;
                Object objA = kz1Var.a(localDateE, 20000L, 8000L, this);
                return objA == y20Var ? y20Var : objA;
        }
    }
}
