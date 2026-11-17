package defpackage;

import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class tk extends r10 implements u23 {
    public static final wo1 n = wo1.G(7);
    public static final sk o = new sk(0);
    public static final g52 p = l52.q;
    public transient double[] g;
    public double h;
    public final o10 i;
    public final l52 j;
    public final me1 k;
    public final me1 l;
    public boolean m;

    public tk(o10 o10Var, ds1 ds1Var) {
        super(ds1Var);
        this.g = null;
        this.h = h32.a;
        this.m = false;
        this.i = o10Var;
        this.j = (l52) p.b(o10Var.j(), 1L);
        gy1 gy1VarX = x();
        q10 q10Var = ds1Var.j;
        this.l = (me1) q10Var.f.apply(gy1VarX);
        this.k = (me1) q10Var.e.apply(gy1VarX);
    }

    public static tk B(o10 o10Var, ds1 ds1Var) {
        int iH = o10Var.h();
        if (o10Var.i() <= 0) {
            return iH > 0 ? new j42(o10Var, ds1Var) : new f23(o10Var, ds1Var);
        }
        Boolean bool = Boolean.TRUE;
        ds1Var.getClass();
        return bool.equals(null) ? new m01(o10Var, ds1Var) : new pa0(o10Var, ds1Var);
    }

    public boolean A() {
        return this.c.get() < 1;
    }

    public void C() {
        me1 me1Var = this.l;
        boolean zS0 = me1Var.s0();
        l52 l52Var = this.j;
        if (zS0) {
            me1Var.H1(w(), l52Var);
        } else {
            zS0 = E(l52Var);
        }
        if (zS0) {
            this.e = is1.DISTINCT;
        } else {
            this.e = is1.UNBOUNDED;
            l52Var.T1(Double.valueOf(h32.a));
        }
        i();
    }

    public final boolean E(gy1 gy1Var) {
        e1 e1VarS = s();
        me1 me1Var = this.k;
        if (me1Var.l1(e1VarS)) {
            me1Var.H1(t(), gy1Var);
            return true;
        }
        k();
        return false;
    }

    @Override // defpackage.hs1
    public final void a() {
        this.i.getClass();
    }

    @Override // defpackage.u23
    public final double b(int i) {
        double[] dArrQ = this.g;
        if (dArrQ == null) {
            dArrQ = q();
            this.g = dArrQ;
        }
        return dArrQ[i];
    }

    @Override // defpackage.u23
    public final Optional d() {
        o10 o10Var = this.i;
        return o10Var.e.j() ? Optional.of(o10Var) : Optional.empty();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:30:0x0104  */
    /* JADX WARN: Code duplicated, block: B:32:0x013b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0167  */
    /* JADX WARN: Code duplicated, block: B:38:0x0176  */
    /* JADX WARN: Code duplicated, block: B:42:0x0187  */
    /* JADX WARN: Code duplicated, block: B:49:0x017c A[EDGE_INSN: B:49:0x017c->B:40:0x017c BREAK  A[LOOP:1: B:36:0x016d->B:51:?], SYNTHETIC] */
    @Override // defpackage.nr0
    public final gs1 h(gs1 gs1Var) {
        double dDoubleValue;
        is1 is1Var;
        l52 l52VarU;
        gy1 gy1VarP;
        gy1 gy1Var;
        this.g = null;
        if (y(gs1Var)) {
            if (z()) {
                do {
                    C();
                    if (!j()) {
                        break;
                    }
                } while (A());
            }
            if (this.h > h32.a && this.e.c()) {
                is1 is1Var2 = this.e;
                is1 is1Var3 = is1.UNBOUNDED;
                if (is1Var2 != is1Var3) {
                    e32 e32Var = h32.H;
                    ds1 ds1Var = this.a;
                    double d = ds1Var.j.d;
                    e32Var.getClass();
                    double dSqrt = Math.sqrt(d);
                    gy1 gy1VarW = w();
                    l52 l52Var = this.j;
                    Double dW = l52Var.W(3);
                    double dDoubleValue2 = dW.doubleValue();
                    double dDoubleValue3 = ((Double) gy1VarW.W(3)).doubleValue();
                    double d2 = this.h * dDoubleValue2;
                    double d3 = dDoubleValue3 * dSqrt;
                    o10 o10Var = this.i;
                    if (d2 > d3) {
                        g52 g52Var = l52.q;
                        pm pmVar = i32.i;
                        f32 f32Var = h32.v;
                        f32Var.getClass();
                        d23 d23Var = new d23(l52Var, new sm(f32Var, dW));
                        if (gy1VarW.S(d23Var) > d3) {
                            if (((Double) x().e1(d23Var).O0(d23Var.h(this.h)).W(3)).doubleValue() > (this.h / ds1Var.j.d) * dSqrt) {
                                dDoubleValue = l52Var.W(3).doubleValue();
                                if (!n.B(Math.max(((Double) w().W(3)).doubleValue(), ((Double) x().e1(l52Var).W(3)).doubleValue()), this.h * dDoubleValue)) {
                                    gy1 gy1VarU = o10Var.f.u();
                                    is1Var = this.e;
                                    l52VarU = l52Var.U();
                                    gy1 gy1VarU2 = gy1VarU.U();
                                    gy1VarP = p();
                                    gy1VarU.v1(h32.s, l52VarU.h(this.h));
                                    if (y(new gs1(is1Var, Double.NaN, l52VarU)) && z()) {
                                        do {
                                            C();
                                            if (j()) {
                                                break;
                                            }
                                        } while (A());
                                    }
                                    gy1VarU.Z(gy1VarU2);
                                    if (!this.e.c()) {
                                        this.e = is1Var;
                                        l52Var.Z(l52VarU);
                                        D(gy1VarP);
                                    }
                                }
                            } else if (o10Var.h() > 0) {
                                ya2 ya2Var = o10Var.a;
                                gy1 gy1Var2 = (gy1) ya2Var.o1(ya2Var.i);
                                if (((Double) gy1Var2.e1(d23Var).W(3)).doubleValue() <= ((Double) gy1Var2.W(3)).doubleValue() * dSqrt) {
                                    if (o10Var.i() > 0) {
                                        ya2 ya2Var2 = o10Var.b;
                                        gy1Var = (gy1) ya2Var2.o1(ya2Var2.i);
                                        if (((Double) gy1Var.e1(d23Var).W(4)).doubleValue() > dSqrt * ((Double) gy1Var.W(3)).doubleValue()) {
                                            dDoubleValue = l52Var.W(3).doubleValue();
                                            if (!n.B(Math.max(((Double) w().W(3)).doubleValue(), ((Double) x().e1(l52Var).W(3)).doubleValue()), this.h * dDoubleValue)) {
                                                gy1 gy1VarU3 = o10Var.f.u();
                                                is1Var = this.e;
                                                l52VarU = l52Var.U();
                                                gy1 gy1VarU4 = gy1VarU3.U();
                                                gy1VarP = p();
                                                gy1VarU3.v1(h32.s, l52VarU.h(this.h));
                                                if (y(new gs1(is1Var, Double.NaN, l52VarU))) {
                                                    do {
                                                        C();
                                                        if (j()) {
                                                            break;
                                                            break;
                                                        }
                                                    } while (A());
                                                }
                                                gy1VarU3.Z(gy1VarU4);
                                                if (!this.e.c()) {
                                                    this.e = is1Var;
                                                    l52Var.Z(l52VarU);
                                                    D(gy1VarP);
                                                }
                                            }
                                        }
                                    }
                                    this.e = is1Var3;
                                } else {
                                    dDoubleValue = l52Var.W(3).doubleValue();
                                    if (!n.B(Math.max(((Double) w().W(3)).doubleValue(), ((Double) x().e1(l52Var).W(3)).doubleValue()), this.h * dDoubleValue)) {
                                        gy1 gy1VarU5 = o10Var.f.u();
                                        is1Var = this.e;
                                        l52VarU = l52Var.U();
                                        gy1 gy1VarU6 = gy1VarU5.U();
                                        gy1VarP = p();
                                        gy1VarU5.v1(h32.s, l52VarU.h(this.h));
                                        if (y(new gs1(is1Var, Double.NaN, l52VarU))) {
                                            do {
                                                C();
                                                if (j()) {
                                                    break;
                                                    break;
                                                }
                                            } while (A());
                                        }
                                        gy1VarU5.Z(gy1VarU6);
                                        if (!this.e.c()) {
                                            this.e = is1Var;
                                            l52Var.Z(l52VarU);
                                            D(gy1VarP);
                                        }
                                    }
                                }
                            } else {
                                if (o10Var.i() > 0) {
                                    ya2 ya2Var3 = o10Var.b;
                                    gy1Var = (gy1) ya2Var3.o1(ya2Var3.i);
                                    if (((Double) gy1Var.e1(d23Var).W(4)).doubleValue() > dSqrt * ((Double) gy1Var.W(3)).doubleValue()) {
                                        dDoubleValue = l52Var.W(3).doubleValue();
                                        if (!n.B(Math.max(((Double) w().W(3)).doubleValue(), ((Double) x().e1(l52Var).W(3)).doubleValue()), this.h * dDoubleValue)) {
                                            gy1 gy1VarU7 = o10Var.f.u();
                                            is1Var = this.e;
                                            l52VarU = l52Var.U();
                                            gy1 gy1VarU8 = gy1VarU7.U();
                                            gy1VarP = p();
                                            gy1VarU7.v1(h32.s, l52VarU.h(this.h));
                                            if (y(new gs1(is1Var, Double.NaN, l52VarU))) {
                                                do {
                                                    C();
                                                    if (j()) {
                                                        break;
                                                        break;
                                                    }
                                                } while (A());
                                            }
                                            gy1VarU7.Z(gy1VarU8);
                                            if (!this.e.c()) {
                                                this.e = is1Var;
                                                l52Var.Z(l52VarU);
                                                D(gy1VarP);
                                            }
                                        }
                                    }
                                }
                                this.e = is1Var3;
                            }
                        } else {
                            dDoubleValue = l52Var.W(3).doubleValue();
                            if (!n.B(Math.max(((Double) w().W(3)).doubleValue(), ((Double) x().e1(l52Var).W(3)).doubleValue()), this.h * dDoubleValue)) {
                                gy1 gy1VarU9 = o10Var.f.u();
                                is1Var = this.e;
                                l52VarU = l52Var.U();
                                gy1 gy1VarU10 = gy1VarU9.U();
                                gy1VarP = p();
                                gy1VarU9.v1(h32.s, l52VarU.h(this.h));
                                if (y(new gs1(is1Var, Double.NaN, l52VarU))) {
                                    do {
                                        C();
                                        if (j()) {
                                            break;
                                            break;
                                        }
                                    } while (A());
                                }
                                gy1VarU9.Z(gy1VarU10);
                                if (!this.e.c()) {
                                    this.e = is1Var;
                                    l52Var.Z(l52VarU);
                                    D(gy1VarP);
                                }
                            }
                        }
                    } else {
                        dDoubleValue = l52Var.W(3).doubleValue();
                        if (!n.B(Math.max(((Double) w().W(3)).doubleValue(), ((Double) x().e1(l52Var).W(3)).doubleValue()), this.h * dDoubleValue)) {
                            gy1 gy1VarU11 = o10Var.f.u();
                            is1Var = this.e;
                            l52VarU = l52Var.U();
                            gy1 gy1VarU12 = gy1VarU11.U();
                            gy1VarP = p();
                            gy1VarU11.v1(h32.s, l52VarU.h(this.h));
                            if (y(new gs1(is1Var, Double.NaN, l52VarU))) {
                                do {
                                    C();
                                    if (j()) {
                                        break;
                                        break;
                                    }
                                } while (A());
                            }
                            gy1VarU11.Z(gy1VarU12);
                            if (!this.e.c()) {
                                this.e = is1Var;
                                l52Var.Z(l52VarU);
                                D(gy1VarP);
                            }
                        }
                    }
                }
            }
        }
        return n();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public gs1 n() {
        l52 l52VarR = r();
        gy1 gy1VarX = x();
        l52 l52Var = this.j;
        gs1 gs1Var = new gs1(this.e, (((l52Var.S(gy1VarX.e1(l52Var)) - (l52Var.S(l52Var) * this.h)) / h32.c) - l52Var.S(w())) / this.i.e.j, l52VarR);
        if (r10.m(this.e)) {
            gs1Var.k = new k5(this, (byte) 3);
        }
        return gs1Var;
    }

    public double[] o() {
        int iJ = this.i.j();
        double[] dArr = new double[iJ];
        gy1 gy1VarX = x();
        l52 l52Var = this.j;
        re1 re1VarE1 = gy1VarX.e1(l52Var);
        gy1 gy1VarW = w();
        for (int i = 0; i < iJ; i++) {
            dArr[i] = (re1VarE1.A(i) - (this.h * l52Var.j[i])) - gy1VarW.A(i);
        }
        return dArr;
    }

    public gy1 p() {
        return null;
    }

    public final double[] q() {
        double[] dArrO = o();
        double d = this.i.e.j;
        if (d != h32.b) {
            for (int i = 0; i < dArrO.length; i++) {
                dArrO[i] = dArrO[i] / d;
            }
        }
        return dArrO;
    }

    public l52 r() {
        return this.j.U();
    }

    public e1 s() {
        return x();
    }

    public e1 t() {
        return w();
    }

    public final String toString() {
        return this.i.toString();
    }

    public final cm2 u(int i) {
        return this.i.a.a0(i);
    }

    public final cm2 v(int i) {
        return this.i.b.a0(i);
    }

    public final gy1 w() {
        return this.i.f.u();
    }

    public final gy1 x() {
        return this.i.f.y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean y(gs1 gs1Var) {
        gy1 gy1VarX = x();
        this.e = is1.VALID;
        ds1 ds1Var = this.a;
        ds1Var.getClass();
        me1 me1Var = this.l;
        if (!((x) me1Var).h) {
            this.h = h32.a;
            this.m = false;
            if (!me1Var.l1(gy1VarX)) {
                double dDoubleValue = ((Double) gy1VarX.W(3)).doubleValue();
                double d = ds1Var.j.d;
                if (dDoubleValue > d) {
                    double d2 = d * dDoubleValue;
                    this.h = d2;
                    f32 f32Var = h32.s;
                    f32Var.getClass();
                    gy1VarX.t1(new sm(f32Var, d2));
                    me1Var.l1(gy1VarX);
                    return true;
                }
                this.m = true;
            }
        }
        return true;
    }

    public boolean z() {
        return true;
    }

    public void D(gy1 gy1Var) {
    }
}
