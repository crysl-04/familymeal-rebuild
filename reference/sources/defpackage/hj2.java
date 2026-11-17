package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hj2 {
    public final int[] a;
    public int b = 3;
    public kj2 c = kj2.BASIS;
    public int d = -1;

    public hj2(int[] iArr) {
        this.a = iArr;
    }

    public final int a() {
        int i = this.d;
        return i >= 0 ? this.a[i] : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj2)) {
            return false;
        }
        hj2 hj2Var = (hj2) obj;
        return this.b == hj2Var.b && this.c == hj2Var.c && this.d == hj2Var.d;
    }

    public final int hashCode() {
        int i = this.b;
        int iX = ((i == 0 ? 0 : wi0.x(i)) + 31) * 31;
        kj2 kj2Var = this.c;
        return ((iX + (kj2Var != null ? kj2Var.hashCode() : 0)) * 31) + this.d;
    }

    public final String toString() {
        int iA = a();
        int i = this.d;
        String strValueOf = String.valueOf(this.c);
        String strM = jp1.m(this.b);
        StringBuilder sb = new StringBuilder();
        sb.append(iA);
        sb.append("(");
        sb.append(i);
        sb.append(") ");
        sb.append(strValueOf);
        return wi0.i(sb, " ", strM);
    }
}
