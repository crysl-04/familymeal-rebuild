package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r50 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ o60 i;
    public final /* synthetic */ s40 j;

    public /* synthetic */ r50(o60 o60Var, s40 s40Var, byte b) {
        this.h = b;
        this.i = o60Var;
        this.j = s40Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        og1 og1Var = og1.h;
        o60 o60Var = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    w40.a.b(o60Var.a(), t03.F(og1Var, n60.b), this.j.b, dr0Var, 3120);
                }
                break;
            default:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    rg1 rg1VarF = t03.F(og1Var, n60.a);
                    int iA = o60Var.a();
                    boolean zF = dr0Var2.f(o60Var);
                    Object objK = dr0Var2.K();
                    if (zF || objK == zy.a) {
                        objK = new t50(o60Var, (byte) 0);
                        dr0Var2.f0(objK);
                    }
                    n60.f(rg1VarF, iA, (vp0) objK, this.j, dr0Var2, 6);
                }
                break;
        }
        return j23Var;
    }
}
