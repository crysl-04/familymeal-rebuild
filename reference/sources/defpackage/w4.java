package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w4 implements zp0 {
    public final /* synthetic */ nx h;
    public final /* synthetic */ nx i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ nx m;

    public w4(nx nxVar, nx nxVar2, long j, long j2, long j3, long j4, nx nxVar3) {
        this.h = nxVar;
        this.i = nxVar2;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = nxVar3;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        byte b = 1;
        byte b2 = 0;
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            rg1 rg1VarF = t03.F(og1.h, b5.a);
            aw awVarA = yv.a(uz0.g, c5.u, dr0Var, 0);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarF);
            sy.f.getClass();
            dr0Var.Y();
            boolean z = dr0Var.S;
            jw0 jw0Var = l41.W;
            if (z) {
                dr0Var.k(jw0Var);
            } else {
                dr0Var.i0();
            }
            yx yxVar = c5.F;
            h12.y(yxVar, dr0Var, awVarA);
            yx yxVar2 = c5.E;
            h12.y(yxVar2, dr0Var, dx1VarL);
            yx yxVar3 = c5.G;
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar3);
            }
            yx yxVar4 = c5.D;
            h12.y(yxVar4, dr0Var, rg1VarU);
            dr0Var.V(346092326);
            dr0Var.p(false);
            nx nxVar = this.h;
            if (nxVar == null) {
                dr0Var.V(346396529);
            } else {
                dr0Var.V(346396530);
                h12.a(this.j, e13.a(s60.r, dr0Var), dt.N(71284337, new v4(nxVar, b2), dr0Var), dr0Var, 384);
            }
            dr0Var.p(false);
            nx nxVar2 = this.i;
            if (nxVar2 == null) {
                dr0Var.V(347174009);
            } else {
                dr0Var.V(347174010);
                h12.a(this.k, e13.a(s60.t, dr0Var), dt.N(705583346, new v4(nxVar2, b), dr0Var), dr0Var, 384);
            }
            dr0Var.p(false);
            kt0 kt0Var = new kt0(c5.w);
            ze1 ze1VarC = ho.c(c5.i, false);
            int iHashCode2 = Long.hashCode(dr0Var.T);
            dx1 dx1VarL2 = dr0Var.l();
            rg1 rg1VarU2 = ls.U(dr0Var, kt0Var);
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(jw0Var);
            } else {
                dr0Var.i0();
            }
            h12.y(yxVar, dr0Var, ze1VarC);
            h12.y(yxVar2, dr0Var, dx1VarL2);
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode2))) {
                wi0.o(iHashCode2, dr0Var, iHashCode2, yxVar3);
            }
            h12.y(yxVar4, dr0Var, rg1VarU2);
            h12.a(this.l, e13.a(s60.n, dr0Var), this.m, dr0Var, 0);
            dr0Var.p(true);
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
