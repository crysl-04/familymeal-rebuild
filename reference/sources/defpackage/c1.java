package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements e1 {
    public final /* synthetic */ cm2 h;

    public c1(cm2 cm2Var) {
        this.h = cm2Var;
    }

    @Override // defpackage.no2
    public final long B1() {
        return 1L;
    }

    @Override // defpackage.no2
    public final int T() {
        return 1;
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.h.m;
    }

    @Override // defpackage.e1
    public final void a(dk1 dk1Var) {
        ck1 ck1Var = (ck1) dk1Var;
        ck1Var.reset();
        this.h.b().forEach(new b1(ck1Var, (byte) 0));
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.h.m;
    }
}
