package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zs {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
    }

    public static zm2 a(by2 by2Var, dr0 dr0Var) {
        if (by2Var == by2.i) {
            dr0Var.V(1539262271);
            zm2 zm2VarA0 = ls.a0(gh1.k, dr0Var);
            dr0Var.p(false);
            return zm2VarA0;
        }
        dr0Var.V(1539355581);
        zm2 zm2VarA1 = ls.a0(gh1.j, dr0Var);
        dr0Var.p(false);
        return zm2VarA1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zs)) {
            return false;
        }
        zs zsVar = (zs) obj;
        long j = zsVar.a;
        int i = kv.h;
        return r13.a(this.a, j) && r13.a(this.b, zsVar.b) && r13.a(this.c, zsVar.c) && r13.a(this.d, zsVar.d) && r13.a(this.e, zsVar.e) && r13.a(this.f, zsVar.f) && r13.a(this.g, zsVar.g) && r13.a(this.h, zsVar.h) && r13.a(this.i, zsVar.i) && r13.a(this.j, zsVar.j) && r13.a(this.k, zsVar.k) && r13.a(this.l, zsVar.l);
    }

    public final int hashCode() {
        int i = kv.h;
        return Long.hashCode(this.l) + jp1.d(this.k, jp1.d(this.j, jp1.d(this.i, jp1.d(this.h, jp1.d(this.g, jp1.d(this.f, jp1.d(this.e, jp1.d(this.d, jp1.d(this.c, jp1.d(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
