package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bk {
    public static final ak Companion = new ak();
    public final String a;
    public final int b;

    public /* synthetic */ bk(String str, int i, int i2) {
        if (3 != (i & 3)) {
            m02.x(i, 3, zj.a.d());
            throw null;
        }
        this.a = str;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return uz0.g(this.a, bkVar.a) && this.b == bkVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Header(format=" + this.a + ", version=" + this.b + ")";
    }
}
