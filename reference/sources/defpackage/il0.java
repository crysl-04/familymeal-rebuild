package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class il0 {
    public final ml0 a;
    public final long b;
    public final int c;
    public final int d;

    public il0(ml0 ml0Var, long j, int i, int i2) {
        this.a = ml0Var;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public final cu a(hl0 hl0Var, boolean z, int i, int i2, int i3, int i4) {
        if (!hl0Var.b) {
            return null;
        }
        this.a.getClass();
        return null;
    }

    public final hl0 b(boolean z, int i, long j, iy0 iy0Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (iy0Var == null) {
            return new hl0(true, true);
        }
        long j2 = iy0Var.a;
        this.a.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new hl0(true, true);
        }
        if (i == 0 || (i < Integer.MAX_VALUE && ((int) (j >> 32)) - ((int) (j2 >> 32)) >= 0)) {
            return new hl0(false, false);
        }
        return z2 ? new hl0(true, true) : new hl0(true, b(z, 0, iy0.a(k00.i(this.b), (((int) (j & 4294967295L)) - this.d) - i4), new iy0(iy0.a(((int) (j2 >> 32)) - this.c, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).b);
    }
}
