package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class un2 implements vo {
    public final kp0 b;
    public final u31 c;
    public final boolean d;
    public final vo e;

    public un2(kp0 kp0Var, u31 u31Var, boolean z, vo voVar) {
        this.b = kp0Var;
        this.c = u31Var;
        this.d = z;
        this.e = voVar;
    }

    @Override // defpackage.vo
    public final float a(float f, float f2, float f3) {
        float fIntValue = ((Number) this.b.a()).intValue();
        boolean z = this.c == u31.i;
        if (this.d || !z) {
            f -= fIntValue;
        }
        return this.e.a(f, f2, f3 - fIntValue);
    }
}
