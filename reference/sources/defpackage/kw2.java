package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kw2 {
    public final jw2 a;
    public t31 b = null;
    public t31 c;

    public kw2(jw2 jw2Var, t31 t31Var) {
        this.a = jw2Var;
        this.c = t31Var;
    }

    public final long a(long j) {
        r72 r72VarM;
        t31 t31Var = this.b;
        r72 r72Var = r72.e;
        if (t31Var != null) {
            if (t31Var.C()) {
                t31 t31Var2 = this.c;
                r72VarM = t31Var2 != null ? t31Var2.M(t31Var, true) : null;
            } else {
                r72VarM = r72Var;
            }
            if (r72VarM != null) {
                r72Var = r72VarM;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = r72Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = r72Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = r72Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = r72Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        jw2 jw2Var = this.a;
        int iE = jw2Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= jw2Var.d(iE) && Float.intBitsToFloat(i) <= jw2Var.e(iE);
    }

    public final long d(long j) {
        t31 t31Var;
        t31 t31Var2 = this.b;
        if (t31Var2 != null) {
            if (!t31Var2.C()) {
                t31Var2 = null;
            }
            if (t31Var2 != null && (t31Var = this.c) != null) {
                t31 t31Var3 = t31Var.C() ? t31Var : null;
                if (t31Var3 != null) {
                    return t31Var2.t(t31Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        t31 t31Var;
        t31 t31Var2 = this.b;
        if (t31Var2 != null) {
            if (!t31Var2.C()) {
                t31Var2 = null;
            }
            if (t31Var2 != null && (t31Var = this.c) != null) {
                t31 t31Var3 = t31Var.C() ? t31Var : null;
                if (t31Var3 != null) {
                    return t31Var3.t(t31Var2, j);
                }
            }
        }
        return j;
    }
}
