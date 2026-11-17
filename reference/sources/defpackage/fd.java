package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fd extends id {
    public float a;
    public float b;

    public fd(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.id
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.id
    public final int b() {
        return 2;
    }

    @Override // defpackage.id
    public final id c() {
        return new fd(0.0f, 0.0f);
    }

    @Override // defpackage.id
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.id
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fd)) {
            return false;
        }
        fd fdVar = (fd) obj;
        return fdVar.a == this.a && fdVar.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
