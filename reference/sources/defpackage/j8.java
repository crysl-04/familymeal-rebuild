package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j8 {
    public final e90 a;
    public long b = 9205357640488583168L;
    public final oe0 c;
    public final lu1 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final k80 i;

    public j8(Context context, e90 e90Var, long j, rt1 rt1Var) {
        this.a = e90Var;
        oe0 oe0Var = new oe0(context, cu.c0(j));
        this.c = oe0Var;
        this.d = new lu1(j23.a, c5.f0);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        i8 i8Var = new i8(this, (byte) 0);
        q02 q02Var = oq2.a;
        tq2 tq2Var = new tq2(null, null, i8Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new zr0(tq2Var, this, oe0Var) : new zr0(tq2Var, this, oe0Var, rt1Var);
    }

    public final void a() {
        boolean z;
        oe0 oe0Var = this.c;
        EdgeEffect edgeEffect = oe0Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = oe0Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = oe0Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = oe0Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0134, code lost:
    
        if (r4 == r6) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, defpackage.pe2 r21, defpackage.n10 r22) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8.b(long, pe2, n10):java.lang.Object");
    }

    public final long c() {
        long jL = this.b;
        if ((9223372034707292159L & jL) == 9205357640488583168L) {
            jL = m02.l(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(j23.a);
        }
    }

    public final boolean e() {
        oe0 oe0Var = this.c;
        EdgeEffect edgeEffect = oe0Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? m7.d(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = oe0Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? m7.d(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = oe0Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? m7.d(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = oe0Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? m7.d(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float f = -fIntBitsToFloat2;
        float f2 = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = m7.f(edgeEffectB, f, f2);
        } else {
            edgeEffectB.onPull(f, f2);
        }
        return (i2 >= 31 ? m7.d(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = m7.f(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? m7.d(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float f = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = m7.f(edgeEffectD, f, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(f, fIntBitsToFloat);
        }
        return (i2 >= 31 ? m7.d(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = m7.f(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? m7.d(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean zA = wj2.a(this.g, 0L);
        boolean zA2 = wj2.a(j, this.g);
        this.g = j;
        if (!zA2) {
            long jX = (((long) ie1.x(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) ie1.x(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
            oe0 oe0Var = this.c;
            oe0Var.c = jX;
            EdgeEffect edgeEffect = oe0Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jX >> 32), (int) (jX & 4294967295L));
            }
            EdgeEffect edgeEffect2 = oe0Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jX >> 32), (int) (jX & 4294967295L));
            }
            EdgeEffect edgeEffect3 = oe0Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jX & 4294967295L), (int) (jX >> 32));
            }
            EdgeEffect edgeEffect4 = oe0Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jX & 4294967295L), (int) (jX >> 32));
            }
            EdgeEffect edgeEffect5 = oe0Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jX >> 32), (int) (jX & 4294967295L));
            }
            EdgeEffect edgeEffect6 = oe0Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jX >> 32), (int) (jX & 4294967295L));
            }
            EdgeEffect edgeEffect7 = oe0Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jX & 4294967295L), (int) (jX >> 32));
            }
            EdgeEffect edgeEffect8 = oe0Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jX), (int) (jX >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
