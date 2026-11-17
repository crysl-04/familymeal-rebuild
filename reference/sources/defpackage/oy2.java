package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oy2 implements o12 {
    public final int h;

    public oy2(int i) {
        this.h = i;
    }

    @Override // defpackage.o12
    public final long f(ry0 ry0Var, long j, u31 u31Var, long j2) {
        int i = ry0Var.a;
        int i2 = ry0Var.c;
        int i3 = (int) (j2 >> 32);
        int i4 = (((i2 - i) - i3) / 2) + i;
        if (i4 >= 0) {
            i = i4 + i3 > ((int) (j >> 32)) ? i2 - i3 : i4;
        }
        int i5 = ry0Var.b - ((int) (j2 & 4294967295L));
        int i6 = this.h;
        int i7 = i5 - i6;
        if (i7 < 0) {
            i7 = ry0Var.d + i6;
        }
        return (((long) i) << 32) | (((long) i7) & 4294967295L);
    }
}
