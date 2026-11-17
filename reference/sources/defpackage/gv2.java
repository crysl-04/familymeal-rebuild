package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gv2 implements zt2 {
    public final /* synthetic */ kv2 a;

    public gv2(kv2 kv2Var) {
        this.a = kv2Var;
    }

    @Override // defpackage.zt2
    public final void a() {
        kv2 kv2Var = this.a;
        kv2Var.q(null);
        kv2Var.p(null);
    }

    @Override // defpackage.zt2
    public final void b() {
        kv2 kv2Var = this.a;
        kv2Var.q(null);
        kv2Var.p(null);
    }

    @Override // defpackage.zt2
    public final void c(long j, li1 li1Var) {
        kw2 kw2VarD;
        kv2 kv2Var = this.a;
        long jA = mg2.a(kv2Var.j(true));
        p81 p81Var = kv2Var.d;
        if (p81Var == null || (kw2VarD = p81Var.d()) == null) {
            return;
        }
        long jE = kw2VarD.e(jA);
        kv2Var.n = jE;
        kv2Var.p(new up1(jE));
        kv2Var.p = 0L;
        kv2Var.q(os0.h);
        kv2Var.u(false);
    }

    @Override // defpackage.zt2
    public final void e(long j) {
        kw2 kw2VarD;
        ws0 ws0Var;
        kv2 kv2Var = this.a;
        kv2Var.p = up1.e(kv2Var.p, j);
        p81 p81Var = kv2Var.d;
        if (p81Var == null || (kw2VarD = p81Var.d()) == null) {
            return;
        }
        kv2Var.p(new up1(up1.e(kv2Var.n, kv2Var.p)));
        xp1 xp1Var = kv2Var.b;
        up1 up1VarG = kv2Var.g();
        up1VarG.getClass();
        int iN = xp1Var.n(kw2VarD.b(up1VarG.a, true));
        long jA = m02.a(iN, iN);
        if (qw2.b(jA, kv2Var.l().b)) {
            return;
        }
        p81 p81Var2 = kv2Var.d;
        if ((p81Var2 == null || ((Boolean) p81Var2.q.getValue()).booleanValue()) && (ws0Var = kv2Var.j) != null) {
            ((sz1) ws0Var).a(9);
        }
        kv2Var.c.h(kv2.b(kv2Var.l().a, jA));
        kv2Var.v = new qw2(jA);
    }

    @Override // defpackage.zt2
    public final void d() {
    }

    @Override // defpackage.zt2
    public final void onCancel() {
    }
}
