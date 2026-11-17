package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xo0 implements vo0 {
    public final /* synthetic */ yo0 a;

    public xo0(yo0 yo0Var) {
        this.a = yo0Var;
    }

    @Override // defpackage.vo0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zT;
        yo0 yo0Var = this.a;
        ArrayList arrayList3 = yo0Var.n;
        if (yo0.J(2)) {
            Objects.toString(yo0Var.a);
        }
        if (yo0Var.d.isEmpty()) {
            zT = false;
        } else {
            ArrayList arrayList4 = yo0Var.d;
            ej ejVar = (ej) arrayList4.get(arrayList4.size() - 1);
            yo0Var.h = ejVar;
            ArrayList arrayList5 = ejVar.a;
            int size = arrayList5.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList5.get(i);
                i++;
                jo0 jo0Var = ((hp0) obj).b;
                if (jo0Var != null) {
                    jo0Var.t = true;
                }
            }
            zT = yo0Var.T(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                linkedHashSet.addAll(yo0.F((ej) obj2));
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                if (obj3 != null) {
                    li1.c();
                    return false;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return zT;
    }
}
