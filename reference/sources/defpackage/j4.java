package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j4 implements ci1 {
    public final /* synthetic */ byte h;
    public final re1 i;
    public final ix0 j;

    public j4(re1 re1Var, byte b) {
        this.h = b;
        switch (b) {
            case 1:
                if (!re1Var.N()) {
                    wg.m("Must be sqaure!");
                    throw null;
                }
                this.i = re1Var;
                this.j = new ix0(re1Var.h1(), re1Var.C0());
                return;
            default:
                if (!re1Var.R0()) {
                    wg.m("Must be a  vector!");
                    throw null;
                }
                this.i = re1Var;
                this.j = new ix0(re1Var.count(), re1Var.C0());
                return;
        }
    }

    @Override // defpackage.ci1
    public final Comparable j(q22 q22Var) {
        byte b = this.h;
        re1 re1Var = this.i;
        ix0 ix0Var = this.j;
        switch (b) {
            case 0:
                gy1 gy1Var = (gy1) re1Var.C0().b(1L, 1L);
                vc2 vc2VarK = (vc2) ix0Var.i;
                if (vc2VarK == null) {
                    vc2VarK = ((fy1) ix0Var.j).h().k();
                }
                re1Var.r1(q22Var, gy1Var);
                return (Comparable) ((vc2) vc2VarK.i0(gy1Var.h0(0, 0))).get();
            default:
                vc2 vc2VarK2 = (vc2) ix0Var.i;
                if (vc2VarK2 == null) {
                    vc2VarK2 = ((fy1) ix0Var.j).h().k();
                }
                return (Comparable) ((vc2) vc2VarK2.i0(re1Var.r0(q22Var))).get();
        }
    }
}
