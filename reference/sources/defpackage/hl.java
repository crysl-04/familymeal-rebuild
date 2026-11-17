package defpackage;

import java.time.LocalDate;
import java.time.ZoneOffset;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hl implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ hl(o60 o60Var, kp0 kp0Var, vp0 vp0Var, LocalDate localDate) {
        this.h = (byte) 5;
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        this.i = o60Var;
        this.j = vp0Var;
        this.k = localDate;
        this.l = kp0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        yy yyVar = zy.a;
        j23 j23Var = j23.a;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        switch (b) {
            case 0:
                rg1 rg1Var = (rg1) obj6;
                sj1 sj1Var = (sj1) obj5;
                nx nxVar = (nx) obj4;
                gl glVar = (gl) obj3;
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    Object objK = dr0Var.K();
                    if (objK == yyVar) {
                        objK = new cb(sj1Var, (byte) 2);
                        dr0Var.f0(objK);
                    }
                    rg1 rg1VarV = tz0.v(rg1Var, (vp0) objK);
                    ze1 ze1VarC = ho.c(c5.i, true);
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, rg1VarV);
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(l41.W);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, ze1VarC);
                    h12.y(c5.E, dr0Var, dx1VarL);
                    h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
                    h12.t(dr0Var);
                    h12.y(c5.D, dr0Var, rg1VarU);
                    nxVar.f(dr0Var, 0);
                    Object objK2 = dr0Var.K();
                    if (objK2 == yyVar) {
                        objK2 = new bb(sj1Var, (byte) 9);
                        dr0Var.f0(objK2);
                    }
                    glVar.b((kp0) objK2, dr0Var, 6);
                    dr0Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                es.h((p21) obj5, (rg1) obj6, (d71) obj4, (u61) obj3, (dr0) obj, m02.A(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                vs.f((Boolean) obj6, (ll1) obj5, (e91) obj4, (vp0) obj3, (dr0) obj, m02.A(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                he1.b((pv) obj6, (li2) obj5, (c13) obj3, (nx) obj4, (dr0) obj, m02.A(3073));
                break;
            case 4:
                ((Integer) obj2).getClass();
                m63.b((ez1) obj6, (ek2) obj5, (String) obj4, (kp0) obj3, (dr0) obj, m02.A(3081));
                break;
            default:
                o60 o60Var = (o60) obj6;
                vp0 vp0Var = (vp0) obj5;
                LocalDate localDate = (LocalDate) obj4;
                kp0 kp0Var = (kp0) obj3;
                ZoneOffset zoneOffset = ZoneOffset.UTC;
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    boolean zF = dr0Var2.f(o60Var) | dr0Var2.f(vp0Var) | dr0Var2.h(localDate) | dr0Var2.f(kp0Var);
                    Object objK3 = dr0Var2.K();
                    if (zF || objK3 == yyVar) {
                        objK3 = new a8(o60Var, kp0Var, vp0Var, localDate);
                        dr0Var2.f0(objK3);
                    }
                    aa3.e((kp0) objK3, null, false, null, null, null, ia2.h, dr0Var2, 805306368, 510);
                }
                break;
        }
        return j23Var;
    }

    public /* synthetic */ hl(pv pvVar, li2 li2Var, c13 c13Var, nx nxVar, int i) {
        this.h = (byte) 3;
        this.i = pvVar;
        this.j = li2Var;
        this.l = c13Var;
        this.k = nxVar;
    }

    public /* synthetic */ hl(p21 p21Var, rg1 rg1Var, d71 d71Var, u61 u61Var, int i) {
        this.h = (byte) 1;
        this.j = p21Var;
        this.i = rg1Var;
        this.k = d71Var;
        this.l = u61Var;
    }

    public /* synthetic */ hl(rg1 rg1Var, sj1 sj1Var, nx nxVar, gl glVar) {
        this.h = (byte) 0;
        this.i = rg1Var;
        this.j = sj1Var;
        this.k = nxVar;
        this.l = glVar;
    }

    public /* synthetic */ hl(Object obj, Object obj2, Object obj3, hq0 hq0Var, int i, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = hq0Var;
    }
}
