package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface qh1 {
    default int a(nz0 nz0Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new i70((ue1) list2.get(i3), oz0.i, rz0.i, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new a01(nz0Var, nz0Var.getLayoutDirection()), arrayList2, l00.b(0, i, 0, 0, 13)).d();
    }

    default int b(nz0 nz0Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new i70((ue1) list2.get(i3), oz0.i, rz0.h, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new a01(nz0Var, nz0Var.getLayoutDirection()), arrayList2, l00.b(0, 0, 0, i, 7)).g();
    }

    af1 c(bf1 bf1Var, List list, long j);

    default int d(nz0 nz0Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new i70((ue1) list2.get(i3), oz0.h, rz0.i, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new a01(nz0Var, nz0Var.getLayoutDirection()), arrayList2, l00.b(0, i, 0, 0, 13)).d();
    }

    default int e(nz0 nz0Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new i70((ue1) list2.get(i3), oz0.h, rz0.h, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new a01(nz0Var, nz0Var.getLayoutDirection()), arrayList2, l00.b(0, 0, 0, i, 7)).g();
    }
}
