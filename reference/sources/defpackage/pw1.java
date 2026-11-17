package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pw1 extends n10 {
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ ur m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw1(ur urVar, m10 m10Var) {
        super(m10Var);
        this.m = urVar;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.m(null, this);
    }
}
