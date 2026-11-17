package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class su1 extends n10 {
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ wu1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su1(wu1 wu1Var, n10 n10Var) {
        super(n10Var);
        this.m = wu1Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, this);
    }
}
