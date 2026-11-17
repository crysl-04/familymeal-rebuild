package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dm implements d5 {
    public final float a;
    public final float b;

    public dm(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.d5
    public final long a(long j, long j2, u31 u31Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        u31 u31Var2 = u31.h;
        float f3 = this.a;
        if (u31Var != u31Var2) {
            f3 *= -1.0f;
        }
        return (((long) Math.round((f3 + 1.0f) * f)) << 32) | (((long) Math.round((1.0f + this.b) * f2)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return Float.compare(this.a, dmVar.a) == 0 && Float.compare(this.b, dmVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ")";
    }
}
