package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zx2 implements aq0 {
    public final /* synthetic */ aa2 h;
    public final /* synthetic */ by2 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ba2 k;
    public final /* synthetic */ kp0 l;

    public zx2(kp0 kp0Var, aa2 aa2Var, ba2 ba2Var, by2 by2Var, boolean z) {
        this.h = aa2Var;
        this.i = by2Var;
        this.j = z;
        this.k = ba2Var;
        this.l = kp0Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        dr0 dr0Var = (dr0) obj2;
        ((Number) obj3).intValue();
        dr0Var.V(-1525724089);
        Object objK = dr0Var.K();
        if (objK == zy.a) {
            objK = new ui1();
            dr0Var.f0(objK);
        }
        ui1 ui1Var = (ui1) objK;
        rg1 rg1VarC = av0.a(og1.h, ui1Var, this.h).c(new b03(this.i, ui1Var, null, this.j, this.k, this.l));
        dr0Var.p(false);
        return rg1VarC;
    }
}
