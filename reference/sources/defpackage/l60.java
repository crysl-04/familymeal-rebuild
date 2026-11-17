package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l60 implements zp0 {
    public final /* synthetic */ hq h;
    public final /* synthetic */ long i;
    public final /* synthetic */ qy0 j;
    public final /* synthetic */ rg1 k;
    public final /* synthetic */ s40 l;
    public final /* synthetic */ vp0 m;
    public final /* synthetic */ vf2 n;

    public l60(hq hqVar, long j, qy0 qy0Var, rg1 rg1Var, s40 s40Var, vp0 vp0Var, vf2 vf2Var) {
        this.h = hqVar;
        this.i = j;
        this.j = qy0Var;
        this.k = rg1Var;
        this.l = s40Var;
        this.m = vp0Var;
        this.n = vf2Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            hq hqVar = this.h;
            dq dqVarD = hqVar.d();
            int i = hqVar.c(LocalDate.of(dqVarD.h, dqVarD.i, 1)).a;
            int i2 = hqVar.b(this.i).a;
            qy0 qy0Var = this.j;
            c61 c61VarA = f61.a(Math.max(0, (i2 - qy0Var.h) - 3), dr0Var, 2);
            hs0 hs0Var = new hs0();
            s40 s40Var = this.l;
            rg1 rg1VarE = ie1.e(this.k, s40Var.a, t03.A);
            vz1 vz1Var = uz0.i;
            ah ahVar = new ah(n60.d, new wg((byte) 0));
            boolean zH = dr0Var.h(qy0Var) | dr0Var.h(hqVar) | dr0Var.d(i2) | dr0Var.d(i) | dr0Var.f(this.m) | dr0Var.f(this.n) | dr0Var.f(s40Var);
            Object objK = dr0Var.K();
            if (zH || objK == zy.a) {
                i60 i60Var = new i60(this.j, this.h, i2, i, this.m, this.n, this.l);
                dr0Var.f0(i60Var);
                objK = i60Var;
            }
            ou.h(hs0Var, rg1VarE, c61VarA, null, ahVar, vz1Var, null, false, null, (vp0) objK, dr0Var, 1769472);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
