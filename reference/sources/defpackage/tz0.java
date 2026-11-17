package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Trace;
import android.text.TextPaint;
import com.familymeal.app.MealPlannerApp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class tz0 {
    public static final qv A;
    public static final d13 B;
    public static final qv C;
    public static final d13 D;
    public static final qv E;
    public static final qv F;
    public static final qv G;
    public static final qv H;
    public static final d13 I;
    public static final float J;
    public static final float K;
    public static final d13 L;
    public static final qv M;
    public static final qv N;
    public static final ji2 O;
    public static final qv P;
    public static final qf0 Q;
    public static final qf0 R;
    public static final qf0 S;
    public static final qf0 T;
    public static final int[] U;
    public static final int[] V;
    public static final int[] W;
    public static final int[] X;
    public static final da Y;
    public static final yy Z;
    public static final StackTraceElement[] a0;
    public static final xg b;
    public static final byte[] b0;
    public static final xg c;
    public static final byte[] c0;
    public static final tw d;
    public static final k42 d0;
    public static final k42 e0;
    public static final tw f;
    public static final k42 f0;
    public static final tw g;
    public static final k42 g0;
    public static final nx h;
    public static final k42 h0;
    public static final nx i;
    public static final qf0 i0;
    public static final nx j;
    public static final jy1 j0;
    public static final nx k;
    public static final Object k0;
    public static iu0 l0;
    public static final ji2 q;
    public static final float r;
    public static final d13 s;
    public static final qv t;
    public static final qv u;
    public static final qv v;
    public static final float w;
    public static final qv x;
    public static final qv y;
    public static final float z;
    public static final m10[] a = new m10[0];
    public static final sw e = new c23() { // from class: sw
        public final /* synthetic */ byte h = 5;

        @Override // defpackage.c23
        public final double a(double d2) {
            return ((uw) b(new uw(d2))).i;
        }

        @Override // defpackage.c23
        public final Comparable b(Comparable comparable) {
            uw uwVar = (uw) comparable;
            switch (this.h) {
                case 0:
                    return new uw(uwVar.a1());
                case 1:
                    e32 e32Var = h32.w;
                    double d2 = uwVar.i;
                    e32Var.getClass();
                    uw uwVarF2 = uw.f2(Math.exp(d2), uwVar.h);
                    uw uwVarH2 = uwVar.h2();
                    double d3 = uwVarH2.i;
                    e32Var.getClass();
                    return uwVarF2.R(uw.f2(Math.exp(d3), uwVarH2.h)).u1(h32.c);
                case 2:
                    e32 e32Var2 = h32.H;
                    double dA1 = uwVar.a1();
                    e32Var2.getClass();
                    return uw.f2(Math.sqrt(dA1), uwVar.j2() * h32.f);
                case 3:
                    e32 e32Var3 = h32.w;
                    double d4 = uwVar.i;
                    e32Var3.getClass();
                    uw uwVarF3 = uw.f2(Math.exp(d4), uwVar.h);
                    uw uwVarH3 = uwVar.h2();
                    double d5 = uwVarH3.i;
                    e32Var3.getClass();
                    uw uwVarF4 = uw.f2(Math.exp(d5), uwVarH3.h);
                    uw uwVarR = uwVarF3.R(uwVarF4);
                    uw uwVarI0 = uwVarF3.i0(uwVarF4);
                    if (uwVarR.equals(uwVarI0)) {
                        return uw.m;
                    }
                    return uwVarR.equals(uwVarI0.h2()) ? uw.m.h2() : uwVarR.f1(uwVarI0);
                case 4:
                    uw uwVar2 = uw.k;
                    uw uwVarF1 = uwVar2.i0(uwVar).f1(uwVar2.R(uwVar));
                    e32 e32Var4 = h32.y;
                    double dA2 = uwVarF1.a1();
                    e32Var4.getClass();
                    return uw.i2(Math.log(dA2), uwVarF1.j2()).i(uwVar2).u1(h32.c);
                case 5:
                    return new uw(uwVar.i, -uwVar.h);
                case 6:
                    e32 e32Var5 = h32.w;
                    double d6 = uwVar.i;
                    e32Var5.getClass();
                    uw uwVarF5 = uw.f2(Math.exp(d6), uwVar.h);
                    uw uwVarH4 = uwVar.h2();
                    double d7 = uwVarH4.i;
                    e32Var5.getClass();
                    return uwVarF5.i0(uw.f2(Math.exp(d7), uwVarH4.h)).u1(h32.c);
                case 7:
                    e32 e32Var6 = h32.w;
                    double d8 = uwVar.i;
                    e32Var6.getClass();
                    return uw.f2(Math.exp(d8), uwVar.h);
                case DatabaseUtils.STATEMENT_DDL /* 8 */:
                    e32 e32Var7 = h32.y;
                    double dA3 = uwVar.a1();
                    e32Var7.getClass();
                    return uw.i2(Math.log(dA3), uwVar.j2());
                default:
                    return uwVar.h2();
            }
        }

        @Override // defpackage.c23
        public final float c(float f2) {
            return (float) ((uw) b(new uw(f2))).i;
        }
    };
    public static final qv l = qv.x;
    public static final float m = 568.0f;
    public static final ji2 n = ji2.h;
    public static final float o = 360.0f;
    public static final float p = 40.0f;

    /* JADX WARN: Type inference failed for: r1v3, types: [tw] */
    /* JADX WARN: Type inference failed for: r1v4, types: [sw] */
    /* JADX WARN: Type inference failed for: r1v5, types: [tw] */
    /* JADX WARN: Type inference failed for: r1v6, types: [tw] */
    static {
        final byte b2 = 0;
        b = new xg(b2);
        final byte b3 = 1;
        c = new xg(b3);
        d = new tm() { // from class: tw
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                uw uwVar = (uw) comparable;
                uw uwVar2 = (uw) comparable2;
                switch (b2) {
                    case 0:
                        return uwVar.i0(uwVar2);
                    case 1:
                        return uwVar.R(uwVar2);
                    case 2:
                        return uwVar.f1(uwVar2);
                    case 3:
                        return uwVar.compareTo(uwVar2) <= 0 ? uwVar2 : uwVar;
                    case 4:
                        return uwVar.compareTo(uwVar2) >= 0 ? uwVar2 : uwVar;
                    default:
                        return uwVar.i(uwVar2);
                }
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                return ((uw) a(new uw(d2), new uw(d3))).i;
            }

            @Override // defpackage.tm
            public final float h(float f2, float f3) {
                return (float) ((uw) a(new uw(f2), new uw(f3))).i;
            }
        };
        final byte b4 = 5;
        f = new tm() { // from class: tw
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                uw uwVar = (uw) comparable;
                uw uwVar2 = (uw) comparable2;
                switch (b4) {
                    case 0:
                        return uwVar.i0(uwVar2);
                    case 1:
                        return uwVar.R(uwVar2);
                    case 2:
                        return uwVar.f1(uwVar2);
                    case 3:
                        return uwVar.compareTo(uwVar2) <= 0 ? uwVar2 : uwVar;
                    case 4:
                        return uwVar.compareTo(uwVar2) >= 0 ? uwVar2 : uwVar;
                    default:
                        return uwVar.i(uwVar2);
                }
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                return ((uw) a(new uw(d2), new uw(d3))).i;
            }

            @Override // defpackage.tm
            public final float h(float f2, float f3) {
                return (float) ((uw) a(new uw(f2), new uw(f3))).i;
            }
        };
        g = new tm() { // from class: tw
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                uw uwVar = (uw) comparable;
                uw uwVar2 = (uw) comparable2;
                switch (b3) {
                    case 0:
                        return uwVar.i0(uwVar2);
                    case 1:
                        return uwVar.R(uwVar2);
                    case 2:
                        return uwVar.f1(uwVar2);
                    case 3:
                        return uwVar.compareTo(uwVar2) <= 0 ? uwVar2 : uwVar;
                    case 4:
                        return uwVar.compareTo(uwVar2) >= 0 ? uwVar2 : uwVar;
                    default:
                        return uwVar.i(uwVar2);
                }
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                return ((uw) a(new uw(d2), new uw(d3))).i;
            }

            @Override // defpackage.tm
            public final float h(float f2, float f3) {
                return (float) ((uw) a(new uw(f2), new uw(f3))).i;
            }
        };
        byte b5 = 11;
        h = new nx(-1092249270, false, new tx(b5));
        i = new nx(1481971692, false, new yx(b2));
        j = new nx(-217971892, false, new yx(b3));
        k = new nx(284686598, false, new wx(b3));
        ji2 ji2Var = ji2.j;
        q = ji2Var;
        r = 40.0f;
        d13 d13Var = d13.h;
        s = d13Var;
        qv qvVar = qv.r;
        t = qvVar;
        qv qvVar2 = qv.k;
        u = qvVar2;
        v = qvVar;
        w = 1.0f;
        x = qvVar;
        qv qvVar3 = qv.n;
        y = qvVar3;
        z = 120.0f;
        qv qvVar4 = qv.o;
        A = qvVar4;
        B = d13.k;
        C = qvVar4;
        D = d13.m;
        E = qv.u;
        F = qv.m;
        G = qvVar4;
        H = qvVar3;
        I = d13Var;
        J = 36.0f;
        K = 72.0f;
        L = d13Var;
        M = qvVar;
        N = qvVar2;
        O = ji2Var;
        P = qvVar4;
        Q = new qf0("UNDEFINED", b3);
        R = new qf0("REUSABLE_CLAIMED", b3);
        S = new qf0("REMOVED_TASK", b3);
        T = new qf0("CLOSED_EMPTY", b3);
        U = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        V = new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
        byte b6 = 3;
        W = new int[]{3, 6};
        X = new int[]{1, 2, 4, 5, 7, 8};
        Y = new da(b6);
        Z = new yy((byte) 21);
        a0 = new StackTraceElement[0];
        byte b7 = 4;
        b0 = new byte[]{112, 114, 111, 0};
        c0 = new byte[]{112, 114, 109, 0};
        d0 = new k42(new kc2(b3), new jc2((byte) 8), b7);
        e0 = new k42(new kc2((byte) 2), new jc2((byte) 9), b7);
        f0 = new k42(new kc2(b6), new jc2((byte) 10), b7);
        g0 = new k42(new kc2(b7), new jc2(b5), b7);
        h0 = new k42(new kc2(b4), new jc2((byte) 12), b7);
        i0 = new qf0("NO_VALUE", b3);
        j0 = new jy1((byte) 19);
        k0 = new Object();
    }

    public static q90[] A(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, q90[] q90VarArr) throws IOException {
        byte[] bArr3 = uz0.H;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, uz0.I)) {
                li1.g("Unsupported meta version");
                return null;
            }
            int iU = (int) cu.U(fileInputStream, 2);
            byte[] bArrT = cu.T(fileInputStream, (int) cu.U(fileInputStream, 4), (int) cu.U(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                li1.g("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrT);
            try {
                q90[] q90VarArrC = C(byteArrayInputStream, bArr2, iU, q90VarArr);
                byteArrayInputStream.close();
                return q90VarArrC;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(uz0.C, bArr2)) {
            li1.g("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            li1.g("Unsupported meta version");
            return null;
        }
        int iU2 = (int) cu.U(fileInputStream, 1);
        byte[] bArrT2 = cu.T(fileInputStream, (int) cu.U(fileInputStream, 4), (int) cu.U(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            li1.g("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrT2);
        try {
            q90[] q90VarArrB = B(byteArrayInputStream2, iU2, q90VarArr);
            byteArrayInputStream2.close();
            return q90VarArrB;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static q90[] B(ByteArrayInputStream byteArrayInputStream, int i2, q90[] q90VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new q90[0];
        }
        if (i2 != q90VarArr.length) {
            li1.g("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iU = (int) cu.U(byteArrayInputStream, 2);
            iArr[i3] = (int) cu.U(byteArrayInputStream, 2);
            strArr[i3] = new String(cu.S(byteArrayInputStream, iU), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            q90 q90Var = q90VarArr[i4];
            if (!q90Var.b.equals(strArr[i4])) {
                li1.g("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            q90Var.e = i5;
            q90Var.h = z(byteArrayInputStream, i5);
        }
        return q90VarArr;
    }

    public static q90[] C(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, q90[] q90VarArr) throws IOException {
        q90 q90Var;
        if (byteArrayInputStream.available() == 0) {
            return new q90[0];
        }
        if (i2 != q90VarArr.length) {
            li1.g("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            cu.U(byteArrayInputStream, 2);
            String str = new String(cu.S(byteArrayInputStream, (int) cu.U(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jU = cu.U(byteArrayInputStream, 4);
            int iU = (int) cu.U(byteArrayInputStream, 2);
            if (q90VarArr.length <= 0) {
                q90Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i4 = 0;
            while (true) {
                if (i4 >= q90VarArr.length) {
                    q90Var = null;
                    break;
                }
                if (q90VarArr[i4].b.equals(strSubstring)) {
                    q90Var = q90VarArr[i4];
                    break;
                }
                i4++;
            }
            if (q90Var == null) {
                li1.g("Missing profile key: ".concat(str));
                return null;
            }
            q90Var.d = jU;
            int[] iArrZ = z(byteArrayInputStream, iU);
            if (Arrays.equals(bArr, uz0.G)) {
                q90Var.e = iU;
                q90Var.h = iArrZ;
            }
        }
        return q90VarArr;
    }

    public static q90[] D(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, uz0.D)) {
            li1.g("Unsupported version");
            return null;
        }
        int iU = (int) cu.U(fileInputStream, 1);
        byte[] bArrT = cu.T(fileInputStream, (int) cu.U(fileInputStream, 4), (int) cu.U(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            li1.g("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrT);
        try {
            q90[] q90VarArrE = E(byteArrayInputStream, str, iU);
            byteArrayInputStream.close();
            return q90VarArrE;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static q90[] E(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new q90[0];
        }
        q90[] q90VarArr = new q90[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iU = (int) cu.U(byteArrayInputStream, 2);
            int iU2 = (int) cu.U(byteArrayInputStream, 2);
            q90VarArr[i4] = new q90(str, new String(cu.S(byteArrayInputStream, iU), StandardCharsets.UTF_8), cu.U(byteArrayInputStream, 4), iU2, (int) cu.U(byteArrayInputStream, 4), (int) cu.U(byteArrayInputStream, 4), new int[iU2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            q90 q90Var = q90VarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = q90Var.f;
            int i7 = q90Var.g;
            TreeMap treeMap = q90Var.i;
            int i8 = iAvailable - i6;
            int iU3 = i3;
            while (byteArrayInputStream.available() > i8) {
                iU3 += (int) cu.U(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iU3), 1);
                int iU4 = (int) cu.U(byteArrayInputStream, 2);
                while (iU4 > 0) {
                    cu.U(byteArrayInputStream, 2);
                    int iU5 = (int) cu.U(byteArrayInputStream, 1);
                    if (iU5 != 6 && iU5 != 7) {
                        while (iU5 > 0) {
                            cu.U(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iU6 = (int) cu.U(byteArrayInputStream, 1); iU6 > 0; iU6--) {
                                cu.U(byteArrayInputStream, 2);
                            }
                            iU5--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iU4--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                li1.g("Read too much data during profile line parse");
                return null;
            }
            q90Var.h = z(byteArrayInputStream, q90Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(cu.S(byteArrayInputStream, (((i7 << 1) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(numValueOf.intValue() | i14));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return q90VarArr;
    }

    public static final void F(m10 m10Var, Object obj) {
        if (!(m10Var instanceof ta0)) {
            m10Var.g(obj);
            return;
        }
        ta0 ta0Var = (ta0) m10Var;
        q20 q20Var = ta0Var.k;
        n10 n10Var = ta0Var.l;
        Throwable thA = e92.a(obj);
        Object mwVar = thA == null ? obj : new mw(thA, false);
        if (q20Var.f(n10Var.e())) {
            ta0Var.m = mwVar;
            ta0Var.j = 1;
            q20Var.e(n10Var.e(), ta0Var);
            return;
        }
        nh0 nh0VarA = fx2.a();
        if (nh0VarA.j >= 4294967296L) {
            ta0Var.m = mwVar;
            ta0Var.j = 1;
            nh0VarA.k(ta0Var);
            return;
        }
        nh0VarA.l(true);
        try {
            s01 s01Var = (s01) n10Var.e().m(c5.Z);
            if (s01Var == null || s01Var.b()) {
                Object obj2 = ta0Var.n;
                o20 o20VarE = n10Var.e();
                Object objE = ie1.E(o20VarE, obj2);
                g23 g23VarI = objE != ie1.u0 ? ou.I(n10Var, o20VarE, objE) : null;
                try {
                    n10Var.g(obj);
                    if (g23VarI == null || g23VarI.j0()) {
                        ie1.v(o20VarE, objE);
                    }
                } catch (Throwable th) {
                    if (g23VarI == null || g23VarI.j0()) {
                        ie1.v(o20VarE, objE);
                    }
                    throw th;
                }
            } else {
                ta0Var.g(m02.e(s01Var.o()));
            }
            while (nh0VarA.s()) {
            }
        } catch (Throwable th2) {
            try {
                ta0Var.i(th2);
            } finally {
                nh0VarA.j(true);
            }
        }
    }

    public static final void G(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final void H(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final String I(double d2) {
        return (d2 > 0.0d ? "+" : "").concat(t03.t(2, d2));
    }

    public static final rg1 J(rg1 rg1Var, k42 k42Var, dv2 dv2Var, ev2 ev2Var, a20 a20Var) {
        return rg1Var.c(new tt2(k42Var, dv2Var, ev2Var, a20Var));
    }

    public static boolean K(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, q90[] q90VarArr) throws IOException {
        int i2;
        int length;
        byte[] bArr2 = uz0.G;
        byte[] bArr3 = uz0.F;
        byte[] bArr4 = uz0.C;
        int i3 = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                cu.n0(byteArrayOutputStream2, q90VarArr.length);
                int i4 = 2;
                for (q90 q90Var : q90VarArr) {
                    cu.m0(byteArrayOutputStream2, q90Var.c, 4);
                    cu.m0(byteArrayOutputStream2, q90Var.d, 4);
                    cu.m0(byteArrayOutputStream2, q90Var.g, 4);
                    String strT = t(q90Var.a, q90Var.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strT.getBytes(charset).length;
                    cu.n0(byteArrayOutputStream2, length2);
                    i4 = i4 + 14 + length2;
                    byteArrayOutputStream2.write(strT.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i4 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
                }
                w93 w93Var = new w93(1, byteArray, false);
                byteArrayOutputStream2.close();
                arrayList.add(w93Var);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i5 = 0;
                int i6 = 0;
                while (i5 < q90VarArr.length) {
                    try {
                        q90 q90Var2 = q90VarArr[i5];
                        cu.n0(byteArrayOutputStream3, i5);
                        cu.n0(byteArrayOutputStream3, q90Var2.e);
                        i6 = i6 + 4 + (q90Var2.e << 1);
                        int[] iArr = q90Var2.h;
                        int length3 = iArr.length;
                        int i7 = i3;
                        while (i3 < length3) {
                            int i8 = iArr[i3];
                            cu.n0(byteArrayOutputStream3, i8 - i7);
                            i3++;
                            i7 = i8;
                        }
                        i5++;
                        i3 = 0;
                    } catch (Throwable th) {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                int i9 = 2;
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i6 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
                }
                w93 w93Var2 = new w93(3, byteArray2, true);
                byteArrayOutputStream3.close();
                arrayList.add(w93Var2);
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < q90VarArr.length) {
                    try {
                        q90 q90Var3 = q90VarArr[i10];
                        Iterator it = q90Var3.i.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                        try {
                            O(byteArrayOutputStream5, iIntValue, q90Var3);
                            byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                            byteArrayOutputStream5.close();
                            ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                            try {
                                P(byteArrayOutputStream6, q90Var3);
                                byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                                byteArrayOutputStream6.close();
                                cu.n0(byteArrayOutputStream4, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i11 + 6;
                                int i13 = i10;
                                cu.m0(byteArrayOutputStream4, length4, 4);
                                cu.n0(byteArrayOutputStream4, iIntValue);
                                byteArrayOutputStream4.write(byteArray3);
                                byteArrayOutputStream4.write(byteArray4);
                                i11 = i12 + length4;
                                i10 = i13 + 1;
                            } catch (Throwable th3) {
                                try {
                                    byteArrayOutputStream6.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                byteArrayOutputStream5.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            byteArrayOutputStream4.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
                if (i11 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                }
                w93 w93Var3 = new w93(4, byteArray5, true);
                byteArrayOutputStream4.close();
                arrayList.add(w93Var3);
                long size = 12 + ((long) (arrayList.size() << 4));
                cu.m0(byteArrayOutputStream, arrayList.size(), 4);
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    w93 w93Var4 = (w93) arrayList.get(i14);
                    int i15 = w93Var4.a;
                    byte[] bArr5 = w93Var4.b;
                    if (i15 == 1) {
                        i2 = 0;
                    } else if (i15 == i9) {
                        i2 = 1;
                    } else if (i15 == 3) {
                        i2 = 2;
                    } else if (i15 == 4) {
                        i2 = 3;
                    } else {
                        if (i15 != 5) {
                            throw null;
                        }
                        i2 = 4;
                    }
                    cu.m0(byteArrayOutputStream, i2, 4);
                    cu.m0(byteArrayOutputStream, size, 4);
                    if (w93Var4.c) {
                        long length5 = bArr5.length;
                        byte[] bArrY = cu.y(bArr5);
                        arrayList2.add(bArrY);
                        cu.m0(byteArrayOutputStream, bArrY.length, 4);
                        cu.m0(byteArrayOutputStream, length5, 4);
                        length = bArrY.length;
                    } else {
                        arrayList2.add(bArr5);
                        cu.m0(byteArrayOutputStream, bArr5.length, 4);
                        cu.m0(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += (long) length;
                    i14++;
                    i9 = 2;
                }
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i16));
                }
            } catch (Throwable th9) {
                try {
                    byteArrayOutputStream2.close();
                    throw th9;
                } catch (Throwable th10) {
                    th9.addSuppressed(th10);
                    throw th9;
                }
            }
        } else {
            byte[] bArr6 = uz0.D;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrO = o(q90VarArr, bArr6);
                cu.m0(byteArrayOutputStream, q90VarArr.length, 1);
                cu.m0(byteArrayOutputStream, bArrO.length, 4);
                byte[] bArrY2 = cu.y(bArrO);
                cu.m0(byteArrayOutputStream, bArrY2.length, 4);
                byteArrayOutputStream.write(bArrY2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                cu.m0(byteArrayOutputStream, q90VarArr.length, 1);
                for (q90 q90Var4 : q90VarArr) {
                    int size2 = q90Var4.i.size() << 2;
                    String strT2 = t(q90Var4.a, q90Var4.b, bArr3);
                    Charset charset2 = StandardCharsets.UTF_8;
                    cu.n0(byteArrayOutputStream, strT2.getBytes(charset2).length);
                    cu.n0(byteArrayOutputStream, q90Var4.h.length);
                    cu.m0(byteArrayOutputStream, size2, 4);
                    cu.m0(byteArrayOutputStream, q90Var4.c, 4);
                    byteArrayOutputStream.write(strT2.getBytes(charset2));
                    Iterator it2 = q90Var4.i.keySet().iterator();
                    while (it2.hasNext()) {
                        cu.n0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        cu.n0(byteArrayOutputStream, 0);
                    }
                    for (int i17 : q90Var4.h) {
                        cu.n0(byteArrayOutputStream, i17);
                    }
                }
            } else {
                byte[] bArr7 = uz0.E;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrO2 = o(q90VarArr, bArr7);
                    cu.m0(byteArrayOutputStream, q90VarArr.length, 1);
                    cu.m0(byteArrayOutputStream, bArrO2.length, 4);
                    byte[] bArrY3 = cu.y(bArrO2);
                    cu.m0(byteArrayOutputStream, bArrY3.length, 4);
                    byteArrayOutputStream.write(bArrY3);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                cu.n0(byteArrayOutputStream, q90VarArr.length);
                for (q90 q90Var5 : q90VarArr) {
                    String str = q90Var5.a;
                    TreeMap treeMap = q90Var5.i;
                    String strT3 = t(str, q90Var5.b, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    cu.n0(byteArrayOutputStream, strT3.getBytes(charset3).length);
                    cu.n0(byteArrayOutputStream, treeMap.size());
                    cu.n0(byteArrayOutputStream, q90Var5.h.length);
                    cu.m0(byteArrayOutputStream, q90Var5.c, 4);
                    byteArrayOutputStream.write(strT3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        cu.n0(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i18 : q90Var5.h) {
                        cu.n0(byteArrayOutputStream, i18);
                    }
                }
            }
        }
        return true;
    }

    public static final String L(int i2, String str) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    public static void M(ByteArrayOutputStream byteArrayOutputStream, q90 q90Var) throws IOException {
        P(byteArrayOutputStream, q90Var);
        int i2 = q90Var.g;
        int[] iArr = q90Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            cu.n0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 << 1) + 7) & (-8)) / 8];
        for (Map.Entry entry : q90Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) (bArr[i8] | (1 << (i7 % 8)));
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void N(ByteArrayOutputStream byteArrayOutputStream, q90 q90Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        cu.n0(byteArrayOutputStream, str.getBytes(charset).length);
        cu.n0(byteArrayOutputStream, q90Var.e);
        cu.m0(byteArrayOutputStream, q90Var.f, 4);
        cu.m0(byteArrayOutputStream, q90Var.c, 4);
        cu.m0(byteArrayOutputStream, q90Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void O(ByteArrayOutputStream byteArrayOutputStream, int i2, q90 q90Var) throws IOException {
        int i3 = q90Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : q90Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) (bArr[i7] | (1 << (i6 % 8)));
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void P(ByteArrayOutputStream byteArrayOutputStream, q90 q90Var) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : q90Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                cu.n0(byteArrayOutputStream, iIntValue - i2);
                cu.n0(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static final void a(i4 i4Var, String str, kp0 kp0Var, dr0 dr0Var, int i2) {
        dr0 dr0Var2;
        dr0Var.W(459197426);
        byte b2 = 2;
        int i3 = (dr0Var.f(i4Var) ? 4 : 2) | i2 | (dr0Var.f(str) ? 32 : 16) | (dr0Var.h(kp0Var) ? 256 : 128);
        if (dr0Var.N(i3 & 1, (i3 & 147) != 146)) {
            dr0Var2 = dr0Var;
            t03.d(yj2.a, null, null, null, dt.N(1808237668, new cc1(i4Var, kp0Var, str, b2), dr0Var), dr0Var2, 196614);
        } else {
            dr0Var2 = dr0Var;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new s62(i4Var, str, kp0Var, i2, (byte) 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0109  */
    /* JADX WARN: Code duplicated, block: B:101:0x010b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0117  */
    /* JADX WARN: Code duplicated, block: B:106:0x0133  */
    /* JADX WARN: Code duplicated, block: B:129:0x018f  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:135:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:137:0x0201  */
    /* JADX WARN: Code duplicated, block: B:140:0x020d  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0101  */
    /* JADX WARN: Code duplicated, block: B:97:0x0104  */
    /* JADX WARN: Code duplicated, block: B:98:0x0106  */
    public static final void b(final String str, final rg1 rg1Var, final xw2 xw2Var, int i2, boolean z2, final int i3, int i4, dr0 dr0Var, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zH;
        int i15;
        boolean z4;
        final int i16;
        final boolean z5;
        final int i17;
        e72 e72VarR;
        int i18;
        boolean z6;
        int i19;
        sm0 sm0Var;
        Executor executor;
        final sm0 sm0Var2;
        boolean z7;
        int length;
        int i20;
        dr0Var.W(-1040751001);
        if ((i5 & 6) == 0) {
            i7 = (dr0Var.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= dr0Var.f(rg1Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= dr0Var.f(xw2Var) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i7 |= dr0Var.h(null) ? 2048 : 1024;
        }
        int i21 = i6 & 16;
        if (i21 == 0) {
            if ((i5 & 24576) == 0) {
                i8 = i2;
                i7 |= dr0Var.d(i8) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
            }
            i9 = i6 & 32;
            if (i9 != 0) {
                if ((196608 & i5) == 0) {
                    z3 = z2;
                    if (dr0Var.g(z3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i7 |= i10;
                }
                if ((1572864 & i5) == 0) {
                    if (dr0Var.d(i3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i7 |= i20;
                }
                i11 = i6 & 128;
                if (i11 != 0) {
                    if ((12582912 & i5) == 0) {
                        i12 = i4;
                        if (dr0Var.d(i12)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i7 |= i13;
                    }
                    i14 = i7 | 100663296;
                    if ((i6 & 512) != 0) {
                        i14 = i7 | 905969664;
                    } else if ((805306368 & i5) == 0) {
                        if ((1073741824 & i5) == 0) {
                            zH = dr0Var.f(null);
                        } else {
                            zH = dr0Var.h(null);
                        }
                        if (zH) {
                            i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                        } else {
                            i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                        i14 |= i15;
                    }
                    if ((i14 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dr0Var.N(i14 & 1, z4)) {
                        i18 = i21 == 0 ? i8 : 1;
                        if (i9 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i11 != 0) {
                            i19 = 1;
                        } else {
                            i19 = i12;
                        }
                        vs.V(i19, i3);
                        if (dr0Var.j(og2.a) == null) {
                            li1.c();
                            return;
                        }
                        dr0Var.V(357055103);
                        dr0Var.p(false);
                        sm0Var = (sm0) dr0Var.j(uz.k);
                        executor = (Executor) dr0Var.j(ll.a);
                        if (executor != null || (length = str.length()) < 8 || length >= 1000) {
                            sm0Var2 = sm0Var;
                            z7 = false;
                            dr0Var.V(-1248455541);
                            dr0Var.p(false);
                        } else {
                            Boolean boolValueOf = ll.b;
                            if (boolValueOf == null) {
                                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                                ll.b = boolValueOf;
                            }
                            if (boolValueOf.booleanValue()) {
                                dr0Var.V(-1250263182);
                                final u31 u31Var = (u31) dr0Var.j(uz.n);
                                final e90 e90Var = (e90) dr0Var.j(uz.h);
                                try {
                                    sm0Var2 = sm0Var;
                                    final boolean z8 = z6;
                                    try {
                                        z6 = z8;
                                        try {
                                            executor.execute(new Runnable() { // from class: kl
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    rj1 rj1VarC;
                                                    xw2 xw2Var2 = xw2Var;
                                                    u31 u31Var2 = u31Var;
                                                    String str2 = str;
                                                    e90 e90Var2 = e90Var;
                                                    sm0 sm0Var3 = sm0Var2;
                                                    boolean z9 = z8;
                                                    Trace.beginSection("BackgroundTextMeasurement");
                                                    try {
                                                        uk2 uk2VarH = bl2.h();
                                                        rj1 rj1Var = uk2VarH instanceof rj1 ? (rj1) uk2VarH : null;
                                                        if (rj1Var == null || (rj1VarC = rj1Var.C(null, null)) == null) {
                                                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                                        }
                                                        try {
                                                            uk2 uk2VarJ = rj1VarC.j();
                                                            try {
                                                                xw2 xw2VarH = p02.H(xw2Var2, u31Var2);
                                                                ag0 ag0Var = ag0.h;
                                                                k9 k9Var = new k9(str2, xw2VarH, ag0Var, ag0Var, sm0Var3, e90Var2, z9);
                                                                k9Var.p.c();
                                                                k9Var.b();
                                                                uk2.q(uk2VarJ);
                                                                rj1VarC.w().e();
                                                                rj1VarC.c();
                                                                Trace.endSection();
                                                            } catch (Throwable th) {
                                                                uk2.q(uk2VarJ);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th2) {
                                                            try {
                                                                throw th2;
                                                            } catch (Throwable th3) {
                                                                rj1VarC.c();
                                                                throw th3;
                                                            }
                                                        }
                                                    } catch (Throwable th4) {
                                                        Trace.endSection();
                                                        throw th4;
                                                    }
                                                }
                                            });
                                        } catch (RejectedExecutionException unused) {
                                        }
                                    } catch (RejectedExecutionException unused2) {
                                        z6 = z8;
                                    }
                                } catch (RejectedExecutionException unused3) {
                                    sm0Var2 = sm0Var;
                                }
                                z7 = false;
                                dr0Var.p(false);
                            } else {
                                sm0Var2 = sm0Var;
                                z7 = false;
                                dr0Var.V(-1248455541);
                                dr0Var.p(false);
                            }
                        }
                        dr0Var.V(358076243);
                        dr0Var.p(z7);
                        rg1 rg1VarC = rg1Var.c(new tw2(str, xw2Var, sm0Var2, i18, z6, i3, i19));
                        c8 c8Var = c8.e;
                        int iHashCode = Long.hashCode(dr0Var.T);
                        rg1 rg1VarU = ls.U(dr0Var, rg1VarC);
                        dx1 dx1VarL = dr0Var.l();
                        sy.f.getClass();
                        dr0Var.Y();
                        if (dr0Var.S) {
                            dr0Var.k(l41.W);
                        } else {
                            dr0Var.i0();
                        }
                        h12.y(c5.F, dr0Var, c8Var);
                        h12.y(c5.E, dr0Var, dx1VarL);
                        h12.t(dr0Var);
                        h12.y(c5.D, dr0Var, rg1VarU);
                        h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
                        dr0Var.p(true);
                        i16 = i18;
                        z5 = z6;
                        i17 = i19;
                    } else {
                        dr0Var.Q();
                        i16 = i8;
                        z5 = z3;
                        i17 = i12;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: jl
                            @Override // defpackage.zp0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = m02.A(i5 | 1);
                                String str2 = str;
                                rg1 rg1Var2 = rg1Var;
                                xw2 xw2Var2 = xw2Var;
                                boolean z9 = i16;
                                boolean z10 = z5;
                                int i22 = i3;
                                boolean z11 = i17;
                                tz0.b(str2, rg1Var2, xw2Var2, z9 ? 1 : 0, z10, i22, z11 ? 1 : 0, (dr0) obj, iA, i6);
                                return j23.a;
                            }
                        };
                    }
                }
                i7 |= 12582912;
                i12 = i4;
                i14 = i7 | 100663296;
                if ((i6 & 512) != 0) {
                    i14 = i7 | 905969664;
                } else if ((805306368 & i5) == 0) {
                    if ((1073741824 & i5) == 0) {
                        zH = dr0Var.f(null);
                    } else {
                        zH = dr0Var.h(null);
                    }
                    if (zH) {
                        i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                    } else {
                        i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i14 |= i15;
                }
                if ((i14 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dr0Var.N(i14 & 1, z4)) {
                    if (i21 == 0) {
                    }
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i11 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i12;
                    }
                    vs.V(i19, i3);
                    if (dr0Var.j(og2.a) == null) {
                        li1.c();
                        return;
                    }
                    dr0Var.V(357055103);
                    dr0Var.p(false);
                    sm0Var = (sm0) dr0Var.j(uz.k);
                    executor = (Executor) dr0Var.j(ll.a);
                    if (executor != null) {
                        sm0Var2 = sm0Var;
                        z7 = false;
                        dr0Var.V(-1248455541);
                        dr0Var.p(false);
                    } else {
                        sm0Var2 = sm0Var;
                        z7 = false;
                        dr0Var.V(-1248455541);
                        dr0Var.p(false);
                    }
                    dr0Var.V(358076243);
                    dr0Var.p(z7);
                    rg1 rg1VarC2 = rg1Var.c(new tw2(str, xw2Var, sm0Var2, i18, z6, i3, i19));
                    c8 c8Var2 = c8.e;
                    int iHashCode2 = Long.hashCode(dr0Var.T);
                    rg1 rg1VarU2 = ls.U(dr0Var, rg1VarC2);
                    dx1 dx1VarL2 = dr0Var.l();
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(l41.W);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, c8Var2);
                    h12.y(c5.E, dr0Var, dx1VarL2);
                    h12.t(dr0Var);
                    h12.y(c5.D, dr0Var, rg1VarU2);
                    h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode2));
                    dr0Var.p(true);
                    i16 = i18;
                    z5 = z6;
                    i17 = i19;
                } else {
                    dr0Var.Q();
                    i16 = i8;
                    z5 = z3;
                    i17 = i12;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: jl
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i5 | 1);
                            String str2 = str;
                            rg1 rg1Var2 = rg1Var;
                            xw2 xw2Var2 = xw2Var;
                            boolean z9 = i16;
                            boolean z10 = z5;
                            int i22 = i3;
                            boolean z11 = i17;
                            tz0.b(str2, rg1Var2, xw2Var2, z9 ? 1 : 0, z10, i22, z11 ? 1 : 0, (dr0) obj, iA, i6);
                            return j23.a;
                        }
                    };
                }
            }
            i7 |= 196608;
            z3 = z2;
            if ((1572864 & i5) == 0) {
                if (dr0Var.d(i3)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i7 |= i20;
            }
            i11 = i6 & 128;
            if (i11 != 0) {
                if ((12582912 & i5) == 0) {
                    i12 = i4;
                    if (dr0Var.d(i12)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i7 |= i13;
                }
                i14 = i7 | 100663296;
                if ((i6 & 512) != 0) {
                    i14 = i7 | 905969664;
                } else if ((805306368 & i5) == 0) {
                    if ((1073741824 & i5) == 0) {
                        zH = dr0Var.f(null);
                    } else {
                        zH = dr0Var.h(null);
                    }
                    if (zH) {
                        i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                    } else {
                        i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i14 |= i15;
                }
                if ((i14 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dr0Var.N(i14 & 1, z4)) {
                    if (i21 == 0) {
                    }
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i11 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i12;
                    }
                    vs.V(i19, i3);
                    if (dr0Var.j(og2.a) == null) {
                        li1.c();
                        return;
                    }
                    dr0Var.V(357055103);
                    dr0Var.p(false);
                    sm0Var = (sm0) dr0Var.j(uz.k);
                    executor = (Executor) dr0Var.j(ll.a);
                    if (executor != null) {
                        sm0Var2 = sm0Var;
                        z7 = false;
                        dr0Var.V(-1248455541);
                        dr0Var.p(false);
                    } else {
                        sm0Var2 = sm0Var;
                        z7 = false;
                        dr0Var.V(-1248455541);
                        dr0Var.p(false);
                    }
                    dr0Var.V(358076243);
                    dr0Var.p(z7);
                    rg1 rg1VarC3 = rg1Var.c(new tw2(str, xw2Var, sm0Var2, i18, z6, i3, i19));
                    c8 c8Var3 = c8.e;
                    int iHashCode3 = Long.hashCode(dr0Var.T);
                    rg1 rg1VarU3 = ls.U(dr0Var, rg1VarC3);
                    dx1 dx1VarL3 = dr0Var.l();
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(l41.W);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, c8Var3);
                    h12.y(c5.E, dr0Var, dx1VarL3);
                    h12.t(dr0Var);
                    h12.y(c5.D, dr0Var, rg1VarU3);
                    h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode3));
                    dr0Var.p(true);
                    i16 = i18;
                    z5 = z6;
                    i17 = i19;
                } else {
                    dr0Var.Q();
                    i16 = i8;
                    z5 = z3;
                    i17 = i12;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: jl
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i5 | 1);
                            String str2 = str;
                            rg1 rg1Var2 = rg1Var;
                            xw2 xw2Var2 = xw2Var;
                            boolean z9 = i16;
                            boolean z10 = z5;
                            int i22 = i3;
                            boolean z11 = i17;
                            tz0.b(str2, rg1Var2, xw2Var2, z9 ? 1 : 0, z10, i22, z11 ? 1 : 0, (dr0) obj, iA, i6);
                            return j23.a;
                        }
                    };
                }
            }
            i7 |= 12582912;
            i12 = i4;
            i14 = i7 | 100663296;
            if ((i6 & 512) != 0) {
                i14 = i7 | 905969664;
            } else if ((805306368 & i5) == 0) {
                if ((1073741824 & i5) == 0) {
                    zH = dr0Var.f(null);
                } else {
                    zH = dr0Var.h(null);
                }
                if (zH) {
                    i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                } else {
                    i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i14 |= i15;
            }
            if ((i14 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dr0Var.N(i14 & 1, z4)) {
                if (i21 == 0) {
                }
                if (i9 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i11 != 0) {
                    i19 = 1;
                } else {
                    i19 = i12;
                }
                vs.V(i19, i3);
                if (dr0Var.j(og2.a) == null) {
                    li1.c();
                    return;
                }
                dr0Var.V(357055103);
                dr0Var.p(false);
                sm0Var = (sm0) dr0Var.j(uz.k);
                executor = (Executor) dr0Var.j(ll.a);
                if (executor != null) {
                    sm0Var2 = sm0Var;
                    z7 = false;
                    dr0Var.V(-1248455541);
                    dr0Var.p(false);
                } else {
                    sm0Var2 = sm0Var;
                    z7 = false;
                    dr0Var.V(-1248455541);
                    dr0Var.p(false);
                }
                dr0Var.V(358076243);
                dr0Var.p(z7);
                rg1 rg1VarC4 = rg1Var.c(new tw2(str, xw2Var, sm0Var2, i18, z6, i3, i19));
                c8 c8Var4 = c8.e;
                int iHashCode4 = Long.hashCode(dr0Var.T);
                rg1 rg1VarU4 = ls.U(dr0Var, rg1VarC4);
                dx1 dx1VarL4 = dr0Var.l();
                sy.f.getClass();
                dr0Var.Y();
                if (dr0Var.S) {
                    dr0Var.k(l41.W);
                } else {
                    dr0Var.i0();
                }
                h12.y(c5.F, dr0Var, c8Var4);
                h12.y(c5.E, dr0Var, dx1VarL4);
                h12.t(dr0Var);
                h12.y(c5.D, dr0Var, rg1VarU4);
                h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode4));
                dr0Var.p(true);
                i16 = i18;
                z5 = z6;
                i17 = i19;
            } else {
                dr0Var.Q();
                i16 = i8;
                z5 = z3;
                i17 = i12;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: jl
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = m02.A(i5 | 1);
                        String str2 = str;
                        rg1 rg1Var2 = rg1Var;
                        xw2 xw2Var2 = xw2Var;
                        boolean z9 = i16;
                        boolean z10 = z5;
                        int i22 = i3;
                        boolean z11 = i17;
                        tz0.b(str2, rg1Var2, xw2Var2, z9 ? 1 : 0, z10, i22, z11 ? 1 : 0, (dr0) obj, iA, i6);
                        return j23.a;
                    }
                };
            }
        }
        i7 |= 24576;
        i8 = i2;
        i9 = i6 & 32;
        if (i9 != 0) {
            if ((196608 & i5) == 0) {
                z3 = z2;
                if (dr0Var.g(z3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i7 |= i10;
            }
            if ((1572864 & i5) == 0) {
                if (dr0Var.d(i3)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i7 |= i20;
            }
            i11 = i6 & 128;
            if (i11 != 0) {
                if ((12582912 & i5) == 0) {
                    i12 = i4;
                    if (dr0Var.d(i12)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i7 |= i13;
                }
                i14 = i7 | 100663296;
                if ((i6 & 512) != 0) {
                    i14 = i7 | 905969664;
                } else if ((805306368 & i5) == 0) {
                    if ((1073741824 & i5) == 0) {
                        zH = dr0Var.f(null);
                    } else {
                        zH = dr0Var.h(null);
                    }
                    if (zH) {
                        i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                    } else {
                        i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i14 |= i15;
                }
                if ((i14 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dr0Var.N(i14 & 1, z4)) {
                    if (i21 == 0) {
                    }
                    if (i9 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i11 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i12;
                    }
                    vs.V(i19, i3);
                    if (dr0Var.j(og2.a) == null) {
                        li1.c();
                        return;
                    }
                    dr0Var.V(357055103);
                    dr0Var.p(false);
                    sm0Var = (sm0) dr0Var.j(uz.k);
                    executor = (Executor) dr0Var.j(ll.a);
                    if (executor != null) {
                        sm0Var2 = sm0Var;
                        z7 = false;
                        dr0Var.V(-1248455541);
                        dr0Var.p(false);
                    } else {
                        sm0Var2 = sm0Var;
                        z7 = false;
                        dr0Var.V(-1248455541);
                        dr0Var.p(false);
                    }
                    dr0Var.V(358076243);
                    dr0Var.p(z7);
                    rg1 rg1VarC5 = rg1Var.c(new tw2(str, xw2Var, sm0Var2, i18, z6, i3, i19));
                    c8 c8Var5 = c8.e;
                    int iHashCode5 = Long.hashCode(dr0Var.T);
                    rg1 rg1VarU5 = ls.U(dr0Var, rg1VarC5);
                    dx1 dx1VarL5 = dr0Var.l();
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(l41.W);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, c8Var5);
                    h12.y(c5.E, dr0Var, dx1VarL5);
                    h12.t(dr0Var);
                    h12.y(c5.D, dr0Var, rg1VarU5);
                    h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode5));
                    dr0Var.p(true);
                    i16 = i18;
                    z5 = z6;
                    i17 = i19;
                } else {
                    dr0Var.Q();
                    i16 = i8;
                    z5 = z3;
                    i17 = i12;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: jl
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i5 | 1);
                            String str2 = str;
                            rg1 rg1Var2 = rg1Var;
                            xw2 xw2Var2 = xw2Var;
                            boolean z9 = i16;
                            boolean z10 = z5;
                            int i22 = i3;
                            boolean z11 = i17;
                            tz0.b(str2, rg1Var2, xw2Var2, z9 ? 1 : 0, z10, i22, z11 ? 1 : 0, (dr0) obj, iA, i6);
                            return j23.a;
                        }
                    };
                }
            }
            i7 |= 12582912;
            i12 = i4;
            i14 = i7 | 100663296;
            if ((i6 & 512) != 0) {
                i14 = i7 | 905969664;
            } else if ((805306368 & i5) == 0) {
                if ((1073741824 & i5) == 0) {
                    zH = dr0Var.f(null);
                } else {
                    zH = dr0Var.h(null);
                }
                if (zH) {
                    i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                } else {
                    i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i14 |= i15;
            }
            if ((i14 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dr0Var.N(i14 & 1, z4)) {
                if (i21 == 0) {
                }
                if (i9 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i11 != 0) {
                    i19 = 1;
                } else {
                    i19 = i12;
                }
                vs.V(i19, i3);
                if (dr0Var.j(og2.a) == null) {
                    li1.c();
                    return;
                }
                dr0Var.V(357055103);
                dr0Var.p(false);
                sm0Var = (sm0) dr0Var.j(uz.k);
                executor = (Executor) dr0Var.j(ll.a);
                if (executor != null) {
                    sm0Var2 = sm0Var;
                    z7 = false;
                    dr0Var.V(-1248455541);
                    dr0Var.p(false);
                } else {
                    sm0Var2 = sm0Var;
                    z7 = false;
                    dr0Var.V(-1248455541);
                    dr0Var.p(false);
                }
                dr0Var.V(358076243);
                dr0Var.p(z7);
                rg1 rg1VarC6 = rg1Var.c(new tw2(str, xw2Var, sm0Var2, i18, z6, i3, i19));
                c8 c8Var6 = c8.e;
                int iHashCode6 = Long.hashCode(dr0Var.T);
                rg1 rg1VarU6 = ls.U(dr0Var, rg1VarC6);
                dx1 dx1VarL6 = dr0Var.l();
                sy.f.getClass();
                dr0Var.Y();
                if (dr0Var.S) {
                    dr0Var.k(l41.W);
                } else {
                    dr0Var.i0();
                }
                h12.y(c5.F, dr0Var, c8Var6);
                h12.y(c5.E, dr0Var, dx1VarL6);
                h12.t(dr0Var);
                h12.y(c5.D, dr0Var, rg1VarU6);
                h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode6));
                dr0Var.p(true);
                i16 = i18;
                z5 = z6;
                i17 = i19;
            } else {
                dr0Var.Q();
                i16 = i8;
                z5 = z3;
                i17 = i12;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: jl
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = m02.A(i5 | 1);
                        String str2 = str;
                        rg1 rg1Var2 = rg1Var;
                        xw2 xw2Var2 = xw2Var;
                        boolean z9 = i16;
                        boolean z10 = z5;
                        int i22 = i3;
                        boolean z11 = i17;
                        tz0.b(str2, rg1Var2, xw2Var2, z9 ? 1 : 0, z10, i22, z11 ? 1 : 0, (dr0) obj, iA, i6);
                        return j23.a;
                    }
                };
            }
        }
        i7 |= 196608;
        z3 = z2;
        if ((1572864 & i5) == 0) {
            if (dr0Var.d(i3)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i7 |= i20;
        }
        i11 = i6 & 128;
        if (i11 != 0) {
            if ((12582912 & i5) == 0) {
                i12 = i4;
                if (dr0Var.d(i12)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i7 |= i13;
            }
            i14 = i7 | 100663296;
            if ((i6 & 512) != 0) {
                i14 = i7 | 905969664;
            } else if ((805306368 & i5) == 0) {
                if ((1073741824 & i5) == 0) {
                    zH = dr0Var.f(null);
                } else {
                    zH = dr0Var.h(null);
                }
                if (zH) {
                    i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                } else {
                    i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i14 |= i15;
            }
            if ((i14 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dr0Var.N(i14 & 1, z4)) {
                if (i21 == 0) {
                }
                if (i9 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i11 != 0) {
                    i19 = 1;
                } else {
                    i19 = i12;
                }
                vs.V(i19, i3);
                if (dr0Var.j(og2.a) == null) {
                    li1.c();
                    return;
                }
                dr0Var.V(357055103);
                dr0Var.p(false);
                sm0Var = (sm0) dr0Var.j(uz.k);
                executor = (Executor) dr0Var.j(ll.a);
                if (executor != null) {
                    sm0Var2 = sm0Var;
                    z7 = false;
                    dr0Var.V(-1248455541);
                    dr0Var.p(false);
                } else {
                    sm0Var2 = sm0Var;
                    z7 = false;
                    dr0Var.V(-1248455541);
                    dr0Var.p(false);
                }
                dr0Var.V(358076243);
                dr0Var.p(z7);
                rg1 rg1VarC7 = rg1Var.c(new tw2(str, xw2Var, sm0Var2, i18, z6, i3, i19));
                c8 c8Var7 = c8.e;
                int iHashCode7 = Long.hashCode(dr0Var.T);
                rg1 rg1VarU7 = ls.U(dr0Var, rg1VarC7);
                dx1 dx1VarL7 = dr0Var.l();
                sy.f.getClass();
                dr0Var.Y();
                if (dr0Var.S) {
                    dr0Var.k(l41.W);
                } else {
                    dr0Var.i0();
                }
                h12.y(c5.F, dr0Var, c8Var7);
                h12.y(c5.E, dr0Var, dx1VarL7);
                h12.t(dr0Var);
                h12.y(c5.D, dr0Var, rg1VarU7);
                h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode7));
                dr0Var.p(true);
                i16 = i18;
                z5 = z6;
                i17 = i19;
            } else {
                dr0Var.Q();
                i16 = i8;
                z5 = z3;
                i17 = i12;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: jl
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = m02.A(i5 | 1);
                        String str2 = str;
                        rg1 rg1Var2 = rg1Var;
                        xw2 xw2Var2 = xw2Var;
                        boolean z9 = i16;
                        boolean z10 = z5;
                        int i22 = i3;
                        boolean z11 = i17;
                        tz0.b(str2, rg1Var2, xw2Var2, z9 ? 1 : 0, z10, i22, z11 ? 1 : 0, (dr0) obj, iA, i6);
                        return j23.a;
                    }
                };
            }
        }
        i7 |= 12582912;
        i12 = i4;
        i14 = i7 | 100663296;
        if ((i6 & 512) != 0) {
            i14 = i7 | 905969664;
        } else if ((805306368 & i5) == 0) {
            if ((1073741824 & i5) == 0) {
                zH = dr0Var.f(null);
            } else {
                zH = dr0Var.h(null);
            }
            if (zH) {
                i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
            } else {
                i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i14 |= i15;
        }
        if ((i14 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (dr0Var.N(i14 & 1, z4)) {
            if (i21 == 0) {
            }
            if (i9 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            if (i11 != 0) {
                i19 = 1;
            } else {
                i19 = i12;
            }
            vs.V(i19, i3);
            if (dr0Var.j(og2.a) == null) {
                li1.c();
                return;
            }
            dr0Var.V(357055103);
            dr0Var.p(false);
            sm0Var = (sm0) dr0Var.j(uz.k);
            executor = (Executor) dr0Var.j(ll.a);
            if (executor != null) {
                sm0Var2 = sm0Var;
                z7 = false;
                dr0Var.V(-1248455541);
                dr0Var.p(false);
            } else {
                sm0Var2 = sm0Var;
                z7 = false;
                dr0Var.V(-1248455541);
                dr0Var.p(false);
            }
            dr0Var.V(358076243);
            dr0Var.p(z7);
            rg1 rg1VarC8 = rg1Var.c(new tw2(str, xw2Var, sm0Var2, i18, z6, i3, i19));
            c8 c8Var8 = c8.e;
            int iHashCode8 = Long.hashCode(dr0Var.T);
            rg1 rg1VarU8 = ls.U(dr0Var, rg1VarC8);
            dx1 dx1VarL8 = dr0Var.l();
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, c8Var8);
            h12.y(c5.E, dr0Var, dx1VarL8);
            h12.t(dr0Var);
            h12.y(c5.D, dr0Var, rg1VarU8);
            h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode8));
            dr0Var.p(true);
            i16 = i18;
            z5 = z6;
            i17 = i19;
        } else {
            dr0Var.Q();
            i16 = i8;
            z5 = z3;
            i17 = i12;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: jl
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(i5 | 1);
                    String str2 = str;
                    rg1 rg1Var2 = rg1Var;
                    xw2 xw2Var2 = xw2Var;
                    boolean z9 = i16;
                    boolean z10 = z5;
                    int i22 = i3;
                    boolean z11 = i17;
                    tz0.b(str2, rg1Var2, xw2Var2, z9 ? 1 : 0, z10, i22, z11 ? 1 : 0, (dr0) obj, iA, i6);
                    return j23.a;
                }
            };
        }
    }

    public static final j90 c(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        ln0 ln0VarA = mn0.a(f2);
        if (ln0VarA == null) {
            ln0VarA = new y91(f2);
        }
        return new j90(f3, f2, ln0VarA);
    }

    public static qi2 d(int i2, dp dpVar) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        int i4 = (i2 & 2) == 0 ? 16 : 0;
        if (i3 <= 0 && i4 <= 0 && dpVar != dp.h) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + dpVar).toString());
        }
        int i5 = i4 + i3;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new qi2(i3, i5, dpVar);
    }

    public static final void e(rg1 rg1Var, zp0 zp0Var, dr0 dr0Var, int i2) {
        dr0Var.W(-1298353104);
        int i3 = i2 | 6 | (dr0Var.h(zp0Var) ? 32 : 16);
        byte b2 = 1;
        if (dr0Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new zo2(c5.g0);
                dr0Var.f0(objK);
            }
            og1 og1Var = og1.h;
            f((zo2) objK, og1Var, zp0Var, dr0Var, (i3 << 3) & 1008);
            rg1Var = og1Var;
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new x7(rg1Var, zp0Var, i2, b2);
        }
    }

    public static final void f(zo2 zo2Var, rg1 rg1Var, zp0 zp0Var, dr0 dr0Var, int i2) {
        int i3;
        dr0Var.W(-511989831);
        if ((i2 & 6) == 0) {
            i3 = (dr0Var.h(zo2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dr0Var.f(rg1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dr0Var.h(zp0Var) ? 256 : 128;
        }
        if (dr0Var.N(i3 & 1, (i3 & 147) != 146)) {
            int iHashCode = Long.hashCode(dr0Var.T);
            br0 br0VarC0 = lt.c0(dr0Var);
            rg1 rg1VarU = ls.U(dr0Var, rg1Var);
            dx1 dx1VarL = dr0Var.l();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(zo2Var.c, dr0Var, zo2Var);
            h12.y(zo2Var.d, dr0Var, br0VarC0);
            h12.y(zo2Var.e, dr0Var, zp0Var);
            sy.f.getClass();
            h12.y(c5.E, dr0Var, dx1VarL);
            h12.t(dr0Var);
            h12.y(c5.D, dr0Var, rg1VarU);
            h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
            dr0Var.p(true);
            if (dr0Var.z()) {
                dr0Var.V(-1259187287);
                dr0Var.p(false);
            } else {
                dr0Var.V(-1259245908);
                boolean zH = dr0Var.h(zo2Var);
                Object objK = dr0Var.K();
                if (zH || objK == zy.a) {
                    objK = new xu1(zo2Var, (byte) 13);
                    dr0Var.f0(objK);
                }
                h7.S((kp0) objK, dr0Var);
                dr0Var.p(false);
            }
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha((Object) zo2Var, (Object) rg1Var, (hq0) zp0Var, i2, (byte) 12);
        }
    }

    public static final void g(List list, dr0 dr0Var, int i2) {
        dr0Var.W(-1449946891);
        int i3 = (dr0Var.f(list) ? 4 : 2) | i2;
        if (dr0Var.N(i3 & 1, (i3 & 3) != 2)) {
            List listO0 = dv.O0(90, dv.M0(list, new mm0((byte) 14)));
            List<t63> listM0 = dv.M0(listO0, new mm0((byte) 16));
            ArrayList arrayList = new ArrayList(ev.o0(listM0, 10));
            for (t63 t63Var : listM0) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listM0) {
                    t63 t63Var2 = (t63) obj;
                    if (!t63Var2.a.isAfter(t63Var.a) && t63Var2.a.isAfter(t63Var.a.minusDays(7L))) {
                        arrayList2.add(obj);
                    }
                }
                LocalDate localDate = t63Var.a;
                int size = arrayList2.size();
                double d2 = 0.0d;
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    d2 += ((t63) obj2).b;
                }
                arrayList.add(new t63(localDate, d2 / ((double) arrayList2.size())));
            }
            Iterator it = listO0.iterator();
            if (!it.hasNext()) {
                wg.p();
                return;
            }
            double dMin = ((t63) it.next()).b;
            while (it.hasNext()) {
                dMin = Math.min(dMin, ((t63) it.next()).b);
            }
            final double d3 = dMin - 0.5d;
            Iterator it2 = listO0.iterator();
            if (!it2.hasNext()) {
                wg.p();
                return;
            }
            double dMax = ((t63) it2.next()).b;
            while (it2.hasNext()) {
                dMax = Math.max(dMax, ((t63) it2.next()).b);
            }
            double d4 = dMax + 0.5d;
            final LocalDate localDate2 = ((t63) dv.x0(listO0)).a;
            long jBetween = ChronoUnit.DAYS.between(localDate2, ((t63) dv.F0(listO0)).a);
            final long j2 = jBetween >= 1 ? jBetween : 1L;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : listO0) {
                List list2 = listO0;
                ArrayList arrayList4 = arrayList;
                double d5 = d4;
                if (((t63) obj3).a.isAfter(LocalDate.now().minusDays(28L))) {
                    arrayList3.add(obj3);
                }
                listO0 = list2;
                d4 = d5;
                arrayList = arrayList4;
            }
            final List list3 = listO0;
            final ArrayList arrayList5 = arrayList;
            final double d6 = d4;
            Double dF = y02.F(arrayList3);
            final String str = "体重趋势：最近 " + t03.t(1, ((t63) dv.F0(arrayList5)).b) + " kg（7 日平均）" + (dF != null ? wi0.h("，近 4 周每周 ", I(dF.doubleValue()), " kg") : "");
            ie0 ie0Var = rv.a;
            final long j3 = ((pv) dr0Var.j(ie0Var)).A;
            final long j4 = ((pv) dr0Var.j(ie0Var)).a;
            t03.d(yj2.a, null, null, null, dt.N(-1043271485, new aq0() { // from class: b73
                @Override // defpackage.aq0
                public final Object c(Object obj4, Object obj5, Object obj6) {
                    boolean z2;
                    boolean z3;
                    dr0 dr0Var2 = (dr0) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    ((bw) obj4).getClass();
                    if (dr0Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        rg1 rg1VarG = t03.G(og1.h, 16.0f);
                        aw awVarA = yv.a(new ah(4.0f, new wg((byte) 0)), c5.u, dr0Var2, 6);
                        int iHashCode = Long.hashCode(dr0Var2.T);
                        dx1 dx1VarL = dr0Var2.l();
                        rg1 rg1VarU = ls.U(dr0Var2, rg1VarG);
                        sy.f.getClass();
                        dr0Var2.Y();
                        if (dr0Var2.S) {
                            dr0Var2.k(l41.W);
                        } else {
                            dr0Var2.i0();
                        }
                        h12.y(c5.F, dr0Var2, awVarA);
                        h12.y(c5.E, dr0Var2, dx1VarL);
                        h12.y(c5.G, dr0Var2, Integer.valueOf(iHashCode));
                        h12.t(dr0Var2);
                        h12.y(c5.D, dr0Var2, rg1VarU);
                        ie0 ie0Var2 = e13.a;
                        xw2 xw2Var = ((c13) dr0Var2.j(ie0Var2)).k;
                        String str2 = str;
                        gw2.b(str2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, xw2Var, dr0Var2, 0, 0, 131070);
                        rg1 rg1VarB = yj2.b(yj2.a, 180.0f);
                        boolean zF = dr0Var2.f(str2);
                        Object objK = dr0Var2.K();
                        yy yyVar = zy.a;
                        if (zF || objK == yyVar) {
                            objK = new q63(str2, (byte) 2);
                            dr0Var2.f0(objK);
                        }
                        rg1 rg1VarA = tg2.a(rg1VarB, false, (vp0) objK);
                        final LocalDate localDate3 = localDate2;
                        boolean zH = dr0Var2.h(localDate3);
                        final long j5 = j2;
                        boolean zE = zH | dr0Var2.e(j5);
                        Object objC = dr0Var2.C();
                        boolean z4 = objC instanceof Double;
                        final double d7 = d3;
                        if (z4 && d7 == ((Number) objC).doubleValue()) {
                            z2 = false;
                        } else {
                            dr0Var2.g0(Double.valueOf(d7));
                            z2 = true;
                        }
                        boolean z5 = zE | z2;
                        Object objC2 = dr0Var2.C();
                        boolean z6 = objC2 instanceof Double;
                        final double d8 = d6;
                        if (z6 && d8 == ((Number) objC2).doubleValue()) {
                            z3 = false;
                        } else {
                            dr0Var2.g0(Double.valueOf(d8));
                            z3 = true;
                        }
                        final List list4 = list3;
                        boolean zH2 = z5 | z3 | dr0Var2.h(list4);
                        final long j6 = j3;
                        boolean zE2 = zH2 | dr0Var2.e(j6);
                        final ArrayList arrayList6 = arrayList5;
                        boolean zH3 = zE2 | dr0Var2.h(arrayList6);
                        final long j7 = j4;
                        boolean zE3 = zH3 | dr0Var2.e(j7);
                        Object objK2 = dr0Var2.K();
                        if (zE3 || objK2 == yyVar) {
                            vp0 vp0Var = new vp0() { // from class: w63
                                @Override // defpackage.vp0
                                public final Object h(Object obj7) {
                                    LocalDate localDate4;
                                    long j8;
                                    double d9;
                                    double d10;
                                    td0 td0Var = (td0) obj7;
                                    td0Var.getClass();
                                    Iterator it3 = list4.iterator();
                                    while (true) {
                                        boolean zHasNext = it3.hasNext();
                                        localDate4 = localDate3;
                                        j8 = j5;
                                        d9 = d7;
                                        d10 = d8;
                                        if (!zHasNext) {
                                            break;
                                        }
                                        td0.e0(td0Var, j6, td0Var.A(4.0f), tz0.h(td0Var, localDate4, j8, d9, d10, (t63) it3.next()), 120);
                                    }
                                    l9 l9VarA = n9.a();
                                    ArrayList arrayList7 = arrayList6;
                                    int size2 = arrayList7.size();
                                    int i5 = 0;
                                    int i6 = 0;
                                    while (i5 < size2) {
                                        Object obj8 = arrayList7.get(i5);
                                        int i7 = i5 + 1;
                                        int i8 = i6 + 1;
                                        if (i6 < 0) {
                                            lt.h0();
                                            throw null;
                                        }
                                        long jH = tz0.h(td0Var, localDate4, j8, d9, d10, (t63) obj8);
                                        if (i6 == 0) {
                                            l9VarA.a.moveTo(Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH & 4294967295L)));
                                        } else {
                                            l9VarA.d(Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH & 4294967295L)));
                                        }
                                        i5 = i7;
                                        i6 = i8;
                                    }
                                    td0Var.Z(l9VarA, j7, new ko2(td0Var.A(3.0f), 0.0f, 0, 0, 30));
                                    return j23.a;
                                }
                            };
                            dr0Var2.f0(vp0Var);
                            objK2 = vp0Var;
                        }
                        ia2.f(rg1VarA, (vp0) objK2, dr0Var2, 0);
                        gw2.b(jp1.k("点：每次称重\u3000线：7 日平均（", t03.t(1, d7 + 0.5d), "–", t03.t(1, d8 - 0.5d), " kg）"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(ie0Var2)).l, dr0Var2, 0, 0, 131070);
                        dr0Var2.p(true);
                    } else {
                        dr0Var2.Q();
                    }
                    return j23.a;
                }
            }, dr0Var), dr0Var, 196614);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new hw0(i2, list);
        }
    }

    public static final long h(td0 td0Var, LocalDate localDate, long j2, double d2, double d3, t63 t63Var) {
        return (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (td0Var.d() >> 32)) * ChronoUnit.DAYS.between(localDate, t63Var.a)) / j2)) << 32) | (((long) Float.floatToRawIntBits((float) ((1.0d - ((t63Var.b - d2) / (d3 - d2))) * ((double) Float.intBitsToFloat((int) (td0Var.d() & 4294967295L)))))) & 4294967295L);
    }

    public static final void i(LocalDate localDate, int i2, vp0 vp0Var, kp0 kp0Var, dr0 dr0Var, int i3) {
        LocalDate localDate2 = localDate;
        dr0Var.W(1682754032);
        int i4 = i3 | (dr0Var.h(localDate2) ? 4 : 2) | (dr0Var.d(i2) ? 32 : 16) | (dr0Var.h(vp0Var) ? 256 : 128) | (dr0Var.h(kp0Var) ? 2048 : 1024);
        if (dr0Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            LocalDate localDateMinusYears = localDate2.minusYears(5L);
            localDateMinusYears.getClass();
            long epochMilli = localDateMinusYears.atStartOfDay(zoneOffset).toInstant().toEpochMilli();
            long epochMilli2 = localDate2.atStartOfDay(zoneOffset).toInstant().toEpochMilli();
            LocalDate localDateMinusDays = localDate2.minusDays(i2);
            localDateMinusDays.getClass();
            Long lValueOf = Long.valueOf(localDateMinusDays.atStartOfDay(zoneOffset).toInstant().toEpochMilli());
            qy0 qy0Var = new qy0(localDate2.minusYears(5L).getYear(), localDate2.getYear(), 1);
            c73 c73Var = new c73(epochMilli, epochMilli2, localDate2);
            rt1 rt1Var = n60.a;
            dr0Var.V(2088426481);
            Locale locale = ((Configuration) dr0Var.j(i7.a)).getLocales().get(0);
            dr0Var.p(false);
            Object[] objArr = new Object[0];
            k42 k42VarT = es.T(new yx((byte) 13), new g(c73Var, locale, (byte) 11));
            boolean zF = dr0Var.f(lValueOf) | dr0Var.f(lValueOf) | dr0Var.h(qy0Var) | dr0Var.d(0) | dr0Var.f(c73Var) | dr0Var.h(locale);
            Object objK = dr0Var.K();
            if (zF || objK == zy.a) {
                localDate2 = localDate2;
                localDate2 = localDate2;
                objK = new v9(lValueOf, lValueOf, qy0Var, c73Var, locale, (byte) 2);
                dr0Var.f0(objK);
            }
            localDate2 = localDate2;
            o60 o60Var = (o60) rz1.B(objArr, k42VarT, (kp0) objK, dr0Var, 0);
            o60Var.d.setValue(c73Var);
            byte b2 = 12;
            x40.a(kp0Var, dt.N(1229364638, new hl(o60Var, kp0Var, vp0Var, localDate2), dr0Var), null, dt.N(-906518564, new gw0(kp0Var, b2), dr0Var), null, null, null, dt.N(453068775, new kw0(o60Var, b2), dr0Var), dr0Var, ((i4 >> 9) & 14) | 100666416);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha(localDate2, i2, vp0Var, kp0Var, i3, (byte) 13);
        }
    }

    public static final void j(final String str, kp0 kp0Var, dr0 dr0Var, int i2) {
        Object next;
        m10 m10Var;
        List list;
        MealPlannerApp mealPlannerApp;
        dr0 dr0Var2;
        LocalDate localDate;
        boolean z2;
        String str2 = str;
        kp0Var.getClass();
        dr0Var.W(-196329191);
        byte b2 = 2;
        int i3 = i2 | (dr0Var.f(str2) ? 4 : 2) | (dr0Var.h(kp0Var) ? 32 : 16);
        byte b3 = 1;
        if (dr0Var.N(i3 & 1, (i3 & 19) != 18)) {
            Context applicationContext = ((Context) dr0Var.j(i7.b)).getApplicationContext();
            applicationContext.getClass();
            MealPlannerApp mealPlannerApp2 = (MealPlannerApp) applicationContext;
            tw1 tw1VarC = mealPlannerApp2.c();
            tw1VarC.getClass();
            r63 r63VarT = tw1VarC.a.t();
            r63VarT.getClass();
            vr vrVar = new vr(es.x(r63VarT.a, new String[]{"weight_entry"}, new q63(str2, b3)), b2);
            ag0 ag0Var = ag0.h;
            final sj1 sj1VarH = pz1.h(vrVar, ag0Var, dr0Var, 48, 2);
            Iterator it = ((List) pz1.h(mealPlannerApp2.c().e, ag0Var, dr0Var, 48, 2).getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!uz0.g(((dy1) next).a, str2));
            dy1 dy1Var = (dy1) next;
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                objK = h7.Y(dr0Var);
                dr0Var.f0(objK);
            }
            final x20 x20Var = (x20) objK;
            Object[] objArr = new Object[0];
            Object objK2 = dr0Var.K();
            if (objK2 == yyVar) {
                m10Var = null;
                objK2 = new n62((byte) 22);
                dr0Var.f0(objK2);
            } else {
                m10Var = null;
            }
            final sj1 sj1Var = (sj1) rz1.z(objArr, (kp0) objK2, dr0Var, 48);
            Object[] objArr2 = new Object[0];
            Object objK3 = dr0Var.K();
            if (objK3 == yyVar) {
                objK3 = new n62((byte) 23);
                dr0Var.f0(objK3);
            }
            final iu1 iu1Var = (iu1) rz1.z(objArr2, (kp0) objK3, dr0Var, 48);
            Object[] objArr3 = new Object[0];
            Object objK4 = dr0Var.K();
            if (objK4 == yyVar) {
                objK4 = new n62((byte) 24);
                dr0Var.f0(objK4);
            }
            final sj1 sj1Var2 = (sj1) rz1.z(objArr3, (kp0) objK4, dr0Var, 48);
            Object objK5 = dr0Var.K();
            if (objK5 == yyVar) {
                objK5 = rz1.x(m10Var);
                dr0Var.f0(objK5);
            }
            final sj1 sj1Var3 = (sj1) objK5;
            Object objK6 = dr0Var.K();
            if (objK6 == yyVar) {
                objK6 = rz1.x(m10Var);
                dr0Var.f0(objK6);
            }
            final sj1 sj1Var4 = (sj1) objK6;
            Object objK7 = dr0Var.K();
            if (objK7 == yyVar) {
                objK7 = rz1.x(m10Var);
                dr0Var.f0(objK7);
            }
            final sj1 sj1Var5 = (sj1) objK7;
            LocalDate localDateNow = LocalDate.now();
            List list2 = (List) sj1VarH.getValue();
            boolean zH = dr0Var.h(mealPlannerApp2) | ((i3 & 14) == 4);
            Object objK8 = dr0Var.K();
            if (zH || objK8 == yyVar) {
                list = list2;
                objK8 = new b9(mealPlannerApp2, str2, sj1Var4, m10Var, (byte) 7);
                mealPlannerApp = mealPlannerApp2;
                dr0Var.f0(objK8);
            } else {
                mealPlannerApp = mealPlannerApp2;
                list = list2;
            }
            h7.K(list, dy1Var, (zp0) objK8, dr0Var);
            if (((Boolean) sj1Var2.getValue()).booleanValue()) {
                dr0Var.V(306240566);
                localDateNow.getClass();
                int iG = iu1Var.g();
                boolean zF = dr0Var.f(iu1Var);
                Object objK9 = dr0Var.K();
                if (zF || objK9 == yyVar) {
                    objK9 = new am1(iu1Var, (byte) 1);
                    dr0Var.f0(objK9);
                }
                vp0 vp0Var = (vp0) objK9;
                boolean zF2 = dr0Var.f(sj1Var2);
                Object objK10 = dr0Var.K();
                if (zF2 || objK10 == yyVar) {
                    objK10 = new x63(sj1Var2, (byte) 1);
                    dr0Var.f0(objK10);
                }
                localDate = localDateNow;
                i(localDate, iG, vp0Var, (kp0) objK10, dr0Var, 0);
                dr0Var2 = dr0Var;
                z2 = false;
            } else {
                dr0Var2 = dr0Var;
                localDate = localDateNow;
                z2 = false;
                dr0Var2.V(903612329);
            }
            dr0Var2.p(z2);
            final LocalDate localDate2 = localDate;
            final MealPlannerApp mealPlannerApp3 = mealPlannerApp;
            str2 = str;
            cy1.a(null, dt.N(1983574485, new j7(dy1Var, kp0Var, (byte) 29), dr0Var2), null, null, null, 0, 0L, 0L, null, dt.N(-921480150, new aq0() { // from class: z63
                @Override // defpackage.aq0
                public final Object c(Object obj, Object obj2, Object obj3) {
                    pt1 pt1Var = (pt1) obj;
                    dr0 dr0Var3 = (dr0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    pt1Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= dr0Var3.f(pt1Var) ? 4 : 2;
                    }
                    if (dr0Var3.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        rg1 rg1VarH = t03.H(ia2.p(t03.F(yj2.b, pt1Var)), 16.0f, 0.0f, 2);
                        ah ahVar = new ah(12.0f, new wg((byte) 0));
                        final LocalDate localDate3 = localDate2;
                        boolean zH2 = dr0Var3.h(localDate3);
                        final iu1 iu1Var2 = iu1Var;
                        boolean zF3 = zH2 | dr0Var3.f(iu1Var2);
                        final sj1 sj1Var6 = sj1Var2;
                        boolean zF4 = zF3 | dr0Var3.f(sj1Var6);
                        final sj1 sj1Var7 = sj1Var;
                        boolean zF5 = zF4 | dr0Var3.f(sj1Var7);
                        final x20 x20Var2 = x20Var;
                        boolean zH3 = zF5 | dr0Var3.h(x20Var2);
                        final MealPlannerApp mealPlannerApp4 = mealPlannerApp3;
                        boolean zH4 = zH3 | dr0Var3.h(mealPlannerApp4);
                        final String str3 = str;
                        boolean zF6 = zH4 | dr0Var3.f(str3);
                        final sj1 sj1Var8 = sj1VarH;
                        boolean zF7 = zF6 | dr0Var3.f(sj1Var8);
                        Object objK11 = dr0Var3.K();
                        if (zF7 || objK11 == zy.a) {
                            final sj1 sj1Var9 = sj1Var3;
                            final sj1 sj1Var10 = sj1Var5;
                            final sj1 sj1Var11 = sj1Var4;
                            vp0 vp0Var2 = new vp0() { // from class: a73
                                @Override // defpackage.vp0
                                public final Object h(Object obj4) {
                                    p71 p71Var = (p71) obj4;
                                    p71Var.getClass();
                                    LocalDate localDate4 = localDate3;
                                    iu1 iu1Var3 = iu1Var2;
                                    sj1 sj1Var12 = sj1Var6;
                                    sj1 sj1Var13 = sj1Var7;
                                    x20 x20Var3 = x20Var2;
                                    MealPlannerApp mealPlannerApp5 = mealPlannerApp4;
                                    String str4 = str3;
                                    sj1 sj1Var14 = sj1Var9;
                                    sj1 sj1Var15 = sj1Var10;
                                    nx nxVar = new nx(-1740374209, true, new v63(localDate4, iu1Var3, sj1Var12, sj1Var13, x20Var3, mealPlannerApp5, str4, sj1Var14, sj1Var15, (byte) 0));
                                    byte b4 = 3;
                                    p71.o0(p71Var, null, nxVar, 3);
                                    sj1 sj1Var16 = sj1Var8;
                                    byte b5 = 2;
                                    if (((List) sj1Var16.getValue()).size() >= 2) {
                                        p71.o0(p71Var, null, new nx(2047131994, true, new x90(sj1Var16, b5)), 3);
                                    }
                                    p71.o0(p71Var, null, new nx(1870890550, true, new nw0(x20Var3, mealPlannerApp5, str4, sj1Var11, sj1Var15)), 3);
                                    p71.o0(p71Var, null, new nx(1510430839, true, new x90(sj1Var16, b4)), 3);
                                    List listM0 = dv.M0((List) sj1Var16.getValue(), new mm0((byte) 15));
                                    p71Var.p0(listM0.size(), new q9(new h33((byte) 13), listM0, (byte) 16), new rw0(listM0, (byte) 4), new nx(802480018, true, new k63(listM0, x20Var3, mealPlannerApp5, str4, (byte) 1)));
                                    return j23.a;
                                }
                            };
                            dr0Var3.f0(vp0Var2);
                            objK11 = vp0Var2;
                        }
                        cu.h(rg1VarH, null, null, ahVar, null, null, false, null, (vp0) objK11, dr0Var3, 24576, 494);
                    } else {
                        dr0Var3.Q();
                    }
                    return j23.a;
                }
            }, dr0Var2), dr0Var, 805306416, 509);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new iw0(str2, kp0Var, i2, (byte) 3);
        }
    }

    public static final rg1 k(rg1 rg1Var, float f2) {
        return f2 == 1.0f ? rg1Var : h7.j0(rg1Var, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 1044475);
    }

    public static final Object l(j80 j80Var, kp0 kp0Var, n10 n10Var) {
        Object obj;
        pn1 pn1VarX;
        Object objY;
        ln1 ln1Var;
        if (((qg1) j80Var).h.u) {
            qg1 qg1Var = (qg1) j80Var;
            if (!qg1Var.h.u) {
                ax0.b("visitAncestors called on an unattached node");
            }
            qg1 qg1Var2 = qg1Var.h.l;
            l41 l41VarY = cu.Y(j80Var);
            loop0: while (true) {
                obj = null;
                if (l41VarY == null) {
                    break;
                }
                if ((l41VarY.L.f.k & 524288) != 0) {
                    while (qg1Var2 != null) {
                        if ((qg1Var2.j & 524288) != 0) {
                            qg1 qg1VarR = qg1Var2;
                            uj1 uj1Var = null;
                            while (qg1VarR != null) {
                                if (qg1VarR instanceof ko) {
                                    obj = qg1VarR;
                                    break loop0;
                                }
                                if ((qg1VarR.j & 524288) != 0 && (qg1VarR instanceof k80)) {
                                    int i2 = 0;
                                    for (qg1 qg1Var3 = ((k80) qg1VarR).w; qg1Var3 != null; qg1Var3 = qg1Var3.m) {
                                        if ((qg1Var3.j & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                qg1VarR = qg1Var3;
                                            } else {
                                                if (uj1Var == null) {
                                                    uj1Var = new uj1(new qg1[16]);
                                                }
                                                if (qg1VarR != null) {
                                                    uj1Var.b(qg1VarR);
                                                    qg1VarR = null;
                                                }
                                                uj1Var.b(qg1Var3);
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                qg1VarR = cu.R(uj1Var);
                            }
                        }
                        qg1Var2 = qg1Var2.l;
                    }
                }
                l41VarY = l41VarY.u();
                qg1Var2 = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
            }
            ko koVar = (ko) obj;
            if (koVar != null && (objY = koVar.Y((pn1VarX = cu.X(j80Var)), new h6((Object) kp0Var, (Object) pn1VarX, (byte) 8), n10Var)) == y20.h) {
                return objY;
            }
        }
        return j23.a;
    }

    public static final rg1 m(rg1 rg1Var, oo ooVar) {
        return rg1Var.c(new mo(ooVar));
    }

    public static void n(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            StringBuilder sbK = wi0.k("fromIndex: ", i2, ", toIndex: ", i3, ", size: ");
            sbK.append(i4);
            throw new IndexOutOfBoundsException(sbK.toString());
        }
        if (i2 <= i3) {
            return;
        }
        wg.m(wi0.f(i2, i3, "fromIndex: ", " > toIndex: "));
    }

    public static byte[] o(q90[] q90VarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (q90 q90Var : q90VarArr) {
            length += ((((q90Var.g << 1) + 7) & (-8)) / 8) + t(q90Var.a, q90Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + (q90Var.e << 1) + q90Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, uz0.E)) {
            int length2 = q90VarArr.length;
            while (i2 < length2) {
                q90 q90Var2 = q90VarArr[i2];
                N(byteArrayOutputStream, q90Var2, t(q90Var2.a, q90Var2.b, bArr));
                M(byteArrayOutputStream, q90Var2);
                i2++;
            }
        } else {
            for (q90 q90Var3 : q90VarArr) {
                N(byteArrayOutputStream, q90Var3, t(q90Var3.a, q90Var3.b, bArr));
            }
            int length3 = q90VarArr.length;
            while (i2 < length3) {
                M(byteArrayOutputStream, q90VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final pk0 p(pk0 pk0Var) {
        return ((pk0Var instanceof ln2) || (pk0Var instanceof qb0)) ? pk0Var : new qb0(pk0Var);
    }

    public static final void q(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static final String r(long j2, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = linkedHashMap.get(str2);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            linkedHashMap.put(str2, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        return ((DateFormat) obj2).format(new Date(j2));
    }

    public static final pk0 s(ni2 ni2Var, o20 o20Var, int i2, dp dpVar) {
        return ((i2 == 0 || i2 == -3) && dpVar == dp.h) ? ni2Var : new gs(ni2Var, o20Var, i2, dpVar);
    }

    public static String t(String str, String str2, byte[] bArr) {
        byte[] bArr2 = uz0.F;
        byte[] bArr3 = uz0.G;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return wi0.i(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static final iu0 u() {
        iu0 iu0Var = l0;
        if (iu0Var != null) {
            return iu0Var;
        }
        hu0 hu0Var = new hu0("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = k33.a;
        rl2 rl2Var = new rl2(kv.b);
        xl1 xl1Var = new xl1((byte) 3);
        xl1Var.A(20.0f, 11.0f);
        xl1Var.w(7.83f);
        xl1Var.z(5.59f, -5.59f);
        xl1Var.y(12.0f, 4.0f);
        xl1Var.z(-8.0f, 8.0f);
        xl1Var.z(8.0f, 8.0f);
        xl1Var.z(1.41f, -1.41f);
        xl1Var.y(7.83f, 13.0f);
        xl1Var.w(20.0f);
        xl1Var.I(-2.0f);
        xl1Var.m();
        hu0.a(hu0Var, (ArrayList) xl1Var.i, rl2Var);
        iu0 iu0VarB = hu0Var.b();
        l0 = iu0VarB;
        return iu0VarB;
    }

    public static final rg1 v(rg1 rg1Var, vp0 vp0Var) {
        return rg1Var.c(new lq1(vp0Var));
    }

    public static final ix0 w(String str, String str2, int i2, vp0 vp0Var) {
        char cCharAt = str.charAt(i2);
        if (((Boolean) vp0Var.h(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return x(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i2);
    }

    public static final ix0 x(String str, String str2) {
        return new ix0(str2 + " when parsing an Instant from \"" + L(64, str) + '\"', str, (byte) 16, false);
    }

    public static final int y(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static int[] z(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iU = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iU += (int) cu.U(byteArrayInputStream, 2);
            iArr[i3] = iU;
        }
        return iArr;
    }
}
