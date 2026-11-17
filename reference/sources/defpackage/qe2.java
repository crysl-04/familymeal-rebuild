package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qe2 {
    public ke2 a;
    public j8 b;
    public tj0 c;
    public ks1 d;
    public boolean e;
    public wk f;
    public final je2 g;
    public final he2 h;
    public boolean i;
    public byte j = 1;
    public wd2 k = fe2.a;
    public final oe2 l = new oe2(this);
    public final z61 m = new z61(this, 17);

    public qe2(ke2 ke2Var, j8 j8Var, tj0 tj0Var, ks1 ks1Var, boolean z, wk wkVar, je2 je2Var, he2 he2Var) {
        this.a = ke2Var;
        this.b = j8Var;
        this.c = tj0Var;
        this.d = ks1Var;
        this.e = z;
        this.f = wkVar;
        this.g = je2Var;
        this.h = he2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, n10 n10Var) {
        me2 me2Var;
        qe2 qe2Var;
        Throwable th;
        w72 w72Var;
        if (n10Var instanceof me2) {
            me2Var = (me2) n10Var;
            int i = me2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                me2Var.n = i - Integer.MIN_VALUE;
            } else {
                me2Var = new me2(this, n10Var);
            }
        } else {
            me2Var = new me2(this, n10Var);
        }
        Object obj = me2Var.l;
        int i2 = me2Var.n;
        if (i2 != 0) {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w72Var = me2Var.k;
            try {
                m02.y(obj);
                qe2Var = this;
                qe2Var.i = false;
                return new a43(w72Var.h);
            } catch (Throwable th2) {
                th = th2;
                qe2Var = this;
                qe2Var.i = false;
                throw th;
            }
        }
        m02.y(obj);
        w72 w72Var2 = new w72();
        w72Var2.h = j;
        this.i = true;
        try {
            ek1 ek1Var = ek1.h;
            qe2Var = this;
            try {
                ne2 ne2Var = new ne2(qe2Var, w72Var2, j, null);
                me2Var.k = w72Var2;
                me2Var.n = 1;
                Object objG = qe2Var.g(ek1Var, ne2Var, me2Var);
                y20 y20Var = y20.h;
                if (objG == y20Var) {
                    return y20Var;
                }
                w72Var = w72Var2;
                qe2Var.i = false;
                return new a43(w72Var.h);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                qe2Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            qe2Var = this;
        }
    }

    public final boolean b() {
        j8 j8Var;
        return this.a.c() || this.a.a() || ((j8Var = this.b) != null && j8Var.e());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    public final Object c(long j, boolean z, mq2 mq2Var) {
        int i;
        long jA;
        j8 j8Var;
        y20 y20Var;
        Object objR;
        j23 j23Var = j23.a;
        if (z) {
            tj0 tj0Var = this.c;
            ce2 ce2Var = fe2.a;
            if (!(tj0Var instanceof e70)) {
                if (this.d == ks1.i) {
                    i = 1;
                } else {
                    i = 2;
                }
                jA = a43.a(j, 0.0f, 0.0f, i);
                pe2 pe2Var = new pe2(this, null);
                j8Var = this.b;
                y20Var = y20.h;
                if (j8Var == null && b()) {
                    Object objB = j8Var.b(jA, pe2Var, mq2Var);
                    if (objB == y20Var) {
                        return objB;
                    }
                } else {
                    pe2 pe2Var2 = new pe2(this, mq2Var);
                    pe2Var2.n = jA;
                    objR = pe2Var2.r(j23Var);
                    if (objR == y20Var) {
                        return objR;
                    }
                }
            }
        } else {
            if (this.d == ks1.i) {
                i = 1;
            } else {
                i = 2;
            }
            jA = a43.a(j, 0.0f, 0.0f, i);
            pe2 pe2Var3 = new pe2(this, null);
            j8Var = this.b;
            y20Var = y20.h;
            if (j8Var == null) {
                pe2 pe2Var4 = new pe2(this, mq2Var);
                pe2Var4.n = jA;
                objR = pe2Var4.r(j23Var);
                if (objR == y20Var) {
                    return objR;
                }
            } else {
                pe2 pe2Var5 = new pe2(this, mq2Var);
                pe2Var5.n = jA;
                objR = pe2Var5.r(j23Var);
                if (objR == y20Var) {
                    return objR;
                }
            }
        }
        return j23Var;
    }

    public final long d(wd2 wd2Var, long j, int i) {
        bn1 bn1Var = (bn1) this.f.j;
        bn1 bn1VarK0 = bn1Var != null ? bn1Var.K0() : null;
        long jO0 = bn1VarK0 != null ? bn1VarK0.O0(i, j) : 0L;
        long jD = up1.d(j, jO0);
        long jF = f(i(wd2Var.a(h(f(this.d == ks1.i ? up1.a(jD, 0.0f, 1) : up1.a(jD, 0.0f, 2))))));
        je2 je2Var = this.g;
        if (je2Var.u) {
            ViewTreeObserver viewTreeObserver = cu.Z(je2Var).getViewTreeObserver();
            try {
                Method declaredMethod = t6.T0;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    t6.T0 = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jD2 = up1.d(jD, jF);
        bn1 bn1Var2 = (bn1) this.f.j;
        bn1 bn1VarK1 = bn1Var2 != null ? bn1Var2.K0() : null;
        return up1.e(up1.e(jO0, jF), bn1VarK1 != null ? bn1VarK1.M0(i, jF, jD2) : 0L);
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? up1.f(-1.0f, j) : j;
    }

    public final Object g(ek1 ek1Var, zp0 zp0Var, n10 n10Var) {
        Object objD = this.a.d(ek1Var, new j(this, zp0Var, null, (byte) 14), n10Var);
        return objD == y20.h ? objD : j23.a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat((int) (this.d == ks1.i ? j >> 32 : j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        return this.d == ks1.i ? ((long) Float.floatToRawIntBits(f)) << 32 : ((long) Float.floatToRawIntBits(f)) & 4294967295L;
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        ks1 ks1Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (ks1Var == ks1.h) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (ks1Var == ks1.i) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
