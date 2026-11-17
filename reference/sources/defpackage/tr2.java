package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tr2 implements aq0 {
    public final /* synthetic */ int h;

    public tr2(int i) {
        this.h = i;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        vr2 vr2Var = (vr2) obj;
        dr0 dr0Var = (dr0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? dr0Var.f(vr2Var) : dr0Var.h(vr2Var) ? 4 : 2;
        }
        if (dr0Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            vz1 vz1Var = vz1.u;
            vr2Var.getClass();
            vz1Var.j(new hr2(vr2Var.a, this.h, vr2Var.b), Float.NaN, 0.0f, 0L, null, dr0Var, 196656);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
