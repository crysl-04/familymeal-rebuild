package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dc extends m31 implements zp0 {
    public final /* synthetic */ byte i = 1;
    public final /* synthetic */ vp0 j;
    public final /* synthetic */ nx k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(ab0 ab0Var, rg1 rg1Var, vp0 vp0Var, dm dmVar, String str, vp0 vp0Var2, nx nxVar, int i) {
        super(2);
        this.l = ab0Var;
        this.m = rg1Var;
        this.j = vp0Var;
        this.n = dmVar;
        this.o = str;
        this.p = vp0Var2;
        this.k = nxVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.i;
        j23 j23Var = j23.a;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        Object obj6 = this.l;
        Object obj7 = this.m;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                zv1 zv1Var = (zv1) obj5;
                oc ocVar = (oc) obj4;
                qz2 qz2Var = (qz2) obj7;
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    lu1 lu1Var = qz2Var.e;
                    lu1 lu1Var2 = qz2Var.d;
                    boolean zG = dr0Var.g(uz0.g(obj6, lu1Var.getValue()));
                    Object objK = dr0Var.K();
                    vp0 vp0Var = this.j;
                    yy yyVar = zy.a;
                    if (zG || objK == yyVar) {
                        objK = (!uz0.g(obj6, lu1Var.getValue()) || zv1Var == null) ? (uz0.g(obj6, qz2Var.f().b()) || uz0.g(obj6, qz2Var.f().d())) ? (z00) vp0Var.h(ocVar) : (z00) vp0Var.h(new zv1(ocVar, qz2Var.f().b(), obj6)) : (z00) vp0Var.h(zv1Var);
                        dr0Var.f0(objK);
                    }
                    z00 z00Var = (z00) objK;
                    boolean zG2 = dr0Var.g(uz0.g(qz2Var.f().d(), obj6)) | dr0Var.g(uz0.g(obj6, lu1Var.getValue()));
                    Object objK2 = dr0Var.K();
                    if (zG2 || objK2 == yyVar) {
                        objK2 = (uz0.g(qz2Var.f().d(), obj6) || (uz0.g(obj6, lu1Var.getValue()) && zv1Var != null)) ? wh0.b : (uz0.g(obj6, qz2Var.f().b()) || uz0.g(obj6, qz2Var.f().d())) ? ((z00) vp0Var.h(ocVar)).b : ((z00) vp0Var.h(new zv1(ocVar, obj6, qz2Var.f().b()))).b;
                        dr0Var.f0(objK2);
                    }
                    wh0 wh0Var = (wh0) objK2;
                    Object objK3 = dr0Var.K();
                    if (objK3 == yyVar) {
                        objK3 = new jc(uz0.g(obj6, lu1Var2.getValue()));
                        dr0Var.f0(objK3);
                    }
                    jc jcVar = (jc) objK3;
                    ah0 ah0Var = z00Var.a;
                    x93 x93Var = new x93(z00Var.c.g(), obj6);
                    jcVar.h.setValue(Boolean.valueOf(uz0.g(obj6, lu1Var2.getValue())));
                    jcVar.i.setValue(Boolean.valueOf((!uz0.g(obj6, lu1Var.getValue()) || uz0.g(obj6, lu1Var2.getValue()) || uz0.g(obj6, qz2Var.a.g())) ? false : true));
                    rg1 rg1VarC = x93Var.c(jcVar);
                    qz2 qz2Var2 = (qz2) obj7;
                    boolean zH = dr0Var.h(obj6);
                    Object objK4 = dr0Var.K();
                    if (zH || objK4 == yyVar) {
                        objK4 = new zb(obj6, (byte) 0);
                        dr0Var.f0(objK4);
                    }
                    vp0 vp0Var2 = (vp0) objK4;
                    boolean zF = dr0Var.f(wh0Var);
                    Object objK5 = dr0Var.K();
                    if (zF || objK5 == yyVar) {
                        objK5 = new ac(wh0Var);
                        dr0Var.f0(objK5);
                    }
                    t03.a(qz2Var2, vp0Var2, rg1VarC, ah0Var, wh0Var, (zp0) objK5, dt.N(1831990167, new cc(obj6, (ll2) obj3, ocVar, this.k), dr0Var), dr0Var, 100663296);
                }
                break;
            default:
                ((Number) obj2).intValue();
                ia2.a((ab0) obj6, (rg1) obj7, this.j, (dm) obj5, (String) obj4, (vp0) obj3, this.k, (dr0) obj, m02.A(1597441));
                break;
        }
        return j23Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(Object obj, qz2 qz2Var, zv1 zv1Var, vp0 vp0Var, oc ocVar, ll2 ll2Var, nx nxVar) {
        super(2);
        this.l = obj;
        this.m = qz2Var;
        this.n = zv1Var;
        this.j = vp0Var;
        this.o = ocVar;
        this.p = ll2Var;
        this.k = nxVar;
    }
}
