package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r72 {
    public static final r72 e = new r72(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public r72(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        float f6 = ((f4 - f5) / 2.0f) + f5;
        return (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
    }

    public final long c() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final r72 e(r72 r72Var) {
        return new r72(Math.max(this.a, r72Var.a), Math.max(this.b, r72Var.b), Math.min(this.c, r72Var.c), Math.min(this.d, r72Var.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r72)) {
            return false;
        }
        r72 r72Var = (r72) obj;
        return Float.compare(this.a, r72Var.a) == 0 && Float.compare(this.b, r72Var.b) == 0 && Float.compare(this.c, r72Var.c) == 0 && Float.compare(this.d, r72Var.d) == 0;
    }

    public final boolean f() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean g(r72 r72Var) {
        return (this.a < r72Var.c) & (r72Var.a < this.c) & (this.b < r72Var.d) & (r72Var.b < this.d);
    }

    public final r72 h(float f, float f2) {
        return new r72(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + wi0.d(this.c, wi0.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final r72 i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new r72(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String strM0 = lt.m0(this.a);
        String strM1 = lt.m0(this.b);
        String strM2 = lt.m0(this.c);
        String strM3 = lt.m0(this.d);
        StringBuilder sbL = wi0.l("Rect.fromLTRB(", strM0, ", ", strM1, ", ");
        sbL.append(strM2);
        sbL.append(", ");
        sbL.append(strM3);
        sbL.append(")");
        return sbL.toString();
    }
}
