package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class tt1 {
    public e9 a;
    public ln b;
    public float c = 1.0f;
    public u31 d = u31.h;

    public abstract void a(float f);

    public abstract void b(ln lnVar);

    public final void c(td0 td0Var, long j, float f, ln lnVar) {
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!uz0.g(this.b, lnVar)) {
            b(lnVar);
            this.b = lnVar;
        }
        u31 layoutDirection = td0Var.getLayoutDirection();
        if (this.d != layoutDirection) {
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (td0Var.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (td0Var.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((g2) td0Var.F().i).G(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    e(td0Var);
                }
            } finally {
                ((g2) td0Var.F().i).G(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(td0 td0Var);
}
