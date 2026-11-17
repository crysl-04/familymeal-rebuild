package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class eb0 extends qg1 implements sd0 {
    public p61 v;

    @Override // defpackage.qg1
    public final void B0() {
        this.v.getClass();
    }

    @Override // defpackage.qg1
    public final void C0() {
        p61 p61Var = this.v;
        p61Var.d();
        p61Var.b = null;
    }

    @Override // defpackage.sd0
    public final void O(n41 n41Var) {
        ArrayList arrayList = (ArrayList) this.v.h;
        if (arrayList.size() <= 0) {
            n41Var.a();
        } else {
            wi0.t(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb0) && uz0.g(this.v, ((eb0) obj).v);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.v + ")";
    }
}
