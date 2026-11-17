package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.system.Os;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.Window;
import androidx.sqlite.SQLiteStatement;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h12 {
    public static iu0 a;

    public static void A(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            a2.e(window, z);
        } else {
            if (i >= 30) {
                a2.d(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final void B(Spannable spannable, long j, e90 e90Var, int i, int i2) {
        long jB = ax2.b(j);
        if (bx2.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(ie1.x(e90Var.f0(j)), false), i, i2, 33);
        } else if (bx2.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(ax2.c(j)), i, i2, 33);
        }
    }

    public static final void C(Spannable spannable, ub1 ub1Var, int i, int i2) {
        if (ub1Var != null) {
            ArrayList arrayList = new ArrayList(ev.o0(ub1Var, 10));
            Iterator it = ub1Var.h.iterator();
            while (it.hasNext()) {
                arrayList.add(((tb1) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final z43 D(du duVar, h53 h53Var, String str, uw0 uw0Var, e30 e30Var, dr0 dr0Var) {
        e30Var.getClass();
        g53 g53VarF = h53Var.f();
        g53VarF.getClass();
        wk wkVar = new wk(g53VarF, uw0Var, e30Var);
        if (str != null) {
            return wkVar.y(duVar, str);
        }
        String strB = duVar.b();
        if (strB != null) {
            return wkVar.y(duVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        wg.m("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final void a(long j, xw2 xw2Var, zp0 zp0Var, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(-684938728);
        if ((i & 6) == 0) {
            i2 = (dr0Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.f(xw2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.h(zp0Var) ? 256 : 128;
        }
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            ie0 ie0Var = gw2.a;
            ys.b(new i42[]{s00.a.a(new kv(j)), ie0Var.a(((xw2) dr0Var.j(ie0Var)).d(xw2Var))}, zp0Var, dr0Var, 8 | ((i2 >> 3) & 112));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new u40(j, xw2Var, zp0Var, i);
        }
    }

    public static final r72 b(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new r72(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final na2 c(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        return new na2(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0060 A[LOOP:0: B:4:0x000b->B:34:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0063 A[EDGE_INSN: B:42:0x0063->B:35:0x0063 BREAK  A[LOOP:0: B:4:0x000b->B:34:0x0060], SYNTHETIC] */
    public static final wg2 d(l41 l41Var, boolean z) {
        qg1 qg1Var = l41Var.L.f;
        j80 j80Var = null;
        if ((qg1Var.k & 8) != 0) {
            loop0: while (qg1Var != null) {
                if ((qg1Var.j & 8) == 0) {
                    if ((qg1Var.k & 8) != 0) {
                        break;
                        break;
                    }
                    qg1Var = qg1Var.m;
                } else {
                    qg1 qg1VarR = qg1Var;
                    uj1 uj1Var = null;
                    while (qg1VarR != null) {
                        if (qg1VarR instanceof ug2) {
                            j80Var = qg1VarR;
                            break loop0;
                        }
                        if ((qg1VarR.j & 8) != 0 && (qg1VarR instanceof k80)) {
                            int i = 0;
                            for (qg1 qg1Var2 = ((k80) qg1VarR).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                                if ((qg1Var2.j & 8) != 0) {
                                    i++;
                                    if (i == 1) {
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
                            if (i != 1) {
                            }
                        }
                        qg1VarR = cu.R(uj1Var);
                    }
                    if ((qg1Var.k & 8) != 0) {
                        break;
                    }
                    qg1Var = qg1Var.m;
                }
            }
        }
        j80Var.getClass();
        qg1 qg1Var3 = ((qg1) ((ug2) j80Var)).h;
        rg2 rg2VarW = l41Var.w();
        if (rg2VarW == null) {
            rg2VarW = new rg2();
        }
        return new wg2(qg1Var3, z, l41Var, rg2VarW);
    }

    public static final String f(c11 c11Var, rh2 rh2Var) {
        rh2Var.getClass();
        c11Var.getClass();
        for (Annotation annotation : rh2Var.getAnnotations()) {
            if (annotation instanceof i11) {
                return ((i11) annotation).discriminator();
            }
        }
        return c11Var.a.e;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[RETURN] */
    public static final int g(SQLiteStatement sQLiteStatement, String str) {
        sQLiteStatement.getClass();
        int columnCount = sQLiteStatement.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(sQLiteStatement.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = sQLiteStatement.getColumnCount();
        while (i < columnCount2) {
            if (str2.equals(sQLiteStatement.getColumnName(i))) {
                if (i >= 0) {
                    return i;
                }
                return -1;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    public static final boolean h(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt != ')' || (i2 = i2 - 1) != 0 || i3 == str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return uz0.g(co2.g0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static final String i(Collection collection) {
        return !collection.isEmpty() ? do2.G(dv.E0(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final r72 j(my1 my1Var, int i, hz2 hz2Var, jw2 jw2Var, boolean z, int i2) {
        float f;
        r72 r72VarC = jw2Var != null ? jw2Var.c(hz2Var.b.s(i)) : r72.e;
        int iR = my1Var.R(2.0f);
        float f2 = r72VarC.a;
        if (z) {
            f = i2 - f2;
            f2 = f - iR;
        } else {
            f = f2 + iR;
        }
        return new r72(f2, r72VarC.b, f, r72VarC.d);
    }

    public static final iu0 k() {
        iu0 iu0Var = a;
        if (iu0Var != null) {
            return iu0Var;
        }
        hu0 hu0Var = new hu0("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = k33.a;
        rl2 rl2Var = new rl2(kv.b);
        xl1 xl1Var = new xl1((byte) 3);
        xl1Var.A(15.5f, 14.0f);
        xl1Var.x(-0.79f);
        xl1Var.z(-0.28f, -0.27f);
        xl1Var.r(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        xl1Var.r(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        xl1Var.C(3.0f, 5.91f, 3.0f, 9.5f);
        xl1Var.C(5.91f, 16.0f, 9.5f, 16.0f);
        xl1Var.s(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        xl1Var.z(0.27f, 0.28f);
        xl1Var.I(0.79f);
        xl1Var.z(5.0f, 4.99f);
        xl1Var.y(20.49f, 19.0f);
        xl1Var.z(-4.99f, -5.0f);
        xl1Var.m();
        xl1Var.A(9.5f, 14.0f);
        xl1Var.r(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        xl1Var.C(7.01f, 5.0f, 9.5f, 5.0f);
        xl1Var.C(14.0f, 7.01f, 14.0f, 9.5f);
        xl1Var.C(11.99f, 14.0f, 9.5f, 14.0f);
        xl1Var.m();
        hu0.a(hu0Var, (ArrayList) xl1Var.i, rl2Var);
        iu0 iu0VarB = hu0Var.b();
        a = iu0VarB;
        return iu0VarB;
    }

    public static final String l(int i, dr0 dr0Var) {
        dr0Var.j(i7.a);
        return ((Context) dr0Var.j(i7.b)).getResources().getString(i);
    }

    public static final int m(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] n(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        gi.S(objArr, objArr2, 0, i, 6);
        gi.Q(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final boolean o(na2 na2Var) {
        long j = na2Var.e;
        return (j >>> 32) == (4294967295L & j) && j == na2Var.f && j == na2Var.g && j == na2Var.h;
    }

    public static final String p(Collection collection) {
        return do2.G(dv.E0(collection, ",", null, null, null, 62)).concat(do2.G(" }"));
    }

    public static final String q(Collection collection) {
        return do2.G(dv.E0(collection, ",", null, null, null, 62)).concat(do2.G("},"));
    }

    public static final ei2 r(ei2 ei2Var, ei2 ei2Var2, float f) {
        long jK = cu.K(f, ei2Var.a, ei2Var2.a);
        long j = ei2Var.b;
        long j2 = ei2Var2.b;
        float fR = ls.R(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fR2 = ls.R(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return new ei2(ls.R(ei2Var.c, ei2Var2.c, f), jK, (((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR2)) & 4294967295L));
    }

    public static final void s(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final void t(dr0 dr0Var) {
        dr0Var.b(new v23(), j23.a);
    }

    public static final void u(bx1 bx1Var, Throwable th) throws Throwable {
        r32 r32Var = bx1Var.b;
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        kx2 kx2VarB = r32Var.l;
        kx2 kx2Var = r32Var.m;
        if (kx2VarB == null || kx2VarB.k != id) {
            if (kx2Var == null || kx2Var.k != id) {
                kx2VarB = r32Var.b(id, Os.gettid(), threadCurrentThread.getName());
                r32Var.m = r32Var.l;
                r32Var.l = kx2VarB;
            } else {
                kx2VarB = kx2Var;
            }
        }
        ig0 ig0Var = kx2VarB.h;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            stackTraceElement.getClassName();
            stackTraceElement.getMethodName();
            stackTraceElement.getFileName();
            stackTraceElement.getLineNumber();
        }
        throw th;
    }

    public static final Object[] v(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        gi.S(objArr, objArr2, 0, i, 6);
        gi.Q(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] w(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        gi.S(objArr, objArr2, 0, i, 6);
        gi.Q(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final float x(long j, float f, e90 e90Var) {
        float fC;
        long jB = ax2.b(j);
        if (bx2.a(jB, 4294967296L)) {
            if (e90Var.n() <= 1.05d) {
                return e90Var.f0(j);
            }
            fC = ax2.c(j) / ax2.c(e90Var.m0(f));
        } else {
            if (!bx2.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = ax2.c(j);
        }
        return fC * f;
    }

    public static final void y(zp0 zp0Var, dr0 dr0Var, Object obj) {
        if (dr0Var.S || !uz0.g(dr0Var.K(), obj)) {
            dr0Var.f0(obj);
            dr0Var.b(zp0Var, obj);
        }
    }

    public static final void z(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(cu.c0(j)), i, i2, 33);
        }
    }

    public void e() {
    }
}
