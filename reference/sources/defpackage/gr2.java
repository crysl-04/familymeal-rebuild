package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gr2 {
    public final String a;
    public final String b;
    public final iu0 c;

    public gr2(String str, String str2, iu0 iu0Var) {
        iu0Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = iu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr2)) {
            return false;
        }
        gr2 gr2Var = (gr2) obj;
        return this.a.equals(gr2Var.a) && this.b.equals(gr2Var.b) && uz0.g(this.c, gr2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + jp1.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("Tab(route=", this.a, ", label=", this.b, ", icon=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
