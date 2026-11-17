package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a01 implements bf1, nz0 {
    public final /* synthetic */ nz0 h;
    public final u31 i;

    public a01(nz0 nz0Var, u31 u31Var) {
        this.h = nz0Var;
        this.i = u31Var;
    }

    @Override // defpackage.e90
    public final float A(float f) {
        return this.h.A(f);
    }

    @Override // defpackage.e90
    public final int J(long j) {
        return this.h.J(j);
    }

    @Override // defpackage.e90
    public final float L(long j) {
        return this.h.L(j);
    }

    @Override // defpackage.bf1
    public final af1 Q(int i, int i2, Map map, vp0 vp0Var, vp0 vp0Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ax0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new zz0(i, i2, map, vp0Var);
    }

    @Override // defpackage.e90
    public final int R(float f) {
        return this.h.R(f);
    }

    @Override // defpackage.e90
    public final float b() {
        return this.h.b();
    }

    @Override // defpackage.e90
    public final long c0(long j) {
        return this.h.c0(j);
    }

    @Override // defpackage.e90
    public final float f0(long j) {
        return this.h.f0(j);
    }

    @Override // defpackage.nz0
    public final u31 getLayoutDirection() {
        return this.i;
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

    @Override // defpackage.nz0
    public final boolean u() {
        return this.h.u();
    }

    @Override // defpackage.e90
    public final float u0(float f) {
        return this.h.u0(f);
    }

    @Override // defpackage.e90
    public final long w(float f) {
        return this.h.w(f);
    }

    @Override // defpackage.e90
    public final long x(long j) {
        return this.h.x(j);
    }
}
