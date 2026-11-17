package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b61 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ int m;
    public final /* synthetic */ ke2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b61(ke2 ke2Var, int i, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = ke2Var;
        this.m = i;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        wd2 wd2Var = (wd2) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                ((b61) p(m10Var, wd2Var)).r(j23Var);
                break;
            default:
                ((b61) p(m10Var, wd2Var)).r(j23Var);
                break;
        }
        return j23Var;
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        switch (this.l) {
            case 0:
                return new b61((c61) this.n, this.m, m10Var, (byte) 0);
            default:
                return new b61((b81) this.n, this.m, m10Var, (byte) 1);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        int i = this.m;
        ke2 ke2Var = this.n;
        switch (b) {
            case 0:
                m02.y(obj);
                c61 c61Var = (c61) ke2Var;
                w51 w51Var = c61Var.d;
                if (w51Var.b.g() != i || w51Var.c.g() != 0) {
                    p61 p61Var = c61Var.m;
                    p61Var.d();
                    p61Var.b = null;
                }
                w51Var.a(i, 0);
                w51Var.e = null;
                l41 l41Var = c61Var.j;
                if (l41Var != null) {
                    l41Var.k();
                }
                break;
            default:
                m02.y(obj);
                ((b81) ke2Var).m(i);
                break;
        }
        return j23Var;
    }
}
