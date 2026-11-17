package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class au0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public au0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof au0)) {
            return false;
        }
        au0 au0Var = (au0) obj;
        long j = au0Var.a;
        int i = kv.h;
        return r13.a(this.a, j) && r13.a(this.b, au0Var.b) && r13.a(this.c, au0Var.c) && r13.a(this.d, au0Var.d);
    }

    public final int hashCode() {
        int i = kv.h;
        return Long.hashCode(this.d) + jp1.d(this.c, jp1.d(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
