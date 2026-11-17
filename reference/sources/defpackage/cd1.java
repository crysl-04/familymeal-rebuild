package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class cd1 extends ad1 implements ue1 {
    public final pn1 B;
    public LinkedHashMap D;
    public af1 F;
    public final bj1 G;
    public long C = 0;
    public final dd1 E = new dd1(this);

    public cd1(pn1 pn1Var) {
        this.B = pn1Var;
        bj1 bj1Var = ip1.a;
        this.G = new bj1();
    }

    @Override // defpackage.ad1
    public final boolean A0() {
        return this.F != null;
    }

    @Override // defpackage.ad1
    public final l41 B0() {
        return this.B.B;
    }

    @Override // defpackage.ad1
    public final af1 C0() {
        af1 af1Var = this.F;
        if (af1Var != null) {
            return af1Var;
        }
        throw wi0.e("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.ad1
    public final ad1 D0() {
        pn1 pn1Var = this.B.D;
        if (pn1Var != null) {
            return pn1Var.T0();
        }
        return null;
    }

    @Override // defpackage.ad1
    public final long E0() {
        return this.C;
    }

    @Override // defpackage.ad1
    public final void I0() {
        n0(this.C, 0.0f, null);
    }

    public void K0() {
        C0().b();
    }

    public final void L0(long j) {
        if (!ny0.a(this.C, j)) {
            this.C = j;
            pn1 pn1Var = this.B;
            gd1 gd1Var = pn1Var.B.M.q;
            if (gd1Var != null) {
                gd1Var.x0();
            }
            ad1.G0(pn1Var);
        }
        if (this.v) {
            return;
        }
        x0(C0());
    }

    public final long M0(cd1 cd1Var, boolean z) {
        long jC = 0;
        while (!this.equals(cd1Var)) {
            if (!this.s || !z) {
                jC = ny0.c(jC, this.C);
            }
            pn1 pn1Var = this.B.D;
            pn1Var.getClass();
            this = pn1Var.T0();
            this.getClass();
        }
        return jC;
    }

    public final void N0(af1 af1Var) {
        LinkedHashMap linkedHashMap;
        if (af1Var != null) {
            o0((((long) af1Var.g()) << 32) | (((long) af1Var.d()) & 4294967295L));
        } else {
            o0(0L);
        }
        if (!uz0.g(this.F, af1Var) && af1Var != null && ((((linkedHashMap = this.D) != null && !linkedHashMap.isEmpty()) || !af1Var.a().isEmpty()) && !uz0.g(af1Var.a(), this.D))) {
            gd1 gd1Var = this.B.B.M.q;
            gd1Var.getClass();
            gd1Var.y.f();
            LinkedHashMap linkedHashMap2 = this.D;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.D = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(af1Var.a());
        }
        this.F = af1Var;
    }

    @Override // defpackage.e90
    public final float b() {
        return this.B.b();
    }

    @Override // defpackage.nz0
    public final u31 getLayoutDirection() {
        return this.B.B.F;
    }

    @Override // defpackage.ny1, defpackage.ue1
    public final Object l() {
        return this.B.l();
    }

    @Override // defpackage.e90
    public final float n() {
        return this.B.n();
    }

    @Override // defpackage.ny1
    public final void n0(long j, float f, vp0 vp0Var) {
        L0(j);
        if (this.u) {
            return;
        }
        K0();
    }

    @Override // defpackage.ad1, defpackage.nz0
    public final boolean u() {
        return true;
    }

    @Override // defpackage.ad1
    public final ad1 y0() {
        pn1 pn1Var = this.B.C;
        if (pn1Var != null) {
            return pn1Var.T0();
        }
        return null;
    }

    @Override // defpackage.ad1
    public final t31 z0() {
        return this.E;
    }
}
