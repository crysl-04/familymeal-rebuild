package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class df0 {
    public static final q03 a;
    public static final q03 b;
    public static final q03 c;

    static {
        l30 l30Var = new l30(0.4f, 0.0f, 0.6f, 1.0f);
        a = new q03(120, 0, le0.a);
        b = new q03(150, 0, l30Var);
        c = new q03(120, 0, l30Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x002d A[PHI: r1
  0x002d: PHI (r1v1 q03) = (r1v0 q03), (r1v0 q03), (r1v0 q03), (r1v2 q03), (r1v2 q03), (r1v2 q03), (r1v2 q03) binds: [B:15:0x001c, B:17:0x0020, B:22:0x002b, B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(tb tbVar, float f, gz0 gz0Var, gz0 gz0Var2, n10 n10Var) {
        q03 q03Var;
        cc0 cc0Var;
        q03 q03Var2 = null;
        if (gz0Var2 != null) {
            boolean z = gz0Var2 instanceof m22;
            q03Var = a;
            if (z || (gz0Var2 instanceof jd0) || (gz0Var2 instanceof ut0) || (gz0Var2 instanceof wl0)) {
                q03Var2 = q03Var;
            }
        } else if (gz0Var != null) {
            boolean z2 = gz0Var instanceof m22;
            q03Var = b;
            if (z2 || (gz0Var instanceof jd0)) {
                q03Var2 = q03Var;
            } else if (gz0Var instanceof ut0) {
                q03Var2 = c;
            } else if (gz0Var instanceof wl0) {
                q03Var2 = q03Var;
            }
        }
        Object obj = y20.h;
        if (q03Var2 != null) {
            cc0Var = new cc0(f);
            Object objA = tb.a(tbVar, cc0Var, q03Var2, n10Var);
            if (objA == obj) {
                return objA;
            }
        } else {
            cc0Var = new cc0(f);
            Object objE = tbVar.e(n10Var, cc0Var);
            if (objE == obj) {
                return objE;
            }
        }
        return j23.a;
    }
}
