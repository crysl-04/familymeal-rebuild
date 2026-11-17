package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ho {
    public static final mj1 a = b(true);
    public static final mj1 b = b(false);
    public static final c8 c = c8.d;

    public static final void a(rg1 rg1Var, dr0 dr0Var, int i) {
        dr0Var.W(-211209833);
        int i2 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        byte b2 = 0;
        if (dr0Var.N(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(dr0Var.T);
            rg1 rg1VarU = ls.U(dr0Var, rg1Var);
            dx1 dx1VarL = dr0Var.l();
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, c);
            h12.y(c5.E, dr0Var, dx1VarL);
            h12.t(dr0Var);
            h12.y(c5.D, dr0Var, rg1VarU);
            h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new go(rg1Var, i, b2);
        }
    }

    public static final mj1 b(boolean z) {
        mj1 mj1Var = new mj1(9);
        dm dmVar = c5.i;
        mj1Var.n(dmVar, new jo(dmVar, z));
        dm dmVar2 = c5.j;
        mj1Var.n(dmVar2, new jo(dmVar2, z));
        dm dmVar3 = c5.k;
        mj1Var.n(dmVar3, new jo(dmVar3, z));
        dm dmVar4 = c5.l;
        mj1Var.n(dmVar4, new jo(dmVar4, z));
        dm dmVar5 = c5.m;
        mj1Var.n(dmVar5, new jo(dmVar5, z));
        dm dmVar6 = c5.n;
        mj1Var.n(dmVar6, new jo(dmVar6, z));
        dm dmVar7 = c5.o;
        mj1Var.n(dmVar7, new jo(dmVar7, z));
        dm dmVar8 = c5.p;
        mj1Var.n(dmVar8, new jo(dmVar8, z));
        dm dmVar9 = c5.q;
        mj1Var.n(dmVar9, new jo(dmVar9, z));
        return mj1Var;
    }

    public static final ze1 c(dm dmVar, boolean z) {
        ze1 ze1Var = (ze1) (z ? a : b).g(dmVar);
        return ze1Var == null ? new jo(dmVar, z) : ze1Var;
    }

    public static final void d(my1 my1Var, ny1 ny1Var, ue1 ue1Var, u31 u31Var, int i, int i2, dm dmVar) {
        dm dmVar2;
        Object objL = ue1Var.l();
        fo foVar = objL instanceof fo ? (fo) objL : null;
        my1.j(my1Var, ny1Var, ((foVar == null || (dmVar2 = foVar.v) == null) ? dmVar : dmVar2).a((((long) ny1Var.h) << 32) | (((long) ny1Var.i) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), u31Var));
    }
}
