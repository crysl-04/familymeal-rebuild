package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mj2 extends r22 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ oj2 j;
    public final /* synthetic */ Object k;

    public /* synthetic */ mj2(oj2 oj2Var, Object obj, int i, byte b) {
        this.h = b;
        this.k = obj;
        this.i = i;
        this.j = oj2Var;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        switch (this.h) {
            case 0:
                return ((a90) this.k).J(this.i, i);
            default:
                return ((r22) this.k).A(this.i + i);
        }
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        switch (this.h) {
            case 0:
                ((a90) this.k).b0(d, this.i, i);
                break;
            default:
                ((r22) this.k).o(this.i + i, d);
                break;
        }
    }

    @Override // defpackage.mo2
    public final int size() {
        byte b = this.h;
        oj2 oj2Var = this.j;
        switch (b) {
            case 0:
                return oj2Var.t;
            default:
                return oj2Var.s;
        }
    }
}
