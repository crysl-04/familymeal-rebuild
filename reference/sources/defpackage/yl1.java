package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yl1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public yl1(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yl1)) {
            return false;
        }
        yl1 yl1Var = (yl1) obj;
        long j = yl1Var.a;
        int i = kv.h;
        return r13.a(this.a, j) && r13.a(this.d, yl1Var.d) && r13.a(this.b, yl1Var.b) && r13.a(this.e, yl1Var.e) && r13.a(this.c, yl1Var.c) && r13.a(this.f, yl1Var.f) && r13.a(this.g, yl1Var.g);
    }

    public final int hashCode() {
        int i = kv.h;
        return Long.hashCode(this.g) + jp1.d(this.f, jp1.d(this.c, jp1.d(this.e, jp1.d(this.b, jp1.d(this.d, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }
}
