package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uc extends m31 implements aq0 {
    public final /* synthetic */ vp0 i;
    public final /* synthetic */ qz2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(vp0 vp0Var, qz2 qz2Var) {
        super(3);
        this.i = vp0Var;
        this.j = qz2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j;
        bf1 bf1Var = (bf1) obj;
        ny1 ny1VarE = ((ue1) obj2).e(((k00) obj3).a);
        if (bf1Var.u()) {
            if (((Boolean) this.i.h(this.j.d.getValue())).booleanValue()) {
                j = (((long) ny1VarE.h) << 32) | (((long) ny1VarE.i) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) ny1VarE.h) << 32) | (((long) ny1VarE.i) & 4294967295L);
        }
        return bf1Var.g0((int) (j >> 32), (int) (j & 4294967295L), bg0.h, new tc(ny1VarE, (byte) 0));
    }
}
