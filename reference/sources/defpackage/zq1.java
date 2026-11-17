package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zq1 extends zr1 {
    public static final zq1 c = new zq1(0, 2, 1);

    @Override // defpackage.zr1
    public final void a(yq0 yq0Var, rg rgVar, ik2 ik2Var, g82 g82Var, as1 as1Var) {
        int i;
        sy0 sy0Var = (sy0) yq0Var.d(0);
        int iC = ik2Var.c((xq0) yq0Var.d(1));
        if (ik2Var.t >= iC) {
            ez.a("Check failed");
        }
        vs.S(ik2Var, rgVar, iC);
        int i2 = ik2Var.t;
        int iD = ik2Var.v;
        while (iD >= 0 && !ik2Var.x(iD)) {
            iD = ik2Var.D(ik2Var.b, iD);
        }
        int iT = iD + 1;
        int iK = 0;
        while (iT < i2) {
            if (ik2Var.u(i2, iT)) {
                if (ik2Var.x(iT)) {
                    iK = 0;
                }
                iT++;
            } else {
                iK += ik2Var.x(iT) ? 1 : ik2Var.b[(ik2Var.q(iT) * 5) + 1] & 67108863;
                iT += ik2Var.t(iT);
            }
        }
        while (true) {
            i = ik2Var.t;
            if (i >= iC) {
                break;
            }
            if (ik2Var.u(iC, i)) {
                int i3 = ik2Var.t;
                if (i3 < ik2Var.u && (ik2Var.b[(ik2Var.q(i3) * 5) + 1] & 1073741824) != 0) {
                    rgVar.d(ik2Var.C(ik2Var.t));
                    iK = 0;
                }
                ik2Var.O();
            } else {
                iK += ik2Var.K();
            }
        }
        if (i != iC) {
            ez.a("Check failed");
        }
        sy0Var.a = iK;
    }
}
