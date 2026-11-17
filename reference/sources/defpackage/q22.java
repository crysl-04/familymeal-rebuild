package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q22 extends r22 {
    public final /* synthetic */ byte h;
    public final Object i;

    public /* synthetic */ q22(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((double[]) obj)[i];
            case 1:
                return ((gs1) obj).A(i);
            default:
                return -((n92) obj).x[i];
        }
    }

    @Override // defpackage.r22, defpackage.a1
    public final Comparable G(long j) {
        switch (this.h) {
            case 0:
                return Double.valueOf(z(j));
            case 1:
                return Double.valueOf(z(j));
            default:
                return super.G(j);
        }
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                ((double[]) obj)[i] = d;
                return;
            case 1:
                a1 a1Var = (gs1) obj;
                if (!(a1Var instanceof zj1)) {
                    throw new IllegalStateException();
                }
                ((zj1) a1Var).o(i, d);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.mo2
    public final int size() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((double[]) obj).length;
            case 1:
                return (int) ((gs1) obj).count();
            default:
                return ((n92) obj).s;
        }
    }
}
