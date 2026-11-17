package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ga1 extends ia1 {
    public final String a;
    public final mw2 b;

    public ga1(String str, mw2 mw2Var) {
        this.a = str;
        this.b = mw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga1)) {
            return false;
        }
        ga1 ga1Var = (ga1) obj;
        return this.a.equals(ga1Var.a) && uz0.g(this.b, ga1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        mw2 mw2Var = this.b;
        return (iHashCode + (mw2Var != null ? mw2Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return wi0.h("LinkAnnotation.Clickable(tag=", this.a, ")");
    }
}
