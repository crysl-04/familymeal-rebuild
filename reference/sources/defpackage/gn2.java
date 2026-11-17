package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gn2 implements cd {
    public final oj0 a;
    public final long b;

    public gn2(oj0 oj0Var, long j) {
        this.a = oj0Var;
        this.b = j;
    }

    @Override // defpackage.cd
    public final o33 a(s03 s03Var) {
        return new hn2(this.a.a(s03Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gn2)) {
            return false;
        }
        gn2 gn2Var = (gn2) obj;
        return gn2Var.b == this.b && uz0.g(gn2Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
