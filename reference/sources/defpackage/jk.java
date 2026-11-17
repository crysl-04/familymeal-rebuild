package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jk extends n10 {
    public File k;
    public File l;
    public fk m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ok o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(ok okVar, n10 n10Var) {
        super(n10Var);
        this.o = okVar;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(false, null, this);
    }
}
