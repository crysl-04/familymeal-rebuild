package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qw1 extends n10 {
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ zk0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(zk0 zk0Var, m10 m10Var) {
        super(m10Var);
        this.m = zk0Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
