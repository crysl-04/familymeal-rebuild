package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ax1 implements l20 {
    public final float a;

    public ax1(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            dx0.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.l20
    public final float a(long j, e90 e90Var) {
        return (this.a / 100.0f) * wj2.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax1) && Float.compare(this.a, ((ax1) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
