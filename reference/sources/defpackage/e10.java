package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e10 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public e10(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e10)) {
            return false;
        }
        e10 e10Var = (e10) obj;
        long j = e10Var.a;
        int i = kv.h;
        return r13.a(this.a, j) && r13.a(this.b, e10Var.b) && r13.a(this.c, e10Var.c) && r13.a(this.d, e10Var.d) && r13.a(this.e, e10Var.e);
    }

    public final int hashCode() {
        int i = kv.h;
        return Long.hashCode(this.e) + jp1.d(this.d, jp1.d(this.c, jp1.d(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strH = kv.h(this.a);
        String strH2 = kv.h(this.b);
        String strH3 = kv.h(this.c);
        String strH4 = kv.h(this.d);
        String strH5 = kv.h(this.e);
        StringBuilder sbL = wi0.l("ContextMenuColors(backgroundColor=", strH, ", textColor=", strH2, ", iconColor=");
        wi0.v(sbL, strH3, ", disabledTextColor=", strH4, ", disabledIconColor=");
        return wi0.i(sbL, strH5, ")");
    }
}
