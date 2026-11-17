package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y70 {
    public static final y70 a = new y70();

    public final void a(sj2 sj2Var, dr0 dr0Var, int i) {
        dr0 dr0Var2 = dr0Var;
        float f = sj2Var.g;
        dr0Var2.W(2137486921);
        byte b = 4;
        int i2 = i | (dr0Var2.f(sj2Var) ? 4 : 2);
        byte b2 = 0;
        if (dr0Var2.N(i2 & 1, (i2 & 3) != 2)) {
            sy2 sy2Var = sj2Var.i;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                wg.m("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zF = dr0Var2.f(sy2Var) | dr0Var2.f(null);
            Object objK = dr0Var2.K();
            yy yyVar = zy.a;
            if (zF || objK == yyVar) {
                objK = il2.b(new x70(sj2Var, (byte) 0));
                dr0Var2.f0(objK);
            }
            kn2 kn2VarA = vj2.a(((kv) ((kn2) objK).getValue()).a, ls.a0(gh1.j, dr0Var2), dr0Var2);
            nx nxVarN = dt.N(-1658896622, new p70(sj2Var, b), dr0Var2);
            dr0Var2.V(690108113);
            dr0Var2.p(false);
            rg1 rg1Var = sj2Var.a;
            og1 og1Var = og1.h;
            rg1 rg1VarC = rg1Var.c(og1Var);
            boolean zF2 = dr0Var2.f(kn2VarA);
            Object objK2 = dr0Var2.K();
            if (zF2 || objK2 == yyVar) {
                objK2 = new u70(kn2VarA, b2);
                dr0Var2.f0(objK2);
            }
            rg1 rg1VarH = aa3.h(rg1VarC, (vp0) objK2);
            Object objK3 = dr0Var2.K();
            if (objK3 == yyVar) {
                objK3 = new rt((byte) 15);
                dr0Var2.f0(objK3);
            }
            rg1 rg1VarA = tg2.a(rg1VarH, false, (vp0) objK3);
            Object objK4 = dr0Var2.K();
            if (objK4 == yyVar) {
                objK4 = w70.b;
                dr0Var2.f0(objK4);
            }
            rg1 rg1VarA2 = oq2.a(rg1VarA, j23.a, (PointerInputEventHandler) objK4);
            ze1 ze1VarC = ho.c(c5.i, false);
            int iHashCode = Long.hashCode(dr0Var2.T);
            dx1 dx1VarL = dr0Var2.l();
            rg1 rg1VarU = ls.U(dr0Var2, rg1VarA2);
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
            rg1 rg1VarP = ou.p(ie1.F(og1Var, sj2Var.h));
            ie0 ie0Var = de.a;
            b2 = (i2 & 14) == 4 ? (byte) 1 : (byte) 0;
            Object objK5 = dr0Var2.K();
            if (b2 != 0 || objK5 == yyVar) {
                objK5 = new v70();
                dr0Var2.f0(objK5);
            }
            bk0 bk0Var = (bk0) objK5;
            long j = sy2Var.c;
            long j2 = sy2Var.d;
            long j3 = sy2Var.e;
            long j4 = sy2Var.f;
            nx nxVar = sj2Var.b;
            xw2 xw2Var = sj2Var.c;
            xw2 xw2Var2 = sj2Var.d;
            nx nxVar2 = sj2Var.e;
            float f2 = sj2Var.g;
            Object objK6 = dr0Var2.K();
            if (objK6 == yyVar) {
                objK6 = new sz((byte) 25);
                dr0Var2.f0(objK6);
            }
            de.c(rg1VarP, bk0Var, j, j2, j4, j3, nxVar, xw2Var, xw2Var2, (kp0) objK6, nxVar2, nxVarN, f2, dr0Var2, 0);
            dr0Var2 = dr0Var2;
            dr0Var2.p(true);
        } else {
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new j7((byte) 9, i, this, sj2Var);
        }
    }
}
