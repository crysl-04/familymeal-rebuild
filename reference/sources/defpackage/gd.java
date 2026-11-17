package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gd extends id {
    public float a;
    public float b;
    public float c;

    public gd(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.id
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.id
    public final int b() {
        return 3;
    }

    @Override // defpackage.id
    public final id c() {
        return new gd(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.id
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.id
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gd)) {
            return false;
        }
        gd gdVar = (gd) obj;
        return gdVar.a == this.a && gdVar.b == this.b && gdVar.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + wi0.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder sbJ = wi0.j("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbJ.append(f3);
        return sbJ.toString();
    }
}
