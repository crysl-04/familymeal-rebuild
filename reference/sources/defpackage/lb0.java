package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lb0 implements bc2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lb0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.bc2
    public final Bundle a() {
        wt1[] wt1VarArr;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Map mapD = ((rb2) obj).d();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapD.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 1:
                return ((yo0) obj).X();
            default:
                bj bjVar = (bj) obj;
                for (Map.Entry entry2 : ee1.N((LinkedHashMap) bjVar.d).entrySet()) {
                    bjVar.i(((nn2) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : ee1.N((LinkedHashMap) bjVar.b).entrySet()) {
                    bjVar.i(((bc2) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) bjVar.a;
                if (linkedHashMap.isEmpty()) {
                    wt1VarArr = new wt1[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new wt1((String) entry4.getKey(), entry4.getValue()));
                    }
                    wt1VarArr = (wt1[]) arrayList.toArray(new wt1[0]);
                }
                return t03.l((wt1[]) Arrays.copyOf(wt1VarArr, wt1VarArr.length));
        }
    }
}
