package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q93 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ r93 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q93(r93 r93Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = r93Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        x20 x20Var = (x20) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((q93) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        r93 r93Var = this.n;
        switch (b) {
            case 0:
                return new q93(r93Var, m10Var, (byte) 0);
            default:
                return new q93(r93Var, m10Var, (byte) 1);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) throws Throwable {
        byte b = this.l;
        r93 r93Var = this.n;
        y20 y20Var = y20.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    t6 t6Var = r93Var.h;
                    this.m = true;
                    Object objG = t6Var.D.g(this);
                    if (objG != y20Var) {
                        objG = j23Var;
                    }
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
                return j23Var;
            default:
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    t6 t6Var2 = r93Var.h;
                    this.m = true;
                    Object objD = t6Var2.E.d(this);
                    if (objD != y20Var) {
                        objD = j23Var;
                    }
                    if (objD == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z2) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                return j23Var;
        }
    }
}
