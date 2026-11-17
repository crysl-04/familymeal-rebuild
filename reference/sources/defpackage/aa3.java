package defpackage;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.Year;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class aa3 implements sh {
    public static final qv A;
    public static final da B;
    public static final g2 C;
    public static final qv D;
    public static final qv E;
    public static final qv F;
    public static final ji2 G;
    public static final qv H;
    public static final qv I;
    public static final qv J;
    public static final float K;
    public static final d13 L;
    public static final r21[] M;
    public static final u92 N;
    public static final r72 O;
    public static final Object P;
    public static final s03 Q;
    public static final s03 R;
    public static final s03 S;
    public static final s03 T;
    public static final s03 U;
    public static final s03 V;
    public static final s03 W;
    public static final s03 X;
    public static final s03 Y;
    public static final float Z = 24.0f;
    public static final float a0 = 24.0f;
    public static final nx k;
    public static final nx l;
    public static final nx m;
    public static final nx n;
    public static final nx o;
    public static final nx p;
    public static final nx q;
    public static final nx r;
    public static final qv x;
    public static final float y;
    public static final float z;
    public static final d13 h = d13.p;
    public static final pt0 i = new pt0(null, (byte) 0);
    public static final pt0 j = new pt0(null, (byte) 1);
    public static final Object s = new Object();
    public static final mm0 t = new mm0(7);
    public static final qv u = qv.r;
    public static final qv v = qv.n;
    public static final float w = 0.1f;

    static {
        byte b = 2;
        k = new nx(127448943, false, new rx(b));
        byte b2 = 19;
        l = new nx(1158807212, false, new ig(b2));
        byte b3 = 20;
        m = new nx(-434034530, false, new ig(b3));
        n = new nx(1085731232, false, new tx(b3));
        byte b4 = 21;
        o = new nx(1387704771, false, new tx(b4));
        byte b5 = 22;
        p = new nx(-1628700650, false, new tx(b5));
        byte b6 = 23;
        q = new nx(878396824, false, new tx(b6));
        r = new nx(-2051349858, false, new ig(b4));
        qv qvVar = qv.o;
        x = qvVar;
        y = 0.38f;
        z = 1.0f;
        A = qv.k;
        B = new da(b);
        C = new g2(new yy((byte) 17), b6);
        D = qv.w;
        E = qv.m;
        F = qv.u;
        G = ji2.j;
        H = qv.t;
        I = qvVar;
        J = qvVar;
        K = 80.0f;
        L = d13.n;
        M = new r21[0];
        N = new u92();
        O = new r72(0.0f, 0.0f, 10.0f, 10.0f);
        P = new Object();
        Q = new s03(new ss2((byte) 18), new h33((byte) 5));
        R = new s03(new ss2(b2), new ss2(b3));
        S = new s03(new ss2(b4), new ss2(b5));
        T = new s03(new ss2(b6), new ss2((byte) 24));
        U = new s03(new ss2((byte) 25), new ss2((byte) 26));
        V = new s03(new ss2((byte) 27), new ss2((byte) 28));
        W = new s03(new ss2((byte) 29), new h33((byte) 0));
        X = new s03(new h33((byte) 1), new h33(b));
        Y = new s03(new h33((byte) 3), new h33((byte) 4));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:9:0x001b->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[SYNTHETIC] */
    public static final boolean A(wg2 wg2Var) {
        if (!z(wg2Var)) {
            rg2 rg2Var = wg2Var.d;
            if (rg2Var.j) {
                return true;
            }
            mj1 mj1Var = rg2Var.h;
            Object[] objArr = mj1Var.b;
            Object[] objArr2 = mj1Var.c;
            long[] jArr = mj1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((ch2) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 == 8) {
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    } else if (i2 != length) {
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public static final z B(Object[] objArr) {
        objArr.getClass();
        return new z(objArr);
    }

    public static final rg1 C(rg1 rg1Var, p21 p21Var, h71 h71Var, ks1 ks1Var, boolean z2) {
        return rg1Var.c(new j71(p21Var, h71Var, ks1Var, z2));
    }

    public static ef2 D(AssetManager assetManager) throws IOException {
        String str;
        String str2;
        yy yyVar;
        String str3;
        vx1 vx1Var;
        as0 as0Var;
        as0 as0Var2;
        p60 p60VarI;
        Set set;
        Iterator it;
        String str4;
        b33 b33Var;
        te1 te1VarJ;
        Set set2;
        zr zrVarK;
        cf2 cf2VarY;
        j62 j62Var;
        int i2;
        int i3;
        te1 te1VarJ2;
        t11 t11Var = ff2.a;
        String strE = E(assetManager, "ingredients.json");
        String strE2 = E(assetManager, "recipes.json");
        String strE3 = E(assetManager, "persons.json");
        String strE4 = E(assetManager, "schedule.json");
        int value = Year.now().getValue();
        Iterator it2 = lt.Q(strE, strE2, strE3, strE4).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).length() > 5242880) {
                throw new g40(lt.P("file too large"));
            }
        }
        try {
            t11 t11Var2 = ff2.a;
            jy1 jy1Var = t11Var2.b;
            List list = (List) t11Var2.a(new lh(bw0.Companion.serializer()), strE);
            try {
                List list2 = (List) t11Var2.a(new lh(q62.Companion.serializer()), strE2);
                try {
                    List list3 = (List) t11Var2.a(new lh(vx1.Companion.serializer()), strE3);
                    try {
                        Map map = (Map) t11Var2.a(new ka1(new ka1(ia2.l(new lh(bo2.a)))), strE4);
                        b33 b33Var2 = new b33();
                        b33Var2.b(list.size(), 1, 2000, "ingredients.count");
                        ArrayList arrayList = new ArrayList(ev.o0(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((bw0) it3.next()).a);
                        }
                        int size = dv.U0(arrayList).size();
                        int size2 = list.size();
                        ArrayList arrayList2 = b33Var2.a;
                        if (size != size2) {
                            arrayList2.add("ingredients: duplicate id");
                        }
                        ArrayList arrayList3 = new ArrayList(ev.o0(list, 10));
                        Iterator it4 = list.iterator();
                        while (true) {
                            str = ": ";
                            str2 = ".";
                            if (!it4.hasNext()) {
                                break;
                            }
                            bw0 bw0Var = (bw0) it4.next();
                            String str5 = bw0Var.a;
                            String str6 = bw0Var.b;
                            String str7 = bw0Var.c;
                            ep1 ep1Var = bw0Var.d;
                            Map map2 = map;
                            int i4 = value;
                            uv0 uv0Var = new uv0(str5, str6, str7, new bp1(ep1Var.a, ep1Var.b, ep1Var.c, ep1Var.d, ep1Var.e));
                            ListIterator listIterator = bh0.c(uv0Var).listIterator(0);
                            while (true) {
                                ht0 ht0Var = (ht0) listIterator;
                                if (ht0Var.hasNext()) {
                                    m32 m32Var = (m32) ht0Var.next();
                                    String strF0 = co2.f0(64, bw0Var.a);
                                    String str8 = m32Var.a;
                                    String str9 = m32Var.b;
                                    StringBuilder sbL = wi0.l("ingredient ", strF0, ".", str8, ": ");
                                    sbL.append(str9);
                                    arrayList2.add(sbL.toString());
                                }
                            }
                            arrayList3.add(uv0Var);
                            value = i4;
                            map = map2;
                        }
                        Map map3 = map;
                        int i5 = value;
                        ArrayList arrayList4 = new ArrayList(ev.o0(arrayList3, 10));
                        int size3 = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            Object obj = arrayList3.get(i6);
                            i6++;
                            arrayList4.add(((uv0) obj).a);
                        }
                        Set setU0 = dv.U0(arrayList4);
                        b33Var2.b(list2.size(), 1, 2000, "recipes.count");
                        ArrayList arrayList5 = new ArrayList(ev.o0(list2, 10));
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(((q62) it5.next()).a);
                        }
                        if (dv.U0(arrayList5).size() != list2.size()) {
                            arrayList2.add("recipes: duplicate id");
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it6 = list2.iterator();
                        while (true) {
                            boolean zHasNext = it6.hasNext();
                            yyVar = te1.j;
                            if (!zHasNext) {
                                break;
                            }
                            q62 q62Var = (q62) it6.next();
                            String str10 = q62Var.a;
                            List list4 = q62Var.i;
                            String strConcat = "recipe ".concat(co2.f0(64, str10));
                            if (dv.U0(list4).size() != list4.size()) {
                                arrayList2.add(strConcat.concat(".tags: duplicate tag"));
                            }
                            List<String> list5 = q62Var.c;
                            ArrayList arrayList7 = new ArrayList();
                            for (String str11 : list5) {
                                String strConcat2 = strConcat.concat(".meal_types");
                                try {
                                    yyVar.getClass();
                                    te1VarJ2 = yy.j(str11);
                                } catch (IllegalArgumentException e) {
                                    String message = e.getMessage();
                                    arrayList2.add(strConcat2 + ": " + (message != null ? co2.f0(80, message) : null));
                                    te1VarJ2 = null;
                                }
                                if (te1VarJ2 != null) {
                                    arrayList7.add(te1VarJ2);
                                }
                                it6 = it6;
                            }
                            Iterator it7 = it6;
                            Set setU1 = dv.U0(arrayList7);
                            String strConcat3 = strConcat.concat(".category");
                            try {
                                vz1 vz1Var = zr.i;
                                String str12 = q62Var.d;
                                vz1Var.getClass();
                                zrVarK = vz1.k(str12);
                            } catch (IllegalArgumentException e2) {
                                String message2 = e2.getMessage();
                                arrayList2.add(strConcat3 + ": " + (message2 != null ? co2.f0(80, message2) : null));
                                zrVarK = null;
                            }
                            String strConcat4 = strConcat.concat(".season");
                            try {
                                jy1 jy1Var2 = cf2.i;
                                String str13 = q62Var.j;
                                jy1Var2.getClass();
                                cf2VarY = jy1.y(str13);
                            } catch (IllegalArgumentException e3) {
                                String message3 = e3.getMessage();
                                arrayList2.add(strConcat4 + ": " + (message3 != null ? co2.f0(80, message3) : null));
                                cf2VarY = null;
                            }
                            b33Var2.b(q62Var.e, 1, 20, strConcat.concat(".base_servings"));
                            b33Var2.b(q62Var.f, 1, 20, strConcat.concat(".min_diners"));
                            if (zrVarK != null && cf2VarY != null && (i2 = q62Var.e) >= 1 && (i3 = q62Var.f) >= 1) {
                                String str14 = q62Var.a;
                                String str15 = q62Var.b;
                                List list6 = q62Var.g;
                                ArrayList arrayList8 = new ArrayList(ev.o0(list6, 10));
                                Iterator it8 = list6.iterator();
                                while (it8.hasNext()) {
                                    c72 c72Var = (c72) it8.next();
                                    arrayList8.add(new z62(c72Var.a, c72Var.b));
                                    it8 = it8;
                                    str15 = str15;
                                }
                                ep1 ep1Var2 = q62Var.h;
                                j62Var = new j62(str14, str15, setU1, zrVarK, i2, i3, arrayList8, new bp1(ep1Var2.a, ep1Var2.b, ep1Var2.c, ep1Var2.d, ep1Var2.e), dv.U0(list4), cf2VarY, q62Var.k);
                                ListIterator listIterator2 = bh0.g(j62Var, setU0).listIterator(0);
                                while (true) {
                                    ht0 ht0Var2 = (ht0) listIterator2;
                                    if (!ht0Var2.hasNext()) {
                                        break;
                                    }
                                    m32 m32Var2 = (m32) ht0Var2.next();
                                    arrayList2.add(jp1.k(strConcat, ".", m32Var2.a, ": ", m32Var2.b));
                                }
                            } else {
                                j62Var = null;
                            }
                            if (j62Var != null) {
                                arrayList6.add(j62Var);
                            }
                            it6 = it7;
                        }
                        Double dValueOf = Double.valueOf(1000.0d);
                        b33Var2.b(list3.size(), 1, 20, "persons.count");
                        ArrayList arrayList9 = new ArrayList(ev.o0(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList9.add(((vx1) it9.next()).a);
                        }
                        if (dv.U0(arrayList9).size() != list3.size()) {
                            arrayList2.add("persons: duplicate id");
                        }
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it10 = list3.iterator();
                        while (true) {
                            str3 = "person ";
                            if (!it10.hasNext()) {
                                break;
                            }
                            vx1 vx1Var2 = (vx1) it10.next();
                            String str16 = vx1Var2.a;
                            String str17 = str2;
                            List list7 = vx1Var2.g;
                            String str18 = vx1Var2.b;
                            Iterator it11 = it10;
                            List list8 = list3;
                            String strConcat5 = "person ".concat(co2.f0(64, str16));
                            if (!b33.b.b(str16)) {
                                arrayList2.add(strConcat5 + ": invalid id '" + co2.f0(80, str16) + "'");
                            }
                            b33Var2.c(40, str18, strConcat5.concat(".name"));
                            b33Var2.b(vx1Var2.c, 1, 120, strConcat5.concat(".age"));
                            if (!gi.c0(new String[]{"male", "female"}).contains(vx1Var2.d)) {
                                arrayList2.add(strConcat5.concat(".gender: must be male/female"));
                            }
                            Iterator it12 = list7.iterator();
                            while (it12.hasNext()) {
                                b33Var2.c(20, (String) it12.next(), strConcat5.concat(".excluded"));
                            }
                            vs2 vs2Var = vx1Var2.f;
                            q52 q52Var = vs2Var.a;
                            q52 q52Var2 = vs2Var.e;
                            q52 q52Var3 = vs2Var.d;
                            q52 q52Var4 = vs2Var.c;
                            q52 q52Var5 = vs2Var.b;
                            yy yyVar2 = yyVar;
                            ArrayList arrayList11 = arrayList3;
                            Iterator it13 = lt.Q(new wt1(q52Var, Double.valueOf(6000.0d)), new wt1(q52Var5, dValueOf), new wt1(q52Var4, dValueOf), new wt1(q52Var3, dValueOf), new wt1(q52Var2, dValueOf)).iterator();
                            boolean z2 = true;
                            while (it13.hasNext()) {
                                wt1 wt1Var = (wt1) it13.next();
                                q52 q52Var6 = (q52) wt1Var.h;
                                double dDoubleValue = ((Number) wt1Var.i).doubleValue();
                                String str19 = str16;
                                String str20 = str;
                                double d = q52Var6.a;
                                String str21 = str18;
                                Double d2 = q52Var6.b;
                                Double d3 = dValueOf;
                                String str22 = str17;
                                List list9 = list7;
                                Iterator it14 = it13;
                                boolean z3 = z2;
                                b33Var2.a(d, 0.0d, dDoubleValue, strConcat5.concat(".target.min"));
                                if (d2 != null) {
                                    b33Var2 = b33Var2;
                                    b33Var2.a(d2.doubleValue(), q52Var6.a, dDoubleValue, strConcat5.concat(".target.max"));
                                }
                                if (Math.abs(d) > Double.MAX_VALUE || d < 0.0d || (d2 != null && (Math.abs(d2.doubleValue()) > Double.MAX_VALUE || d2.doubleValue() < d))) {
                                    z3 = false;
                                }
                                list7 = list9;
                                str = str20;
                                str17 = str22;
                                str16 = str19;
                                str18 = str21;
                                it13 = it14;
                                dValueOf = d3;
                                z2 = z3;
                                q52Var5 = q52Var5;
                            }
                            Double d4 = dValueOf;
                            boolean z4 = z2;
                            String str23 = str;
                            String str24 = str17;
                            rx1 rx1Var = !z4 ? null : new rx1(str16, str18, new e40(ff2.a(vs2Var.a), ff2.a(q52Var5), ff2.a(q52Var4), ff2.a(q52Var3), ff2.a(q52Var2)), dv.U0(list7));
                            if (rx1Var != null) {
                                arrayList10.add(rx1Var);
                            }
                            str = str23;
                            str2 = str24;
                            it10 = it11;
                            list3 = list8;
                            arrayList6 = arrayList6;
                            arrayList3 = arrayList11;
                            yyVar = yyVar2;
                            dValueOf = d4;
                        }
                        List list10 = list3;
                        ArrayList arrayList12 = arrayList6;
                        yy yyVar3 = yyVar;
                        ArrayList arrayList13 = arrayList3;
                        String str25 = str;
                        String str26 = str2;
                        ArrayList arrayList14 = new ArrayList(ev.o0(arrayList10, 10));
                        int size4 = arrayList10.size();
                        int i7 = 0;
                        while (i7 < size4) {
                            Object obj2 = arrayList10.get(i7);
                            i7++;
                            arrayList14.add(((rx1) obj2).a);
                        }
                        Set setU2 = dv.U0(arrayList14);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it15 = map3.entrySet().iterator();
                        while (it15.hasNext()) {
                            Map.Entry entry = (Map.Entry) it15.next();
                            String str27 = (String) entry.getKey();
                            Map map4 = (Map) entry.getValue();
                            try {
                                p60.j.getClass();
                                p60VarI = yy.i(str27);
                            } catch (IllegalArgumentException e4) {
                                String message4 = e4.getMessage();
                                arrayList2.add("schedule.day: " + (message4 != null ? co2.f0(80, message4) : null));
                                p60VarI = null;
                            }
                            if (p60VarI == null) {
                                set = setU2;
                                it = it15;
                                str4 = str3;
                                b33Var = b33Var2;
                            } else {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                Iterator it16 = map4.entrySet().iterator();
                                while (it16.hasNext()) {
                                    Map.Entry entry2 = (Map.Entry) it16.next();
                                    Iterator it17 = it15;
                                    String str28 = (String) entry2.getKey();
                                    List<String> list11 = (List) entry2.getValue();
                                    b33 b33Var3 = b33Var2;
                                    Iterator it18 = it16;
                                    String strH = wi0.h("schedule.", str27, ".meal");
                                    try {
                                        yyVar3.getClass();
                                        te1VarJ = yy.j(str28);
                                    } catch (IllegalArgumentException e5) {
                                        String message5 = e5.getMessage();
                                        arrayList2.add(strH + str25 + (message5 != null ? co2.f0(80, message5) : null));
                                        te1VarJ = null;
                                    }
                                    if (te1VarJ == null) {
                                        set2 = setU2;
                                    } else {
                                        if (list11 == null) {
                                            list11 = ag0.h;
                                        }
                                        if (dv.U0(list11).size() != list11.size()) {
                                            arrayList2.add(jp1.k("schedule.", str27, str26, str28, ": duplicate person"));
                                        }
                                        for (String str29 : list11) {
                                            if (!setU2.contains(str29)) {
                                                String strF1 = co2.f0(64, str29);
                                                StringBuilder sbL2 = wi0.l("schedule.", str27, str26, str28, ": unknown person '");
                                                sbL2.append(strF1);
                                                sbL2.append("'");
                                                arrayList2.add(sbL2.toString());
                                            }
                                            setU2 = setU2;
                                        }
                                        set2 = setU2;
                                        linkedHashMap2.put(te1VarJ, dv.w0(list11));
                                    }
                                    it15 = it17;
                                    b33Var2 = b33Var3;
                                    it16 = it18;
                                    str3 = str3;
                                    setU2 = set2;
                                }
                                set = setU2;
                                it = it15;
                                str4 = str3;
                                b33Var = b33Var2;
                                linkedHashMap.put(p60VarI, linkedHashMap2);
                            }
                            it15 = it;
                            b33Var2 = b33Var;
                            str3 = str4;
                            setU2 = set;
                        }
                        String str30 = str3;
                        b33 b33Var4 = b33Var2;
                        ed2 ed2Var = new ed2(linkedHashMap);
                        b33Var4.d();
                        ArrayList arrayList15 = new ArrayList(ev.o0(arrayList10, 10));
                        int size5 = arrayList10.size();
                        int i8 = 0;
                        while (i8 < size5) {
                            Object obj3 = arrayList10.get(i8);
                            i8++;
                            rx1 rx1Var2 = (rx1) obj3;
                            Iterator it19 = list10.iterator();
                            do {
                                if (!it19.hasNext()) {
                                    li1.m("Collection contains no element matching the predicate.");
                                    return null;
                                }
                                vx1Var = (vx1) it19.next();
                            } while (!uz0.g(vx1Var.a, rx1Var2.a));
                            int i9 = vx1Var.c;
                            String str31 = vx1Var.e;
                            int i10 = i5 - i9;
                            boolean z5 = i9 < 18;
                            String str32 = rx1Var2.a;
                            String str33 = rx1Var2.b;
                            ir0 ir0Var = uz0.g(vx1Var.d, "male") ? ir0.i : ir0.j;
                            Integer numValueOf = Integer.valueOf(i10);
                            if (z5) {
                                as0Var2 = as0.l;
                            } else {
                                boolean zG = uz0.g(str31, "growth");
                                as0 as0Var3 = as0.j;
                                if (zG || !jo2.N(str31, "fat_loss")) {
                                    as0Var = as0Var3;
                                } else {
                                    as0Var2 = as0.i;
                                }
                                arrayList15.add(new dy1(str32, str33, ir0Var, numValueOf, null, null, i3.LIGHT, as0Var, null, lt1.k, rx1Var2.d, rx1Var2.c, 0.0d, null));
                            }
                            as0Var = as0Var2;
                            arrayList15.add(new dy1(str32, str33, ir0Var, numValueOf, null, null, i3.LIGHT, as0Var, null, lt1.k, rx1Var2.d, rx1Var2.c, 0.0d, null));
                        }
                        int size6 = arrayList15.size();
                        int i11 = 0;
                        while (i11 < size6) {
                            Object obj4 = arrayList15.get(i11);
                            i11++;
                            dy1 dy1Var = (dy1) obj4;
                            int i12 = i5;
                            ListIterator listIterator3 = bh0.f(dy1Var, i12).listIterator(0);
                            while (true) {
                                ht0 ht0Var3 = (ht0) listIterator3;
                                if (ht0Var3.hasNext()) {
                                    m32 m32Var3 = (m32) ht0Var3.next();
                                    String str34 = dy1Var.a;
                                    String str35 = m32Var3.a;
                                    String str36 = m32Var3.b;
                                    StringBuilder sbL3 = wi0.l(str30, str34, str26, str35, str25);
                                    sbL3.append(str36);
                                    arrayList2.add(sbL3.toString());
                                }
                            }
                            i5 = i12;
                        }
                        b33Var4.d();
                        return new ef2(arrayList13, arrayList12, arrayList10, ed2Var, arrayList15);
                    } catch (wh2 e6) {
                        String message6 = e6.getMessage();
                        throw new g40(lt.P("schedule: malformed JSON (" + (message6 != null ? co2.f0(200, message6) : null) + ")"));
                    } catch (IllegalArgumentException e7) {
                        String message7 = e7.getMessage();
                        throw new g40(lt.P("schedule: malformed JSON (" + (message7 != null ? co2.f0(200, message7) : null) + ")"));
                    }
                } catch (wh2 e8) {
                    String message8 = e8.getMessage();
                    throw new g40(lt.P("persons: malformed JSON (" + (message8 != null ? co2.f0(200, message8) : null) + ")"));
                } catch (IllegalArgumentException e9) {
                    String message9 = e9.getMessage();
                    throw new g40(lt.P("persons: malformed JSON (" + (message9 != null ? co2.f0(200, message9) : null) + ")"));
                }
            } catch (wh2 e10) {
                String message10 = e10.getMessage();
                throw new g40(lt.P("recipes: malformed JSON (" + (message10 != null ? co2.f0(200, message10) : null) + ")"));
            } catch (IllegalArgumentException e11) {
                String message11 = e11.getMessage();
                throw new g40(lt.P("recipes: malformed JSON (" + (message11 != null ? co2.f0(200, message11) : null) + ")"));
            }
        } catch (wh2 e12) {
            String message12 = e12.getMessage();
            throw new g40(lt.P("ingredients: malformed JSON (" + (message12 != null ? co2.f0(200, message12) : null) + ")"));
        } catch (IllegalArgumentException e13) {
            String message13 = e13.getMessage();
            throw new g40(lt.P("ingredients: malformed JSON (" + (message13 != null ? co2.f0(200, message13) : null) + ")"));
        }
    }

    public static final String E(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            inputStreamOpen.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStreamOpen.available()));
            byte[] bArr = new byte[8192];
            for (int i2 = inputStreamOpen.read(bArr); i2 >= 0; i2 = inputStreamOpen.read(bArr)) {
                byteArrayOutputStream.write(bArr, 0, i2);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            String str2 = new String(byteArray, ws.a);
            inputStreamOpen.close();
            return str2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vs.s(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    public static rg1 F(rg1 rg1Var, tt1 tt1Var, ln lnVar) {
        return rg1Var.c(new ut1(tt1Var, y00.a, lnVar));
    }

    public static final void G(ik2 ik2Var, int i2, Object obj) {
        int iG = ik2Var.g(i2);
        Object[] objArr = ik2Var.c;
        Object obj2 = objArr[iG];
        objArr[iG] = zy.a;
        if (obj == obj2) {
            return;
        }
        ez.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    public static final void H(ArrayList arrayList, int i2, int i3) {
        int iM = m(arrayList, i2);
        if (iM < 0) {
            iM = -(iM + 1);
        }
        while (iM < arrayList.size() && ((c01) arrayList.get(iM)).b < i3) {
        }
    }

    public static final rg1 I(cv2 cv2Var) {
        return new it2(cv2Var);
    }

    public static String J(int i2) {
        if (i2 == 0) {
            return "Clear";
        }
        if (i2 == 1) {
            return "Src";
        }
        if (i2 == 2) {
            return "Dst";
        }
        if (i2 == 3) {
            return "SrcOver";
        }
        if (i2 == 4) {
            return "DstOver";
        }
        if (i2 == 5) {
            return "SrcIn";
        }
        if (i2 == 6) {
            return "DstIn";
        }
        if (i2 == 7) {
            return "SrcOut";
        }
        if (i2 == 8) {
            return "DstOut";
        }
        if (i2 == 9) {
            return "SrcAtop";
        }
        if (i2 == 10) {
            return "DstAtop";
        }
        if (i2 == 11) {
            return "Xor";
        }
        if (i2 == 12) {
            return "Plus";
        }
        if (i2 == 13) {
            return "Modulate";
        }
        if (i2 == 14) {
            return "Screen";
        }
        if (i2 == 15) {
            return "Overlay";
        }
        if (i2 == 16) {
            return "Darken";
        }
        if (i2 == 17) {
            return "Lighten";
        }
        if (i2 == 18) {
            return "ColorDodge";
        }
        if (i2 == 19) {
            return "ColorBurn";
        }
        if (i2 == 20) {
            return "HardLight";
        }
        if (i2 == 21) {
            return "Softlight";
        }
        if (i2 == 22) {
            return "Difference";
        }
        if (i2 == 23) {
            return "Exclusion";
        }
        if (i2 == 24) {
            return "Multiply";
        }
        if (i2 == 25) {
            return "Hue";
        }
        if (i2 == 26) {
            return "Saturation";
        }
        if (i2 == 27) {
            return "Color";
        }
        return i2 == 28 ? "Luminosity" : "Unknown";
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010b  */
    /* JADX WARN: Code duplicated, block: B:101:0x010e  */
    /* JADX WARN: Code duplicated, block: B:105:0x011e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:109:0x012a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0137  */
    /* JADX WARN: Code duplicated, block: B:123:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x015c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0161  */
    /* JADX WARN: Code duplicated, block: B:129:0x0167  */
    /* JADX WARN: Code duplicated, block: B:132:0x0176  */
    /* JADX WARN: Code duplicated, block: B:134:0x0184  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:153:0x0202  */
    /* JADX WARN: Code duplicated, block: B:156:0x0207  */
    /* JADX WARN: Code duplicated, block: B:158:0x020b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0212  */
    /* JADX WARN: Code duplicated, block: B:162:0x022d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0244  */
    /* JADX WARN: Code duplicated, block: B:167:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x0262  */
    /* JADX WARN: Code duplicated, block: B:172:0x027e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0289  */
    /* JADX WARN: Code duplicated, block: B:180:0x0291  */
    /* JADX WARN: Code duplicated, block: B:181:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:184:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:186:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:192:0x02da  */
    /* JADX WARN: Code duplicated, block: B:194:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:204:0x031e  */
    /* JADX WARN: Code duplicated, block: B:205:0x032a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0332  */
    /* JADX WARN: Code duplicated, block: B:210:0x0383  */
    /* JADX WARN: Code duplicated, block: B:213:0x0393  */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00be  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:98:0x0103  */
    public static final void a(final kp0 kp0Var, rg1 rg1Var, boolean z2, hi2 hi2Var, lp lpVar, qp qpVar, zn znVar, rt1 rt1Var, final aq0 aq0Var, dr0 dr0Var, final int i2, final int i3) {
        int i4;
        rg1 rg1Var2;
        int i5;
        boolean z3;
        int i6;
        hi2 hi2VarA;
        lp lpVar2;
        qp qpVar2;
        int i7;
        zn znVar2;
        int i8;
        int i9;
        rt1 rt1Var2;
        int i10;
        int i11;
        boolean z4;
        boolean z5;
        final rt1 rt1Var3;
        final rg1 rg1Var3;
        final boolean z6;
        final hi2 hi2Var2;
        final lp lpVar3;
        final qp qpVar3;
        final zn znVar3;
        e72 e72VarR;
        int i12;
        lp lpVar4;
        rt1 rt1Var4;
        lp lpVar5;
        boolean z7;
        hi2 hi2Var3;
        zn znVar4;
        int i13;
        rt1 rt1Var5;
        rg1 rg1Var4;
        pv pvVar;
        Object objK;
        Object obj;
        ui1 ui1Var;
        long j2;
        long j3;
        long j4;
        int i14;
        Object objK2;
        ll2 ll2Var;
        boolean zF;
        Object objK3;
        gz0 gz0Var;
        float f;
        Object objK4;
        tb tbVar;
        boolean zH;
        Object objK5;
        qp qpVar4;
        dd ddVar;
        float f2;
        Object objK6;
        int i15;
        dr0Var.W(-1310015664);
        if ((i2 & 6) == 0) {
            i4 = (dr0Var.h(kp0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i16 = i3 & 2;
        if (i16 == 0) {
            if ((i2 & 48) == 0) {
                rg1Var2 = rg1Var;
                i4 |= dr0Var.f(rg1Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    z3 = z2;
                    if (dr0Var.g(z3)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        hi2VarA = hi2Var;
                        int i17 = dr0Var.f(hi2VarA) ? 2048 : 1024;
                        i4 |= i17;
                    } else {
                        hi2VarA = hi2Var;
                    }
                    i4 |= i17;
                } else {
                    hi2VarA = hi2Var;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        lpVar2 = lpVar;
                        int i18 = dr0Var.f(lpVar2) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
                        i4 |= i18;
                    } else {
                        lpVar2 = lpVar;
                    }
                    i4 |= i18;
                } else {
                    lpVar2 = lpVar;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        qpVar2 = qpVar;
                        int i19 = dr0Var.f(qpVar2) ? 131072 : 65536;
                        i4 |= i19;
                    } else {
                        qpVar2 = qpVar;
                    }
                    i4 |= i19;
                } else {
                    qpVar2 = qpVar;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    if ((1572864 & i2) == 0) {
                        znVar2 = znVar;
                        if (dr0Var.f(znVar2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                        i4 |= 12582912;
                        rt1Var2 = rt1Var;
                    } else {
                        rt1Var2 = rt1Var;
                        if ((i2 & 12582912) == 0) {
                            if (dr0Var.f(rt1Var2)) {
                                i10 = 8388608;
                            } else {
                                i10 = 4194304;
                            }
                            i4 |= i10;
                        }
                    }
                    if ((i3 & 256) != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dr0Var.f(null)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i4 |= i11;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (dr0Var.h(aq0Var)) {
                            i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                        } else {
                            i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                        i4 |= i15;
                    }
                    z4 = true;
                    if ((i4 & 306783379) != 306783378) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dr0Var.N(i4 & 1, z5)) {
                        dr0Var.S();
                        i12 = -458753;
                        if ((i2 & 1) != 0 || dr0Var.x()) {
                            if (i16 != 0) {
                                rg1Var2 = og1.h;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                rt1 rt1Var6 = mp.a;
                                i4 &= -7169;
                                hi2VarA = mi2.a(uz0.k, dr0Var);
                            }
                            if ((i3 & 16) != 0) {
                                rt1 rt1Var7 = mp.a;
                                pvVar = (pv) dr0Var.j(rv.a);
                                lpVar4 = pvVar.W;
                                if (lpVar4 == null) {
                                    lp lpVar6 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                                    pvVar.W = lpVar6;
                                    lpVar4 = lpVar6;
                                }
                                i4 &= -57345;
                            } else {
                                i12 = -458753;
                                lpVar4 = lpVar2;
                            }
                            if ((i3 & 32) != 0) {
                                rt1 rt1Var8 = mp.a;
                                i4 &= i12;
                                qpVar2 = new qp(z);
                            }
                            if (i7 != 0) {
                                znVar2 = null;
                            }
                            if (i9 != 0) {
                                rt1Var4 = mp.a;
                            } else {
                                rt1Var4 = rt1Var2;
                            }
                            lpVar5 = lpVar4;
                            z7 = z3;
                            hi2Var3 = hi2VarA;
                            znVar4 = znVar2;
                            i13 = i4;
                            rt1Var5 = rt1Var4;
                            rg1Var4 = rg1Var2;
                        } else {
                            dr0Var.Q();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            i13 = i4;
                            rg1Var4 = rg1Var2;
                            z7 = z3;
                            lpVar5 = lpVar2;
                            rt1Var5 = rt1Var2;
                            hi2Var3 = hi2VarA;
                            znVar4 = znVar2;
                        }
                        dr0Var.q();
                        dr0Var.V(1691738187);
                        objK = dr0Var.K();
                        obj = zy.a;
                        if (objK == obj) {
                            objK = new ui1();
                            dr0Var.f0(objK);
                        }
                        ui1Var = (ui1) objK;
                        dr0Var.p(false);
                        if (z7) {
                            j2 = lpVar5.a;
                        } else {
                            j2 = lpVar5.c;
                        }
                        if (z7) {
                            j3 = lpVar5.b;
                        } else {
                            j3 = lpVar5.d;
                        }
                        j4 = j3;
                        if (qpVar2 == null) {
                            dr0Var.V(1691921830);
                            dr0Var.p(false);
                            rt1Var5 = rt1Var5;
                            j4 = j4;
                            znVar4 = znVar4;
                            ui1Var = ui1Var;
                            qpVar4 = qpVar2;
                            ddVar = null;
                        } else {
                            dr0Var.V(-499611205);
                            i14 = ((i13 >> 9) & 896) | ((i13 >> 6) & 14);
                            objK2 = dr0Var.K();
                            if (objK2 == obj) {
                                objK2 = new ll2();
                                dr0Var.f0(objK2);
                            }
                            ll2Var = (ll2) objK2;
                            zF = dr0Var.f(ui1Var);
                            objK3 = dr0Var.K();
                            if (zF || objK3 == obj) {
                                objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                                dr0Var.f0(objK3);
                            }
                            h7.J((zp0) objK3, dr0Var, ui1Var);
                            gz0Var = (gz0) dv.G0(ll2Var);
                            if (z7 || (gz0Var instanceof m22) || !(gz0Var instanceof ut0)) {
                                f = 0.0f;
                            } else {
                                f = qpVar2.a;
                            }
                            objK4 = dr0Var.K();
                            if (objK4 == obj) {
                                objK4 = new tb(new cc0(f), S, null, 12);
                                dr0Var.f0(objK4);
                            }
                            tbVar = (tb) objK4;
                            cc0 cc0Var = new cc0(f);
                            boolean zH2 = dr0Var.h(tbVar) | dr0Var.c(f) | ((((i14 & 14) ^ 6) <= 4 && dr0Var.g(z7)) || (i14 & 6) == 4);
                            if ((((i14 & 896) ^ 384) > 256 || !dr0Var.f(qpVar2)) && (i14 & 384) != 256) {
                            }
                            zH = zH2 | z4 | dr0Var.h(gz0Var);
                            objK5 = dr0Var.K();
                            if (!zH || objK5 == obj) {
                                qp qpVar5 = qpVar2;
                                objK5 = new pp(tbVar, f, z7, qpVar5, gz0Var, (m10) null);
                                qpVar4 = qpVar5;
                                dr0Var.f0(objK5);
                            } else {
                                qpVar4 = qpVar2;
                            }
                            h7.J((zp0) objK5, dr0Var, cc0Var);
                            ddVar = tbVar.c;
                            dr0Var.p(false);
                        }
                        if (ddVar != null) {
                            f2 = ((cc0) ddVar.i.getValue()).h;
                        } else {
                            f2 = 0.0f;
                        }
                        objK6 = dr0Var.K();
                        if (objK6 == obj) {
                            objK6 = new s0((byte) 27);
                            dr0Var.f0(objK6);
                        }
                        long j5 = j4;
                        zn znVar5 = znVar4;
                        iq2.c(kp0Var, tg2.a(rg1Var4, false, (vp0) objK6), z7, hi2Var3, j2, j5, 0.0f, f2, znVar5, ui1Var, dt.N(-535639973, new up(j5, rt1Var5, aq0Var, (byte) 0), dr0Var), dr0Var, (i13 & 8078) | ((i13 << 6) & 234881024), 64);
                        z6 = z7;
                        znVar3 = znVar5;
                        qpVar3 = qpVar4;
                        rg1Var3 = rg1Var4;
                        lpVar3 = lpVar5;
                        rt1Var3 = rt1Var5;
                        hi2Var2 = hi2Var3;
                    } else {
                        dr0Var.Q();
                        rt1Var3 = rt1Var2;
                        rg1Var3 = rg1Var2;
                        z6 = z3;
                        hi2Var2 = hi2VarA;
                        lpVar3 = lpVar2;
                        qpVar3 = qpVar2;
                        znVar3 = znVar2;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: sp
                            @Override // defpackage.zp0
                            public final Object f(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                aa3.a(kp0Var, rg1Var3, z6, hi2Var2, lpVar3, qpVar3, znVar3, rt1Var3, aq0Var, (dr0) obj2, m02.A(i2 | 1), i3);
                                return j23.a;
                            }
                        };
                    }
                }
                i4 |= 1572864;
                znVar2 = znVar;
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                    rt1Var2 = rt1Var;
                } else {
                    rt1Var2 = rt1Var;
                    if ((i2 & 12582912) == 0) {
                        if (dr0Var.f(rt1Var2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dr0Var.f(null)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i2 & 805306368) == 0) {
                    if (dr0Var.h(aq0Var)) {
                        i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                    } else {
                        i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i4 |= i15;
                }
                z4 = true;
                if ((i4 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dr0Var.N(i4 & 1, z5)) {
                    dr0Var.S();
                    i12 = -458753;
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            rg1Var2 = og1.h;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            rt1 rt1Var9 = mp.a;
                            i4 &= -7169;
                            hi2VarA = mi2.a(uz0.k, dr0Var);
                        }
                        if ((i3 & 16) != 0) {
                            rt1 rt1Var10 = mp.a;
                            pvVar = (pv) dr0Var.j(rv.a);
                            lpVar4 = pvVar.W;
                            if (lpVar4 == null) {
                                lp lpVar7 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                                pvVar.W = lpVar7;
                                lpVar4 = lpVar7;
                            }
                            i4 &= -57345;
                        } else {
                            i12 = -458753;
                            lpVar4 = lpVar2;
                        }
                        if ((i3 & 32) != 0) {
                            rt1 rt1Var11 = mp.a;
                            i4 &= i12;
                            qpVar2 = new qp(z);
                        }
                        if (i7 != 0) {
                            znVar2 = null;
                        }
                        if (i9 != 0) {
                            rt1Var4 = mp.a;
                        } else {
                            rt1Var4 = rt1Var2;
                        }
                        lpVar5 = lpVar4;
                        z7 = z3;
                        hi2Var3 = hi2VarA;
                        znVar4 = znVar2;
                        i13 = i4;
                        rt1Var5 = rt1Var4;
                        rg1Var4 = rg1Var2;
                    } else {
                        if (i16 != 0) {
                            rg1Var2 = og1.h;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            rt1 rt1Var12 = mp.a;
                            i4 &= -7169;
                            hi2VarA = mi2.a(uz0.k, dr0Var);
                        }
                        if ((i3 & 16) != 0) {
                            rt1 rt1Var13 = mp.a;
                            pvVar = (pv) dr0Var.j(rv.a);
                            lpVar4 = pvVar.W;
                            if (lpVar4 == null) {
                                lp lpVar8 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                                pvVar.W = lpVar8;
                                lpVar4 = lpVar8;
                            }
                            i4 &= -57345;
                        } else {
                            i12 = -458753;
                            lpVar4 = lpVar2;
                        }
                        if ((i3 & 32) != 0) {
                            rt1 rt1Var14 = mp.a;
                            i4 &= i12;
                            qpVar2 = new qp(z);
                        }
                        if (i7 != 0) {
                            znVar2 = null;
                        }
                        if (i9 != 0) {
                            rt1Var4 = mp.a;
                        } else {
                            rt1Var4 = rt1Var2;
                        }
                        lpVar5 = lpVar4;
                        z7 = z3;
                        hi2Var3 = hi2VarA;
                        znVar4 = znVar2;
                        i13 = i4;
                        rt1Var5 = rt1Var4;
                        rg1Var4 = rg1Var2;
                    }
                    dr0Var.q();
                    dr0Var.V(1691738187);
                    objK = dr0Var.K();
                    obj = zy.a;
                    if (objK == obj) {
                        objK = new ui1();
                        dr0Var.f0(objK);
                    }
                    ui1Var = (ui1) objK;
                    dr0Var.p(false);
                    if (z7) {
                        j2 = lpVar5.a;
                    } else {
                        j2 = lpVar5.c;
                    }
                    if (z7) {
                        j3 = lpVar5.b;
                    } else {
                        j3 = lpVar5.d;
                    }
                    j4 = j3;
                    if (qpVar2 == null) {
                        dr0Var.V(1691921830);
                        dr0Var.p(false);
                        rt1Var5 = rt1Var5;
                        j4 = j4;
                        znVar4 = znVar4;
                        ui1Var = ui1Var;
                        qpVar4 = qpVar2;
                        ddVar = null;
                    } else {
                        dr0Var.V(-499611205);
                        i14 = ((i13 >> 9) & 896) | ((i13 >> 6) & 14);
                        objK2 = dr0Var.K();
                        if (objK2 == obj) {
                            objK2 = new ll2();
                            dr0Var.f0(objK2);
                        }
                        ll2Var = (ll2) objK2;
                        zF = dr0Var.f(ui1Var);
                        objK3 = dr0Var.K();
                        if (zF) {
                            objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                            dr0Var.f0(objK3);
                        } else {
                            objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                            dr0Var.f0(objK3);
                        }
                        h7.J((zp0) objK3, dr0Var, ui1Var);
                        gz0Var = (gz0) dv.G0(ll2Var);
                        if (z7) {
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                        }
                        objK4 = dr0Var.K();
                        if (objK4 == obj) {
                            objK4 = new tb(new cc0(f), S, null, 12);
                            dr0Var.f0(objK4);
                        }
                        tbVar = (tb) objK4;
                        cc0 cc0Var2 = new cc0(f);
                        boolean zH3 = dr0Var.h(tbVar) | dr0Var.c(f) | ((((i14 & 14) ^ 6) <= 4 && dr0Var.g(z7)) || (i14 & 6) == 4);
                        z4 = ((i14 & 896) ^ 384) > 256 ? false : false;
                        zH = zH3 | z4 | dr0Var.h(gz0Var);
                        objK5 = dr0Var.K();
                        if (zH) {
                            qp qpVar6 = qpVar2;
                            objK5 = new pp(tbVar, f, z7, qpVar6, gz0Var, (m10) null);
                            qpVar4 = qpVar6;
                            dr0Var.f0(objK5);
                        } else {
                            qp qpVar7 = qpVar2;
                            objK5 = new pp(tbVar, f, z7, qpVar7, gz0Var, (m10) null);
                            qpVar4 = qpVar7;
                            dr0Var.f0(objK5);
                        }
                        h7.J((zp0) objK5, dr0Var, cc0Var2);
                        ddVar = tbVar.c;
                        dr0Var.p(false);
                    }
                    if (ddVar != null) {
                        f2 = ((cc0) ddVar.i.getValue()).h;
                    } else {
                        f2 = 0.0f;
                    }
                    objK6 = dr0Var.K();
                    if (objK6 == obj) {
                        objK6 = new s0((byte) 27);
                        dr0Var.f0(objK6);
                    }
                    long j6 = j4;
                    zn znVar6 = znVar4;
                    iq2.c(kp0Var, tg2.a(rg1Var4, false, (vp0) objK6), z7, hi2Var3, j2, j6, 0.0f, f2, znVar6, ui1Var, dt.N(-535639973, new up(j6, rt1Var5, aq0Var, (byte) 0), dr0Var), dr0Var, (i13 & 8078) | ((i13 << 6) & 234881024), 64);
                    z6 = z7;
                    znVar3 = znVar6;
                    qpVar3 = qpVar4;
                    rg1Var3 = rg1Var4;
                    lpVar3 = lpVar5;
                    rt1Var3 = rt1Var5;
                    hi2Var2 = hi2Var3;
                } else {
                    dr0Var.Q();
                    rt1Var3 = rt1Var2;
                    rg1Var3 = rg1Var2;
                    z6 = z3;
                    hi2Var2 = hi2VarA;
                    lpVar3 = lpVar2;
                    qpVar3 = qpVar2;
                    znVar3 = znVar2;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: sp
                        @Override // defpackage.zp0
                        public final Object f(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            aa3.a(kp0Var, rg1Var3, z6, hi2Var2, lpVar3, qpVar3, znVar3, rt1Var3, aq0Var, (dr0) obj2, m02.A(i2 | 1), i3);
                            return j23.a;
                        }
                    };
                }
            }
            i4 |= 384;
            z3 = z2;
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    hi2VarA = hi2Var;
                    if (dr0Var.f(hi2VarA)) {
                    }
                    i4 |= i17;
                } else {
                    hi2VarA = hi2Var;
                }
                i4 |= i17;
            } else {
                hi2VarA = hi2Var;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    lpVar2 = lpVar;
                    if (dr0Var.f(lpVar2)) {
                    }
                    i4 |= i18;
                } else {
                    lpVar2 = lpVar;
                }
                i4 |= i18;
            } else {
                lpVar2 = lpVar;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    qpVar2 = qpVar;
                    if (dr0Var.f(qpVar2)) {
                    }
                    i4 |= i19;
                } else {
                    qpVar2 = qpVar;
                }
                i4 |= i19;
            } else {
                qpVar2 = qpVar;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    znVar2 = znVar;
                    if (dr0Var.f(znVar2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                    rt1Var2 = rt1Var;
                } else {
                    rt1Var2 = rt1Var;
                    if ((i2 & 12582912) == 0) {
                        if (dr0Var.f(rt1Var2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dr0Var.f(null)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i2 & 805306368) == 0) {
                    if (dr0Var.h(aq0Var)) {
                        i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                    } else {
                        i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i4 |= i15;
                }
                z4 = true;
                if ((i4 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dr0Var.N(i4 & 1, z5)) {
                    dr0Var.S();
                    i12 = -458753;
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            rg1Var2 = og1.h;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            rt1 rt1Var15 = mp.a;
                            i4 &= -7169;
                            hi2VarA = mi2.a(uz0.k, dr0Var);
                        }
                        if ((i3 & 16) != 0) {
                            rt1 rt1Var16 = mp.a;
                            pvVar = (pv) dr0Var.j(rv.a);
                            lpVar4 = pvVar.W;
                            if (lpVar4 == null) {
                                lp lpVar9 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                                pvVar.W = lpVar9;
                                lpVar4 = lpVar9;
                            }
                            i4 &= -57345;
                        } else {
                            i12 = -458753;
                            lpVar4 = lpVar2;
                        }
                        if ((i3 & 32) != 0) {
                            rt1 rt1Var17 = mp.a;
                            i4 &= i12;
                            qpVar2 = new qp(z);
                        }
                        if (i7 != 0) {
                            znVar2 = null;
                        }
                        if (i9 != 0) {
                            rt1Var4 = mp.a;
                        } else {
                            rt1Var4 = rt1Var2;
                        }
                        lpVar5 = lpVar4;
                        z7 = z3;
                        hi2Var3 = hi2VarA;
                        znVar4 = znVar2;
                        i13 = i4;
                        rt1Var5 = rt1Var4;
                        rg1Var4 = rg1Var2;
                    } else {
                        if (i16 != 0) {
                            rg1Var2 = og1.h;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            rt1 rt1Var18 = mp.a;
                            i4 &= -7169;
                            hi2VarA = mi2.a(uz0.k, dr0Var);
                        }
                        if ((i3 & 16) != 0) {
                            rt1 rt1Var19 = mp.a;
                            pvVar = (pv) dr0Var.j(rv.a);
                            lpVar4 = pvVar.W;
                            if (lpVar4 == null) {
                                lp lpVar10 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                                pvVar.W = lpVar10;
                                lpVar4 = lpVar10;
                            }
                            i4 &= -57345;
                        } else {
                            i12 = -458753;
                            lpVar4 = lpVar2;
                        }
                        if ((i3 & 32) != 0) {
                            rt1 rt1Var110 = mp.a;
                            i4 &= i12;
                            qpVar2 = new qp(z);
                        }
                        if (i7 != 0) {
                            znVar2 = null;
                        }
                        if (i9 != 0) {
                            rt1Var4 = mp.a;
                        } else {
                            rt1Var4 = rt1Var2;
                        }
                        lpVar5 = lpVar4;
                        z7 = z3;
                        hi2Var3 = hi2VarA;
                        znVar4 = znVar2;
                        i13 = i4;
                        rt1Var5 = rt1Var4;
                        rg1Var4 = rg1Var2;
                    }
                    dr0Var.q();
                    dr0Var.V(1691738187);
                    objK = dr0Var.K();
                    obj = zy.a;
                    if (objK == obj) {
                        objK = new ui1();
                        dr0Var.f0(objK);
                    }
                    ui1Var = (ui1) objK;
                    dr0Var.p(false);
                    if (z7) {
                        j2 = lpVar5.a;
                    } else {
                        j2 = lpVar5.c;
                    }
                    if (z7) {
                        j3 = lpVar5.b;
                    } else {
                        j3 = lpVar5.d;
                    }
                    j4 = j3;
                    if (qpVar2 == null) {
                        dr0Var.V(1691921830);
                        dr0Var.p(false);
                        rt1Var5 = rt1Var5;
                        j4 = j4;
                        znVar4 = znVar4;
                        ui1Var = ui1Var;
                        qpVar4 = qpVar2;
                        ddVar = null;
                    } else {
                        dr0Var.V(-499611205);
                        i14 = ((i13 >> 9) & 896) | ((i13 >> 6) & 14);
                        objK2 = dr0Var.K();
                        if (objK2 == obj) {
                            objK2 = new ll2();
                            dr0Var.f0(objK2);
                        }
                        ll2Var = (ll2) objK2;
                        zF = dr0Var.f(ui1Var);
                        objK3 = dr0Var.K();
                        if (zF) {
                            objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                            dr0Var.f0(objK3);
                        } else {
                            objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                            dr0Var.f0(objK3);
                        }
                        h7.J((zp0) objK3, dr0Var, ui1Var);
                        gz0Var = (gz0) dv.G0(ll2Var);
                        if (z7) {
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                        }
                        objK4 = dr0Var.K();
                        if (objK4 == obj) {
                            objK4 = new tb(new cc0(f), S, null, 12);
                            dr0Var.f0(objK4);
                        }
                        tbVar = (tb) objK4;
                        cc0 cc0Var3 = new cc0(f);
                        boolean zH4 = dr0Var.h(tbVar) | dr0Var.c(f) | ((((i14 & 14) ^ 6) <= 4 && dr0Var.g(z7)) || (i14 & 6) == 4);
                        if (((i14 & 896) ^ 384) > 256) {
                        }
                        zH = zH4 | z4 | dr0Var.h(gz0Var);
                        objK5 = dr0Var.K();
                        if (zH) {
                            qp qpVar8 = qpVar2;
                            objK5 = new pp(tbVar, f, z7, qpVar8, gz0Var, (m10) null);
                            qpVar4 = qpVar8;
                            dr0Var.f0(objK5);
                        } else {
                            qp qpVar9 = qpVar2;
                            objK5 = new pp(tbVar, f, z7, qpVar9, gz0Var, (m10) null);
                            qpVar4 = qpVar9;
                            dr0Var.f0(objK5);
                        }
                        h7.J((zp0) objK5, dr0Var, cc0Var3);
                        ddVar = tbVar.c;
                        dr0Var.p(false);
                    }
                    if (ddVar != null) {
                        f2 = ((cc0) ddVar.i.getValue()).h;
                    } else {
                        f2 = 0.0f;
                    }
                    objK6 = dr0Var.K();
                    if (objK6 == obj) {
                        objK6 = new s0((byte) 27);
                        dr0Var.f0(objK6);
                    }
                    long j7 = j4;
                    zn znVar7 = znVar4;
                    iq2.c(kp0Var, tg2.a(rg1Var4, false, (vp0) objK6), z7, hi2Var3, j2, j7, 0.0f, f2, znVar7, ui1Var, dt.N(-535639973, new up(j7, rt1Var5, aq0Var, (byte) 0), dr0Var), dr0Var, (i13 & 8078) | ((i13 << 6) & 234881024), 64);
                    z6 = z7;
                    znVar3 = znVar7;
                    qpVar3 = qpVar4;
                    rg1Var3 = rg1Var4;
                    lpVar3 = lpVar5;
                    rt1Var3 = rt1Var5;
                    hi2Var2 = hi2Var3;
                } else {
                    dr0Var.Q();
                    rt1Var3 = rt1Var2;
                    rg1Var3 = rg1Var2;
                    z6 = z3;
                    hi2Var2 = hi2VarA;
                    lpVar3 = lpVar2;
                    qpVar3 = qpVar2;
                    znVar3 = znVar2;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: sp
                        @Override // defpackage.zp0
                        public final Object f(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            aa3.a(kp0Var, rg1Var3, z6, hi2Var2, lpVar3, qpVar3, znVar3, rt1Var3, aq0Var, (dr0) obj2, m02.A(i2 | 1), i3);
                            return j23.a;
                        }
                    };
                }
            }
            i4 |= 1572864;
            znVar2 = znVar;
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
                rt1Var2 = rt1Var;
            } else {
                rt1Var2 = rt1Var;
                if ((i2 & 12582912) == 0) {
                    if (dr0Var.f(rt1Var2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dr0Var.f(null)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i2 & 805306368) == 0) {
                if (dr0Var.h(aq0Var)) {
                    i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                } else {
                    i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i4 |= i15;
            }
            z4 = true;
            if ((i4 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dr0Var.N(i4 & 1, z5)) {
                dr0Var.S();
                i12 = -458753;
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        rg1Var2 = og1.h;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        rt1 rt1Var111 = mp.a;
                        i4 &= -7169;
                        hi2VarA = mi2.a(uz0.k, dr0Var);
                    }
                    if ((i3 & 16) != 0) {
                        rt1 rt1Var112 = mp.a;
                        pvVar = (pv) dr0Var.j(rv.a);
                        lpVar4 = pvVar.W;
                        if (lpVar4 == null) {
                            lp lpVar11 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                            pvVar.W = lpVar11;
                            lpVar4 = lpVar11;
                        }
                        i4 &= -57345;
                    } else {
                        i12 = -458753;
                        lpVar4 = lpVar2;
                    }
                    if ((i3 & 32) != 0) {
                        rt1 rt1Var113 = mp.a;
                        i4 &= i12;
                        qpVar2 = new qp(z);
                    }
                    if (i7 != 0) {
                        znVar2 = null;
                    }
                    if (i9 != 0) {
                        rt1Var4 = mp.a;
                    } else {
                        rt1Var4 = rt1Var2;
                    }
                    lpVar5 = lpVar4;
                    z7 = z3;
                    hi2Var3 = hi2VarA;
                    znVar4 = znVar2;
                    i13 = i4;
                    rt1Var5 = rt1Var4;
                    rg1Var4 = rg1Var2;
                } else {
                    if (i16 != 0) {
                        rg1Var2 = og1.h;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        rt1 rt1Var114 = mp.a;
                        i4 &= -7169;
                        hi2VarA = mi2.a(uz0.k, dr0Var);
                    }
                    if ((i3 & 16) != 0) {
                        rt1 rt1Var115 = mp.a;
                        pvVar = (pv) dr0Var.j(rv.a);
                        lpVar4 = pvVar.W;
                        if (lpVar4 == null) {
                            lp lpVar12 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                            pvVar.W = lpVar12;
                            lpVar4 = lpVar12;
                        }
                        i4 &= -57345;
                    } else {
                        i12 = -458753;
                        lpVar4 = lpVar2;
                    }
                    if ((i3 & 32) != 0) {
                        rt1 rt1Var116 = mp.a;
                        i4 &= i12;
                        qpVar2 = new qp(z);
                    }
                    if (i7 != 0) {
                        znVar2 = null;
                    }
                    if (i9 != 0) {
                        rt1Var4 = mp.a;
                    } else {
                        rt1Var4 = rt1Var2;
                    }
                    lpVar5 = lpVar4;
                    z7 = z3;
                    hi2Var3 = hi2VarA;
                    znVar4 = znVar2;
                    i13 = i4;
                    rt1Var5 = rt1Var4;
                    rg1Var4 = rg1Var2;
                }
                dr0Var.q();
                dr0Var.V(1691738187);
                objK = dr0Var.K();
                obj = zy.a;
                if (objK == obj) {
                    objK = new ui1();
                    dr0Var.f0(objK);
                }
                ui1Var = (ui1) objK;
                dr0Var.p(false);
                if (z7) {
                    j2 = lpVar5.a;
                } else {
                    j2 = lpVar5.c;
                }
                if (z7) {
                    j3 = lpVar5.b;
                } else {
                    j3 = lpVar5.d;
                }
                j4 = j3;
                if (qpVar2 == null) {
                    dr0Var.V(1691921830);
                    dr0Var.p(false);
                    rt1Var5 = rt1Var5;
                    j4 = j4;
                    znVar4 = znVar4;
                    ui1Var = ui1Var;
                    qpVar4 = qpVar2;
                    ddVar = null;
                } else {
                    dr0Var.V(-499611205);
                    i14 = ((i13 >> 9) & 896) | ((i13 >> 6) & 14);
                    objK2 = dr0Var.K();
                    if (objK2 == obj) {
                        objK2 = new ll2();
                        dr0Var.f0(objK2);
                    }
                    ll2Var = (ll2) objK2;
                    zF = dr0Var.f(ui1Var);
                    objK3 = dr0Var.K();
                    if (zF) {
                        objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                        dr0Var.f0(objK3);
                    } else {
                        objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                        dr0Var.f0(objK3);
                    }
                    h7.J((zp0) objK3, dr0Var, ui1Var);
                    gz0Var = (gz0) dv.G0(ll2Var);
                    if (z7) {
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    objK4 = dr0Var.K();
                    if (objK4 == obj) {
                        objK4 = new tb(new cc0(f), S, null, 12);
                        dr0Var.f0(objK4);
                    }
                    tbVar = (tb) objK4;
                    cc0 cc0Var4 = new cc0(f);
                    boolean zH5 = dr0Var.h(tbVar) | dr0Var.c(f) | ((((i14 & 14) ^ 6) <= 4 && dr0Var.g(z7)) || (i14 & 6) == 4);
                    if (((i14 & 896) ^ 384) > 256) {
                    }
                    zH = zH5 | z4 | dr0Var.h(gz0Var);
                    objK5 = dr0Var.K();
                    if (zH) {
                        qp qpVar10 = qpVar2;
                        objK5 = new pp(tbVar, f, z7, qpVar10, gz0Var, (m10) null);
                        qpVar4 = qpVar10;
                        dr0Var.f0(objK5);
                    } else {
                        qp qpVar11 = qpVar2;
                        objK5 = new pp(tbVar, f, z7, qpVar11, gz0Var, (m10) null);
                        qpVar4 = qpVar11;
                        dr0Var.f0(objK5);
                    }
                    h7.J((zp0) objK5, dr0Var, cc0Var4);
                    ddVar = tbVar.c;
                    dr0Var.p(false);
                }
                if (ddVar != null) {
                    f2 = ((cc0) ddVar.i.getValue()).h;
                } else {
                    f2 = 0.0f;
                }
                objK6 = dr0Var.K();
                if (objK6 == obj) {
                    objK6 = new s0((byte) 27);
                    dr0Var.f0(objK6);
                }
                long j8 = j4;
                zn znVar8 = znVar4;
                iq2.c(kp0Var, tg2.a(rg1Var4, false, (vp0) objK6), z7, hi2Var3, j2, j8, 0.0f, f2, znVar8, ui1Var, dt.N(-535639973, new up(j8, rt1Var5, aq0Var, (byte) 0), dr0Var), dr0Var, (i13 & 8078) | ((i13 << 6) & 234881024), 64);
                z6 = z7;
                znVar3 = znVar8;
                qpVar3 = qpVar4;
                rg1Var3 = rg1Var4;
                lpVar3 = lpVar5;
                rt1Var3 = rt1Var5;
                hi2Var2 = hi2Var3;
            } else {
                dr0Var.Q();
                rt1Var3 = rt1Var2;
                rg1Var3 = rg1Var2;
                z6 = z3;
                hi2Var2 = hi2VarA;
                lpVar3 = lpVar2;
                qpVar3 = qpVar2;
                znVar3 = znVar2;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: sp
                    @Override // defpackage.zp0
                    public final Object f(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        aa3.a(kp0Var, rg1Var3, z6, hi2Var2, lpVar3, qpVar3, znVar3, rt1Var3, aq0Var, (dr0) obj2, m02.A(i2 | 1), i3);
                        return j23.a;
                    }
                };
            }
        }
        i4 |= 48;
        rg1Var2 = rg1Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                z3 = z2;
                if (dr0Var.g(z3)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    hi2VarA = hi2Var;
                    if (dr0Var.f(hi2VarA)) {
                    }
                    i4 |= i17;
                } else {
                    hi2VarA = hi2Var;
                }
                i4 |= i17;
            } else {
                hi2VarA = hi2Var;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    lpVar2 = lpVar;
                    if (dr0Var.f(lpVar2)) {
                    }
                    i4 |= i18;
                } else {
                    lpVar2 = lpVar;
                }
                i4 |= i18;
            } else {
                lpVar2 = lpVar;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    qpVar2 = qpVar;
                    if (dr0Var.f(qpVar2)) {
                    }
                    i4 |= i19;
                } else {
                    qpVar2 = qpVar;
                }
                i4 |= i19;
            } else {
                qpVar2 = qpVar;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    znVar2 = znVar;
                    if (dr0Var.f(znVar2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                    rt1Var2 = rt1Var;
                } else {
                    rt1Var2 = rt1Var;
                    if ((i2 & 12582912) == 0) {
                        if (dr0Var.f(rt1Var2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dr0Var.f(null)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i2 & 805306368) == 0) {
                    if (dr0Var.h(aq0Var)) {
                        i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                    } else {
                        i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i4 |= i15;
                }
                z4 = true;
                if ((i4 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dr0Var.N(i4 & 1, z5)) {
                    dr0Var.S();
                    i12 = -458753;
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            rg1Var2 = og1.h;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            rt1 rt1Var117 = mp.a;
                            i4 &= -7169;
                            hi2VarA = mi2.a(uz0.k, dr0Var);
                        }
                        if ((i3 & 16) != 0) {
                            rt1 rt1Var118 = mp.a;
                            pvVar = (pv) dr0Var.j(rv.a);
                            lpVar4 = pvVar.W;
                            if (lpVar4 == null) {
                                lp lpVar13 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                                pvVar.W = lpVar13;
                                lpVar4 = lpVar13;
                            }
                            i4 &= -57345;
                        } else {
                            i12 = -458753;
                            lpVar4 = lpVar2;
                        }
                        if ((i3 & 32) != 0) {
                            rt1 rt1Var119 = mp.a;
                            i4 &= i12;
                            qpVar2 = new qp(z);
                        }
                        if (i7 != 0) {
                            znVar2 = null;
                        }
                        if (i9 != 0) {
                            rt1Var4 = mp.a;
                        } else {
                            rt1Var4 = rt1Var2;
                        }
                        lpVar5 = lpVar4;
                        z7 = z3;
                        hi2Var3 = hi2VarA;
                        znVar4 = znVar2;
                        i13 = i4;
                        rt1Var5 = rt1Var4;
                        rg1Var4 = rg1Var2;
                    } else {
                        if (i16 != 0) {
                            rg1Var2 = og1.h;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            rt1 rt1Var1110 = mp.a;
                            i4 &= -7169;
                            hi2VarA = mi2.a(uz0.k, dr0Var);
                        }
                        if ((i3 & 16) != 0) {
                            rt1 rt1Var1111 = mp.a;
                            pvVar = (pv) dr0Var.j(rv.a);
                            lpVar4 = pvVar.W;
                            if (lpVar4 == null) {
                                lp lpVar14 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                                pvVar.W = lpVar14;
                                lpVar4 = lpVar14;
                            }
                            i4 &= -57345;
                        } else {
                            i12 = -458753;
                            lpVar4 = lpVar2;
                        }
                        if ((i3 & 32) != 0) {
                            rt1 rt1Var1112 = mp.a;
                            i4 &= i12;
                            qpVar2 = new qp(z);
                        }
                        if (i7 != 0) {
                            znVar2 = null;
                        }
                        if (i9 != 0) {
                            rt1Var4 = mp.a;
                        } else {
                            rt1Var4 = rt1Var2;
                        }
                        lpVar5 = lpVar4;
                        z7 = z3;
                        hi2Var3 = hi2VarA;
                        znVar4 = znVar2;
                        i13 = i4;
                        rt1Var5 = rt1Var4;
                        rg1Var4 = rg1Var2;
                    }
                    dr0Var.q();
                    dr0Var.V(1691738187);
                    objK = dr0Var.K();
                    obj = zy.a;
                    if (objK == obj) {
                        objK = new ui1();
                        dr0Var.f0(objK);
                    }
                    ui1Var = (ui1) objK;
                    dr0Var.p(false);
                    if (z7) {
                        j2 = lpVar5.a;
                    } else {
                        j2 = lpVar5.c;
                    }
                    if (z7) {
                        j3 = lpVar5.b;
                    } else {
                        j3 = lpVar5.d;
                    }
                    j4 = j3;
                    if (qpVar2 == null) {
                        dr0Var.V(1691921830);
                        dr0Var.p(false);
                        rt1Var5 = rt1Var5;
                        j4 = j4;
                        znVar4 = znVar4;
                        ui1Var = ui1Var;
                        qpVar4 = qpVar2;
                        ddVar = null;
                    } else {
                        dr0Var.V(-499611205);
                        i14 = ((i13 >> 9) & 896) | ((i13 >> 6) & 14);
                        objK2 = dr0Var.K();
                        if (objK2 == obj) {
                            objK2 = new ll2();
                            dr0Var.f0(objK2);
                        }
                        ll2Var = (ll2) objK2;
                        zF = dr0Var.f(ui1Var);
                        objK3 = dr0Var.K();
                        if (zF) {
                            objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                            dr0Var.f0(objK3);
                        } else {
                            objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                            dr0Var.f0(objK3);
                        }
                        h7.J((zp0) objK3, dr0Var, ui1Var);
                        gz0Var = (gz0) dv.G0(ll2Var);
                        if (z7) {
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                        }
                        objK4 = dr0Var.K();
                        if (objK4 == obj) {
                            objK4 = new tb(new cc0(f), S, null, 12);
                            dr0Var.f0(objK4);
                        }
                        tbVar = (tb) objK4;
                        cc0 cc0Var5 = new cc0(f);
                        boolean zH6 = dr0Var.h(tbVar) | dr0Var.c(f) | ((((i14 & 14) ^ 6) <= 4 && dr0Var.g(z7)) || (i14 & 6) == 4);
                        if (((i14 & 896) ^ 384) > 256) {
                        }
                        zH = zH6 | z4 | dr0Var.h(gz0Var);
                        objK5 = dr0Var.K();
                        if (zH) {
                            qp qpVar12 = qpVar2;
                            objK5 = new pp(tbVar, f, z7, qpVar12, gz0Var, (m10) null);
                            qpVar4 = qpVar12;
                            dr0Var.f0(objK5);
                        } else {
                            qp qpVar13 = qpVar2;
                            objK5 = new pp(tbVar, f, z7, qpVar13, gz0Var, (m10) null);
                            qpVar4 = qpVar13;
                            dr0Var.f0(objK5);
                        }
                        h7.J((zp0) objK5, dr0Var, cc0Var5);
                        ddVar = tbVar.c;
                        dr0Var.p(false);
                    }
                    if (ddVar != null) {
                        f2 = ((cc0) ddVar.i.getValue()).h;
                    } else {
                        f2 = 0.0f;
                    }
                    objK6 = dr0Var.K();
                    if (objK6 == obj) {
                        objK6 = new s0((byte) 27);
                        dr0Var.f0(objK6);
                    }
                    long j9 = j4;
                    zn znVar9 = znVar4;
                    iq2.c(kp0Var, tg2.a(rg1Var4, false, (vp0) objK6), z7, hi2Var3, j2, j9, 0.0f, f2, znVar9, ui1Var, dt.N(-535639973, new up(j9, rt1Var5, aq0Var, (byte) 0), dr0Var), dr0Var, (i13 & 8078) | ((i13 << 6) & 234881024), 64);
                    z6 = z7;
                    znVar3 = znVar9;
                    qpVar3 = qpVar4;
                    rg1Var3 = rg1Var4;
                    lpVar3 = lpVar5;
                    rt1Var3 = rt1Var5;
                    hi2Var2 = hi2Var3;
                } else {
                    dr0Var.Q();
                    rt1Var3 = rt1Var2;
                    rg1Var3 = rg1Var2;
                    z6 = z3;
                    hi2Var2 = hi2VarA;
                    lpVar3 = lpVar2;
                    qpVar3 = qpVar2;
                    znVar3 = znVar2;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: sp
                        @Override // defpackage.zp0
                        public final Object f(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            aa3.a(kp0Var, rg1Var3, z6, hi2Var2, lpVar3, qpVar3, znVar3, rt1Var3, aq0Var, (dr0) obj2, m02.A(i2 | 1), i3);
                            return j23.a;
                        }
                    };
                }
            }
            i4 |= 1572864;
            znVar2 = znVar;
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
                rt1Var2 = rt1Var;
            } else {
                rt1Var2 = rt1Var;
                if ((i2 & 12582912) == 0) {
                    if (dr0Var.f(rt1Var2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dr0Var.f(null)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i2 & 805306368) == 0) {
                if (dr0Var.h(aq0Var)) {
                    i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                } else {
                    i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i4 |= i15;
            }
            z4 = true;
            if ((i4 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dr0Var.N(i4 & 1, z5)) {
                dr0Var.S();
                i12 = -458753;
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        rg1Var2 = og1.h;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        rt1 rt1Var1113 = mp.a;
                        i4 &= -7169;
                        hi2VarA = mi2.a(uz0.k, dr0Var);
                    }
                    if ((i3 & 16) != 0) {
                        rt1 rt1Var1114 = mp.a;
                        pvVar = (pv) dr0Var.j(rv.a);
                        lpVar4 = pvVar.W;
                        if (lpVar4 == null) {
                            lp lpVar15 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                            pvVar.W = lpVar15;
                            lpVar4 = lpVar15;
                        }
                        i4 &= -57345;
                    } else {
                        i12 = -458753;
                        lpVar4 = lpVar2;
                    }
                    if ((i3 & 32) != 0) {
                        rt1 rt1Var1115 = mp.a;
                        i4 &= i12;
                        qpVar2 = new qp(z);
                    }
                    if (i7 != 0) {
                        znVar2 = null;
                    }
                    if (i9 != 0) {
                        rt1Var4 = mp.a;
                    } else {
                        rt1Var4 = rt1Var2;
                    }
                    lpVar5 = lpVar4;
                    z7 = z3;
                    hi2Var3 = hi2VarA;
                    znVar4 = znVar2;
                    i13 = i4;
                    rt1Var5 = rt1Var4;
                    rg1Var4 = rg1Var2;
                } else {
                    if (i16 != 0) {
                        rg1Var2 = og1.h;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        rt1 rt1Var1116 = mp.a;
                        i4 &= -7169;
                        hi2VarA = mi2.a(uz0.k, dr0Var);
                    }
                    if ((i3 & 16) != 0) {
                        rt1 rt1Var1117 = mp.a;
                        pvVar = (pv) dr0Var.j(rv.a);
                        lpVar4 = pvVar.W;
                        if (lpVar4 == null) {
                            lp lpVar16 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                            pvVar.W = lpVar16;
                            lpVar4 = lpVar16;
                        }
                        i4 &= -57345;
                    } else {
                        i12 = -458753;
                        lpVar4 = lpVar2;
                    }
                    if ((i3 & 32) != 0) {
                        rt1 rt1Var1118 = mp.a;
                        i4 &= i12;
                        qpVar2 = new qp(z);
                    }
                    if (i7 != 0) {
                        znVar2 = null;
                    }
                    if (i9 != 0) {
                        rt1Var4 = mp.a;
                    } else {
                        rt1Var4 = rt1Var2;
                    }
                    lpVar5 = lpVar4;
                    z7 = z3;
                    hi2Var3 = hi2VarA;
                    znVar4 = znVar2;
                    i13 = i4;
                    rt1Var5 = rt1Var4;
                    rg1Var4 = rg1Var2;
                }
                dr0Var.q();
                dr0Var.V(1691738187);
                objK = dr0Var.K();
                obj = zy.a;
                if (objK == obj) {
                    objK = new ui1();
                    dr0Var.f0(objK);
                }
                ui1Var = (ui1) objK;
                dr0Var.p(false);
                if (z7) {
                    j2 = lpVar5.a;
                } else {
                    j2 = lpVar5.c;
                }
                if (z7) {
                    j3 = lpVar5.b;
                } else {
                    j3 = lpVar5.d;
                }
                j4 = j3;
                if (qpVar2 == null) {
                    dr0Var.V(1691921830);
                    dr0Var.p(false);
                    rt1Var5 = rt1Var5;
                    j4 = j4;
                    znVar4 = znVar4;
                    ui1Var = ui1Var;
                    qpVar4 = qpVar2;
                    ddVar = null;
                } else {
                    dr0Var.V(-499611205);
                    i14 = ((i13 >> 9) & 896) | ((i13 >> 6) & 14);
                    objK2 = dr0Var.K();
                    if (objK2 == obj) {
                        objK2 = new ll2();
                        dr0Var.f0(objK2);
                    }
                    ll2Var = (ll2) objK2;
                    zF = dr0Var.f(ui1Var);
                    objK3 = dr0Var.K();
                    if (zF) {
                        objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                        dr0Var.f0(objK3);
                    } else {
                        objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                        dr0Var.f0(objK3);
                    }
                    h7.J((zp0) objK3, dr0Var, ui1Var);
                    gz0Var = (gz0) dv.G0(ll2Var);
                    if (z7) {
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    objK4 = dr0Var.K();
                    if (objK4 == obj) {
                        objK4 = new tb(new cc0(f), S, null, 12);
                        dr0Var.f0(objK4);
                    }
                    tbVar = (tb) objK4;
                    cc0 cc0Var6 = new cc0(f);
                    boolean zH7 = dr0Var.h(tbVar) | dr0Var.c(f) | ((((i14 & 14) ^ 6) <= 4 && dr0Var.g(z7)) || (i14 & 6) == 4);
                    if (((i14 & 896) ^ 384) > 256) {
                    }
                    zH = zH7 | z4 | dr0Var.h(gz0Var);
                    objK5 = dr0Var.K();
                    if (zH) {
                        qp qpVar14 = qpVar2;
                        objK5 = new pp(tbVar, f, z7, qpVar14, gz0Var, (m10) null);
                        qpVar4 = qpVar14;
                        dr0Var.f0(objK5);
                    } else {
                        qp qpVar15 = qpVar2;
                        objK5 = new pp(tbVar, f, z7, qpVar15, gz0Var, (m10) null);
                        qpVar4 = qpVar15;
                        dr0Var.f0(objK5);
                    }
                    h7.J((zp0) objK5, dr0Var, cc0Var6);
                    ddVar = tbVar.c;
                    dr0Var.p(false);
                }
                if (ddVar != null) {
                    f2 = ((cc0) ddVar.i.getValue()).h;
                } else {
                    f2 = 0.0f;
                }
                objK6 = dr0Var.K();
                if (objK6 == obj) {
                    objK6 = new s0((byte) 27);
                    dr0Var.f0(objK6);
                }
                long j10 = j4;
                zn znVar10 = znVar4;
                iq2.c(kp0Var, tg2.a(rg1Var4, false, (vp0) objK6), z7, hi2Var3, j2, j10, 0.0f, f2, znVar10, ui1Var, dt.N(-535639973, new up(j10, rt1Var5, aq0Var, (byte) 0), dr0Var), dr0Var, (i13 & 8078) | ((i13 << 6) & 234881024), 64);
                z6 = z7;
                znVar3 = znVar10;
                qpVar3 = qpVar4;
                rg1Var3 = rg1Var4;
                lpVar3 = lpVar5;
                rt1Var3 = rt1Var5;
                hi2Var2 = hi2Var3;
            } else {
                dr0Var.Q();
                rt1Var3 = rt1Var2;
                rg1Var3 = rg1Var2;
                z6 = z3;
                hi2Var2 = hi2VarA;
                lpVar3 = lpVar2;
                qpVar3 = qpVar2;
                znVar3 = znVar2;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: sp
                    @Override // defpackage.zp0
                    public final Object f(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        aa3.a(kp0Var, rg1Var3, z6, hi2Var2, lpVar3, qpVar3, znVar3, rt1Var3, aq0Var, (dr0) obj2, m02.A(i2 | 1), i3);
                        return j23.a;
                    }
                };
            }
        }
        i4 |= 384;
        z3 = z2;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                hi2VarA = hi2Var;
                if (dr0Var.f(hi2VarA)) {
                }
                i4 |= i17;
            } else {
                hi2VarA = hi2Var;
            }
            i4 |= i17;
        } else {
            hi2VarA = hi2Var;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                lpVar2 = lpVar;
                if (dr0Var.f(lpVar2)) {
                }
                i4 |= i18;
            } else {
                lpVar2 = lpVar;
            }
            i4 |= i18;
        } else {
            lpVar2 = lpVar;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                qpVar2 = qpVar;
                if (dr0Var.f(qpVar2)) {
                }
                i4 |= i19;
            } else {
                qpVar2 = qpVar;
            }
            i4 |= i19;
        } else {
            qpVar2 = qpVar;
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            if ((1572864 & i2) == 0) {
                znVar2 = znVar;
                if (dr0Var.f(znVar2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
                rt1Var2 = rt1Var;
            } else {
                rt1Var2 = rt1Var;
                if ((i2 & 12582912) == 0) {
                    if (dr0Var.f(rt1Var2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dr0Var.f(null)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i2 & 805306368) == 0) {
                if (dr0Var.h(aq0Var)) {
                    i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                } else {
                    i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i4 |= i15;
            }
            z4 = true;
            if ((i4 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dr0Var.N(i4 & 1, z5)) {
                dr0Var.S();
                i12 = -458753;
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        rg1Var2 = og1.h;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        rt1 rt1Var1119 = mp.a;
                        i4 &= -7169;
                        hi2VarA = mi2.a(uz0.k, dr0Var);
                    }
                    if ((i3 & 16) != 0) {
                        rt1 rt1Var11110 = mp.a;
                        pvVar = (pv) dr0Var.j(rv.a);
                        lpVar4 = pvVar.W;
                        if (lpVar4 == null) {
                            lp lpVar17 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                            pvVar.W = lpVar17;
                            lpVar4 = lpVar17;
                        }
                        i4 &= -57345;
                    } else {
                        i12 = -458753;
                        lpVar4 = lpVar2;
                    }
                    if ((i3 & 32) != 0) {
                        rt1 rt1Var11111 = mp.a;
                        i4 &= i12;
                        qpVar2 = new qp(z);
                    }
                    if (i7 != 0) {
                        znVar2 = null;
                    }
                    if (i9 != 0) {
                        rt1Var4 = mp.a;
                    } else {
                        rt1Var4 = rt1Var2;
                    }
                    lpVar5 = lpVar4;
                    z7 = z3;
                    hi2Var3 = hi2VarA;
                    znVar4 = znVar2;
                    i13 = i4;
                    rt1Var5 = rt1Var4;
                    rg1Var4 = rg1Var2;
                } else {
                    if (i16 != 0) {
                        rg1Var2 = og1.h;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        rt1 rt1Var11112 = mp.a;
                        i4 &= -7169;
                        hi2VarA = mi2.a(uz0.k, dr0Var);
                    }
                    if ((i3 & 16) != 0) {
                        rt1 rt1Var11113 = mp.a;
                        pvVar = (pv) dr0Var.j(rv.a);
                        lpVar4 = pvVar.W;
                        if (lpVar4 == null) {
                            lp lpVar18 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                            pvVar.W = lpVar18;
                            lpVar4 = lpVar18;
                        }
                        i4 &= -57345;
                    } else {
                        i12 = -458753;
                        lpVar4 = lpVar2;
                    }
                    if ((i3 & 32) != 0) {
                        rt1 rt1Var11114 = mp.a;
                        i4 &= i12;
                        qpVar2 = new qp(z);
                    }
                    if (i7 != 0) {
                        znVar2 = null;
                    }
                    if (i9 != 0) {
                        rt1Var4 = mp.a;
                    } else {
                        rt1Var4 = rt1Var2;
                    }
                    lpVar5 = lpVar4;
                    z7 = z3;
                    hi2Var3 = hi2VarA;
                    znVar4 = znVar2;
                    i13 = i4;
                    rt1Var5 = rt1Var4;
                    rg1Var4 = rg1Var2;
                }
                dr0Var.q();
                dr0Var.V(1691738187);
                objK = dr0Var.K();
                obj = zy.a;
                if (objK == obj) {
                    objK = new ui1();
                    dr0Var.f0(objK);
                }
                ui1Var = (ui1) objK;
                dr0Var.p(false);
                if (z7) {
                    j2 = lpVar5.a;
                } else {
                    j2 = lpVar5.c;
                }
                if (z7) {
                    j3 = lpVar5.b;
                } else {
                    j3 = lpVar5.d;
                }
                j4 = j3;
                if (qpVar2 == null) {
                    dr0Var.V(1691921830);
                    dr0Var.p(false);
                    rt1Var5 = rt1Var5;
                    j4 = j4;
                    znVar4 = znVar4;
                    ui1Var = ui1Var;
                    qpVar4 = qpVar2;
                    ddVar = null;
                } else {
                    dr0Var.V(-499611205);
                    i14 = ((i13 >> 9) & 896) | ((i13 >> 6) & 14);
                    objK2 = dr0Var.K();
                    if (objK2 == obj) {
                        objK2 = new ll2();
                        dr0Var.f0(objK2);
                    }
                    ll2Var = (ll2) objK2;
                    zF = dr0Var.f(ui1Var);
                    objK3 = dr0Var.K();
                    if (zF) {
                        objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                        dr0Var.f0(objK3);
                    } else {
                        objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                        dr0Var.f0(objK3);
                    }
                    h7.J((zp0) objK3, dr0Var, ui1Var);
                    gz0Var = (gz0) dv.G0(ll2Var);
                    if (z7) {
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    objK4 = dr0Var.K();
                    if (objK4 == obj) {
                        objK4 = new tb(new cc0(f), S, null, 12);
                        dr0Var.f0(objK4);
                    }
                    tbVar = (tb) objK4;
                    cc0 cc0Var7 = new cc0(f);
                    boolean zH8 = dr0Var.h(tbVar) | dr0Var.c(f) | ((((i14 & 14) ^ 6) <= 4 && dr0Var.g(z7)) || (i14 & 6) == 4);
                    if (((i14 & 896) ^ 384) > 256) {
                    }
                    zH = zH8 | z4 | dr0Var.h(gz0Var);
                    objK5 = dr0Var.K();
                    if (zH) {
                        qp qpVar16 = qpVar2;
                        objK5 = new pp(tbVar, f, z7, qpVar16, gz0Var, (m10) null);
                        qpVar4 = qpVar16;
                        dr0Var.f0(objK5);
                    } else {
                        qp qpVar17 = qpVar2;
                        objK5 = new pp(tbVar, f, z7, qpVar17, gz0Var, (m10) null);
                        qpVar4 = qpVar17;
                        dr0Var.f0(objK5);
                    }
                    h7.J((zp0) objK5, dr0Var, cc0Var7);
                    ddVar = tbVar.c;
                    dr0Var.p(false);
                }
                if (ddVar != null) {
                    f2 = ((cc0) ddVar.i.getValue()).h;
                } else {
                    f2 = 0.0f;
                }
                objK6 = dr0Var.K();
                if (objK6 == obj) {
                    objK6 = new s0((byte) 27);
                    dr0Var.f0(objK6);
                }
                long j11 = j4;
                zn znVar11 = znVar4;
                iq2.c(kp0Var, tg2.a(rg1Var4, false, (vp0) objK6), z7, hi2Var3, j2, j11, 0.0f, f2, znVar11, ui1Var, dt.N(-535639973, new up(j11, rt1Var5, aq0Var, (byte) 0), dr0Var), dr0Var, (i13 & 8078) | ((i13 << 6) & 234881024), 64);
                z6 = z7;
                znVar3 = znVar11;
                qpVar3 = qpVar4;
                rg1Var3 = rg1Var4;
                lpVar3 = lpVar5;
                rt1Var3 = rt1Var5;
                hi2Var2 = hi2Var3;
            } else {
                dr0Var.Q();
                rt1Var3 = rt1Var2;
                rg1Var3 = rg1Var2;
                z6 = z3;
                hi2Var2 = hi2VarA;
                lpVar3 = lpVar2;
                qpVar3 = qpVar2;
                znVar3 = znVar2;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: sp
                    @Override // defpackage.zp0
                    public final Object f(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        aa3.a(kp0Var, rg1Var3, z6, hi2Var2, lpVar3, qpVar3, znVar3, rt1Var3, aq0Var, (dr0) obj2, m02.A(i2 | 1), i3);
                        return j23.a;
                    }
                };
            }
        }
        i4 |= 1572864;
        znVar2 = znVar;
        i9 = i3 & 128;
        if (i9 != 0) {
            i4 |= 12582912;
            rt1Var2 = rt1Var;
        } else {
            rt1Var2 = rt1Var;
            if ((i2 & 12582912) == 0) {
                if (dr0Var.f(rt1Var2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (dr0Var.f(null)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i4 |= i11;
        }
        if ((i2 & 805306368) == 0) {
            if (dr0Var.h(aq0Var)) {
                i15 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
            } else {
                i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i4 |= i15;
        }
        z4 = true;
        if ((i4 & 306783379) != 306783378) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (dr0Var.N(i4 & 1, z5)) {
            dr0Var.S();
            i12 = -458753;
            if ((i2 & 1) != 0) {
                if (i16 != 0) {
                    rg1Var2 = og1.h;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 8) != 0) {
                    rt1 rt1Var11115 = mp.a;
                    i4 &= -7169;
                    hi2VarA = mi2.a(uz0.k, dr0Var);
                }
                if ((i3 & 16) != 0) {
                    rt1 rt1Var11116 = mp.a;
                    pvVar = (pv) dr0Var.j(rv.a);
                    lpVar4 = pvVar.W;
                    if (lpVar4 == null) {
                        lp lpVar19 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                        pvVar.W = lpVar19;
                        lpVar4 = lpVar19;
                    }
                    i4 &= -57345;
                } else {
                    i12 = -458753;
                    lpVar4 = lpVar2;
                }
                if ((i3 & 32) != 0) {
                    rt1 rt1Var11117 = mp.a;
                    i4 &= i12;
                    qpVar2 = new qp(z);
                }
                if (i7 != 0) {
                    znVar2 = null;
                }
                if (i9 != 0) {
                    rt1Var4 = mp.a;
                } else {
                    rt1Var4 = rt1Var2;
                }
                lpVar5 = lpVar4;
                z7 = z3;
                hi2Var3 = hi2VarA;
                znVar4 = znVar2;
                i13 = i4;
                rt1Var5 = rt1Var4;
                rg1Var4 = rg1Var2;
            } else {
                if (i16 != 0) {
                    rg1Var2 = og1.h;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 8) != 0) {
                    rt1 rt1Var11118 = mp.a;
                    i4 &= -7169;
                    hi2VarA = mi2.a(uz0.k, dr0Var);
                }
                if ((i3 & 16) != 0) {
                    rt1 rt1Var11119 = mp.a;
                    pvVar = (pv) dr0Var.j(rv.a);
                    lpVar4 = pvVar.W;
                    if (lpVar4 == null) {
                        lp lpVar110 = new lp(rv.c(pvVar, u), rv.c(pvVar, A), kv.b(w, rv.c(pvVar, v)), kv.b(y, rv.c(pvVar, x)));
                        pvVar.W = lpVar110;
                        lpVar4 = lpVar110;
                    }
                    i4 &= -57345;
                } else {
                    i12 = -458753;
                    lpVar4 = lpVar2;
                }
                if ((i3 & 32) != 0) {
                    rt1 rt1Var111110 = mp.a;
                    i4 &= i12;
                    qpVar2 = new qp(z);
                }
                if (i7 != 0) {
                    znVar2 = null;
                }
                if (i9 != 0) {
                    rt1Var4 = mp.a;
                } else {
                    rt1Var4 = rt1Var2;
                }
                lpVar5 = lpVar4;
                z7 = z3;
                hi2Var3 = hi2VarA;
                znVar4 = znVar2;
                i13 = i4;
                rt1Var5 = rt1Var4;
                rg1Var4 = rg1Var2;
            }
            dr0Var.q();
            dr0Var.V(1691738187);
            objK = dr0Var.K();
            obj = zy.a;
            if (objK == obj) {
                objK = new ui1();
                dr0Var.f0(objK);
            }
            ui1Var = (ui1) objK;
            dr0Var.p(false);
            if (z7) {
                j2 = lpVar5.a;
            } else {
                j2 = lpVar5.c;
            }
            if (z7) {
                j3 = lpVar5.b;
            } else {
                j3 = lpVar5.d;
            }
            j4 = j3;
            if (qpVar2 == null) {
                dr0Var.V(1691921830);
                dr0Var.p(false);
                rt1Var5 = rt1Var5;
                j4 = j4;
                znVar4 = znVar4;
                ui1Var = ui1Var;
                qpVar4 = qpVar2;
                ddVar = null;
            } else {
                dr0Var.V(-499611205);
                i14 = ((i13 >> 9) & 896) | ((i13 >> 6) & 14);
                objK2 = dr0Var.K();
                if (objK2 == obj) {
                    objK2 = new ll2();
                    dr0Var.f0(objK2);
                }
                ll2Var = (ll2) objK2;
                zF = dr0Var.f(ui1Var);
                objK3 = dr0Var.K();
                if (zF) {
                    objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                    dr0Var.f0(objK3);
                } else {
                    objK3 = new op(ui1Var, ll2Var, null, (byte) 0);
                    dr0Var.f0(objK3);
                }
                h7.J((zp0) objK3, dr0Var, ui1Var);
                gz0Var = (gz0) dv.G0(ll2Var);
                if (z7) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
                objK4 = dr0Var.K();
                if (objK4 == obj) {
                    objK4 = new tb(new cc0(f), S, null, 12);
                    dr0Var.f0(objK4);
                }
                tbVar = (tb) objK4;
                cc0 cc0Var8 = new cc0(f);
                boolean zH9 = dr0Var.h(tbVar) | dr0Var.c(f) | ((((i14 & 14) ^ 6) <= 4 && dr0Var.g(z7)) || (i14 & 6) == 4);
                if (((i14 & 896) ^ 384) > 256) {
                }
                zH = zH9 | z4 | dr0Var.h(gz0Var);
                objK5 = dr0Var.K();
                if (zH) {
                    qp qpVar18 = qpVar2;
                    objK5 = new pp(tbVar, f, z7, qpVar18, gz0Var, (m10) null);
                    qpVar4 = qpVar18;
                    dr0Var.f0(objK5);
                } else {
                    qp qpVar19 = qpVar2;
                    objK5 = new pp(tbVar, f, z7, qpVar19, gz0Var, (m10) null);
                    qpVar4 = qpVar19;
                    dr0Var.f0(objK5);
                }
                h7.J((zp0) objK5, dr0Var, cc0Var8);
                ddVar = tbVar.c;
                dr0Var.p(false);
            }
            if (ddVar != null) {
                f2 = ((cc0) ddVar.i.getValue()).h;
            } else {
                f2 = 0.0f;
            }
            objK6 = dr0Var.K();
            if (objK6 == obj) {
                objK6 = new s0((byte) 27);
                dr0Var.f0(objK6);
            }
            long j12 = j4;
            zn znVar12 = znVar4;
            iq2.c(kp0Var, tg2.a(rg1Var4, false, (vp0) objK6), z7, hi2Var3, j2, j12, 0.0f, f2, znVar12, ui1Var, dt.N(-535639973, new up(j12, rt1Var5, aq0Var, (byte) 0), dr0Var), dr0Var, (i13 & 8078) | ((i13 << 6) & 234881024), 64);
            z6 = z7;
            znVar3 = znVar12;
            qpVar3 = qpVar4;
            rg1Var3 = rg1Var4;
            lpVar3 = lpVar5;
            rt1Var3 = rt1Var5;
            hi2Var2 = hi2Var3;
        } else {
            dr0Var.Q();
            rt1Var3 = rt1Var2;
            rg1Var3 = rg1Var2;
            z6 = z3;
            hi2Var2 = hi2VarA;
            lpVar3 = lpVar2;
            qpVar3 = qpVar2;
            znVar3 = znVar2;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: sp
                @Override // defpackage.zp0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    aa3.a(kp0Var, rg1Var3, z6, hi2Var2, lpVar3, qpVar3, znVar3, rt1Var3, aq0Var, (dr0) obj2, m02.A(i2 | 1), i3);
                    return j23.a;
                }
            };
        }
    }

    public static final void b(final List list, final Set set, final vp0 vp0Var, final vp0 vp0Var2, rg1 rg1Var, dr0 dr0Var, final int i2, final int i3) {
        int i4;
        final rg1 rg1Var2;
        list.getClass();
        set.getClass();
        vp0Var.getClass();
        vp0Var2.getClass();
        dr0Var.W(127453655);
        if ((i2 & 6) == 0) {
            i4 = (dr0Var.f(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i4 | (dr0Var.f(set) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i5 |= dr0Var.h(vp0Var) ? 256 : 128;
        }
        int i6 = i5 | (dr0Var.h(vp0Var2) ? 2048 : 1024);
        int i7 = i3 & 16;
        if (i7 != 0) {
            i6 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i6 |= dr0Var.f(rg1Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        byte b = 0;
        if (dr0Var.N(i6 & 1, (i6 & 9363) != 9362)) {
            rg1 rg1Var3 = i7 != 0 ? og1.h : rg1Var;
            ou.e(rg1Var3.c(yj2.a), new ah(8.0f, new wg(b)), null, null, 0, 0, dt.N(404007890, new t61(list, set, vp0Var2, vp0Var, (byte) 2), dr0Var), dr0Var, 1572912);
            rg1Var2 = rg1Var3;
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: pt
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aa3.b(list, set, vp0Var, vp0Var2, rg1Var2, (dr0) obj, m02.A(i2 | 1), i3);
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void c(final kp0 kp0Var, rg1 rg1Var, boolean z2, hi2 hi2Var, lp lpVar, zn znVar, rt1 rt1Var, final nx nxVar, dr0 dr0Var, final int i2, final int i3) {
        final rg1 rg1Var2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        boolean z4;
        final lp lpVar2;
        final zn znVar2;
        final rt1 rt1Var2;
        final boolean z5;
        final hi2 hi2Var2;
        e72 e72VarR;
        rg1 rg1Var3;
        pv pvVar;
        lp lpVar3;
        long jB;
        zn znVarC;
        int i8;
        rg1 rg1Var4;
        boolean z6;
        hi2 hi2Var3;
        lp lpVar4;
        rt1 rt1Var3;
        qv qvVar = ie1.M;
        dr0Var.W(399974542);
        int i9 = i2 | (dr0Var.h(kp0Var) ? 4 : 2);
        int i10 = i3 & 2;
        if (i10 == 0) {
            if ((i2 & 48) == 0) {
                rg1Var2 = rg1Var;
                i9 |= dr0Var.f(rg1Var2) ? 32 : 16;
            }
            i4 = i3 & 4;
            if (i4 != 0) {
                i6 = i9 | 384;
                z3 = z2;
            } else {
                z3 = z2;
                if (dr0Var.g(z3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i6 = i9 | i5;
            }
            i7 = i6 | 113976320;
            if ((306783379 & i7) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dr0Var.N(i7 & 1, z4)) {
                dr0Var.S();
                if ((i2 & 1) != 0 || dr0Var.x()) {
                    if (i10 != 0) {
                        rg1Var3 = og1.h;
                    } else {
                        rg1Var3 = rg1Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    rt1 rt1Var4 = mp.a;
                    hi2 hi2VarA = mi2.a(uz0.k, dr0Var);
                    pvVar = (pv) dr0Var.j(rv.a);
                    lpVar3 = pvVar.X;
                    if (lpVar3 == null) {
                        long j2 = kv.f;
                        lp lpVar5 = new lp(j2, rv.c(pvVar, ie1.L), j2, kv.b(ie1.K, rv.c(pvVar, ie1.J)));
                        pvVar.X = lpVar5;
                        lpVar3 = lpVar5;
                    }
                    float f = uz0.m;
                    if (z3) {
                        dr0Var.V(-112346942);
                        jB = rv.d(qvVar, dr0Var);
                        dr0Var.p(false);
                    } else {
                        dr0Var.V(-112259336);
                        jB = kv.b(0.1f, rv.d(qvVar, dr0Var));
                        dr0Var.p(false);
                    }
                    boolean z7 = z3;
                    znVarC = s60.c(f, jB);
                    i8 = i7 & (-3734529);
                    rg1Var4 = rg1Var3;
                    z6 = z7;
                    hi2Var3 = hi2VarA;
                    lpVar4 = lpVar3;
                    rt1Var3 = mp.a;
                } else {
                    dr0Var.Q();
                    hi2Var3 = hi2Var;
                    rt1Var3 = rt1Var;
                    i8 = i7 & (-3734529);
                    rg1Var4 = rg1Var2;
                    z6 = z3;
                    lpVar4 = lpVar;
                    znVarC = znVar;
                }
                dr0Var.q();
                a(kp0Var, rg1Var4, z6, hi2Var3, lpVar4, null, znVarC, rt1Var3, nxVar, dr0Var, i8 & 2147483646, 0);
                z5 = z6;
                znVar2 = znVarC;
                rt1Var2 = rt1Var3;
                hi2Var2 = hi2Var3;
                lpVar2 = lpVar4;
                rg1Var2 = rg1Var4;
            } else {
                dr0Var.Q();
                lpVar2 = lpVar;
                znVar2 = znVar;
                rt1Var2 = rt1Var;
                z5 = z3;
                hi2Var2 = hi2Var;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: tp
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aa3.c(kp0Var, rg1Var2, z5, hi2Var2, lpVar2, znVar2, rt1Var2, nxVar, (dr0) obj, m02.A(i2 | 1), i3);
                        return j23.a;
                    }
                };
            }
        }
        i9 |= 48;
        rg1Var2 = rg1Var;
        i4 = i3 & 4;
        if (i4 != 0) {
            i6 = i9 | 384;
            z3 = z2;
        } else {
            z3 = z2;
            if (dr0Var.g(z3)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i6 = i9 | i5;
        }
        i7 = i6 | 113976320;
        if ((306783379 & i7) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (dr0Var.N(i7 & 1, z4)) {
            dr0Var.S();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    rg1Var3 = og1.h;
                } else {
                    rg1Var3 = rg1Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                rt1 rt1Var5 = mp.a;
                hi2 hi2VarA2 = mi2.a(uz0.k, dr0Var);
                pvVar = (pv) dr0Var.j(rv.a);
                lpVar3 = pvVar.X;
                if (lpVar3 == null) {
                    long j3 = kv.f;
                    lp lpVar6 = new lp(j3, rv.c(pvVar, ie1.L), j3, kv.b(ie1.K, rv.c(pvVar, ie1.J)));
                    pvVar.X = lpVar6;
                    lpVar3 = lpVar6;
                }
                float f2 = uz0.m;
                if (z3) {
                    dr0Var.V(-112346942);
                    jB = rv.d(qvVar, dr0Var);
                    dr0Var.p(false);
                } else {
                    dr0Var.V(-112259336);
                    jB = kv.b(0.1f, rv.d(qvVar, dr0Var));
                    dr0Var.p(false);
                }
                boolean z8 = z3;
                znVarC = s60.c(f2, jB);
                i8 = i7 & (-3734529);
                rg1Var4 = rg1Var3;
                z6 = z8;
                hi2Var3 = hi2VarA2;
                lpVar4 = lpVar3;
                rt1Var3 = mp.a;
            } else {
                if (i10 != 0) {
                    rg1Var3 = og1.h;
                } else {
                    rg1Var3 = rg1Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                rt1 rt1Var6 = mp.a;
                hi2 hi2VarA3 = mi2.a(uz0.k, dr0Var);
                pvVar = (pv) dr0Var.j(rv.a);
                lpVar3 = pvVar.X;
                if (lpVar3 == null) {
                    long j4 = kv.f;
                    lp lpVar7 = new lp(j4, rv.c(pvVar, ie1.L), j4, kv.b(ie1.K, rv.c(pvVar, ie1.J)));
                    pvVar.X = lpVar7;
                    lpVar3 = lpVar7;
                }
                float f3 = uz0.m;
                if (z3) {
                    dr0Var.V(-112346942);
                    jB = rv.d(qvVar, dr0Var);
                    dr0Var.p(false);
                } else {
                    dr0Var.V(-112259336);
                    jB = kv.b(0.1f, rv.d(qvVar, dr0Var));
                    dr0Var.p(false);
                }
                boolean z9 = z3;
                znVarC = s60.c(f3, jB);
                i8 = i7 & (-3734529);
                rg1Var4 = rg1Var3;
                z6 = z9;
                hi2Var3 = hi2VarA3;
                lpVar4 = lpVar3;
                rt1Var3 = mp.a;
            }
            dr0Var.q();
            a(kp0Var, rg1Var4, z6, hi2Var3, lpVar4, null, znVarC, rt1Var3, nxVar, dr0Var, i8 & 2147483646, 0);
            z5 = z6;
            znVar2 = znVarC;
            rt1Var2 = rt1Var3;
            hi2Var2 = hi2Var3;
            lpVar2 = lpVar4;
            rg1Var2 = rg1Var4;
        } else {
            dr0Var.Q();
            lpVar2 = lpVar;
            znVar2 = znVar;
            rt1Var2 = rt1Var;
            z5 = z3;
            hi2Var2 = hi2Var;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: tp
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aa3.c(kp0Var, rg1Var2, z5, hi2Var2, lpVar2, znVar2, rt1Var2, nxVar, (dr0) obj, m02.A(i2 | 1), i3);
                    return j23.a;
                }
            };
        }
    }

    public static final e9 d() {
        return new e9(new Paint(7));
    }

    public static final void e(final kp0 kp0Var, rg1 rg1Var, boolean z2, hi2 hi2Var, lp lpVar, rt1 rt1Var, final aq0 aq0Var, dr0 dr0Var, final int i2, final int i3) {
        int i4;
        final hi2 hi2Var2;
        final lp lpVar2;
        final rg1 rg1Var2;
        final boolean z3;
        final rt1 rt1Var2;
        hi2 hi2VarA;
        lp lpVarA;
        lp lpVar3;
        rt1 rt1Var3;
        boolean z4;
        hi2 hi2Var3;
        rg1 rg1Var3;
        dr0Var.W(-1061374109);
        if ((i2 & 6) == 0) {
            i4 = (dr0Var.h(kp0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= dr0Var.f(rg1Var) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= dr0Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                hi2Var2 = hi2Var;
                int i7 = dr0Var.f(hi2Var2) ? 2048 : 1024;
                i4 |= i7;
            } else {
                hi2Var2 = hi2Var;
            }
            i4 |= i7;
        } else {
            hi2Var2 = hi2Var;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                lpVar2 = lpVar;
                int i8 = dr0Var.f(lpVar2) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
                i4 |= i8;
            } else {
                lpVar2 = lpVar;
            }
            i4 |= i8;
        } else {
            lpVar2 = lpVar;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= dr0Var.f(null) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= dr0Var.f(null) ? 1048576 : 524288;
        }
        int i9 = i4 | 113246208;
        if ((805306368 & i2) == 0) {
            i9 |= dr0Var.h(aq0Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if (dr0Var.N(i9 & 1, (306783379 & i9) != 306783378)) {
            dr0Var.S();
            if ((i2 & 1) == 0 || dr0Var.x()) {
                if (i5 != 0) {
                    rg1Var = og1.h;
                }
                boolean z5 = i6 == 0 ? z2 : true;
                if ((i3 & 8) != 0) {
                    rt1 rt1Var4 = mp.a;
                    hi2VarA = mi2.a(uz0.k, dr0Var);
                    i9 &= -7169;
                } else {
                    hi2VarA = hi2Var2;
                }
                if ((i3 & 16) != 0) {
                    rt1 rt1Var5 = mp.a;
                    lpVarA = mp.a((pv) dr0Var.j(rv.a));
                    i9 &= -57345;
                } else {
                    lpVarA = lpVar2;
                }
                lpVar3 = lpVarA;
                rt1Var3 = mp.b;
                z4 = z5;
                hi2Var3 = hi2VarA;
                rg1Var3 = rg1Var;
            } else {
                dr0Var.Q();
                if ((i3 & 8) != 0) {
                    i9 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    i9 &= -57345;
                }
                rg1Var3 = rg1Var;
                z4 = z2;
                rt1Var3 = rt1Var;
                hi2Var3 = hi2Var2;
                lpVar3 = lpVar2;
            }
            dr0Var.q();
            a(kp0Var, rg1Var3, z4, hi2Var3, lpVar3, null, null, rt1Var3, aq0Var, dr0Var, i9 & 2147483646, 0);
            lpVar2 = lpVar3;
            rt1Var2 = rt1Var3;
            hi2Var2 = hi2Var3;
            z3 = z4;
            rg1Var2 = rg1Var3;
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
            z3 = z2;
            rt1Var2 = rt1Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: rp
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aa3.e(kp0Var, rg1Var2, z3, hi2Var2, lpVar2, rt1Var2, aq0Var, (dr0) obj, m02.A(i2 | 1), i3);
                    return j23.a;
                }
            };
        }
    }

    public static final void f(dk2 dk2Var, ArrayList arrayList, int i2) {
        boolean zL = dk2Var.l(i2);
        int[] iArr = dk2Var.b;
        if (zL) {
            arrayList.add(dk2Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            f(dk2Var, arrayList, i4);
        }
    }

    public static final Object g(dm2 dm2Var, int i2) {
        Object obj;
        dm2Var.getClass();
        int iH = s60.h(dm2Var.k, i2, dm2Var.i);
        if (iH < 0 || (obj = dm2Var.j[iH]) == P) {
            return null;
        }
        return obj;
    }

    public static final rg1 h(rg1 rg1Var, vp0 vp0Var) {
        return rg1Var.c(new pd0(vp0Var));
    }

    public static final rg1 i(rg1 rg1Var, vp0 vp0Var) {
        return rg1Var.c(new wd0(vp0Var));
    }

    public static final rg1 l(rg1 rg1Var, vp0 vp0Var) {
        return rg1Var.c(new xd0(vp0Var));
    }

    public static final int m(ArrayList arrayList, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = uz0.i(((c01) arrayList.get(i4)).b, i2);
            if (i5 < 0) {
                i3 = i4 + 1;
            } else {
                if (i5 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void o(dm2 dm2Var) {
        int i2 = dm2Var.k;
        int[] iArr = dm2Var.i;
        Object[] objArr = dm2Var.j;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != P) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        dm2Var.h = false;
        dm2Var.k = i3;
    }

    public static final si1 p(zg2 zg2Var, vp0 vp0Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            wg2 wg2VarA = zg2Var.a();
            l41 l41Var = wg2VarA.c;
            if (!l41Var.J() || !l41Var.I()) {
                si1 si1Var = my0.a;
                si1Var.getClass();
                return si1Var;
            }
            r72 r72VarG = wg2VarA.g();
            si1 si1Var2 = new si1(48);
            xl1 xl1Var = new xl1((byte) 7);
            xl1Var.F(cu.a0(r72VarG));
            s(vp0Var, si1Var2, new xl1((byte) 7), xl1Var, wg2VarA, wg2VarA);
            return si1Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void q(vp0 vp0Var, si1 si1Var, xl1 xl1Var, xl1 xl1Var2, wg2 wg2Var, wg2 wg2Var2) {
        xl1 xl1Var3 = xl1Var;
        Region region = (Region) xl1Var3.i;
        xl1 xl1Var4 = xl1Var2;
        Region region2 = (Region) xl1Var4.i;
        l41 l41Var = wg2Var2.c;
        l41 l41Var2 = wg2Var2.c;
        if (!l41Var.J() || !l41Var2.I() || region2.isEmpty()) {
            if (wg2Var2.o()) {
                r(si1Var, wg2Var, wg2Var2);
                return;
            }
            return;
        }
        r72 r72VarN = wg2Var2.n();
        if (r72VarN.f()) {
            j80 j80VarF = wg2Var2.f();
            if (j80VarF == null) {
                gx0 gx0Var = l41Var2.L.c;
                r72VarN = es.D(gx0Var).M(gx0Var, false);
            } else {
                qg1 qg1Var = ((qg1) j80VarF).h;
                Object objG = wg2Var2.d.h.g(qg2.b);
                if (objG == null) {
                    objG = null;
                }
                r72VarN = y02.j(qg1Var, objG != null, false);
            }
        }
        ry0 ry0VarA0 = cu.a0(r72VarN);
        xl1Var3.F(ry0VarA0);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = wg2Var2.f;
            if (i2 == wg2Var.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            si1Var.h(i2, new yg2(wg2Var2, new ry0(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List listJ = wg2.j(4, wg2Var2);
            int size = listJ.size() - 1;
            while (-1 < size) {
                if (!((Boolean) vp0Var.h(listJ.get(size))).booleanValue()) {
                    q(vp0Var, si1Var, xl1Var3, xl1Var4, wg2Var, (wg2) listJ.get(size));
                }
                size--;
                xl1Var3 = xl1Var;
                xl1Var4 = xl1Var2;
            }
            if (A(wg2Var2)) {
                region2.op(ry0VarA0.a, ry0VarA0.b, ry0VarA0.c, ry0VarA0.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void r(si1 si1Var, wg2 wg2Var, wg2 wg2Var2) {
        l41 l41Var;
        wg2 wg2VarL = wg2Var2.l();
        r72 r72VarG = (wg2VarL == null || (l41Var = wg2VarL.c) == null || !l41Var.J()) ? O : wg2VarL.g();
        int i2 = wg2Var2.f;
        if (i2 == wg2Var.f) {
            i2 = -1;
        }
        si1Var.h(i2, new yg2(wg2Var2, cu.a0(r72VarG)));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0158  */
    /* JADX WARN: Code duplicated, block: B:73:0x0168  */
    /* JADX WARN: Code duplicated, block: B:95:0x0179 A[SYNTHETIC] */
    public static final void s(vp0 vp0Var, si1 si1Var, xl1 xl1Var, xl1 xl1Var2, wg2 wg2Var, wg2 wg2Var2) {
        int size;
        boolean z2;
        r72 r72VarJ;
        vp0 vp0Var2 = vp0Var;
        si1 si1Var2 = si1Var;
        int i2 = wg2Var.f;
        Region region = (Region) xl1Var.i;
        xl1 xl1Var3 = xl1Var2;
        Region region2 = (Region) xl1Var3.i;
        l41 l41Var = wg2Var2.c;
        rg2 rg2Var = wg2Var2.d;
        l41 l41Var2 = wg2Var2.c;
        int i3 = wg2Var2.f;
        boolean z3 = (l41Var.J() && l41Var2.I()) ? false : true;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z3 || wg2Var2.o()) {
                ry0 ry0VarA0 = cu.a0(wg2Var2.n());
                xl1Var.F(ry0VarA0);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (wg2Var2.o()) {
                        r(si1Var2, wg2Var, wg2Var2);
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            si1Var2.h(i3, new yg2(wg2Var2, new ry0(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                si1Var2.h(i3, new yg2(wg2Var2, new ry0(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = wg2.j(4, wg2Var2);
                if (rg2Var.j) {
                    wg2 wg2VarL = wg2Var2.l();
                    while (true) {
                        if (wg2VarL == null) {
                            wg2VarL = null;
                            break;
                        }
                        mj1 mj1Var = wg2VarL.d.h;
                        if (mj1Var.c(ah2.w) || mj1Var.c(ah2.v)) {
                            break;
                        } else {
                            wg2VarL = wg2VarL.l();
                        }
                    }
                    if (wg2VarL == null) {
                        z2 = false;
                    } else {
                        pn1 pn1VarD = wg2Var2.d();
                        if (pn1VarD == null) {
                            pn1VarD = null;
                        } else {
                            if (!pn1VarD.V0().u) {
                                pn1VarD = null;
                            }
                            if (pn1VarD == null) {
                                pn1VarD = null;
                            }
                        }
                        pn1 pn1VarD2 = wg2VarL.d();
                        if (pn1VarD2 == null) {
                            pn1VarD2 = null;
                        } else {
                            if (!pn1VarD2.V0().u) {
                                pn1VarD2 = null;
                            }
                            if (pn1VarD2 == null) {
                                pn1VarD2 = null;
                            }
                        }
                        if (pn1VarD == null || pn1VarD2 == null) {
                            z2 = false;
                        } else {
                            r72 r72VarM = pn1VarD2.M(pn1VarD, false);
                            z2 = !r72VarM.equals(r72VarM.e(h12.b(0L, ou.G(pn1VarD2.j))));
                        }
                    }
                    if (z2) {
                        xl1 xl1Var4 = new xl1((byte) 7);
                        j80 j80VarF = wg2Var2.f();
                        if (j80VarF == null) {
                            gx0 gx0Var = l41Var2.L.c;
                            r72VarJ = es.D(gx0Var).M(gx0Var, false);
                        } else {
                            qg1 qg1Var = ((qg1) j80VarF).h;
                            Object objG = rg2Var.h.g(qg2.b);
                            r72VarJ = y02.j(qg1Var, (objG == null ? null : objG) != null, false);
                        }
                        xl1Var4.F(cu.a0(r72VarJ));
                        int size2 = listJ.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) vp0Var2.h(listJ.get(size2))).booleanValue()) {
                                q(vp0Var2, si1Var2, new xl1((byte) 7), xl1Var4, wg2Var, (wg2) listJ.get(size2));
                            }
                            size2--;
                            si1Var2 = si1Var;
                        }
                    } else {
                        size = listJ.size() - 1;
                        while (-1 < size) {
                            if (!((Boolean) vp0Var2.h(listJ.get(size))).booleanValue()) {
                                s(vp0Var2, si1Var, xl1Var, xl1Var3, wg2Var, (wg2) listJ.get(size));
                            }
                            size--;
                            vp0Var2 = vp0Var;
                            xl1Var3 = xl1Var2;
                        }
                    }
                } else {
                    size = listJ.size() - 1;
                    while (-1 < size) {
                        if (!((Boolean) vp0Var2.h(listJ.get(size))).booleanValue()) {
                            s(vp0Var2, si1Var, xl1Var, xl1Var3, wg2Var, (wg2) listJ.get(size));
                        }
                        size--;
                        vp0Var2 = vp0Var;
                        xl1Var3 = xl1Var2;
                    }
                }
                if (A(wg2Var2)) {
                    region2.op(ry0VarA0.a, ry0VarA0.b, ry0VarA0.c, ry0VarA0.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static boolean t() {
        try {
            if (t6.O0 == null) {
                t6.O0 = Class.forName("android.os.SystemProperties");
            }
            Method declaredMethod = t6.P0;
            if (declaredMethod == null) {
                Class cls = t6.O0;
                declaredMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                t6.P0 = declaredMethod;
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return uz0.g(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final Paint u(e9 e9Var) {
        if (e9Var == null) {
            zw0.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + z72.a(e9Var.getClass()).b());
        }
        return (Paint) e9Var.b;
    }

    public static void v(double[] dArr, double d, double[] dArr2, double[] dArr3) {
        int length = dArr.length;
        int length2 = dArr2.length;
        int length3 = dArr3.length;
        BigDecimal[] bigDecimalArr = lg1.a;
        int iMin = Math.min(Math.min(length, length2), length3);
        for (int i2 = 0; i2 < iMin; i2++) {
            dArr[i2] = (dArr2[i2] * d) + dArr3[i2];
        }
    }

    public static void w(double[] dArr, int i2, double d, double[] dArr2, int i3, int i4, int i5) {
        while (i4 < i5) {
            int i6 = i2 + i4;
            dArr[i6] = (dArr2[i3 + i4] * d) + dArr[i6];
            i4++;
        }
    }

    public static void x(float[] fArr, int i2, float f, float[] fArr2, int i3, int i4, int i5) {
        while (i4 < i5) {
            int i6 = i2 + i4;
            fArr[i6] = (fArr2[i3 + i4] * f) + fArr[i6];
            i4++;
        }
    }

    public static void y(vc2[] vc2VarArr, int i2, vc2 vc2Var, vc2[] vc2VarArr2, int i3, int i4, int i5) {
        while (i4 < i5) {
            int i6 = i2 + i4;
            vc2VarArr[i6] = (vc2) vc2VarArr[i6].z1((vc2) vc2VarArr2[i3 + i4].i(vc2Var)).get();
            i4++;
        }
    }

    public static final boolean z(wg2 wg2Var) {
        pn1 pn1VarD = wg2Var.d();
        mj1 mj1Var = wg2Var.d.h;
        return (pn1VarD != null ? pn1VarD.e1() : false) || mj1Var.c(ah2.q) || mj1Var.c(ah2.p);
    }
}
