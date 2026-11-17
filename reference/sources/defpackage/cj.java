package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cj {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public cj(jm1 jm1Var) {
        jm1Var.getClass();
        float f = jm1Var.c;
        float f2 = jm1Var.d;
        float f3 = jm1Var.b;
        int i = jm1Var.a;
        long j = jm1Var.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
