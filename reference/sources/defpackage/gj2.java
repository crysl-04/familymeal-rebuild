package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gj2 implements a1 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ da1 j;

    public /* synthetic */ gj2(da1 da1Var, int i, byte b) {
        this.h = b;
        this.i = i;
        this.j = da1Var;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        byte b = this.h;
        da1 da1Var = this.j;
        switch (b) {
            case 0:
                return ((ey1) da1Var).o(i);
            default:
                return ((rj2) da1Var).o(i);
        }
    }

    @Override // defpackage.a1
    public final Comparable G(long j) {
        switch (this.h) {
            case 0:
                break;
        }
        return Double.valueOf(z(j));
    }

    @Override // defpackage.mo2
    public final int size() {
        switch (this.h) {
            case 0:
                break;
        }
        return this.i;
    }

    public final String toString() {
        switch (this.h) {
            case 0:
                break;
        }
        return a1.V0(this);
    }
}
