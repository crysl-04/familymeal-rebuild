package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ei2 {
    public static final ei2 d = new ei2(0.0f, cu.c(4278190080L), 0);
    public final long a;
    public final long b;
    public final float c;

    public ei2(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei2)) {
            return false;
        }
        ei2 ei2Var = (ei2) obj;
        long j = ei2Var.a;
        int i = kv.h;
        return r13.a(this.a, j) && up1.b(this.b, ei2Var.b) && this.c == ei2Var.c;
    }

    public final int hashCode() {
        int i = kv.h;
        return Float.hashCode(this.c) + jp1.d(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("Shadow(color=", kv.h(this.a), ", offset=", up1.g(this.b), ", blurRadius=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
