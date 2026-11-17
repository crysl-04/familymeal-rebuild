package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ob0 extends n10 {
    public /* synthetic */ Object k;
    public final /* synthetic */ pb0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob0(pb0 pb0Var, m10 m10Var) {
        super(m10Var);
        this.l = pb0Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.m(null, this);
    }
}
