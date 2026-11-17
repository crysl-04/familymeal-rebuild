package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ld {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public ld(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld)) {
            return false;
        }
        ld ldVar = (ld) obj;
        return uz0.g(this.a, ldVar.a) && this.b == ldVar.b && this.c == ldVar.c && uz0.g(this.d, ldVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + jp1.b(this.c, jp1.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }
}
