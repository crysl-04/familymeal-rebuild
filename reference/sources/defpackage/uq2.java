package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uq2 {
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
    public final long m;
    public final long n;
    public final long o;
    public final long p;

    public uq2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
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
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uq2)) {
            return false;
        }
        uq2 uq2Var = (uq2) obj;
        long j = uq2Var.a;
        int i = kv.h;
        return r13.a(this.a, j) && r13.a(this.b, uq2Var.b) && r13.a(this.c, uq2Var.c) && r13.a(this.d, uq2Var.d) && r13.a(this.e, uq2Var.e) && r13.a(this.f, uq2Var.f) && r13.a(this.g, uq2Var.g) && r13.a(this.h, uq2Var.h) && r13.a(this.i, uq2Var.i) && r13.a(this.j, uq2Var.j) && r13.a(this.k, uq2Var.k) && r13.a(this.l, uq2Var.l) && r13.a(this.m, uq2Var.m) && r13.a(this.n, uq2Var.n) && r13.a(this.o, uq2Var.o) && r13.a(this.p, uq2Var.p);
    }

    public final int hashCode() {
        int i = kv.h;
        return Long.hashCode(this.p) + jp1.d(this.o, jp1.d(this.n, jp1.d(this.m, jp1.d(this.l, jp1.d(this.k, jp1.d(this.j, jp1.d(this.i, jp1.d(this.h, jp1.d(this.g, jp1.d(this.f, jp1.d(this.e, jp1.d(this.d, jp1.d(this.c, jp1.d(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
