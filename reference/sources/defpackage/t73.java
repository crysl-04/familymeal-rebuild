package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t73 extends u73 {
    public final WindowInsetsAnimation e;

    public t73(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.u73
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.u73
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.u73
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.u73
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.u73
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
