package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k51 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ s61 j;

    public /* synthetic */ k51(s61 s61Var, int i, byte b) {
        this.h = b;
        this.j = s61Var;
        this.i = i;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        int i = this.i;
        s61 s61Var = this.j;
        switch (b) {
            case 0:
                l51 l51Var = (l51) s61Var;
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    mz0 mz0VarC = l51Var.b.i.c(i);
                    ((i51) mz0VarC.c).b.o(n51.a, Integer.valueOf(i - mz0VarC.a), dr0Var, 6);
                }
                break;
            default:
                q71 q71Var = (q71) s61Var;
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    mz0 mz0VarC2 = q71Var.b.h.c(i);
                    ((o71) mz0VarC2.c).c.o(q71Var.c, Integer.valueOf(i - mz0VarC2.a), dr0Var2, 0);
                }
                break;
        }
        return j23Var;
    }
}
