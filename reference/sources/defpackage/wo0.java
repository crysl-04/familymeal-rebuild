package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wo0 implements vo0 {
    public final int a;
    public final /* synthetic */ yo0 b;

    public wo0(yo0 yo0Var, int i) {
        this.b = yo0Var;
        this.a = i;
    }

    @Override // defpackage.vo0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        yo0 yo0Var = this.b;
        jo0 jo0Var = yo0Var.z;
        int i = this.a;
        if (jo0Var == null || i >= 0 || !jo0Var.i().S(-1, 0)) {
            return yo0Var.T(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
