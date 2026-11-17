package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q41 implements ap2, bf1 {
    public final /* synthetic */ t41 h;
    public final /* synthetic */ z41 i;

    public q41(z41 z41Var) {
        this.i = z41Var;
        this.h = z41Var.o;
    }

    @Override // defpackage.e90
    public final float A(float f) {
        return this.h.b() * f;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    @Override // defpackage.ap2
    public final List I(zp0 zp0Var, Object obj) {
        l41 l41Var;
        r41 r41Var;
        z41 z41Var = this.i;
        l41 l41Var2 = z41Var.h;
        mj1 mj1Var = z41Var.n;
        l41 l41Var3 = (l41) mj1Var.g(obj);
        if (l41Var3 != null && ((uj1) ((dj1) l41Var2.o()).i).i(l41Var3) < z41Var.k) {
            return l41Var3.m();
        }
        mj1 mj1Var2 = z41Var.s;
        mj1 mj1Var3 = z41Var.q;
        uj1 uj1Var = z41Var.t;
        if (uj1Var.j < z41Var.l) {
            ax0.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        l41 l41Var4 = (l41) mj1Var.g(obj);
        int i = uj1Var.j;
        int i2 = z41Var.l;
        if (i == i2) {
            uj1Var.b(obj);
        } else {
            Object[] objArr = uj1Var.h;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        z41Var.l++;
        if (mj1Var3.b(obj)) {
            l41Var = (l41) mj1Var3.g(obj);
            if (l41Var != null) {
                r41Var = (r41) z41Var.m.g(l41Var);
            } else {
                r41Var = null;
            }
            if (r41Var != null && r41Var.d) {
                z41Var.m(l41Var, obj, false, zp0Var);
            }
            if ((r41Var != null ? r41Var.f : null) != null) {
                z41Var.c(r41Var, true);
            }
        } else if (l41Var4 == null) {
            z41Var.k(obj, zp0Var, false);
            mj1Var2.n(obj, z41Var.e(obj));
        } else {
            z41Var.j(((uj1) ((dj1) l41Var2.o()).i).i(l41Var4), ((uj1) ((dj1) l41Var2.o()).i).j);
            z41Var.v++;
            mj1Var.l(obj);
            mj1Var3.n(obj, l41Var4);
            mj1Var2.n(obj, z41Var.e(obj));
            if (l41Var2.I()) {
                z41Var.h();
            }
            l41Var = (l41) mj1Var3.g(obj);
            if (l41Var != null) {
                r41Var = (r41) z41Var.m.g(l41Var);
            } else {
                r41Var = null;
            }
            if (r41Var != null) {
                z41Var.m(l41Var, obj, false, zp0Var);
            }
            if ((r41Var != null ? r41Var.f : null) != null) {
                z41Var.c(r41Var, true);
            }
        }
        l41 l41Var5 = (l41) mj1Var3.g(obj);
        if (l41Var5 == null) {
            return ag0.h;
        }
        List listQ0 = l41Var5.M.p.q0();
        dj1 dj1Var = (dj1) listQ0;
        int i3 = ((uj1) dj1Var.i).j;
        for (int i4 = 0; i4 < i3; i4++) {
            ((ye1) dj1Var.get(i4)).m.b = true;
        }
        return listQ0;
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
        return this.h.Q(i, i2, map, vp0Var, vp0Var2);
    }

    @Override // defpackage.e90
    public final int R(float f) {
        return this.h.R(f);
    }

    @Override // defpackage.e90
    public final float b() {
        return this.h.i;
    }

    @Override // defpackage.e90
    public final long c0(long j) {
        return this.h.c0(j);
    }

    @Override // defpackage.e90
    public final float f0(long j) {
        return this.h.f0(j);
    }

    @Override // defpackage.bf1
    public final af1 g0(int i, int i2, Map map, vp0 vp0Var) {
        return this.h.Q(i, i2, map, null, vp0Var);
    }

    @Override // defpackage.nz0
    public final u31 getLayoutDirection() {
        return this.h.h;
    }

    @Override // defpackage.e90
    public final long m0(float f) {
        return this.h.m0(f);
    }

    @Override // defpackage.e90
    public final float n() {
        return this.h.j;
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
        return f / this.h.b();
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
