package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lb1 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof lb1) {
            return this.a == ((lb1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.a;
        if (z) {
            return z ? "Assertive" : "Unknown";
        }
        return "Polite";
    }
}
