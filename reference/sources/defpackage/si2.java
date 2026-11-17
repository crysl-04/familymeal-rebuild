package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class si2 {
    public final lu1 a;
    public final lu1 b;
    public final p61 c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public long h;
    public long i;
    public c43 j;

    public si2() {
        Boolean bool = Boolean.FALSE;
        this.a = rz1.x(bool);
        this.b = rz1.x(bool);
        this.c = new p61((byte) 1);
        this.d = yg1.a();
        this.e = kv.f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = ez2.b;
        this.i = 0L;
    }

    public final boolean a() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        lu1 lu1Var = this.a;
        boolean zBooleanValue = ((Boolean) lu1Var.getValue()).booleanValue();
        lu1 lu1Var2 = this.b;
        if (zBooleanValue && !z) {
            lu1Var2.setValue(Boolean.TRUE);
        } else if (z) {
            lu1Var2.setValue(Boolean.FALSE);
        }
        lu1Var.setValue(Boolean.valueOf(z));
    }
}
