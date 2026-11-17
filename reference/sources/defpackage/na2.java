package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class na2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        h12.c(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public na2(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na2)) {
            return false;
        }
        na2 na2Var = (na2) obj;
        return Float.compare(this.a, na2Var.a) == 0 && Float.compare(this.b, na2Var.b) == 0 && Float.compare(this.c, na2Var.c) == 0 && Float.compare(this.d, na2Var.d) == 0 && lt.u(this.e, na2Var.e) && lt.u(this.f, na2Var.f) && lt.u(this.g, na2Var.g) && lt.u(this.h, na2Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + jp1.d(this.g, jp1.d(this.f, jp1.d(this.e, wi0.d(this.d, wi0.d(this.c, wi0.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM0 = lt.m0(this.a);
        String strM1 = lt.m0(this.b);
        String strM2 = lt.m0(this.c);
        String strM3 = lt.m0(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(strM0);
        sb.append(", ");
        sb.append(strM1);
        sb.append(", ");
        sb.append(strM2);
        String strI = wi0.i(sb, ", ", strM3);
        long j = this.e;
        long j2 = this.f;
        boolean zU = lt.u(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (zU && lt.u(j2, j3) && lt.u(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return jp1.k("RoundRect(rect=", strI, ", radius=", lt.m0(Float.intBitsToFloat(i)), ")");
            }
            String strM4 = lt.m0(Float.intBitsToFloat(i));
            return wi0.i(wi0.l("RoundRect(rect=", strI, ", x=", strM4, ", y="), lt.m0(Float.intBitsToFloat(i2)), ")");
        }
        String strL0 = lt.l0(j);
        String strL1 = lt.l0(j2);
        String strL2 = lt.l0(j3);
        String strL3 = lt.l0(j4);
        StringBuilder sbL = wi0.l("RoundRect(rect=", strI, ", topLeft=", strL0, ", topRight=");
        wi0.v(sbL, strL1, ", bottomRight=", strL2, ", bottomLeft=");
        return wi0.i(sbL, strL3, ")");
    }
}
