package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jh1 {
    public final long a;
    public final long b;

    public jh1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final jh1 a(jh1 jh1Var) {
        return new jh1(up1.e(this.a, jh1Var.a), Math.max(this.b, jh1Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh1)) {
            return false;
        }
        jh1 jh1Var = (jh1) obj;
        return up1.b(this.a, jh1Var.a) && this.b == jh1Var.b;
    }

    public final int hashCode() {
        return ((Long.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31) + 1237;
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + up1.g(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=false)";
    }
}
