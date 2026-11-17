package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dt0 extends qg1 implements pz, c41, rp1 {
    public int A;
    public xw2 B;
    public a13 C;
    public xw2 v;
    public boolean w;
    public int x;
    public boolean y;
    public int z;

    @Override // defpackage.qg1
    public final void B0() {
        sm0 sm0Var = (sm0) vs.z(this, uz.k);
        this.B = p02.H(this.v, cu.Y(this).F);
        ar2 ar2Var = L0().a.f;
        qn0 qn0Var = L0().a.c;
        if (qn0Var == null) {
            qn0Var = qn0.j;
        }
        on0 on0Var = L0().a.d;
        int i = on0Var != null ? on0Var.a : 0;
        pn0 pn0Var = L0().a.e;
        this.C = ((tm0) sm0Var).b(ar2Var, qn0Var, i, pn0Var != null ? pn0Var.a : 65535);
        ou.D(this, new ct0(this, (byte) 0));
        this.y = true;
    }

    @Override // defpackage.qg1
    public final void C0() {
        this.B = null;
        this.C = null;
        this.y = false;
    }

    @Override // defpackage.c41
    public final int E(ad1 ad1Var, ue1 ue1Var, int i) {
        K0(ad1Var);
        int i2 = this.z;
        if (i2 == this.A) {
            return i2;
        }
        int iD0 = ue1Var.d0(i);
        int i3 = this.z;
        int i4 = this.A;
        if (iD0 < i3) {
            iD0 = i3;
        }
        return iD0 > i4 ? i4 : iD0;
    }

    public final void J0(bf1 bf1Var, xw2 xw2Var, sm0 sm0Var) {
        hw2 hw2Var = cu2.b(xw2Var, bf1Var, sm0Var, 3, true).d;
        float fH = hw2Var.h(0);
        float fH2 = hw2Var.h(1);
        float fH3 = hw2Var.h(2);
        this.z = vs.w(fH, fH2, fH3, this.w ? 1 : 0, 1);
        this.A = vs.w(fH, fH2, fH3, this.x, Integer.MAX_VALUE);
    }

    public final void K0(ad1 ad1Var) {
        if (this.y) {
            J0(ad1Var, L0(), (sm0) vs.z(this, uz.k));
            this.y = false;
        }
        int i = this.z;
        this.z = i >= 0 ? i : 0;
        int i2 = this.A;
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        this.A = i2;
    }

    public final xw2 L0() {
        xw2 xw2Var = this.B;
        if (xw2Var != null) {
            return xw2Var;
        }
        throw wi0.w("Resolved style is not set.");
    }

    @Override // defpackage.rp1
    public final void M() {
        if (this.C != null) {
            ou.D(this, new ct0(this, (byte) 1));
        }
        this.y = true;
        vs.E(this);
    }

    @Override // defpackage.j80
    public final void a() {
        this.y = true;
        vs.E(this);
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        if (this.y) {
            J0(bf1Var, L0(), (sm0) vs.z(this, uz.k));
            this.y = false;
        }
        int i = this.z;
        int iN = i != -1 ? cy1.n(i, k00.j(j), k00.h(j)) : k00.j(j);
        int i2 = this.A;
        ny1 ny1VarE = ue1Var.e(k00.b(j, 0, 0, iN, i2 != -1 ? cy1.n(i2, k00.j(j), k00.h(j)) : k00.h(j), 3));
        return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0.h, new m6(ny1VarE, (byte) 3));
    }

    @Override // defpackage.c41
    public final int p(ad1 ad1Var, ue1 ue1Var, int i) {
        K0(ad1Var);
        int i2 = this.z;
        int i3 = this.A;
        if (i2 == i3) {
            return i3;
        }
        int iG = ue1Var.g(i);
        int i4 = this.z;
        int i5 = this.A;
        if (iG < i4) {
            iG = i4;
        }
        return iG > i5 ? i5 : iG;
    }

    @Override // defpackage.j80
    public final void t0() {
        this.B = p02.H(this.v, cu.Y(this).F);
        this.y = true;
        vs.E(this);
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
