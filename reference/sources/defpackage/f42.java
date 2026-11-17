package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f42 extends kq implements q21 {
    public final boolean n;

    public f42(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.n = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f42) {
            f42 f42Var = (f42) obj;
            return e().equals(f42Var.e()) && this.k.equals(f42Var.k) && this.l.equals(f42Var.l) && uz0.g(this.i, f42Var.i);
        }
        if (obj instanceof q21) {
            return obj.equals(g());
        }
        return false;
    }

    public final k21 g() {
        if (this.n) {
            return this;
        }
        k21 k21Var = this.h;
        if (k21Var != null) {
            return k21Var;
        }
        k21 k21VarD = d();
        this.h = k21VarD;
        return k21VarD;
    }

    public final int hashCode() {
        return this.l.hashCode() + jp1.f(this.k, e().hashCode() * 31, 31);
    }

    public final String toString() {
        k21 k21VarG = g();
        return k21VarG != this ? k21VarG.toString() : wi0.i(new StringBuilder("property "), this.k, " (Kotlin reflection is not available)");
    }
}
