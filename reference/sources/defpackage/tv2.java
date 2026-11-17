package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tv2 extends qg1 implements pz, c41 {
    public final xw2 v;
    public a13 w;
    public rv2 x;

    public tv2(xw2 xw2Var) {
        this.v = xw2Var;
    }

    @Override // defpackage.qg1
    public final void B0() {
        xw2 xw2VarH = p02.H(this.v, cu.Y(this).F);
        sm0 sm0Var = (sm0) vs.z(this, uz.k);
        J0(xw2VarH, sm0Var);
        u31 u31Var = cu.Y(this).F;
        e90 e90Var = cu.Y(this).E;
        a13 a13Var = this.w;
        if (a13Var == null) {
            throw wi0.w("Font resolution state is not set.");
        }
        this.x = new rv2(u31Var, e90Var, sm0Var, xw2VarH, a13Var.h);
    }

    @Override // defpackage.qg1
    public final void C0() {
        this.w = null;
        this.x = null;
    }

    public final void J0(xw2 xw2Var, sm0 sm0Var) {
        yl2 yl2Var = xw2Var.a;
        ar2 ar2Var = yl2Var.f;
        qn0 qn0Var = yl2Var.c;
        if (qn0Var == null) {
            qn0Var = qn0.j;
        }
        on0 on0Var = yl2Var.d;
        int i = on0Var != null ? on0Var.a : 0;
        pn0 pn0Var = yl2Var.e;
        this.w = ((tm0) sm0Var).b(ar2Var, qn0Var, i, pn0Var != null ? pn0Var.a : 65535);
        vs.E(this);
    }

    @Override // defpackage.j80
    public final void a() {
        rv2 rv2Var = this.x;
        if (rv2Var != null) {
            rv2.a(rv2Var, null, cu.Y(this).E, null, 29);
        }
        vs.E(this);
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        rv2 rv2Var = this.x;
        if (rv2Var == null) {
            throw wi0.w("Min size state is not set.");
        }
        lu1 lu1Var = rv2Var.f;
        a13 a13Var = this.w;
        if (a13Var == null) {
            throw wi0.w("Font resolution state is not set.");
        }
        Object obj = a13Var.h;
        if (!uz0.g(obj, rv2Var.e)) {
            rv2Var.e = obj;
            lu1Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) lu1Var.getValue()).booleanValue()) {
            rv2Var.g = cu2.a(rv2Var.d, rv2Var.b, rv2Var.c);
            lu1Var.setValue(Boolean.FALSE);
        }
        long j2 = rv2Var.g;
        ny1 ny1VarE = ue1Var.e(l00.e(j, l00.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0.h, new m6(ny1VarE, (byte) 11));
    }

    @Override // defpackage.j80
    public final void t0() {
        rv2 rv2Var = this.x;
        if (rv2Var != null) {
            rv2.a(rv2Var, cu.Y(this).F, null, null, 30);
        }
        vs.E(this);
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
