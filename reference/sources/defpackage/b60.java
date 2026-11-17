package defpackage;

import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b60 implements bq0 {
    public final /* synthetic */ hq h;
    public final /* synthetic */ iq i;
    public final /* synthetic */ vp0 j;
    public final /* synthetic */ dq k;
    public final /* synthetic */ Long l;
    public final /* synthetic */ y40 m;
    public final /* synthetic */ vf2 n;
    public final /* synthetic */ s40 o;

    public b60(hq hqVar, iq iqVar, vp0 vp0Var, dq dqVar, Long l, y40 y40Var, vf2 vf2Var, s40 s40Var) {
        this.h = hqVar;
        this.i = iqVar;
        this.j = vp0Var;
        this.k = dqVar;
        this.l = l;
        this.m = y40Var;
        this.n = vf2Var;
        this.o = s40Var;
    }

    @Override // defpackage.bq0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g61 g61Var = (g61) obj;
        int iIntValue = ((Number) obj2).intValue();
        dr0 dr0Var = (dr0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (dr0Var.f(g61Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= dr0Var.d(iIntValue) ? 32 : 16;
        }
        if (dr0Var.N(i & 1, (i & 147) != 146)) {
            hq hqVar = this.h;
            hqVar.getClass();
            iq iqVarC = this.i;
            if (iIntValue > 0) {
                iqVarC = hqVar.c(Instant.ofEpochMilli(iqVarC.e).atZone(hq.e).toLocalDate().plusMonths(iIntValue));
            }
            pu1 pu1Var = new pu1(g61Var.a);
            ze1 ze1VarC = ho.c(c5.i, false);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, pu1Var);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, ze1VarC);
            h12.y(c5.E, dr0Var, dx1VarL);
            yx yxVar = c5.G;
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar);
            }
            h12.y(c5.D, dr0Var, rg1VarU);
            n60.i(iqVarC, this.j, this.k.k, this.l, this.m, this.n, this.o, hqVar.a, dr0Var, 221184);
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
