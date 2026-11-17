package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ir2 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ tb n;
    public final /* synthetic */ float o;
    public final /* synthetic */ jr2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir2(tb tbVar, float f, jr2 jr2Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = tbVar;
        this.o = f;
        this.p = jr2Var;
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
        return ((ir2) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        switch (this.l) {
            case 0:
                return new ir2(this.n, this.o, this.p, m10Var, (byte) 0);
            default:
                return new ir2(this.n, this.o, this.p, m10Var, (byte) 1);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        jr2 jr2Var = this.p;
        float f = this.o;
        tb tbVar = this.n;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (z) {
                    if (z) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                cc0 cc0Var = new cc0(f);
                zm2 zm2Var = jr2Var.y;
                this.m = true;
                return tb.a(tbVar, cc0Var, zm2Var, this) == y20Var ? y20Var : j23Var;
            default:
                boolean z2 = this.m;
                if (z2) {
                    if (z2) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                cc0 cc0Var2 = new cc0(f);
                zm2 zm2Var2 = jr2Var.y;
                this.m = true;
                return tb.a(tbVar, cc0Var2, zm2Var2, this) == y20Var ? y20Var : j23Var;
        }
    }
}
