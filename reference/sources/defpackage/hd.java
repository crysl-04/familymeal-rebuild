package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hd extends id {
    public float a;
    public float b;
    public float c;
    public float d;

    public hd(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.id
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.id
    public final int b() {
        return 4;
    }

    @Override // defpackage.id
    public final id c() {
        return new hd(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.id
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.id
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hd)) {
            return false;
        }
        hd hdVar = (hd) obj;
        return hdVar.a == this.a && hdVar.b == this.b && hdVar.c == this.c && hdVar.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + wi0.d(this.c, wi0.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sbJ = wi0.j("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbJ.append(f3);
        sbJ.append(", v4 = ");
        sbJ.append(f4);
        return sbJ.toString();
    }
}
