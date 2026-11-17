package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class kq0 extends kq implements jq0, k21, hq0 {
    public final byte n;

    /* JADX WARN: Multi-variable type inference failed */
    public kq0(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.n = i;
    }

    @Override // defpackage.jq0
    public final int b() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public final boolean equals(Object obj) {
        ?? r2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kq0) {
            kq0 kq0Var = (kq0) obj;
            return this.k.equals(kq0Var.k) && this.l.equals(kq0Var.l) && uz0.g(this.i, kq0Var.i) && uz0.g(e(), kq0Var.e());
        }
        if (!(obj instanceof kq0)) {
            return false;
        }
        k21 k21Var = this.h;
        if (k21Var == null) {
            d();
            this.h = this;
            this = this;
        } else {
            r2 = k21Var;
        }
        return obj.equals(r2);
    }

    public final int hashCode() {
        return this.l.hashCode() + jp1.f(this.k, e() == null ? 0 : e().hashCode() * 31, 31);
    }

    public final String toString() {
        k21 k21Var = this.h;
        if (k21Var == null) {
            d();
            this.h = this;
            k21Var = this;
        }
        if (k21Var != this) {
            return k21Var.toString();
        }
        String str = this.k;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : wi0.h("function ", str, " (Kotlin reflection is not available)");
    }

    public kq0(int i, Class cls, String str, String str2, int i2) {
        this(i, jq.h, cls, str, str2, i2);
    }
}
