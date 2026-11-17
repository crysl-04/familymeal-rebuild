package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gk0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public gk0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gk0)) {
            return false;
        }
        gk0 gk0Var = (gk0) obj;
        if (cc0.b(this.a, gk0Var.a) && cc0.b(this.b, gk0Var.b) && cc0.b(this.c, gk0Var.c)) {
            return cc0.b(this.d, gk0Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + wi0.d(this.c, wi0.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
