package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.familymeal.app.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p3 extends t03 {
    public final /* synthetic */ byte I;

    public /* synthetic */ p3(byte b) {
        this.I = b;
    }

    @Override // defpackage.t03
    public final Object L(Intent intent, int i) {
        switch (this.I) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayListW = gi.W(stringArrayExtra);
                        Iterator it = arrayListW.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(ev.o0(arrayListW, 10), ev.o0(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new wt1(it.next(), it2.next()));
                        }
                        return ee1.M(arrayList2);
                    }
                }
                return bg0.h;
            case 2:
                return new m3(intent, i);
            default:
                return new m3(intent, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t03
    public final Intent r(MainActivity mainActivity, Cloneable cloneable) {
        Bundle bundleExtra;
        switch (this.I) {
            case 0:
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", (String[]) cloneable).setType("*/*");
                type.getClass();
                return type;
            case 1:
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) cloneable);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 2:
                return (Intent) cloneable;
            default:
                fz0 fz0Var = (fz0) cloneable;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = fz0Var.i;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        fz0Var = new fz0(fz0Var.h, null, fz0Var.j, fz0Var.k);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", fz0Var);
                if (yo0.J(2)) {
                    intent.toString();
                }
                return intent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t03
    public final o3 v(MainActivity mainActivity, Cloneable cloneable) {
        switch (this.I) {
            case 0:
                return null;
            case 1:
                String[] strArr = (String[]) cloneable;
                if (strArr.length == 0) {
                    return new o3(bg0.h);
                }
                for (String str : strArr) {
                    if (str == null) {
                        throw new NullPointerException("permission must be non-null");
                    }
                    if (((Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? mainActivity.checkPermission(str, Process.myPid(), Process.myUid()) : new po1(mainActivity).a.areNotificationsEnabled() ? 0 : -1) != 0) {
                        return null;
                    }
                }
                int iK = ee1.K(strArr.length);
                if (iK < 16) {
                    iK = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iK);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new o3(linkedHashMap);
            default:
                return super.v(mainActivity, cloneable);
        }
    }
}
