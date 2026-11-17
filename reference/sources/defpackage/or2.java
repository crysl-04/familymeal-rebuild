package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class or2 implements ze1 {
    public final /* synthetic */ nx a;

    public or2(nx nxVar) {
        this.a = nxVar;
    }

    @Override // defpackage.ze1
    public final af1 c(bf1 bf1Var, List list, long j) {
        ny1 ny1VarE;
        Integer numValueOf;
        Integer numValueOf2;
        ny1 ny1Var = null;
        if (this.a != null) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    gb1.b("Collection contains no element matching the predicate.");
                    wg.k();
                    return null;
                }
                ue1 ue1Var = (ue1) list.get(i);
                if (uz0.g(s60.s(ue1Var), "text")) {
                    ny1VarE = ue1Var.e(k00.b(j, 0, 0, 0, 0, 11));
                    break;
                }
                i++;
            }
        } else {
            ny1VarE = null;
        }
        int iMax = Math.max(ny1VarE != null ? ny1VarE.h : 0, 0);
        int iMax2 = Math.max(bf1Var.R(pr2.a), bf1Var.J(pr2.e) + 0 + (ny1VarE != null ? ny1VarE.i : 0));
        if (ny1VarE != null) {
            numValueOf = Integer.valueOf(ny1VarE.h0(h5.a));
            numValueOf2 = Integer.valueOf(ny1VarE.h0(h5.b));
        } else {
            numValueOf = null;
            numValueOf2 = null;
        }
        return bf1Var.g0(iMax, iMax2, bg0.h, new i60(ny1VarE, ny1Var, bf1Var, iMax, iMax2, numValueOf, numValueOf2));
    }
}
