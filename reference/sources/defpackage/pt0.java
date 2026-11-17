package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pt0 {
    public final zp0 a;
    public final /* synthetic */ byte b;

    public pt0(zp0 zp0Var, byte b) {
        this.b = b;
        this.a = zp0Var;
    }

    public final float a(float f, t31 t31Var, t31 t31Var2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (t31Var2.t(t31Var, (((long) Float.floatToRawIntBits(((int) (t31Var.O() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (t31Var2.t(t31Var, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(((int) (t31Var.O() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
        }
    }
}
