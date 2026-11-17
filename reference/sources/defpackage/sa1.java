package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sa1 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ pa1 i;
    public final /* synthetic */ zp0 j;

    public /* synthetic */ sa1(pa1 pa1Var, zp0 zp0Var, byte b) {
        this.h = b;
        this.i = pa1Var;
        this.j = zp0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        pa1 pa1Var = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    cu.n(pa1Var.c, s60.m0, this.j, dr0Var, 48);
                }
                break;
            default:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    rg1 rg1VarJ = t03.J(og1.h, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    ze1 ze1VarC = ho.c(c5.i, false);
                    int iHashCode = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL = dr0Var2.l();
                    rg1 rg1VarU = ls.U(dr0Var2, rg1VarJ);
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
                    cu.n(pa1Var.d, s60.p0, this.j, dr0Var2, 48);
                    dr0Var2.p(true);
                }
                break;
        }
        return j23Var;
    }
}
