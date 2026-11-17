package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sa2 {
    public float a = 0.0f;
    public boolean b = true;
    public f30 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa2)) {
            return false;
        }
        sa2 sa2Var = (sa2) obj;
        return Float.compare(this.a, sa2Var.a) == 0 && this.b == sa2Var.b && uz0.g(this.c, sa2Var.c);
    }

    public final int hashCode() {
        int iC = jp1.c(Float.hashCode(this.a) * 31, 31, this.b);
        f30 f30Var = this.c;
        return (iC + (f30Var == null ? 0 : f30Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
