package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public final float a;
    public final rl2 b;

    public zn(float f, rl2 rl2Var) {
        this.a = f;
        this.b = rl2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn)) {
            return false;
        }
        zn znVar = (zn) obj;
        return cc0.b(this.a, znVar.a) && this.b.equals(znVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + cc0.c(this.a) + ", brush=" + this.b + ")";
    }
}
