package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q00 {
    public final int a;
    public final long b;
    public final r00 c;
    public final xl1 d;

    public q00(int i, long j, r00 r00Var, xl1 xl1Var) {
        this.a = i;
        this.b = j;
        this.c = r00Var;
        this.d = xl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        return this.a == q00Var.a && this.b == q00Var.b && this.c == q00Var.c && uz0.g(this.d, q00Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + jp1.d(this.b, Integer.hashCode(this.a) * 31, 31)) * 31;
        xl1 xl1Var = this.d;
        return iHashCode + (xl1Var == null ? 0 : xl1Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
