package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hv1 extends uv1 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public hv1(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv1)) {
            return false;
        }
        hv1 hv1Var = (hv1) obj;
        return Float.compare(this.c, hv1Var.c) == 0 && Float.compare(this.d, hv1Var.d) == 0 && Float.compare(this.e, hv1Var.e) == 0 && Float.compare(this.f, hv1Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + wi0.d(this.e, wi0.d(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = wi0.j("QuadTo(x1=", this.c, ", y1=", this.d, ", x2=");
        sbJ.append(this.e);
        sbJ.append(", y2=");
        sbJ.append(this.f);
        sbJ.append(")");
        return sbJ.toString();
    }
}
