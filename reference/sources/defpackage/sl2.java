package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sl2 {
    public final tl2 a;
    public final c63 b;
    public final Double c;
    public final long d;
    public final String e;
    public final long f;
    public final long g;

    public sl2(tl2 tl2Var, c63 c63Var, Double d, long j, String str, long j2, long j3) {
        this.a = tl2Var;
        this.b = c63Var;
        this.c = d;
        this.d = j;
        this.e = str;
        this.f = j2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl2)) {
            return false;
        }
        sl2 sl2Var = (sl2) obj;
        return this.a == sl2Var.a && uz0.g(this.b, sl2Var.b) && uz0.g(this.c, sl2Var.c) && this.d == sl2Var.d && this.e.equals(sl2Var.e) && this.f == sl2Var.f && this.g == sl2Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        c63 c63Var = this.b;
        int iHashCode2 = (iHashCode + (c63Var == null ? 0 : c63Var.hashCode())) * 31;
        Double d = this.c;
        return Long.hashCode(this.g) + jp1.d(this.f, jp1.f(this.e, jp1.d(this.d, (iHashCode2 + (d != null ? d.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "SolveResult(status=" + this.a + ", plan=" + this.b + ", objective=" + this.c + ", elapsedMillis=" + this.d + ", message=" + this.e + ", buildMillis=" + this.f + ", solveMillis=" + this.g + ")";
    }
}
