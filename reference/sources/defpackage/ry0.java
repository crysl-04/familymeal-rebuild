package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ry0 {
    public static final ry0 e = new ry0(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ry0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry0)) {
            return false;
        }
        ry0 ry0Var = (ry0) obj;
        return this.a == ry0Var.a && this.b == ry0Var.b && this.c == ry0Var.c && this.d == ry0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + jp1.b(this.c, jp1.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wi0.k("IntRect.fromLTRB(", this.a, ", ", this.b, ", ");
        sbK.append(this.c);
        sbK.append(", ");
        sbK.append(this.d);
        sbK.append(")");
        return sbK.toString();
    }
}
