package defpackage;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j00 extends tk {
    public final l52 q;
    public final l52 r;

    public j00(o10 o10Var, ds1 ds1Var) {
        super(o10Var, ds1Var);
        int iH = this.i.h();
        int i = this.i.i();
        g52 g52Var = tk.p;
        this.q = (l52) g52Var.b(iH, 1L);
        this.r = (l52) g52Var.b(iH + i, 1L);
    }

    @Override // defpackage.tk
    public final void D(gy1 gy1Var) {
        if (gy1Var != null) {
            this.r.Z(gy1Var);
        }
    }

    public re1 F() {
        ya2 ya2Var = this.i.a;
        return (gy1) ya2Var.o1(ya2Var.i);
    }

    public abstract re1 G();

    public re1 H() {
        return w();
    }

    @Override // defpackage.tk
    public final gs1 n() {
        gs1 gs1VarN = super.n();
        if (!r10.m(gs1VarN.m)) {
            return gs1VarN;
        }
        if (!d().isPresent()) {
            final byte b = 1;
            gs1VarN.i = new Supplier(this) { // from class: i00
                public final /* synthetic */ j00 b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Supplier
                public final Object get() {
                    byte b2 = b;
                    j00 j00Var = this.b;
                    switch (b2) {
                        case 0:
                            break;
                    }
                    return j00Var.r;
                }
            };
            return gs1VarN;
        }
        m00 m00Var = this.i.e;
        final byte b2 = 0;
        Supplier supplier = new Supplier(this) { // from class: i00
            public final /* synthetic */ j00 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                byte b3 = b2;
                j00 j00Var = this.b;
                switch (b3) {
                    case 0:
                        break;
                }
                return j00Var.r;
            }
        };
        gs1VarN.h = m00Var;
        gs1VarN.i = supplier;
        return gs1VarN;
    }

    @Override // defpackage.tk
    public final double[] o() {
        double[] dArrO = super.o();
        this.i.g(dArrO, this.r);
        return dArrO;
    }

    @Override // defpackage.tk
    public final gy1 p() {
        return this.r.U();
    }

    @Override // defpackage.tk
    public final e1 s() {
        gy1 gy1VarX = x();
        re1 re1VarF = F();
        re1 re1VarQ0 = re1VarF.Q0();
        fy1 fy1VarC0 = gy1VarX.C0();
        long jH1 = gy1VarX.h1();
        if (re1VarQ0 == null) {
            re1VarQ0 = new s93(fy1VarC0, re1VarQ0);
        }
        long jH2 = re1VarQ0.h1();
        if (jH2 < jH1) {
            re1VarQ0 = new b(re1VarQ0, new z93(re1VarQ0.C0(), jH1 - jH2, re1VarQ0.B1()), (byte) 0);
        }
        return new b(gy1VarX, re1VarQ0, (byte) 1).o0(re1VarF);
    }

    @Override // defpackage.tk
    public final e1 t() {
        return H().o0(G());
    }

    @Override // defpackage.tk
    public boolean y(gs1 gs1Var) {
        super.y(gs1Var);
        this.a.getClass();
        return true;
    }
}
