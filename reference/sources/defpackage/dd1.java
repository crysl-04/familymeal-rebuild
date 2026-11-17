package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dd1 implements t31 {
    public final cd1 h;

    public dd1(cd1 cd1Var) {
        this.h = cd1Var;
    }

    @Override // defpackage.t31
    public final boolean C() {
        return this.h.B.V0().u;
    }

    @Override // defpackage.t31
    public final void E(float[] fArr) {
        this.h.B.E(fArr);
    }

    @Override // defpackage.t31
    public final long G(t31 t31Var, long j) {
        boolean z = t31Var instanceof dd1;
        cd1 cd1Var = this.h;
        if (!z) {
            cd1 cd1VarF = dt.F(cd1Var);
            pn1 pn1Var = cd1VarF.B;
            long jG = G(cd1VarF.E, j);
            long j2 = cd1VarF.C;
            long jD = up1.d(jG, (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L));
            if (!pn1Var.V0().u) {
                ax0.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            pn1Var.f1();
            pn1 pn1Var2 = pn1Var.D;
            if (pn1Var2 != null) {
                pn1Var = pn1Var2;
            }
            return up1.e(jD, pn1Var.G(t31Var, 0L));
        }
        cd1 cd1Var2 = ((dd1) t31Var).h;
        pn1 pn1Var3 = cd1Var2.B;
        pn1Var3.f1();
        cd1 cd1VarT0 = cd1Var.B.R0(pn1Var3).T0();
        if (cd1VarT0 != null) {
            long jB = ny0.b(ny0.c(cd1Var2.M0(cd1VarT0, false), lt.d0(j)), cd1Var.M0(cd1VarT0, false));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        cd1 cd1VarF2 = dt.F(cd1Var2);
        long jC = ny0.c(ny0.c(cd1Var2.M0(cd1VarF2, false), cd1VarF2.C), lt.d0(j));
        cd1 cd1VarF3 = dt.F(cd1Var);
        long jB2 = ny0.b(jC, ny0.c(cd1Var.M0(cd1VarF3, false), cd1VarF3.C));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (jB2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L);
        pn1 pn1Var4 = cd1VarF3.B.D;
        pn1Var4.getClass();
        pn1 pn1Var5 = cd1VarF2.B.D;
        pn1Var5.getClass();
        return pn1Var4.G(pn1Var5, jFloatToRawIntBits);
    }

    @Override // defpackage.t31
    public final void K(t31 t31Var, float[] fArr) {
        this.h.B.K(t31Var, fArr);
    }

    @Override // defpackage.t31
    public final r72 M(t31 t31Var, boolean z) {
        return this.h.B.M(t31Var, z);
    }

    @Override // defpackage.t31
    public final long O() {
        cd1 cd1Var = this.h;
        return (((long) cd1Var.h) << 32) | (((long) cd1Var.i) & 4294967295L);
    }

    @Override // defpackage.t31
    public final long S(long j) {
        return this.h.B.S(up1.e(j, a()));
    }

    public final long a() {
        cd1 cd1Var = this.h;
        cd1 cd1VarF = dt.F(cd1Var);
        return up1.d(G(cd1VarF.E, 0L), cd1Var.B.G(cd1VarF.B, 0L));
    }

    @Override // defpackage.t31
    public final long c(long j) {
        return this.h.B.c(up1.e(j, a()));
    }

    @Override // defpackage.t31
    public final long i(long j) {
        return up1.e(this.h.B.i(j), a());
    }

    @Override // defpackage.t31
    public final long k(long j) {
        return this.h.B.k(up1.e(j, a()));
    }

    @Override // defpackage.t31
    public final t31 m() {
        cd1 cd1VarT0;
        if (!C()) {
            ax0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        pn1 pn1Var = this.h.B.B.L.d.D;
        if (pn1Var == null || (cd1VarT0 = pn1Var.T0()) == null) {
            return null;
        }
        return cd1VarT0.E;
    }

    @Override // defpackage.t31
    public final long t(t31 t31Var, long j) {
        return G(t31Var, j);
    }

    @Override // defpackage.t31
    public final long v(long j) {
        return up1.e(this.h.B.v(j), a());
    }
}
