package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m62 {
    public final ga2 a;
    public final wv0 b = new wv0(10);
    public final wv0 c = new wv0(11);
    public final ix0 d;

    public m62(ga2 ga2Var) {
        this.a = ga2Var;
        byte b = 12;
        this.d = new ix0(new wv0(b), new xv0((byte) 4), b, false);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(m62 m62Var, y62 y62Var, ArrayList arrayList, n10 n10Var) {
        k62 k62Var;
        m62 m62Var2;
        ArrayList arrayList2;
        if (n10Var instanceof k62) {
            k62Var = (k62) n10Var;
            int i = k62Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                k62Var.p = i - Integer.MIN_VALUE;
            } else {
                k62Var = new k62(m62Var, n10Var);
            }
        } else {
            k62Var = new k62(m62Var, n10Var);
        }
        Object obj = k62Var.n;
        int i2 = k62Var.p;
        j23 j23Var = j23.a;
        byte b = 2;
        y20 y20Var = y20.h;
        if (i2 == 0) {
            m02.y(obj);
            k62Var.k = m62Var;
            k62Var.l = y62Var;
            k62Var.m = arrayList;
            k62Var.p = 1;
            Object objP = cu.P(k62Var, new uy1(m62Var, y62Var, b), m62Var.a, false, true);
            if (objP != y20Var) {
                objP = j23Var;
            }
            if (objP != y20Var) {
            }
            return y20Var;
        }
        if (i2 == 1) {
            arrayList = k62Var.m;
            y62Var = k62Var.l;
            m62Var = k62Var.k;
            m02.y(obj);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList2 = k62Var.m;
            m62Var2 = k62Var.k;
            m02.y(obj);
        }
        k62Var.k = null;
        k62Var.l = null;
        k62Var.m = null;
        k62Var.p = 3;
        if (m62Var2.a(arrayList2, k62Var) != y20Var) {
            return y20Var;
        }
        return j23Var;
        String str = y62Var.a;
        k62Var.k = m62Var;
        k62Var.l = null;
        k62Var.m = arrayList;
        k62Var.p = 2;
        Object objP2 = cu.P(k62Var, new ql(str, (byte) 24), m62Var.a, false, true);
        if (objP2 != y20Var) {
            objP2 = j23Var;
        }
        if (objP2 != y20Var) {
            m62Var2 = m62Var;
            arrayList2 = arrayList;
            k62Var.k = null;
            k62Var.l = null;
            k62Var.m = null;
            k62Var.p = 3;
            if (m62Var2.a(arrayList2, k62Var) != y20Var) {
                return j23Var;
            }
        }
        return y20Var;
    }

    public final Object a(ArrayList arrayList, n10 n10Var) {
        Object objP = cu.P(n10Var, new l62(this, arrayList, (byte) 1), this.a, false, true);
        return objP == y20.h ? objP : j23.a;
    }
}
