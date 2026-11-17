package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface td0 extends e90 {
    static void D(n41 n41Var, rl2 rl2Var, long j, long j2, long j3, ud0 ud0Var, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        long jW0 = (i & 4) != 0 ? w0(n41Var.h.d(), j4) : j2;
        ud0 ud0Var2 = (i & 32) != 0 ? xi0.a : ud0Var;
        yq yqVar = n41Var.h;
        int i2 = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        yqVar.h.c.j(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jW0 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jW0 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), yqVar.c(rl2Var, ud0Var2, 1.0f, null, 3, 1));
    }

    static void H(td0 td0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = w0(td0Var.d(), 0L);
        }
        td0Var.y(j, 0L, (i & 64) != 0 ? 3 : 0, j2);
    }

    static void N(n41 n41Var, t8 t8Var, ln lnVar) {
        yq yqVar = n41Var.h;
        yqVar.h.c.a(t8Var, yqVar.c(null, xi0.a, 1.0f, lnVar, 3, 1));
    }

    static void T(td0 td0Var, t8 t8Var, long j, long j2, float f, ln lnVar, int i, int i2) {
        td0Var.P(t8Var, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, lnVar, (i2 & 512) != 0 ? 1 : i);
    }

    static void V(n41 n41Var, zo zoVar, long j, long j2, float f, ud0 ud0Var, int i) {
        long j3 = (i & 2) != 0 ? 0L : j;
        long jW0 = (i & 4) != 0 ? w0(n41Var.h.d(), j3) : j2;
        float f2 = (i & 8) != 0 ? 1.0f : f;
        ud0 ud0Var2 = (i & 16) != 0 ? xi0.a : ud0Var;
        yq yqVar = n41Var.h;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        yqVar.h.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jW0 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jW0 & 4294967295L)) + Float.intBitsToFloat(i3), yqVar.c(zoVar, ud0Var2, f2, null, 3, 1));
    }

    static void b0(td0 td0Var, long j, long j2, long j3, long j4, ud0 ud0Var, int i) {
        td0Var.z(j, (i & 2) != 0 ? 0L : j2, j3, j4, ud0Var);
    }

    static void e0(td0 td0Var, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = td0Var.X();
        }
        td0Var.s(f, j, j2);
    }

    static void f(td0 td0Var, l9 l9Var, zo zoVar, float f, ud0 ud0Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            ud0Var = xi0.a;
        }
        td0Var.h(l9Var, zoVar, f2, ud0Var, (i & 32) != 0 ? 3 : 0);
    }

    static long w0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    eg F();

    void P(t8 t8Var, long j, long j2, long j3, float f, ln lnVar, int i);

    default long X() {
        return m02.l(F().q());
    }

    void Z(l9 l9Var, long j, ud0 ud0Var);

    default long d() {
        return F().q();
    }

    u31 getLayoutDirection();

    void h(l9 l9Var, zo zoVar, float f, ud0 ud0Var, int i);

    void i0(long j, long j2, long j3, float f);

    void s(float f, long j, long j2);

    void v0(long j, float f, float f2, long j2, long j3, ud0 ud0Var);

    void y(long j, long j2, int i, long j3);

    void z(long j, long j2, long j3, long j4, ud0 ud0Var);
}
