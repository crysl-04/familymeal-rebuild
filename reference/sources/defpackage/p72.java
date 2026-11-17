package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p72 implements bc2 {
    public final LinkedHashSet a = new LinkedHashSet();

    public p72(k42 k42Var) {
        k42Var.h("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.bc2
    public final Bundle a() {
        Bundle bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
        h12.s(bundleL, "classes_to_restore", dv.R0(this.a));
        return bundleL;
    }
}
