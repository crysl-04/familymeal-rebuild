package defpackage;

import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class es0 implements gt1 {
    public boolean A;
    public cs0 h;
    public final bs0 i;
    public final t6 j;
    public zp0 k;
    public mn1 l;
    public boolean n;
    public float[] p;
    public boolean q;
    public int u;
    public ou w;
    public boolean x;
    public boolean y;
    public long m = 9223372034707292159L;
    public final float[] o = ke1.a();
    public e90 r = ls.c();
    public u31 s = u31.h;
    public final yq t = new yq();
    public long v = ez2.b;
    public boolean z = true;
    public final p B = new p((Object) this, (byte) 24);

    public es0(cs0 cs0Var, bs0 bs0Var, t6 t6Var, zp0 zp0Var, mn1 mn1Var) {
        this.h = cs0Var;
        this.i = bs0Var;
        this.j = t6Var;
        this.k = zp0Var;
        this.l = mn1Var;
    }

    public final float[] a() {
        float[] fArrA = this.p;
        if (fArrA == null) {
            fArrA = ke1.a();
            this.p = fArrA;
        }
        if (this.y) {
            this.y = false;
            float[] fArrB = b();
            if (this.z) {
                return fArrB;
            }
            if (!vs.F(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.x;
        float[] fArr = this.o;
        if (z) {
            cs0 cs0Var = this.h;
            long jL = cs0Var.z;
            if ((9223372034707292159L & jL) == 9205357640488583168L) {
                jL = m02.l(ou.G(this.m));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
            gs0 gs0Var = cs0Var.a;
            float f = gs0Var.n;
            float f2 = gs0Var.o;
            float f3 = gs0Var.s;
            float f4 = gs0Var.t;
            float f5 = gs0Var.u;
            float f6 = gs0Var.l;
            float f7 = gs0Var.m;
            double d = ((double) f3) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f8 = -fSin;
            float f9 = (f2 * fCos) - (0.0f * fSin);
            float f10 = (0.0f * fCos) + (f2 * fSin);
            double d2 = ((double) f4) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f11 = -fSin2;
            float f12 = fSin * fSin2;
            float f13 = fSin * fCos2;
            float f14 = fCos * fSin2;
            float f15 = fCos * fCos2;
            float f16 = (f10 * fSin2) + (f * fCos2);
            float f17 = (f10 * fCos2) + ((-f) * fSin2);
            double d3 = ((double) f5) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f18 = -fSin3;
            float f19 = (fCos3 * f12) + (f18 * fCos2);
            float f20 = (f12 * fSin3) + (fCos2 * fCos3);
            float f21 = fSin3 * fCos;
            float f22 = f20 * f6;
            float f23 = f21 * f6;
            float f24 = ((fSin3 * f13) + (fCos3 * f11)) * f6;
            float f25 = f19 * f7;
            float f26 = fCos * fCos3 * f7;
            float f27 = ((fCos3 * f13) + (f18 * f11)) * f7;
            float f28 = f14 * 1.0f;
            float f29 = f8 * 1.0f;
            float f30 = f15 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f22;
                fArr[1] = f23;
                fArr[2] = f24;
                fArr[3] = 0.0f;
                fArr[4] = f25;
                fArr[5] = f26;
                fArr[6] = f27;
                fArr[7] = 0.0f;
                fArr[8] = f28;
                fArr[9] = f29;
                fArr[10] = f30;
                fArr[11] = 0.0f;
                float f31 = -fIntBitsToFloat;
                fArr[12] = ((f22 * f31) - (fIntBitsToFloat2 * f25)) + f16 + fIntBitsToFloat;
                fArr[13] = ((f23 * f31) - (fIntBitsToFloat2 * f26)) + f9 + fIntBitsToFloat2;
                fArr[14] = ((f31 * f24) - (fIntBitsToFloat2 * f27)) + f17;
                fArr[15] = 1.0f;
            }
            this.x = false;
            this.z = vs.J(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.q || this.n) {
            return;
        }
        this.j.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zM = t6.m();
        t6 t6Var = this.j;
        if (zM) {
            t6Var.L(-4.0f);
        }
        cs0 cs0Var = this.h;
        if (!ny0.a(cs0Var.t, j)) {
            cs0Var.t = j;
            cs0Var.g(j, cs0Var.u);
        }
        ViewParent parent = t6Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(t6Var, t6Var);
        }
    }

    public final void e(long j) {
        if (vy0.a(j, this.m)) {
            return;
        }
        if (t6.m()) {
            this.j.L(-4.0f);
        }
        this.m = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.q) {
            this.q = z;
            t6 t6Var = this.j;
            fj1 fj1Var = t6Var.H;
            boolean z2 = t6Var.J;
            if (!z) {
                if (z2) {
                    return;
                }
                fj1Var.k(this);
                fj1 fj1Var2 = t6Var.I;
                if (fj1Var2 != null) {
                    fj1Var2.k(this);
                    return;
                }
                return;
            }
            if (!z2) {
                fj1Var.a(this);
                return;
            }
            fj1 fj1Var3 = t6Var.I;
            if (fj1Var3 == null) {
                fj1Var3 = new fj1();
                t6Var.I = fj1Var3;
            }
            fj1Var3.a(this);
        }
    }

    public final void g() {
        t6.m();
        if (this.q) {
            if (!ez2.a(this.v, ez2.b) && !vy0.a(this.h.u, this.m)) {
                this.h.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.v >> 32)) * ((int) (this.m >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.v & 4294967295L)) * ((int) (this.m & 4294967295L)))) & 4294967295L));
            }
            cs0 cs0Var = this.h;
            e90 e90Var = this.r;
            u31 u31Var = this.s;
            long j = this.m;
            if (!vy0.a(cs0Var.u, j)) {
                cs0Var.u = j;
                cs0Var.g(cs0Var.t, j);
                if (cs0Var.i == 9205357640488583168L) {
                    cs0Var.g = true;
                    cs0Var.a();
                }
            }
            cs0Var.b = e90Var;
            cs0Var.c = u31Var;
            cs0Var.d = this.B;
            cs0Var.e();
            f(false);
        }
    }
}
