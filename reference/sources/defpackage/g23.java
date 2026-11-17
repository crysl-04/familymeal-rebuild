package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g23 extends ld2 {
    public final ThreadLocal l;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public g23(m10 m10Var, o20 o20Var) {
        vq vqVar = vq.k;
        super(m10Var, o20Var.m(vqVar) == null ? o20Var.i(vqVar) : o20Var);
        this.l = new ThreadLocal();
        if (m10Var.e().m(c5.L) instanceof q20) {
            return;
        }
        Object objE = ie1.E(o20Var, null);
        ie1.v(o20Var, objE);
        k0(o20Var, objE);
    }

    public final boolean j0() {
        boolean z = this.threadLocalIsSet && this.l.get() == null;
        this.l.remove();
        return !z;
    }

    public final void k0(o20 o20Var, Object obj) {
        this.threadLocalIsSet = true;
        this.l.set(new wt1(o20Var, obj));
    }

    @Override // defpackage.ld2, defpackage.z01
    public final void z(Object obj) {
        if (this.threadLocalIsSet) {
            wt1 wt1Var = (wt1) this.l.get();
            if (wt1Var != null) {
                ie1.v((o20) wt1Var.h, wt1Var.i);
            }
            this.l.remove();
        }
        Object objY = ys.Y(obj);
        m10 m10Var = this.k;
        o20 o20VarE = m10Var.e();
        Object objE = ie1.E(o20VarE, null);
        g23 g23VarI = objE != ie1.u0 ? ou.I(m10Var, o20VarE, objE) : null;
        try {
            this.k.g(objY);
            if (g23VarI == null || g23VarI.j0()) {
            }
        } finally {
            if (g23VarI == null || g23VarI.j0()) {
                ie1.v(o20VarE, objE);
            }
        }
    }
}
