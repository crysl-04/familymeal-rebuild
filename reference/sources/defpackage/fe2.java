package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class fe2 {
    public static final ce2 a = new ce2();
    public static final sa0 b = new sa0(1);
    public static final de2 c = new de2();

    public static rg1 a(av2 av2Var, ks1 ks1Var, boolean z, boolean z2, ui1 ui1Var) {
        return new be2(av2Var, ks1Var, z, z2, ui1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(qe2 qe2Var, long j, n10 n10Var) {
        ee2 ee2Var;
        u72 u72Var;
        qe2 qe2Var2;
        if (n10Var instanceof ee2) {
            ee2Var = (ee2) n10Var;
            int i = ee2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ee2Var.n = i - Integer.MIN_VALUE;
            } else {
                ee2Var = new ee2(n10Var);
            }
        } else {
            ee2Var = new ee2(n10Var);
        }
        Object obj = ee2Var.m;
        int i2 = ee2Var.n;
        if (i2 == 0) {
            m02.y(obj);
            u72Var = new u72();
            b02 b02Var = new b02(qe2Var, j, u72Var, (m10) null);
            ee2Var.k = qe2Var;
            ee2Var.l = u72Var;
            ee2Var.n = 1;
            Object objG = qe2Var.g(ek1.h, b02Var, ee2Var);
            y20 y20Var = y20.h;
            if (objG == y20Var) {
                return y20Var;
            }
            qe2Var2 = qe2Var;
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u72 u72Var2 = ee2Var.l;
            qe2 qe2Var3 = ee2Var.k;
            m02.y(obj);
            u72Var = u72Var2;
            qe2Var2 = qe2Var3;
        }
        return new up1(qe2Var2.i(u72Var.h));
    }
}
