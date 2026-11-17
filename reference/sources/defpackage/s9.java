package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s9 implements w02 {
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public s9(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!s9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((s9) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return jp1.i(this.b, "AndroidPointerIcon(type=", ")");
    }
}
