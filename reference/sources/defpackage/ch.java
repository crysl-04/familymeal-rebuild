package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ch implements li0 {
    public transient yk h = null;
    public final k5 i;

    public ch(y22 y22Var) {
        this.i = new k5(y22Var, (byte) 2);
    }

    public final dh c(long j) {
        yk ykVar = this.h;
        if (ykVar == null) {
            ykVar = (yk) this.i.get();
            this.h = ykVar;
        }
        zk zkVarC = ykVar.c(j);
        zkVarC.getClass();
        return new dh(zkVarC, 0L, zkVarC.count(), 1L);
    }

    @Override // defpackage.li0
    public final mo2 o(long j) {
        throw null;
    }

    @Override // defpackage.li0
    public final mo2 p(int i) {
        return c(i);
    }
}
