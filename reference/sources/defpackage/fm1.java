package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fm1 implements zp0 {
    public final /* synthetic */ yl1 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ zm2 k;
    public final /* synthetic */ nx l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ nx n;

    public fm1(yl1 yl1Var, boolean z, boolean z2, zm2 zm2Var, nx nxVar, boolean z3, nx nxVar2) {
        this.h = yl1Var;
        this.i = z;
        this.j = z2;
        this.k = zm2Var;
        this.l = nxVar;
        this.m = z3;
        this.n = nxVar2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        long j;
        rg1 iuVar;
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.j;
            boolean z2 = this.i;
            yl1 yl1Var = this.h;
            if (z) {
                j = z2 ? yl1Var.a : yl1Var.d;
            } else {
                j = yl1Var.f;
            }
            kn2 kn2VarA = vj2.a(j, this.k, dr0Var);
            if (this.l == null || !(this.m || z2)) {
                dr0Var.V(-634793532);
                dr0Var.p(false);
                iuVar = og1.h;
            } else {
                dr0Var.V(-634794445);
                Object objK = dr0Var.K();
                if (objK == zy.a) {
                    objK = new de1((byte) 12);
                    dr0Var.f0(objK);
                }
                AtomicInteger atomicInteger = tg2.a;
                iuVar = new iu((vp0) objK);
                dr0Var.p(false);
            }
            ze1 ze1VarC = ho.c(c5.i, false);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, iuVar);
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
            ie0 ie0Var = s00.a;
            kv kvVar = (kv) kn2VarA.getValue();
            long j2 = kvVar.a;
            ys.a(ie0Var.a(kvVar), this.n, dr0Var, 8);
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
