package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface re1 extends k1, d1, ko1, xc2, zc2, yc2, cf0, j1, i1, no2, mo2 {
    default p91 A1(long j, long j2) {
        if (j < 0) {
            j = (int) h1();
        }
        if (j2 < 0) {
            j2 = (int) B1();
        }
        return new p91(this, j, j2);
    }

    fy1 C0();

    @Override // defpackage.k1
    default Comparable H(long j, long j2) {
        return h0(Math.toIntExact(j), Math.toIntExact(j2));
    }

    default a1 I(long j) {
        return new qe1(this, j, (byte) 1);
    }

    @Override // defpackage.k1
    double J(int i, int i2);

    default re1 L1(re1 re1Var) {
        int iZ1 = Z1();
        int iT = T();
        int iZ2 = re1Var.Z1();
        int iT2 = re1Var.T();
        fy1 fy1VarC0 = C0();
        tm tmVarL = fy1VarC0.i().l();
        if (iZ1 != iZ2 || iT != iT2) {
            gy1 gy1Var = (gy1) fy1VarC0.u(this, re1Var);
            gy1Var.k0(this, tmVarL, re1Var);
            return gy1Var;
        }
        dk1 dk1Var = (dk1) fy1VarC0.b(Z1(), T());
        gz2 gz2Var = (gz2) dk1Var;
        a(gz2Var);
        gz2Var.v1(tmVarL, re1Var);
        return (re1) dk1Var;
    }

    default re1 O0(re1 re1Var) {
        int iZ1 = Z1();
        int iT = T();
        int iZ2 = re1Var.Z1();
        int iT2 = re1Var.T();
        fy1 fy1VarC0 = C0();
        tm tmVarY = fy1VarC0.i().Y();
        if (iZ1 != iZ2 || iT != iT2) {
            gy1 gy1Var = (gy1) fy1VarC0.u(this, re1Var);
            gy1Var.k0(this, tmVarY, re1Var);
            return gy1Var;
        }
        dk1 dk1Var = (dk1) fy1VarC0.b(Z1(), T());
        gz2 gz2Var = (gz2) dk1Var;
        a(gz2Var);
        gz2Var.v1(tmVarY, re1Var);
        return (re1) dk1Var;
    }

    default re1 Q0() {
        return new wz2(this);
    }

    default gy1 U() {
        fy1 fy1VarC0 = C0();
        fy1VarC0.getClass();
        gy1 gy1Var = (gy1) fy1VarC0.a(h1(), B1()).build();
        a(gy1Var);
        return gy1Var;
    }

    default zp1 V1(long j, long j2) {
        if (j < 0) {
            j = 0;
        }
        return new zp1(this, j, j2 < 0 ? 0L : j2);
    }

    default Comparable W(int i) {
        im imVarM = C0().t().m(i);
        S1(imVarM);
        return (Comparable) imVarM.get();
    }

    default cf0 W1(l52 l52Var) {
        return new pe1(l52Var, this);
    }

    default re1 e1(re1 re1Var) {
        gy1 gy1Var = (gy1) C0().q(Z1(), re1Var.T());
        gy1Var.K1(this, re1Var);
        return gy1Var;
    }

    default re1 h(double d) {
        return i(C0().h().f(d));
    }

    Comparable h0(int i, int i2);

    default re1 i(Comparable comparable) {
        tm tmVarW = C0().i().W();
        tmVarW.getClass();
        return new d23(this, new sm(tmVarW, comparable));
    }

    default Comparable k() {
        im imVarM = C0().t().m(3);
        J0(imVarM);
        return (Comparable) imVarM.get();
    }

    @Override // defpackage.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    default void a(gz2 gz2Var) {
        if (!gz2Var.f0(this)) {
            throw new a42("Not acceptable!", (byte) 0);
        }
        gz2Var.Z(this);
    }

    default b o0(re1 re1Var) {
        fy1 fy1VarC0 = C0();
        long jB1 = B1();
        if (re1Var == null) {
            re1Var = new s93(fy1VarC0, re1Var);
        }
        long jB2 = re1Var.B1();
        if (jB2 < jB1) {
            re1Var = new b(re1Var, new z93(re1Var.C0(), re1Var.h1(), jB1 - jB2), (byte) 1);
        }
        return new b(this, re1Var, (byte) 0);
    }

    default Comparable r0(q22 q22Var) {
        gy1 gy1Var = (gy1) C0().b(1L, q22Var.size());
        gy1 gy1Var2 = (gy1) C0().b(1L, 1L);
        gy1 gy1Var3 = (gy1) C0().m(q22Var);
        gy1Var3.O1(C0().i().u());
        gy1Var.K1(gy1Var3, this);
        gy1Var2.K1(gy1Var, q22Var);
        return gy1Var2.G(0L);
    }

    default void r1(a1 a1Var, gz2 gz2Var) {
        gz2Var.K1(this, a1Var);
    }

    default a1 u(long j) {
        return new qe1(this, j, (byte) 0);
    }

    default void x(long j, long j2, im imVar) {
        imVar.d(H(j, j2));
    }
}
