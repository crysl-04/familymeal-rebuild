package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class br {
    public final float a;

    public br(float f, float f2) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof br)) {
            return false;
        }
        return cc0.b(0.0f, 0.0f) && cc0.b(0.0f, 0.0f) && cc0.b(0.0f, 0.0f) && cc0.b(this.a, ((br) obj).a) && cc0.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(this.a) * 31;
    }
}
