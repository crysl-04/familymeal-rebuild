package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bv1 extends uv1 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public bv1(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv1)) {
            return false;
        }
        bv1 bv1Var = (bv1) obj;
        return Float.compare(this.c, bv1Var.c) == 0 && Float.compare(this.d, bv1Var.d) == 0 && Float.compare(this.e, bv1Var.e) == 0 && this.f == bv1Var.f && this.g == bv1Var.g && Float.compare(this.h, bv1Var.h) == 0 && Float.compare(this.i, bv1Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + wi0.d(this.h, jp1.c(jp1.c(wi0.d(this.e, wi0.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbJ = wi0.j("ArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        sbJ.append(this.e);
        sbJ.append(", isMoreThanHalf=");
        sbJ.append(this.f);
        sbJ.append(", isPositiveArc=");
        sbJ.append(this.g);
        sbJ.append(", arcStartX=");
        sbJ.append(this.h);
        sbJ.append(", arcStartY=");
        sbJ.append(this.i);
        sbJ.append(")");
        return sbJ.toString();
    }
}
