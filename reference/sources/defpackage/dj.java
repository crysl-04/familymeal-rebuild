package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dj extends z43 {
    public final String b = "SaveableStateHolder_BackStackEntryKey";
    public final String c;
    public a63 d;

    public dj(ub2 ub2Var) {
        Object value;
        Object obj;
        ub2Var.getClass();
        bj bjVar = ub2Var.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) bjVar.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) bjVar.d;
        try {
            nn2 nn2Var = (nn2) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (nn2Var == null || (value = nn2Var.getValue()) == null) {
                value = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) bjVar.c).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            value = null;
        }
        String string = (String) value;
        if (string == null) {
            string = UUID.randomUUID().toString();
            String str = this.b;
            str.getClass();
            if (string != null) {
                ArrayList arrayList = wb2.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    do {
                        if (i < size) {
                            obj = arrayList.get(i);
                            i++;
                        }
                    } while (!((Class) obj).isInstance(string));
                }
                li1.h("Can't put value with type ", string.getClass(), " into saved state");
                throw null;
            }
            ArrayList arrayList2 = wb2.a;
            Object obj2 = ub2Var.a.get(str);
            vi1 vi1Var = obj2 instanceof vi1 ? (vi1) obj2 : null;
            if (vi1Var != null) {
                vi1Var.f(string);
            }
            bjVar.i(string, str);
        }
        this.c = string;
    }

    @Override // defpackage.z43
    public final void d() {
        a63 a63Var = this.d;
        if (a63Var == null) {
            uz0.A("saveableStateHolderRef");
            throw null;
        }
        ob2 ob2Var = (ob2) a63Var.a.get();
        if (ob2Var != null) {
            ob2Var.f(this.c);
        }
        a63 a63Var2 = this.d;
        if (a63Var2 != null) {
            a63Var2.a.clear();
        } else {
            uz0.A("saveableStateHolderRef");
            throw null;
        }
    }
}
