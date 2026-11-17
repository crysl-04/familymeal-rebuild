package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class co2 extends jo2 {
    public static boolean Q(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return V(str, str2, 0, z, 2) >= 0;
    }

    public static boolean R(CharSequence charSequence, char c) {
        charSequence.getClass();
        return U(charSequence, c, 0, 2) >= 0;
    }

    public static boolean S(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : a0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int T(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        int i2 = i < 0 ? 0 : i;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        qy0 qy0Var = new qy0(i2, length, 1);
        boolean z2 = charSequence instanceof String;
        int i3 = qy0Var.i;
        if (!z2) {
            if (i2 > i3) {
                return -1;
            }
            int i4 = i2;
            while (!a0(str, 0, charSequence, i4, str.length(), z)) {
                if (i4 == i3) {
                    return -1;
                }
                i4++;
            }
            return i4;
        }
        if (i2 > i3) {
            return -1;
        }
        int i5 = i2;
        while (true) {
            String str2 = (String) charSequence;
            int length3 = str.length();
            if (!z ? str.regionMatches(0, str2, i5, length3) : str.regionMatches(z, 0, str2, i5, length3)) {
                return i5;
            }
            if (i5 == i3) {
                return -1;
            }
            i5++;
        }
    }

    public static int U(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? W(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int V(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return T(charSequence, str, i, z);
    }

    public static final int W(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(gi.a0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (vs.A(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean X(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!vs.M(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int Y(CharSequence charSequence, char c) {
        int length = charSequence.length() - 1;
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, length);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(gi.a0(cArr), length);
        }
        int length2 = charSequence.length() - 1;
        if (length > length2) {
            length = length2;
        }
        while (-1 < length) {
            if (vs.A(cArr[0], charSequence.charAt(length), false)) {
                return length;
            }
            length--;
        }
        return -1;
    }

    public static List Z(CharSequence charSequence) {
        fa1 fa1Var = new fa1(charSequence);
        if (!fa1Var.hasNext()) {
            return ag0.h;
        }
        Object next = fa1Var.next();
        if (!fa1Var.hasNext()) {
            return lt.P(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (fa1Var.hasNext()) {
            arrayList.add(fa1Var.next());
        }
        return arrayList;
    }

    public static final boolean a0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence2.getClass();
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= charSequence2.length() - i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (vs.A(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                }
            }
            return true;
        }
        return false;
    }

    public static List b0(CharSequence charSequence, char[] cArr) {
        charSequence.getClass();
        byte b = 1;
        if (cArr.length == 1) {
            String strValueOf = String.valueOf(cArr[0]);
            int iT = T(charSequence, strValueOf, 0, false);
            if (iT == -1) {
                return lt.P(charSequence.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int length = 0;
            do {
                arrayList.add(charSequence.subSequence(length, iT).toString());
                length = strValueOf.length() + iT;
                iT = T(charSequence, strValueOf, length, false);
            } while (iT != -1);
            arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
            return arrayList;
        }
        zu0 zu0Var = new zu0(new u80(charSequence, new s((Object) cArr, (byte) 24)), b);
        ArrayList arrayList2 = new ArrayList(ev.o0(zu0Var, 10));
        Iterator it = zu0Var.iterator();
        while (true) {
            t80 t80Var = (t80) it;
            if (!t80Var.hasNext()) {
                return arrayList2;
            }
            qy0 qy0Var = (qy0) t80Var.next();
            qy0Var.getClass();
            arrayList2.add(charSequence.subSequence(qy0Var.h, qy0Var.i + 1).toString());
        }
    }

    public static String c0(String str, String str2, String str3) {
        int iV = V(str, str2, 0, false, 6);
        return iV == -1 ? str3 : str.substring(str2.length() + iV, str.length());
    }

    public static String d0(String str) {
        int iY = Y(str, '/');
        return iY == -1 ? str : str.substring(iY + 1, str.length());
    }

    public static CharSequence e0(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (i < 0) {
            li1.e(jp1.i(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String f0(int i, String str) {
        str.getClass();
        if (i < 0) {
            li1.e(jp1.i(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence g0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM = vs.M(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM) {
                    break;
                }
                length--;
            } else if (zM) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
