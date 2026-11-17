package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class iv2 implements zt2 {
    public qw2 b;
    public final /* synthetic */ kv2 d;
    public boolean a = true;
    public li1 c = vz1.o;

    public iv2(kv2 kv2Var) {
        this.d = kv2Var;
    }

    @Override // defpackage.zt2
    public final void a() {
        f();
    }

    @Override // defpackage.zt2
    public final void c(long j, li1 li1Var) {
        long j2;
        kw2 kw2VarD;
        kw2 kw2VarD2;
        kv2 kv2Var = this.d;
        if (kv2Var.i() && ((os0) kv2Var.q.getValue()) == null) {
            kv2Var.q(os0.j);
            kv2Var.s = -1;
            this.a = true;
            this.c = li1Var;
            kv2Var.m();
            p81 p81Var = kv2Var.d;
            if (p81Var == null || (kw2VarD2 = p81Var.d()) == null || !kw2VarD2.c(j)) {
                j2 = j;
                p81 p81Var2 = kv2Var.d;
                if (p81Var2 != null && (kw2VarD = p81Var2.d()) != null) {
                    int iN = kv2Var.b.n(kw2VarD.b(j2, true));
                    vv2 vv2VarB = kv2.b(kv2Var.l().a, m02.a(iN, iN));
                    kv2Var.e(false);
                    ws0 ws0Var = kv2Var.j;
                    if (ws0Var != null) {
                        ((sz1) ws0Var).a(0);
                    }
                    kv2Var.c.h(vv2VarB);
                    kv2Var.v = new qw2(vv2VarB.b);
                }
                this.a = false;
            } else {
                if (kv2Var.l().a.i.length() == 0) {
                    return;
                }
                kv2Var.e(false);
                long jV = kv2Var.v(vv2.a(kv2Var.l(), null, qw2.b, 5), j, true, false, this.c, true, new xs0(0));
                j2 = j;
                kv2Var.o = new qw2(jV);
                this.b = new qw2(jV);
            }
            kv2Var.r(qs0.h);
            kv2Var.n = j2;
            kv2Var.p(new up1(j2));
            kv2Var.p = 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    @Override // defpackage.zt2
    public final void e(long j) {
        kw2 kw2VarD;
        qw2 qw2Var;
        int iB;
        long jV;
        kv2 kv2Var = this.d;
        if (!kv2Var.i() || kv2Var.l().a.i.length() == 0) {
            return;
        }
        kv2Var.p = up1.e(kv2Var.p, j);
        p81 p81Var = kv2Var.d;
        if (p81Var != null && (kw2VarD = p81Var.d()) != null) {
            kv2Var.p(new up1(up1.e(kv2Var.n, kv2Var.p)));
            if (kv2Var.o == null) {
                up1 up1VarG = kv2Var.g();
                up1VarG.getClass();
                if (kw2VarD.c(up1VarG.a)) {
                    qw2Var = kv2Var.o;
                    if (qw2Var != null) {
                        iB = (int) (qw2Var.a >> 32);
                    } else {
                        iB = kw2VarD.b(kv2Var.n, false);
                    }
                    up1 up1VarG2 = kv2Var.g();
                    up1VarG2.getClass();
                    int iB2 = kw2VarD.b(up1VarG2.a, false);
                    if (kv2Var.o != null && iB == iB2) {
                        return;
                    }
                    vv2 vv2VarL = kv2Var.l();
                    up1 up1VarG3 = kv2Var.g();
                    up1VarG3.getClass();
                    jV = kv2Var.v(vv2VarL, up1VarG3.a, false, false, this.c, true, new xs0(9));
                } else {
                    int iN = kv2Var.b.n(kw2VarD.b(kv2Var.n, true));
                    xp1 xp1Var = kv2Var.b;
                    up1 up1VarG4 = kv2Var.g();
                    up1VarG4.getClass();
                    li1 li1Var = iN == xp1Var.n(kw2VarD.b(up1VarG4.a, true)) ? vz1.o : vz1.p;
                    vv2 vv2VarL2 = kv2Var.l();
                    up1 up1VarG5 = kv2Var.g();
                    up1VarG5.getClass();
                    jV = kv2Var.v(vv2VarL2, up1VarG5.a, false, false, li1Var, true, new xs0(9));
                }
            } else {
                qw2Var = kv2Var.o;
                if (qw2Var != null) {
                    iB = (int) (qw2Var.a >> 32);
                } else {
                    iB = kw2VarD.b(kv2Var.n, false);
                }
                up1 up1VarG6 = kv2Var.g();
                up1VarG6.getClass();
                int iB3 = kw2VarD.b(up1VarG6.a, false);
                if (kv2Var.o != null) {
                }
                vv2 vv2VarL3 = kv2Var.l();
                up1 up1VarG7 = kv2Var.g();
                up1VarG7.getClass();
                jV = kv2Var.v(vv2VarL3, up1VarG7.a, false, false, this.c, true, new xs0(9));
            }
            this.b = new qw2(jV);
            if (!qw2.a(jV, kv2Var.o)) {
                this.a = false;
            }
        }
        kv2Var.u(false);
    }

    public final void f() {
        kv2 kv2Var = this.d;
        kv2Var.q(null);
        kv2Var.p(null);
        this.c = vz1.o;
        kv2Var.u(true);
        qw2 qw2Var = this.b;
        boolean zC = qw2.c(qw2Var != null ? qw2Var.a : kv2Var.l().b);
        kv2Var.r(zC ? qs0.j : qs0.i);
        p81 p81Var = kv2Var.d;
        if (p81Var != null) {
            p81Var.m.setValue(Boolean.valueOf(!zC && cy1.L(kv2Var, true)));
        }
        p81 p81Var2 = kv2Var.d;
        if (p81Var2 != null) {
            p81Var2.n.setValue(Boolean.valueOf(!zC && cy1.L(kv2Var, false)));
        }
        p81 p81Var3 = kv2Var.d;
        if (p81Var3 != null) {
            p81Var3.o.setValue(Boolean.valueOf(zC && cy1.L(kv2Var, true)));
        }
        if (this.a) {
            kv2Var.n(kv2Var.o);
        }
        kv2Var.o = null;
    }

    @Override // defpackage.zt2
    public final void onCancel() {
        f();
    }

    @Override // defpackage.zt2
    public final void b() {
    }

    @Override // defpackage.zt2
    public final void d() {
    }
}
