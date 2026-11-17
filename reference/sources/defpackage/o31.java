package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o31 implements h82, r20 {
    public final o20 h;
    public final zp0 i;
    public final k10 j;
    public dn2 k;

    public o31(o20 o20Var, zp0 zp0Var) {
        this.h = o20Var;
        this.i = zp0Var;
        this.j = vs.b(o20Var.i(this));
    }

    @Override // defpackage.h82
    public final void c() {
        dn2 dn2Var = this.k;
        if (dn2Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            dn2Var.a(cancellationException);
        }
        this.k = ie1.p(this.j, null, this.i, 3);
    }

    @Override // defpackage.h82
    public final void d() {
        dn2 dn2Var = this.k;
        if (dn2Var != null) {
            dn2Var.C(new wn0((byte) 1));
        }
        this.k = null;
    }

    @Override // defpackage.h82
    public final void e() {
        dn2 dn2Var = this.k;
        if (dn2Var != null) {
            dn2Var.C(new wn0((byte) 1));
        }
        this.k = null;
    }

    @Override // defpackage.m20
    public final n20 getKey() {
        return c5.M;
    }

    @Override // defpackage.o20
    public final o20 i(o20 o20Var) {
        return cu.Q(this, o20Var);
    }

    @Override // defpackage.o20
    public final m20 m(n20 n20Var) {
        return cu.F(this, n20Var);
    }

    @Override // defpackage.r20
    public final void n(o20 o20Var, Throwable th) throws Throwable {
        mz mzVar = (mz) o20Var.m(mz.i);
        if (mzVar != null) {
            ou.H(th, new h6(mzVar, this, (byte) 11));
        }
        r20 r20Var = (r20) this.h.m(c5.M);
        if (r20Var == null) {
            throw th;
        }
        r20Var.n(o20Var, th);
    }

    @Override // defpackage.o20
    public final Object p(zp0 zp0Var, Object obj) {
        return zp0Var.f(obj, this);
    }

    @Override // defpackage.o20
    public final o20 t(n20 n20Var) {
        return cu.M(this, n20Var);
    }
}
