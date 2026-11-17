package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class lt implements sh, oe1 {
    public static final int B(dr0 dr0Var) {
        dr0Var.getClass();
        return Long.hashCode(dr0Var.T);
    }

    public static final h80 C(o20 o20Var) {
        m20 m20VarM = o20Var.m(c5.L);
        h80 h80Var = m20VarM instanceof h80 ? (h80) m20VarM : null;
        return h80Var == null ? c70.a : h80Var;
    }

    public static final float D(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static Set E() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static int H(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final void I(fe feVar, String str) {
        feVar.l(feVar.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static double J(int i, int i2, double[] dArr) {
        double d = h32.a;
        while (i < i2) {
            double dAbs = Math.abs(dArr[i]);
            if (dAbs > d) {
                d = dAbs;
            }
            i++;
        }
        return d;
    }

    public static void K(final boolean z, final int i, int i2, final int i3, final double[] dArr, final int i4, final double[] dArr2, final double[] dArr3, final int i5) {
        sh.n("ORMQR", "m", i >= 0);
        sh.n("ORMQR", "n", i2 >= 0);
        sh.n("ORMQR", "k", i3 >= 0 && i3 <= i);
        sh.n("ORMQR", "lda", i4 >= Math.max(1, i));
        sh.n("ORMQR", "ldc", i5 >= Math.max(1, i));
        if (i == 0 || i2 == 0 || i3 == 0) {
            return;
        }
        double d = i3;
        int iJ = oe1.j(40, ((((double) i) * 2.0d) - d) * d);
        if (i2 <= iJ) {
            gp1.a(z, i, i3, dArr, i4, dArr2, dArr3, i5, 0, i2);
            return;
        }
        u8 u8Var = gp1.a;
        u8Var.a = iJ;
        u8Var.b(0, i2, new sb0() { // from class: fp1
            @Override // defpackage.sb0
            public final void a(int i6, int i7) {
                gp1.a(z, i, i3, dArr, i4, dArr2, dArr3, i5, i6, i7);
            }
        });
    }

    public static void L(double[] dArr, double[] dArr2) {
        ys.r(dArr, 0, Math.min(dArr.length, dArr2.length), 1, h32.b, dArr2);
    }

    public static void M(double[] dArr, double[] dArr2) {
        ys.U(dArr, 0, Math.min(dArr.length, dArr2.length), 1, dArr, dArr2);
    }

    public static final boolean N(long j) {
        return (j & 2) != 0;
    }

    public static final boolean O(long j) {
        return (j & 1) != 0;
    }

    public static List P(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List Q(Object... objArr) {
        if (objArr.length <= 0) {
            return ag0.h;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static final CharSequence R(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static ArrayList S(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new fh(objArr));
    }

    public static final vl1 T(vp0 vp0Var) {
        wl1 wl1Var = new wl1();
        vp0Var.h(wl1Var);
        boolean z = wl1Var.b;
        boolean z2 = wl1Var.c;
        int i = wl1Var.d;
        boolean z3 = wl1Var.e;
        ji0 ji0Var = wl1Var.a;
        return new vl1(z, z2, i, false, z3, ji0Var.a, ji0Var.b);
    }

    public static final String U(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return wi0.i(sb, str != null ? wi0.h(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static final List V(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : P(list.get(0));
        }
        return ag0.h;
    }

    public static hn0 W(XmlResourceParser xmlResourceParser, Resources resources) throws Throwable {
        int next;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            int i = 2;
            if (next == 2) {
                xmlResourceParser.require(2, null, "font-family");
                if (!xmlResourceParser.getName().equals("font-family")) {
                    e0(xmlResourceParser);
                    return null;
                }
                TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), d52.b);
                int i2 = 0;
                String string = typedArrayObtainAttributes.getString(0);
                String string2 = typedArrayObtainAttributes.getString(5);
                String string3 = typedArrayObtainAttributes.getString(6);
                String string4 = typedArrayObtainAttributes.getString(2);
                int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                int i3 = 3;
                int integer = typedArrayObtainAttributes.getInteger(3, 1);
                int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
                String string5 = typedArrayObtainAttributes.getString(7);
                typedArrayObtainAttributes.recycle();
                if (string == null || string2 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), d52.c);
                                int i4 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                                boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i5 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                                String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                                int i6 = typedArrayObtainAttributes2.getInt(i5, 0);
                                int i7 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = typedArrayObtainAttributes2.getResourceId(i7, 0);
                                typedArrayObtainAttributes2.getString(i7);
                                typedArrayObtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    e0(xmlResourceParser);
                                }
                                arrayList.add(new jn0(i4, z, string6, i6, resourceId2));
                            } else {
                                e0(xmlResourceParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new in0((jn0[]) arrayList.toArray(new jn0[0]));
                }
                List listB0 = b0(resources, resourceId);
                ArrayList arrayList2 = new ArrayList();
                while (xmlResourceParser.next() != i3) {
                    if (xmlResourceParser.getEventType() == i) {
                        if (xmlResourceParser.getName().equals("fallback")) {
                            TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), d52.d);
                            try {
                                String string7 = typedArrayObtainAttributes3.getString(i2);
                                String string8 = typedArrayObtainAttributes3.getString(1);
                                String string9 = typedArrayObtainAttributes3.getString(i);
                                if (string7 == null) {
                                    typedArray = typedArrayObtainAttributes3;
                                    throw new XmlPullParserException("query attribute must be set in fallback element");
                                }
                                while (xmlResourceParser.next() != i3) {
                                    e0(xmlResourceParser);
                                }
                                try {
                                    typedArray = typedArrayObtainAttributes3;
                                    try {
                                        an0 an0Var = new an0(string, string2, string7, listB0, string8, string9);
                                        typedArray.recycle();
                                        arrayList2.add(an0Var);
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    typedArray = typedArrayObtainAttributes3;
                                }
                                th = th;
                            } catch (Throwable th3) {
                                th = th3;
                                typedArray = typedArrayObtainAttributes3;
                            }
                            typedArray.recycle();
                            throw th;
                        }
                        e0(xmlResourceParser);
                        i3 = i3;
                        integer = integer;
                        i = 2;
                        i2 = 0;
                    }
                }
                int i8 = integer;
                if (!arrayList2.isEmpty()) {
                    return new kn0(arrayList2, i8, integer2, string5);
                }
                if (string3 == null) {
                    wg.m("The provider font XML requires query attribute or fallback children.");
                    return null;
                }
                arrayList2.add(new an0(string, string2, string3, listB0, null, null));
                if (string4 != null) {
                    arrayList2.add(new an0(string, string2, string4, listB0, null, null));
                }
                return new kn0(arrayList2, i8, integer2, string5);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0171  */
    /* JADX WARN: Code duplicated, block: B:106:0x018c A[LOOP:7: B:105:0x018a->B:106:0x018c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x019c  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:136:0x0214  */
    /* JADX WARN: Code duplicated, block: B:138:0x0218  */
    /* JADX WARN: Code duplicated, block: B:140:0x021c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0220  */
    /* JADX WARN: Code duplicated, block: B:143:0x0222  */
    /* JADX WARN: Code duplicated, block: B:144:0x0225  */
    /* JADX WARN: Code duplicated, block: B:145:0x0228  */
    /* JADX WARN: Code duplicated, block: B:147:0x022b  */
    /* JADX WARN: Code duplicated, block: B:148:0x022d  */
    /* JADX WARN: Code duplicated, block: B:153:0x023b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x023d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x024b  */
    /* JADX WARN: Code duplicated, block: B:160:0x025e  */
    /* JADX WARN: Code duplicated, block: B:192:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0206 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0148 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0185 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0120  */
    /* JADX WARN: Code duplicated, block: B:88:0x0130  */
    /* JADX WARN: Code duplicated, block: B:90:0x0138  */
    /* JADX WARN: Code duplicated, block: B:95:0x014f A[LOOP:5: B:94:0x014d->B:95:0x014f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0165  */
    public static long X(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        long j2;
        char cCharAt;
        he0 he0Var;
        char cCharAt2;
        he0 he0Var2;
        long jB;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        int i15;
        double d;
        long jY;
        char cCharAt3;
        int i16;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        int i17;
        int i18;
        char cCharAt7;
        if (str.length() == 0) {
            wg.m("The string is empty");
            return 0L;
        }
        char cCharAt8 = str.charAt(0);
        int i19 = 1;
        char c = '-';
        char c2 = '+';
        if (cCharAt8 != '+') {
            i2 = cCharAt8 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            wg.m("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            wg.m("");
            return 0L;
        }
        int i20 = i2 + 1;
        if (i20 == str.length()) {
            wg.m("");
            return 0L;
        }
        int i21 = 0;
        he0 he0Var3 = null;
        long jC = 0;
        long j3 = 0;
        while (i20 < str.length()) {
            char cCharAt9 = str.charAt(i20);
            if (cCharAt9 != 'T') {
                kc1 kc1Var = kc1.c;
                int i22 = i19;
                char cCharAt10 = str.charAt(i20);
                if (cCharAt10 != c2) {
                    if (cCharAt10 != c) {
                        i3 = i20;
                    } else {
                        i3 = i20 + 1;
                        i4 = -1;
                    }
                    while (i3 < str.length() && str.charAt(i3) == '0') {
                        i3++;
                    }
                    j = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            cCharAt6 = str.charAt(i3);
                            i5 = i20;
                            if ('0' > cCharAt6 && cCharAt6 < ':') {
                                i17 = cCharAt6 - '0';
                                i18 = i;
                                long j4 = kc1Var.a;
                                if (j > j4 || (j == j4 && i17 > kc1Var.b)) {
                                    i6 = i18;
                                    while (i3 < str.length() && '0' <= (cCharAt7 = str.charAt(i3)) && cCharAt7 < ':') {
                                        i3++;
                                    }
                                    if (i3 != str.length()) {
                                        if (i3 != i5 + ((cCharAt9 == '+' || cCharAt9 == '-') ? i22 : 0)) {
                                            j = 4611686018427387903L;
                                            j2 = j;
                                            cCharAt = str.charAt(i3);
                                            he0Var = he0.SECONDS;
                                            if (cCharAt == '.') {
                                                i8 = i3 + 1;
                                                iMin = Math.min(i3 + 7, str.length());
                                                i10 = 0;
                                                for (i9 = i8; i9 < iMin; i9++) {
                                                    cCharAt5 = str.charAt(i9);
                                                    if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                                        for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                                            i10 = (i10 << 1) + (i10 << 3);
                                                        }
                                                        iMin2 = Math.min(i9 + 9, str.length());
                                                        i12 = i9;
                                                        i13 = 0;
                                                        while (true) {
                                                            if (i12 < iMin2) {
                                                                i16 = iMin2;
                                                                cCharAt4 = str.charAt(i12);
                                                                i14 = i12;
                                                                if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                                    i12 = i14 + 1;
                                                                    iMin2 = i16;
                                                                }
                                                            } else {
                                                                i14 = i12;
                                                            }
                                                        }
                                                        for (i15 = 0; i15 < 9 - (i14 - i9); i15++) {
                                                            i13 = (i13 << 1) + (i13 << 3);
                                                        }
                                                        i3 = i14;
                                                        while (i3 < str.length() && '0' <= (cCharAt3 = str.charAt(i3)) && cCharAt3 < ':') {
                                                            i3++;
                                                        }
                                                        if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                                            wg.m("");
                                                            return 0L;
                                                        }
                                                        long j5 = (((long) i10) * 1000000000) + ((long) i13);
                                                        long j6 = i4;
                                                        double d2 = j5;
                                                        switch (he0Var.ordinal()) {
                                                            case 0:
                                                                d = 1.0E-15d;
                                                                jY = ie1.y(d2 * d);
                                                                break;
                                                            case 1:
                                                                d = 1.0E-12d;
                                                                jY = ie1.y(d2 * d);
                                                                break;
                                                            case 2:
                                                                d = 1.0E-9d;
                                                                jY = ie1.y(d2 * d);
                                                                break;
                                                            case 3:
                                                                d = 1.0E-6d;
                                                                jY = ie1.y(d2 * d);
                                                                break;
                                                            case 4:
                                                                d = 6.0E-5d;
                                                                jY = ie1.y(d2 * d);
                                                                break;
                                                            case 5:
                                                                d = 0.0036d;
                                                                jY = ie1.y(d2 * d);
                                                                break;
                                                            case 6:
                                                                d = 0.0864d;
                                                                jY = ie1.y(d2 * d);
                                                                break;
                                                            default:
                                                                wg.h(he0Var, "Unknown unit: ");
                                                                jY = 0;
                                                                break;
                                                        }
                                                        j3 = jY * j6;
                                                    } else {
                                                        i10 = (cCharAt5 - '0') + (i10 << 3) + (i10 << 1);
                                                    }
                                                }
                                                while (i11 < 6 - (i9 - i8)) {
                                                    i10 = (i10 << 1) + (i10 << 3);
                                                }
                                                iMin2 = Math.min(i9 + 9, str.length());
                                                i12 = i9;
                                                i13 = 0;
                                                while (true) {
                                                    if (i12 < iMin2) {
                                                        i16 = iMin2;
                                                        cCharAt4 = str.charAt(i12);
                                                        i14 = i12;
                                                        if ('0' > cCharAt4) {
                                                        }
                                                    } else {
                                                        i14 = i12;
                                                    }
                                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                    i12 = i14 + 1;
                                                    iMin2 = i16;
                                                }
                                                while (i15 < 9 - (i14 - i9)) {
                                                    i13 = (i13 << 1) + (i13 << 3);
                                                }
                                                i3 = i14;
                                                while (i3 < str.length()) {
                                                    i3++;
                                                }
                                                if (i3 != i8) {
                                                }
                                                wg.m("");
                                                return 0L;
                                            }
                                            cCharAt2 = str.charAt(i3);
                                            he0Var2 = he0.DAYS;
                                            if (cCharAt2 == 'D') {
                                                he0Var = he0Var2;
                                            } else if (cCharAt2 == 'H') {
                                                he0Var = he0.HOURS;
                                            } else if (cCharAt2 == 'M') {
                                                he0Var = he0.MINUTES;
                                            } else if (cCharAt2 != 'S') {
                                                he0Var = null;
                                            }
                                            if (he0Var == null) {
                                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                            }
                                            if (he0Var3 == null && he0Var3.compareTo(he0Var) <= 0) {
                                                wg.m("Unexpected order of duration components");
                                                return 0L;
                                            }
                                            if (he0Var == he0Var2) {
                                                if (i21 != 0) {
                                                    wg.m("");
                                                    return 0L;
                                                }
                                                jC = cu.C(j2, he0Var) * ((long) i4);
                                            } else {
                                                if (i21 == 0) {
                                                    wg.m("");
                                                    return 0L;
                                                }
                                                jB = b(jC, cu.C(j2, he0Var) * ((long) i4));
                                                if (jB == 9223372036854759646L) {
                                                    wg.m("");
                                                    return 0L;
                                                }
                                                jC = jB;
                                            }
                                            i20 = i3 + 1;
                                            he0Var3 = he0Var;
                                            i19 = i22;
                                            i = i6;
                                            c = '-';
                                            c2 = '+';
                                        }
                                    }
                                    wg.m("");
                                    return 0L;
                                }
                                j = (j << 3) + (j << i22) + ((long) i17);
                                i3++;
                                i20 = i5;
                                kc1Var = kc1Var;
                                i = i18;
                            }
                        } else {
                            i5 = i20;
                        }
                        i6 = i;
                        if (i3 == str.length()) {
                            if (cCharAt9 != '+' || cCharAt9 == '-') {
                                i7 = i22;
                            } else {
                                i7 = 0;
                            }
                            if (i3 == i5 + i7) {
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            he0Var = he0.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        if (i12 < iMin2) {
                                            i16 = iMin2;
                                            cCharAt4 = str.charAt(i12);
                                            i14 = i12;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                        i12 = i14 + 1;
                                        iMin2 = i16;
                                    }
                                    while (i15 < 9 - (i14 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i14;
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    wg.m("");
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                wg.m("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            he0Var2 = he0.DAYS;
                            if (cCharAt2 == 'D') {
                                he0Var = he0Var2;
                            } else if (cCharAt2 == 'H') {
                                he0Var = he0.HOURS;
                            } else if (cCharAt2 == 'M') {
                                he0Var = he0.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                he0Var = null;
                            }
                            if (he0Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (he0Var3 == null) {
                            }
                            if (he0Var == he0Var2) {
                                if (i21 != 0) {
                                    wg.m("");
                                    return 0L;
                                }
                                jC = cu.C(j2, he0Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    wg.m("");
                                    return 0L;
                                }
                                jB = b(jC, cu.C(j2, he0Var) * ((long) i4));
                                if (jB == 9223372036854759646L) {
                                    wg.m("");
                                    return 0L;
                                }
                                jC = jB;
                            }
                            i20 = i3 + 1;
                            he0Var3 = he0Var;
                            i19 = i22;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        }
                        wg.m("");
                        return 0L;
                    }
                }
                i3 = i20 + 1;
                i4 = i22;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 < str.length()) {
                        cCharAt6 = str.charAt(i3);
                        i5 = i20;
                        if ('0' > cCharAt6) {
                        }
                    } else {
                        i5 = i20;
                    }
                    i6 = i;
                    if (i3 == str.length()) {
                        if (cCharAt9 != '+') {
                            i7 = i22;
                        } else {
                            i7 = i22;
                        }
                        if (i3 == i5 + i7) {
                        }
                        j2 = j;
                        cCharAt = str.charAt(i3);
                        he0Var = he0.SECONDS;
                        if (cCharAt == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            while (i9 < iMin) {
                                cCharAt5 = str.charAt(i9);
                                if ('0' <= cCharAt5) {
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                wg.m("");
                                return 0L;
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i12 = i9;
                            i13 = 0;
                            while (true) {
                                if (i12 < iMin2) {
                                    i16 = iMin2;
                                    cCharAt4 = str.charAt(i12);
                                    i14 = i12;
                                    if ('0' > cCharAt4) {
                                    }
                                } else {
                                    i14 = i12;
                                }
                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                i12 = i14 + 1;
                                iMin2 = i16;
                            }
                            while (i15 < 9 - (i14 - i9)) {
                                i13 = (i13 << 1) + (i13 << 3);
                            }
                            i3 = i14;
                            while (i3 < str.length()) {
                                i3++;
                            }
                            if (i3 != i8) {
                            }
                            wg.m("");
                            return 0L;
                        }
                        cCharAt2 = str.charAt(i3);
                        he0Var2 = he0.DAYS;
                        if (cCharAt2 == 'D') {
                            he0Var = he0Var2;
                        } else if (cCharAt2 == 'H') {
                            he0Var = he0.HOURS;
                        } else if (cCharAt2 == 'M') {
                            he0Var = he0.MINUTES;
                        } else if (cCharAt2 != 'S') {
                            he0Var = null;
                        }
                        if (he0Var == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (he0Var3 == null) {
                        }
                        if (he0Var == he0Var2) {
                            if (i21 != 0) {
                                wg.m("");
                                return 0L;
                            }
                            jC = cu.C(j2, he0Var) * ((long) i4);
                        } else {
                            if (i21 == 0) {
                                wg.m("");
                                return 0L;
                            }
                            jB = b(jC, cu.C(j2, he0Var) * ((long) i4));
                            if (jB == 9223372036854759646L) {
                                wg.m("");
                                return 0L;
                            }
                            jC = jB;
                        }
                        i20 = i3 + 1;
                        he0Var3 = he0Var;
                        i19 = i22;
                        i = i6;
                        c = '-';
                        c2 = '+';
                    }
                    wg.m("");
                    return 0L;
                    j = (j << 3) + (j << i22) + ((long) i17);
                    i3++;
                    i20 = i5;
                    kc1Var = kc1Var;
                    i = i18;
                }
            } else {
                if (i21 != 0 || (i20 = i20 + 1) == str.length()) {
                    wg.m("");
                    return 0L;
                }
                i21 = i19;
            }
        }
        int i23 = i;
        long jE = de0.e(j0(jC, he0.MILLISECONDS), j0(j3, he0.NANOSECONDS));
        return (i23 == 0 || jE == de0.l) ? jE : de0.g(jE);
    }

    public static final long Y(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final long Z(fv0 fv0Var, ks1 ks1Var, ev0 ev0Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits = fv0Var.g;
        if (ks1Var != null) {
            int i = ev0Var.a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = ks1Var == ks1.i ? ((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32 : ((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L;
        }
        long jD = up1.d(a0(fv0Var, ks1Var, ev0Var), jFloatToRawIntBits);
        if (z || !fv0Var.i) {
            return jD;
        }
        return 0L;
    }

    public static final long a(int i) {
        long j = ((long) i) << 32;
        int i2 = t21.O;
        return j;
    }

    public static final long a0(fv0 fv0Var, ks1 ks1Var, ev0 ev0Var) {
        float fIntBitsToFloat;
        if (ks1Var == null) {
            return fv0Var.c;
        }
        int i = ev0Var.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (fv0Var.c >> 32));
        } else {
            if (i != 2) {
                return fv0Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (fv0Var.c & 4294967295L));
        }
        return ks1Var == ks1.i ? ((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32 : ((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L;
    }

    public static final long b(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : cy1.o(j + j2);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static List b0(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static ArrayList c(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new fh(objArr));
    }

    public static final br0 c0(dr0 dr0Var) {
        dr0 dr0Var2;
        dr0Var.T(206, ez.e);
        if (dr0Var.S) {
            ik2.y(dr0Var.I);
        }
        Object objC = dr0Var.C();
        hr0 i92Var = objC instanceof hr0 ? (hr0) objC : null;
        if (i92Var == null) {
            dr0Var2 = dr0Var;
            i92Var = new i92(new ar0(new br0(dr0Var2, dr0Var.T, dr0Var.q, dr0Var.C, dr0Var.h.A)), -1);
            dr0Var2.g0(i92Var);
        } else {
            dr0Var2 = dr0Var;
        }
        br0 br0Var = ((ar0) i92Var.a).h;
        br0Var.f.setValue(dr0Var2.l());
        dr0Var2.p(false);
        return br0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void d(n10 n10Var) {
        i80 i80Var;
        if (n10Var instanceof i80) {
            i80Var = (i80) n10Var;
            int i = i80Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                i80Var.l = i - Integer.MIN_VALUE;
            } else {
                i80Var = new i80(n10Var);
            }
        } else {
            i80Var = new i80(n10Var);
        }
        Object obj = i80Var.k;
        int i2 = i80Var.l;
        if (i2 == 0) {
            m02.y(obj);
            i80Var.l = 1;
            rq rqVar = new rq(1, ls.F(i80Var));
            rqVar.u();
            if (rqVar.t() == y20.h) {
                return;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            m02.y(obj);
        }
        wg.k();
    }

    public static final long d0(long j) {
        return (((long) Math.round(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
    }

    public static na1 e(na1 na1Var) {
        na1Var.f();
        na1Var.j = true;
        return na1Var.i > 0 ? na1Var : na1.k;
    }

    public static void e0(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final boolean f(fv0 fv0Var) {
        return !fv0Var.h && fv0Var.d;
    }

    public static final i62 f0(vr vrVar, k10 k10Var, jn2 jn2Var, Float f) {
        ds.e.getClass();
        cs csVar = cs.a;
        k42 k42Var = new k42(vrVar, xf0.h, (byte) 5);
        nn2 nn2VarN = h7.N(f);
        ie1.o(k10Var, (o20) k42Var.j, jn2Var.equals(ui2.a) ? a30.h : a30.k, new hd0(jn2Var, (pk0) k42Var.i, nn2VarN, f, (m10) null));
        return new i62(nn2VarN);
    }

    public static final boolean g(fv0 fv0Var) {
        return fv0Var.h && !fv0Var.d;
    }

    public static void g0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void h(int i, int i2) {
        if (i < 0 || i >= i2) {
            wg.i(wi0.f(i, i2, "index: ", ", size: "));
        }
    }

    public static void h0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void i(int i, int i2) {
        if (i < 0 || i > i2) {
            wg.i(wi0.f(i, i2, "index: ", ", size: "));
        }
    }

    public static final long i0(long j) {
        yy yyVar = de0.i;
        boolean z = j > 0;
        if (z) {
            long jE = de0.e(j, j0(999999L, he0.NANOSECONDS));
            return ((((int) jE) & 1) != 1 || de0.d(jE)) ? de0.f(jE, he0.MILLISECONDS) : jE >> 1;
        }
        if (!z) {
            return 0L;
        }
        wg.n();
        return 0L;
    }

    public static final long j0(long j, he0 he0Var) {
        TimeUnit timeUnit = he0Var.h;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            yy yyVar = de0.i;
            long j2 = jConvert2 << 1;
            int i = fe0.a;
            return j2;
        }
        if (he0Var.compareTo(he0.MILLISECONDS) < 0) {
            return t(cy1.o(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return t(cu.C(Math.abs(j), he0Var) * jSignum);
    }

    public static final void k0(List list, l9 l9Var) {
        uv1 uv1Var;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        List list2 = list;
        l9 l9Var2 = l9Var;
        Path path = l9Var2.a;
        Path path2 = l9Var2.a;
        Path.FillType fillType = path.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path2.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path2.setFillType(fillType2);
        uv1 uv1Var2 = list2.isEmpty() ? cv1.c : (uv1) list2.get(0);
        int size = list2.size();
        float f9 = 0.0f;
        int i = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (i < size) {
            uv1 uv1Var3 = (uv1) list2.get(i);
            if (uv1Var3 instanceof cv1) {
                path2.close();
                path2 = path2;
                size = size;
                f9 = f9;
                i = i;
                uv1Var = uv1Var3;
                f10 = f14;
                f12 = f10;
                f11 = f15;
                f13 = f11;
            } else {
                if (uv1Var3 instanceof ov1) {
                    ov1 ov1Var = (ov1) uv1Var3;
                    float f16 = ov1Var.c;
                    f12 += f16;
                    float f17 = ov1Var.d;
                    f13 += f17;
                    path2.rMoveTo(f16, f17);
                    path2 = path2;
                    f14 = f12;
                    f15 = f13;
                } else if (uv1Var3 instanceof gv1) {
                    gv1 gv1Var = (gv1) uv1Var3;
                    float f18 = gv1Var.c;
                    float f19 = gv1Var.d;
                    path2.moveTo(f18, f19);
                    f13 = f19;
                    f15 = f13;
                    f12 = f18;
                    f14 = f12;
                } else if (uv1Var3 instanceof nv1) {
                    nv1 nv1Var = (nv1) uv1Var3;
                    float f20 = nv1Var.d;
                    float f21 = nv1Var.c;
                    path2.rLineTo(f21, f20);
                    f12 += f21;
                    f13 += f20;
                } else if (uv1Var3 instanceof fv1) {
                    fv1 fv1Var = (fv1) uv1Var3;
                    float f22 = fv1Var.d;
                    float f23 = fv1Var.c;
                    l9Var2.d(f23, f22);
                    f12 = f23;
                    f13 = f22;
                } else if (uv1Var3 instanceof mv1) {
                    float f24 = ((mv1) uv1Var3).c;
                    path2.rLineTo(f24, f9);
                    f12 += f24;
                } else if (uv1Var3 instanceof ev1) {
                    float f25 = ((ev1) uv1Var3).c;
                    l9Var2.d(f25, f13);
                    f12 = f25;
                } else {
                    if (uv1Var3 instanceof sv1) {
                        f8 = ((sv1) uv1Var3).c;
                        path2.rLineTo(f9, f8);
                    } else if (uv1Var3 instanceof tv1) {
                        float f26 = ((tv1) uv1Var3).c;
                        l9Var2.d(f12, f26);
                        f13 = f26;
                    } else if (uv1Var3 instanceof lv1) {
                        lv1 lv1Var = (lv1) uv1Var3;
                        path2.rCubicTo(lv1Var.c, lv1Var.d, lv1Var.e, lv1Var.f, lv1Var.g, lv1Var.h);
                        f10 = lv1Var.e + f12;
                        f11 = lv1Var.f + f13;
                        f12 += lv1Var.g;
                        f8 = lv1Var.h;
                    } else {
                        if (uv1Var3 instanceof dv1) {
                            dv1 dv1Var = (dv1) uv1Var3;
                            path2.cubicTo(dv1Var.c, dv1Var.d, dv1Var.e, dv1Var.f, dv1Var.g, dv1Var.h);
                            f10 = dv1Var.e;
                            f11 = dv1Var.f;
                            f4 = dv1Var.g;
                            f5 = dv1Var.h;
                        } else if (uv1Var3 instanceof qv1) {
                            if (uv1Var2.a) {
                                f7 = f13 - f11;
                                f6 = f12 - f10;
                            } else {
                                f6 = f9;
                                f7 = f6;
                            }
                            qv1 qv1Var = (qv1) uv1Var3;
                            path2.rCubicTo(f6, f7, qv1Var.c, qv1Var.d, qv1Var.e, qv1Var.f);
                            f10 = qv1Var.c + f12;
                            f11 = qv1Var.d + f13;
                            f12 += qv1Var.e;
                            f8 = qv1Var.f;
                        } else if (uv1Var3 instanceof iv1) {
                            if (uv1Var2.a) {
                                f12 = (f12 * 2.0f) - f10;
                                f13 = (2.0f * f13) - f11;
                            }
                            iv1 iv1Var = (iv1) uv1Var3;
                            path2.cubicTo(f12, f13, iv1Var.c, iv1Var.d, iv1Var.e, iv1Var.f);
                            f10 = iv1Var.c;
                            f11 = iv1Var.d;
                            f4 = iv1Var.e;
                            f5 = iv1Var.f;
                        } else if (uv1Var3 instanceof pv1) {
                            pv1 pv1Var = (pv1) uv1Var3;
                            float f27 = pv1Var.f;
                            float f28 = pv1Var.e;
                            float f29 = pv1Var.d;
                            float f30 = pv1Var.c;
                            path2.rQuadTo(f30, f29, f28, f27);
                            float f31 = f30 + f12;
                            float f32 = f29 + f13;
                            f12 += f28;
                            f13 += f27;
                            f10 = f31;
                            f11 = f32;
                        } else {
                            if (uv1Var3 instanceof hv1) {
                                hv1 hv1Var = (hv1) uv1Var3;
                                float f33 = hv1Var.f;
                                float f34 = hv1Var.e;
                                float f35 = hv1Var.d;
                                f3 = hv1Var.c;
                                path2.quadTo(f3, f35, f34, f33);
                                f13 = f33;
                                f12 = f34;
                                f11 = f35;
                            } else if (uv1Var3 instanceof rv1) {
                                if (uv1Var2.b) {
                                    f = f12 - f10;
                                    f2 = f13 - f11;
                                } else {
                                    f = f9;
                                    f2 = f;
                                }
                                rv1 rv1Var = (rv1) uv1Var3;
                                float f36 = rv1Var.d;
                                float f37 = rv1Var.c;
                                path2.rQuadTo(f, f2, f37, f36);
                                f3 = f + f12;
                                float f38 = f2 + f13;
                                f12 += f37;
                                f13 += f36;
                                f11 = f38;
                            } else if (uv1Var3 instanceof jv1) {
                                if (uv1Var2.b) {
                                    f12 = (f12 * 2.0f) - f10;
                                    f13 = (2.0f * f13) - f11;
                                }
                                jv1 jv1Var = (jv1) uv1Var3;
                                float f39 = jv1Var.d;
                                float f40 = jv1Var.c;
                                path2.quadTo(f12, f13, f40, f39);
                                path2 = path2;
                                size = size;
                                f9 = f9;
                                i = i;
                                f11 = f13;
                                uv1Var = uv1Var3;
                                f13 = f39;
                                f10 = f12;
                                f12 = f40;
                            } else if (uv1Var3 instanceof kv1) {
                                kv1 kv1Var = (kv1) uv1Var3;
                                float f41 = kv1Var.h + f12;
                                float f42 = kv1Var.i + f13;
                                size = size;
                                f9 = 0.0f;
                                path2 = path2;
                                i = i;
                                s(l9Var, f12, f13, f41, f42, kv1Var.c, kv1Var.d, kv1Var.e, kv1Var.f, kv1Var.g);
                                f10 = f41;
                                f12 = f10;
                                f11 = f42;
                                f13 = f11;
                                uv1Var = uv1Var3;
                            } else {
                                path2 = path2;
                                size = size;
                                f9 = f9;
                                i = i;
                                if (!(uv1Var3 instanceof bv1)) {
                                    wg.n();
                                    return;
                                }
                                bv1 bv1Var = (bv1) uv1Var3;
                                float f43 = bv1Var.i;
                                float f44 = bv1Var.h;
                                uv1Var = uv1Var3;
                                s(l9Var, f12, f13, f44, f43, bv1Var.c, bv1Var.d, bv1Var.e, bv1Var.f, bv1Var.g);
                                f11 = f43;
                                f13 = f11;
                                f10 = f44;
                                f12 = f10;
                            }
                            size = size;
                            f9 = f9;
                            i = i;
                            uv1Var = uv1Var3;
                            f10 = f3;
                        }
                        f13 = f5;
                        f12 = f4;
                    }
                    f13 += f8;
                }
                uv1Var = uv1Var3;
            }
            i++;
            list2 = list;
            l9Var2 = l9Var;
            size = size;
            path2 = path2;
            uv1Var2 = uv1Var;
            f9 = f9;
        }
    }

    public static final void l(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbK = wi0.k("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            sbK.append(i3);
            throw new IndexOutOfBoundsException(sbK.toString());
        }
        if (i <= i2) {
            return;
        }
        wg.m(wi0.f(i, i2, "fromIndex: ", " > toIndex: "));
    }

    public static String l0(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return Float.intBitsToFloat(i) == Float.intBitsToFloat(i2) ? wi0.h("CornerRadius.circular(", m0(Float.intBitsToFloat(i)), ")") : jp1.k("CornerRadius.elliptical(", m0(Float.intBitsToFloat(i)), ", ", m0(Float.intBitsToFloat(i2)), ")");
    }

    public static rg1 m(rg1 rg1Var) {
        return rg1Var.c(new ot(new s0((byte) 28)));
    }

    public static final String m0(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        float f2 = f * 10.0f;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        return String.valueOf(i / 10.0f);
    }

    public static final int n0(u71 u71Var) {
        List list = u71Var.l;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((v71) list.get(i2)).m;
        }
        return (i / list.size()) + u71Var.r;
    }

    public static final int o(long j, long j2) {
        boolean zO = O(j);
        if (zO != O(j2)) {
            return zO ? -1 : 1;
        }
        int iSignum = (int) Math.signum(D(j) - D(j2));
        if (Math.min(D(j), D(j2)) < 0.0f || N(j) == N(j2)) {
            return iSignum;
        }
        return N(j) ? -1 : 1;
    }

    public static final boolean p(r72 r72Var, float f, float f2) {
        float f3 = r72Var.a;
        if (f > r72Var.c || f3 > f) {
            return false;
        }
        return f2 <= r72Var.d && r72Var.b <= f2;
    }

    public static na1 q() {
        return new na1(10);
    }

    public static final Object r(long j, n10 n10Var) {
        if (j > 0) {
            rq rqVar = new rq(1, ls.F(n10Var));
            rqVar.u();
            if (j < Long.MAX_VALUE) {
                C(rqVar.l).c(j, rqVar);
            }
            Object objT = rqVar.t();
            if (objT == y20.h) {
                return objT;
            }
        }
        return j23.a;
    }

    public static final void s(l9 l9Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 != 0.0d) {
            double d21 = (1.0d / d20) - 0.25d;
            if (d21 < 0.0d) {
                double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
                s(l9Var, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
                return;
            }
            double dSqrt2 = Math.sqrt(d21);
            double d22 = d16 * dSqrt2;
            double d23 = dSqrt2 * d17;
            if (z == z2) {
                d8 = d18 - d23;
                d9 = d19 + d22;
            } else {
                d8 = d18 + d23;
                d9 = d19 - d22;
            }
            double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
            double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
            if (z2 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d24 = d8 * d10;
            double d25 = d9 * d6;
            double d26 = (d24 * dCos) - (d25 * dSin);
            double d27 = (d25 * dCos) + (d24 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(d11);
            double dSin2 = Math.sin(d11);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d28 = -d10;
            double d29 = d28 * dCos2;
            double d30 = d6 * dSin2;
            double d31 = (d29 * dSin3) - (d30 * dCos3);
            double d32 = d28 * dSin2;
            double d33 = d6 * dCos2;
            double d34 = (dCos3 * d33) + (dSin3 * d32);
            double d35 = dAtan3 / ((double) iCeil);
            double d36 = dAtan2;
            double d37 = d31;
            int i = 0;
            double d38 = d34;
            double d39 = d2;
            while (i < iCeil) {
                double d40 = d36 + d35;
                double dSin4 = Math.sin(d40);
                double dCos4 = Math.cos(d40);
                int i2 = iCeil;
                double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
                double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
                double d43 = (d29 * dSin4) - (d30 * dCos4);
                double d44 = (dCos4 * d33) + (dSin4 * d32);
                double d45 = d40 - d36;
                double dTan = Math.tan(d45 / 2.0d);
                double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
                l9Var.a.cubicTo((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
                d35 = d35;
                dSin2 = dSin2;
                d26 = d26;
                d = d41;
                i++;
                d32 = d32;
                d36 = d40;
                d38 = d44;
                d37 = d43;
                iCeil = i2;
                d39 = d42;
                d10 = d5;
            }
        }
    }

    public static final long t(long j) {
        long j2 = (j << 1) + 1;
        de0.i.getClass();
        int i = fe0.a;
        return j2;
    }

    public static final boolean u(long j, long j2) {
        return j == j2;
    }

    public static void v(double d, int i, double[] dArr) {
        for (int i2 = 0; i2 < i; i2++) {
            dArr[i2] = d;
        }
    }

    public static final long w(float f, int i, long j, boolean z) {
        int i2 = ((z || i == 2 || i == 4 || i == 5) && k00.e(j)) ? k00.i(j) : Integer.MAX_VALUE;
        if (k00.k(j) != i2) {
            i2 = cy1.n(rz1.g(f), k00.k(j), i2);
        }
        return y(0, i2, 0, k00.h(j));
    }

    public static long x(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    l00.l(i6);
                    wg.k();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return l00.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long y(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    l00.l(i6);
                    wg.k();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return l00.a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static final String z(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !co2.X(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !co2.X(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public final Object A(int i) {
        mz0 mz0VarC = F().c(i);
        return mz0VarC.c.a().h(Integer.valueOf(i - mz0VarC.a));
    }

    public abstract u8 F();

    public final Object G(int i) {
        Object objH;
        mz0 mz0VarC = F().c(i);
        int i2 = i - mz0VarC.a;
        vp0 key = mz0VarC.c.getKey();
        return (key == null || (objH = key.h(Integer.valueOf(i2))) == null) ? new l70(i) : objH;
    }
}
