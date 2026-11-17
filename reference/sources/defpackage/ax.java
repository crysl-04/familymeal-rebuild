package defpackage;

import android.os.Bundle;
import com.familymeal.app.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ax {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ ax(MainActivity mainActivity, byte b) {
        this.a = b;
        this.b = mainActivity;
    }

    public final void a(gx gxVar) {
        byte b = this.a;
        MainActivity mainActivity = this.b;
        switch (b) {
            case 0:
                gxVar.getClass();
                Bundle bundleC = ((k42) mainActivity.k.j).c("android:support:activity-result");
                if (bundleC != null) {
                    ex exVar = mainActivity.o;
                    LinkedHashMap linkedHashMap = exVar.b;
                    LinkedHashMap linkedHashMap2 = exVar.a;
                    Bundle bundle = exVar.g;
                    ArrayList<Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            exVar.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    t03.j(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.getClass();
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            exVar.b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                lo0 lo0Var = (lo0) mainActivity.B.i;
                lo0Var.o.b(lo0Var, lo0Var, null);
                break;
        }
    }
}
