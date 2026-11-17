package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w91 {
    public static final w91 d = new w91(t91.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public w91(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w91)) {
            return false;
        }
        w91 w91Var = (w91) obj;
        float f = w91Var.a;
        float f2 = t91.b;
        return Float.compare(this.a, f) == 0 && this.b == w91Var.b && this.c == w91Var.c;
    }

    public final int hashCode() {
        float f = t91.b;
        return Integer.hashCode(this.c) + jp1.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        String strB = t91.b(this.a);
        String str2 = "Invalid";
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        return wi0.i(wi0.l("LineHeightStyle(alignment=", strB, ", trim=", str, ",mode="), str2, ")");
    }
}
