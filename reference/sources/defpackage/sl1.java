package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sl1 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public float n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl1(Object obj, float f, Object obj2, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.o = obj;
        this.n = f;
        this.p = obj2;
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
        return ((sl1) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                return new sl1((pf2) this.o, this.n, (sj1) obj2, m10Var, (byte) 0);
            case 1:
                return new sl1((kt) this.o, this.n, (q03) obj2, m10Var, (byte) 1);
            default:
                sl1 sl1Var = new sl1((qz2) obj2, m10Var);
                sl1Var.o = obj;
                return sl1Var;
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        float fV;
        x20 x20Var;
        byte b = this.l;
        j23 j23Var = j23.a;
        Object obj2 = this.p;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                sj1 sj1Var = (sj1) obj2;
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
                if (((List) sj1Var.getValue()).size() <= 1) {
                    return j23Var;
                }
                pk1 pk1Var = (pk1) ((List) sj1Var.getValue()).get(((List) sj1Var.getValue()).size() - 2);
                pf2 pf2Var = (pf2) this.o;
                float f = this.n;
                this.m = true;
                return pf2Var.v(f, pk1Var, this) == y20Var ? y20Var : j23Var;
            case 1:
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    this.m = true;
                    return tb.a((tb) ((kt) this.o).c, new Float(this.n), (q03) obj2, this) == y20Var ? y20Var : j23Var;
                }
                if (z2) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.m;
                if (!z3) {
                    m02.y(obj);
                    x20 x20Var2 = (x20) this.o;
                    fV = cy1.v(x20Var2.f());
                    x20Var = x20Var2;
                } else {
                    if (!z3) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fV = this.n;
                    x20Var = (x20) this.o;
                    m02.y(obj);
                }
                while (vs.I(x20Var)) {
                    cd0 cd0Var = new cd0((qz2) obj2, fV);
                    this.o = x20Var;
                    this.n = fV;
                    this.m = true;
                    o20 o20Var = this.i;
                    o20Var.getClass();
                    if (es.M(o20Var).c(this, cd0Var) == y20Var) {
                        return y20Var;
                    }
                }
                return j23Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl1(qz2 qz2Var, m10 m10Var) {
        super(2, m10Var);
        this.l = (byte) 2;
        this.p = qz2Var;
    }
}
