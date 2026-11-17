package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v92 {
    public final long a = kv.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v92)) {
            return false;
        }
        long j = ((v92) obj).a;
        int i = kv.h;
        return r13.a(this.a, j);
    }

    public final int hashCode() {
        int i = kv.h;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) kv.h(this.a)) + ", rippleAlpha=null)";
    }
}
