package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kx0 {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof kx0) {
            return this.a == ((kx0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        byte b = this.a;
        if (b == 1) {
            return "Touch";
        }
        return b == 2 ? "Keyboard" : "Error";
    }
}
