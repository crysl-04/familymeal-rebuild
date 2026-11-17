package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j42 extends j00 {
    public boolean s;
    public final l52 t;

    public j42(o10 o10Var, ds1 ds1Var) {
        super(o10Var, ds1Var);
        this.s = false;
        this.t = (l52) tk.p.b(this.i.j(), 1L);
    }

    @Override // defpackage.tk
    public final void C() {
        boolean zS0;
        o10 o10Var = this.i;
        ya2 ya2Var = o10Var.a;
        gy1 gy1Var = (gy1) ya2Var.o1(ya2Var.i);
        re1 re1VarG = G();
        re1 re1VarH = H();
        long jH1 = gy1Var.h1();
        long jB1 = gy1Var.B1();
        l52 l52Var = this.t;
        l52 l52Var2 = this.r;
        if (jH1 < jB1) {
            me1 me1Var = this.l;
            zS0 = me1Var.s0();
            if (zS0) {
                re1 re1VarE1 = gy1Var.e1(me1Var.l(gy1Var.Q0()));
                me1 me1Var2 = this.k;
                zS0 = me1Var2.l1(re1VarE1);
                if (zS0) {
                    me1Var2.H1(gy1Var.e1(me1Var.H1(re1VarH, l52Var)).O0(re1VarG), l52Var2);
                    me1Var.H1(re1VarH.O0(gy1Var.Q0().e1(l52Var2)), l52Var);
                }
            }
        } else {
            zS0 = false;
        }
        if (!zS0) {
            l52 l52Var3 = (l52) tk.p.b(o10Var.h() + o10Var.j(), 1L);
            boolean zE = E(l52Var3);
            if (zE) {
                l52Var.Z(l52Var3.A1(o10Var.j(), 1L));
                l52Var2.Z(l52Var3.V1(o10Var.j(), 0L));
            }
            zS0 = zE;
        }
        l52 l52Var4 = this.j;
        if (zS0) {
            this.e = is1.OPTIMAL;
            if (this.s) {
                l52Var4.v1(h32.s, l52Var);
            } else {
                l52Var4.Z(l52Var);
            }
        } else if (this.s) {
            this.e = is1.FEASIBLE;
        } else {
            this.e = is1.INFEASIBLE;
            l52Var4.T1(Double.valueOf(h32.a));
        }
        i();
    }

    @Override // defpackage.j00
    public final re1 G() {
        boolean z = this.s;
        o10 o10Var = this.i;
        if (!z) {
            return o10Var.c;
        }
        long jH = o10Var.h();
        g52 g52Var = tk.p;
        g52Var.getClass();
        return new z93(g52Var, jH, 1L);
    }

    @Override // defpackage.j00
    public final re1 H() {
        if (!this.s) {
            return w();
        }
        return w().O0(x().e1(this.j));
    }

    @Override // defpackage.j00, defpackage.tk
    public final boolean y(gs1 gs1Var) {
        super.y(gs1Var);
        l52 l52Var = this.j;
        if (gs1Var == null || !gs1Var.m.c()) {
            l52Var.T1(Double.valueOf(h32.a));
            this.s = false;
            return true;
        }
        l52Var.Z(gs1Var);
        this.s = true;
        this.e = is1.FEASIBLE;
        return true;
    }
}
