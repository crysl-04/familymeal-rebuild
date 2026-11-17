package defpackage;

import android.os.Build;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t3 extends aa3 {
    public final /* synthetic */ ex b0;
    public final /* synthetic */ String c0;
    public final /* synthetic */ t03 d0;

    public t3(ex exVar, String str, t03 t03Var) {
        this.b0 = exVar;
        this.c0 = str;
        this.d0 = t03Var;
    }

    public final void K() {
        Object parcelable;
        Integer num;
        ex exVar = this.b0;
        Bundle bundle = exVar.g;
        LinkedHashMap linkedHashMap = exVar.f;
        String str = this.c0;
        str.getClass();
        if (!exVar.d.contains(str) && (num = (Integer) exVar.b.remove(str)) != null) {
            exVar.a.remove(num);
        }
        exVar.e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = b2.b(str, bundle);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!m3.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Objects.toString((m3) parcelable);
            bundle.remove(str);
        }
        if (exVar.c.get(str) == null) {
            return;
        }
        li1.c();
    }
}
