package defpackage;

import android.graphics.Paint;
import android.text.Layout;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class vs implements oe1 {
    public static final boolean A(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final float B(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = lw2.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : wu0.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float C(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = lw2.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? wu0.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static String D(Class cls) {
        LinkedHashMap linkedHashMap = tm1.b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            rm1 rm1Var = (rm1) cls.getAnnotation(rm1.class);
            strValue = rm1Var != null ? rm1Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                li1.e("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, strValue);
        }
        strValue.getClass();
        return strValue;
    }

    public static final void E(c41 c41Var) {
        cu.Y(c41Var).F();
    }

    public static final boolean F(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static void G(int i, int i2, int i3, int i4, double[] dArr, double[] dArr2) {
        sh.n("POTRS", "n", i >= 0);
        sh.n("POTRS", "nrhs", i2 >= 0);
        sh.n("POTRS", "lda", i3 >= Math.max(1, i));
        sh.n("POTRS", "ldb", i4 >= Math.max(1, i));
        if (i == 0 || i2 == 0) {
            return;
        }
        if (i2 <= 3) {
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = i5 * i4;
                m02.o(false, false, false, i, dArr, i3, dArr2, i6);
                m02.o(false, true, false, i, dArr, i3, dArr2, i6);
            }
            return;
        }
        double d = i;
        int iK = oe1.k(40, d, d);
        if (i2 > iK) {
            u8 u8Var = kt1.a;
            u8Var.a = iK;
            u8Var.b(0, i2, new sq0(i, dArr, i3, dArr2, i4, (byte) 2));
            return;
        }
        u8 u8Var2 = kt1.a;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i7 * i4;
            rz1.s(false, false, false, i, dArr, i3, dArr2, i8);
            rz1.s(false, true, false, i, dArr, i3, dArr2, i8);
        }
    }

    public static void H(boolean z, int i, int i2, double d, double[] dArr, int i3, double[] dArr2, double d2, double[] dArr3) {
        sh.n("GEMV", "m", i >= 0);
        sh.n("GEMV", "n", i2 >= 0);
        sh.n("GEMV", "lda", i3 >= Math.max(1, i));
        if (i == 0 || i2 == 0) {
            return;
        }
        if (d == h32.a && d2 == h32.b) {
            return;
        }
        pq0.b(z, i, i2, d, dArr, 0, i3, dArr2, 0, 1, d2, dArr3, 0, 1);
    }

    public static final boolean I(x20 x20Var) {
        s01 s01Var = (s01) x20Var.f().m(c5.Z);
        if (s01Var != null) {
            return s01Var.b();
        }
        return true;
    }

    public static final boolean J(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final boolean K(w71 w71Var, int i) {
        return i <= w71Var.c() && ((b81) w71Var.c).h() <= i;
    }

    public static final boolean L(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static boolean M(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static d51 N(g81 g81Var, kp0 kp0Var) {
        vz1 vz1Var = vz1.y;
        int iOrdinal = g81Var.ordinal();
        if (iOrdinal == 0) {
            return new yq2(kp0Var);
        }
        if (iOrdinal == 1) {
            mb2 mb2Var = new mb2();
            mb2Var.h = kp0Var;
            mb2Var.i = vz1Var;
            return mb2Var;
        }
        if (iOrdinal != 2) {
            wg.n();
            return null;
        }
        p23 p23Var = new p23();
        p23Var.h = kp0Var;
        p23Var.i = vz1Var;
        return p23Var;
    }

    public static final s30 O(lm0 lm0Var) {
        int iOrdinal = lm0Var.O0().ordinal();
        s30 s30Var = s30.h;
        if (iOrdinal != 0) {
            s30 s30Var2 = s30.i;
            if (iOrdinal == 1) {
                lm0 lm0VarB = ys.B(lm0Var);
                if (lm0VarB == null) {
                    wg.m("ActiveParent with no focused child");
                    return null;
                }
                s30 s30VarO = O(lm0VarB);
                s30 s30Var3 = s30VarO != s30Var ? s30VarO : null;
                if (s30Var3 != null) {
                    return s30Var3;
                }
                if (lm0Var.w) {
                    return s30Var;
                }
                lm0Var.w = true;
                try {
                    fm0 fm0VarL0 = lm0Var.L0();
                    em0 em0Var = (em0) cu.Z(lm0Var).getFocusOwner();
                    lm0 lm0VarF = em0Var.f();
                    fm0VarL0.k.getClass();
                    lm0 lm0VarF2 = em0Var.f();
                    if (lm0VarF != lm0VarF2 && lm0VarF2 != null) {
                        if (gm0.d == gm0.c) {
                            return s30Var2;
                        }
                        s30Var = s30.j;
                    }
                    return s30Var;
                } finally {
                    lm0Var.w = false;
                }
            }
            if (iOrdinal == 2) {
                return s30Var2;
            }
            if (iOrdinal != 3) {
                wg.n();
                return null;
            }
        }
        return s30Var;
    }

    public static final s30 P(lm0 lm0Var) {
        if (!lm0Var.x) {
            lm0Var.x = true;
            try {
                fm0 fm0VarL0 = lm0Var.L0();
                em0 em0Var = (em0) cu.Z(lm0Var).getFocusOwner();
                lm0 lm0VarF = em0Var.f();
                fm0VarL0.j.getClass();
                lm0 lm0VarF2 = em0Var.f();
                if (lm0VarF != lm0VarF2 && lm0VarF2 != null) {
                    return gm0.d == gm0.c ? s30.i : s30.j;
                }
            } finally {
                lm0Var.x = false;
            }
        }
        return s30.h;
    }

    public static final s30 Q(lm0 lm0Var) {
        qg1 qg1VarR;
        ln1 ln1Var;
        int iOrdinal = lm0Var.O0().ordinal();
        s30 s30Var = s30.h;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                lm0 lm0VarB = ys.B(lm0Var);
                if (lm0VarB != null) {
                    return O(lm0VarB);
                }
                wg.m("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    wg.n();
                    return null;
                }
                if (!lm0Var.h.u) {
                    ax0.b("visitAncestors called on an unattached node");
                }
                qg1 qg1Var = lm0Var.h.l;
                l41 l41VarY = cu.Y(lm0Var);
                loop0: while (true) {
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
                                        int i = 0;
                                        for (qg1 qg1Var2 = ((k80) qg1VarR).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                                            if ((qg1Var2.j & 1024) != 0) {
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
                            }
                            qg1Var = qg1Var.l;
                        }
                    }
                    l41VarY = l41VarY.u();
                    qg1Var = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
                }
                lm0 lm0Var2 = (lm0) qg1VarR;
                if (lm0Var2 == null) {
                    return s30Var;
                }
                int iOrdinal2 = lm0Var2.O0().ordinal();
                if (iOrdinal2 == 0) {
                    return P(lm0Var2);
                }
                if (iOrdinal2 == 1) {
                    return Q(lm0Var2);
                }
                if (iOrdinal2 == 2) {
                    return s30.i;
                }
                if (iOrdinal2 != 3) {
                    wg.n();
                    return null;
                }
                s30 s30VarQ = Q(lm0Var2);
                s30 s30Var2 = s30VarQ != s30Var ? s30VarQ : null;
                return s30Var2 == null ? P(lm0Var2) : s30Var2;
            }
        }
        return s30Var;
    }

    public static final Object R(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void S(ik2 ik2Var, rg rgVar, int i) {
        while (true) {
            int i2 = ik2Var.v;
            if (i > i2 && i < ik2Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            ik2Var.L();
            if (ik2Var.x(ik2Var.v)) {
                rgVar.r();
            }
            ik2Var.i();
        }
    }

    public static final boolean T(lm0 lm0Var, boolean z) {
        int iOrdinal = lm0Var.O0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                lm0 lm0VarB = ys.B(lm0Var);
                if (!(lm0VarB != null ? T(lm0VarB, z) : true)) {
                    return false;
                }
                lm0Var.K0(km0.i, km0.j);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                wg.n();
                return false;
            }
        }
        return true;
    }

    public static final long U(long j, long j2) {
        int iD;
        int iF = qw2.f(j);
        int iE = qw2.e(j);
        if ((qw2.f(j2) < qw2.e(j)) && (qw2.f(j) < qw2.e(j2))) {
            if ((qw2.f(j2) <= qw2.f(j)) && (qw2.e(j) <= qw2.e(j2))) {
                iF = qw2.f(j2);
                iE = iF;
            } else {
                if ((qw2.f(j) <= qw2.f(j2)) && (qw2.e(j2) <= qw2.e(j))) {
                    iD = qw2.d(j2);
                } else {
                    int iF2 = qw2.f(j2);
                    if (iF >= qw2.e(j2) || iF2 > iF) {
                        iE = qw2.f(j2);
                    } else {
                        iF = qw2.f(j2);
                        iD = qw2.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > qw2.f(j2)) {
            iF -= qw2.d(j2);
            iD = qw2.d(j2);
            iE -= iD;
        }
        return m02.a(iF, iE);
    }

    public static final void V(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            dx0.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        dx0.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final void a(kv2 kv2Var, nx nxVar, dr0 dr0Var, int i) {
        dr0Var.W(2080741862);
        int i2 = (dr0Var.h(kv2Var) ? 4 : 2) | i;
        byte b = 1;
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            ls.b(kv2Var, nxVar, dr0Var, i2 & 126);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new gw(kv2Var, nxVar, i, b);
        }
    }

    public static final k10 b(o20 o20Var) {
        if (o20Var.m(c5.Z) == null) {
            o20Var = o20Var.i(new u01(null));
        }
        return new k10(o20Var);
    }

    public static final void c(ka0 ka0Var, dr0 dr0Var, int i) {
        ka0 ka0Var2;
        Object obj;
        dr0Var.W(294589392);
        int i2 = (dr0Var.h(ka0Var) ? 4 : 2) | i;
        if (dr0Var.N(i2 & 1, (i2 & 3) != 2)) {
            pb2 pb2VarV = m02.v(dr0Var);
            i62 i62Var = ka0Var.b().e;
            sj1 sj1VarH = pz1.h(i62Var, i62Var.h.getValue(), dr0Var, 0, 0);
            List list = (List) sj1VarH.getValue();
            boolean zBooleanValue = ((Boolean) dr0Var.j(yx0.a)).booleanValue();
            boolean zF = dr0Var.f(list);
            Object objK = dr0Var.K();
            Object obj2 = zy.a;
            if (zF || objK == obj2) {
                obj = objK;
                ll2 ll2Var = new ll2();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    pk1 pk1Var = (pk1) obj3;
                    if (zBooleanValue || pk1Var.r.h.compareTo(x81.k) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                ll2Var.addAll(arrayList);
                dr0Var.f0(ll2Var);
                obj = ll2Var;
            }
            ll2 ll2Var2 = (ll2) obj;
            i(ll2Var2, (List) sj1VarH.getValue(), dr0Var, 0);
            i62 i62Var2 = ka0Var.b().f;
            sj1 sj1VarH2 = pz1.h(i62Var2, i62Var2.h.getValue(), dr0Var, 0, 0);
            Object objK2 = dr0Var.K();
            if (objK2 == obj2) {
                objK2 = new ll2();
                dr0Var.f0(objK2);
            }
            ll2 ll2Var3 = (ll2) objK2;
            dr0Var.V(-367419233);
            ListIterator listIterator = ll2Var2.listIterator();
            while (true) {
                ht0 ht0Var = (ht0) listIterator;
                if (!ht0Var.hasNext()) {
                    break;
                }
                pk1 pk1Var2 = (pk1) ht0Var.next();
                dl1 dl1Var = pk1Var2.i;
                dl1Var.getClass();
                ja0 ja0Var = (ja0) dl1Var;
                boolean zH = dr0Var.h(ka0Var) | dr0Var.h(pk1Var2);
                Object objK3 = dr0Var.K();
                if (zH || objK3 == obj2) {
                    objK3 = new h6((Object) ka0Var, (Object) pk1Var2, (byte) 14);
                    dr0Var.f0(objK3);
                }
                ka0 ka0Var3 = ka0Var;
                uz0.c((kp0) objK3, ja0Var.m, dt.N(1129586364, new cr(pk1Var2, ka0Var3, pb2VarV, ll2Var3, ja0Var), dr0Var), dr0Var, 384);
                ka0Var = ka0Var3;
            }
            ka0Var2 = ka0Var;
            dr0Var.p(false);
            Set set = (Set) sj1VarH2.getValue();
            boolean zF2 = dr0Var.f(sj1VarH2) | dr0Var.h(ka0Var2);
            Object objK4 = dr0Var.K();
            if (zF2 || objK4 == obj2) {
                objK4 = new fa0(sj1VarH2, ka0Var2, ll2Var3, null);
                dr0Var.f0(objK4);
            }
            h7.K(set, ll2Var3, (zp0) objK4, dr0Var);
        } else {
            ka0Var2 = ka0Var;
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s(ka0Var2, i, (byte) 9);
        }
    }

    public static final void d(e91 e91Var, vp0 vp0Var, dr0 dr0Var, int i) {
        dr0Var.W(1220373486);
        int i2 = i | 16 | (dr0Var.h(vp0Var) ? 256 : 128);
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                e91Var = (e91) dr0Var.j(ob1.a);
            } else {
                dr0Var.Q();
            }
            int i3 = i2 & (-113);
            dr0Var.q();
            boolean zF = dr0Var.f(j23.a) | dr0Var.f(e91Var);
            Object objK = dr0Var.K();
            if (zF || objK == zy.a) {
                objK = new i91(e91Var.g());
                dr0Var.f0(objK);
            }
            e(e91Var, (i91) objK, vp0Var, dr0Var, i3 & 896);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new j7((byte) 20, i, e91Var, vp0Var);
        }
    }

    public static final void e(e91 e91Var, i91 i91Var, vp0 vp0Var, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(912823238);
        if ((i & 6) == 0) {
            i2 = (dr0Var.h(e91Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.h(i91Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.h(vp0Var) ? 256 : 128;
        }
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = dr0Var.h(i91Var) | ((i2 & 896) == 256) | dr0Var.h(e91Var);
            Object objK = dr0Var.K();
            if (zH || objK == zy.a) {
                objK = new qb((Object) e91Var, (Object) i91Var, (Object) vp0Var, (byte) 10);
                dr0Var.f0(objK);
            }
            h7.H(e91Var, i91Var, (vp0) objK, dr0Var);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha((Object) e91Var, (Object) i91Var, (hq0) vp0Var, i, (byte) 9);
        }
    }

    public static final void f(Boolean bool, ll1 ll1Var, e91 e91Var, vp0 vp0Var, dr0 dr0Var, int i) {
        dr0Var.W(696924721);
        int i2 = (dr0Var.h(bool) ? 4 : 2) | i | (dr0Var.h(ll1Var) ? 32 : 16) | 128 | (dr0Var.h(vp0Var) ? 2048 : 1024);
        if (dr0Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                e91Var = (e91) dr0Var.j(ob1.a);
            } else {
                dr0Var.Q();
            }
            int i3 = i2 & (-897);
            dr0Var.q();
            boolean zF = dr0Var.f(bool) | dr0Var.f(ll1Var) | dr0Var.f(e91Var);
            Object objK = dr0Var.K();
            if (zF || objK == zy.a) {
                objK = new m91(e91Var.g());
                dr0Var.f0(objK);
            }
            g(e91Var, (m91) objK, vp0Var, dr0Var, (i3 >> 3) & 896);
        } else {
            dr0Var.Q();
        }
        e91 e91Var2 = e91Var;
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new hl(bool, ll1Var, e91Var2, vp0Var, i, (byte) 2);
        }
    }

    public static final void g(e91 e91Var, m91 m91Var, vp0 vp0Var, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(228371534);
        if ((i & 6) == 0) {
            i2 = (dr0Var.h(e91Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.h(m91Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.h(vp0Var) ? 256 : 128;
        }
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = dr0Var.h(m91Var) | ((i2 & 896) == 256) | dr0Var.h(e91Var);
            Object objK = dr0Var.K();
            if (zH || objK == zy.a) {
                objK = new qb((Object) e91Var, (Object) m91Var, (Object) vp0Var, (byte) 11);
                dr0Var.f0(objK);
            }
            h7.H(e91Var, m91Var, (vp0) objK, dr0Var);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha((Object) e91Var, (Object) m91Var, (hq0) vp0Var, i, (byte) 10);
        }
    }

    public static final void h(fg fgVar, String str, kp0 kp0Var, dr0 dr0Var, int i) {
        kp0Var.getClass();
        dr0Var.W(-458273775);
        int i2 = i | (dr0Var.d(fgVar.ordinal()) ? 4 : 2) | (dr0Var.f(str) ? 32 : 16) | (dr0Var.h(kp0Var) ? 256 : 128);
        byte b = 0;
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            cy1.a(null, null, null, null, null, 0, 0L, 0L, null, dt.N(-1543643422, new cc1(fgVar, kp0Var, str, b), dr0Var), dr0Var, 805306368, 511);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s62(fgVar, str, kp0Var, i, (byte) 6);
        }
    }

    public static final void i(final ll2 ll2Var, List list, dr0 dr0Var, int i) {
        dr0Var.W(1537894851);
        int i2 = (dr0Var.h(ll2Var) ? 4 : 2) | i | (dr0Var.h(list) ? 32 : 16);
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            final boolean zBooleanValue = ((Boolean) dr0Var.j(yx0.a)).booleanValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final pk1 pk1Var = (pk1) it.next();
                h91 h91Var = pk1Var.r;
                boolean zG = dr0Var.g(zBooleanValue) | dr0Var.h(ll2Var) | dr0Var.h(pk1Var);
                Object objK = dr0Var.K();
                if (zG || objK == zy.a) {
                    objK = new vp0() { // from class: ea0
                        @Override // defpackage.vp0
                        public final Object h(Object obj) {
                            final pk1 pk1Var2 = pk1Var;
                            final ll2 ll2Var2 = ll2Var;
                            final boolean z = zBooleanValue;
                            c91 c91Var = new c91() { // from class: da0
                                @Override // defpackage.c91
                                public final void e(e91 e91Var, w81 w81Var) {
                                    boolean z2 = z;
                                    ll2 ll2Var3 = ll2Var2;
                                    pk1 pk1Var3 = pk1Var2;
                                    if (z2 && !ll2Var3.contains(pk1Var3)) {
                                        ll2Var3.add(pk1Var3);
                                    }
                                    if (w81Var == w81.ON_START && !ll2Var3.contains(pk1Var3)) {
                                        ll2Var3.add(pk1Var3);
                                    }
                                    if (w81Var == w81.ON_STOP) {
                                        ll2Var3.remove(pk1Var3);
                                    }
                                }
                            };
                            pk1Var2.r.a(c91Var);
                            return new ga0(pk1Var2, c91Var, (byte) 0);
                        }
                    };
                    dr0Var.f0(objK);
                }
                h7.G(h91Var, (vp0) objK, dr0Var);
            }
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new j7((byte) 12, i, ll2Var, list);
        }
    }

    public static void l(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = o01.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = tz1.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ce A[Catch: j01 -> 0x019d, TRY_ENTER, TryCatch #1 {j01 -> 0x019d, blocks: (B:59:0x016a, B:32:0x00be, B:36:0x00ce, B:38:0x00db, B:44:0x00ed, B:46:0x0101, B:50:0x0116, B:27:0x00a1, B:31:0x00ae, B:69:0x018d, B:70:0x019c), top: B:88:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00db A[Catch: j01 -> 0x019d, TryCatch #1 {j01 -> 0x019d, blocks: (B:59:0x016a, B:32:0x00be, B:36:0x00ce, B:38:0x00db, B:44:0x00ed, B:46:0x0101, B:50:0x0116, B:27:0x00a1, B:31:0x00ae, B:69:0x018d, B:70:0x019c), top: B:88:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:49:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:0x0160  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:95:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0160 -> B:59:0x016a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object m(defpackage.w71 r27, int r28, int r29, defpackage.e90 r30, defpackage.n10 r31) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs.m(w71, int, int, e90, n10):java.lang.Object");
    }

    public static final boolean o(boolean z, w71 w71Var, int i) {
        b81 b81Var = (b81) w71Var.c;
        if (z) {
            if (b81Var.h() <= i) {
                return b81Var.h() == i && b81Var.i() > 0;
            }
            return true;
        }
        if (b81Var.h() >= i) {
            return b81Var.h() == i && b81Var.i() < 0;
        }
        return true;
    }

    public static pk0 p(pk0 pk0Var, int i) {
        dp dpVar;
        if (i < 0 && i != -2 && i != -1) {
            li1.e(jp1.h(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            dpVar = dp.i;
        } else {
            dpVar = dp.h;
        }
        boolean z = pk0Var instanceof lq0;
        xf0 xf0Var = xf0.h;
        return z ? ((lq0) pk0Var).b(xf0Var, i, dpVar) : new gs(pk0Var, xf0Var, i, dpVar);
    }

    public static final void q(x20 x20Var, vg1 vg1Var) {
        s01 s01Var = (s01) x20Var.f().m(c5.Z);
        if (s01Var != null) {
            s01Var.a(vg1Var);
        } else {
            wg.h(x20Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static void r(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new qy0(2, 36, 1));
        }
    }

    public static final void s(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                l(th, th2);
            }
        }
    }

    public static ru t(vp0... vp0VarArr) {
        if (vp0VarArr.length > 0) {
            return new ru(vp0VarArr, (byte) 3);
        }
        wg.m("Failed requirement.");
        return null;
    }

    public static int u(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void v(hl1 hl1Var, String str, nx nxVar) {
        tm1 tm1Var = hl1Var.f;
        tm1Var.getClass();
        hl1Var.g.add(new gy((fy) tm1Var.b(D(fy.class)), str, nxVar).a());
    }

    public static final int w(float f, float f2, float f3, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = i - 1;
        return ie1.x((f3 * (i4 <= 1 ? i4 : 1)) + (f2 * i3) + f);
    }

    public static final Object x(zp0 zp0Var, m10 m10Var) {
        ld2 ld2Var = new ld2(m10Var, m10Var.e());
        return r02.D(ld2Var, ld2Var, zp0Var);
    }

    public static z43 y(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (z43) objNewInstance;
            } catch (IllegalAccessException e) {
                li1.k("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                li1.k("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            li1.k("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object z(pz pzVar, g42 g42Var) {
        if (!((qg1) pzVar).h.u) {
            ax0.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        dx1 dx1Var = (dx1) cu.Y(pzVar).H;
        dx1Var.getClass();
        return dt.M(dx1Var, g42Var);
    }
}
