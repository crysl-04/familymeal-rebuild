package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ks extends fs {
    public final aq0 l;

    public ks(aq0 aq0Var, pk0 pk0Var, o20 o20Var, int i, dp dpVar) {
        super(pk0Var, o20Var, i, dpVar);
        this.l = aq0Var;
    }

    @Override // defpackage.fs
    public final fs c(o20 o20Var, int i, dp dpVar) {
        return new ks(this.l, this.k, o20Var, i, dpVar);
    }

    @Override // defpackage.fs
    public final Object e(qk0 qk0Var, m10 m10Var) {
        Object objX = vs.x(new hs(this, qk0Var, null), m10Var);
        return objX == y20.h ? objX : j23.a;
    }
}
