package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dq1 extends nm1 {
    public final OnBackInvokedDispatcher c;
    public final int d;
    public final OnBackInvokedCallback e;
    public boolean f;

    public dq1(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.c = onBackInvokedDispatcher;
        this.d = i;
        this.e = Build.VERSION.SDK_INT == 33 ? new vd(this, (byte) 1) : new eq1(this);
    }

    @Override // defpackage.nm1
    public final void b(boolean z) {
        boolean z2 = this.f;
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (z) {
            if (z2) {
                return;
            }
            this.c.registerOnBackInvokedCallback(this.d, onBackInvokedCallback);
            this.f = true;
            return;
        }
        if (z2) {
            this.c.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f = false;
        }
    }
}
