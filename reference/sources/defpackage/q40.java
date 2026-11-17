package defpackage;

import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.R;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class q40 {
    public static final rt1 a = t03.g(24.0f, 10.0f, 24.0f, 0.0f, 8);
    public static final float b = 16.0f;

    public static final void a(Long l, vp0 vp0Var, hq hqVar, qy0 qy0Var, y40 y40Var, vf2 vf2Var, s40 s40Var, gm0 gm0Var, dr0 dr0Var, int i) {
        byte b2;
        dr0Var.W(-432341251);
        int i2 = i | (dr0Var.f(l) ? 4 : 2) | (dr0Var.h(vp0Var) ? 32 : 16) | (dr0Var.h(hqVar) ? 256 : 128) | (dr0Var.h(qy0Var) ? 2048 : 1024) | (dr0Var.f(y40Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192) | (dr0Var.f(vf2Var) ? 131072 : 65536) | (dr0Var.f(s40Var) ? 1048576 : 524288) | (dr0Var.f(gm0Var) ? 8388608 : 4194304);
        if (dr0Var.N(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean zF = dr0Var.f(hqVar.a);
            Object objK = dr0Var.K();
            Object obj = zy.a;
            if (zF || objK == obj) {
                Locale locale = hqVar.a;
                String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale);
                Pattern patternCompile = Pattern.compile("[^dMy/\\-.]");
                patternCompile.getClass();
                localizedDateTimePattern.getClass();
                String strReplaceAll = patternCompile.matcher(localizedDateTimePattern).replaceAll("");
                strReplaceAll.getClass();
                Pattern patternCompile2 = Pattern.compile("d{1,2}");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("dd");
                strReplaceAll2.getClass();
                Pattern patternCompile3 = Pattern.compile("M{1,2}");
                patternCompile3.getClass();
                String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("MM");
                strReplaceAll3.getClass();
                Pattern patternCompile4 = Pattern.compile("y{1,4}");
                patternCompile4.getClass();
                String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll("yyyy");
                strReplaceAll4.getClass();
                String strM = jo2.M(strReplaceAll4, "My", "M/y");
                if (co2.S(strM, ".")) {
                    strM = strM.substring(0, strM.length() - 1);
                }
                Pattern patternCompile5 = Pattern.compile("[/\\-.]");
                patternCompile5.getClass();
                Matcher matcher = patternCompile5.matcher(strM);
                matcher.getClass();
                eg egVarL = pz1.l(matcher, 0, strM);
                egVarL.getClass();
                fe1 fe1VarB = ((ge1) egVarL.k).b(0);
                fe1VarB.getClass();
                objK = new k40(strM, fe1VarB.a.charAt(0));
                dr0Var.f0(objK);
            }
            k40 k40Var = (k40) objK;
            String strL = h12.l(R.string.m3c_date_input_invalid_for_pattern, dr0Var);
            String strL2 = h12.l(R.string.m3c_date_input_invalid_year_range, dr0Var);
            String strL3 = h12.l(R.string.m3c_date_input_invalid_not_allowed, dr0Var);
            boolean zF2 = dr0Var.f(k40Var) | ((57344 & i2) == 16384);
            Object objK2 = dr0Var.K();
            if (zF2 || objK2 == obj) {
                b2 = 0;
                objK2 = new r40(qy0Var, vf2Var, k40Var, y40Var, strL, strL2, strL3);
                dr0Var.f0(objK2);
            } else {
                b2 = 0;
            }
            r40 r40Var = (r40) objK2;
            String upperCase = k40Var.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String strL4 = h12.l(R.string.m3c_date_input_label, dr0Var);
            rg1 rg1VarF = t03.F(yj2.a, a);
            r40Var.getClass();
            int i3 = i2 << 3;
            b(rg1VarF, l, vp0Var, hqVar, dt.N(-752164549, new rl(strL4, upperCase, (byte) 2), dr0Var), dt.N(-1179434278, new p40(upperCase, b2), dr0Var), r40Var, k40Var, hqVar.a, s40Var, gm0Var, dr0Var, (i3 & 112) | 1794054 | (i3 & 896) | (i3 & 7168));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new l40(l, vp0Var, hqVar, qy0Var, y40Var, vf2Var, s40Var, gm0Var, i);
        }
    }

    public static final void b(final rg1 rg1Var, Long l, final vp0 vp0Var, final hq hqVar, final nx nxVar, final nx nxVar2, final r40 r40Var, final k40 k40Var, final Locale locale, final s40 s40Var, final gm0 gm0Var, dr0 dr0Var, final int i) {
        dr0 dr0Var2;
        Object obj;
        Object v9Var;
        int i2;
        final k40 k40Var2;
        Long l2 = l;
        final hq hqVar2 = hqVar;
        final Locale locale2 = locale;
        dr0Var.W(1456309913);
        int i3 = i | (dr0Var.f(l2) ? 32 : 16) | (dr0Var.h(vp0Var) ? 256 : 128) | (dr0Var.h(hqVar2) ? 2048 : 1024) | (dr0Var.f(r40Var) ? 8388608 : 4194304) | (dr0Var.f(k40Var) ? 67108864 : 33554432) | (dr0Var.h(locale2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY);
        int i4 = (dr0Var.f(s40Var) ? (char) 4 : (char) 2) | (dr0Var.f(gm0Var) ? ' ' : (char) 16);
        if (dr0Var.N(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            Object[] objArr = new Object[0];
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                obj = objK;
                sz szVar = new sz((byte) 21);
                dr0Var.f0(szVar);
                obj = szVar;
            }
            obj = objK;
            sj1 sj1Var = (sj1) rz1.A(Arrays.copyOf(objArr, 0), new k42(new yx((byte) 26), new vw1((byte) 26), (byte) 4), (kp0) obj, dr0Var, 3456);
            Object[] objArr2 = {(vv2) sj1Var.getValue()};
            int i5 = 29360128 & i3;
            int i6 = 234881024 & i3;
            boolean zF = dr0Var.f(sj1Var) | (i5 == 8388608) | dr0Var.h(hqVar2) | (i6 == 67108864) | dr0Var.h(locale2);
            Object objK2 = dr0Var.K();
            if (zF || objK2 == yyVar) {
                i2 = i3;
                v9Var = new v9(r40Var, hqVar2, k40Var, locale2, sj1Var, (byte) 1);
                sj1Var = sj1Var;
                dr0Var.f0(v9Var);
            } else {
                i2 = i3;
                v9Var = objK2;
            }
            final sj1 sj1Var2 = (sj1) rz1.z(objArr2, (kp0) v9Var, dr0Var, 0);
            boolean zX = co2.X((CharSequence) sj1Var2.getValue());
            float f = b;
            if (!zX) {
                if (!((16.0f >= 0.0f) & (4.0f >= 0.0f) & (16.0f >= 0.0f) & (0.0f >= 0.0f))) {
                    yw0.a("Padding must be non-negative");
                }
                f -= 0.0f + 4.0f;
            }
            float f2 = f;
            vv2 vv2Var = (vv2) sj1Var.getValue();
            boolean zF2 = (i6 == 67108864) | dr0Var.f(sj1Var) | dr0Var.f(sj1Var2) | ((i2 & 896) == 256) | dr0Var.h(hqVar2) | dr0Var.h(locale2) | (i5 == 8388608);
            Object objK3 = dr0Var.K();
            if (zF2 || objK3 == yyVar) {
                final sj1 sj1Var3 = sj1Var;
                k40Var2 = k40Var;
                vp0 vp0Var2 = new vp0() { // from class: m40
                    @Override // defpackage.vp0
                    public final Object h(Object obj2) {
                        vv2 vv2Var2 = (vv2) obj2;
                        od odVar = vv2Var2.a;
                        String str = odVar.i;
                        String str2 = odVar.i;
                        int length = str.length();
                        String str3 = k40Var2.c;
                        if (length <= str3.length()) {
                            for (int i7 = 0; i7 < str2.length(); i7++) {
                                if (Character.isDigit(str2.charAt(i7))) {
                                }
                            }
                            sj1Var3.setValue(vv2Var2);
                            String string = co2.g0(str2).toString();
                            int length2 = string.length();
                            sj1 sj1Var4 = sj1Var2;
                            vp0 vp0Var3 = vp0Var;
                            Long lValueOf = null;
                            if (length2 == 0 || string.length() < str3.length()) {
                                sj1Var4.setValue("");
                                vp0Var3.h(null);
                            } else {
                                hq hqVar3 = hqVar2;
                                Locale locale3 = locale2;
                                dq dqVarE = hqVar3.e(string, str3, locale3);
                                sj1Var4.setValue(r40Var.a(dqVarE, locale3));
                                if (((CharSequence) sj1Var4.getValue()).length() == 0 && dqVarE != null) {
                                    lValueOf = Long.valueOf(dqVarE.k);
                                }
                                vp0Var3.h(lValueOf);
                            }
                        }
                        return j23.a;
                    }
                };
                hqVar2 = hqVar2;
                locale2 = locale2;
                sj1Var = sj1Var3;
                dr0Var.f0(vp0Var2);
                objK3 = vp0Var2;
            } else {
                k40Var2 = k40Var;
            }
            vp0 vp0Var3 = (vp0) objK3;
            rg1 rg1VarJ = t03.J(rg1Var, 0.0f, 0.0f, 0.0f, f2, 7);
            boolean zF3 = dr0Var.f(sj1Var2);
            Object objK4 = dr0Var.K();
            Object obj2 = objK4;
            if (zF3 || objK4 == yyVar) {
                cb cbVar = new cb(sj1Var2, (byte) 3);
                dr0Var.f0(cbVar);
                obj2 = cbVar;
            }
            rg1 rg1VarA = tg2.a(rg1VarJ, false, (vp0) obj2);
            int i7 = i2;
            byte b2 = 1;
            ls.g(vv2Var, vp0Var3, rg1VarA.c(gm0Var != null ? ie1.l(gm0Var) : og1.h), false, null, nxVar, nxVar2, dt.N(-357881838, new p70(sj1Var2, (byte) 2), dr0Var), !co2.X((CharSequence) sj1Var2.getValue()), new r5(k40Var2), new c31(3, 7, 113), null, true, 0, 0, null, s40Var.y, dr0Var, 14155776);
            dr0Var2 = dr0Var;
            boolean z = (i4 & 112) == 32;
            Object objK5 = dr0Var2.K();
            if (z || objK5 == yyVar) {
                objK5 = new qj(gm0Var, null, b2);
                dr0Var2.f0(objK5);
            }
            h7.J((zp0) objK5, dr0Var2, j23.a);
            int i8 = ((i7 & 112) == 32 ? (char) 1 : (char) 0) | (dr0Var2.h(hqVar2) ? 1 : 0);
            if (i6 != 67108864) {
                b2 = 0;
            }
            boolean z2 = ((((i8 == true ? 1 : 0) | b2) | (dr0Var2.h(locale2) ? 1 : 0)) == true ? 1 : 0) | (dr0Var2.f(sj1Var) ? 1 : 0);
            Object objK6 = dr0Var2.K();
            if (z2 != 0 || objK6 == yyVar) {
                l2 = l;
                objK6 = new ro(l2, hqVar2, k40Var2, locale, sj1Var, null);
                dr0Var2.f0(objK6);
            } else {
                l2 = l;
            }
            h7.J((zp0) objK6, dr0Var2, l2);
        } else {
            dr0Var2 = dr0Var;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            final Long l3 = l2;
            e72VarR.d = new zp0(l3, vp0Var, hqVar, nxVar, nxVar2, r40Var, k40Var, locale, s40Var, gm0Var, i) { // from class: n40
                public final /* synthetic */ Long i;
                public final /* synthetic */ vp0 j;
                public final /* synthetic */ hq k;
                public final /* synthetic */ nx l;
                public final /* synthetic */ nx m;
                public final /* synthetic */ r40 n;
                public final /* synthetic */ k40 o;
                public final /* synthetic */ Locale p;
                public final /* synthetic */ s40 q;
                public final /* synthetic */ gm0 r;

                @Override // defpackage.zp0
                public final Object f(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = m02.A(1794055);
                    q40.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (dr0) obj3, iA);
                    return j23.a;
                }
            };
        }
    }
}
