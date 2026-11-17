package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qe1 implements a1 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ long i;
    public final /* synthetic */ re1 j;

    public /* synthetic */ qe1(re1 re1Var, long j, byte b) {
        this.h = b;
        this.i = j;
        this.j = re1Var;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        byte b = this.h;
        long j = this.i;
        re1 re1Var = this.j;
        long j2 = i;
        switch (b) {
            case 0:
                return re1Var.y1(j2, j);
            default:
                return re1Var.y1(j, j2);
        }
    }

    @Override // defpackage.a1
    public final Comparable G(long j) {
        byte b = this.h;
        long j2 = this.i;
        re1 re1Var = this.j;
        switch (b) {
            case 0:
                return re1Var.H(j, j2);
            default:
                return re1Var.H(j2, j);
        }
    }

    @Override // defpackage.mo2
    public final long count() {
        byte b = this.h;
        re1 re1Var = this.j;
        switch (b) {
            case 0:
                return re1Var.h1();
            default:
                return re1Var.B1();
        }
    }

    @Override // defpackage.mo2
    public final int size() {
        switch (this.h) {
            case 0:
                break;
        }
        return Math.toIntExact(count());
    }

    public final String toString() {
        switch (this.h) {
            case 0:
                break;
        }
        return a1.V0(this);
    }
}
