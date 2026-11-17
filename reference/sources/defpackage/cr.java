package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cr implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ cr(nx nxVar, nx nxVar2, nx nxVar3, nx nxVar4, nx nxVar5, int i) {
        this.h = (byte) 2;
        this.m = nxVar;
        this.i = nxVar2;
        this.j = nxVar3;
        this.k = nxVar4;
        this.l = nxVar5;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        yy yyVar = zy.a;
        Object obj3 = this.l;
        Object obj4 = this.k;
        j23 j23Var = j23.a;
        Object obj5 = this.m;
        Object obj6 = this.j;
        Object obj7 = this.i;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                t03.d((rg1) obj7, (hi2) obj6, (ar) obj4, (br) obj3, (nx) obj5, (dr0) obj, m02.A(196615));
                break;
            case 1:
                pk1 pk1Var = (pk1) obj7;
                ka0 ka0Var = (ka0) obj6;
                pb2 pb2Var = (pb2) obj4;
                ll2 ll2Var = (ll2) obj3;
                ja0 ja0Var = (ja0) obj5;
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    boolean zH = dr0Var.h(pk1Var) | dr0Var.h(ka0Var);
                    Object objK = dr0Var.K();
                    if (zH || objK == yyVar) {
                        objK = new qb((Object) ll2Var, (Object) pk1Var, (Object) ka0Var, (byte) 7);
                        dr0Var.f0(objK);
                    }
                    h7.G(pk1Var, (vp0) objK, dr0Var);
                    ou.i(pk1Var, pb2Var, dt.N(-497631156, new j7(ja0Var, pk1Var, (byte) 13), dr0Var), dr0Var, 384);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                cu.l((nx) obj5, (nx) obj7, (nx) obj6, (nx) obj4, (nx) obj3, (dr0) obj, m02.A(385));
                break;
            case 3:
                rg1 rg1Var = (rg1) obj7;
                sj1 sj1Var = (sj1) obj6;
                nx nxVar = (nx) obj5;
                gl glVar = (gl) obj4;
                kp0 kp0Var = (kp0) obj3;
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    Object objK2 = dr0Var2.K();
                    if (objK2 == yyVar) {
                        objK2 = new cb(sj1Var, (byte) 5);
                        dr0Var2.f0(objK2);
                    }
                    rg1 rg1VarV = tz0.v(rg1Var, (vp0) objK2);
                    ze1 ze1VarC = ho.c(c5.i, true);
                    int iHashCode = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL = dr0Var2.l();
                    rg1 rg1VarU = ls.U(dr0Var2, rg1VarV);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(l41.W);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(c5.F, dr0Var2, ze1VarC);
                    h12.y(c5.E, dr0Var2, dx1VarL);
                    h12.y(c5.G, dr0Var2, Integer.valueOf(iHashCode));
                    h12.t(dr0Var2);
                    h12.y(c5.D, dr0Var2, rg1VarU);
                    nxVar.f(dr0Var2, 0);
                    glVar.b(kp0Var, dr0Var2, 6);
                    dr0Var2.p(true);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                t03.i((qz2) obj7, (oz2) obj6, this.k, this.l, (oj0) obj5, (dr0) obj, m02.A(1));
                break;
            default:
                ((Integer) obj2).getClass();
                m63.c((ez1) obj7, (p63) obj6, (ek2) obj4, (String) obj3, (kp0) obj5, (dr0) obj, m02.A(73));
                break;
        }
        return j23Var;
    }

    public /* synthetic */ cr(rg1 rg1Var, sj1 sj1Var, nx nxVar, gl glVar, kp0 kp0Var) {
        this.h = (byte) 3;
        this.i = rg1Var;
        this.j = sj1Var;
        this.m = nxVar;
        this.k = glVar;
        this.l = kp0Var;
    }

    public /* synthetic */ cr(pk1 pk1Var, ka0 ka0Var, pb2 pb2Var, ll2 ll2Var, ja0 ja0Var) {
        this.h = (byte) 1;
        this.i = pk1Var;
        this.j = ka0Var;
        this.k = pb2Var;
        this.l = ll2Var;
        this.m = ja0Var;
    }

    public /* synthetic */ cr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
        this.m = obj5;
    }
}
