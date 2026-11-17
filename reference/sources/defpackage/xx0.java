package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xx0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public xx0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx0)) {
            return false;
        }
        xx0 xx0Var = (xx0) obj;
        return this.a == xx0Var.a && this.b == xx0Var.b && this.c == xx0Var.c && this.d == xx0Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbK = wi0.k("InsetsValues(left=", this.a, ", top=", this.b, ", right=");
        sbK.append(this.c);
        sbK.append(", bottom=");
        sbK.append(this.d);
        sbK.append(")");
        return sbK.toString();
    }
}
