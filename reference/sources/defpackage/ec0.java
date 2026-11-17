package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ec0 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof ec0) {
            return this.a == ((ec0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        return j != 9205357640488583168L ? jp1.k("(", cc0.c(Float.intBitsToFloat((int) (j >> 32))), ", ", cc0.c(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "DpOffset.Unspecified";
    }
}
