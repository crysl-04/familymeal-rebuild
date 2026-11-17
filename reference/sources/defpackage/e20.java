package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e20 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ d12 n;
    public final /* synthetic */ zt2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e20(d12 d12Var, zt2 zt2Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = d12Var;
        this.o = zt2Var;
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
            case 1:
                break;
        }
        return ((e20) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        switch (this.l) {
            case 0:
                return new e20(this.n, this.o, m10Var, (byte) 0);
            case 1:
                return new e20(this.n, this.o, m10Var, (byte) 1);
            default:
                return new e20(this.n, this.o, m10Var, (byte) 2);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        zt2 zt2Var = this.o;
        d12 d12Var = this.n;
        y20 y20Var = y20.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    this.m = true;
                    Object objX = vs.x(new fa0(d12Var, zt2Var, null), this);
                    if (objX != y20Var) {
                        objX = j23Var;
                    }
                    if (objX == y20Var) {
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
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    this.m = true;
                    Object objL = ou.l(d12Var, new un0(zt2Var, null), this);
                    if (objL != y20Var) {
                        objL = j23Var;
                    }
                    if (objL == y20Var) {
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
            default:
                boolean z3 = this.m;
                if (!z3) {
                    m02.y(obj);
                    this.m = true;
                    pc1 pc1Var = new pc1(zt2Var, (byte) 0);
                    qc1 qc1Var = new qc1(zt2Var, (byte) 0);
                    qc1 qc1Var2 = new qc1(zt2Var, (byte) 1);
                    s sVar = new s(zt2Var, (byte) 15);
                    Object objL2 = ou.l(d12Var, new zc0(new sz((byte) 26), new kw0((Object) pc1Var, (byte) 4), sVar, qc1Var2, new p(qc1Var, (byte) 18), null), this);
                    if (objL2 != y20Var) {
                        objL2 = j23Var;
                    }
                    if (objL2 != y20Var) {
                        objL2 = j23Var;
                    }
                    if (objL2 != y20Var) {
                        objL2 = j23Var;
                    }
                    if (objL2 == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z3) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                return j23Var;
        }
    }
}
