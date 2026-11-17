package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p41 {
    public final l41 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public gd1 q;
    public h41 d = h41.l;
    public final ye1 p = new ye1(this);

    public p41(l41 l41Var) {
        this.a = l41Var;
    }

    public final pn1 a() {
        return this.a.L.d;
    }

    public final void b() {
        h41 h41Var = this.a.M.d;
        h41 h41Var2 = h41.j;
        h41 h41Var3 = h41.k;
        if (h41Var == h41Var2 || h41Var == h41Var3) {
            if (this.p.H) {
                g(true);
            } else {
                f(true);
            }
        }
        if (h41Var == h41Var3) {
            gd1 gd1Var = this.q;
            if (gd1Var == null || !gd1Var.B) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        gd1 gd1Var = this.q;
        if (gd1Var != null) {
            p41 p41Var = gd1Var.m;
            p41Var.d = h41.i;
            l41 l41Var = p41Var.a;
            p41Var.e = false;
            gd1Var.F = j;
            it1 snapshotObserver = o41.a(l41Var).getSnapshotObserver();
            ed1 ed1Var = gd1Var.G;
            snapshotObserver.a.d(l41Var, snapshotObserver.b, ed1Var);
            p41Var.f = true;
            p41Var.g = true;
            boolean zR = ys.R(l41Var);
            ye1 ye1Var = p41Var.p;
            if (zR) {
                ye1Var.C = true;
                ye1Var.D = true;
            } else {
                ye1Var.B = true;
            }
            p41Var.d = h41.l;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            l41 l41VarU = this.a.u();
            p41 p41Var = l41VarU != null ? l41VarU.M : null;
            if (p41Var != null) {
                int i3 = p41Var.l;
                if (i == 0) {
                    p41Var.d(i3 - 1);
                } else {
                    p41Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            l41 l41VarU = this.a.u();
            p41 p41Var = l41VarU != null ? l41VarU.M : null;
            if (p41Var != null) {
                int i3 = p41Var.o;
                if (i == 0) {
                    p41Var.e(i3 - 1);
                } else {
                    p41Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            boolean z2 = this.j;
            if (z) {
                if (z2) {
                    return;
                }
                d(this.l + 1);
            } else {
                if (z2) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            boolean z2 = this.k;
            if (z) {
                if (z2) {
                    return;
                }
                d(this.l + 1);
            } else {
                if (z2) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            boolean z2 = this.m;
            if (z) {
                if (z2) {
                    return;
                }
                e(this.o + 1);
            } else {
                if (z2) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            boolean z2 = this.n;
            if (z) {
                if (z2) {
                    return;
                }
                e(this.o + 1);
            } else {
                if (z2) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        ye1 ye1Var = this.p;
        p41 p41Var = ye1Var.m;
        Object obj = ye1Var.y;
        l41 l41Var = this.a;
        if ((obj != null || p41Var.a().l() != null) && ye1Var.x) {
            ye1Var.x = false;
            ye1Var.y = p41Var.a().l();
            l41 l41VarU = l41Var.u();
            if (l41VarU != null) {
                l41.W(l41VarU, false, 7);
            }
        }
        gd1 gd1Var = this.q;
        if (gd1Var != null) {
            p41 p41Var2 = gd1Var.m;
            if (gd1Var.E == null) {
                cd1 cd1VarT0 = p41Var2.a().T0();
                cd1VarT0.getClass();
                if (cd1VarT0.B.l() == null) {
                    return;
                }
            }
            if (gd1Var.D) {
                gd1Var.D = false;
                cd1 cd1VarT1 = p41Var2.a().T0();
                cd1VarT1.getClass();
                gd1Var.E = cd1VarT1.B.l();
                if (ys.R(l41Var)) {
                    l41 l41VarU2 = l41Var.u();
                    if (l41VarU2 != null) {
                        l41.W(l41VarU2, false, 7);
                        return;
                    }
                    return;
                }
                l41 l41VarU3 = l41Var.u();
                if (l41VarU3 != null) {
                    l41.U(l41VarU3, false, 7);
                }
            }
        }
    }
}
