package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ byte h = 0;

    public /* synthetic */ l6() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                fj1 fj1Var = t6.R0;
                synchronized (fj1Var) {
                    int i = Build.VERSION.SDK_INT;
                    Object[] objArr = fj1Var.a;
                    int i2 = fj1Var.b;
                    int i3 = 0;
                    if (i < 30) {
                        while (i3 < i2) {
                            t6 t6Var = (t6) objArr[i3];
                            boolean showLayoutBounds = t6Var.getShowLayoutBounds();
                            Class cls = t6.O0;
                            t6Var.setShowLayoutBounds(aa3.t());
                            if (showLayoutBounds != t6Var.getShowLayoutBounds()) {
                                t6Var.post(new k6(t6Var, (byte) 2));
                            }
                            i3++;
                        }
                    } else {
                        while (i3 < i2) {
                            t6 t6Var2 = (t6) objArr[i3];
                            t6Var2.post(new k6(t6Var2, (byte) 3));
                            i3++;
                        }
                    }
                }
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    public /* synthetic */ l6(rf rfVar, int i) {
    }

    public /* synthetic */ l6(p90 p90Var, int i, Serializable serializable) {
    }

    public /* synthetic */ l6(jo0 jo0Var, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
