package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ro1 {
    public final o10 a;
    public final z80 b;
    public final zp1 c;
    public final l52 d;
    public transient o10 e = null;

    public ro1(o10 o10Var, z80 z80Var, zp1 zp1Var, l52 l52Var) {
        this.a = o10Var;
        this.b = z80Var;
        this.c = zp1Var;
        this.d = l52Var;
    }

    public final o10 a() {
        if (this.e == null) {
            o10 o10Var = this.a;
            int iJ = o10Var.j();
            o10Var.h();
            int i = o10Var.i();
            int iK1 = iJ - this.b.k1();
            eg egVar = o10Var.f;
            gy1 gy1VarY = egVar.y();
            gy1 gy1VarU = egVar.u();
            zp1 zp1Var = this.c;
            wz2 wz2Var = new wz2(zp1Var);
            re1 re1VarE1 = wz2Var.e1(gy1VarY).e1(zp1Var);
            re1 re1VarH = re1VarE1.L1(re1VarE1.Q0()).h(h32.f);
            l52 l52Var = this.d;
            re1 re1VarE2 = wz2Var.e1(gy1VarU.O0(gy1VarY.e1(l52Var)));
            g52 g52Var = l52.q;
            o10 o10Var2 = new o10(iK1, 0, i, false);
            this.e = o10Var2;
            eg egVar2 = o10Var2.f;
            egVar2.y().Z(re1VarH);
            egVar2.u().Z(re1VarE2);
            for (int i2 = 0; i2 < i; i2++) {
                cm2 cm2VarA0 = o10Var.b.a0(i2);
                this.e.d.b0(o10Var.d.A(i2) - cm2VarA0.S(l52Var), i2, 0);
                for (int i3 = 0; i3 < iK1; i3++) {
                    double dS = cm2VarA0.S(zp1Var.u(i3));
                    if (!i32.l.B(h32.b, dS)) {
                        this.e.b.a0(i2).o(i3, dS);
                    }
                }
            }
        }
        return this.e;
    }
}
