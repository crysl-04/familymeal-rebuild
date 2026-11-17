package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e4 implements i4 {
    public final int a;
    public final long b;
    public final long c;

    public e4(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return this.a == e4Var.a && this.b == e4Var.b && this.c == e4Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + jp1.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "NeedMoreData(points=" + this.a + ", spanDays=" + this.b + ", waitDays=" + this.c + ")";
    }
}
