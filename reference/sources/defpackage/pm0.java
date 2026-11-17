package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pm0 extends k80 implements ug2, sr0, pz, rp1, yz2 {
    public static final yy D = new yy((byte) 11);
    public y61 A;
    public pn1 B;
    public final lm0 C;
    public ui1 x;
    public final i y;
    public wl0 z;

    public pm0(ui1 ui1Var, int i, i iVar) {
        this.x = ui1Var;
        this.y = iVar;
        lm0 lm0Var = new lm0(i, new om0(2, this, pm0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 0), 10);
        J0(lm0Var);
        this.C = lm0Var;
    }

    @Override // defpackage.qg1
    public final void D0() {
        y61 y61Var = this.A;
        if (y61Var != null) {
            y61Var.b();
        }
        this.A = null;
    }

    @Override // defpackage.rp1
    public final void M() {
        x72 x72Var = new x72();
        ou.D(this, new h6((Object) x72Var, (Object) this, (byte) 16));
        y61 y61Var = (y61) x72Var.h;
        if (this.C.O0().a()) {
            y61 y61Var2 = this.A;
            if (y61Var2 != null) {
                y61Var2.b();
            }
            if (y61Var != null) {
                y61Var.a();
            } else {
                y61Var = null;
            }
            this.A = y61Var;
        }
    }

    public final void M0(ui1 ui1Var, gz0 gz0Var) {
        if (!this.u) {
            ui1Var.c(gz0Var);
            return;
        }
        s01 s01Var = (s01) ((k10) x0()).h.m(c5.Z);
        ie1.p(x0(), null, new j(ui1Var, gz0Var, s01Var != null ? s01Var.r(new g(ui1Var, gz0Var, (byte) 12)) : null, null, (byte) 9), 3);
    }

    public final void N0() {
        ln1 ln1Var;
        if (this.u) {
            if (!this.h.u) {
                ax0.b("visitAncestors called on an unattached node");
            }
            qg1 qg1Var = this.h.l;
            l41 l41VarY = cu.Y(this);
            while (l41VarY != null) {
                if ((l41VarY.L.f.k & 262144) != 0) {
                    while (qg1Var != null) {
                        if ((qg1Var.j & 262144) != 0) {
                            qg1 qg1VarR = qg1Var;
                            uj1 uj1Var = null;
                            while (qg1VarR != null) {
                                if (qg1VarR instanceof yz2) {
                                    if (qm0.v == ((yz2) qg1VarR).r()) {
                                        return;
                                    }
                                }
                                if ((qg1VarR.j & 262144) != 0 && (qg1VarR instanceof k80)) {
                                    int i = 0;
                                    for (qg1 qg1Var2 = ((k80) qg1VarR).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                                        if ((qg1Var2.j & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                qg1VarR = qg1Var2;
                                            } else {
                                                if (uj1Var == null) {
                                                    uj1Var = new uj1(new qg1[16]);
                                                }
                                                if (qg1VarR != null) {
                                                    uj1Var.b(qg1VarR);
                                                    qg1VarR = null;
                                                }
                                                uj1Var.b(qg1Var2);
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                qg1VarR = cu.R(uj1Var);
                            }
                        }
                        qg1Var = qg1Var.l;
                    }
                }
                l41VarY = l41VarY.u();
                qg1Var = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
            }
        }
    }

    public final void O0(ui1 ui1Var) {
        wl0 wl0Var;
        if (uz0.g(this.x, ui1Var)) {
            return;
        }
        ui1 ui1Var2 = this.x;
        if (ui1Var2 != null && (wl0Var = this.z) != null) {
            ui1Var2.c(new xl0(wl0Var));
        }
        this.z = null;
        this.x = ui1Var;
    }

    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
        boolean zA = this.C.O0().a();
        q21[] q21VarArr = bh2.a;
        ch2 ch2Var = ah2.l;
        q21 q21Var = bh2.a[4];
        Boolean boolValueOf = Boolean.valueOf(zA);
        ch2Var.getClass();
        dh2Var.a(ch2Var, boolValueOf);
        dh2Var.a(qg2.w, new m1(null, new o6(0, this, pm0.class, "requestFocus", "requestFocus()Z", 0, (byte) 3)));
    }

    @Override // defpackage.yz2
    public final Object r() {
        return D;
    }

    @Override // defpackage.sr0
    public final void v(pn1 pn1Var) {
        this.B = pn1Var;
        if (this.C.O0().a()) {
            if (!pn1Var.V0().u) {
                N0();
                return;
            }
            pn1 pn1Var2 = this.B;
            if (pn1Var2 == null || !pn1Var2.V0().u) {
                return;
            }
            N0();
        }
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
