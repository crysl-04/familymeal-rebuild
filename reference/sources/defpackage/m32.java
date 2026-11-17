package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m32 {
    public final String a;
    public final String b;

    public m32(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m32)) {
            return false;
        }
        m32 m32Var = (m32) obj;
        return uz0.g(this.a, m32Var.a) && this.b.equals(m32Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return jp1.k("Problem(field=", this.a, ", message=", this.b, ")");
    }
}
