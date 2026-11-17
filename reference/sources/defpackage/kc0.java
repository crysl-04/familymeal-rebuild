package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kc0 extends qg1 implements yz2, r31 {
    public kc0 v;
    public kc0 w;
    public long x;

    @Override // defpackage.qg1
    public final void C0() {
        this.w = null;
        this.v = null;
    }

    public final boolean J0() {
        kc0 kc0Var = this.v;
        if (kc0Var != null) {
            return kc0Var.J0();
        }
        kc0 kc0Var2 = this.w;
        if (kc0Var2 != null) {
            return kc0Var2.J0();
        }
        return false;
    }

    public final void K0() {
        kc0 kc0Var = this.w;
        if (kc0Var != null) {
            kc0Var.K0();
            return;
        }
        kc0 kc0Var2 = this.v;
        if (kc0Var2 != null) {
            kc0Var2.K0();
        }
    }

    public final void L0() {
        kc0 kc0Var = this.w;
        if (kc0Var != null) {
            kc0Var.L0();
        }
        kc0 kc0Var2 = this.v;
        if (kc0Var2 != null) {
            kc0Var2.L0();
        }
        this.v = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    public final void M0(g2 g2Var) {
        yz2 yz2Var;
        kc0 kc0Var;
        kc0 kc0Var2;
        kc0 kc0Var3 = this.v;
        if (kc0Var3 == null || !es.v(kc0Var3, ls.B(g2Var))) {
            if (this.h.u) {
                x72 x72Var = new x72();
                y02.D(this, new jc0(x72Var, this, g2Var));
                yz2Var = (yz2) x72Var.h;
            } else {
                yz2Var = null;
            }
            kc0Var = (kc0) yz2Var;
        } else {
            kc0Var = kc0Var3;
        }
        if (kc0Var != null) {
            if (kc0Var3 == null) {
                kc0Var.K0();
                kc0Var.M0(g2Var);
                kc0 kc0Var4 = this.w;
                if (kc0Var4 != null) {
                    kc0Var4.L0();
                }
            } else if (!uz0.g(kc0Var, kc0Var3)) {
                if (kc0Var != null) {
                    kc0Var.K0();
                    kc0Var.M0(g2Var);
                }
                if (kc0Var3 != null) {
                    kc0Var3.L0();
                }
            } else if (kc0Var != null) {
                kc0Var.M0(g2Var);
            } else {
                kc0Var2 = this.w;
                if (kc0Var2 != null) {
                    kc0Var2.M0(g2Var);
                }
            }
        } else if (kc0Var3 != null) {
            kc0 kc0Var5 = this.w;
            if (kc0Var5 != null) {
                kc0Var5.K0();
                kc0Var5.M0(g2Var);
            }
            kc0Var3.L0();
        } else if (!uz0.g(kc0Var, kc0Var3)) {
            if (kc0Var != null) {
                kc0Var.K0();
                kc0Var.M0(g2Var);
            }
            if (kc0Var3 != null) {
                kc0Var3.L0();
            }
        } else if (kc0Var != null) {
            kc0Var.M0(g2Var);
        } else {
            kc0Var2 = this.w;
            if (kc0Var2 != null) {
                kc0Var2.M0(g2Var);
            }
        }
        this.v = kc0Var;
    }

    public final void N0() {
        kc0 kc0Var = this.w;
        if (kc0Var != null) {
            kc0Var.N0();
            return;
        }
        kc0 kc0Var2 = this.v;
        if (kc0Var2 != null) {
            kc0Var2.N0();
        }
    }

    @Override // defpackage.r31, defpackage.cf1
    public final void c(long j) {
        this.x = j;
    }

    @Override // defpackage.yz2
    public final Object r() {
        return c5.Q;
    }
}
