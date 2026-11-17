package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ml0 {
    public final void a(ue1 ue1Var, ue1 ue1Var2, long j) {
        long jA = cu.A(j, a51.h);
        if (ue1Var != null) {
            int iU = ue1Var.U(k00.h(jA));
            new iy0(iy0.a(iU, ue1Var.d0(iU)));
        }
        if (ue1Var2 != null) {
            int iU2 = ue1Var2.U(k00.h(jA));
            new iy0(iy0.a(iU2, ue1Var2.d0(iU2)));
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ml0);
    }

    public final int hashCode() {
        return ll0.h.hashCode() * 961;
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + ll0.h + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
