package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tl1 extends mq2 implements zp0 {
    public byte l;
    public final /* synthetic */ float m;
    public final /* synthetic */ pf2 n;
    public final /* synthetic */ pk1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl1(float f, pf2 pf2Var, pk1 pk1Var, m10 m10Var) {
        super(2, m10Var);
        this.m = f;
        this.n = pf2Var;
        this.o = pk1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((tl1) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new tl1(this.m, this.n, this.o, m10Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        Object objA;
        byte b = this.l;
        j23 j23Var = j23.a;
        pf2 pf2Var = this.n;
        float f = this.m;
        y20 y20Var = y20.h;
        if (b == 0) {
            m02.y(obj);
            if (f > 0.0f) {
                this.l = (byte) 1;
                if (pf2Var.v(f, pf2Var.b.getValue(), this) != y20Var) {
                }
            }
            return y20Var;
        }
        if (b != 1) {
            if (b == 2) {
                m02.y(obj);
                return j23Var;
            }
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m02.y(obj);
        if (f == 0.0f) {
            this.l = (byte) 2;
            qz2 qz2Var = pf2Var.e;
            if (qz2Var != null) {
                Object value = pf2Var.c.getValue();
                pk1 pk1Var = this.o;
                if ((uz0.g(value, pk1Var) && uz0.g(pf2Var.b.getValue(), pk1Var)) || (objA = mk1.a(pf2Var.l, new jf2(pf2Var, pk1Var, qz2Var, null, (byte) 1), this)) != y20Var) {
                    objA = j23Var;
                }
            } else {
                objA = j23Var;
            }
            if (objA == y20Var) {
                return y20Var;
            }
        }
        return j23Var;
    }
}
