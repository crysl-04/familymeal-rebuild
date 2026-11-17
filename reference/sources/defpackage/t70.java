package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t70 implements ke2 {
    public final vp0 a;
    public final s70 b = new s70(this);
    public final lk1 c = new lk1();
    public final lu1 d;
    public final lu1 e;
    public final lu1 f;

    public t70(vp0 vp0Var) {
        this.a = vp0Var;
        Boolean bool = Boolean.FALSE;
        this.d = rz1.x(bool);
        this.e = rz1.x(bool);
        this.f = rz1.x(bool);
    }

    @Override // defpackage.ke2
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.ke2
    public final Object d(ek1 ek1Var, zp0 zp0Var, n10 n10Var) {
        Object objX = vs.x(new j(this, ek1Var, zp0Var, null, (byte) 6), n10Var);
        return objX == y20.h ? objX : j23.a;
    }

    @Override // defpackage.ke2
    public final float e(float f) {
        return ((Number) this.a.h(Float.valueOf(f))).floatValue();
    }
}
