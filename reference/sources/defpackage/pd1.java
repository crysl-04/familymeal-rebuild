package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class pd1 {
    public static final ss0 a;

    static {
        Object obj;
        int i = dr2.a;
        try {
            System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
        }
        try {
            Iterator it = ph2.I(ph2.G(Arrays.asList(new d8()).iterator())).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    ((d8) next).getClass();
                    do {
                        ((d8) it.next()).getClass();
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            if (((d8) obj) == null) {
                li1.g("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                a = new ss0(ts0.a(mainLooper));
            } else {
                li1.g("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
