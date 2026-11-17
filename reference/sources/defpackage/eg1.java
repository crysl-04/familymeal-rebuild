package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class eg1 {
    public final SparseArray a;
    public x03 b;

    public eg1(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(x03 x03Var, int i, int i2) {
        int iA = x03Var.a(i);
        SparseArray sparseArray = this.a;
        eg1 eg1Var = (eg1) sparseArray.get(iA);
        if (eg1Var == null) {
            eg1Var = new eg1(1);
            sparseArray.put(x03Var.a(i), eg1Var);
        }
        if (i2 > i) {
            eg1Var.a(x03Var, i + 1, i2);
        } else {
            eg1Var.b = x03Var;
        }
    }
}
