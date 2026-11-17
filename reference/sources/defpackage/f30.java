package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class f30 extends ys {
    public final bm h;

    public f30(bm bmVar) {
        this.h = bmVar;
    }

    @Override // defpackage.ys
    public final int d(int i, int i2, u31 u31Var) {
        return this.h.a(i2, i, u31Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f30) && uz0.g(this.h, ((f30) obj).h);
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.h.a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.h + ")";
    }
}
