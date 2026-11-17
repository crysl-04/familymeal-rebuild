package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rx2 extends qg1 implements c41 {
    public tb A;
    public float B;
    public float C;
    public ui1 v;
    public boolean w;
    public zm2 x;
    public boolean y;
    public tb z;

    @Override // defpackage.qg1
    public final void B0() {
        ie1.p(x0(), null, new qj(this, null, (byte) 12), 3);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        float f;
        float f2 = ie1.m0;
        byte b = 0;
        byte b2 = 1;
        boolean z = (ue1Var.g(k00.i(j)) == 0 || ue1Var.a0(k00.h(j)) == 0) ? false : true;
        if (this.y) {
            f = ie1.f0;
        } else {
            f = (z || this.w) ? xq2.a : xq2.b;
        }
        float fA = bf1Var.A(f);
        tb tbVar = this.A;
        int iFloatValue = (int) (tbVar != null ? ((Number) tbVar.d()).floatValue() : fA);
        boolean z2 = iFloatValue >= 0;
        if (!(z2 & z2)) {
            cx0.a("width and height must be >= 0");
        }
        ny1 ny1VarE = ue1Var.e(l00.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fA2 = bf1Var.A((xq2.d - bf1Var.u0(fA)) / 2.0f);
        float fA3 = bf1Var.A((xq2.c - xq2.a) - xq2.e);
        if (this.y) {
            boolean z3 = this.w;
            if (z3) {
                fA2 = fA3 - bf1Var.A(f2);
            } else if (!z3) {
                fA2 = bf1Var.A(f2);
            } else if (this.w) {
                fA2 = fA3;
            }
        } else if (this.w) {
            fA2 = fA3;
        }
        tb tbVar2 = this.A;
        m10 m10Var = null;
        Float f3 = tbVar2 != null ? (Float) tbVar2.e.getValue() : null;
        byte b3 = 3;
        if (f3 == null || f3.floatValue() != fA) {
            ie1.p(x0(), null, new qx2(this, fA, m10Var, b), 3);
        }
        tb tbVar3 = this.z;
        Float f4 = tbVar3 != null ? (Float) tbVar3.e.getValue() : null;
        if (f4 == null || f4.floatValue() != fA2) {
            ie1.p(x0(), null, new qx2(this, fA2, m10Var, b2), 3);
        }
        if (Float.isNaN(this.C) && Float.isNaN(this.B)) {
            this.C = fA;
            this.B = fA2;
        }
        return bf1Var.g0(iFloatValue, iFloatValue, bg0.h, new v7(ny1VarE, this, fA2, b3));
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
