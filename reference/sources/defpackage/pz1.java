package defpackage;

import android.content.Context;
import android.view.View;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.familymeal.app.MealPlannerApp;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class pz1 implements o53 {
    public static iu0 a = null;
    public static final float b = 0.38f;
    public static final float c = 200.0f;

    public static int A(String str, int i, int i2) {
        return (int) z(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final long B(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BigDecimal C(Comparable comparable) {
        double dDoubleValue;
        if (comparable == 0) {
            return om.a;
        }
        if (comparable instanceof BigDecimal) {
            return (BigDecimal) comparable;
        }
        if (comparable instanceof vc2) {
            return ((vc2) comparable).F1();
        }
        try {
            return new BigDecimal(comparable.toString());
        } catch (NumberFormatException unused) {
            if (comparable instanceof xo1) {
                dDoubleValue = ((xo1) comparable).A0();
            } else {
                dDoubleValue = comparable instanceof Number ? ((Number) comparable).doubleValue() : Double.NaN;
            }
            if (Double.isNaN(dDoubleValue)) {
                return om.a;
            }
            if (dDoubleValue == Double.POSITIVE_INFINITY) {
                return om.O;
            }
            return dDoubleValue == Double.NEGATIVE_INFINITY ? om.N : BigDecimal.valueOf(dDoubleValue);
        }
    }

    public static final String D(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final ag2 E(final tj2 tj2Var, final yq0 yq0Var, ag2 ag2Var) {
        h30 h30Var;
        int i = yq0Var.c;
        int i2 = yq0Var.b;
        boolean z = tj2Var.b;
        final int i3 = z ? i2 : i;
        jw2 jw2Var = (jw2) yq0Var.e;
        int i4 = yq0Var.d;
        j60 j60Var = new j60(yq0Var, i3, (byte) 2);
        g81 g81Var = g81.i;
        final d51 d51VarN = vs.N(g81Var, j60Var);
        final int i5 = z ? i : i2;
        d51 d51VarN2 = vs.N(g81Var, new kp0() { // from class: cg2
            @Override // defpackage.kp0
            public final Object a() {
                yq0 yq0Var2 = yq0Var;
                jw2 jw2Var2 = (jw2) yq0Var2.e;
                int iIntValue = ((Number) d51VarN.getValue()).intValue();
                tj2 tj2Var2 = tj2Var;
                boolean z2 = tj2Var2.b;
                boolean z3 = tj2Var2.a() == h30.h;
                int i6 = i3;
                long jI = jw2Var2.i(i6);
                uh1 uh1Var = jw2Var2.b;
                int i7 = qw2.c;
                int iF = (int) (jI >> 32);
                int i8 = uh1Var.f;
                if (uh1Var.d(iF) != iIntValue) {
                    iF = iIntValue >= i8 ? jw2Var2.f(i8 - 1) : jw2Var2.f(iIntValue);
                }
                int iC = (int) (jI & 4294967295L);
                if (uh1Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i8 ? uh1Var.c(i8 - 1, false) : uh1Var.c(iIntValue, false);
                }
                int i9 = i5;
                if (iF == i9) {
                    return yq0Var2.a(iC);
                }
                if (iC == i9) {
                    return yq0Var2.a(iF);
                }
                if (!(z2 ^ z3) ? i6 >= iF : i6 > iC) {
                    iF = iC;
                }
                return yq0Var2.a(iF);
            }
        });
        ag2Var.getClass();
        if (i3 == i4) {
            return ag2Var;
        }
        if (((Number) d51VarN.getValue()).intValue() != jw2Var.b.d(i4)) {
            return (ag2) d51VarN2.getValue();
        }
        int i6 = ag2Var.b;
        long jI = jw2Var.i(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                h30 h30Var2 = h30.h;
                if (i2 < i) {
                    h30Var = h30.i;
                } else {
                    h30Var = i2 > i ? h30Var2 : h30.j;
                }
                if (!(z ^ (h30Var == h30Var2))) {
                }
            }
            return yq0Var.a(i3);
        }
        int i7 = qw2.c;
        return (i6 == ((int) (jI >> 32)) || i6 == ((int) (jI & 4294967295L))) ? (ag2) d51VarN2.getValue() : yq0Var.a(i3);
    }

    public static final void F(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    public static final void d(vp0 vp0Var, kp0 kp0Var, dr0 dr0Var, int i) {
        byte b2;
        vp0Var.getClass();
        kp0Var.getClass();
        dr0Var.W(-709763445);
        int i2 = i | (dr0Var.h(vp0Var) ? 4 : 2) | (dr0Var.h(kp0Var) ? 32 : 16);
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            Context applicationContext = ((Context) dr0Var.j(i7.b)).getApplicationContext();
            applicationContext.getClass();
            sj1 sj1VarH = h(((MealPlannerApp) applicationContext).b().e, ag0.h, dr0Var, 48, 2);
            Object[] objArr = new Object[0];
            Object objK = dr0Var.K();
            byte b3 = 6;
            yy yyVar = zy.a;
            if (objK == yyVar) {
                objK = new n62(b3);
                dr0Var.f0(objK);
            }
            sj1 sj1Var = (sj1) rz1.z(objArr, (kp0) objK, dr0Var, 48);
            Object[] objArr2 = new Object[0];
            Object objK2 = dr0Var.K();
            if (objK2 == yyVar) {
                objK2 = new n62((byte) 7);
                dr0Var.f0(objK2);
            }
            sj1 sj1Var2 = (sj1) rz1.z(objArr2, (kp0) objK2, dr0Var, 48);
            List list = (List) sj1VarH.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                j62 j62Var = (j62) obj;
                if (((zr) sj1Var2.getValue()) == null || j62Var.d == ((zr) sj1Var2.getValue())) {
                    if (co2.X((String) sj1Var.getValue()) || co2.Q(j62Var.b, co2.g0((String) sj1Var.getValue()).toString(), false)) {
                        arrayList.add(obj);
                    }
                }
            }
            WeakHashMap weakHashMap = u83.v;
            pb pbVar = rz1.i(dr0Var).f;
            nx nxVarN = dt.N(32218276, new gw0(kp0Var, b3), dr0Var);
            nx nxVarN2 = dt.N(1390977244, new nw0(sj1Var, sj1Var2, arrayList, vp0Var, sj1VarH), dr0Var);
            b2 = 1;
            cy1.a(null, null, null, null, nxVarN, 0, 0L, 0L, pbVar, nxVarN2, dr0Var, 805330944, 239);
        } else {
            b2 = 1;
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ow0(vp0Var, kp0Var, i, b2);
        }
    }

    public static final bg2 e(tj2 tj2Var, vz1 vz1Var) {
        h30 h30VarA = tj2Var.a();
        yq0 yq0Var = (yq0) tj2Var.d;
        boolean z = h30VarA == h30.h;
        return new bg2(f(yq0Var, z, true, vz1Var), f(yq0Var, z, false, vz1Var), z);
    }

    public static final ag2 f(yq0 yq0Var, boolean z, boolean z2, vz1 vz1Var) {
        long jA;
        int i = z2 ? yq0Var.b : yq0Var.c;
        switch (vz1Var.h) {
            case 4:
                String str = ((jw2) yq0Var.e).a.a.i;
                jA = m02.a(m02.h(i, str), m02.g(i, str));
                break;
            default:
                jA = ((jw2) yq0Var.e).i(i);
                break;
        }
        boolean z3 = z2 ^ z;
        int i2 = qw2.c;
        return yq0Var.a((int) (z3 ? jA >> 32 : jA & 4294967295L));
    }

    public static final ag2 g(ag2 ag2Var, yq0 yq0Var, int i) {
        u82 u82VarA = ((jw2) yq0Var.e).a(i);
        ag2Var.getClass();
        return new ag2(i, u82VarA);
    }

    public static final sj1 h(pk0 pk0Var, Object obj, dr0 dr0Var, int i, int i2) {
        Object obj2 = xf0.h;
        boolean zH = dr0Var.h(obj2) | dr0Var.h(pk0Var);
        Object objK = dr0Var.K();
        m10 m10Var = null;
        Object obj3 = zy.a;
        if (zH || objK == obj3) {
            objK = new y8(pk0Var, m10Var, (byte) 6);
            dr0Var.f0(objK);
        }
        zp0 zp0Var = (zp0) objK;
        Object objK2 = dr0Var.K();
        if (objK2 == obj3) {
            objK2 = rz1.x(obj);
            dr0Var.f0(objK2);
        }
        sj1 sj1Var = (sj1) objK2;
        boolean zH2 = dr0Var.h(zp0Var);
        Object objK3 = dr0Var.K();
        if (zH2 || objK3 == obj3) {
            objK3 = new jl2(zp0Var, sj1Var, m10Var, (byte) 1);
            dr0Var.f0(objK3);
        }
        h7.K(pk0Var, obj2, (zp0) objK3, dr0Var);
        return sj1Var;
    }

    public static final ft2 i(j80 j80Var) {
        qt2 qt2Var;
        dt2 dt2Var = new dt2();
        y02.A(j80Var, ht2.a, new z61(new z61(dt2Var, (byte) 28), new i(1, dt2Var, dt2.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 12), (byte) 29));
        fj1 fj1Var = new fj1();
        fj1 fj1Var2 = dt2Var.a;
        Object[] objArr = fj1Var2.a;
        int i = fj1Var2.b;
        byte b2 = 0;
        int i2 = 0;
        boolean z = true;
        et2 et2Var = null;
        while (true) {
            qt2Var = qt2.b;
            if (i2 >= i) {
                break;
            }
            et2 et2Var2 = (et2) objArr[i2];
            if (!z || et2Var2 != qt2Var) {
                if (et2Var2 == qt2Var && et2Var == qt2Var) {
                    z = false;
                } else {
                    if (et2Var2 != qt2Var) {
                        fj1 fj1Var3 = dt2Var.b;
                        Object[] objArr2 = fj1Var3.a;
                        int i3 = fj1Var3.b;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (((Boolean) ((vp0) objArr2[i4]).h(et2Var2)).booleanValue()) {
                                    i4++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    fj1Var.a(et2Var2);
                    z = false;
                    et2Var = et2Var2;
                }
            }
            i2++;
        }
        if (((et2) (fj1Var.i() ? null : fj1Var.a[fj1Var.b - 1])) == qt2Var) {
            fj1Var.l(fj1Var.b - 1);
        }
        dj1 dj1Var = fj1Var.c;
        if (dj1Var == null) {
            dj1Var = new dj1(fj1Var, b2);
            fj1Var.c = dj1Var;
        }
        return new ft2(dj1Var);
    }

    public static ArrayList j(c63 c63Var, ek2 ek2Var, j62 j62Var, ed2 ed2Var) {
        ek2Var.getClass();
        j62Var.getClass();
        double dV = v(c63Var, ek2Var, j62Var, ed2Var) / ((double) j62Var.e);
        List<z62> list = j62Var.g;
        ArrayList arrayList = new ArrayList(ev.o0(list, 10));
        for (z62 z62Var : list) {
            arrayList.add(new mz1(z62Var.a, z62Var.b * dV));
        }
        return arrayList;
    }

    public static final void k(SQLiteConnection sQLiteConnection, String str) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            ie1.j(sQLiteStatementPrepare, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ie1.j(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public static final eg l(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new eg(matcher, charSequence);
        }
        return null;
    }

    public static String m(String str, Object... objArr) {
        int length = str.length();
        int length2 = objArr.length;
        StringBuilder sb = new StringBuilder((length2 * 20) + length);
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            int iIndexOf = str.indexOf(123, i);
            if (iIndexOf == -1) {
                sb.append(' ');
                Object obj = objArr[i2];
                if (obj instanceof a1) {
                    sb.append(a1.V0((a1) obj));
                } else if (obj instanceof double[]) {
                    sb.append(Arrays.toString((double[]) obj));
                } else {
                    sb.append(obj);
                }
            } else {
                sb.append(str.substring(i, iIndexOf));
                Object obj2 = objArr[i2];
                if (obj2 instanceof double[]) {
                    sb.append(Arrays.toString((double[]) obj2));
                } else if (obj2 instanceof float[]) {
                    sb.append(Arrays.toString((float[]) obj2));
                } else if (obj2 instanceof long[]) {
                    sb.append(Arrays.toString((long[]) obj2));
                } else if (obj2 instanceof int[]) {
                    sb.append(Arrays.toString((int[]) obj2));
                } else if (obj2 instanceof short[]) {
                    sb.append(Arrays.toString((short[]) obj2));
                } else if (obj2 instanceof byte[]) {
                    sb.append(Arrays.toString((byte[]) obj2));
                } else if (obj2 instanceof boolean[]) {
                    sb.append(Arrays.toString((boolean[]) obj2));
                } else if (obj2 instanceof char[]) {
                    sb.append(Arrays.toString((char[]) obj2));
                } else {
                    sb.append(obj2);
                }
                i = iIndexOf + 2;
            }
        }
        sb.append(str.substring(i, length));
        return sb.toString();
    }

    public static final void n(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = et0.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final k12 o(View view) {
        k12 k12Var = (k12) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (k12Var != null) {
            return k12Var;
        }
        k12 k12Var2 = new k12();
        view.setTag(R.id.pooling_container_listener_holder_tag, k12Var2);
        return k12Var2;
    }

    public static final od p(vv2 vv2Var) {
        od odVar = vv2Var.a;
        long j = vv2Var.b;
        odVar.getClass();
        return odVar.subSequence(qw2.f(j), qw2.e(j));
    }

    public static final od q(vv2 vv2Var, int i) {
        od odVar = vv2Var.a;
        od odVar2 = vv2Var.a;
        long j = vv2Var.b;
        int iE = qw2.e(j);
        int iE2 = qw2.e(j);
        int length = iE2 + i;
        if (((iE2 ^ length) & (i ^ length)) < 0) {
            length = odVar2.i.length();
        }
        return odVar.subSequence(iE, Math.min(length, odVar2.i.length()));
    }

    public static final od r(vv2 vv2Var, int i) {
        od odVar = vv2Var.a;
        long j = vv2Var.b;
        int iF = qw2.f(j);
        int i2 = iF - i;
        if (((i ^ iF) & (iF ^ i2)) < 0) {
            i2 = 0;
        }
        return odVar.subSequence(Math.max(0, i2), qw2.f(j));
    }

    public static final jw2 s(rg2 rg2Var) {
        vp0 vp0Var;
        ArrayList arrayList = new ArrayList();
        Object objG = rg2Var.h.g(qg2.a);
        if (objG == null) {
            objG = null;
        }
        m1 m1Var = (m1) objG;
        if (m1Var == null || (vp0Var = (vp0) m1Var.b) == null || !((Boolean) vp0Var.h(arrayList)).booleanValue()) {
            return null;
        }
        return (jw2) arrayList.get(0);
    }

    public static final af1 t(ra2 ra2Var, int i, int i2, int i3, int i4, int i5, bf1 bf1Var, List list, ny1[] ny1VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        List list2 = list;
        long j = i5;
        int i10 = i7 - i6;
        int[] iArr2 = new int[i10];
        int i11 = i6;
        int iMax = 0;
        int i12 = 0;
        int i13 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i11 < i7) {
            ue1 ue1Var = (ue1) list2.get(i11);
            float fB = cy1.B(cy1.x(ue1Var));
            if (fB > 0.0f) {
                f2 += fB;
                i12++;
                i11 = i11;
            } else {
                int i14 = i3 - i13;
                ny1 ny1VarE = ny1VarArr[i11];
                if (ny1VarE == null) {
                    ny1VarE = ue1Var.e(ra2Var.g(0, i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i14 < 0 ? 0 : i14, i4, false));
                }
                ny1 ny1Var = ny1VarE;
                int i15 = ra2Var.i(ny1Var);
                int iH = ra2Var.h(ny1Var);
                iArr2[i11 - i6] = i15;
                int i16 = i14 - i15;
                if (i16 < 0) {
                    i16 = 0;
                }
                iMin = Math.min(i5, i16);
                i13 += i15 + iMin;
                iMax = Math.max(iMax, iH);
                ny1VarArr[i11] = ny1Var;
                i12 = i12;
            }
            i11++;
            j = j;
        }
        long j2 = j;
        int i17 = i12;
        if (i17 == 0) {
            i13 -= iMin;
            i9 = 0;
        } else {
            long j3 = ((long) (i17 - 1)) * j2;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i13)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i18 = i6; i18 < i7; i18++) {
                jRound -= (long) Math.round(cy1.B(cy1.x((ue1) list2.get(i18))) * f3);
            }
            int i19 = i6;
            int i20 = iMax;
            int i21 = 0;
            while (i19 < i7) {
                if (ny1VarArr[i19] == null) {
                    ue1 ue1Var2 = (ue1) list2.get(i19);
                    f = f3;
                    sa2 sa2VarX = cy1.x(ue1Var2);
                    float fB2 = cy1.B(sa2VarX);
                    if (fB2 <= 0.0f) {
                        yw0.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j4 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fB2 * f) + iSignum);
                    ny1 ny1VarE2 = ue1Var2.e(ra2Var.g((!(sa2VarX != null ? sa2VarX.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int i22 = ra2Var.i(ny1VarE2);
                    int iH2 = ra2Var.h(ny1VarE2);
                    iArr2[i19 - i6] = i22;
                    i21 += i22;
                    int iMax3 = Math.max(i20, iH2);
                    ny1VarArr[i19] = ny1VarE2;
                    i20 = iMax3;
                    jRound = j4;
                } else {
                    f = f3;
                }
                i19++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (((long) i21) + j3);
            int i23 = i3 - i13;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i23) {
                i9 = i23;
            }
            iMax = i20;
        }
        int i24 = i9 + i13;
        if (i24 < 0) {
            i24 = 0;
        }
        int iMax4 = Math.max(i24, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i10];
        ra2Var.f(iMax4, iArr2, iArr3, bf1Var);
        return ra2Var.j(ny1VarArr, bf1Var, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    public static final void u(ob obVar, int i) {
        Object next;
        Iterator<T> it = obVar.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((l41) ((Map.Entry) next).getKey()).i != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        li1.c();
    }

    public static double v(c63 c63Var, ek2 ek2Var, j62 j62Var, ed2 ed2Var) {
        ek2Var.getClass();
        j62Var.getClass();
        List listA = ed2Var.a(ek2Var.a, ek2Var.b);
        if (j62Var.d != zr.n) {
            return listA.size();
        }
        Iterator it = listA.iterator();
        double dB = 0.0d;
        while (it.hasNext()) {
            dB += c63Var.b(ek2Var, (String) it.next(), j62Var.a);
        }
        return dB;
    }

    public static final vr y(kp0 kp0Var) {
        return new vr(new if2(kp0Var, null), (byte) 4);
    }

    public static final long z(String str, long j, long j2, long j3) {
        String property;
        int i = dr2.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lP = jo2.P(property);
        if (lP == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lP.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public abstract void w(boolean z);

    public abstract void x(boolean z);

    @Override // defpackage.o53
    public void b() {
    }

    @Override // defpackage.o53
    public void c() {
    }
}
