package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vw2 {
    public final String a;
    public String b;
    public boolean c = false;
    public bu1 d = null;

    public vw2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw2)) {
            return false;
        }
        vw2 vw2Var = (vw2) obj;
        return uz0.g(this.a, vw2Var.a) && uz0.g(this.b, vw2Var.b) && this.c == vw2Var.c && uz0.g(this.d, vw2Var.d);
    }

    public final int hashCode() {
        int iC = jp1.c(jp1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        bu1 bu1Var = this.d;
        return iC + (bu1Var == null ? 0 : bu1Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
