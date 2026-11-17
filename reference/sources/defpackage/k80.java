package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class k80 extends qg1 {
    public final int v = vn1.e(this);
    public qg1 w;

    @Override // defpackage.qg1
    public final void A0() {
        for (qg1 qg1Var = this.w; qg1Var != null; qg1Var = qg1Var.m) {
            qg1Var.A0();
        }
        super.A0();
    }

    @Override // defpackage.qg1
    public final void E0() {
        super.E0();
        for (qg1 qg1Var = this.w; qg1Var != null; qg1Var = qg1Var.m) {
            qg1Var.E0();
        }
    }

    @Override // defpackage.qg1
    public final void F0() {
        for (qg1 qg1Var = this.w; qg1Var != null; qg1Var = qg1Var.m) {
            qg1Var.F0();
        }
        super.F0();
    }

    @Override // defpackage.qg1
    public final void G0() {
        super.G0();
        for (qg1 qg1Var = this.w; qg1Var != null; qg1Var = qg1Var.m) {
            qg1Var.G0();
        }
    }

    @Override // defpackage.qg1
    public final void H0(qg1 qg1Var) {
        this.h = qg1Var;
        for (qg1 qg1Var2 = this.w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
            qg1Var2.H0(qg1Var);
        }
    }

    @Override // defpackage.qg1
    public final void I0(pn1 pn1Var) {
        this.o = pn1Var;
        for (qg1 qg1Var = this.w; qg1Var != null; qg1Var = qg1Var.m) {
            qg1Var.I0(pn1Var);
        }
    }

    public final j80 J0(j80 j80Var) {
        qg1 qg1Var = ((qg1) j80Var).h;
        if (qg1Var != j80Var) {
            qg1 qg1Var2 = j80Var instanceof qg1 ? (qg1) j80Var : null;
            qg1 qg1Var3 = qg1Var2 != null ? qg1Var2.l : null;
            if (qg1Var != this.h || !uz0.g(qg1Var3, this)) {
                li1.g("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (qg1Var.u) {
                ax0.b("Cannot delegate to an already attached node");
            }
            qg1Var.H0(this.h);
            int i = this.j;
            int iF = vn1.f(qg1Var);
            qg1Var.j = iF;
            int i2 = this.j;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof c41)) {
                ax0.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + qg1Var);
            }
            qg1Var.m = this.w;
            this.w = qg1Var;
            qg1Var.l = this;
            L0(this.j | iF, false);
            if (this.u) {
                if (i3 == 0 || (i & 2) != 0) {
                    I0(this.o);
                } else {
                    ln1 ln1Var = cu.Y(this).L;
                    this.h.I0(null);
                    ln1Var.g();
                }
                qg1Var.z0();
                qg1Var.F0();
                if (!qg1Var.u) {
                    ax0.b("autoInvalidateInsertedNode called on unattached node");
                }
                vn1.a(qg1Var, -1, 1);
            }
        }
        return j80Var;
    }

    public final void K0(j80 j80Var) {
        qg1 qg1Var = null;
        for (qg1 qg1Var2 = this.w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
            if (qg1Var2 == j80Var) {
                boolean z = qg1Var2.u;
                if (z) {
                    bj1 bj1Var = vn1.a;
                    if (!z) {
                        ax0.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    vn1.a(qg1Var2, -1, 2);
                    qg1Var2.G0();
                    qg1Var2.A0();
                }
                qg1Var2.H0(qg1Var2);
                qg1Var2.k = 0;
                qg1 qg1Var3 = qg1Var2.m;
                if (qg1Var == null) {
                    this.w = qg1Var3;
                } else {
                    qg1Var.m = qg1Var3;
                }
                qg1Var2.m = null;
                qg1Var2.l = null;
                int i = this.j;
                int iF = vn1.f(this);
                L0(iF, true);
                if (this.u && (i & 2) != 0 && (iF & 2) == 0) {
                    ln1 ln1Var = cu.Y(this).L;
                    this.h.I0(null);
                    ln1Var.g();
                    return;
                }
                return;
            }
            qg1Var = qg1Var2;
        }
        wg.h(j80Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qg1] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void L0(int i, boolean z) {
        qg1 qg1Var;
        int i2 = this.j;
        this.j = i;
        if (i2 != i) {
            qg1 qg1Var2 = this.h;
            if (qg1Var2 == this) {
                this.k = i;
            }
            boolean z2 = this.u;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.j;
                    r2.j = i;
                    if (r2 == qg1Var2) {
                        break;
                    } else {
                        r2 = r2.l;
                    }
                }
                if (z && r2 == qg1Var2) {
                    i = vn1.f(qg1Var2);
                    qg1Var2.j = i;
                }
                int i3 = i | ((r2 == 0 || (qg1Var = r2.m) == null) ? 0 : qg1Var.k);
                for (?? r3 = r2; r3 != 0; r3 = r3.l) {
                    i3 |= r3.j;
                    r3.k = i3;
                }
            }
        }
    }

    @Override // defpackage.qg1
    public final void z0() {
        super.z0();
        for (qg1 qg1Var = this.w; qg1Var != null; qg1Var = qg1Var.m) {
            qg1Var.I0(this.o);
            if (!qg1Var.u) {
                qg1Var.z0();
            }
        }
    }
}
