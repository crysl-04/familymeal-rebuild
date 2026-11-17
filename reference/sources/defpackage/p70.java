package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p70 implements zp0 {
    public final /* synthetic */ byte h;
    public final Object i;

    public /* synthetic */ p70(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var;
        byte b = this.h;
        wa2 wa2Var = wa2.a;
        byte b2 = 6;
        jw0 jw0Var = l41.W;
        og1 og1Var = og1.h;
        j23 j23Var = j23.a;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                im1 im1Var = (im1) obj3;
                if (!dr0Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    rg1 rg1VarA = tg2.a(yj2.a(ie1.F(yj2.a, im1Var.d), Float.NaN, hm1.a), false, new jc2((byte) 20));
                    ah ahVar = new ah(hm1.b, new wg((byte) 0));
                    cm cmVar = c5.s;
                    nx nxVar = im1Var.e;
                    ua2 ua2VarA = ta2.a(ahVar, cmVar, dr0Var2, 54);
                    int iHashCode = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL = dr0Var2.l();
                    rg1 rg1VarU = ls.U(dr0Var2, rg1VarA);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(c5.F, dr0Var2, ua2VarA);
                    h12.y(c5.E, dr0Var2, dx1VarL);
                    yx yxVar = c5.G;
                    if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode))) {
                        wi0.o(iHashCode, dr0Var2, iHashCode, yxVar);
                    }
                    h12.y(c5.D, dr0Var2, rg1VarU);
                    nxVar.c(wa2Var, dr0Var2, 6);
                    dr0Var2.p(true);
                }
                break;
            case 1:
                byte b3 = ((ul0) obj).a;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Integer numB = yl0.b(b3);
                if (numB != null) {
                    int iIntValue2 = numB.intValue();
                    ((t6) obj3).playSoundEffect(Build.VERSION.SDK_INT >= 31 ? ud.a.a(iIntValue2, zBooleanValue) : SoundEffectConstants.getContantForFocusDirection(iIntValue2));
                }
                break;
            case 2:
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                sj1 sj1Var = (sj1) obj3;
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dr0Var3.Q();
                } else {
                    if (co2.X((CharSequence) sj1Var.getValue())) {
                        dr0Var = dr0Var3;
                        dr0Var.V(-1548950640);
                    } else {
                        dr0Var3.V(-327061465);
                        gw2.b((String) sj1Var.getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262142);
                        dr0Var = dr0Var3;
                    }
                    dr0Var.p(false);
                }
                break;
            case 3:
                dr0 dr0Var4 = (dr0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                wk wkVar = (wk) obj3;
                if (!dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dr0Var4.Q();
                } else {
                    String strL = h12.l(R.string.m3c_dialog, dr0Var4);
                    rg1 rg1Var = (rg1) wkVar.j;
                    rt1 rt1Var = b5.a;
                    rg1 rg1VarL = yj2.l(rg1Var, 280.0f, 0.0f, 560.0f, 10);
                    boolean zF = dr0Var4.f(strL);
                    Object objK = dr0Var4.K();
                    if (zF || objK == zy.a) {
                        objK = new ql(strL, b2);
                        dr0Var4.f0(objK);
                    }
                    rg1 rg1VarC = rg1VarL.c(tg2.a(og1Var, false, (vp0) objK));
                    ze1 ze1VarC = ho.c(c5.i, true);
                    int iHashCode2 = Long.hashCode(dr0Var4.T);
                    dx1 dx1VarL2 = dr0Var4.l();
                    rg1 rg1VarU2 = ls.U(dr0Var4, rg1VarC);
                    sy.f.getClass();
                    dr0Var4.Y();
                    if (dr0Var4.S) {
                        dr0Var4.k(jw0Var);
                    } else {
                        dr0Var4.i0();
                    }
                    h12.y(c5.F, dr0Var4, ze1VarC);
                    h12.y(c5.E, dr0Var4, dx1VarL2);
                    yx yxVar2 = c5.G;
                    if (dr0Var4.S || !uz0.g(dr0Var4.K(), Integer.valueOf(iHashCode2))) {
                        wi0.o(iHashCode2, dr0Var4, iHashCode2, yxVar2);
                    }
                    h12.y(c5.D, dr0Var4, rg1VarU2);
                    wi0.n(0, (nx) wkVar.l, dr0Var4, true);
                }
                break;
            case 4:
                dr0 dr0Var5 = (dr0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!dr0Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dr0Var5.Q();
                } else {
                    xg xgVar = uz0.f;
                    cm cmVar2 = c5.s;
                    nx nxVar2 = ((sj2) obj3).f;
                    ua2 ua2VarA2 = ta2.a(xgVar, cmVar2, dr0Var5, 54);
                    int iHashCode3 = Long.hashCode(dr0Var5.T);
                    dx1 dx1VarL3 = dr0Var5.l();
                    rg1 rg1VarU3 = ls.U(dr0Var5, og1Var);
                    sy.f.getClass();
                    dr0Var5.Y();
                    if (dr0Var5.S) {
                        dr0Var5.k(jw0Var);
                    } else {
                        dr0Var5.i0();
                    }
                    h12.y(c5.F, dr0Var5, ua2VarA2);
                    h12.y(c5.E, dr0Var5, dx1VarL3);
                    yx yxVar3 = c5.G;
                    if (dr0Var5.S || !uz0.g(dr0Var5.K(), Integer.valueOf(iHashCode3))) {
                        wi0.o(iHashCode3, dr0Var5, iHashCode3, yxVar3);
                    }
                    h12.y(c5.D, dr0Var5, rg1VarU3);
                    nxVar2.c(wa2Var, dr0Var5, 6);
                    dr0Var5.p(true);
                }
                break;
            case 5:
                dr0 dr0Var6 = (dr0) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!dr0Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    dr0Var6.Q();
                } else {
                    ho.a(av0.a(ou.o(s60.w(og1Var, "indicatorRipple"), mi2.a(aa3.G, dr0Var6)), (ce1) obj3, y92.a(0.0f, 7, 0L, false)), dr0Var6, 0);
                }
                break;
            case 6:
                dr0 dr0Var7 = (dr0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!dr0Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    dr0Var7.Q();
                } else {
                    gw2.b(((dy1) obj3).b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var7, 0, 0, 262142);
                }
                break;
            case 7:
                dr0 dr0Var8 = (dr0) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (!dr0Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    dr0Var8.Q();
                } else {
                    gw2.b(((j62) obj3).b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var8, 0, 0, 262142);
                }
                break;
            default:
                dr0 dr0Var9 = (dr0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!dr0Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    dr0Var9.Q();
                } else {
                    gw2.a(xw2.a(e13.a(p22.g, dr0Var9), 0L, 0L, null, null, 0L, 0L, null, 16744447), (zp0) obj3, dr0Var9, 0);
                }
                break;
        }
        return j23Var;
    }
}
