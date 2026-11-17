package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q50 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public q50(hi2 hi2Var, s40 s40Var, nx nxVar, nx nxVar2, nx nxVar3) {
        this.h = (byte) 1;
        this.m = hi2Var;
        this.i = s40Var;
        this.j = nxVar;
        this.k = nxVar2;
        this.l = nxVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        ?? r3;
        dr0 dr0Var;
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj3 = this.m;
        Object obj4 = this.i;
        Object obj5 = this.l;
        Object obj6 = this.k;
        Object obj7 = this.j;
        byte b2 = 1;
        switch (b) {
            case 0:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    yi0 yi0Var = yj2.a;
                    nx nxVar = (nx) obj7;
                    nx nxVar2 = (nx) obj6;
                    nx nxVar3 = (nx) obj5;
                    s40 s40Var = (s40) obj4;
                    xw2 xw2Var = (xw2) obj3;
                    aw awVarA = yv.a(uz0.g, c5.u, dr0Var2, 0);
                    int iHashCode = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL = dr0Var2.l();
                    rg1 rg1VarU = ls.U(dr0Var2, yi0Var);
                    sy.f.getClass();
                    dr0Var2.Y();
                    boolean z = dr0Var2.S;
                    jw0 jw0Var = l41.W;
                    if (z) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    yx yxVar = c5.F;
                    h12.y(yxVar, dr0Var2, awVarA);
                    yx yxVar2 = c5.E;
                    h12.y(yxVar2, dr0Var2, dx1VarL);
                    yx yxVar3 = c5.G;
                    if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode))) {
                        wi0.o(iHashCode, dr0Var2, iHashCode, yxVar3);
                    }
                    yx yxVar4 = c5.D;
                    h12.y(yxVar4, dr0Var2, rg1VarU);
                    ua2 ua2VarA = ta2.a(nxVar != null ? nxVar2 != null ? uz0.j : uz0.e : uz0.f, c5.s, dr0Var2, 48);
                    int iHashCode2 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL2 = dr0Var2.l();
                    rg1 rg1VarU2 = ls.U(dr0Var2, yi0Var);
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(yxVar, dr0Var2, ua2VarA);
                    h12.y(yxVar2, dr0Var2, dx1VarL2);
                    if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode2))) {
                        wi0.o(iHashCode2, dr0Var2, iHashCode2, yxVar3);
                    }
                    h12.y(yxVar4, dr0Var2, rg1VarU2);
                    if (nxVar != null) {
                        dr0Var2.V(-516028300);
                        gw2.a(xw2Var, dt.N(-738208900, new v4(nxVar, (byte) 3), dr0Var2), dr0Var2, 48);
                        r3 = 0;
                        dr0Var2.p(false);
                    } else {
                        r3 = 0;
                        dr0Var2.V(-515838022);
                        dr0Var2.p(false);
                    }
                    if (nxVar2 == null) {
                        dr0Var2.V(-515799087);
                    } else {
                        dr0Var2.V(260455984);
                        nxVar2.f(dr0Var2, Integer.valueOf((int) r3));
                    }
                    dr0Var2.p(r3);
                    dr0Var2.p(true);
                    if (nxVar3 == null && nxVar == null && nxVar2 == null) {
                        dr0Var2.V(-250277930);
                        dr0Var2.p(r3);
                        dr0Var = dr0Var2;
                    } else {
                        dr0Var2.V(-250360576);
                        ie1.c(null, 0.0f, s40Var.x, dr0Var2, 0, 3);
                        dr0 dr0Var3 = dr0Var2;
                        dr0Var3.p(false);
                        dr0Var = dr0Var3;
                    }
                    dr0Var.p(true);
                }
                break;
            case 1:
                dr0 dr0Var4 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var4.Q();
                } else {
                    iq2.a(yj2.d(yj2.h(og1.h, tz0.o), 0.0f, tz0.m, 1), (hi2) obj3, ((s40) obj4).a, 0L, 0.0f, dt.N(1782015378, new wr2((nx) obj7, (nx) obj6, (nx) obj5, b2), dr0Var4), dr0Var4, 12582918, 104);
                }
                break;
            case 2:
                dr0 dr0Var5 = (dr0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                o60 o60Var = (o60) obj7;
                if (!dr0Var5.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dr0Var5.Q();
                } else {
                    Long lB = o60Var.b();
                    long j = ((iq) o60Var.e.getValue()).e;
                    int iA = o60Var.a();
                    boolean zF = dr0Var5.f(o60Var);
                    Object objK = dr0Var5.K();
                    yy yyVar = zy.a;
                    if (zF || objK == yyVar) {
                        objK = new t50(o60Var, (byte) 1);
                        dr0Var5.f0(objK);
                    }
                    vp0 vp0Var = (vp0) objK;
                    boolean zF2 = dr0Var5.f(o60Var);
                    Object objK2 = dr0Var5.K();
                    if (zF2 || objK2 == yyVar) {
                        objK2 = new t50(o60Var, (byte) 2);
                        dr0Var5.f0(objK2);
                    }
                    n60.k(lB, j, iA, vp0Var, (vp0) objK2, (hq) obj6, o60Var.a, (y40) obj5, (vf2) o60Var.d.getValue(), (s40) obj4, (gm0) obj3, dr0Var5, 0);
                }
                break;
            default:
                dr0 dr0Var6 = (dr0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!dr0Var6.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dr0Var6.Q();
                } else {
                    cu.l((nx) obj7, (nx) obj6, (nx) obj5, (nx) obj4, (nx) obj3, dr0Var6, 384);
                }
                break;
        }
        return j23Var;
    }

    public /* synthetic */ q50(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.h = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.i = obj4;
        this.m = obj5;
    }
}
