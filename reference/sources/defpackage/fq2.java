package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fq2 implements zp0 {
    public final /* synthetic */ rg1 h;
    public final /* synthetic */ hi2 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ float k;
    public final /* synthetic */ zn l;
    public final /* synthetic */ float m;
    public final /* synthetic */ nx n;

    public fq2(rg1 rg1Var, hi2 hi2Var, long j, float f, zn znVar, float f2, nx nxVar) {
        this.h = rg1Var;
        this.i = hi2Var;
        this.j = j;
        this.k = f;
        this.l = znVar;
        this.m = f2;
        this.n = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zN = dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2);
        j23 j23Var = j23.a;
        if (!zN) {
            dr0Var.Q();
            return j23Var;
        }
        rg1 rg1VarD = iq2.d(this.h, this.i, iq2.e(this.j, this.k, dr0Var), this.l, ((e90) dr0Var.j(uz.h)).A(this.m));
        Object objK = dr0Var.K();
        yy yyVar = zy.a;
        if (objK == yyVar) {
            objK = new jc2((byte) 26);
            dr0Var.f0(objK);
        }
        rg1 rg1VarA = tg2.a(rg1VarD, false, (vp0) objK);
        Object objK2 = dr0Var.K();
        if (objK2 == yyVar) {
            objK2 = w70.c;
            dr0Var.f0(objK2);
        }
        rg1 rg1VarA2 = oq2.a(rg1VarA, j23Var, (PointerInputEventHandler) objK2);
        ze1 ze1VarC = ho.c(c5.i, true);
        int iHashCode = Long.hashCode(dr0Var.T);
        dx1 dx1VarL = dr0Var.l();
        rg1 rg1VarU = ls.U(dr0Var, rg1VarA2);
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
        wi0.n(0, this.n, dr0Var, true);
        return j23Var;
    }
}
