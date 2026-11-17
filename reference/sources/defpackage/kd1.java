package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kd1 extends wg1 {
    public final be h;
    public final ov2 i;
    public final vz1 j;

    public kd1(be beVar, ov2 ov2Var, vz1 vz1Var) {
        this.h = beVar;
        this.i = ov2Var;
        this.j = vz1Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new md1(this.h, this.i, this.j);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        md1 md1Var = (md1) qg1Var;
        float f = md1Var.x;
        long j = md1Var.z;
        float f2 = md1Var.A;
        boolean z = md1Var.y;
        float f3 = md1Var.B;
        boolean z2 = md1Var.C;
        vz1 vz1Var = md1Var.D;
        View view = md1Var.E;
        e90 e90Var = md1Var.F;
        md1Var.v = this.h;
        md1Var.x = Float.NaN;
        md1Var.y = true;
        md1Var.z = 9205357640488583168L;
        md1Var.A = Float.NaN;
        md1Var.B = Float.NaN;
        md1Var.C = true;
        md1Var.w = this.i;
        vz1 vz1Var2 = this.j;
        md1Var.D = vz1Var2;
        View viewF = ou.F(md1Var);
        e90 e90Var2 = cu.Y(md1Var).E;
        if (md1Var.G != null) {
            ch2 ch2Var = nd1.a;
            if (9205357640488583168L != j || !cc0.b(Float.NaN, f2) || !cc0.b(Float.NaN, f3) || true != z || true != z2 || !vz1Var2.equals(vz1Var) || !viewF.equals(view) || !uz0.g(e90Var2, e90Var)) {
                md1Var.K0();
            }
        }
        md1Var.L0();
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + (((((((((((this.h.hashCode() * 961) + 2143289344) * 31) + 1231) * 961) + 2143289344) * 31) + 2143289344) * 31) + 1231) * 31)) * 31);
    }
}
