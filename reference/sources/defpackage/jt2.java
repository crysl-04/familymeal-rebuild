package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jt2 implements gt2 {
    public final long h;
    public final /* synthetic */ kt2 i;

    public jt2(kt2 kt2Var, long j) {
        this.i = kt2Var;
        this.h = j;
    }

    @Override // defpackage.gt2
    public final long i(t31 t31Var) {
        t31 t31Var2 = (t31) this.i.y.getValue();
        if (t31Var2 != null) {
            if (t31Var2.C()) {
                return t31Var.v(t31Var2.c(this.h));
            }
            return 0L;
        }
        dx0.d("Tried to open context menu before the anchor was placed.");
        wg.k();
        return 0L;
    }

    @Override // defpackage.gt2
    public final r72 o(t31 t31Var) {
        return h12.b(i(t31Var), 0L);
    }

    @Override // defpackage.gt2
    public final ft2 s0() {
        return pz1.i(this.i);
    }
}
