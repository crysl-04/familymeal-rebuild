package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j90 implements e90 {
    public final float h;
    public final float i;
    public final ln0 j;

    public j90(float f, float f2, ln0 ln0Var) {
        this.h = f;
        this.i = f2;
        this.j = ln0Var;
    }

    @Override // defpackage.e90
    public final float L(long j) {
        if (bx2.a(ax2.b(j), 4294967296L)) {
            return this.j.b(ax2.c(j));
        }
        li1.g("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // defpackage.e90
    public final float b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j90)) {
            return false;
        }
        j90 j90Var = (j90) obj;
        return Float.compare(this.h, j90Var.h) == 0 && Float.compare(this.i, j90Var.i) == 0 && this.j.equals(j90Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + wi0.d(this.i, Float.hashCode(this.h) * 31, 31);
    }

    @Override // defpackage.e90
    public final float n() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sbJ = wi0.j("DensityWithConverter(density=", this.h, ", fontScale=", this.i, ", converter=");
        sbJ.append(this.j);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // defpackage.e90
    public final long w(float f) {
        return r02.z(this.j.a(f), 4294967296L);
    }
}
