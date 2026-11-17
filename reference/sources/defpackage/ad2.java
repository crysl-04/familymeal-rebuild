package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ad2 {
    public final float a;
    public final long b;
    public final oj0 c;

    public ad2(float f, long j, oj0 oj0Var) {
        this.a = f;
        this.b = j;
        this.c = oj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad2)) {
            return false;
        }
        ad2 ad2Var = (ad2) obj;
        return Float.compare(this.a, ad2Var.a) == 0 && ez2.a(this.b, ad2Var.b) && this.c.equals(ad2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + jp1.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ez2.b(this.b) + ", animationSpec=" + this.c + ")";
    }
}
