package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class pd {
    public static final od a = new od("");

    public static final List a(od odVar, int i, int i2, s0 s0Var) {
        List list;
        if (i == i2 || (list = odVar.h) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= odVar.i.length()) {
            if (s0Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) s0Var.h(((nd) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            nd ndVar = (nd) list.get(i3);
            if (s0Var != null ? ((Boolean) s0Var.h(ndVar.a)).booleanValue() : true) {
                int i4 = ndVar.b;
                int i5 = ndVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new nd((kd) ndVar.a, cy1.n(ndVar.b, i, i2) - i, cy1.n(i5, i, i2) - i, ndVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return (((i == i2) | (i3 == i4)) & (i == i3)) | ((i < i4) & (i3 < i2));
    }
}
