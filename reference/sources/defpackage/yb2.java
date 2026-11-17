package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yb2 implements bc2 {
    public final k42 a;
    public boolean b;
    public Bundle c;
    public final yq2 d;

    public yb2(k42 k42Var, h53 h53Var) {
        k42Var.getClass();
        this.a = k42Var;
        this.d = new yq2(new xu1(h53Var, (byte) 5));
    }

    @Override // defpackage.bc2
    public final Bundle a() {
        Bundle bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleL.putAll(bundle);
        }
        for (Map.Entry entry : ((zb2) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((lb0) ((ub2) entry.getValue()).b.e).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleL.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleL;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleC = this.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleL.putAll(bundle);
        }
        if (bundleC != null) {
            bundleL.putAll(bundleC);
        }
        this.c = bundleL;
        this.b = true;
    }
}
