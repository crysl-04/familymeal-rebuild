package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bm {
    public final float a;

    public bm(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, u31 u31Var) {
        float f = (i2 - i) / 2.0f;
        u31 u31Var2 = u31.h;
        float f2 = this.a;
        if (u31Var != u31Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bm) && Float.compare(this.a, ((bm) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
