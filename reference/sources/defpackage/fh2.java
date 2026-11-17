package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class fh2 {
    public static final Comparator[] a;
    public static final kc2 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        byte b2 = 0;
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new eh2(new eh2(i == 0 ? mm0.l : mm0.j, b2), (byte) 1);
            i++;
        }
        a = comparatorArr;
        b = new kc2((byte) 24);
    }

    public static final void a(wg2 wg2Var, ArrayList arrayList, p pVar, p pVar2, si1 si1Var) {
        rg2 rg2Var = wg2Var.d;
        Object objG = rg2Var.h.g(ah2.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) pVar2.h(wg2Var)).booleanValue()) && ((Boolean) pVar.h(wg2Var)).booleanValue()) {
            arrayList.add(wg2Var);
        }
        if (zBooleanValue) {
            si1Var.h(wg2Var.f, b(wg2Var, pVar, pVar2, wg2.j(7, wg2Var)));
            return;
        }
        List listJ = wg2.j(7, wg2Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((wg2) listJ.get(i), arrayList, pVar, pVar2, si1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    public static final ArrayList b(wg2 wg2Var, p pVar, p pVar2, List list) {
        int i;
        si1 si1Var = my0.a;
        si1 si1Var2 = new si1();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((wg2) list.get(i2), arrayList, pVar, pVar2, si1Var2);
        }
        int i3 = 1;
        char c = wg2Var.c.F == u31.i ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                wg2 wg2Var2 = (wg2) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new wt1(wg2Var2.h(), lt.S(wg2Var2)));
                    break;
                }
                float f = wg2Var2.h().b;
                float f2 = wg2Var2.h().d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        r72 r72Var = (r72) ((wt1) arrayList2.get(i6)).h;
                        float f3 = r72Var.b;
                        i = i3;
                        float f4 = r72Var.d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new wt1(new r72(Math.max(r72Var.a, 0.0f), Math.max(r72Var.b, f), Math.min(r72Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((wt1) arrayList2.get(i6)).i));
                            ((List) ((wt1) arrayList2.get(i6)).i).add(wg2Var2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new wt1(wg2Var2.h(), lt.S(wg2Var2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        hv.p0(arrayList2, mm0.m);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            wt1 wt1Var = (wt1) arrayList2.get(i8);
            hv.p0((List) wt1Var.i, comparator);
            arrayList3.addAll((Collection) wt1Var.i);
        }
        hv.p0(arrayList3, new da((byte) 6));
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) si1Var2.b(((wg2) arrayList3.get(size5)).f);
            if (list2 != null) {
                if (((Boolean) pVar2.h(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
