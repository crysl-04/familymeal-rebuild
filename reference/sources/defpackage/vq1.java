package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vq1 extends zr1 {
    public static final vq1 c = new vq1(0, 2, 1);

    @Override // defpackage.zr1
    public final void a(yq0 yq0Var, rg rgVar, ik2 ik2Var, g82 g82Var, as1 as1Var) {
        sy0 sy0Var = (sy0) yq0Var.d(1);
        boolean z = false;
        int i = sy0Var != null ? sy0Var.a : 0;
        as asVar = (as) yq0Var.d(0);
        if (i > 0) {
            rgVar = new vp1(rgVar, i);
        }
        asVar.W(rgVar, ik2Var, g82Var, as1Var != null ? new ix0(as1Var, ik2Var, (byte) 27, z) : null);
    }
}
