package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ij2 {
    public final int[] a;
    public int b = 3;
    public int c = -1;
    public kj2 d = kj2.BASIS;

    public ij2(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij2)) {
            return false;
        }
        ij2 ij2Var = (ij2) obj;
        return this.b == ij2Var.b && this.c == ij2Var.c && this.d == ij2Var.d;
    }

    public final int hashCode() {
        int i = this.b;
        int iX = ((((i == 0 ? 0 : wi0.x(i)) + 31) * 31) + this.c) * 31;
        kj2 kj2Var = this.d;
        return iX + (kj2Var != null ? kj2Var.hashCode() : 0);
    }

    public final String toString() {
        int i = this.c;
        int i2 = i >= 0 ? this.a[i] : i;
        String strM = jp1.m(this.b);
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append("(");
        sb.append(i);
        sb.append(") ");
        sb.append(strM);
        return wi0.i(sb, " ", strValueOf);
    }
}
