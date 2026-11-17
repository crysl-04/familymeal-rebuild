package defpackage;

import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x50 implements aq0 {
    public final /* synthetic */ long h;
    public final /* synthetic */ sj1 i;
    public final /* synthetic */ x20 j;
    public final /* synthetic */ b81 k;
    public final /* synthetic */ qy0 l;
    public final /* synthetic */ iq m;
    public final /* synthetic */ vf2 n;
    public final /* synthetic */ hq o;
    public final /* synthetic */ s40 p;

    public x50(long j, sj1 sj1Var, x20 x20Var, b81 b81Var, qy0 qy0Var, iq iqVar, vf2 vf2Var, hq hqVar, s40 s40Var) {
        this.h = j;
        this.i = sj1Var;
        this.j = x20Var;
        this.k = b81Var;
        this.l = qy0Var;
        this.m = iqVar;
        this.n = vf2Var;
        this.o = hqVar;
        this.p = s40Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        dr0 dr0Var = (dr0) obj2;
        ((Number) obj3).intValue();
        String strL = h12.l(R.string.m3c_date_picker_year_picker_pane_title, dr0Var);
        boolean zF = dr0Var.f(strL);
        Object objK = dr0Var.K();
        yy yyVar = zy.a;
        if (zF || objK == yyVar) {
            objK = new ql(strL, (byte) 4);
            dr0Var.f0(objK);
        }
        og1 og1Var = og1.h;
        rg1 rg1VarA = tg2.a(og1Var, false, (vp0) objK);
        aw awVarA = yv.a(uz0.g, c5.u, dr0Var, 0);
        int iHashCode = Long.hashCode(dr0Var.T);
        dx1 dx1VarL = dr0Var.l();
        rg1 rg1VarU = ls.U(dr0Var, rg1VarA);
        sy.f.getClass();
        dr0Var.Y();
        if (dr0Var.S) {
            dr0Var.k(l41.W);
        } else {
            dr0Var.i0();
        }
        h12.y(c5.F, dr0Var, awVarA);
        h12.y(c5.E, dr0Var, dx1VarL);
        yx yxVar = c5.G;
        if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
            wi0.o(iHashCode, dr0Var, iHashCode, yxVar);
        }
        h12.y(c5.D, dr0Var, rg1VarU);
        rt1 rt1Var = n60.a;
        rg1 rg1VarH = t03.H(yj2.e(og1Var, 336.0f - tb0.a), 12.0f, 0.0f, 2);
        sj1 sj1Var = this.i;
        boolean zF2 = dr0Var.f(sj1Var);
        x20 x20Var = this.j;
        boolean zH = zF2 | dr0Var.h(x20Var);
        b81 b81Var = this.k;
        boolean zF3 = zH | dr0Var.f(b81Var);
        qy0 qy0Var = this.l;
        boolean zH2 = zF3 | dr0Var.h(qy0Var);
        iq iqVar = this.m;
        boolean zF4 = zH2 | dr0Var.f(iqVar);
        Object objK2 = dr0Var.K();
        if (zF4 || objK2 == yyVar) {
            u3 u3Var = new u3(x20Var, sj1Var, b81Var, qy0Var, iqVar);
            dr0Var.f0(u3Var);
            objK2 = u3Var;
        }
        long j = this.h;
        vf2 vf2Var = this.n;
        hq hqVar = this.o;
        s40 s40Var = this.p;
        n60.n(rg1VarH, j, (vp0) objK2, vf2Var, hqVar, qy0Var, s40Var, dr0Var, 6);
        ie1.c(null, 0.0f, s40Var.x, dr0Var, 0, 3);
        dr0Var.p(true);
        return j23.a;
    }
}
