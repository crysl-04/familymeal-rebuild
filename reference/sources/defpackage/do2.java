package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class do2 extends y02 {
    public static String G(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        fa1 fa1Var = new fa1(str);
        int i = 0;
        while (fa1Var.hasNext()) {
            String strConcat = (String) fa1Var.next();
            strConcat.getClass();
            if (!co2.X(strConcat)) {
                strConcat = "    ".concat(strConcat);
            } else if (strConcat.length() < 4) {
                strConcat = "    ";
            }
            i++;
            if (i > 1) {
                sb.append((CharSequence) "\n");
            }
            y02.f(sb, strConcat, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String H(String str) {
        Comparable comparable;
        String strSubstring;
        List listZ = co2.Z(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ) {
            if (!co2.X((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ev.o0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!vs.M(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listZ.size();
        int size2 = listZ.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listZ) {
            int i3 = i + 1;
            if (i < 0) {
                lt.h0();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i == 0 || i == size2) && co2.X(str3)) {
                strSubstring = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    li1.e(jp1.i(iIntValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        dv.D0(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static String I(String str) {
        if (co2.X("|")) {
            wg.m("marginPrefix must be non-blank string.");
            return null;
        }
        List listZ = co2.Z(str);
        int length = str.length();
        listZ.size();
        int size = listZ.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listZ) {
            int i2 = i + 1;
            if (i < 0) {
                lt.h0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && co2.X(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!vs.M(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 == -1 || !str2.startsWith("|", i3)) ? null : str2.substring("|".length() + i3);
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        dv.D0(arrayList, sb, null, 124);
        return sb.toString();
    }
}
