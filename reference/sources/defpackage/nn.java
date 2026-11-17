package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nn extends qg1 implements c41, ug2 {
    public vp0 v;

    public nn(vp0 vp0Var) {
        this.v = vp0Var;
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        ny1 ny1VarE = ue1Var.e(j);
        return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0.h, new g(ny1VarE, this, (byte) 6));
    }

    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
        hi2 hi2Var;
        boolean z;
        pn1 pn1VarW = cu.W(this, 2);
        if (pn1VarW.U) {
            hi2Var = pn1VarW.Q;
            z = pn1VarW.T;
        } else {
            j92 j92Var = h7.L;
            if (j92Var == null) {
                h7.L = new j92();
            } else {
                j92Var.a();
            }
            j92 j92Var2 = h7.L;
            j92Var2.getClass();
            j92Var2.A = pn1VarW.B.E;
            j92Var2.y = ou.G(pn1VarW.j);
            uk2 uk2VarN = y02.n();
            vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
            uk2 uk2VarQ = y02.q(uk2VarN);
            try {
                this.v.h(j92Var2);
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                hi2Var = j92Var2.v;
                z = j92Var2.w;
            } catch (Throwable th) {
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                throw th;
            }
        }
        if (z) {
            bh2.l(dh2Var, hi2Var);
        }
    }

    @Override // defpackage.ug2
    public final boolean j() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.v + ")";
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
