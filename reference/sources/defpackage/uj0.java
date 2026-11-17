package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uj0 {
    public final float a;
    public final float b;
    public final long c;

    public uj0(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj0)) {
            return false;
        }
        uj0 uj0Var = (uj0) obj;
        return Float.compare(this.a, uj0Var.a) == 0 && Float.compare(this.b, uj0Var.b) == 0 && this.c == uj0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + wi0.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbJ = wi0.j("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration=");
        sbJ.append(this.c);
        sbJ.append(")");
        return sbJ.toString();
    }
}
