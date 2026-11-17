package defpackage;

import android.os.Bundle;
import com.familymeal.app.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zw implements bc2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ zw(MainActivity mainActivity, byte b) {
        this.a = b;
        this.b = mainActivity;
    }

    @Override // defpackage.bc2
    public final Bundle a() {
        byte b = this.a;
        MainActivity mainActivity = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                ex exVar = mainActivity.o;
                exVar.getClass();
                LinkedHashMap linkedHashMap = exVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(exVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(exVar.g));
                return bundle;
        }
        while (MainActivity.k(((lo0) mainActivity.B.i).o)) {
        }
        mainActivity.C.d(w81.ON_STOP);
        return new Bundle();
    }
}
