package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nd {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public nd(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        bx0.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd)) {
            return false;
        }
        nd ndVar = (nd) obj;
        return uz0.g(this.a, ndVar.a) && this.b == ndVar.b && this.c == ndVar.c && uz0.g(this.d, ndVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + jp1.b(this.c, jp1.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public nd(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
