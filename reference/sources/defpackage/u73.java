package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class u73 {
    public final int a;
    public float b;
    public final Interpolator c;
    public final short d;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public u73(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = (int) j;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.d;
    }

    public float c() {
        float f = this.b;
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public int d() {
        return this.a;
    }

    public void e(float f) {
        this.b = f;
    }
}
