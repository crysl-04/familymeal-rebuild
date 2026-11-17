package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kv {
    public static final long b = cu.c(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        cu.c(4282664004L);
        cu.c(4287137928L);
        cu.c(4291611852L);
        c = cu.c(4294967295L);
        d = cu.c(4294901760L);
        cu.c(4278255360L);
        e = cu.c(4278190335L);
        cu.c(4294967040L);
        cu.c(4278255615L);
        cu.c(4294902015L);
        f = cu.b(0);
        float[] fArr = uv.a;
        g = cu.a(0.0f, 0.0f, 0.0f, 0.0f, uv.u);
    }

    public /* synthetic */ kv(long j) {
        this.a = j;
    }

    public static final long a(long j, sv svVar) {
        f00 f00VarW;
        sv svVarE = e(j);
        int i = svVarE.c;
        int i2 = svVar.c;
        if ((i | i2) < 0) {
            f00VarW = es.w(svVarE, svVar);
        } else {
            si1 si1Var = g00.a;
            int i3 = i | (i2 << 6);
            Object objB = si1Var.b(i3);
            if (objB == null) {
                objB = es.w(svVarE, svVar);
                si1Var.h(i3, objB);
            }
            f00VarW = (f00) objB;
        }
        return f00VarW.a(j);
    }

    public static long b(float f2, long j) {
        return cu.a(g(j), f(j), d(j), f2, e(j));
    }

    public static final float c(long j) {
        float fE;
        float f2;
        if ((63 & j) == 0) {
            fE = (float) y02.E((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fE = (float) y02.E((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fE / f2;
    }

    public static final float d(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) y02.E((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - 0.5f;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i4 << 16) | (i3 << 23) | i2);
    }

    public static final sv e(long j) {
        float[] fArr = uv.a;
        return uv.y[(int) (j & 63)];
    }

    public static final float f(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) y02.E((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - 0.5f;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i4 << 16) | (i3 << 23) | i2);
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        long j3 = j >>> 48;
        if (j2 == 0) {
            return ((float) y02.E(j3 & 255)) / 255.0f;
        }
        short s = (short) (j3 & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - 0.5f;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i4 << 16) | (i3 << 23) | i2);
    }

    public static String h(long j) {
        float fG = g(j);
        float f2 = f(j);
        float fD = d(j);
        float fC = c(j);
        String str = e(j).a;
        StringBuilder sbJ = wi0.j("Color(", fG, ", ", f2, ", ");
        sbJ.append(fD);
        sbJ.append(", ");
        sbJ.append(fC);
        sbJ.append(", ");
        return wi0.i(sbJ, str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kv) {
            return this.a == ((kv) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
