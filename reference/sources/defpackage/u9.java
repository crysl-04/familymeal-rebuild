package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u9 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ m12 i;
    public final /* synthetic */ sj1 j;

    public /* synthetic */ u9(m12 m12Var, sj1 sj1Var, byte b) {
        this.h = b;
        this.i = m12Var;
        this.j = sj1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        sj1 sj1Var = this.j;
        m12 m12Var = this.i;
        byte b2 = 1;
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    ys.a(ca.b.a(Boolean.TRUE), dt.N(1022273628, new u9(m12Var, sj1Var, b2), dr0Var), dr0Var, 56);
                }
                break;
            default:
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    Object objK = dr0Var.K();
                    yy yyVar = zy.a;
                    if (objK == yyVar) {
                        objK = new s0((byte) 9);
                        dr0Var.f0(objK);
                    }
                    rg1 rg1VarA = tg2.a(og1.h, false, (vp0) objK);
                    boolean zH = dr0Var.h(m12Var);
                    Object objK2 = dr0Var.K();
                    if (zH || objK2 == yyVar) {
                        objK2 = new t9(m12Var, (byte) 0);
                        dr0Var.f0(objK2);
                    }
                    rg1 rg1VarK = tz0.k(uz0.p(rg1VarA, (vp0) objK2), m12Var.getCanCalculatePosition() ? 1.0f : 0.0f);
                    zp0 zp0Var = (zp0) sj1Var.getValue();
                    Object objK3 = dr0Var.K();
                    if (objK3 == yyVar) {
                        objK3 = c8.c;
                        dr0Var.f0(objK3);
                    }
                    ze1 ze1Var = (ze1) objK3;
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, rg1VarK);
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(l41.W);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, ze1Var);
                    h12.y(c5.E, dr0Var, dx1VarL);
                    h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
                    h12.t(dr0Var);
                    h12.y(c5.D, dr0Var, rg1VarU);
                    zp0Var.f(dr0Var, 0);
                    dr0Var.p(true);
                }
                break;
        }
        return j23Var;
    }
}
