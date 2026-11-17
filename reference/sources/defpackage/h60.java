package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h60 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ String i;
    public final /* synthetic */ s40 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;

    public /* synthetic */ h60(String str, s40 s40Var, boolean z, boolean z2, boolean z3, byte b) {
        this.h = b;
        this.i = str;
        this.j = s40Var;
        this.k = z;
        this.l = z2;
        this.m = z3;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x019f  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ab  */
    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        long j;
        byte b = this.h;
        j23 j23Var = j23.a;
        gh1 gh1Var = gh1.j;
        yy yyVar = zy.a;
        jw0 jw0Var = l41.W;
        boolean z = this.m;
        boolean z2 = this.l;
        boolean z3 = this.k;
        s40 s40Var = this.j;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    yi0 yi0Var = yj2.a;
                    ze1 ze1VarC = ho.c(c5.m, false);
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, yi0Var);
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(jw0Var);
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
                    Object objK = dr0Var.K();
                    if (objK == yyVar) {
                        objK = new rt((byte) 12);
                        dr0Var.f0(objK);
                    }
                    AtomicInteger atomicInteger = tg2.a;
                    iu iuVar = new iu((vp0) objK);
                    s40Var.getClass();
                    if (z2) {
                        if (z) {
                            j = s40Var.j;
                        } else if (!z) {
                            j = s40Var.k;
                        } else if (!z3) {
                            if (z) {
                                j = s40Var.g;
                            } else {
                                j = s40Var.h;
                            }
                        } else if (z) {
                            j = s40Var.g;
                        } else {
                            j = s40Var.h;
                        }
                    } else if (!z3 && z) {
                        j = s40Var.i;
                    } else if (z) {
                        j = s40Var.g;
                    } else {
                        j = s40Var.h;
                    }
                    gw2.b(this.i, iuVar, ((kv) vj2.a(j, ls.a0(gh1Var, dr0Var), dr0Var).getValue()).a, 0L, null, 0L, new zs2(3), 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 261112);
                    dr0Var.p(true);
                }
                break;
            default:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    rg1 rg1VarF = yj2.f(og1.h, tz0.r, tz0.p);
                    ze1 ze1VarC2 = ho.c(c5.m, false);
                    int iHashCode2 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL2 = dr0Var2.l();
                    rg1 rg1VarU2 = ls.U(dr0Var2, rg1VarF);
                    sy.f.getClass();
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(c5.F, dr0Var2, ze1VarC2);
                    h12.y(c5.E, dr0Var2, dx1VarL2);
                    yx yxVar2 = c5.G;
                    if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode2))) {
                        wi0.o(iHashCode2, dr0Var2, iHashCode2, yxVar2);
                    }
                    h12.y(c5.D, dr0Var2, rg1VarU2);
                    Object objK2 = dr0Var2.K();
                    if (objK2 == yyVar) {
                        objK2 = new rt((byte) 10);
                        dr0Var2.f0(objK2);
                    }
                    AtomicInteger atomicInteger2 = tg2.a;
                    iu iuVar2 = new iu((vp0) objK2);
                    long j2 = s40Var.o;
                    if (z2) {
                        if (z) {
                            j2 = s40Var.p;
                        } else if (!z) {
                            j2 = s40Var.q;
                        } else if (!z3) {
                            if (z) {
                                j2 = s40Var.n;
                            }
                        } else if (z) {
                            j2 = s40Var.n;
                        }
                    } else if (!z3 && z) {
                        j2 = s40Var.t;
                    } else if (z) {
                        j2 = s40Var.n;
                    }
                    dr0Var2.V(-969417610);
                    kn2 kn2VarA = vj2.a(j2, ls.a0(gh1Var, dr0Var2), dr0Var2);
                    dr0Var2.p(false);
                    gw2.b(this.i, iuVar2, ((kv) kn2VarA.getValue()).a, 0L, null, 0L, new zs2(3), 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 261112);
                    dr0Var2.p(true);
                }
                break;
        }
        return j23Var;
    }
}
