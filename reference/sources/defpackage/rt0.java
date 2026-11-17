package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rt0 implements hi2 {
    public static final rt0 b = new rt0(0);
    public static final rt0 c = new rt0(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ rt0(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.hi2
    public final ou a(long j, u31 u31Var, e90 e90Var) {
        switch (this.a) {
            case 0:
                float fR = e90Var.R(30.0f);
                return new ns1(new r72(0.0f, -fR, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fR));
            case 1:
                float fR2 = e90Var.R(30.0f);
                return new ns1(new r72(-fR2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fR2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new ns1(h12.b(0L, j));
        }
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
