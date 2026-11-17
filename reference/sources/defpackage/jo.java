package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jo implements ze1 {
    public final dm a;
    public final boolean b;

    public jo(dm dmVar, boolean z) {
        this.a = dmVar;
        this.b = z;
    }

    @Override // defpackage.ze1
    public final af1 c(final bf1 bf1Var, List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        bg0 bg0Var = bg0.h;
        if (zIsEmpty) {
            return bf1Var.g0(k00.k(j), k00.j(j), bg0Var, new s0((byte) 25));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final ue1 ue1Var = (ue1) list.get(0);
            ue1Var.l();
            final ny1 ny1VarE = ue1Var.e(j2);
            final int iMax = Math.max(k00.k(j), ny1VarE.h);
            final int iMax2 = Math.max(k00.j(j), ny1VarE.i);
            return bf1Var.g0(iMax, iMax2, bg0Var, new vp0() { // from class: io
                @Override // defpackage.vp0
                public final Object h(Object obj) {
                    ho.d((my1) obj, ny1VarE, ue1Var, bf1Var.getLayoutDirection(), iMax, iMax2, this.a);
                    return j23.a;
                }
            });
        }
        ny1[] ny1VarArr = new ny1[list.size()];
        v72 v72Var = new v72();
        v72Var.h = k00.k(j);
        v72 v72Var2 = new v72();
        v72Var2.h = k00.j(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ue1 ue1Var2 = (ue1) list.get(i);
            ue1Var2.l();
            ny1 ny1VarE2 = ue1Var2.e(j2);
            ny1VarArr[i] = ny1VarE2;
            v72Var.h = Math.max(v72Var.h, ny1VarE2.h);
            v72Var2.h = Math.max(v72Var2.h, ny1VarE2.i);
        }
        return bf1Var.g0(v72Var.h, v72Var2.h, bg0Var, new lj(ny1VarArr, list, bf1Var, v72Var, v72Var2, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo)) {
            return false;
        }
        jo joVar = (jo) obj;
        return this.a.equals(joVar.a) && this.b == joVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
