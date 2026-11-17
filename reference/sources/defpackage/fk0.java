package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fk0 implements xj0 {
    public final int a;
    public final ke0 b;
    public final long c;
    public final long d;

    public fk0(int i, int i2, ke0 ke0Var) {
        this.a = i;
        this.b = ke0Var;
        this.c = ((long) i) * 1000000;
        this.d = ((long) i2) * 1000000;
    }

    @Override // defpackage.xj0
    public final float b(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fC = this.b.c(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * fC) + ((1.0f - fC) * f);
    }

    @Override // defpackage.xj0
    public final float c(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (b(j4, f, f2, f3) - b(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.xj0
    public final long d(float f, float f2, float f3) {
        return this.d + this.c;
    }
}
