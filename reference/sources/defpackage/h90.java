package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h90 implements e90 {
    public final float h;
    public final float i;

    public h90(float f, float f2) {
        this.h = f;
        this.i = f2;
    }

    @Override // defpackage.e90
    public final float b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h90)) {
            return false;
        }
        h90 h90Var = (h90) obj;
        return Float.compare(this.h, h90Var.h) == 0 && Float.compare(this.i, h90Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + (Float.hashCode(this.h) * 31);
    }

    @Override // defpackage.e90
    public final float n() {
        return this.i;
    }

    public final String toString() {
        return "DensityImpl(density=" + this.h + ", fontScale=" + this.i + ")";
    }
}
