package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fx0 extends cd1 {
    @Override // defpackage.cd1
    public final void K0() {
        gd1 gd1Var = this.B.B.M.q;
        gd1Var.getClass();
        gd1Var.z0();
    }

    @Override // defpackage.ue1
    public final int U(int i) {
        ix0 ix0VarT = this.B.B.t();
        ze1 ze1VarG = ix0VarT.G();
        l41 l41Var = (l41) ix0VarT.i;
        return ze1VarG.e(l41Var.L.d, l41Var.l(), i);
    }

    @Override // defpackage.ue1
    public final int a0(int i) {
        ix0 ix0VarT = this.B.B.t();
        ze1 ze1VarG = ix0VarT.G();
        l41 l41Var = (l41) ix0VarT.i;
        return ze1VarG.b(l41Var.L.d, l41Var.l(), i);
    }

    @Override // defpackage.ue1
    public final int d0(int i) {
        ix0 ix0VarT = this.B.B.t();
        ze1 ze1VarG = ix0VarT.G();
        l41 l41Var = (l41) ix0VarT.i;
        return ze1VarG.d(l41Var.L.d, l41Var.l(), i);
    }

    @Override // defpackage.ue1
    public final ny1 e(long j) {
        p0(j);
        pn1 pn1Var = this.B;
        uj1 uj1VarZ = pn1Var.B.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            gd1 gd1Var = ((l41) objArr[i2]).M.q;
            gd1Var.getClass();
            gd1Var.q = j41.j;
        }
        l41 l41Var = pn1Var.B;
        N0(l41Var.C.c(this, l41Var.l(), j));
        return this;
    }

    @Override // defpackage.ue1
    public final int g(int i) {
        ix0 ix0VarT = this.B.B.t();
        ze1 ze1VarG = ix0VarT.G();
        l41 l41Var = (l41) ix0VarT.i;
        return ze1VarG.a(l41Var.L.d, l41Var.l(), i);
    }

    @Override // defpackage.ad1
    public final int s0(e5 e5Var) {
        gd1 gd1Var = this.B.B.M.q;
        gd1Var.getClass();
        m41 m41Var = gd1Var.y;
        if (!gd1Var.r) {
            p41 p41Var = gd1Var.m;
            if (p41Var.d == h41.i) {
                m41Var.f = true;
                if (m41Var.b) {
                    p41Var.f = true;
                    p41Var.g = true;
                }
            } else {
                m41Var.g = true;
            }
        }
        fx0 fx0Var = gd1Var.p().j0;
        Boolean boolValueOf = fx0Var != null ? Boolean.valueOf(fx0Var.v) : null;
        fx0 fx0Var2 = gd1Var.p().j0;
        if (fx0Var2 != null) {
            fx0Var2.v = true;
        }
        gd1Var.r();
        fx0 fx0Var3 = gd1Var.p().j0;
        if (fx0Var3 != null) {
            fx0Var3.v = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) m41Var.i.get(e5Var);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.G.g(iIntValue, e5Var);
        return iIntValue;
    }
}
