package defpackage;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import androidx.sqlite.SQLiteStatement;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class ie1 {
    public static final qv J;
    public static final float K;
    public static final qv L;
    public static final qv M;
    public static final StackTraceElement[] N;
    public static final qv O;
    public static final ji2 P;
    public static final float Q;
    public static final float R;
    public static final qv S;
    public static final float T;
    public static final qv U;
    public static final float V;
    public static final qv W;
    public static final float X;
    public static final qv Y;
    public static final float Z;
    public static final qv a0;
    public static final float b0;
    public static final qv c0;
    public static final qv d0;
    public static final ji2 e0;
    public static final float f0;
    public static final qv g0;
    public static final float h0;
    public static final qv i0;
    public static final qv j0;
    public static final float k0;
    public static final float l0;
    public static final float m0;
    public static final nx n;
    public static final ji2 n0;
    public static final nx o;
    public static final float o0;
    public static final qv p0;
    public static final nx q;
    public static final qv q0;
    public static final float r0;
    public static final qv s0;
    public static final qv t0;
    public static final qf0 u0;
    public static final kc2 v0;
    public static final rt w;
    public static final kc2 w0;
    public static final yx x;
    public static final kc2 x0;
    public static final yx y;
    public static final ed a = new ed(Float.POSITIVE_INFINITY);
    public static final fd b = new fd(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final gd c = new gd(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final hd d = new hd(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ed e = new ed(Float.NEGATIVE_INFINITY);
    public static final fd f = new fd(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final gd g = new gd(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final hd h = new hd(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final float[][] i = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] j = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] k = {95.047f, 100.0f, 108.883f};
    public static final float[][] l = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final nx m = new nx(-1131826196, false, new ig(6));
    public static final nx p = new nx(-855807376, false, new ig(17));
    public static final nx r = new nx(986388458, false, new wx(2));
    public static final nx s = new nx(-2092118794, false, new wx(3));
    public static final nx t = new nx(-520480004, false, new wx(4));
    public static final nx u = new nx(141334659, false, new wx(5));
    public static final rt v = new rt((byte) 13);
    public static final ji2 z = ji2.k;
    public static final float A = 56.0f;
    public static final qf0 B = new qf0("COMPLETING_ALREADY", (byte) 1);
    public static final qf0 C = new qf0("COMPLETING_WAITING_CHILDREN", (byte) 1);
    public static final qf0 D = new qf0("COMPLETING_RETRY", (byte) 1);
    public static final qf0 E = new qf0("TOO_LATE_TO_CANCEL", (byte) 1);
    public static final qf0 F = new qf0("SEALED", (byte) 1);
    public static final tf0 G = new tf0(false);
    public static final tf0 H = new tf0(true);
    public static final Object I = new Object();

    static {
        byte b2 = 15;
        n = new nx(-1317170520, false, new ig(b2));
        byte b3 = 16;
        o = new nx(523977937, false, new ig(b3));
        q = new nx(1821165896, false, new tx(b3));
        byte b4 = 14;
        w = new rt(b4);
        x = new yx(b4);
        y = new yx(b2);
        qv qvVar = qv.o;
        J = qvVar;
        K = 0.38f;
        L = qvVar;
        M = qv.q;
        N = new StackTraceElement[0];
        qv qvVar2 = qv.r;
        O = qvVar2;
        ji2 ji2Var = ji2.j;
        P = ji2Var;
        Q = 8.0f;
        R = 24.0f;
        S = qv.v;
        T = 1.0f;
        qv qvVar3 = qv.n;
        U = qvVar3;
        V = 0.38f;
        W = qvVar3;
        X = 0.12f;
        Y = qvVar3;
        Z = 0.38f;
        qv qvVar4 = qv.y;
        a0 = qvVar4;
        b0 = 0.38f;
        c0 = qvVar4;
        d0 = qvVar3;
        e0 = ji2Var;
        f0 = 28.0f;
        g0 = qv.k;
        h0 = 24.0f;
        i0 = qv.l;
        j0 = qvVar2;
        k0 = 40.0f;
        l0 = 32.0f;
        m0 = 2.0f;
        n0 = ji2Var;
        o0 = 52.0f;
        qv qvVar5 = qv.p;
        p0 = qvVar5;
        q0 = qvVar5;
        r0 = 16.0f;
        s0 = qvVar4;
        t0 = qvVar4;
        u0 = new qf0("NO_THREAD_ELEMENTS", (byte) 1);
        v0 = new kc2((byte) 27);
        w0 = new kc2((byte) 28);
        x0 = new kc2((byte) 29);
    }

    public static final Object A(lm0 lm0Var, int i2, vp0 vp0Var) {
        int i3;
        Object objH;
        qg1 qg1VarR;
        l61 l61VarN0;
        ln1 ln1Var;
        if (!lm0Var.h.u) {
            ax0.b("visitAncestors called on an unattached node");
        }
        qg1 qg1Var = lm0Var.h.l;
        l41 l41VarY = cu.Y(lm0Var);
        loop0: while (true) {
            i3 = 0;
            objH = null;
            if (l41VarY == null) {
                qg1VarR = null;
                break;
            }
            if ((l41VarY.L.f.k & 1024) != 0) {
                while (qg1Var != null) {
                    if ((qg1Var.j & 1024) != 0) {
                        qg1VarR = qg1Var;
                        uj1 uj1Var = null;
                        while (qg1VarR != null) {
                            if (qg1VarR instanceof lm0) {
                                break loop0;
                            }
                            if ((qg1VarR.j & 1024) != 0 && (qg1VarR instanceof k80)) {
                                int i4 = 0;
                                for (qg1 qg1Var2 = ((k80) qg1VarR).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                                    if ((qg1Var2.j & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
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
                                if (i4 != 1) {
                                }
                            }
                            qg1VarR = cu.R(uj1Var);
                        }
                    }
                    qg1Var = qg1Var.l;
                }
            }
            l41VarY = l41VarY.u();
            qg1Var = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
        }
        lm0 lm0Var2 = (lm0) qg1VarR;
        if ((lm0Var2 == null || !uz0.g(lm0Var2.N0(), lm0Var.N0())) && (l61VarN0 = lm0Var.N0()) != null) {
            int i5 = 5;
            if (i2 != 5) {
                i5 = 6;
                if (i2 != 6) {
                    i5 = 3;
                    if (i2 != 3) {
                        i5 = 4;
                        if (i2 != 4) {
                            i5 = 2;
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    i5 = 1;
                                } else {
                                    li1.g("Unsupported direction for beyond bounds layout");
                                }
                            }
                        }
                    }
                }
            }
            if (l61VarN0.v.a() <= 0 || !l61VarN0.v.c() || !l61VarN0.u) {
                return vp0Var.h(l61.y);
            }
            boolean zK0 = l61VarN0.K0(i5);
            m61 m61Var = l61VarN0.v;
            int iB = zK0 ? m61Var.b() : m61Var.e();
            x72 x72Var = new x72();
            lo loVar = l61VarN0.w;
            loVar.getClass();
            h61 h61Var = new h61(iB, iB);
            loVar.a.b(h61Var);
            x72Var.h = h61Var;
            int iD = l61VarN0.v.d() << 1;
            int iA = l61VarN0.v.a();
            if (iD > iA) {
                iD = iA;
            }
            while (objH == null && l61VarN0.J0((h61) x72Var.h, i5) && i3 < iD) {
                h61 h61Var2 = (h61) x72Var.h;
                int i6 = h61Var2.a;
                int i7 = h61Var2.b;
                if (l61VarN0.K0(i5)) {
                    i7++;
                } else {
                    i6--;
                }
                lo loVar2 = l61VarN0.w;
                loVar2.getClass();
                h61 h61Var3 = new h61(i6, i7);
                loVar2.a.b(h61Var3);
                l61VarN0.w.a.j((h61) x72Var.h);
                x72Var.h = h61Var3;
                i3++;
                cu.Y(l61VarN0).k();
                objH = vp0Var.h(new k61(l61VarN0, x72Var, i5));
            }
            l61VarN0.w.a.j((h61) x72Var.h);
            cu.Y(l61VarN0).k();
            return objH;
        }
        return null;
    }

    public static final Object B(o20 o20Var) {
        Object objP = o20Var.p(v0, 0);
        objP.getClass();
        return objP;
    }

    public static final Bitmap.Config C(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i2 == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        return i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final Object D(Object obj) {
        uu0 uu0Var = obj instanceof uu0 ? (uu0) obj : null;
        return uu0Var != null ? uu0Var.a : obj;
    }

    public static final Object E(o20 o20Var, Object obj) {
        if (obj == null) {
            obj = B(o20Var);
        }
        if (obj == 0) {
            return u0;
        }
        if (!(obj instanceof Integer)) {
            return ((ex2) obj).d();
        }
        return o20Var.p(x0, new jx2(((Number) obj).intValue(), o20Var));
    }

    public static final rg1 F(rg1 rg1Var, o91 o91Var) {
        return rg1Var.c(new tx0(o91Var));
    }

    public static final Object G(o20 o20Var, zp0 zp0Var, m10 m10Var) {
        Unsafe unsafe;
        long j2;
        o20 o20VarE = m10Var.e();
        o20 o20VarI = !((Boolean) o20Var.p(new yx((byte) 12), Boolean.FALSE)).booleanValue() ? o20VarE.i(o20Var) : ou.v(o20VarE, o20Var, false);
        ys.u(o20VarI);
        if (o20VarI == o20VarE) {
            ld2 ld2Var = new ld2(m10Var, o20VarI);
            return r02.D(ld2Var, ld2Var, zp0Var);
        }
        c5 c5Var = c5.L;
        if (uz0.g(o20VarI.m(c5Var), o20VarE.m(c5Var))) {
            g23 g23Var = new g23(m10Var, o20VarI);
            o20 o20Var2 = g23Var.j;
            Object objE = E(o20Var2, null);
            try {
                return r02.D(g23Var, g23Var, zp0Var);
            } finally {
                v(o20Var2, objE);
            }
        }
        ua0 ua0Var = new ua0(m10Var, o20VarI);
        try {
            tz0.F(ls.F(ls.v(ua0Var, ua0Var, zp0Var)), j23.a);
            do {
                unsafe = hi.a;
                j2 = ua0.l;
                int intVolatile = unsafe.getIntVolatile(ua0Var, j2);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        li1.g("Already suspended");
                        return null;
                    }
                    Object objD = D(ua0Var.N());
                    if (objD instanceof mw) {
                        throw ((mw) objD).a;
                    }
                    return objD;
                }
            } while (!unsafe.compareAndSwapInt(ua0Var, j2, 0, 1));
            return y20.h;
        } catch (Throwable th) {
            ua0Var.g(new d92(th));
            throw th;
        }
    }

    public static float H() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static tb a(float f2) {
        return new tb(Float.valueOf(f2), aa3.Q, Float.valueOf(0.01f), 8);
    }

    public static dd b(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new dd(aa3.Q, Float.valueOf(f2), new ed(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void c(rg1 rg1Var, float f2, long j2, dr0 dr0Var, final int i2, final int i3) {
        final rg1 rg1Var2;
        final float f3;
        final float f4;
        rg1 rg1Var3;
        dr0Var.W(75144485);
        final long jD = j2;
        int i4 = i2 | 54 | (((i3 & 4) == 0 && dr0Var.e(jD)) ? 256 : 128);
        boolean z2 = true;
        if (dr0Var.N(i4 & 1, (i4 & 147) != 146)) {
            dr0Var.S();
            if ((i2 & 1) == 0 || dr0Var.x()) {
                f4 = tb0.a;
                int i5 = i3 & 4;
                rg1Var3 = og1.h;
                if (i5 != 0) {
                    jD = rv.d(ia2.l, dr0Var);
                    i4 &= -897;
                }
            } else {
                dr0Var.Q();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                rg1Var3 = rg1Var;
                f4 = f2;
            }
            dr0Var.q();
            rg1 rg1VarB = yj2.b(rg1Var3.c(yj2.a), f4);
            if ((((i4 & 896) ^ 384) <= 256 || !dr0Var.e(jD)) && (i4 & 384) != 256) {
                z2 = false;
            }
            Object objK = dr0Var.K();
            if (z2 || objK == zy.a) {
                objK = new vp0() { // from class: ub0
                    @Override // defpackage.vp0
                    public final Object h(Object obj) {
                        td0 td0Var = (td0) obj;
                        float f5 = f4;
                        float fA = td0Var.A(f5);
                        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(td0Var.A(f5) / 2.0f)) & 4294967295L;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (td0Var.d() >> 32));
                        float fA2 = td0Var.A(f5) / 2.0f;
                        td0Var.i0(jD, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L), fA);
                        return j23.a;
                    }
                };
                dr0Var.f0(objK);
            }
            ia2.f(rg1VarB, (vp0) objK, dr0Var, 0);
            f3 = f4;
            rg1Var2 = rg1Var3;
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
            f3 = f2;
        }
        final long j3 = jD;
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(f3, j3, i2, i3) { // from class: vb0
                public final /* synthetic */ float i;
                public final /* synthetic */ long j;
                public final /* synthetic */ byte k;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.k = i3;
                }

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(1);
                    ie1.c(this.h, this.i, this.j, (dr0) obj, iA, this.k);
                    return j23.a;
                }
            };
        }
    }

    public static final Bitmap d(t8 t8Var) {
        if (t8Var instanceof t8) {
            return t8Var.a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final rg1 e(rg1 rg1Var, long j2, hi2 hi2Var) {
        return rg1Var.c(new hj(j2, hi2Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(SQLiteStatement sQLiteStatement, Throwable th) {
        boolean zIsTerminated;
        if (sQLiteStatement != 0) {
            if (th != null) {
                try {
                    wi0.s(sQLiteStatement);
                    return;
                } catch (Throwable th2) {
                    vs.l(th, th2);
                    return;
                }
            }
            if (sQLiteStatement instanceof AutoCloseable) {
                sQLiteStatement.close();
                return;
            }
            if (!(sQLiteStatement instanceof ExecutorService)) {
                if (sQLiteStatement instanceof TypedArray) {
                    ((TypedArray) sQLiteStatement).recycle();
                    return;
                } else {
                    wg.f();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) sQLiteStatement;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z2 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        executorService.shutdownNow();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static dd k(dd ddVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) ddVar.i.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((ed) ddVar.j).a;
        }
        return new dd(ddVar.h, Float.valueOf(f2), new ed(f3), ddVar.k, ddVar.l, ddVar.m);
    }

    public static final rg1 l(gm0 gm0Var) {
        return new hm0(gm0Var);
    }

    public static int m(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        if (f5 <= 0.008856452f) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float f6 = f5;
        float[] fArr = k;
        return xv.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean n(rg2 rg2Var) {
        ch2 ch2Var = ah2.s;
        mj1 mj1Var = rg2Var.h;
        Object objG = mj1Var.g(ch2Var);
        if (objG == null) {
            objG = null;
        }
        if (uz0.g(objG, c5.I)) {
            return false;
        }
        return mj1Var.b(qg2.g) || mj1Var.b(qg2.h);
    }

    public static final dn2 o(x20 x20Var, o20 o20Var, a30 a30Var, zp0 zp0Var) {
        o20 o20VarV = ou.v(x20Var.f(), o20Var, true);
        r70 r70Var = ya0.a;
        if (o20VarV != r70Var && o20VarV.m(c5.L) == null) {
            o20VarV = o20VarV.i(r70Var);
        }
        dn2 f81Var = a30Var == a30.i ? new f81(o20VarV, zp0Var) : new dn2(o20VarV, true);
        f81Var.i0(a30Var, f81Var, zp0Var);
        return f81Var;
    }

    public static dn2 p(x20 x20Var, w wVar, zp0 zp0Var, int i2) {
        o20 o20Var = wVar;
        if ((i2 & 1) != 0) {
            o20Var = xf0.h;
        }
        return o(x20Var, o20Var, (i2 & 2) != 0 ? a30.h : a30.k, zp0Var);
    }

    public static final rg1 q(m61 m61Var, lo loVar, ks1 ks1Var) {
        return new i61(m61Var, loVar, ks1Var);
    }

    public static float r(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final rg1 s(rg1 rg1Var, vp0 vp0Var) {
        return rg1Var.c(new n00(vp0Var));
    }

    public static final void v(o20 o20Var, Object obj) {
        if (obj == u0) {
            return;
        }
        if (!(obj instanceof jx2)) {
            Object objP = o20Var.p(w0, null);
            objP.getClass();
            ((ex2) objP).c(obj);
            return;
        }
        jx2 jx2Var = (jx2) obj;
        ex2[] ex2VarArr = jx2Var.c;
        int length = ex2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            ex2 ex2Var = ex2VarArr[length];
            ex2Var.getClass();
            ex2Var.c(jx2Var.b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static int w(double d2) {
        if (Double.isNaN(d2)) {
            wg.m("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int x(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        wg.m("Cannot round NaN value.");
        return 0;
    }

    public static long y(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        wg.m("Cannot round NaN value.");
        return 0L;
    }

    public static final rg1 z(rg1 rg1Var, ke2 ke2Var, ks1 ks1Var, j8 j8Var, boolean z2, tj0 tj0Var, ui1 ui1Var, un2 un2Var) {
        ks1 ks1Var2 = ks1.h;
        og1 og1Var = og1.h;
        return rg1Var.c(ks1Var == ks1Var2 ? ou.o(og1Var, rt0.c) : ou.o(og1Var, rt0.b)).c(new zd2(j8Var, tj0Var, ui1Var, ks1Var, ke2Var, un2Var, z2, false));
    }

    public abstract void f();

    public boolean g(p0 p0Var, l0 l0Var) {
        l0 l0Var2 = l0.b;
        synchronized (p0Var) {
            if (p0Var.i != l0Var) {
                return false;
            }
            p0Var.i = l0Var2;
            return true;
        }
    }

    public boolean h(p0 p0Var, Object obj, Object obj2) {
        synchronized (p0Var) {
            if (p0Var.h != obj) {
                return false;
            }
            p0Var.h = obj2;
            return true;
        }
    }

    public boolean i(p0 p0Var, o0 o0Var, o0 o0Var2) {
        synchronized (p0Var) {
            if (p0Var.j != o0Var) {
                return false;
            }
            p0Var.j = o0Var2;
            return true;
        }
    }

    public void t(o0 o0Var, o0 o0Var2) {
        o0Var.b = o0Var2;
    }

    public void u(o0 o0Var, Thread thread) {
        o0Var.a = thread;
    }
}
