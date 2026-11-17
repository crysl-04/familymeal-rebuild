package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jm1 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public jm1(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jm1.class == obj.getClass()) {
            jm1 jm1Var = (jm1) obj;
            return this.c == jm1Var.c && this.d == jm1Var.d && this.b == jm1Var.b && this.a == jm1Var.a && this.e == jm1Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + jp1.b(this.a, wi0.d(this.b, wi0.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
