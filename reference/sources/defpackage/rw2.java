package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rw2 {
    public final long a;
    public final long b;

    public rw2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw2)) {
            return false;
        }
        rw2 rw2Var = (rw2) obj;
        long j = rw2Var.a;
        int i = kv.h;
        return r13.a(this.a, j) && r13.a(this.b, rw2Var.b);
    }

    public final int hashCode() {
        int i = kv.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return jp1.k("SelectionColors(selectionHandleColor=", kv.h(this.a), ", selectionBackgroundColor=", kv.h(this.b), ")");
    }
}
