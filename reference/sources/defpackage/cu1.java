package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cu1 implements kd {
    public final int a;
    public final int b;
    public final long c;
    public final zv2 d;
    public final xz1 e;
    public final w91 f;
    public final int g;
    public final int h;
    public final ow2 i;

    public cu1(int i, int i2, long j, zv2 zv2Var, xz1 xz1Var, w91 w91Var, int i3, int i4, ow2 ow2Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = zv2Var;
        this.e = xz1Var;
        this.f = w91Var;
        this.g = i3;
        this.h = i4;
        this.i = ow2Var;
        bx2[] bx2VarArr = ax2.b;
        if (ax2.a(j, ax2.c)) {
            return;
        }
        if (ax2.c(j) >= 0.0f) {
            return;
        }
        bx0.b("lineHeight can't be negative (" + ax2.c(j) + ")");
    }

    public final cu1 a(cu1 cu1Var) {
        return cu1Var == null ? this : du1.a(this, cu1Var.a, cu1Var.b, cu1Var.c, cu1Var.d, cu1Var.e, cu1Var.f, cu1Var.g, cu1Var.h, cu1Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu1)) {
            return false;
        }
        cu1 cu1Var = (cu1) obj;
        return this.a == cu1Var.a && this.b == cu1Var.b && ax2.a(this.c, cu1Var.c) && uz0.g(this.d, cu1Var.d) && uz0.g(this.e, cu1Var.e) && uz0.g(this.f, cu1Var.f) && this.g == cu1Var.g && this.h == cu1Var.h && uz0.g(this.i, cu1Var.i);
    }

    public final int hashCode() {
        int iB = jp1.b(this.b, Integer.hashCode(this.a) * 31, 31);
        bx2[] bx2VarArr = ax2.b;
        int iD = jp1.d(this.c, iB, 31);
        zv2 zv2Var = this.d;
        int iHashCode = (iD + (zv2Var != null ? zv2Var.hashCode() : 0)) * 31;
        xz1 xz1Var = this.e;
        int iHashCode2 = (iHashCode + (xz1Var != null ? xz1Var.hashCode() : 0)) * 31;
        w91 w91Var = this.f;
        int iB2 = jp1.b(this.h, jp1.b(this.g, (iHashCode2 + (w91Var != null ? w91Var.hashCode() : 0)) * 31, 31), 31);
        ow2 ow2Var = this.i;
        return iB2 + (ow2Var != null ? ow2Var.hashCode() : 0);
    }

    public final String toString() {
        String strA = zs2.a(this.a);
        String strA2 = yt2.a(this.b);
        String strD = ax2.d(this.c);
        String strA3 = r91.a(this.g);
        String strA4 = wt0.a(this.h);
        StringBuilder sbL = wi0.l("ParagraphStyle(textAlign=", strA, ", textDirection=", strA2, ", lineHeight=");
        sbL.append(strD);
        sbL.append(", textIndent=");
        sbL.append(this.d);
        sbL.append(", platformStyle=");
        sbL.append(this.e);
        sbL.append(", lineHeightStyle=");
        sbL.append(this.f);
        sbL.append(", lineBreak=");
        wi0.v(sbL, strA3, ", hyphens=", strA4, ", textMotion=");
        sbL.append(this.i);
        sbL.append(")");
        return sbL.toString();
    }
}
