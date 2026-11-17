package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wz2 extends tz2 {
    @Override // defpackage.i1
    public final a1 N1(long j) {
        return this.k.g0(j);
    }

    @Override // defpackage.re1
    public final re1 Q0() {
        return this.k;
    }

    @Override // defpackage.re1
    public final re1 e1(re1 re1Var) {
        if (re1Var instanceof wz2) {
            re1 re1Var2 = this.k;
            if (!(re1Var2.C0().h().k().get() instanceof u42)) {
                return new wz2(((wz2) re1Var).k.e1(re1Var2));
            }
        }
        return super.e1(re1Var);
    }

    @Override // defpackage.i1
    public final a1 g0(long j) {
        return this.k.N1(j);
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return this.k.h0(i2, i);
    }

    @Override // defpackage.re1, defpackage.e1
    /* JADX INFO: renamed from: m */
    public final void a(gz2 gz2Var) {
        this.k.a(gz2Var.j0());
    }
}
