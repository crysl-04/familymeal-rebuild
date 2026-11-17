package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uf2 {
    public final float a;
    public final float b;

    public uf2(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uf2)) {
            return false;
        }
        return cc0.b(0.0f, 0.0f) && cc0.b(0.0f, 0.0f) && cc0.b(0.0f, 0.0f) && cc0.b(this.a, ((uf2) obj).a) && cc0.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(this.a) * 31;
    }
}
