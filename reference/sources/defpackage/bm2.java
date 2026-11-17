package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bm2 extends xk {
    public ns0 l;
    public final y22 m;

    public bm2(y22 y22Var) {
        super(y22Var.j);
        this.l = ns0.a(y22Var.j);
        this.m = y22Var;
    }

    @Override // defpackage.li0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cm2 p(int i) {
        return new cm2(this.m, this.l, i);
    }

    @Override // defpackage.li0
    public final mo2 o(long j) {
        return j > this.l.c ? sf2.U0(this, j) : new cm2(this.m, this.l, Math.toIntExact(j));
    }
}
