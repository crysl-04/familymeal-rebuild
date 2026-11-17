package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class vb {
    public static final zm2 a = uz0.y(0.0f, 0.0f, null, 7);

    static {
        Map map = u53.a;
    }

    public static final kn2 a(float f, zm2 zm2Var, dr0 dr0Var) {
        if (zm2Var == a) {
            dr0Var.V(1144115775);
            boolean zC = dr0Var.c(0.01f);
            Object objK = dr0Var.K();
            if (zC || objK == zy.a) {
                objK = uz0.y(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                dr0Var.f0(objK);
            }
            zm2Var = (zm2) objK;
            dr0Var.p(false);
        } else {
            dr0Var.V(1144225701);
            dr0Var.p(false);
        }
        return b(Float.valueOf(f), aa3.Q, zm2Var, null, "FloatAnimation", dr0Var, 0);
    }

    public static final kn2 b(Object obj, s03 s03Var, cd cdVar, Float f, String str, dr0 dr0Var, int i) {
        if ((i & 8) != 0) {
            f = null;
        }
        Object objK = dr0Var.K();
        Object obj2 = zy.a;
        if (objK == obj2) {
            objK = rz1.x(null);
            dr0Var.f0(objK);
        }
        sj1 sj1Var = (sj1) objK;
        Object objK2 = dr0Var.K();
        if (objK2 == obj2) {
            objK2 = new tb(obj, s03Var, f);
            dr0Var.f0(objK2);
        }
        tb tbVar = (tb) objK2;
        sj1 sj1VarC = rz1.C(null, dr0Var);
        if (f != null && (cdVar instanceof zm2)) {
            zm2 zm2Var = (zm2) cdVar;
            if (!uz0.g(zm2Var.c, f)) {
                cdVar = new zm2(zm2Var.a, zm2Var.b, f);
            }
        }
        sj1 sj1VarC2 = rz1.C(cdVar, dr0Var);
        Object objK3 = dr0Var.K();
        if (objK3 == obj2) {
            objK3 = ls.a(-1, 6, null);
            dr0Var.f0(objK3);
        }
        ds dsVar = (ds) objK3;
        boolean zH = dr0Var.h(dsVar) | dr0Var.h(obj);
        Object objK4 = dr0Var.K();
        if (zH || objK4 == obj2) {
            objK4 = new h6((Object) dsVar, obj, (byte) 3);
            dr0Var.f0(objK4);
        }
        h7.S((kp0) objK4, dr0Var);
        boolean zH2 = dr0Var.h(dsVar) | dr0Var.h(tbVar) | dr0Var.f(sj1VarC2) | dr0Var.f(sj1VarC);
        Object objK5 = dr0Var.K();
        if (zH2 || objK5 == obj2) {
            Object ubVar = new ub(dsVar, tbVar, sj1VarC2, sj1VarC, (m10) null);
            dr0Var.f0(ubVar);
            objK5 = ubVar;
        }
        h7.J((zp0) objK5, dr0Var, dsVar);
        kn2 kn2Var = (kn2) sj1Var.getValue();
        return kn2Var == null ? tbVar.c : kn2Var;
    }
}
