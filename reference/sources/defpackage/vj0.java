package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vj0 implements ak0 {
    public final float h;
    public final float i;

    public vj0(float f, e90 e90Var) {
        this.h = f;
        this.i = e90Var.b() * 386.0878f * 160.0f * 0.84f;
    }

    public final uj0 a(float f) {
        double dB = b(f);
        return new uj0(f, (float) (Math.exp(1.7362676463664735d * dB) * ((double) (this.h * this.i))), (long) (Math.exp(dB / 1.3582017421722412d) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = o8.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.h * this.i)));
    }

    @Override // defpackage.ak0
    public final long c(float f) {
        return ((long) ((((float) Math.log(this.h / Math.abs(f))) * 1000.0f) / this.i)) * 1000000;
    }

    @Override // defpackage.ak0
    public final float d() {
        return this.h;
    }

    @Override // defpackage.ak0
    public final float f(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.h;
        if (fAbs <= f3) {
            return f;
        }
        double dLog = Math.log(Math.abs(f3 / f2));
        float f4 = this.i;
        return ((f2 / f4) * ((float) Math.exp((((double) f4) * ((dLog / ((double) f4)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f4));
    }

    @Override // defpackage.ak0
    public final float g(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.i));
    }

    @Override // defpackage.ak0
    public final float h(float f, float f2, long j) {
        float f3 = this.i;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    public vj0() {
        this.h = 0.1f;
        this.i = -4.2f;
    }
}
