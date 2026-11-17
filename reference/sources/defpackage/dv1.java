package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dv1 extends uv1 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public dv1(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv1)) {
            return false;
        }
        dv1 dv1Var = (dv1) obj;
        return Float.compare(this.c, dv1Var.c) == 0 && Float.compare(this.d, dv1Var.d) == 0 && Float.compare(this.e, dv1Var.e) == 0 && Float.compare(this.f, dv1Var.f) == 0 && Float.compare(this.g, dv1Var.g) == 0 && Float.compare(this.h, dv1Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + wi0.d(this.g, wi0.d(this.f, wi0.d(this.e, wi0.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = wi0.j("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        sbJ.append(this.e);
        sbJ.append(", y2=");
        sbJ.append(this.f);
        sbJ.append(", x3=");
        sbJ.append(this.g);
        sbJ.append(", y3=");
        sbJ.append(this.h);
        sbJ.append(")");
        return sbJ.toString();
    }
}
