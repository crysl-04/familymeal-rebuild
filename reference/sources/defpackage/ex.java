package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import com.familymeal.app.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ex {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ MainActivity h;

    public ex(MainActivity mainActivity) {
        this.h = mainActivity;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        s3 s3Var = (s3) this.e.get(str);
        if ((s3Var != null ? s3Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                s3Var.a.a(s3Var.b.L(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new m3(intent, i2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(final int i, t03 t03Var, Cloneable cloneable) {
        Bundle bundleExtra;
        final int i2;
        MainActivity mainActivity = this.h;
        final o3 o3VarV = t03Var.v(mainActivity, cloneable);
        Object[] objArr = 0;
        if (o3VarV != null) {
            Handler handler = new Handler(Looper.getMainLooper());
            final Object[] objArr2 = objArr == true ? 1 : 0;
            handler.post(new Runnable(this) { // from class: dx
                public final /* synthetic */ ex i;

                {
                    this.i = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b = objArr2;
                    Object obj = o3VarV;
                    int i3 = i;
                    ex exVar = this.i;
                    switch (b) {
                        case 0:
                            Object obj2 = ((o3) obj).a;
                            String str = (String) exVar.a.get(Integer.valueOf(i3));
                            if (str != null) {
                                s3 s3Var = (s3) exVar.e.get(str);
                                if ((s3Var != null ? s3Var.a : null) != null) {
                                    n3 n3Var = s3Var.a;
                                    if (exVar.d.remove(str)) {
                                        n3Var.a(obj2);
                                    }
                                } else {
                                    exVar.g.remove(str);
                                    exVar.f.put(str, obj2);
                                }
                            }
                            break;
                        default:
                            exVar.a(i3, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                            break;
                    }
                }
            });
            return;
        }
        Intent intentR = t03Var.r(mainActivity, cloneable);
        if (intentR.getExtras() != null) {
            Bundle extras = intentR.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentR.setExtrasClassLoader(mainActivity.getClassLoader());
            }
        }
        if (intentR.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentR.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentR.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentR.getAction())) {
            String[] stringArrayExtra = intentR.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                    wg.m(wi0.i(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    return;
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr[i4] = stringArrayExtra[i5];
                        i4++;
                    }
                }
            }
            mainActivity.requestPermissions(stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentR.getAction())) {
            mainActivity.startActivityForResult(intentR, i, bundle);
            return;
        }
        fz0 fz0Var = (fz0) intentR.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            fz0Var.getClass();
            i2 = i;
            try {
                mainActivity.startIntentSenderForResult(fz0Var.h, i2, fz0Var.i, fz0Var.j, fz0Var.k, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                final IntentSender.SendIntentException sendIntentException = e;
                final byte b = 1;
                new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: dx
                    public final /* synthetic */ ex i;

                    {
                        this.i = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        Object obj = sendIntentException;
                        int i6 = i2;
                        ex exVar = this.i;
                        switch (b2) {
                            case 0:
                                Object obj2 = ((o3) obj).a;
                                String str = (String) exVar.a.get(Integer.valueOf(i6));
                                if (str != null) {
                                    s3 s3Var = (s3) exVar.e.get(str);
                                    if ((s3Var != null ? s3Var.a : null) != null) {
                                        n3 n3Var = s3Var.a;
                                        if (exVar.d.remove(str)) {
                                            n3Var.a(obj2);
                                        }
                                    } else {
                                        exVar.g.remove(str);
                                        exVar.f.put(str, obj2);
                                    }
                                }
                                break;
                            default:
                                exVar.a(i6, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                                break;
                        }
                    }
                });
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final t3 c(String str, t03 t03Var, n3 n3Var) {
        Number number;
        Integer numValueOf;
        LinkedHashMap linkedHashMap;
        str.getClass();
        LinkedHashMap linkedHashMap2 = this.b;
        Object objB = null;
        if (((Integer) linkedHashMap2.get(str)) == null) {
            r3 r3Var = new r3((byte) 0);
            Iterator it = new h00(new u80((byte) 2, new z61(r3Var, (byte) 21), r3Var)).iterator();
            do {
                if (!it.hasNext()) {
                    li1.m("Sequence contains no element matching the predicate.");
                    return null;
                }
                number = (Number) it.next();
                numValueOf = Integer.valueOf(number.intValue());
                linkedHashMap = this.a;
            } while (linkedHashMap.containsKey(numValueOf));
            int iIntValue = number.intValue();
            linkedHashMap.put(Integer.valueOf(iIntValue), str);
            linkedHashMap2.put(str, Integer.valueOf(iIntValue));
        }
        this.e.put(str, new s3(n3Var, t03Var));
        LinkedHashMap linkedHashMap3 = this.f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            n3Var.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.g;
        if (i >= 34) {
            objB = b2.b(str, bundle);
        } else {
            Parcelable parcelable = bundle.getParcelable(str);
            if (m3.class.isInstance(parcelable)) {
                objB = parcelable;
            }
        }
        m3 m3Var = (m3) objB;
        if (m3Var != null) {
            bundle.remove(str);
            n3Var.a(t03Var.L(m3Var.i, m3Var.h));
        }
        return new t3(this, str, t03Var);
    }
}
