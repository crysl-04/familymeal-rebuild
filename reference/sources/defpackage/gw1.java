package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gw1 extends n10 {
    public String k;
    public LocalDate l;
    public dy1 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ tw1 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw1(tw1 tw1Var, n10 n10Var) {
        super(n10Var);
        this.o = tw1Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, null, this);
    }
}
