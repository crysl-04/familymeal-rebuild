package defpackage;

import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ws1 implements zp0 {
    public final /* synthetic */ hi2 A;
    public final /* synthetic */ rg1 h;
    public final /* synthetic */ nx i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ au2 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ vp0 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ xw2 o;
    public final /* synthetic */ c31 p;
    public final /* synthetic */ b31 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ v53 u;
    public final /* synthetic */ ui1 v;
    public final /* synthetic */ nx w;
    public final /* synthetic */ nx x;
    public final /* synthetic */ nx y;
    public final /* synthetic */ nx z;

    /* JADX WARN: Multi-variable type inference failed */
    public ws1(rg1 rg1Var, nx nxVar, boolean z, au2 au2Var, String str, vp0 vp0Var, boolean z2, xw2 xw2Var, c31 c31Var, b31 b31Var, boolean z3, int i, int i2, v53 v53Var, ui1 ui1Var, nx nxVar2, nx nxVar3, nx nxVar4, nx nxVar5, hi2 hi2Var) {
        this.h = rg1Var;
        this.i = nxVar;
        this.j = z;
        this.k = au2Var;
        this.l = str;
        this.m = vp0Var;
        this.n = z2;
        this.o = xw2Var;
        this.p = c31Var;
        this.q = b31Var;
        this.r = z3;
        this.s = i;
        this.t = i2;
        this.u = v53Var;
        this.v = ui1Var;
        this.w = nxVar2;
        this.x = nxVar3;
        this.y = nxVar4;
        this.z = nxVar5;
        this.A = hi2Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            nx nxVar = this.i;
            rg1 rg1VarJ = og1.h;
            if (nxVar != null) {
                dr0Var.V(-903490605);
                Object objK = dr0Var.K();
                if (objK == zy.a) {
                    objK = new de1((byte) 18);
                    dr0Var.f0(objK);
                }
                rg1VarJ = t03.J(tg2.a(rg1VarJ, true, (vp0) objK), 0.0f, y02.r(dr0Var), 0.0f, 0.0f, 13);
                dr0Var.p(false);
            } else {
                dr0Var.V(-903106918);
                dr0Var.p(false);
            }
            rg1 rg1VarC = this.h.c(rg1VarJ);
            String strL = h12.l(R.string.default_error_message, dr0Var);
            boolean z = this.j;
            if (z) {
                rg1VarC = tg2.a(rg1VarC, false, new ql(strL, (byte) 28));
            }
            rg1 rg1VarA = yj2.a(rg1VarC, 280.0f, 56.0f);
            au2 au2Var = this.k;
            rl2 rl2Var = new rl2(z ? au2Var.j : au2Var.i);
            nx nxVar2 = this.z;
            hi2 hi2Var = this.A;
            String str = this.l;
            boolean z2 = this.n;
            boolean z3 = this.r;
            v53 v53Var = this.u;
            ui1 ui1Var = this.v;
            s60.b(str, this.m, rg1VarA, z2, this.o, this.p, this.q, z3, this.s, this.t ? 1 : 0, v53Var, null, ui1Var, rl2Var, dt.N(-1189274459, new vs1(str, z2, z3, v53Var, ui1Var, this.j, this.i, this.w, this.x, this.y, nxVar2, au2Var, hi2Var), dr0Var), dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
