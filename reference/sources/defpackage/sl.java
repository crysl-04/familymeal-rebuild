package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sl extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ ry2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl(ry2 ry2Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = ry2Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((sl) p((m10) obj2, (x20) obj)).r(j23Var);
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                sl slVar = new sl(this.n, (m10) obj2, (byte) 1);
                slVar.m = zBooleanValue;
                slVar.r(j23Var);
                return j23Var;
            default:
                return ((sl) p((m10) obj2, (x20) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        ry2 ry2Var = this.n;
        switch (b) {
            case 0:
                return new sl(ry2Var, m10Var, (byte) 0);
            case 1:
                sl slVar = new sl(ry2Var, m10Var, (byte) 1);
                slVar.m = ((Boolean) obj).booleanValue();
                return slVar;
            default:
                return new sl(ry2Var, m10Var, (byte) 2);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        ry2 ry2Var = this.n;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    this.m = true;
                    if (ry2Var.c(ek1.h, this) == y20Var) {
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
            case 1:
                m02.y(obj);
                if (!this.m) {
                    ry2Var.a();
                }
                return j23Var;
            default:
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    this.m = true;
                    if (ry2Var.c(ek1.i, this) == y20Var) {
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
