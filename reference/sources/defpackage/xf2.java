package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xf2 implements aq0 {
    public final /* synthetic */ aa2 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ba2 k;
    public final /* synthetic */ kp0 l;

    public xf2(aa2 aa2Var, boolean z, boolean z2, ba2 ba2Var, kp0 kp0Var) {
        this.h = aa2Var;
        this.i = z;
        this.j = z2;
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
        rg1 rg1VarC = av0.a(og1.h, ui1Var, this.h).c(new wf2(this.i, ui1Var, null, this.j, this.k, this.l));
        dr0Var.p(false);
        return rg1VarC;
    }
}
