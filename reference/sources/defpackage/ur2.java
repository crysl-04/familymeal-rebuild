package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ur2 implements qh1 {
    public final /* synthetic */ vr2 a;

    public ur2(vr2 vr2Var) {
        this.a = vr2Var;
    }

    @Override // defpackage.qh1
    public final af1 c(bf1 bf1Var, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        int i = k00.i(j);
        int size = list2.size();
        v72 v72Var = new v72();
        if (size > 0) {
            v72Var.h = i / size;
        }
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            numValueOf = Integer.valueOf(Math.max(((ue1) list2.get(i2)).g(v72Var.h), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            cc0 cc0Var = new cc0(bf1Var.r0(Math.min(((ue1) list2.get(i3)).a0(iIntValue), v72Var.h)) - (pr2.b * 2.0f));
            cc0 cc0Var2 = new cc0(24.0f);
            if (cc0Var.compareTo(cc0Var2) < 0) {
                cc0Var = cc0Var2;
            }
            arrayList2.add(new qr2(bf1Var.r0(v72Var.h) * i3, bf1Var.r0(v72Var.h), cc0Var.h));
        }
        this.a.a.setValue(arrayList2);
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ue1 ue1Var = (ue1) list2.get(i4);
            int i5 = v72Var.h;
            arrayList3.add(ue1Var.e(k00.a(i5, i5, iIntValue, iIntValue)));
        }
        ArrayList arrayList4 = new ArrayList(list3.size());
        int i6 = 0;
        for (int size4 = list3.size(); i6 < size4; size4 = size4) {
            arrayList4.add(((ue1) list3.get(i6)).e(k00.b(j, 0, 0, 0, 0, 11)));
            i6++;
        }
        ArrayList arrayList5 = new ArrayList(list4.size());
        int size5 = list4.size();
        for (int i7 = 0; i7 < size5; i7++) {
            ue1 ue1Var2 = (ue1) list4.get(i7);
            int i8 = v72Var.h;
            arrayList5.add(ue1Var2.e(k00.a(i8, i8, 0, iIntValue)));
        }
        return bf1Var.g0(i, iIntValue, bg0.h, new zv(arrayList3, arrayList4, arrayList5, v72Var, iIntValue));
    }
}
