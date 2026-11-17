package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.Spanned;
import android.view.View;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class p02 implements fy1, sh, oe1 {
    public final /* synthetic */ byte h;

    public /* synthetic */ p02(byte b) {
        this.h = b;
    }

    public static final ArrayList A(String str, Bundle bundle) {
        Class cls = z72.a(Bundle.class).a;
        cls.getClass();
        ArrayList arrayListC = Build.VERSION.SDK_INT >= 34 ? b2.c(bundle, str, cls) : bundle.getParcelableArrayList(str);
        if (arrayListC != null) {
            return arrayListC;
        }
        r02.y(str);
        throw null;
    }

    public static final int B(rh2 rh2Var, rh2[] rh2VarArr) {
        rh2VarArr.getClass();
        int iHashCode = (rh2Var.b().hashCode() * 31) + Arrays.hashCode(rh2VarArr);
        int iD = rh2Var.d();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iD > 0)) {
                break;
            }
            int i2 = iD - 1;
            int i3 = i * 31;
            String strB = rh2Var.j(rh2Var.d() - iD).b();
            if (strB != null) {
                iHashCode2 = strB.hashCode();
            }
            i = i3 + iHashCode2;
            iD = i2;
        }
        int iD2 = rh2Var.d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iD2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iD2 - 1;
            int i5 = iHashCode3 * 31;
            p02 p02VarC = rh2Var.j(rh2Var.d() - iD2).c();
            iHashCode3 = i5 + (p02VarC != null ? p02VarC.hashCode() : 0);
            iD2 = i4;
        }
    }

    public static List C(ik2 ik2Var, int i, ik2 ik2Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iT = ik2Var.t(i);
        int i2 = i + iT;
        int iF = ik2Var.f(ik2Var.b, ik2Var.q(i));
        int iF2 = ik2Var.f(ik2Var.b, ik2Var.q(i2));
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (ik2Var.b[(ik2Var.q(i) * 5) + 1] & 201326592) != 0;
        ik2Var2.v(iT);
        ik2Var2.w(i3, ik2Var2.t);
        if (ik2Var.g < i2) {
            ik2Var.A(i2);
        }
        if (ik2Var.k < iF2) {
            ik2Var.B(iF2, i2);
        }
        int[] iArr = ik2Var2.b;
        int i4 = ik2Var2.t;
        int i5 = i4 * 5;
        gi.O(i5, i * 5, i2 * 5, ik2Var.b, iArr);
        Object[] objArr = ik2Var2.c;
        int i6 = ik2Var2.i;
        System.arraycopy(ik2Var.c, iF, objArr, i6, i3);
        int i7 = ik2Var2.v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iT;
        int iF3 = i6 - ik2Var2.f(iArr, i4);
        int i10 = ik2Var2.m;
        int i11 = ik2Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            int i15 = i4;
            iArr2[(i13 * 5) + 4] = ik2.h(ik2Var2.f(iArr, i13) + iF3, i12 < i13 ? 0 : ik2Var2.k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i15;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        ik2Var2.m = i12;
        int iB = hk2.b(ik2Var.d, i, ik2Var.o());
        int iB2 = hk2.b(ik2Var.d, i2, ik2Var.o());
        if (iB < iB2) {
            ArrayList arrayList = ik2Var.d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i16 = iB; i16 < iB2; i16++) {
                xq0 xq0Var = (xq0) arrayList.get(i16);
                xq0Var.a += i8;
                arrayList2.add(xq0Var);
            }
            ik2Var2.d.addAll(hk2.b(ik2Var2.d, ik2Var2.t, ik2Var2.o()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = ag0.h;
        }
        if (!list.isEmpty()) {
            HashMap map = ik2Var.e;
            HashMap map2 = ik2Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i17 = 0; i17 < size; i17++) {
                }
            }
        }
        int i18 = ik2Var2.v;
        ik2Var2.N(i7);
        int iD = ik2Var.D(ik2Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iD >= 0;
            if (z7) {
                ik2Var.O();
                ik2Var.a(iD - ik2Var.t);
                ik2Var.O();
            }
            ik2Var.a(i - ik2Var.t);
            boolean zG = ik2Var.G();
            if (z7) {
                ik2Var.L();
                ik2Var.i();
                ik2Var.L();
                ik2Var.i();
            }
            z4 = zG;
        } else {
            boolean zH = ik2Var.H(i, iT);
            ik2Var.I(iF, i3, i - 1);
            z4 = zH;
        }
        if (z4) {
            ez.a("Unexpectedly removed anchors");
        }
        int i19 = ik2Var2.o;
        int i20 = iArr3[i5 + 1];
        ik2Var2.o = i19 + ((1073741824 & i20) != 0 ? 1 : i20 & 67108863);
        if (z2) {
            ik2Var2.t = i9;
            ik2Var2.i = i6 + i3;
        }
        if (z6) {
            ik2Var2.S(i7);
        }
        return list;
    }

    public static void D(vv2 vv2Var, xt2 xt2Var, jw2 jw2Var, t31 t31Var, dw2 dw2Var, boolean z, xp1 xp1Var) {
        r72 r72VarB;
        if (z) {
            int iS = xp1Var.s(qw2.e(vv2Var.b));
            String str = cu2.a;
            if (iS < jw2Var.a.a.i.length()) {
                r72VarB = jw2Var.b(iS);
            } else {
                r72VarB = iS != 0 ? jw2Var.b(iS - 1) : new r72(0.0f, 0.0f, 1.0f, (int) (cu2.a(xt2Var.b, xt2Var.d, xt2Var.e) & 4294967295L));
            }
            float f = r72VarB.b;
            float f2 = r72VarB.a;
            long jS = t31Var.S((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            r72 r72VarB2 = h12.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jS >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jS & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(r72VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(r72VarB.d - f)) & 4294967295L));
            if (uz0.g((dw2) dw2Var.a.b.get(), dw2Var)) {
                dw2Var.b.g(r72VarB2);
            }
        }
    }

    public static final boolean E(mj1 mj1Var, Object obj, Object obj2) {
        Object objG = mj1Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof nj1)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            mj1Var.l(obj);
            return true;
        }
        nj1 nj1Var = (nj1) objG;
        boolean zL = nj1Var.l(obj2);
        if (zL && nj1Var.g()) {
            mj1Var.l(obj);
        }
        return zL;
    }

    public static void F(jy1 jy1Var) {
        nn2 nn2Var;
        mx1 mx1Var;
        mx1 mx1Var2;
        do {
            nn2Var = l72.z;
            mx1Var = (mx1) nn2Var.getValue();
            ex1 ex1VarA = mx1Var.j;
            la1 la1Var = (la1) ex1VarA.get(jy1Var);
            if (la1Var == null) {
                mx1Var2 = mx1Var;
            } else {
                Object obj = la1Var.a;
                Object obj2 = la1Var.b;
                e03 e03Var = ex1VarA.h;
                e03 e03VarV = e03Var.v(jy1Var != null ? jy1Var.hashCode() : 0, jy1Var, 0);
                if (e03Var != e03VarV) {
                    ex1VarA = e03VarV == null ? ex1.j : new ex1(e03VarV, ex1VarA.i - 1);
                }
                c5 c5Var = c5.U;
                if (obj != c5Var) {
                    Object obj3 = ex1VarA.get(obj);
                    obj3.getClass();
                    ex1VarA = ex1VarA.a(obj, new la1(((la1) obj3).a, obj2));
                }
                if (obj2 != c5Var) {
                    Object obj4 = ex1VarA.get(obj2);
                    obj4.getClass();
                    ex1VarA = ex1VarA.a(obj2, new la1(obj, ((la1) obj4).b));
                }
                Object obj5 = obj != c5Var ? mx1Var.h : obj2;
                if (obj2 != c5Var) {
                    obj = mx1Var.i;
                }
                mx1Var2 = new mx1(obj5, obj, ex1VarA);
            }
            if (mx1Var == mx1Var2) {
                return;
            }
        } while (!nn2Var.i(mx1Var, mx1Var2));
    }

    public static final void G(mj1 mj1Var, Object obj) {
        boolean zG;
        long[] jArr = mj1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = mj1Var.b[i4];
                        Object obj3 = mj1Var.c[i4];
                        if (obj3 instanceof nj1) {
                            nj1 nj1Var = (nj1) obj3;
                            nj1Var.l(obj);
                            zG = nj1Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            mj1Var.m(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0113  */
    /* JADX WARN: Code duplicated, block: B:89:0x0118  */
    public static final xw2 H(xw2 xw2Var, u31 u31Var) {
        long j;
        zv2 zv2Var;
        int i;
        int i2;
        ow2 ow2Var;
        yl2 yl2Var = xw2Var.a;
        xv2 xv2Var = zl2.d;
        xv2 xv2Var2 = yl2Var.a;
        if (xv2Var2.equals(wv2.a)) {
            xv2Var2 = zl2.d;
        }
        xv2 xv2Var3 = xv2Var2;
        long j2 = yl2Var.b;
        bx2[] bx2VarArr = ax2.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = zl2.a;
        }
        long j3 = j2;
        qn0 qn0Var = yl2Var.c;
        if (qn0Var == null) {
            qn0Var = qn0.j;
        }
        qn0 qn0Var2 = qn0Var;
        on0 on0Var = yl2Var.d;
        on0 on0Var2 = new on0(on0Var != null ? on0Var.a : 0);
        pn0 pn0Var = yl2Var.e;
        pn0 pn0Var2 = new pn0(pn0Var != null ? pn0Var.a : 65535);
        ar2 ar2Var = yl2Var.f;
        if (ar2Var == null) {
            ar2Var = ar2.a;
        }
        ar2 ar2Var2 = ar2Var;
        String str = yl2Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = yl2Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = zl2.b;
        }
        long j5 = j4;
        uk ukVar = yl2Var.i;
        float f = ukVar != null ? ukVar.a : 0.0f;
        uk ukVar2 = new uk(Float.isNaN(f) ? 0.0f : f);
        yv2 yv2Var = yl2Var.j;
        if (yv2Var == null) {
            yv2Var = yv2.c;
        }
        yv2 yv2Var2 = yv2Var;
        ub1 ub1VarI = yl2Var.k;
        if (ub1VarI == null) {
            ub1 ub1Var = ub1.j;
            ub1VarI = uz1.a.i();
        }
        ub1 ub1Var2 = ub1VarI;
        long j6 = yl2Var.l;
        if (j6 == 16) {
            j6 = zl2.c;
        }
        long j7 = j6;
        vt2 vt2Var = yl2Var.m;
        if (vt2Var == null) {
            vt2Var = vt2.b;
        }
        vt2 vt2Var2 = vt2Var;
        ei2 ei2Var = yl2Var.n;
        if (ei2Var == null) {
            ei2Var = ei2.d;
        }
        ei2 ei2Var2 = ei2Var;
        f02 f02Var = yl2Var.o;
        ud0 ud0Var = yl2Var.p;
        if (ud0Var == null) {
            ud0Var = xi0.a;
        }
        yl2 yl2Var2 = new yl2(xv2Var3, j3, qn0Var2, on0Var2, pn0Var2, ar2Var2, str2, j5, ukVar2, yv2Var2, ub1Var2, j7, vt2Var2, ei2Var2, f02Var, ud0Var);
        cu1 cu1Var = xw2Var.b;
        int i3 = du1.b;
        int i4 = cu1Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = cu1Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = u31Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        wg.n();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = cu1Var.c;
            if ((j & 1095216660480L) == 0) {
                j = du1.a;
            }
            zv2Var = cu1Var.d;
            if (zv2Var == null) {
                zv2Var = zv2.c;
            }
            xz1 xz1Var = cu1Var.e;
            w91 w91Var = cu1Var.f;
            i = cu1Var.g;
            if (i == 0) {
                i = r91.b;
            }
            i2 = cu1Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            ow2Var = cu1Var.i;
            if (ow2Var == null) {
                ow2Var = ow2.c;
            }
            return new xw2(yl2Var2, new cu1(i4, i6, j, zv2Var, xz1Var, w91Var, i, i2, ow2Var), xw2Var.c);
        }
        int iOrdinal2 = u31Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            wg.n();
            return null;
        }
        i6 = i5;
        j = cu1Var.c;
        if ((j & 1095216660480L) == 0) {
            j = du1.a;
        }
        zv2Var = cu1Var.d;
        if (zv2Var == null) {
            zv2Var = zv2.c;
        }
        xz1 xz1Var2 = cu1Var.e;
        w91 w91Var2 = cu1Var.f;
        i = cu1Var.g;
        if (i == 0) {
            i = r91.b;
        }
        i2 = cu1Var.h;
        if (i2 == 0) {
            i2 = 1;
        }
        ow2Var = cu1Var.i;
        if (ow2Var == null) {
            ow2Var = ow2.c;
        }
        return new xw2(yl2Var2, new cu1(i4, i6, j, zv2Var, xz1Var2, w91Var2, i, i2, ow2Var), xw2Var.c);
    }

    public static void I(int i, double d, double[] dArr, int i2, int i3) {
        int iAbs = Math.abs(i3);
        if (iAbs == 1) {
            J(dArr, i2, i + i2, d);
            return;
        }
        int i4 = 0;
        if (d == h32.a) {
            while (i4 < i) {
                dArr[i2] = h32.a;
                i4++;
                i2 += iAbs;
            }
            return;
        }
        if (d != h32.b) {
            while (i4 < i) {
                dArr[i2] = dArr[i2] * d;
                i4++;
                i2 += iAbs;
            }
        }
    }

    public static void J(double[] dArr, int i, int i2, double d) {
        double d2 = h32.a;
        if (d == d2) {
            Arrays.fill(dArr, i, i2, d2);
        } else if (d != h32.b) {
            while (i < i2) {
                dArr[i] = dArr[i] * d;
                i++;
            }
        }
    }

    public static int K(int i, int i2, double[] dArr) {
        int i3 = 0;
        while (i3 < i) {
            double d = dArr[(i3 * i2) + i3];
            i3++;
            if (d == h32.a) {
                return i3;
            }
        }
        return 0;
    }

    public static final xx0 L(ox0 ox0Var) {
        return new xx0(ox0Var.a, ox0Var.b, ox0Var.c, ox0Var.d);
    }

    public static final String M(rh2 rh2Var) {
        return dv.E0(cy1.S(0, rh2Var.d()), ", ", rh2Var.b() + '(', ")", new z61(rh2Var, (byte) 10), 24);
    }

    public static final m13 N(String str) {
        int i;
        vs.r(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, i3) > 0) {
                if (i3 != 119304647) {
                    return null;
                }
                i3 = 429496729;
                if (Integer.compareUnsigned(i2, 429496729) > 0) {
                    return null;
                }
            }
            int i4 = i2 * 10;
            int i5 = iDigit + i4;
            if (Integer.compareUnsigned(i5, i4) < 0) {
                return null;
            }
            i++;
            i2 = i5;
        }
        return new m13(i2);
    }

    public static final r13 O(String str) {
        str.getClass();
        vs.r(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long j2 = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, j2) > 0) {
                if (j2 != 512409557603043100L) {
                    return null;
                }
                j2 = 1844674407370955161L;
                if (Long.compareUnsigned(j, 1844674407370955161L) > 0) {
                    return null;
                }
            }
            long j3 = j * 10;
            long j4 = (((long) iDigit) & 4294967295L) + j3;
            if (Long.compareUnsigned(j4, j3) < 0) {
                return null;
            }
            i++;
            j = j4;
        }
        return new r13(j);
    }

    public static final r72 P(t31 t31Var) {
        r72 r72VarS = es.s(t31Var, true);
        long jI = t31Var.i(r72VarS.d());
        float f = r72VarS.c;
        float f2 = r72VarS.d;
        long jI2 = t31Var.i((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new r72(Float.intBitsToFloat((int) (jI >> 32)), Float.intBitsToFloat((int) (jI & 4294967295L)), Float.intBitsToFloat((int) (jI2 >> 32)), Float.intBitsToFloat((int) (jI2 & 4294967295L)));
    }

    public static final long c(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final void e(mj1 mj1Var, Object obj, Object obj2) {
        int iF = mj1Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : mj1Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof nj1) {
                ((nj1) obj3).a(obj2);
            } else if (obj3 != obj2) {
                nj1 nj1Var = new nj1();
                nj1Var.a(obj3);
                nj1Var.a(obj2);
                obj2 = nj1Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            mj1Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        mj1Var.b[i] = obj;
        mj1Var.c[i] = obj2;
    }

    public static float f(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static final void s(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static mj1 v() {
        long[] jArr = bd2.a;
        return new mj1();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [eg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final int w(int i, String str) {
        ?? r5;
        ?? r6;
        int spanEnd;
        if0 if0VarZ = z();
        Integer num = null;
        if (if0VarZ != null) {
            if (!(if0VarZ.c() == 1)) {
                li1.g("Not initialized yet");
                return 0;
            }
            m02.c(str, "charSequence cannot be null");
            ?? r4 = if0VarZ.e.b;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r6 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                y03[] y03VarArr = (y03[]) spanned.getSpans(i, i + 1, y03.class);
                if (y03VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(y03VarArr[0]);
                    r6 = str;
                } else {
                    ?? r7 = str;
                    spanEnd = ((pf0) r4.x(r7, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new pf0(i))).j;
                    r6 = r7;
                }
            } else {
                ?? r8 = str;
                spanEnd = ((pf0) r4.x(r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new pf0(i))).j;
                r6 = r8;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r6;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            r5 = r6;
            return num.intValue();
        }
        r5 = r6;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    public static final int x(int i, String str) {
        if0 if0VarZ = z();
        Integer num = null;
        if (if0VarZ != null) {
            Integer numValueOf = Integer.valueOf(if0VarZ.b(Math.max(0, i - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final dc2 y(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            dc2 dc2Var = tag instanceof dc2 ? (dc2) tag : null;
            if (dc2Var != null) {
                return dc2Var;
            }
            Object objP = rz1.p(view);
            view = objP instanceof View ? (View) objP : null;
        }
        return null;
    }

    public static final if0 z() {
        if (!if0.d()) {
            return null;
        }
        if0 if0VarA = if0.a();
        if (if0VarA.c() == 1) {
            return if0VarA;
        }
        return null;
    }

    @Override // defpackage.fy1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public y22 r() {
        return xh.k;
    }

    @Override // defpackage.fy1
    public final uc2 h() {
        return i32.i;
    }

    public final int hashCode() {
        switch (this.h) {
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // defpackage.fy1
    public final ls i() {
        return km.o;
    }

    @Override // defpackage.fy1
    public final s60 t() {
        return x22.L0;
    }

    public final String toString() {
        switch (this.h) {
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                String strC = z72.a(getClass()).c();
                strC.getClass();
                return strC;
            default:
                return super.toString();
        }
    }
}
