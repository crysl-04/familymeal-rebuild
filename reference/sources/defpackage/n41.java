package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n41 implements td0 {
    public final yq h = new yq();
    public sd0 i;

    @Override // defpackage.e90
    public final float A(float f) {
        return this.h.b() * f;
    }

    @Override // defpackage.td0
    public final eg F() {
        return this.h.i;
    }

    @Override // defpackage.e90
    public final int J(long j) {
        return this.h.J(j);
    }

    @Override // defpackage.e90
    public final float L(long j) {
        return this.h.L(j);
    }

    @Override // defpackage.td0
    public final void P(t8 t8Var, long j, long j2, long j3, float f, ln lnVar, int i) {
        this.h.P(t8Var, j, j2, j3, f, lnVar, i);
    }

    @Override // defpackage.e90
    public final int R(float f) {
        return this.h.R(f);
    }

    @Override // defpackage.td0
    public final long X() {
        return this.h.X();
    }

    @Override // defpackage.td0
    public final void Z(l9 l9Var, long j, ud0 ud0Var) {
        this.h.Z(l9Var, j, ud0Var);
    }

    public final void a() {
        yq yqVar = this.h;
        eg egVar = yqVar.i;
        wq wqVarG = yqVar.i.g();
        j80 j80Var = this.i;
        if (j80Var == null) {
            throw wi0.e("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        qg1 qg1Var = (qg1) j80Var;
        qg1 qg1VarR = qg1Var.h.m;
        if (qg1VarR != null && (qg1VarR.k & 4) != 0) {
            while (true) {
                if (qg1VarR != null) {
                    int i = qg1VarR.j;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            qg1VarR = qg1VarR.m;
                        }
                    }
                }
                qg1VarR = null;
                break;
            }
        } else {
            qg1VarR = null;
            break;
        }
        if (qg1VarR == null) {
            pn1 pn1VarW = cu.W(j80Var, 4);
            if (pn1VarW.V0() == qg1Var.h) {
                pn1VarW = pn1VarW.C;
                pn1VarW.getClass();
            }
            pn1VarW.l1(wqVarG, (cs0) egVar.j);
            return;
        }
        uj1 uj1Var = null;
        while (qg1VarR != null) {
            if (qg1VarR instanceof sd0) {
                sd0 sd0Var = (sd0) qg1VarR;
                cs0 cs0Var = (cs0) egVar.j;
                pn1 pn1VarW2 = cu.W(sd0Var, 4);
                long jG = ou.G(pn1VarW2.j);
                l41 l41Var = pn1VarW2.B;
                l41Var.getClass();
                o41.a(l41Var).getSharedDrawScope().c(wqVarG, jG, pn1VarW2, sd0Var, cs0Var);
            } else if ((qg1VarR.j & 4) != 0 && (qg1VarR instanceof k80)) {
                int i2 = 0;
                for (qg1 qg1Var2 = ((k80) qg1VarR).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                    if ((qg1Var2.j & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            qg1VarR = qg1Var2;
                        } else {
                            if (uj1Var == null) {
                                uj1Var = new uj1(new qg1[16]);
                            }
                            if (qg1VarR != null) {
                                uj1Var.b(qg1VarR);
                                qg1VarR = null;
                            }
                            uj1Var.b(qg1Var2);
                        }
                    }
                }
                if (i2 != 1) {
                }
            }
            qg1VarR = cu.R(uj1Var);
        }
    }

    @Override // defpackage.e90
    public final float b() {
        return this.h.b();
    }

    public final void c(wq wqVar, long j, pn1 pn1Var, sd0 sd0Var, cs0 cs0Var) {
        sd0 sd0Var2 = this.i;
        this.i = sd0Var;
        u31 u31Var = pn1Var.B.F;
        eg egVar = this.h.i;
        xq xqVar = ((yq) egVar.k).h;
        e90 e90Var = xqVar.a;
        u31 u31Var2 = xqVar.b;
        wq wqVarG = egVar.g();
        long jQ = egVar.q();
        cs0 cs0Var2 = (cs0) egVar.j;
        egVar.F(pn1Var);
        egVar.G(u31Var);
        egVar.E(wqVar);
        egVar.H(j);
        egVar.j = cs0Var;
        wqVar.l();
        try {
            sd0Var.O(this);
            wqVar.i();
            egVar.F(e90Var);
            egVar.G(u31Var2);
            egVar.E(wqVarG);
            egVar.H(jQ);
            egVar.j = cs0Var2;
            this.i = sd0Var2;
        } catch (Throwable th) {
            wqVar.i();
            egVar.F(e90Var);
            egVar.G(u31Var2);
            egVar.E(wqVarG);
            egVar.H(jQ);
            egVar.j = cs0Var2;
            throw th;
        }
    }

    @Override // defpackage.e90
    public final long c0(long j) {
        return this.h.c0(j);
    }

    @Override // defpackage.td0
    public final long d() {
        return this.h.d();
    }

    @Override // defpackage.e90
    public final float f0(long j) {
        return this.h.f0(j);
    }

    @Override // defpackage.td0
    public final u31 getLayoutDirection() {
        return this.h.h.b;
    }

    @Override // defpackage.td0
    public final void h(l9 l9Var, zo zoVar, float f, ud0 ud0Var, int i) {
        this.h.h(l9Var, zoVar, f, ud0Var, i);
    }

    @Override // defpackage.td0
    public final void i0(long j, long j2, long j3, float f) {
        this.h.i0(j, j2, j3, f);
    }

    @Override // defpackage.e90
    public final long m0(float f) {
        return this.h.m0(f);
    }

    @Override // defpackage.e90
    public final float n() {
        return this.h.n();
    }

    @Override // defpackage.e90
    public final float r0(int i) {
        return this.h.r0(i);
    }

    @Override // defpackage.td0
    public final void s(float f, long j, long j2) {
        this.h.s(f, j, j2);
    }

    @Override // defpackage.e90
    public final float u0(float f) {
        return f / this.h.b();
    }

    @Override // defpackage.td0
    public final void v0(long j, float f, float f2, long j2, long j3, ud0 ud0Var) {
        this.h.v0(j, f, f2, j2, j3, ud0Var);
    }

    @Override // defpackage.e90
    public final long w(float f) {
        return this.h.w(f);
    }

    @Override // defpackage.e90
    public final long x(long j) {
        return this.h.x(j);
    }

    @Override // defpackage.td0
    public final void y(long j, long j2, int i, long j3) {
        this.h.y(j, j2, i, j3);
    }

    @Override // defpackage.td0
    public final void z(long j, long j2, long j3, long j4, ud0 ud0Var) {
        this.h.z(j, j2, j3, j4, ud0Var);
    }
}
