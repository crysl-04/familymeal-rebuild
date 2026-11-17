package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dc0 implements l20 {
    public final float a;

    public dc0(float f) {
        this.a = f;
    }

    @Override // defpackage.l20
    public final float a(long j, e90 e90Var) {
        return e90Var.A(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof dc0) && cc0.b(this.a, ((dc0) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
