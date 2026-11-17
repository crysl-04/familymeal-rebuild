package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Bundle;
import com.familymeal.app.MealPlannerApp;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class cu {
    public static final float a = 32.0f;

    public static long A(long j, a51 a51Var) {
        int iJ;
        int iH;
        int iK;
        int i;
        if (a51Var == a51.h) {
            iJ = k00.k(j);
            iH = k00.i(j);
            iK = k00.j(j);
            i = k00.h(j);
        } else {
            iJ = k00.j(j);
            iH = k00.h(j);
            iK = k00.k(j);
            i = k00.i(j);
        }
        return l00.a(iJ, iH, iK, i);
    }

    public static sj1 B() {
        return new lu1(j23.a, c5.f0);
    }

    public static final long C(long j, he0 he0Var) {
        long j2;
        int iOrdinal = he0Var.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                wg.h(he0Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    public static long D(int i, long j) {
        return l00.a(0, k00.i(j), (i & 4) != 0 ? k00.j(j) : 0, k00.h(j));
    }

    public static final Integer E(dk2 dk2Var, jz jzVar, int i, int i2) {
        Integer numE;
        int[] iArr = dk2Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (dk2Var.j(i) && dk2Var.i(i) == 206 && uz0.g(dk2Var.p(iArr, i), ez.e)) {
                Object objH = dk2Var.h(i, 0);
                hr0 hr0Var = objH instanceof hr0 ? (hr0) objH : null;
                h82 h82Var = hr0Var != null ? hr0Var.a : null;
                ar0 ar0Var = h82Var instanceof ar0 ? (ar0) h82Var : null;
                if (ar0Var != null && ar0Var.h == jzVar) {
                    return Integer.valueOf(i);
                }
            }
            if (dk2Var.d(i) && (numE = E(dk2Var, jzVar, i + 1, i3)) != null) {
                return Integer.valueOf(numE.intValue());
            }
            i = i3;
        }
    }

    public static m20 F(m20 m20Var, n20 n20Var) {
        n20Var.getClass();
        if (uz0.g(m20Var.getKey(), n20Var)) {
            return m20Var;
        }
        return null;
    }

    public static final o20 G(ga2 ga2Var, boolean z, m10 m10Var) {
        az2 az2Var = (az2) m10Var.e().m(az2.i);
        o20 o20Var = az2Var != null ? az2Var.h : null;
        if (!ga2Var.i()) {
            k10 k10Var = ga2Var.a;
            if (k10Var == null) {
                uz0.A("coroutineScope");
                throw null;
            }
            o20 o20Var2 = k10Var.h;
            if (o20Var == null) {
                o20Var = xf0.h;
            }
            return o20Var2.i(o20Var);
        }
        if (o20Var != null) {
            k10 k10Var2 = ga2Var.a;
            if (k10Var2 != null) {
                return k10Var2.h.i(o20Var);
            }
            uz0.A("coroutineScope");
            throw null;
        }
        if (z) {
            o20 o20Var3 = ga2Var.b;
            if (o20Var3 != null) {
                return o20Var3;
            }
            uz0.A("transactionContext");
            throw null;
        }
        k10 k10Var3 = ga2Var.a;
        if (k10Var3 != null) {
            return k10Var3.h;
        }
        uz0.A("coroutineScope");
        throw null;
    }

    public static Intent H(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strI = I(context, componentName);
        if (strI == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strI);
        return I(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String I(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final ArrayList J(j62 j62Var) {
        j62Var.getClass();
        List list = j62Var.g;
        ArrayList arrayList = new ArrayList(ev.o0(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                lt.h0();
                throw null;
            }
            z62 z62Var = (z62) obj;
            arrayList.add(new d72(z62Var.b, i, j62Var.a, z62Var.a));
            i = i2;
        }
        return arrayList;
    }

    public static final long K(float f, long j, long j2) {
        bq1 bq1Var = uv.x;
        long jA = kv.a(j, bq1Var);
        long jA2 = kv.a(j2, bq1Var);
        float fC = kv.c(jA);
        float fG = kv.g(jA);
        float f2 = kv.f(jA);
        float fD = kv.d(jA);
        float fC2 = kv.c(jA2);
        float fG2 = kv.g(jA2);
        float f3 = kv.f(jA2);
        float fD2 = kv.d(jA2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return kv.a(p(ls.R(fG, fG2, f), ls.R(f2, f3, f), ls.R(fD, fD2, f), ls.R(fC, fC2, f), bq1Var), kv.e(j2));
    }

    public static float L(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    public static o20 M(m20 m20Var, n20 n20Var) {
        n20Var.getClass();
        return uz0.g(m20Var.getKey(), n20Var) ? xf0.h : m20Var;
    }

    public static final ArrayList N(Map map, vp0 vp0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            ((Map.Entry) it.next()).getValue().getClass();
            li1.c();
            return null;
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) vp0Var.h((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object O(ga2 ga2Var, vu1 vu1Var, n10 n10Var) {
        v30 v30Var;
        if (n10Var instanceof v30) {
            v30Var = (v30) n10Var;
            int i = v30Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                v30Var.n = i - Integer.MIN_VALUE;
            } else {
                v30Var = new v30(n10Var);
            }
        } else {
            v30Var = new v30(n10Var);
        }
        Object objG = v30Var.m;
        int i2 = v30Var.n;
        byte b = 2;
        byte b2 = 1;
        m10 m10Var = null;
        Object obj = y20.h;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    vu1Var = v30Var.l;
                    ga2Var = v30Var.k;
                    m02.y(objG);
                } else if (i2 != 4) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            m02.y(objG);
            return objG;
        }
        m02.y(objG);
        if (ga2Var.i()) {
            ya yaVar = new ya(ga2Var, vu1Var, m10Var, b);
            v30Var.n = 1;
            Object objD = ia2.D(ga2Var, yaVar, v30Var);
            if (objD != obj) {
                return objD;
            }
        } else if (ga2Var.i() && ga2Var.k() && ga2Var.j()) {
            x30 x30Var = new x30(ga2Var, m10Var, vu1Var, b2);
            v30Var.n = 2;
            Object objL = ga2Var.l(false, x30Var, v30Var);
            if (objL != obj) {
                return objL;
            }
        } else {
            v30Var.k = ga2Var;
            v30Var.l = vu1Var;
            v30Var.n = 3;
            objG = G(ga2Var, true, v30Var);
            if (objG != obj) {
            }
        }
        h hVar = new h((m10) null, ga2Var, vu1Var);
        v30Var.k = null;
        v30Var.l = null;
        v30Var.n = 4;
        Object objG2 = ie1.G((o20) objG, hVar, v30Var);
        return objG2 == obj ? obj : objG2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object P(m10 m10Var, vp0 vp0Var, ga2 ga2Var, boolean z, boolean z2) {
        z30 z30Var;
        boolean z3;
        vp0 vp0Var2;
        ga2 ga2Var2;
        boolean z4;
        if (m10Var instanceof z30) {
            z30Var = (z30) m10Var;
            int i = z30Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                z30Var.p = i - Integer.MIN_VALUE;
            } else {
                z30Var = new z30(m10Var);
            }
        } else {
            z30Var = new z30(m10Var);
        }
        z30 z30Var2 = z30Var;
        Object obj = z30Var2.o;
        int i2 = z30Var2.p;
        y20 y20Var = y20.h;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    z3 = z30Var2.n;
                    boolean z5 = z30Var2.m;
                    vp0 vp0Var3 = z30Var2.l;
                    ga2 ga2Var3 = z30Var2.k;
                    m02.y(obj);
                    z4 = z5;
                    vp0Var2 = vp0Var3;
                    ga2Var2 = ga2Var3;
                } else if (i2 != 3) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            m02.y(obj);
            return obj;
        }
        m02.y(obj);
        if (ga2Var.i() && ga2Var.k() && ga2Var.j()) {
            a40 a40Var = new a40(null, vp0Var, ga2Var, z2, z);
            z30Var2.p = 1;
            Object objL = ga2Var.l(z, a40Var, z30Var2);
            if (objL != y20Var) {
                return objL;
            }
        } else {
            z3 = z2;
            z30Var2.k = ga2Var;
            z30Var2.l = vp0Var;
            z30Var2.m = z;
            z30Var2.n = z3;
            z30Var2.p = 2;
            o20 o20VarG = G(ga2Var, z3, z30Var2);
            if (o20VarG != y20Var) {
                vp0Var2 = vp0Var;
                ga2Var2 = ga2Var;
                obj = o20VarG;
                z4 = z;
            }
        }
        y30 y30Var = new y30(null, vp0Var2, ga2Var2, z4, z3);
        z30Var2.k = null;
        z30Var2.l = null;
        z30Var2.p = 3;
        Object objG = ie1.G((o20) obj, y30Var, z30Var2);
        return objG == y20Var ? y20Var : objG;
    }

    public static o20 Q(m20 m20Var, o20 o20Var) {
        o20Var.getClass();
        return o20Var == xf0.h ? m20Var : (o20) o20Var.p(new yx((byte) 9), m20Var);
    }

    public static final qg1 R(uj1 uj1Var) {
        int i;
        if (uj1Var == null || (i = uj1Var.j) == 0) {
            return null;
        }
        return (qg1) uj1Var.k(i - 1);
    }

    public static byte[] S(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                li1.g(jp1.h(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] T(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long U(InputStream inputStream, int i) throws IOException {
        byte[] bArrS = S(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrS[i2] & 255)) << (i2 << 3);
        }
        return j;
    }

    public static final void V(j80 j80Var) {
        z5 z5VarM7getAutofillManager;
        l41 l41VarY = Y(j80Var);
        if (l41VarY.z || (z5VarM7getAutofillManager = o41.a(l41VarY).getAutofillManager()) == null) {
            return;
        }
        Rect rect = z5VarM7getAutofillManager.m;
        s72 s72Var = z5VarM7getAutofillManager.k;
        l41 l41Var = (l41) s72Var.a.b(l41VarY.i);
        if (l41Var == null || l41Var.n == -4) {
            return;
        }
        u8 u8Var = s72Var.c;
        int iD = s72Var.d(l41Var);
        long[] jArr = (long[]) u8Var.b;
        long j = jArr[iD];
        long j2 = jArr[iD + 1];
        rect.set((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        z5VarM7getAutofillManager.h.H().requestAutofill(z5VarM7getAutofillManager.j, l41VarY.i, rect);
    }

    public static final pn1 W(j80 j80Var, int i) {
        pn1 pn1Var = ((qg1) j80Var).h.o;
        pn1Var.getClass();
        if (pn1Var.V0() != j80Var || !vn1.g(i)) {
            return pn1Var;
        }
        pn1 pn1Var2 = pn1Var.C;
        pn1Var2.getClass();
        return pn1Var2;
    }

    public static final pn1 X(j80 j80Var) {
        if (!((qg1) j80Var).h.u) {
            ax0.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        pn1 pn1VarW = W(j80Var, 2);
        if (!pn1VarW.V0().u) {
            ax0.b("LayoutCoordinates is not attached.");
        }
        return pn1VarW;
    }

    public static final l41 Y(j80 j80Var) {
        pn1 pn1Var = ((qg1) j80Var).h.o;
        if (pn1Var != null) {
            return pn1Var.B;
        }
        throw wi0.e("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final t6 Z(j80 j80Var) {
        t6 t6Var = Y(j80Var).u;
        if (t6Var != null) {
            return t6Var;
        }
        throw wi0.e("This node does not have an owner.");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0160  */
    /* JADX WARN: Code duplicated, block: B:103:0x0164  */
    /* JADX WARN: Code duplicated, block: B:104:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x016c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0174  */
    /* JADX WARN: Code duplicated, block: B:110:0x0179  */
    /* JADX WARN: Code duplicated, block: B:111:0x017b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0181  */
    /* JADX WARN: Code duplicated, block: B:114:0x018a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0197  */
    /* JADX WARN: Code duplicated, block: B:121:0x019d  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:75:0x0101  */
    /* JADX WARN: Code duplicated, block: B:77:0x0105  */
    /* JADX WARN: Code duplicated, block: B:78:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x011d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x0126  */
    /* JADX WARN: Code duplicated, block: B:88:0x0130  */
    /* JADX WARN: Code duplicated, block: B:92:0x0146  */
    /* JADX WARN: Code duplicated, block: B:95:0x014c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x015b  */
    public static final long a(float f, float f2, float f3, float f4, sv svVar) {
        int i;
        int i2;
        short s;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        short s2;
        int i9;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        short s3;
        int i16;
        float f5;
        if (svVar.c()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i17 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i18 = i17 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i19 = i18 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i19 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i20 = kv.h;
            return j;
        }
        int i21 = svVar.c;
        if (i21 == -1) {
            zw0.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i22 = 0;
        float fB3 = svVar.b(0);
        float fA3 = svVar.a(0);
        if (f >= fB3) {
            fB3 = f;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i23 = iFloatToRawIntBits3 >>> 31;
        int i24 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i25 = iFloatToRawIntBits3 & 8388607;
        if (i24 == 255) {
            i2 = i25 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i24 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else {
                if (i > 0) {
                    int i26 = i25 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        s = (short) ((((i << 10) | i26) + 1) | (i23 << 15));
                    } else {
                        i2 = i26;
                    }
                    fB = svVar.b(1);
                    fA = svVar.a(1);
                    if (f2 >= fB) {
                        fB = f2;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i3 = iFloatToRawIntBits >>> 31;
                    i4 = (iFloatToRawIntBits >>> 23) & 255;
                    i5 = iFloatToRawIntBits & 8388607;
                    if (i4 == 255) {
                        if (i5 != 0) {
                            i8 = 512;
                        } else {
                            i8 = 0;
                        }
                        i6 = 31;
                    } else {
                        i6 = i4 - 112;
                        if (i6 >= 31) {
                            i8 = 0;
                            i6 = 49;
                        } else {
                            if (i6 <= 0) {
                                i7 = i5 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    s2 = (short) ((((i6 << 10) | i7) + 1) | (i3 << 15));
                                } else {
                                    i8 = i7;
                                }
                                fB2 = svVar.b(2);
                                fA2 = svVar.a(2);
                                if (f3 >= fB2) {
                                    fB2 = f3;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i10 = iFloatToRawIntBits2 >>> 31;
                                i11 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i12 = 8388607 & iFloatToRawIntBits2;
                                if (i11 == 255) {
                                    i15 = i12 != 0 ? 512 : 0;
                                    i22 = 31;
                                } else {
                                    i13 = i11 - 112;
                                    if (i13 >= 31) {
                                        i15 = 0;
                                        i22 = 49;
                                    } else {
                                        if (i13 <= 0) {
                                            i14 = i12 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                s3 = (short) ((((i13 << 10) | i14) + 1) | (i10 << 15));
                                            } else {
                                                i15 = i14;
                                                i22 = i13;
                                            }
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            long j2 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i21) & 63);
                                            int i27 = kv.h;
                                            return j2;
                                        }
                                        if (i13 >= -10) {
                                            i16 = (i12 | 8388608) >> (1 - i13);
                                            if ((i16 & 4096) != 0) {
                                                i16 += 8192;
                                            }
                                            i15 = i16 >> 13;
                                        } else {
                                            i15 = 0;
                                        }
                                    }
                                }
                                s3 = (short) ((i10 << 15) | (i22 << 10) | i15);
                                if (f4 >= 0.0f) {
                                }
                                long j3 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i21) & 63);
                                int i28 = kv.h;
                                return j3;
                            }
                            if (i6 >= -10) {
                                i9 = (i5 | 8388608) >> (1 - i6);
                                if ((i9 & 4096) != 0) {
                                    i9 += 8192;
                                }
                                i8 = i9 >> 13;
                                i6 = 0;
                            } else {
                                i8 = 0;
                                i6 = 0;
                            }
                        }
                    }
                    s2 = (short) ((i3 << 15) | (i6 << 10) | i8);
                    fB2 = svVar.b(2);
                    fA2 = svVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i10 = iFloatToRawIntBits2 >>> 31;
                    i11 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i12 = 8388607 & iFloatToRawIntBits2;
                    if (i11 == 255) {
                        i15 = i12 != 0 ? 512 : 0;
                        i22 = 31;
                    } else {
                        i13 = i11 - 112;
                        if (i13 >= 31) {
                            i15 = 0;
                            i22 = 49;
                        } else {
                            if (i13 <= 0) {
                                i14 = i12 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    s3 = (short) ((((i13 << 10) | i14) + 1) | (i10 << 15));
                                } else {
                                    i15 = i14;
                                    i22 = i13;
                                }
                                if (f4 >= 0.0f) {
                                }
                                long j4 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i21) & 63);
                                int i29 = kv.h;
                                return j4;
                            }
                            if (i13 >= -10) {
                                i16 = (i12 | 8388608) >> (1 - i13);
                                if ((i16 & 4096) != 0) {
                                    i16 += 8192;
                                }
                                i15 = i16 >> 13;
                            } else {
                                i15 = 0;
                            }
                        }
                    }
                    s3 = (short) ((i10 << 15) | (i22 << 10) | i15);
                    if (f4 >= 0.0f) {
                    }
                    long j5 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i21) & 63);
                    int i210 = kv.h;
                    return j5;
                }
                if (i >= -10) {
                    int i30 = (i25 | 8388608) >> (1 - i);
                    if ((i30 & 4096) != 0) {
                        i30 += 8192;
                    }
                    i2 = i30 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        s = (short) ((i23 << 15) | (i << 10) | i2);
        fB = svVar.b(1);
        fA = svVar.a(1);
        if (f2 >= fB) {
            fB = f2;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i3 = iFloatToRawIntBits >>> 31;
        i4 = (iFloatToRawIntBits >>> 23) & 255;
        i5 = iFloatToRawIntBits & 8388607;
        if (i4 == 255) {
            if (i5 != 0) {
                i8 = 512;
            } else {
                i8 = 0;
            }
            i6 = 31;
        } else {
            i6 = i4 - 112;
            if (i6 >= 31) {
                i8 = 0;
                i6 = 49;
            } else {
                if (i6 <= 0) {
                    i7 = i5 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        s2 = (short) ((((i6 << 10) | i7) + 1) | (i3 << 15));
                    } else {
                        i8 = i7;
                    }
                    fB2 = svVar.b(2);
                    fA2 = svVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i10 = iFloatToRawIntBits2 >>> 31;
                    i11 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i12 = 8388607 & iFloatToRawIntBits2;
                    if (i11 == 255) {
                        i15 = i12 != 0 ? 512 : 0;
                        i22 = 31;
                    } else {
                        i13 = i11 - 112;
                        if (i13 >= 31) {
                            i15 = 0;
                            i22 = 49;
                        } else {
                            if (i13 <= 0) {
                                i14 = i12 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    s3 = (short) ((((i13 << 10) | i14) + 1) | (i10 << 15));
                                } else {
                                    i15 = i14;
                                    i22 = i13;
                                }
                                if (f4 >= 0.0f) {
                                }
                                long j6 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i21) & 63);
                                int i211 = kv.h;
                                return j6;
                            }
                            if (i13 >= -10) {
                                i16 = (i12 | 8388608) >> (1 - i13);
                                if ((i16 & 4096) != 0) {
                                    i16 += 8192;
                                }
                                i15 = i16 >> 13;
                            } else {
                                i15 = 0;
                            }
                        }
                    }
                    s3 = (short) ((i10 << 15) | (i22 << 10) | i15);
                    if (f4 >= 0.0f) {
                    }
                    long j7 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i21) & 63);
                    int i212 = kv.h;
                    return j7;
                }
                if (i6 >= -10) {
                    i9 = (i5 | 8388608) >> (1 - i6);
                    if ((i9 & 4096) != 0) {
                        i9 += 8192;
                    }
                    i8 = i9 >> 13;
                    i6 = 0;
                } else {
                    i8 = 0;
                    i6 = 0;
                }
            }
        }
        s2 = (short) ((i3 << 15) | (i6 << 10) | i8);
        fB2 = svVar.b(2);
        fA2 = svVar.a(2);
        if (f3 >= fB2) {
            fB2 = f3;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i10 = iFloatToRawIntBits2 >>> 31;
        i11 = (iFloatToRawIntBits2 >>> 23) & 255;
        i12 = 8388607 & iFloatToRawIntBits2;
        if (i11 == 255) {
            i15 = i12 != 0 ? 512 : 0;
            i22 = 31;
        } else {
            i13 = i11 - 112;
            if (i13 >= 31) {
                i15 = 0;
                i22 = 49;
            } else {
                if (i13 <= 0) {
                    i14 = i12 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        s3 = (short) ((((i13 << 10) | i14) + 1) | (i10 << 15));
                    } else {
                        i15 = i14;
                        i22 = i13;
                    }
                    if (f4 >= 0.0f) {
                    }
                    long j8 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i21) & 63);
                    int i213 = kv.h;
                    return j8;
                }
                if (i13 >= -10) {
                    i16 = (i12 | 8388608) >> (1 - i13);
                    if ((i16 & 4096) != 0) {
                        i16 += 8192;
                    }
                    i15 = i16 >> 13;
                } else {
                    i15 = 0;
                }
            }
        }
        s3 = (short) ((i10 << 15) | (i22 << 10) | i15);
        if (f4 >= 0.0f) {
        }
        long j9 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i21) & 63);
        int i214 = kv.h;
        return j9;
    }

    public static final ry0 a0(r72 r72Var) {
        return new ry0(Math.round(r72Var.a), Math.round(r72Var.b), Math.round(r72Var.c), Math.round(r72Var.d));
    }

    public static final long b(int i) {
        long j = ((long) i) << 32;
        int i2 = kv.h;
        return j;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:96:0x0104
 case -1811142715: goto B:92:0x00f9
 case -1811142714: goto B:88:0x00ee
 case -1811142713: goto B:84:0x00e3
 case -1811142712: goto B:80:0x00d8
 case -1811142711: goto B:76:0x00cd
 case -1811142710: goto B:72:0x00c2
 case -1811142709: goto B:68:0x00b7
 case -1811142708: goto B:64:0x00ac
 case -1811142707: goto B:60:0x00a1
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:56:0x0096
 case -1811142684: goto B:52:0x008b
 case -1811142683: goto B:48:0x0080
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:44:0x0075
 case 80123372: goto B:40:0x006a
 case 80123373: goto B:36:0x005f
 case 80123374: goto B:32:0x0054
 case 80123375: goto B:28:0x0049
 case 80123376: goto B:24:0x003e
 case 80123377: goto B:20:0x0033
 case 80123378: goto B:16:0x0028
 case 80123379: goto B:12:0x001d
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String b0(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final long c(long j) {
        long j2 = j << 32;
        int i = kv.h;
        return j2;
    }

    public static final int c0(long j) {
        float[] fArr = uv.a;
        return (int) (kv.a(j, uv.e) >>> 32);
    }

    public static long d(int i, int i2, int i3) {
        return b((-16777216) | ((i & 255) << 16) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long d0(long j) {
        return l00.a(k00.k(j), k00.i(j), k00.j(j), k00.h(j));
    }

    public static final void e(final kp0 kp0Var, rg1 rg1Var, boolean z, au0 au0Var, hi2 hi2Var, final nx nxVar, dr0 dr0Var, final int i, final int i2) {
        final rg1 rg1Var2;
        int i3;
        boolean z2;
        int i4;
        final hi2 hi2Var2;
        final boolean z3;
        final au0 au0Var2;
        int i5;
        au0 au0Var3;
        hi2 hi2VarA;
        int i6;
        rg1 rg1Var3;
        au0 au0Var4;
        boolean z4;
        dr0Var.W(1413012038);
        int i7 = i | (dr0Var.h(kp0Var) ? 4 : 2);
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 = i7 | 48;
            rg1Var2 = rg1Var;
        } else {
            rg1Var2 = rg1Var;
            i3 = i7 | (dr0Var.f(rg1Var2) ? 32 : 16);
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i4 = i3 | 384;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (dr0Var.g(z2) ? 256 : 128);
        }
        int i10 = i4 | 91136;
        if (dr0Var.N(i10 & 1, (599187 & i10) != 599186)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                rg1 rg1Var4 = i8 != 0 ? og1.h : rg1Var2;
                boolean z5 = i9 == 0 ? z2 : true;
                long j = ((kv) dr0Var.j(s00.a)).a;
                pv pvVar = (pv) dr0Var.j(rv.a);
                au0 au0Var5 = pvVar.e0;
                float f = pz1.b;
                if (au0Var5 == null) {
                    long j2 = kv.f;
                    au0 au0Var6 = new au0(j2, j, j2, kv.b(f, j));
                    pvVar.e0 = au0Var6;
                    au0Var5 = au0Var6;
                }
                long j3 = au0Var5.b;
                if (r13.a(j3, j)) {
                    au0Var3 = au0Var5;
                    i5 = -465921;
                } else {
                    long jB = kv.b(f, j);
                    long j4 = au0Var5.a;
                    i5 = -465921;
                    long j5 = au0Var5.c;
                    if (j == 16) {
                        j = j3;
                    }
                    au0Var3 = new au0(j4, j, j5, jB != 16 ? jB : au0Var5.d);
                }
                hi2VarA = mi2.a(ie1.P, dr0Var);
                i6 = i10 & i5;
                rg1Var3 = rg1Var4;
                au0Var4 = au0Var3;
                z4 = z5;
            } else {
                dr0Var.Q();
                au0Var4 = au0Var;
                z4 = z2;
                i6 = i10 & (-465921);
                rg1Var3 = rg1Var2;
                hi2VarA = hi2Var;
            }
            dr0Var.q();
            f(rg1Var3, kp0Var, z4, hi2VarA, au0Var4, nxVar, dr0Var, ((i6 >> 3) & 14) | ((i6 << 3) & 112) | (i6 & 896) | 1769472);
            hi2Var2 = hi2VarA;
            au0Var2 = au0Var4;
            rg1Var2 = rg1Var3;
            z3 = z4;
        } else {
            dr0Var.Q();
            hi2Var2 = hi2Var;
            z3 = z2;
            au0Var2 = au0Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(rg1Var2, z3, au0Var2, hi2Var2, nxVar, i, i2) { // from class: bu0
                public final /* synthetic */ rg1 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ au0 k;
                public final /* synthetic */ hi2 l;
                public final /* synthetic */ nx m;
                public final /* synthetic */ byte n;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.n = i2;
                }

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(1572865);
                    cu.e(this.h, this.i, this.j, this.k, this.l, this.m, (dr0) obj, iA, this.n);
                    return j23.a;
                }
            };
        }
    }

    public static final mw0 e0(uv0 uv0Var) {
        uv0Var.getClass();
        String str = uv0Var.a;
        String str2 = uv0Var.b;
        String str3 = uv0Var.c;
        bp1 bp1Var = uv0Var.d;
        return new mw0(str, str2, str3, bp1Var.a, bp1Var.b, bp1Var.c, bp1Var.d, bp1Var.e);
    }

    public static final void f(rg1 rg1Var, kp0 kp0Var, boolean z, hi2 hi2Var, au0 au0Var, nx nxVar, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(-1134296466);
        if ((i & 6) == 0) {
            i2 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.h(kp0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var.f(hi2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dr0Var.f(au0Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dr0Var.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= dr0Var.h(nxVar) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (dr0Var.N(i3 & 1, (599187 & i3) != 599186)) {
            dr0Var.V(977045485);
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new ui1();
                dr0Var.f0(objK);
            }
            ui1 ui1Var = (ui1) objK;
            dr0Var.p(false);
            mt0 mt0Var = kz0.a;
            rg1 rg1VarC = rg1Var.c(hg1.h);
            float f = ie1.Q;
            long jB = ou.b(ie1.R + f + f, 40.0f);
            rg1 rg1VarM = lt.m(h7.W(ie1.e(ou.o(yj2.j(rg1VarC, fc0.b(jB), fc0.a(jB)), hi2Var), z ? au0Var.a : au0Var.c, hi2Var), ui1Var, y92.a(0.0f, 7, 0L, false), z, new ba2(0), kp0Var, 8));
            ze1 ze1VarC = ho.c(c5.m, false);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarM);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, ze1VarC);
            h12.y(c5.E, dr0Var, dx1VarL);
            yx yxVar = c5.G;
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar);
            }
            h12.y(c5.D, dr0Var, rg1VarU);
            ys.a(s00.a.a(new kv(z ? au0Var.b : au0Var.d)), nxVar, dr0Var, 8 | ((i3 >> 15) & 112));
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ol(rg1Var, kp0Var, z, hi2Var, au0Var, nxVar, i);
        }
    }

    public static final by1 f0(dy1 dy1Var, int i) {
        Double dValueOf;
        Double d;
        Double dValueOf2;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double dValueOf3;
        dy1Var.getClass();
        e40 e40Var = dy1Var.l;
        String str = dy1Var.a;
        String str2 = dy1Var.b;
        String strName = dy1Var.c.name();
        Integer num = dy1Var.d;
        Double d6 = dy1Var.e;
        Double d7 = dy1Var.f;
        String strName2 = dy1Var.g.name();
        String strName3 = dy1Var.h.name();
        Double d8 = dy1Var.i;
        String strName4 = dy1Var.j.name();
        String strE0 = dv.E0(dv.L0(dy1Var.k), "\u001f", null, null, null, 62);
        if (e40Var != null) {
            Double dValueOf4 = Double.valueOf(e40Var.a.a);
            dValueOf = Double.valueOf(e40Var.a.b);
            d = dValueOf4;
        } else {
            dValueOf = null;
            d = null;
        }
        Double dH0 = h0(dValueOf);
        if (e40Var != null) {
            Double dValueOf5 = Double.valueOf(e40Var.b.a);
            Double dValueOf6 = Double.valueOf(e40Var.c.a);
            dValueOf2 = Double.valueOf(e40Var.c.b);
            d2 = dValueOf5;
            d3 = dValueOf6;
        } else {
            dValueOf2 = null;
            d2 = null;
            d3 = null;
        }
        Double dH1 = h0(dValueOf2);
        if (e40Var != null) {
            Double dValueOf7 = Double.valueOf(e40Var.d.a);
            dValueOf3 = Double.valueOf(e40Var.d.b);
            d5 = dH1;
            d4 = dValueOf7;
        } else {
            d4 = null;
            d5 = dH1;
            dValueOf3 = null;
        }
        Double dH2 = h0(dValueOf3);
        Double dValueOf8 = e40Var != null ? Double.valueOf(e40Var.e.a) : null;
        double d9 = dy1Var.m;
        LocalDate localDate = dy1Var.n;
        return new by1(str, str2, strName, num, d6, d7, strName2, strName3, d8, strName4, strE0, i, d, dH0, d2, d3, d5, d4, dH2, dValueOf8, d9, localDate != null ? localDate.toString() : null);
    }

    public static final t11 g(c11 c11Var, vp0 vp0Var) {
        c11Var.getClass();
        h11 h11Var = new h11();
        j11 j11Var = c11Var.a;
        h11Var.a = j11Var.c;
        h11Var.b = j11Var.a;
        h11Var.c = j11Var.b;
        String str = j11Var.d;
        h11Var.d = str;
        h11Var.e = j11Var.e;
        h11Var.f = j11Var.g;
        h11Var.g = j11Var.f;
        h11Var.h = c11Var.b;
        h11Var.i = j11Var.h;
        h11Var.j = j11Var.i;
        vp0Var.h(h11Var);
        if (h11Var.c) {
            if (!str.equals("    ")) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        li1.e("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                        return null;
                    }
                }
            }
        } else if (!str.equals("    ")) {
            wg.m("Indent should not be specified when default printing mode is used");
            return null;
        }
        j11 j11Var2 = new j11(h11Var.b, h11Var.c, h11Var.a, h11Var.d, h11Var.e, h11Var.g, h11Var.f, h11Var.i, h11Var.j);
        jy1 jy1Var = h11Var.h;
        jy1Var.getClass();
        return new t11(j11Var2, jy1Var);
    }

    public static final y62 g0(j62 j62Var) {
        j62Var.getClass();
        String str = j62Var.a;
        String str2 = j62Var.b;
        String strName = j62Var.d.name();
        ArrayList arrayList = new ArrayList();
        lh0 lh0Var = te1.o;
        lh0Var.getClass();
        byte b = 0;
        z zVar = new z(lh0Var, b);
        while (zVar.hasNext()) {
            Object next = zVar.next();
            if (j62Var.c.contains((te1) next)) {
                arrayList.add(next);
            }
        }
        String strE0 = dv.E0(arrayList, ",", null, null, new de1(b), 30);
        int i = j62Var.e;
        int i2 = j62Var.f;
        String strName2 = j62Var.j.name();
        boolean z = j62Var.k;
        String strE1 = dv.E0(dv.L0(j62Var.i), "\u001f", null, null, null, 62);
        bp1 bp1Var = j62Var.h;
        return new y62(str, str2, strName, strE0, i, i2, strName2, z, strE1, bp1Var.a, bp1Var.b, bp1Var.c, bp1Var.d, bp1Var.e);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void h(final rg1 rg1Var, b81 b81Var, rt1 rt1Var, bh bhVar, bm bmVar, e70 e70Var, boolean z, j8 j8Var, final vp0 vp0Var, dr0 dr0Var, final int i, final int i2) {
        rg1 rg1Var2;
        int i3;
        rt1 rt1Var2;
        int i4;
        bh bhVar2;
        int i5;
        int i6;
        boolean z2;
        final e70 e70Var2;
        final boolean z3;
        final j8 j8Var2;
        final rt1 rt1Var3;
        final bh bhVar3;
        final b81 b81Var2;
        final bm bmVar2;
        e72 e72VarR;
        b81 b81VarA;
        int i7;
        bh bhVar4;
        j8 j8VarB;
        bm bmVar3;
        int i8;
        bh bhVar5;
        e70 e70Var3;
        boolean z4;
        dr0Var.W(53695811);
        if ((i & 6) == 0) {
            rg1Var2 = rg1Var;
            i3 = (dr0Var.f(rg1Var2) ? 4 : 2) | i;
        } else {
            rg1Var2 = rg1Var;
            i3 = i;
        }
        int i9 = i3 | 16;
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                rt1Var2 = rt1Var;
                i9 |= dr0Var.f(rt1Var2) ? 256 : 128;
            }
            i4 = i9 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    bhVar2 = bhVar;
                    int i11 = dr0Var.f(bhVar2) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
                    i4 |= i11;
                } else {
                    bhVar2 = bhVar;
                }
                i4 |= i11;
            } else {
                bhVar2 = bhVar;
            }
            int i12 = i4 | 46858240;
            if (dr0Var.h(vp0Var)) {
                i5 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
            } else {
                i5 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i6 = i12 | i5;
            if ((306783379 & i6) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dr0Var.N(i6 & 1, z2)) {
                dr0Var.S();
                if ((i & 1) != 0 || dr0Var.x()) {
                    b81VarA = c81.a(0, dr0Var, 3);
                    i7 = i6 & (-113);
                    if (i10 != 0) {
                        rt1Var2 = new rt1(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        bhVar4 = uz0.g;
                        i7 = i6 & (-57457);
                    } else {
                        bhVar4 = bhVar2;
                    }
                    bm bmVar4 = c5.u;
                    e70 e70VarL = y02.l(dr0Var);
                    j8VarB = dt1.b(dr0Var);
                    bmVar3 = bmVar4;
                    i8 = (-238551041) & i7;
                    bhVar5 = bhVar4;
                    e70Var3 = e70VarL;
                    z4 = true;
                } else {
                    dr0Var.Q();
                    int i13 = i6 & (-113);
                    if ((i2 & 16) != 0) {
                        i13 = i6 & (-57457);
                    }
                    b81VarA = b81Var;
                    bmVar3 = bmVar;
                    j8VarB = j8Var;
                    i8 = i13 & (-238551041);
                    bhVar5 = bhVar2;
                    e70Var3 = e70Var;
                    z4 = z;
                }
                dr0Var.q();
                rg1 rg1Var3 = rg1Var2;
                b81 b81Var3 = b81VarA;
                j8 j8Var3 = j8VarB;
                dt.l(rg1Var3, b81Var3, rt1Var2, true, e70Var3, z4, j8Var3, bmVar3, bhVar5, null, null, vp0Var, dr0Var, 806882304 | (i8 & 14) | 24576 | (i8 & 896), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
                e70Var2 = e70Var3;
                bhVar3 = bhVar5;
                j8Var2 = j8Var3;
                bm bmVar5 = bmVar3;
                z3 = z4;
                bmVar2 = bmVar5;
                rt1Var3 = rt1Var2;
                b81Var2 = b81Var3;
            } else {
                dr0Var.Q();
                e70Var2 = e70Var;
                z3 = z;
                j8Var2 = j8Var;
                rt1Var3 = rt1Var2;
                bhVar3 = bhVar2;
                b81Var2 = b81Var;
                bmVar2 = bmVar;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: e51
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        cu.h(rg1Var, b81Var2, rt1Var3, bhVar3, bmVar2, e70Var2, z3, j8Var2, vp0Var, (dr0) obj, m02.A(i | 1), i2);
                        return j23.a;
                    }
                };
            }
        }
        i9 = i3 | 400;
        rt1Var2 = rt1Var;
        i4 = i9 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                bhVar2 = bhVar;
                if (dr0Var.f(bhVar2)) {
                }
                i4 |= i11;
            } else {
                bhVar2 = bhVar;
            }
            i4 |= i11;
        } else {
            bhVar2 = bhVar;
        }
        int i14 = i4 | 46858240;
        if (dr0Var.h(vp0Var)) {
            i5 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
        } else {
            i5 = SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        i6 = i14 | i5;
        if ((306783379 & i6) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dr0Var.N(i6 & 1, z2)) {
            dr0Var.S();
            if ((i & 1) != 0) {
                b81VarA = c81.a(0, dr0Var, 3);
                i7 = i6 & (-113);
                if (i10 != 0) {
                    rt1Var2 = new rt1(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    bhVar4 = uz0.g;
                    i7 = i6 & (-57457);
                } else {
                    bhVar4 = bhVar2;
                }
                bm bmVar6 = c5.u;
                e70 e70VarL2 = y02.l(dr0Var);
                j8VarB = dt1.b(dr0Var);
                bmVar3 = bmVar6;
                i8 = (-238551041) & i7;
                bhVar5 = bhVar4;
                e70Var3 = e70VarL2;
                z4 = true;
            } else {
                b81VarA = c81.a(0, dr0Var, 3);
                i7 = i6 & (-113);
                if (i10 != 0) {
                    rt1Var2 = new rt1(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    bhVar4 = uz0.g;
                    i7 = i6 & (-57457);
                } else {
                    bhVar4 = bhVar2;
                }
                bm bmVar7 = c5.u;
                e70 e70VarL3 = y02.l(dr0Var);
                j8VarB = dt1.b(dr0Var);
                bmVar3 = bmVar7;
                i8 = (-238551041) & i7;
                bhVar5 = bhVar4;
                e70Var3 = e70VarL3;
                z4 = true;
            }
            dr0Var.q();
            rg1 rg1Var4 = rg1Var2;
            b81 b81Var4 = b81VarA;
            j8 j8Var4 = j8VarB;
            dt.l(rg1Var4, b81Var4, rt1Var2, true, e70Var3, z4, j8Var4, bmVar3, bhVar5, null, null, vp0Var, dr0Var, 806882304 | (i8 & 14) | 24576 | (i8 & 896), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
            e70Var2 = e70Var3;
            bhVar3 = bhVar5;
            j8Var2 = j8Var4;
            bm bmVar8 = bmVar3;
            z3 = z4;
            bmVar2 = bmVar8;
            rt1Var3 = rt1Var2;
            b81Var2 = b81Var4;
        } else {
            dr0Var.Q();
            e70Var2 = e70Var;
            z3 = z;
            j8Var2 = j8Var;
            rt1Var3 = rt1Var2;
            bhVar3 = bhVar2;
            b81Var2 = b81Var;
            bmVar2 = bmVar;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: e51
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cu.h(rg1Var, b81Var2, rt1Var3, bhVar3, bmVar2, e70Var2, z3, j8Var2, vp0Var, (dr0) obj, m02.A(i | 1), i2);
                    return j23.a;
                }
            };
        }
    }

    public static final Double h0(Double d) {
        if (d == null || Math.abs(d.doubleValue()) > Double.MAX_VALUE) {
            return null;
        }
        return d;
    }

    public static final void i(final rg1 rg1Var, final b81 b81Var, rt1 rt1Var, zg zgVar, cm cmVar, final tj0 tj0Var, boolean z, j8 j8Var, final vp0 vp0Var, dr0 dr0Var, final int i) {
        final rt1 rt1Var2;
        final zg zgVar2;
        final cm cmVar2;
        final boolean z2;
        final j8 j8Var2;
        rt1 rt1Var3;
        int i2;
        zg zgVar3;
        j8 j8VarB;
        cm cmVar3;
        dr0Var.W(-1884325601);
        int i3 = i | (dr0Var.f(rg1Var) ? 4 : 2) | (dr0Var.f(b81Var) ? 32 : 16) | 208256 | (dr0Var.f(tj0Var) ? 1048576 : 524288) | 46137344 | (dr0Var.h(vp0Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY);
        boolean z3 = true;
        if (dr0Var.N(i3 & 1, (306783379 & i3) != 306783378)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                rt1Var3 = new rt1(0.0f, 0.0f, 0.0f, 0.0f);
                xg xgVar = uz0.e;
                cm cmVar4 = c5.r;
                i2 = i3 & (-234938369);
                zgVar3 = xgVar;
                j8VarB = dt1.b(dr0Var);
                cmVar3 = cmVar4;
            } else {
                dr0Var.Q();
                i2 = i3 & (-234938369);
                rt1Var3 = rt1Var;
                zgVar3 = zgVar;
                cmVar3 = cmVar;
                z3 = z;
                j8VarB = j8Var;
            }
            dr0Var.q();
            dt.l(rg1Var, b81Var, rt1Var3, false, tj0Var, z3, j8VarB, null, null, cmVar3, zgVar3, vp0Var, dr0Var, (i2 & 14) | 24576 | (i2 & 112) | 3456 | ((i2 >> 3) & 458752) | 1572864, 48 | ((i2 >> 18) & 7168), 1792);
            cm cmVar5 = cmVar3;
            j8Var2 = j8VarB;
            cmVar2 = cmVar5;
            rt1Var2 = rt1Var3;
            z2 = z3;
            zgVar2 = zgVar3;
        } else {
            dr0Var.Q();
            rt1Var2 = rt1Var;
            zgVar2 = zgVar;
            cmVar2 = cmVar;
            z2 = z;
            j8Var2 = j8Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(b81Var, rt1Var2, zgVar2, cmVar2, tj0Var, z2, j8Var2, vp0Var, i) { // from class: f51
                public final /* synthetic */ b81 i;
                public final /* synthetic */ rt1 j;
                public final /* synthetic */ zg k;
                public final /* synthetic */ cm l;
                public final /* synthetic */ tj0 m;
                public final /* synthetic */ boolean n;
                public final /* synthetic */ j8 o;
                public final /* synthetic */ vp0 p;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(1);
                    cu.i(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    public static final uv0 i0(mw0 mw0Var) {
        mw0Var.getClass();
        return new uv0(mw0Var.a, mw0Var.b, mw0Var.c, new bp1(mw0Var.d, mw0Var.e, mw0Var.f, mw0Var.g, mw0Var.h));
    }

    public static final void j(nx nxVar, dr0 dr0Var, int i) {
        dr0Var.W(-709502251);
        byte b = 1;
        if (dr0Var.N(i & 1, (i & 3) != 2)) {
            ie0 ie0Var = sb2.a;
            qb2 qb2Var = (qb2) dr0Var.j(ie0Var);
            pb2 pb2VarV = m02.v(dr0Var);
            Object[] objArr = {qb2Var};
            byte b2 = 20;
            k42 k42Var = new k42(new yx(b2), new g(qb2Var, pb2VarV, b2), (byte) 4);
            boolean zH = dr0Var.h(qb2Var) | dr0Var.h(pb2VarV);
            Object objK = dr0Var.K();
            if (zH || objK == zy.a) {
                objK = new h6((Object) qb2Var, (Object) pb2VarV, (byte) 22);
                dr0Var.f0(objK);
            }
            d81 d81Var = (d81) rz1.B(objArr, k42Var, (kp0) objK, dr0Var, 0);
            ys.a(ie0Var.a(d81Var), dt.N(-412824043, new j7(nxVar, d81Var, (byte) 19), dr0Var), dr0Var, 56);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new kl0(nxVar, i, b);
        }
    }

    public static final dy1 j0(by1 by1Var) {
        e40 e40Var;
        by1Var.getClass();
        Double d = by1Var.t;
        Double d2 = by1Var.r;
        Double d3 = by1Var.p;
        Double d4 = by1Var.o;
        Double d5 = by1Var.m;
        if (d5 == null || d4 == null || d3 == null || d2 == null || d == null) {
            e40Var = null;
        } else {
            double dDoubleValue = d5.doubleValue();
            Double d6 = by1Var.n;
            ap1 ap1Var = new ap1(dDoubleValue, d6 != null ? d6.doubleValue() : Double.POSITIVE_INFINITY);
            ap1 ap1Var2 = new ap1(d4.doubleValue());
            double dDoubleValue2 = d3.doubleValue();
            Double d7 = by1Var.q;
            ap1 ap1Var3 = new ap1(dDoubleValue2, d7 != null ? d7.doubleValue() : Double.POSITIVE_INFINITY);
            double dDoubleValue3 = d2.doubleValue();
            Double d8 = by1Var.s;
            e40Var = new e40(ap1Var, ap1Var2, ap1Var3, new ap1(dDoubleValue3, d8 != null ? d8.doubleValue() : Double.POSITIVE_INFINITY), new ap1(d.doubleValue()));
        }
        String str = by1Var.a;
        String str2 = by1Var.b;
        ir0 ir0VarValueOf = ir0.valueOf(by1Var.c);
        Integer num = by1Var.d;
        Double d9 = by1Var.e;
        Double d10 = by1Var.f;
        i3 i3VarValueOf = i3.valueOf(by1Var.g);
        as0 as0VarValueOf = as0.valueOf(by1Var.h);
        Double d11 = by1Var.i;
        lt1 lt1VarValueOf = lt1.valueOf(by1Var.j);
        List listB0 = co2.b0(by1Var.k, new char[]{31});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Set setU0 = dv.U0(arrayList);
        double d12 = by1Var.u;
        String str3 = by1Var.v;
        return new dy1(str, str2, ir0VarValueOf, num, d9, d10, i3VarValueOf, as0VarValueOf, d11, lt1VarValueOf, setU0, e40Var, d12, str3 != null ? LocalDate.parse(str3) : null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x0121  */
    /* JADX WARN: Code duplicated, block: B:48:0x012c  */
    /* JADX WARN: Code duplicated, block: B:51:0x014a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0185  */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void k(final nx nxVar, rg1 rg1Var, final nx nxVar2, nx nxVar3, pa1 pa1Var, dr0 dr0Var, final int i, final int i2) {
        rg1 rg1Var2;
        int i3;
        nx nxVar4;
        int i4;
        byte b;
        byte b2;
        boolean z;
        final pa1 pa1Var2;
        final nx nxVar5;
        final rg1 rg1Var3;
        e72 e72VarR;
        int i5;
        og1 og1Var;
        pv pvVar;
        pa1 pa1Var3;
        pa1 pa1Var4;
        pa1 pa1Var5;
        nx nxVar6;
        nx nxVar7;
        Object objK;
        dr0Var.W(487133126);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i | 48;
            rg1Var2 = rg1Var;
        } else {
            rg1Var2 = rg1Var;
            i3 = i | (dr0Var.f(rg1Var2) ? 32 : 16);
        }
        int i7 = i3 | 24960;
        int i8 = i2 & 32;
        if (i8 == 0) {
            if ((i & 196608) == 0) {
                nxVar4 = nxVar3;
                i7 |= dr0Var.h(nxVar4) ? 131072 : 65536;
            }
            i4 = i7 | 113770496;
            b = 0;
            b2 = 1;
            if ((38347923 & i4) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (dr0Var.N(i4 & 1, z)) {
                dr0Var.S();
                i5 = i & 1;
                og1Var = og1.h;
                Object obj = null;
                if (i5 != 0 || dr0Var.x()) {
                    if (i6 != 0) {
                        rg1Var2 = og1Var;
                    }
                    if (i8 != 0) {
                        nxVar4 = null;
                    }
                    pvVar = (pv) dr0Var.j(rv.a);
                    pa1Var3 = pvVar.f0;
                    if (pa1Var3 == null) {
                        pa1Var4 = new pa1(rv.c(pvVar, s60.Y), rv.c(pvVar, s60.g0), rv.c(pvVar, s60.i0), rv.c(pvVar, s60.k0), rv.c(pvVar, s60.l0), rv.c(pvVar, s60.o0), kv.b(s60.b0, rv.c(pvVar, s60.a0)), kv.b(s60.d0, rv.c(pvVar, s60.c0)), kv.b(s60.f0, rv.c(pvVar, s60.e0)));
                        pvVar.f0 = pa1Var4;
                    } else {
                        pa1Var4 = pa1Var3;
                    }
                    pa1Var5 = pa1Var4;
                } else {
                    dr0Var.Q();
                    pa1Var5 = pa1Var;
                }
                dr0Var.q();
                nx nxVarN = dt.N(629852750, new rl(pa1Var5, nxVar, (byte) 5), dr0Var);
                if (nxVar2 == null) {
                    dr0Var.V(-510713870);
                    dr0Var.p(false);
                    nxVar6 = null;
                } else {
                    dr0Var.V(-510713869);
                    nx nxVarN2 = dt.N(-1291211644, new sa1(pa1Var5, nxVar2, b), dr0Var);
                    dr0Var.p(false);
                    nxVar6 = nxVarN2;
                }
                dr0Var.V(-510395686);
                dr0Var.p(false);
                dr0Var.V(-510083888);
                dr0Var.p(false);
                if (nxVar4 == null) {
                    dr0Var.V(-509666659);
                    dr0Var.p(false);
                    nxVar7 = null;
                } else {
                    dr0Var.V(-509666658);
                    nx nxVarN3 = dt.N(1946411067, new sa1(pa1Var5, nxVar4, b2), dr0Var);
                    dr0Var.p(false);
                    nxVar7 = nxVarN3;
                }
                objK = dr0Var.K();
                if (objK == zy.a) {
                    objK = new vv0((byte) 25);
                    dr0Var.f0(objK);
                }
                iq2.a(tg2.a(og1Var, true, (vp0) objK).c(rg1Var2), mi2.a(s60.Z, dr0Var), pa1Var5.a, pa1Var5.b, 0.0f, dt.N(1192488737, new q50(obj, nxVar7, nxVarN, obj, nxVar6, (byte) 3), dr0Var), dr0Var, 12804096, 64);
                pa1Var2 = pa1Var5;
            } else {
                dr0Var.Q();
                pa1Var2 = pa1Var;
            }
            nxVar5 = nxVar4;
            rg1Var3 = rg1Var2;
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: qa1
                    @Override // defpackage.zp0
                    public final Object f(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        cu.k(nxVar, rg1Var3, nxVar2, nxVar5, pa1Var2, (dr0) obj2, m02.A(i | 1), i2);
                        return j23.a;
                    }
                };
            }
        }
        i7 = 221568 | i3;
        nxVar4 = nxVar3;
        i4 = i7 | 113770496;
        b = 0;
        b2 = 1;
        if ((38347923 & i4) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (dr0Var.N(i4 & 1, z)) {
            dr0Var.S();
            i5 = i & 1;
            og1Var = og1.h;
            Object obj2 = null;
            if (i5 != 0) {
                if (i6 != 0) {
                    rg1Var2 = og1Var;
                }
                if (i8 != 0) {
                    nxVar4 = null;
                }
                pvVar = (pv) dr0Var.j(rv.a);
                pa1Var3 = pvVar.f0;
                if (pa1Var3 == null) {
                    pa1Var4 = new pa1(rv.c(pvVar, s60.Y), rv.c(pvVar, s60.g0), rv.c(pvVar, s60.i0), rv.c(pvVar, s60.k0), rv.c(pvVar, s60.l0), rv.c(pvVar, s60.o0), kv.b(s60.b0, rv.c(pvVar, s60.a0)), kv.b(s60.d0, rv.c(pvVar, s60.c0)), kv.b(s60.f0, rv.c(pvVar, s60.e0)));
                    pvVar.f0 = pa1Var4;
                } else {
                    pa1Var4 = pa1Var3;
                }
                pa1Var5 = pa1Var4;
            } else {
                if (i6 != 0) {
                    rg1Var2 = og1Var;
                }
                if (i8 != 0) {
                    nxVar4 = null;
                }
                pvVar = (pv) dr0Var.j(rv.a);
                pa1Var3 = pvVar.f0;
                if (pa1Var3 == null) {
                    pa1Var4 = new pa1(rv.c(pvVar, s60.Y), rv.c(pvVar, s60.g0), rv.c(pvVar, s60.i0), rv.c(pvVar, s60.k0), rv.c(pvVar, s60.l0), rv.c(pvVar, s60.o0), kv.b(s60.b0, rv.c(pvVar, s60.a0)), kv.b(s60.d0, rv.c(pvVar, s60.c0)), kv.b(s60.f0, rv.c(pvVar, s60.e0)));
                    pvVar.f0 = pa1Var4;
                } else {
                    pa1Var4 = pa1Var3;
                }
                pa1Var5 = pa1Var4;
            }
            dr0Var.q();
            nx nxVarN4 = dt.N(629852750, new rl(pa1Var5, nxVar, (byte) 5), dr0Var);
            if (nxVar2 == null) {
                dr0Var.V(-510713870);
                dr0Var.p(false);
                nxVar6 = null;
            } else {
                dr0Var.V(-510713869);
                nx nxVarN5 = dt.N(-1291211644, new sa1(pa1Var5, nxVar2, b), dr0Var);
                dr0Var.p(false);
                nxVar6 = nxVarN5;
            }
            dr0Var.V(-510395686);
            dr0Var.p(false);
            dr0Var.V(-510083888);
            dr0Var.p(false);
            if (nxVar4 == null) {
                dr0Var.V(-509666659);
                dr0Var.p(false);
                nxVar7 = null;
            } else {
                dr0Var.V(-509666658);
                nx nxVarN6 = dt.N(1946411067, new sa1(pa1Var5, nxVar4, b2), dr0Var);
                dr0Var.p(false);
                nxVar7 = nxVarN6;
            }
            objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new vv0((byte) 25);
                dr0Var.f0(objK);
            }
            iq2.a(tg2.a(og1Var, true, (vp0) objK).c(rg1Var2), mi2.a(s60.Z, dr0Var), pa1Var5.a, pa1Var5.b, 0.0f, dt.N(1192488737, new q50(obj2, nxVar7, nxVarN4, obj2, nxVar6, (byte) 3), dr0Var), dr0Var, 12804096, 64);
            pa1Var2 = pa1Var5;
        } else {
            dr0Var.Q();
            pa1Var2 = pa1Var;
        }
        nxVar5 = nxVar4;
        rg1Var3 = rg1Var2;
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: qa1
                @Override // defpackage.zp0
                public final Object f(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    cu.k(nxVar, rg1Var3, nxVar2, nxVar5, pa1Var2, (dr0) obj3, m02.A(i | 1), i2);
                    return j23.a;
                }
            };
        }
    }

    public static final j62 k0(y62 y62Var, List list) {
        y62Var.getClass();
        list.getClass();
        String str = y62Var.a;
        String str2 = y62Var.b;
        List listB0 = co2.b0(y62Var.d, new char[]{','});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ev.o0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(te1.valueOf((String) obj2));
        }
        Set setU0 = dv.U0(arrayList2);
        zr zrVarValueOf = zr.valueOf(y62Var.c);
        int i2 = y62Var.e;
        int i3 = y62Var.f;
        List<d72> listM0 = dv.M0(list, new mm0((byte) 8));
        ArrayList arrayList3 = new ArrayList(ev.o0(listM0, 10));
        for (d72 d72Var : listM0) {
            arrayList3.add(new z62(d72Var.b, d72Var.c));
        }
        bp1 bp1Var = new bp1(y62Var.j, y62Var.k, y62Var.l, y62Var.m, y62Var.n);
        List listB1 = co2.b0(y62Var.i, new char[]{31});
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listB1) {
            if (((String) obj3).length() > 0) {
                arrayList4.add(obj3);
            }
        }
        return new j62(str, str2, setU0, zrVarValueOf, i2, i3, arrayList3, bp1Var, dv.U0(arrayList4), cf2.valueOf(y62Var.g), y62Var.h);
    }

    public static final void l(nx nxVar, nx nxVar2, nx nxVar3, nx nxVar4, nx nxVar5, dr0 dr0Var, int i) {
        dr0Var.W(-61277522);
        int i2 = i | (dr0Var.h(nxVar) ? 4 : 2) | (dr0Var.h(nxVar2) ? 32 : 16) | (dr0Var.h(nxVar4) ? 2048 : 1024) | (dr0Var.h(nxVar5) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192);
        byte b = 1;
        if (dr0Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                objK = new xa1();
                dr0Var.f0(objK);
            }
            xa1 xa1Var = (xa1) objK;
            nx nxVar6 = new nx(1271844412, true, new hw0(lt.Q(nxVar3, nxVar4 == null ? vx.a : nxVar4, nxVar5 == null ? vx.b : nxVar5, nxVar == null ? vx.c : nxVar, nxVar2 == null ? vx.d : nxVar2), b));
            Object objK2 = dr0Var.K();
            if (objK2 == yyVar) {
                objK2 = new rh1(xa1Var);
                dr0Var.f0(objK2);
            }
            ze1 ze1Var = (ze1) objK2;
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, og1.h);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, ze1Var);
            h12.y(c5.E, dr0Var, dx1VarL);
            yx yxVar = c5.G;
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar);
            }
            h12.y(c5.D, dr0Var, rg1VarU);
            wi0.n(0, nxVar6, dr0Var, true);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new cr(nxVar, nxVar2, nxVar3, nxVar4, nxVar5, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f62, qy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList l0(dk2 dk2Var, int i, Integer num) {
        ?? f62Var = new f62(dk2Var);
        i = dk2Var.q(i);
        xq0 xq0VarA = dk2Var.a(i);
        while (i >= 0) {
            f62Var.k(dk2Var.i(i), dk2Var.k(i) ? dk2Var.p(dk2Var.b, i) : zy.a, dk2Var.a.f(i), num);
            if (i >= 0) {
                xq0 xq0Var = xq0VarA;
                xq0VarA = dk2Var.a(i);
                i = dk2Var.q(i);
                num = xq0Var;
            } else {
                num = xq0VarA;
            }
        }
        return (ArrayList) f62Var.a;
    }

    public static final void m(vp0 vp0Var, kp0 kp0Var, kp0 kp0Var2, dr0 dr0Var, int i) {
        vp0Var.getClass();
        kp0Var.getClass();
        kp0Var2.getClass();
        dr0Var.W(1749352259);
        byte b = 2;
        int i2 = i | (dr0Var.h(vp0Var) ? 4 : 2) | (dr0Var.h(kp0Var) ? 32 : 16) | (dr0Var.h(kp0Var2) ? 256 : 128);
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            Context applicationContext = ((Context) dr0Var.j(i7.b)).getApplicationContext();
            applicationContext.getClass();
            MealPlannerApp mealPlannerApp = (MealPlannerApp) applicationContext;
            sj1 sj1VarH = pz1.h(mealPlannerApp.c().e, ag0.h, dr0Var, 48, 2);
            int iIntValue = ((Number) mealPlannerApp.c().c.a()).intValue();
            WeakHashMap weakHashMap = u83.v;
            cy1.a(null, null, null, null, dt.N(-29957366, new gw0(kp0Var, b), dr0Var), 0, 0L, 0L, rz1.i(dr0Var).f, dt.N(1150234578, new uw1(kp0Var2, sj1VarH, iIntValue, vp0Var), dr0Var), dr0Var, 805330944, 239);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s62(vp0Var, kp0Var, kp0Var2, i);
        }
    }

    public static void m0(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 << 3)) & 255);
        }
        outputStream.write(bArr);
    }

    public static final void n(long j, d13 d13Var, zp0 zp0Var, dr0 dr0Var, int i) {
        long j2;
        dr0 dr0Var2;
        zp0 zp0Var2;
        dr0Var.W(-285397024);
        int i2 = (dr0Var.e(j) ? 4 : 2) | i | (dr0Var.h(zp0Var) ? 256 : 128);
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            j2 = j;
            dr0Var2 = dr0Var;
            h12.a(j2, e13.a(d13Var, dr0Var), zp0Var, dr0Var2, i2 & 910);
            zp0Var2 = zp0Var;
        } else {
            j2 = j;
            dr0Var2 = dr0Var;
            zp0Var2 = zp0Var;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new s7(j2, d13Var, zp0Var2, i);
        }
    }

    public static void n0(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m0(byteArrayOutputStream, i, 2);
    }

    public static final void o(s61 s61Var, Object obj, int i, Object obj2, dr0 dr0Var, int i2) {
        dr0Var.W(1439843069);
        int i3 = (dr0Var.f(s61Var) ? 4 : 2) | i2 | (dr0Var.f(obj) ? 32 : 16) | (dr0Var.d(i) ? 256 : 128) | (dr0Var.f(obj2) ? 2048 : 1024);
        if (dr0Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ((ob2) obj).b(obj2, dt.N(980966366, new lx(i, s61Var, obj2), dr0Var), dr0Var, 48);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha(s61Var, obj, i, obj2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x010d  */
    public static final long p(float f, float f2, float f3, float f4, sv svVar) {
        int i;
        int i2;
        short s;
        int iFloatToRawIntBits;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        short s2;
        int i9;
        int iFloatToRawIntBits2;
        int i10;
        int i11;
        int i12;
        int i13;
        short s3;
        int i14;
        if (svVar.c()) {
            long j = ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
            int i15 = kv.h;
            return j;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f);
        int i16 = iFloatToRawIntBits3 >>> 31;
        int i17 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i18 = iFloatToRawIntBits3 & 8388607;
        int i19 = 49;
        int i20 = 0;
        if (i17 == 255) {
            i2 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i21 = i18 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        s = (short) ((((i << 10) | i21) + 1) | (i16 << 15));
                    } else {
                        i2 = i21;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(f2);
                    i3 = iFloatToRawIntBits >>> 31;
                    i4 = (iFloatToRawIntBits >>> 23) & 255;
                    i5 = iFloatToRawIntBits & 8388607;
                    if (i4 == 255) {
                        if (i5 != 0) {
                            i8 = 512;
                        } else {
                            i8 = 0;
                        }
                        i6 = 31;
                    } else {
                        i6 = i4 - 112;
                        if (i6 >= 31) {
                            i6 = 49;
                            i8 = 0;
                        } else {
                            if (i6 <= 0) {
                                i7 = i5 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    s2 = (short) ((((i6 << 10) | i7) + 1) | (i3 << 15));
                                } else {
                                    i8 = i7;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                                i10 = iFloatToRawIntBits2 >>> 31;
                                i11 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i12 = 8388607 & iFloatToRawIntBits2;
                                if (i11 == 255) {
                                    i13 = i11 - 112;
                                    if (i13 >= 31) {
                                        if (i13 <= 0) {
                                            i20 = i12 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                s3 = (short) ((((i13 << 10) | i20) + 1) | (i10 << 15));
                                            } else {
                                                i19 = i13;
                                            }
                                        } else if (i13 >= -10) {
                                            i14 = (i12 | 8388608) >> (1 - i13);
                                            if ((i14 & 4096) != 0) {
                                                i14 += 8192;
                                            }
                                            i19 = 0;
                                            i20 = i14 >> 13;
                                        } else {
                                            i19 = 0;
                                        }
                                    }
                                    long jMax = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) svVar.c) & 63);
                                    int i22 = kv.h;
                                    return jMax;
                                }
                                i20 = i12 == 0 ? 0 : 512;
                                i19 = 31;
                                s3 = (short) ((i10 << 15) | (i19 << 10) | i20);
                                long jMax2 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) svVar.c) & 63);
                                int i23 = kv.h;
                                return jMax2;
                            }
                            if (i6 >= -10) {
                                i9 = (i5 | 8388608) >> (1 - i6);
                                if ((i9 & 4096) != 0) {
                                    i9 += 8192;
                                }
                                i8 = i9 >> 13;
                                i6 = 0;
                            } else {
                                i8 = 0;
                                i6 = 0;
                            }
                        }
                    }
                    s2 = (short) ((i3 << 15) | (i6 << 10) | i8);
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i10 = iFloatToRawIntBits2 >>> 31;
                    i11 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i12 = 8388607 & iFloatToRawIntBits2;
                    if (i11 == 255) {
                        i13 = i11 - 112;
                        if (i13 >= 31) {
                            if (i13 <= 0) {
                                i20 = i12 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    s3 = (short) ((((i13 << 10) | i20) + 1) | (i10 << 15));
                                } else {
                                    i19 = i13;
                                }
                            } else if (i13 >= -10) {
                                i14 = (i12 | 8388608) >> (1 - i13);
                                if ((i14 & 4096) != 0) {
                                    i14 += 8192;
                                }
                                i19 = 0;
                                i20 = i14 >> 13;
                            } else {
                                i19 = 0;
                            }
                        }
                        long jMax3 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) svVar.c) & 63);
                        int i24 = kv.h;
                        return jMax3;
                    }
                    i20 = i12 == 0 ? 0 : 512;
                    i19 = 31;
                    s3 = (short) ((i10 << 15) | (i19 << 10) | i20);
                    long jMax4 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) svVar.c) & 63);
                    int i25 = kv.h;
                    return jMax4;
                }
                if (i >= -10) {
                    int i26 = (i18 | 8388608) >> (1 - i);
                    if ((i26 & 4096) != 0) {
                        i26 += 8192;
                    }
                    i2 = i26 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        s = (short) ((i16 << 15) | (i << 10) | i2);
        iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        i3 = iFloatToRawIntBits >>> 31;
        i4 = (iFloatToRawIntBits >>> 23) & 255;
        i5 = iFloatToRawIntBits & 8388607;
        if (i4 == 255) {
            if (i5 != 0) {
                i8 = 512;
            } else {
                i8 = 0;
            }
            i6 = 31;
        } else {
            i6 = i4 - 112;
            if (i6 >= 31) {
                i6 = 49;
                i8 = 0;
            } else {
                if (i6 <= 0) {
                    i7 = i5 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        s2 = (short) ((((i6 << 10) | i7) + 1) | (i3 << 15));
                    } else {
                        i8 = i7;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i10 = iFloatToRawIntBits2 >>> 31;
                    i11 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i12 = 8388607 & iFloatToRawIntBits2;
                    if (i11 == 255) {
                        i13 = i11 - 112;
                        if (i13 >= 31) {
                            if (i13 <= 0) {
                                i20 = i12 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    s3 = (short) ((((i13 << 10) | i20) + 1) | (i10 << 15));
                                } else {
                                    i19 = i13;
                                }
                            } else if (i13 >= -10) {
                                i14 = (i12 | 8388608) >> (1 - i13);
                                if ((i14 & 4096) != 0) {
                                    i14 += 8192;
                                }
                                i19 = 0;
                                i20 = i14 >> 13;
                            } else {
                                i19 = 0;
                            }
                        }
                        long jMax5 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) svVar.c) & 63);
                        int i27 = kv.h;
                        return jMax5;
                    }
                    i20 = i12 == 0 ? 0 : 512;
                    i19 = 31;
                    s3 = (short) ((i10 << 15) | (i19 << 10) | i20);
                    long jMax6 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) svVar.c) & 63);
                    int i28 = kv.h;
                    return jMax6;
                }
                if (i6 >= -10) {
                    i9 = (i5 | 8388608) >> (1 - i6);
                    if ((i9 & 4096) != 0) {
                        i9 += 8192;
                    }
                    i8 = i9 >> 13;
                    i6 = 0;
                } else {
                    i8 = 0;
                    i6 = 0;
                }
            }
        }
        s2 = (short) ((i3 << 15) | (i6 << 10) | i8);
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        i10 = iFloatToRawIntBits2 >>> 31;
        i11 = (iFloatToRawIntBits2 >>> 23) & 255;
        i12 = 8388607 & iFloatToRawIntBits2;
        if (i11 == 255) {
            i13 = i11 - 112;
            if (i13 >= 31) {
                if (i13 <= 0) {
                    i20 = i12 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        s3 = (short) ((((i13 << 10) | i20) + 1) | (i10 << 15));
                    } else {
                        i19 = i13;
                    }
                } else if (i13 >= -10) {
                    i14 = (i12 | 8388608) >> (1 - i13);
                    if ((i14 & 4096) != 0) {
                        i14 += 8192;
                    }
                    i19 = 0;
                    i20 = i14 >> 13;
                } else {
                    i19 = 0;
                }
            }
            long jMax7 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) svVar.c) & 63);
            int i29 = kv.h;
            return jMax7;
        }
        i20 = i12 == 0 ? 0 : 512;
        i19 = 31;
        s3 = (short) ((i10 << 15) | (i19 << 10) | i20);
        long jMax8 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) svVar.c) & 63);
        int i210 = kv.h;
        return jMax8;
    }

    public static final void q(uj1 uj1Var, qg1 qg1Var) {
        uj1 uj1VarZ = Y(qg1Var).z();
        int i = uj1VarZ.j - 1;
        Object[] objArr = uj1VarZ.h;
        if (i < objArr.length) {
            while (i >= 0) {
                uj1Var.b(((l41) objArr[i]).L.f);
                i--;
            }
        }
    }

    public static final rv0 r(tv0 tv0Var, float f, float f2, qv0 qv0Var, dr0 dr0Var) {
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        Object objK = dr0Var.K();
        yy yyVar = zy.a;
        if (objK == yyVar) {
            objK = new rv0(tv0Var, fValueOf, fValueOf2, qv0Var);
            dr0Var.f0(objK);
        }
        rv0 rv0Var = (rv0) objK;
        boolean zH = dr0Var.h(qv0Var);
        Object objK2 = dr0Var.K();
        if (zH || objK2 == yyVar) {
            objK2 = new a8(fValueOf, rv0Var, fValueOf2, qv0Var, (byte) 1);
            dr0Var.f0(objK2);
        }
        h7.S((kp0) objK2, dr0Var);
        boolean zH2 = dr0Var.h(tv0Var);
        Object objK3 = dr0Var.K();
        if (zH2 || objK3 == yyVar) {
            objK3 = new g(tv0Var, rv0Var, (byte) 14);
            dr0Var.f0(objK3);
        }
        h7.G(rv0Var, (vp0) objK3, dr0Var);
        return rv0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final c41 s(qg1 qg1Var) {
        if ((qg1Var.j & 2) != 0) {
            if (qg1Var instanceof c41) {
                return (c41) qg1Var;
            }
            if (qg1Var instanceof k80) {
                qg1 qg1Var2 = ((k80) qg1Var).w;
                while (qg1Var2 != 0) {
                    if (qg1Var2 instanceof c41) {
                        return (c41) qg1Var2;
                    }
                    qg1Var2 = (!(qg1Var2 instanceof k80) || (qg1Var2.j & 2) == 0) ? qg1Var2.m : ((k80) qg1Var2).w;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [f62, qy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [xq0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List t(ik2 ik2Var, Integer num, int i, Integer num2) {
        int iD;
        int iR;
        fj1 fj1Var;
        if (ik2Var.w || ik2Var.o() == 0) {
            return ag0.h;
        }
        ?? f62Var = new f62(ik2Var);
        if (num2 != null) {
            iD = num2.intValue();
        } else {
            iD = ik2Var.v;
            if (iD < 0) {
                iD = ik2Var.D(ik2Var.b, i);
            }
        }
        if (num == 0) {
            int iM = ik2Var.i - ik2Var.M(ik2Var.b, ik2Var.q(i));
            si1 si1Var = ik2Var.s;
            num = Integer.valueOf(iM + ((si1Var == null || (fj1Var = (fj1) si1Var.b(i)) == null) ? 0 : fj1Var.b));
        }
        int iQ = ik2Var.q(i) * 5;
        int[] iArr = ik2Var.b;
        if (iQ < iArr.length) {
            iR = ik2Var.r(i);
        } else {
            int iD2 = iD >= 0 ? ik2Var.D(iArr, iD) : iD;
            iR = ik2Var.r(iD);
            int i2 = iD;
            iD = iD2;
            i = i2;
        }
        while (i >= 0) {
            f62Var.k(iR, (ik2Var.b[(ik2Var.q(i) * 5) + 1] & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? ik2Var.s(i) : zy.a, ik2Var.N(i), num);
            num = ik2Var.b(i);
            if (iD >= 0) {
                int iD3 = ik2Var.D(ik2Var.b, iD);
                iR = ik2Var.r(iD);
                int i3 = iD;
                iD = iD3;
                i = i3;
            } else {
                i = iD;
            }
        }
        return (ArrayList) f62Var.a;
    }

    public static final int u(nz0 nz0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        float f;
        if (i6 == 1) {
            f = s60.j0;
        } else {
            f = i6 == 2 ? s60.q0 : s60.n0;
        }
        int iMax = Math.max(Math.max(k00.j(j), nz0Var.R(f)), Math.max(i, Math.max(i3 + i4 + i5, i2)) + i7);
        int iH = k00.h(j);
        return iMax > iH ? iH : iMax;
    }

    public static void v(final ExecutorService executorService, final int i, int i2, final int i3, int i4, final sb0 sb0Var) {
        int i5 = i2 - i;
        int iMin = Math.min(i4, i5);
        if (i5 <= i3 || iMin <= 1) {
            sb0Var.a(i, i2);
            return;
        }
        final int i6 = iMin / 2;
        int i7 = iMin - i6;
        final int i8 = i + ((int) ((((long) i5) * ((long) i6)) / ((long) iMin)));
        Future<?> futureSubmit = executorService.submit(new Runnable() { // from class: rb0
            @Override // java.lang.Runnable
            public final void run() {
                cu.v(executorService, i, i8, i3, i6, sb0Var);
            }
        });
        try {
            v(executorService, i8, i2, i3, i7, sb0Var);
            try {
                futureSubmit.get();
            } catch (InterruptedException e) {
                futureSubmit.cancel(true);
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            } catch (ExecutionException e2) {
                Throwable th = e2;
                Throwable cause = th.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                if (cause != null) {
                    th = cause;
                }
                throw new RuntimeException(th);
            }
        } catch (Error | RuntimeException e3) {
            futureSubmit.cancel(true);
            throw e3;
        }
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:96:0x0104
 case -1811142715: goto B:92:0x00f9
 case -1811142714: goto B:88:0x00ee
 case -1811142713: goto B:84:0x00e3
 case -1811142712: goto B:80:0x00d8
 case -1811142711: goto B:76:0x00cd
 case -1811142710: goto B:72:0x00c2
 case -1811142709: goto B:68:0x00b7
 case -1811142708: goto B:64:0x00ac
 case -1811142707: goto B:60:0x00a1
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:56:0x0096
 case -1811142684: goto B:52:0x008b
 case -1811142683: goto B:48:0x0080
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:44:0x0075
 case 80123372: goto B:40:0x006a
 case 80123373: goto B:36:0x005f
 case 80123374: goto B:32:0x0054
 case 80123375: goto B:28:0x0049
 case 80123376: goto B:24:0x003e
 case 80123377: goto B:20:0x0033
 case 80123378: goto B:16:0x0028
 case 80123379: goto B:12:0x001d
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String w(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final long x(long j, long j2) {
        float f;
        float f2;
        long jA = kv.a(j, kv.e(j2));
        float fC = kv.c(j2);
        float fC2 = kv.c(jA);
        float f3 = 1.0f - fC2;
        float f4 = (fC * f3) + fC2;
        float fG = kv.g(jA);
        float fG2 = kv.g(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fG2 * fC) * f3) + (fG * fC2)) / f4;
        }
        float f6 = kv.f(jA);
        float f7 = kv.f(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((f7 * fC) * f3) + (f6 * fC2)) / f4;
        }
        float fD = kv.d(jA);
        float fD2 = kv.d(j2);
        if (f4 != 0.0f) {
            f5 = (((fD2 * fC) * f3) + (fD * fC2)) / f4;
        }
        return p(f, f2, f5, f4, kv.e(j2));
    }

    public static byte[] y(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static final float z(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
