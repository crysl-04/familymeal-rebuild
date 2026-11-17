package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class vg0 {
    public static final s03 a = new s03(wb.n, wb.o);
    public static final zm2 b = uz0.y(0.0f, 400.0f, null, 5);
    public static final zm2 c = uz0.y(0.0f, 400.0f, null, 5);
    public static final zm2 d;
    public static final zm2 e;

    static {
        Map map = u53.a;
        d = uz0.y(0.0f, 400.0f, new ny0(4294967297L), 1);
        e = uz0.y(0.0f, 400.0f, new vy0(4294967297L), 1);
    }

    public static final void a(qz2 qz2Var, kp0 kp0Var, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(-1186853286);
        if ((i & 6) == 0) {
            i2 = (dr0Var.f(qz2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.h(kp0Var) ? 32 : 16;
        }
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            lu1 lu1Var = qz2Var.e;
            lu1 lu1Var2 = qz2Var.d;
            boolean z = lu1Var.getValue() != null;
            if (uz0.g(qz2Var.a.g(), lu1Var2.getValue()) && !z) {
                kp0Var.a();
            }
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            Object obj = objK;
            if (objK == yyVar) {
                boolean[] zArr = {z};
                dr0Var.f0(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object objK2 = dr0Var.K();
            if (objK2 == yyVar) {
                objK2 = new Object[1];
                dr0Var.f0(objK2);
            }
            Object[] objArr = (Object[]) objK2;
            if (!uz0.g(objArr[0], lu1Var2.getValue())) {
                if (!z && !zArr2[0]) {
                    kp0Var.a();
                }
                objArr[0] = lu1Var2.getValue();
            }
            zArr2[0] = z;
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ng0(qz2Var, kp0Var, i);
        }
    }

    public static ah0 b(zm2 zm2Var, bm bmVar) {
        dm dmVar;
        if (bmVar.equals(c5.u)) {
            dmVar = c5.l;
        } else {
            dmVar = bmVar.equals(c5.w) ? c5.n : c5.m;
        }
        return c(dmVar, new wb(1, (byte) 11), zm2Var);
    }

    public static final ah0 c(dm dmVar, vp0 vp0Var, zm2 zm2Var) {
        return new ah0(new pz2((ri0) null, (ck2) null, new bs(dmVar, vp0Var, zm2Var), (ad2) null, (LinkedHashMap) null, 123));
    }

    public static ah0 d(oj0 oj0Var, int i) {
        if ((i & 1) != 0) {
            oj0Var = uz0.y(0.0f, 400.0f, null, 5);
        }
        return new ah0(new pz2(new ri0(0.0f, oj0Var), (ck2) null, (bs) null, (ad2) null, (LinkedHashMap) null, 126));
    }

    public static wh0 e(oj0 oj0Var, int i) {
        if ((i & 1) != 0) {
            oj0Var = uz0.y(0.0f, 400.0f, null, 5);
        }
        return new wh0(new pz2(new ri0(0.0f, oj0Var), (ck2) null, (bs) null, (ad2) null, (LinkedHashMap) null, 126));
    }

    public static wh0 f(zm2 zm2Var, bm bmVar) {
        dm dmVar;
        if (bmVar.equals(c5.u)) {
            dmVar = c5.l;
        } else {
            dmVar = bmVar.equals(c5.w) ? c5.n : c5.m;
        }
        return g(dmVar, new wb(1, (byte) 13), zm2Var);
    }

    public static final wh0 g(dm dmVar, vp0 vp0Var, zm2 zm2Var) {
        return new wh0(new pz2((ri0) null, (ck2) null, new bs(dmVar, vp0Var, zm2Var), (ad2) null, (LinkedHashMap) null, 123));
    }

    public static final ah0 h(vp0 vp0Var, zm2 zm2Var) {
        return new ah0(new pz2((ri0) null, new ck2(new ug0(vp0Var, (byte) 0), zm2Var), (bs) null, (ad2) null, (LinkedHashMap) null, 125));
    }

    public static final wh0 i(vp0 vp0Var, zm2 zm2Var) {
        return new wh0(new pz2((ri0) null, new ck2(new ug0(vp0Var, (byte) 1), zm2Var), (bs) null, (ad2) null, (LinkedHashMap) null, 125));
    }
}
