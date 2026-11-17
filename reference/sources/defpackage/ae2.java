package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ae2 extends k80 implements pz, rp1 {
    public tj0 A;
    public ui1 B;
    public un2 C;
    public boolean D;
    public j8 E;
    public je2 F;
    public j80 G;
    public k8 H;
    public j8 I;
    public boolean J;
    public ke2 x;
    public ks1 y;
    public boolean z;

    @Override // defpackage.qg1
    public final void B0() {
        this.J = N0();
        M0();
        if (this.F == null) {
            ke2 ke2Var = this.x;
            je2 je2Var = new je2(this.D ? this.I : this.E, this.A, this.B, this.y, ke2Var, this.C, this.z, this.J);
            J0(je2Var);
            this.F = je2Var;
        }
    }

    @Override // defpackage.qg1
    public final void C0() {
        j80 j80Var = this.G;
        if (j80Var != null) {
            K0(j80Var);
        }
    }

    @Override // defpackage.rp1
    public final void M() {
        k8 k8Var = (k8) vs.z(this, dt1.a);
        if (uz0.g(k8Var, this.H)) {
            return;
        }
        this.H = k8Var;
        this.I = null;
        j80 j80Var = this.G;
        if (j80Var != null) {
            K0(j80Var);
        }
        this.G = null;
        M0();
        je2 je2Var = this.F;
        if (je2Var != null) {
            ke2 ke2Var = this.x;
            ks1 ks1Var = this.y;
            je2Var.c1(this.D ? this.I : this.E, this.A, this.B, ks1Var, ke2Var, this.C, this.z, this.J);
        }
    }

    public final void M0() {
        j80 j80Var = this.G;
        if (j80Var != null) {
            if (((qg1) j80Var).h.u) {
                return;
            }
            J0(j80Var);
            return;
        }
        if (this.D) {
            ou.D(this, new xu1(this, (byte) 7));
        }
        j8 j8Var = this.D ? this.I : this.E;
        if (j8Var != null) {
            k80 k80Var = j8Var.i;
            if (k80Var.h.u) {
                return;
            }
            J0(k80Var);
            this.G = k80Var;
        }
    }

    public final boolean N0() {
        return (this.u ? cu.Y(this).F : u31.h) != u31.i || this.y == ks1.h;
    }

    public final void O0(j8 j8Var, tj0 tj0Var, ui1 ui1Var, ks1 ks1Var, ke2 ke2Var, un2 un2Var, boolean z, boolean z2) {
        boolean z3;
        this.x = ke2Var;
        this.y = ks1Var;
        boolean z4 = true;
        if (this.D != z) {
            this.D = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (uz0.g(this.E, j8Var)) {
            z4 = false;
        } else {
            this.E = j8Var;
        }
        if (z3 || (z4 && !z)) {
            j80 j80Var = this.G;
            if (j80Var != null) {
                K0(j80Var);
            }
            this.G = null;
            M0();
        }
        this.z = z2;
        this.A = tj0Var;
        this.B = ui1Var;
        this.C = un2Var;
        boolean zN0 = N0();
        this.J = zN0;
        je2 je2Var = this.F;
        if (je2Var != null) {
            je2Var.c1(this.D ? this.I : this.E, tj0Var, ui1Var, ks1Var, ke2Var, un2Var, z2, zN0);
        }
    }

    @Override // defpackage.j80
    public final void t0() {
        boolean zN0 = N0();
        if (this.J != zN0) {
            this.J = zN0;
            ke2 ke2Var = this.x;
            ks1 ks1Var = this.y;
            boolean z = this.D;
            O0(z ? this.I : this.E, this.A, this.B, ks1Var, ke2Var, this.C, z, this.z);
        }
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
