package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ru0 extends x {
    public int k;
    public gy1 l;
    public int m;

    public final gy1 A0(e1 e1Var) {
        int iZ1 = e1Var.Z1();
        int iT = e1Var.T();
        gy1 gy1VarM0 = this.l;
        if (gy1VarM0 == null || this.m != iZ1 || this.k != iT) {
            gy1VarM0 = m0(iZ1, iT);
            this.l = gy1VarM0;
            this.m = iZ1;
            this.k = iT;
        }
        e1Var.a(gy1VarM0);
        this.j = null;
        this.h = false;
        return this.l;
    }

    @Override // defpackage.no2
    public final int T() {
        return this.k;
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.m;
    }
}
