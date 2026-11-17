package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j63 implements aq0 {
    public final /* synthetic */ p60 h;
    public final /* synthetic */ ez1 i;
    public final /* synthetic */ p63 j;
    public final /* synthetic */ sj1 k;

    public j63(p60 p60Var, ez1 ez1Var, p63 p63Var, sj1 sj1Var) {
        this.h = p60Var;
        this.i = ez1Var;
        this.j = p63Var;
        this.k = sj1Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        yy yyVar;
        String str;
        j63 j63Var;
        j63 j63Var2 = this;
        dr0 dr0Var = (dr0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((bw) obj).getClass();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            og1 og1Var = og1.h;
            rg1 rg1VarG = t03.G(og1Var, 12.0f);
            aw awVarA = yv.a(uz0.g, c5.u, dr0Var, 0);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarG);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, awVarA);
            h12.y(c5.E, dr0Var, dx1VarL);
            h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
            h12.t(dr0Var);
            h12.y(c5.D, dr0Var, rg1VarU);
            p60 p60Var = j63Var2.h;
            String str2 = p60Var.i;
            xw2 xw2Var = ((c13) dr0Var.j(e13.a)).h;
            Object objK = dr0Var.K();
            yy yyVar2 = zy.a;
            if (objK == yyVar2) {
                objK = z9.r;
                dr0Var.f0(objK);
            }
            yy yyVar3 = yyVar2;
            gw2.b(str2, tg2.a(og1Var, false, (vp0) objK), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, xw2Var, dr0Var, 0, 0, 131068);
            dr0 dr0Var2 = dr0Var;
            dr0Var2.V(-162627508);
            for (te1 te1Var : te1.o) {
                ek2 ek2Var = new ek2(p60Var, te1Var);
                ez1 ez1Var = j63Var2.i;
                Iterable iterable = (List) ez1Var.b.a.get(ek2Var);
                if (iterable == null) {
                    iterable = ag0.h;
                }
                List listA = ez1Var.e.a(p60Var, te1Var);
                String str3 = te1Var.i;
                if (listA.isEmpty()) {
                    dr0Var2.V(-1728279182);
                    dr0Var2.p(false);
                    str = "：不在家";
                    yyVar = yyVar3;
                } else {
                    dr0Var2.V(-1504625372);
                    boolean zH = dr0Var2.h(ez1Var);
                    Object objK2 = dr0Var2.K();
                    yyVar = yyVar3;
                    if (zH || objK2 == yyVar) {
                        objK2 = new aa(ez1Var, (byte) 5);
                        dr0Var2.f0(objK2);
                    }
                    str = "（" + dv.E0(listA, "、", null, null, (vp0) objK2, 30) + "）";
                    dr0Var2.p(false);
                }
                dr0 dr0Var3 = dr0Var2;
                ek2 ek2Var2 = ek2Var;
                p60 p60Var2 = p60Var;
                yy yyVar4 = yyVar;
                gw2.b(str3.concat(str), t03.J(og1Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(e13.a)).m, dr0Var3, 48, 0, 131068);
                dr0Var2 = dr0Var3;
                dr0Var2.V(-162609519);
                Map map = m63.a;
                for (String str4 : dv.M0(iterable, new eh2(ez1Var, (byte) 2))) {
                    ek2 ek2Var3 = ek2Var2;
                    boolean zH2 = dr0Var2.h(ek2Var3) | dr0Var2.f(str4);
                    Object objK3 = dr0Var2.K();
                    yy yyVar5 = yyVar4;
                    if (zH2 || objK3 == yyVar5) {
                        j63Var = this;
                        objK3 = new i63(ek2Var3, str4, j63Var.k);
                        dr0Var2.f0(objK3);
                    } else {
                        j63Var = this;
                    }
                    m63.c(ez1Var, j63Var.j, ek2Var3, str4, (kp0) objK3, dr0Var2, 72);
                    ek2Var2 = ek2Var3;
                    yyVar4 = yyVar5;
                }
                dr0Var2.p(false);
                p60Var = p60Var2;
                j63Var2 = this;
                yyVar3 = yyVar4;
            }
            dr0Var2.p(false);
            dr0Var2.p(true);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
