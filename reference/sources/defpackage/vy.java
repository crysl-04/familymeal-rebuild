package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vy implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ wy h;

    public vy(wy wyVar) {
        this.h = wyVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.h.f(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        wy wyVar = this.h;
        wyVar.g.a.clear();
        v82 v82Var = wyVar.h;
        synchronized (v82Var) {
            v82Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        wy wyVar = this.h;
        wyVar.g.a.clear();
        v82 v82Var = wyVar.h;
        synchronized (v82Var) {
            v82Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.h.t.a.setValue(Boolean.valueOf(z));
    }
}
