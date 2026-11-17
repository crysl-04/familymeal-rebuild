package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y4 implements ze1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public y4(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static final void f(ArrayList arrayList, v72 v72Var, bf1 bf1Var, float f, ArrayList arrayList2, ArrayList arrayList3, v72 v72Var2, ArrayList arrayList4, v72 v72Var3, v72 v72Var4) {
        if (!arrayList.isEmpty()) {
            v72Var.h = bf1Var.R(f) + v72Var.h;
        }
        arrayList.add(0, dv.R0(arrayList2));
        arrayList3.add(Integer.valueOf(v72Var2.h));
        arrayList4.add(Integer.valueOf(v72Var.h));
        v72Var.h += v72Var2.h;
        v72Var3.h = Math.max(v72Var3.h, v72Var4.h);
        arrayList2.clear();
        v72Var4.h = 0;
        v72Var2.h = 0;
    }

    @Override // defpackage.ze1
    public final af1 c(final bf1 bf1Var, List list, long j) {
        ny1 ny1Var;
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        v72 v72Var = new v72();
        v72 v72Var2 = new v72();
        ArrayList arrayList4 = new ArrayList();
        v72 v72Var3 = new v72();
        v72 v72Var4 = new v72();
        int size = list.size();
        int i = 0;
        while (i < size) {
            ny1 ny1VarE = ((ue1) list.get(i)).e(j);
            boolean zIsEmpty = arrayList4.isEmpty();
            int i2 = size;
            float f = this.a;
            if (zIsEmpty) {
                ny1Var = ny1VarE;
            } else {
                ArrayList arrayList5 = arrayList;
                v72 v72Var5 = v72Var2;
                if (bf1Var.R(f) + v72Var3.h + ny1VarE.h <= k00.i(j)) {
                    arrayList = arrayList5;
                    v72Var2 = v72Var5;
                    ny1Var = ny1VarE;
                } else {
                    v72Var2 = v72Var5;
                    ny1Var = ny1VarE;
                    arrayList = arrayList5;
                    f(arrayList, v72Var2, bf1Var, this.b, arrayList4, arrayList2, v72Var4, arrayList3, v72Var, v72Var3);
                }
            }
            if (!arrayList4.isEmpty()) {
                v72Var3.h = bf1Var.R(f) + v72Var3.h;
            }
            arrayList4.add(ny1Var);
            v72Var3.h += ny1Var.h;
            v72Var4.h = Math.max(v72Var4.h, ny1Var.i);
            i++;
            size = i2;
        }
        if (!arrayList4.isEmpty()) {
            f(arrayList, v72Var2, bf1Var, this.b, arrayList4, arrayList2, v72Var4, arrayList3, v72Var, v72Var3);
        }
        final int iMax = Math.max(v72Var.h, k00.k(j));
        int iMax2 = Math.max(v72Var2.h, k00.j(j));
        final float f2 = this.a;
        return bf1Var.g0(iMax, iMax2, bg0.h, new vp0() { // from class: x4
            @Override // defpackage.vp0
            public final Object h(Object obj) {
                bf1 bf1Var2;
                my1 my1Var = (my1) obj;
                ArrayList arrayList6 = arrayList;
                int size2 = arrayList6.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    List list2 = (List) arrayList6.get(i3);
                    int size3 = list2.size();
                    int[] iArr = new int[size3];
                    int i4 = 0;
                    while (true) {
                        bf1Var2 = bf1Var;
                        if (i4 >= size3) {
                            break;
                        }
                        iArr[i4] = ((ny1) list2.get(i4)).h + (i4 < list2.size() - 1 ? bf1Var2.R(f2) : 0);
                        i4++;
                    }
                    int[] iArr2 = new int[size3];
                    if (bf1Var2.getLayoutDirection() == u31.h) {
                        uz0.s(iMax, iArr, iArr2, false);
                    } else {
                        uz0.r(iArr, iArr2, true);
                    }
                    int size4 = list2.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        my1.i(my1Var, (ny1) list2.get(i5), iArr2[i5], ((Number) arrayList3.get(i3)).intValue());
                    }
                }
                return j23.a;
            }
        });
    }
}
