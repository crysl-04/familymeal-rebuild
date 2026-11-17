package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zv2 {
    public static final zv2 c = new zv2(r02.t(0), r02.t(0));
    public final long a;
    public final long b;

    public zv2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv2)) {
            return false;
        }
        zv2 zv2Var = (zv2) obj;
        return ax2.a(this.a, zv2Var.a) && ax2.a(this.b, zv2Var.b);
    }

    public final int hashCode() {
        bx2[] bx2VarArr = ax2.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return jp1.k("TextIndent(firstLine=", ax2.d(this.a), ", restLine=", ax2.d(this.b), ")");
    }
}
