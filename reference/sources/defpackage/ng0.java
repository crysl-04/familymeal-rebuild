package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ng0 extends m31 implements zp0 {
    public final /* synthetic */ qz2 i;
    public final /* synthetic */ kp0 j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng0(qz2 qz2Var, kp0 kp0Var, int i) {
        super(2);
        this.i = qz2Var;
        this.j = kp0Var;
        this.k = i;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = m02.A(this.k | 1);
        vg0.a(this.i, this.j, (dr0) obj, iA);
        return j23.a;
    }
}
