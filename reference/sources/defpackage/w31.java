package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w31 {
    public final int a;
    public final int b;
    public final boolean c;

    public w31(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w31)) {
            return false;
        }
        w31 w31Var = (w31) obj;
        return this.a == w31Var.a && this.b == w31Var.b && this.c == w31Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + jp1.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbK = wi0.k("BidiRun(start=", this.a, ", end=", this.b, ", isRtl=");
        sbK.append(this.c);
        sbK.append(")");
        return sbK.toString();
    }
}
