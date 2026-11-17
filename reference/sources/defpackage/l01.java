package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l01 extends qy {
    public static final bm2 c;
    public final int b;

    static {
        vh vhVar = xh.k;
        wo1 wo1Var = cm2.o;
        bm2 bm2Var = new bm2(vhVar);
        ns0 ns0Var = bm2Var.l;
        bm2Var.l = new ns0(3L, ns0Var.a, ns0Var.c);
        c = bm2Var;
    }

    public l01(int i) {
        super((byte) 2);
        this.b = i;
    }

    @Override // defpackage.qy
    public final Object j() {
        return c.p(this.b);
    }
}
