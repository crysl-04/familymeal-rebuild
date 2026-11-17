package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.view.View;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class m02 implements oe1 {
    public static final int h = 15;

    public static final int A(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void B(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final long a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            bx0.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        int i3 = qw2.c;
        return j;
    }

    public static th2 b(String str, p02 p02Var, rh2[] rh2VarArr) {
        if (co2.X(str)) {
            wg.m("Blank serial names are prohibited");
            return null;
        }
        if (p02Var.equals(po2.i)) {
            wg.m("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        eu euVar = new eu(str);
        return new th2(str, p02Var, euVar.b.size(), gi.b0(rh2VarArr), euVar);
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final long d(int i, long j) {
        int i2 = qw2.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : a(i4, i);
    }

    public static final d92 e(Throwable th) {
        th.getClass();
        return new d92(th);
    }

    public static final void f(ks0 ks0Var, j33 j33Var) {
        ArrayList arrayList = j33Var.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l33 l33Var = (l33) arrayList.get(i);
            if (l33Var instanceof n33) {
                av1 av1Var = new av1();
                n33 n33Var = (n33) l33Var;
                av1Var.d = n33Var.i;
                av1Var.n = true;
                av1Var.c();
                av1Var.s.a.setFillType(n33Var.j ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                av1Var.c();
                av1Var.c();
                av1Var.b = n33Var.k;
                av1Var.c();
                av1Var.c = n33Var.l;
                av1Var.c();
                av1Var.g = n33Var.m;
                av1Var.c();
                av1Var.e = n33Var.n;
                av1Var.c();
                av1Var.f = n33Var.o;
                av1Var.o = true;
                av1Var.c();
                av1Var.h = n33Var.p;
                av1Var.o = true;
                av1Var.c();
                av1Var.i = n33Var.q;
                av1Var.o = true;
                av1Var.c();
                av1Var.j = n33Var.r;
                av1Var.o = true;
                av1Var.c();
                av1Var.k = n33Var.s;
                av1Var.p = true;
                av1Var.c();
                av1Var.l = n33Var.t;
                av1Var.p = true;
                av1Var.c();
                av1Var.m = n33Var.u;
                av1Var.p = true;
                av1Var.c();
                ks0Var.e(i, av1Var);
            } else if (l33Var instanceof j33) {
                ks0 ks0Var2 = new ks0();
                j33 j33Var2 = (j33) l33Var;
                ks0Var2.k = j33Var2.h;
                ks0Var2.c();
                ks0Var2.l = j33Var2.i;
                ks0Var2.s = true;
                ks0Var2.c();
                ks0Var2.o = j33Var2.l;
                ks0Var2.s = true;
                ks0Var2.c();
                ks0Var2.p = j33Var2.m;
                ks0Var2.s = true;
                ks0Var2.c();
                ks0Var2.q = j33Var2.n;
                ks0Var2.s = true;
                ks0Var2.c();
                ks0Var2.r = j33Var2.o;
                ks0Var2.s = true;
                ks0Var2.c();
                ks0Var2.m = j33Var2.j;
                ks0Var2.s = true;
                ks0Var2.c();
                ks0Var2.n = j33Var2.k;
                ks0Var2.s = true;
                ks0Var2.c();
                ks0Var2.f = j33Var2.p;
                ks0Var2.g = true;
                ks0Var2.c();
                f(ks0Var2, j33Var2);
                ks0Var.e(i, ks0Var2);
            }
        }
    }

    public static final int g(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int h(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final e91 i(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            e91 e91Var = tag instanceof e91 ? (e91) tag : null;
            if (e91Var != null) {
                return e91Var;
            }
            Object objP = rz1.p(view);
            view = objP instanceof View ? (View) objP : null;
        }
        return null;
    }

    public static final long l(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final u82 m(jw2 jw2Var, int i) {
        iw2 iw2Var = jw2Var.a;
        uh1 uh1Var = jw2Var.b;
        if (iw2Var.a.i.length() != 0) {
            int iD = uh1Var.d(i);
            if ((i != 0 && iD == uh1Var.d(i - 1)) || (i != iw2Var.a.i.length() && iD == uh1Var.d(i + 1))) {
                return jw2Var.a(i);
            }
        }
        return jw2Var.g(i);
    }

    public static void o(boolean z, boolean z2, boolean z3, int i, double[] dArr, int i2, double[] dArr2, int i3) {
        sh.n("TRSV", "n", i >= 0);
        sh.n("TRSV", "lda", i2 >= Math.max(1, i));
        if (i == 0) {
            return;
        }
        rz1.s(z, z2, z3, i, dArr, i2, dArr2, i3);
    }

    public static void p(boolean z, boolean z2, boolean z3, int i, float[] fArr, int i2, float[] fArr2) {
        sh.n("TRSV", "n", i >= 0);
        sh.n("TRSV", "lda", i2 >= Math.max(1, i));
        if (i != 0) {
            if (z2) {
                if (!z) {
                    for (int i3 = i - 1; i3 >= 0; i3--) {
                        int i4 = i3 + 1;
                        int i5 = i3 * i2;
                        int i6 = i5 + i3 + 1;
                        float f = 0.0f;
                        while (i4 < i) {
                            f += fArr[i6] * fArr2[i4];
                            i4++;
                            i6++;
                        }
                        float f2 = fArr2[i3] - f;
                        if (!z3) {
                            f2 /= fArr[i5 + i3];
                        }
                        fArr2[i3] = f2;
                    }
                    return;
                }
                for (int i7 = 0; i7 < i; i7++) {
                    int i8 = i7 * i2;
                    int i9 = 0;
                    int i10 = i8;
                    int i11 = 0;
                    float f3 = 0.0f;
                    while (i9 < i7) {
                        f3 += fArr[i10] * fArr2[i11];
                        i9++;
                        i10++;
                        i11++;
                    }
                    float f4 = fArr2[i7] - f3;
                    if (!z3) {
                        f4 /= fArr[i8 + i7];
                    }
                    fArr2[i7] = f4;
                }
                return;
            }
            if (z) {
                for (int i12 = i - 1; i12 >= 0; i12--) {
                    if (!z3) {
                        fArr2[i12] = fArr2[i12] / fArr[(i12 * i2) + i12];
                    }
                    float f5 = fArr2[i12];
                    if (f5 != 0.0f) {
                        aa3.x(fArr2, 0, -f5, fArr, i12 * i2, 0, i12);
                    }
                }
                return;
            }
            if (i > 40) {
                for (int i13 = 0; i13 < i; i13++) {
                    if (!z3) {
                        fArr2[i13] = fArr2[i13] / fArr[(i13 * i2) + i13];
                    }
                    float f6 = fArr2[i13];
                    if (f6 != 0.0f) {
                        aa3.x(fArr2, 0, -f6, fArr, i13 * i2, i13 + 1, i);
                    }
                }
                return;
            }
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = 0;
                int i16 = i14;
                int i17 = 0;
                float f7 = 0.0f;
                while (i15 < i14) {
                    f7 += fArr[i16] * fArr2[i17];
                    i15++;
                    i16 += i2;
                    i17++;
                }
                float f8 = fArr2[i14] - f7;
                if (!z3) {
                    f8 /= fArr[(i14 * i2) + i14];
                }
                fArr2[i14] = f8;
            }
        }
    }

    public static MappedByteBuffer q(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static final long r(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : kv.b(kv.c(j) * f, j);
    }

    public static long s(int i, int i2, int i3, int i4) {
        return ((long) (i & 32767)) | (((long) (i2 & 32767)) << 15) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static final List t(SQLiteStatement sQLiteStatement) {
        int iG = h12.g(sQLiteStatement, "id");
        int iG2 = h12.g(sQLiteStatement, "seq");
        int iG3 = h12.g(sQLiteStatement, "from");
        int iG4 = h12.g(sQLiteStatement, "to");
        na1 na1VarQ = lt.q();
        while (sQLiteStatement.step()) {
            na1VarQ.add(new vn0((int) sQLiteStatement.getLong(iG), (int) sQLiteStatement.getLong(iG2), sQLiteStatement.getText(iG3), sQLiteStatement.getText(iG4)));
        }
        return dv.L0(lt.e(na1VarQ));
    }

    public static final zr2 u(SQLiteConnection sQLiteConnection, String str, boolean z) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iG = h12.g(sQLiteStatementPrepare, "seqno");
            int iG2 = h12.g(sQLiteStatementPrepare, "cid");
            int iG3 = h12.g(sQLiteStatementPrepare, "name");
            int iG4 = h12.g(sQLiteStatementPrepare, "desc");
            if (iG == -1 || iG2 == -1 || iG3 == -1 || iG4 == -1) {
                ie1.j(sQLiteStatementPrepare, null);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (sQLiteStatementPrepare.step()) {
                if (((int) sQLiteStatementPrepare.getLong(iG2)) >= 0) {
                    int i = (int) sQLiteStatementPrepare.getLong(iG);
                    String text = sQLiteStatementPrepare.getText(iG3);
                    String str2 = sQLiteStatementPrepare.getLong(iG4) > 0 ? "DESC" : "ASC";
                    linkedHashMap.put(Integer.valueOf(i), text);
                    linkedHashMap2.put(Integer.valueOf(i), str2);
                }
            }
            List listM0 = dv.M0(linkedHashMap.entrySet(), new mm0((byte) 10));
            ArrayList arrayList = new ArrayList(ev.o0(listM0, 10));
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getValue());
            }
            List listR0 = dv.R0(arrayList);
            List listM1 = dv.M0(linkedHashMap2.entrySet(), new mm0((byte) 11));
            ArrayList arrayList2 = new ArrayList(ev.o0(listM1, 10));
            Iterator it2 = listM1.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
            }
            zr2 zr2Var = new zr2(str, z, listR0, dv.R0(arrayList2));
            ie1.j(sQLiteStatementPrepare, null);
            return zr2Var;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ie1.j(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public static final pb2 v(dr0 dr0Var) {
        dr0Var.V(1967007413);
        Object[] objArr = new Object[0];
        Object objK = dr0Var.K();
        if (objK == zy.a) {
            objK = new n62((byte) 9);
            dr0Var.f0(objK);
        }
        pb2 pb2Var = (pb2) rz1.B(objArr, pb2.l, (kp0) objK, dr0Var, 384);
        pb2Var.j = (qb2) dr0Var.j(sb2.a);
        dr0Var.p(false);
        return pb2Var;
    }

    public static final m33 w(iu0 iu0Var, dr0 dr0Var) {
        e90 e90Var = (e90) dr0Var.j(uz.h);
        boolean zE = dr0Var.e((((long) Float.floatToRawIntBits(iu0Var.j)) << 32) | (((long) Float.floatToRawIntBits(e90Var.b())) & 4294967295L));
        Object objK = dr0Var.K();
        if (zE || objK == zy.a) {
            ks0 ks0Var = new ks0();
            f(ks0Var, iu0Var.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(e90Var.A(iu0Var.b))) << 32) | (((long) Float.floatToRawIntBits(e90Var.A(iu0Var.c))) & 4294967295L);
            float fIntBitsToFloat = iu0Var.d;
            float fIntBitsToFloat2 = iu0Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
            m33 m33Var = new m33(ks0Var);
            String str = iu0Var.a;
            long j = iu0Var.g;
            ln lnVar = j != 16 ? new ln(iu0Var.h, j) : null;
            boolean z = iu0Var.i;
            m33Var.e.setValue(new wj2(jFloatToRawIntBits));
            m33Var.f.setValue(Boolean.valueOf(z));
            g33 g33Var = m33Var.g;
            g33Var.g.setValue(lnVar);
            g33Var.i.setValue(new wj2(jFloatToRawIntBits2));
            g33Var.c = str;
            dr0Var.f0(m33Var);
            objK = m33Var;
        }
        return (m33) objK;
    }

    public static final void x(int i, int i2, rh2 rh2Var) {
        rh2Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = i2 & (~i);
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(rh2Var.e(i4));
            }
            i3 >>>= 1;
        }
        String strB = rh2Var.b();
        strB.getClass();
        throw new kg1(arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strB + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strB + "', but they were missing", null, arrayList, strB);
    }

    public static final void y(Object obj) {
        if (obj instanceof d92) {
            throw ((d92) obj).h;
        }
    }

    public static final void z() {
        throw new UnsupportedOperationException();
    }
}
