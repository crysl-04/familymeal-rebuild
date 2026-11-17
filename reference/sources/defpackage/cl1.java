package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cl1 implements Comparable {
    public final dl1 h;
    public final Bundle i;
    public final boolean j;
    public final int k;
    public final boolean l;

    public cl1(dl1 dl1Var, Bundle bundle, boolean z, int i, boolean z2) {
        this.h = dl1Var;
        this.i = bundle;
        this.j = z;
        this.k = i;
        this.l = z2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cl1 cl1Var) {
        cl1Var.getClass();
        boolean z = cl1Var.l;
        boolean z2 = cl1Var.j;
        Bundle bundle = cl1Var.i;
        if (this.j) {
            if (!z2) {
                return 1;
            }
        } else if (z2) {
            return -1;
        }
        int i = this.k - cl1Var.k;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            if (bundle == null) {
                return 1;
            }
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        } else if (bundle != null) {
            return -1;
        }
        if (this.l) {
            return !z ? 1 : 0;
        }
        return z ? -1 : 0;
    }
}
