package defpackage;

import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class vn1 {
    public static final bj1 a;

    static {
        bj1 bj1Var = ip1.a;
        a = new bj1();
    }

    public static final void a(qg1 qg1Var, int i, int i2) {
        if (!(qg1Var instanceof k80)) {
            b(qg1Var, qg1Var.j & i, i2);
            return;
        }
        k80 k80Var = (k80) qg1Var;
        int i3 = k80Var.v;
        b(qg1Var, i3 & i, i2);
        int i4 = i & (~i3);
        for (qg1 qg1Var2 = k80Var.w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
            a(qg1Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(qg1 qg1Var, int i, int i2) {
        if (i2 != 0 || qg1Var.y0()) {
            if ((i & 2) != 0 && (qg1Var instanceof c41)) {
                vs.E((c41) qg1Var);
                if (i2 == 2) {
                    cu.W(qg1Var, 2).i1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                cu.Y(qg1Var).F();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                cu.Y(qg1Var).V(false);
            }
            if ((i & 256) != 0 && (qg1Var instanceof sr0)) {
                if (i2 == 1) {
                    l41 l41VarY = cu.Y(qg1Var);
                    l41VarY.b0(l41VarY.T + 1);
                } else if (i2 == 2) {
                    l41 l41VarY2 = cu.Y(qg1Var);
                    l41VarY2.b0(l41VarY2.T - 1);
                }
                if (i2 != 2) {
                    l41 l41VarY3 = cu.Y(qg1Var);
                    if (l41VarY3.T != 0 && !l41VarY3.p() && !l41VarY3.q() && !l41VarY3.S) {
                        t6 t6VarA = o41.a(l41VarY3);
                        ix0 ix0Var = t6VarA.W.e;
                        if (l41VarY3.T > 0) {
                            ((uj1) ix0Var.i).b(l41VarY3);
                            l41VarY3.S = true;
                        }
                        t6VarA.E(null);
                    }
                }
            }
            if ((i & 4) != 0 && (qg1Var instanceof sd0)) {
                dt.H((sd0) qg1Var);
            }
            if ((i & 8) != 0 && (qg1Var instanceof ug2)) {
                cu.Y(qg1Var).x = true;
            }
            if ((i & 64) != 0 && (qg1Var instanceof mu1)) {
                p41 p41Var = cu.Y((mu1) qg1Var).M;
                p41Var.p.x = true;
                gd1 gd1Var = p41Var.q;
                if (gd1Var != null) {
                    gd1Var.D = true;
                }
            }
            if ((i & 2048) != 0 && (qg1Var instanceof qk)) {
                pg1 pg1Var = ((qk) qg1Var).v;
                ax0.b("applyFocusProperties called on wrong node");
                pg1Var.getClass();
                li1.c();
                return;
            }
            if ((i & 4096) != 0 && (qg1Var instanceof vl0)) {
                vl0 vl0Var = (vl0) qg1Var;
                zl0 zl0Var = ((em0) cu.Z(vl0Var).getFocusOwner()).d;
                if (zl0Var.d.a(vl0Var)) {
                    zl0Var.a();
                }
            }
            if ((i & 2097152) != 0 && (qg1Var instanceof nv0) && i2 == 2) {
                ((nv0) qg1Var).C();
            }
        }
    }

    public static final void c(qg1 qg1Var) {
        if (!qg1Var.u) {
            ax0.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(qg1Var, -1, 0);
    }

    public static final int d(pg1 pg1Var) {
        int i = pg1Var instanceof a41 ? 3 : 1;
        if (pg1Var instanceof rd0) {
            i |= 4;
        }
        if (pg1Var instanceof sg2) {
            i |= 8;
        }
        if (pg1Var instanceof ug1) {
            i |= 32;
        }
        if (pg1Var instanceof jc) {
            i |= 64;
        }
        return pg1Var instanceof ko ? i | 524288 : i;
    }

    public static final int e(qg1 qg1Var) {
        int i = qg1Var.j;
        if (i != 0) {
            return i;
        }
        Class<?> cls = qg1Var.getClass();
        bj1 bj1Var = a;
        int iD = bj1Var.d(cls);
        if (iD >= 0) {
            return bj1Var.c[iD];
        }
        int i2 = qg1Var instanceof c41 ? 3 : 1;
        if (qg1Var instanceof sd0) {
            i2 |= 4;
        }
        if (qg1Var instanceof ug2) {
            i2 |= 8;
        }
        if (qg1Var instanceof c12) {
            i2 |= 16;
        }
        if (qg1Var instanceof tg1) {
            i2 |= 32;
        }
        if (qg1Var instanceof mu1) {
            i2 |= 64;
        }
        if (qg1Var instanceof r31) {
            i2 |= 4194432;
        } else if (qg1Var instanceof cf1) {
            i2 |= 128;
        }
        if (qg1Var instanceof sr0) {
            i2 |= 256;
        }
        if (qg1Var instanceof lm0) {
            i2 |= 1024;
        }
        if (qg1Var instanceof qk) {
            i2 |= 2048;
        }
        if (qg1Var instanceof vl0) {
            i2 |= 4096;
        }
        if (qg1Var instanceof z21) {
            i2 |= 8192;
        }
        if (qg1Var instanceof n6) {
            i2 |= CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
        }
        if (qg1Var instanceof pz) {
            i2 |= 32768;
        }
        if (qg1Var instanceof yz2) {
            i2 |= 262144;
        }
        if (qg1Var instanceof ko) {
            i2 |= 524288;
        }
        if (qg1Var instanceof lm0) {
            i2 |= 1048576;
        }
        if (qg1Var instanceof nv0) {
            i2 |= 2097152;
        }
        if (qg1Var instanceof l61) {
            i2 |= 8388608;
        }
        bj1Var.g(i2, cls);
        return i2;
    }

    public static final int f(qg1 qg1Var) {
        if (!(qg1Var instanceof k80)) {
            return e(qg1Var);
        }
        k80 k80Var = (k80) qg1Var;
        int iF = k80Var.v;
        for (qg1 qg1Var2 = k80Var.w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
            iF |= f(qg1Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
