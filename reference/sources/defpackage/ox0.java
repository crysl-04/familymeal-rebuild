package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ox0 {
    public static final ox0 e = new ox0(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ox0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static ox0 a(ox0 ox0Var, ox0 ox0Var2) {
        return b(Math.max(ox0Var.a, ox0Var2.a), Math.max(ox0Var.b, ox0Var2.b), Math.max(ox0Var.c, ox0Var2.c), Math.max(ox0Var.d, ox0Var2.d));
    }

    public static ox0 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new ox0(i, i2, i3, i4);
    }

    public static ox0 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ox0.class != obj.getClass()) {
            return false;
        }
        ox0 ox0Var = (ox0) obj;
        return this.d == ox0Var.d && this.a == ox0Var.a && this.c == ox0Var.c && this.b == ox0Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
