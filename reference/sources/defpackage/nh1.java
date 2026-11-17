package defpackage;

import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nh1 extends ho1 {
    public final g2 f;
    public final fp g;
    public dn2 h;

    public nh1(qe2 qe2Var, g2 g2Var, mx mxVar, e90 e90Var) {
        super(qe2Var, mxVar, e90Var);
        this.f = g2Var;
        this.g = ls.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(nh1 nh1Var, x72 x72Var, u72 u72Var, qe2 qe2Var, x72 x72Var2, long j, n10 n10Var) throws Throwable {
        mh1 mh1Var;
        boolean z;
        if (n10Var instanceof mh1) {
            mh1Var = (mh1) n10Var;
            int i = mh1Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                mh1Var.q = i - Integer.MIN_VALUE;
            } else {
                mh1Var = new mh1(n10Var);
            }
        } else {
            mh1Var = new mh1(n10Var);
        }
        Object objU = mh1Var.p;
        int i2 = mh1Var.q;
        m10 m10Var = null;
        if (i2 == 0) {
            m02.y(objU);
            if (j < 0) {
                return Boolean.FALSE;
            }
            qj qjVar = new qj(nh1Var, m10Var, (byte) 6);
            mh1Var.k = nh1Var;
            mh1Var.l = x72Var;
            mh1Var.m = u72Var;
            mh1Var.n = qe2Var;
            mh1Var.o = x72Var2;
            mh1Var.q = 1;
            objU = cy1.U(j, qjVar, mh1Var);
            y20 y20Var = y20.h;
            if (objU == y20Var) {
                return y20Var;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x72Var2 = mh1Var.o;
            qe2Var = mh1Var.n;
            u72Var = mh1Var.m;
            x72Var = mh1Var.l;
            nh1Var = mh1Var.k;
            m02.y(objU);
        }
        jh1 jh1Var = (jh1) objU;
        if (jh1Var != null) {
            long j2 = jh1Var.b;
            long j3 = jh1Var.a;
            ((jh1) x72Var.h).getClass();
            x72Var.h = new jh1(j3, j2);
            u72Var.h = qe2Var.j(qe2Var.f(j3));
            x72Var2.h = ie1.b(0.0f, 0.0f, 30);
            ix0 ix0Var = nh1Var.e;
            ((c43) ix0Var.i).a(Float.intBitsToFloat((int) (j3 >> 32)), j2);
            ((c43) ix0Var.j).a(Float.intBitsToFloat((int) (j3 & 4294967295L)), j2);
            z = !vs.L(u72Var.h);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static jh1 g(fp fpVar) {
        jh1 jh1Var = null;
        oh2 oh2VarU = rz1.u(new io1(new ih1(fpVar, (byte) 0), null));
        while (oh2VarU.hasNext()) {
            jh1 jh1VarA = (jh1) oh2VarU.next();
            if (jh1Var != null) {
                jh1VarA = jh1Var.a(jh1VarA);
            }
            jh1Var = jh1VarA;
        }
        return jh1Var;
    }

    public final float c(oe2 oe2Var, float f) {
        qe2 qe2Var = this.a;
        long jI = qe2Var.i(qe2Var.e(f));
        qe2 qe2Var2 = oe2Var.a;
        return qe2Var.h(qe2Var.f(qe2Var2.d(qe2Var2.k, jI, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object d(qe2 qe2Var, jh1 jh1Var, float f, float f2, n10 n10Var) {
        kh1 kh1Var;
        j23 j23Var;
        x72 x72Var;
        Object obj;
        u72 u72Var;
        float f3;
        qe2 qe2Var2;
        if (n10Var instanceof kh1) {
            kh1Var = (kh1) n10Var;
            int i = kh1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                kh1Var.p = i - Integer.MIN_VALUE;
            } else {
                kh1Var = new kh1(this, n10Var);
            }
        } else {
            kh1Var = new kh1(this, n10Var);
        }
        kh1 kh1Var2 = kh1Var;
        Object obj2 = kh1Var2.n;
        int i2 = kh1Var2.p;
        ix0 ix0Var = this.e;
        j23 j23Var2 = j23.a;
        Object obj3 = y20.h;
        if (i2 == 0) {
            m02.y(obj2);
            x72 x72Var2 = new x72();
            x72Var2.h = jh1Var;
            j23Var = j23Var2;
            long j = jh1Var.b;
            long j2 = jh1Var.a;
            ((c43) ix0Var.i).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((c43) ix0Var.j).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            jh1 jh1VarG = g(this.g);
            if (jh1VarG != null) {
                long j3 = jh1VarG.b;
                long j4 = jh1VarG.a;
                ((c43) ix0Var.i).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((c43) ix0Var.j).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                x72Var = x72Var2;
                x72Var.h = ((jh1) x72Var.h).a(jh1VarG);
            } else {
                x72Var = x72Var2;
            }
            u72 u72Var2 = new u72();
            float fH = qe2Var.h(qe2Var.f(((jh1) x72Var.h).a));
            u72Var2.h = fH;
            if (!vs.L(fH)) {
                x72 x72Var3 = new x72();
                x72Var3.h = ie1.b(0.0f, 0.0f, 30);
                obj = obj3;
                zp0 lh1Var = new lh1(u72Var2, x72Var3, x72Var, f, this, f2, qe2Var, null);
                kh1Var2.k = qe2Var;
                kh1Var2.l = u72Var2;
                kh1Var2.m = f2;
                kh1Var2.p = 1;
                if (b(lh1Var, kh1Var2) != obj) {
                    u72Var = u72Var2;
                    f3 = f2;
                    qe2Var2 = qe2Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                m02.y(obj2);
                return j23Var2;
            }
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = kh1Var2.m;
        u72Var = kh1Var2.l;
        qe2Var2 = kh1Var2.k;
        m02.y(obj2);
        obj = obj3;
        j23Var = j23Var2;
        long jC = p02.c(((c43) ix0Var.i).c(Float.MAX_VALUE), ((c43) ix0Var.j).c(Float.MAX_VALUE));
        if (jC == 0) {
            float fE = qe2Var2.e(Math.signum(u72Var.h)) * Math.min(Math.abs(u72Var.h) / 100.0f, f3) * 1000.0f;
            if (fE == 0.0f) {
                jC = 0;
            } else {
                jC = qe2Var2.d == ks1.i ? p02.c(fE, 0.0f) : p02.c(0.0f, fE);
            }
        }
        a43 a43Var = new a43(jC);
        kh1Var2.k = null;
        kh1Var2.l = null;
        kh1Var2.p = 2;
        return this.b.f(a43Var, kh1Var2) == obj ? obj : j23Var;
    }

    public final boolean f(q02 q02Var) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.i;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = q02Var.a;
        up1 up1Var = new up1(0L);
        int size = list.size();
        boolean zC = false;
        int i = 0;
        while (true) {
            j = up1Var.a;
            if (i >= size) {
                break;
            }
            up1Var = new up1(up1.e(j, ((z02) list.get(i)).j));
            i++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        qe2 qe2Var = this.a;
        float fJ = qe2Var.j(qe2Var.f(jFloatToRawIntBits));
        if (fJ != 0.0f) {
            ke2 ke2Var = qe2Var.a;
            zC = fJ > 0.0f ? ke2Var.c() : ke2Var.a();
        }
        if (zC) {
            return !(this.g.s(new jh1(jFloatToRawIntBits, ((z02) dv.x0(q02Var.a)).b)) instanceof ns);
        }
        return this.d;
    }
}
