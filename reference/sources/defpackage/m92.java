package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m92 extends r22 {
    public final /* synthetic */ int[] h;
    public final /* synthetic */ n92 i;

    public m92(n92 n92Var, int[] iArr) {
        this.h = iArr;
        this.i = n92Var;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        if (i >= 0) {
            n92 n92Var = this.i;
            if (i < n92Var.t) {
                int i2 = this.h[i];
                return i2 >= 0 ? n92Var.L.h[i2] : h32.a;
            }
        }
        return h32.a;
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mo2
    public final int size() {
        return this.i.t;
    }
}
