package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s50 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ s50(Object obj, Object obj2, Object obj3, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                o60 o60Var = (o60) obj5;
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    w40.a.a(o60Var.b(), o60Var.a(), (y40) obj4, t03.F(og1.h, n60.c), ((s40) obj3).c, dr0Var, 199680);
                }
                break;
            default:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    xy xyVar = new xy(new d60((qz2) obj5, (byte) 4));
                    nx nxVar = (nx) obj4;
                    py2 py2Var = (py2) obj3;
                    ze1 ze1VarC = ho.c(c5.i, false);
                    int iHashCode = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL = dr0Var2.l();
                    rg1 rg1VarU = ls.U(dr0Var2, xyVar);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(l41.W);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(c5.F, dr0Var2, ze1VarC);
                    h12.y(c5.E, dr0Var2, dx1VarL);
                    yx yxVar = c5.G;
                    if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode))) {
                        wi0.o(iHashCode, dr0Var2, iHashCode, yxVar);
                    }
                    h12.y(c5.D, dr0Var2, rg1VarU);
                    nxVar.c(py2Var, dr0Var2, 6);
                    dr0Var2.p(true);
                }
                break;
        }
        return j23Var;
    }
}
