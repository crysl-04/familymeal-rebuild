package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qq1 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ lm0 i;
    public final /* synthetic */ lm0 j;
    public final /* synthetic */ byte k;
    public final /* synthetic */ qb l;
    public final /* synthetic */ Object m;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qq1(lm0 lm0Var, lm0 lm0Var2, Object obj, int i, qb qbVar, byte b) {
        this.h = b;
        this.i = lm0Var;
        this.j = lm0Var2;
        this.m = obj;
        this.k = i;
        this.l = qbVar;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        qb qbVar = this.l;
        byte b2 = this.k;
        Object obj2 = this.m;
        lm0 lm0Var = this.j;
        lm0 lm0Var2 = this.i;
        switch (b) {
            case 0:
                lm0 lm0Var3 = (lm0) obj2;
                zl zlVar = (zl) obj;
                if (lm0Var2 != ((em0) cu.Z(lm0Var).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zB0 = es.b0(lm0Var, lm0Var3, b2, qbVar);
                Boolean boolValueOf = Boolean.valueOf(zB0);
                if (zB0 || !zlVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                r72 r72Var = (r72) obj2;
                zl zlVar2 = (zl) obj;
                if (lm0Var2 != ((em0) cu.Z(lm0Var).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zN = cy1.N(b2, qbVar, lm0Var, r72Var);
                Boolean boolValueOf2 = Boolean.valueOf(zN);
                if (zN || !zlVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
