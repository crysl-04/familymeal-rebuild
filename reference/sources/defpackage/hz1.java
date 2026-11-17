package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hz1 extends n10 {
    public LocalDate k;
    public ek2 l;
    public String m;
    public /* synthetic */ Object n;
    public final /* synthetic */ kz1 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz1(kz1 kz1Var, n10 n10Var) {
        super(n10Var);
        this.o = kz1Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, null, null, this);
    }
}
