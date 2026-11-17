package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hv2 implements zt2 {
    public final /* synthetic */ kv2 a;
    public final /* synthetic */ boolean b;

    public hv2(kv2 kv2Var, boolean z) {
        this.a = kv2Var;
        this.b = z;
    }

    @Override // defpackage.zt2
    public final void a() {
        kv2 kv2Var = this.a;
        kv2Var.q(null);
        kv2Var.p(null);
        kv2Var.u(true);
    }

    @Override // defpackage.zt2
    public final void b() {
        kv2 kv2Var = this.a;
        kv2Var.q(null);
        kv2Var.p(null);
        kv2Var.u(true);
    }

    @Override // defpackage.zt2
    public final void d() {
        kw2 kw2VarD;
        boolean z = this.b;
        os0 os0Var = z ? os0.i : os0.j;
        kv2 kv2Var = this.a;
        kv2Var.q(os0Var);
        long jA = mg2.a(kv2Var.j(z));
        p81 p81Var = kv2Var.d;
        if (p81Var == null || (kw2VarD = p81Var.d()) == null) {
            return;
        }
        long jE = kw2VarD.e(jA);
        kv2Var.n = jE;
        kv2Var.p(new up1(jE));
        kv2Var.p = 0L;
        kv2Var.s = -1;
        p81 p81Var2 = kv2Var.d;
        if (p81Var2 != null) {
            p81Var2.q.setValue(Boolean.TRUE);
        }
        kv2Var.u(false);
    }

    @Override // defpackage.zt2
    public final void e(long j) {
        kv2 kv2Var = this.a;
        long jE = up1.e(kv2Var.p, j);
        kv2Var.p = jE;
        kv2Var.p(new up1(up1.e(kv2Var.n, jE)));
        vv2 vv2VarL = kv2Var.l();
        up1 up1VarG = kv2Var.g();
        up1VarG.getClass();
        kv2Var.v(vv2VarL, up1VarG.a, false, this.b, vz1.r, true, new xs0(9));
        kv2Var.u(false);
    }

    @Override // defpackage.zt2
    public final void onCancel() {
    }

    @Override // defpackage.zt2
    public final void c(long j, li1 li1Var) {
    }
}
