package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q12 {
    public final ek2 a;
    public final String b;
    public final String c;

    public q12(ek2 ek2Var, String str, String str2) {
        ek2Var.getClass();
        str.getClass();
        str2.getClass();
        this.a = ek2Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q12)) {
            return false;
        }
        q12 q12Var = (q12) obj;
        return uz0.g(this.a, q12Var.a) && uz0.g(this.b, q12Var.b) && uz0.g(this.c, q12Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + jp1.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PortionKey(slot=");
        sb.append(this.a);
        sb.append(", personId=");
        sb.append(this.b);
        sb.append(", recipeId=");
        return wi0.i(sb, this.c, ")");
    }
}
