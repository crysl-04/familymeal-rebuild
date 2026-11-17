package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x41 implements yo2 {
    public final ti1 a;
    public final /* synthetic */ z41 b;
    public final /* synthetic */ Object c;

    public x41(z41 z41Var, Object obj) {
        this.b = z41Var;
        this.c = obj;
        int[] iArr = uy0.a;
        this.a = new ti1();
    }

    @Override // defpackage.yo2
    public final void a() {
        this.b.g(this.c);
    }

    @Override // defpackage.yo2
    public final void b(f6 f6Var) {
        ln1 ln1Var;
        l41 l41Var = (l41) this.b.q.g(this.c);
        qg1 qg1Var = (l41Var == null || (ln1Var = l41Var.L) == null) ? null : ln1Var.f;
        if (qg1Var == null || !qg1Var.u) {
            return;
        }
        y02.C(qg1Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", f6Var);
    }

    @Override // defpackage.yo2
    public final long c(int i) {
        l41 l41Var = (l41) this.b.q.g(this.c);
        if (l41Var == null || !l41Var.I()) {
            return 0L;
        }
        int i2 = ((uj1) ((dj1) l41Var.n()).i).j;
        if (i < 0 || i >= i2) {
            ax0.d("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (!this.a.b(i)) {
            return 0L;
        }
        return (((long) ((l41) ((dj1) l41Var.n()).get(i)).M.p.h) << 32) | (((long) ((l41) ((dj1) l41Var.n()).get(i)).M.p.i) & 4294967295L);
    }

    @Override // defpackage.yo2
    public final int d() {
        l41 l41Var = (l41) this.b.q.g(this.c);
        if (l41Var != null) {
            return ((uj1) ((dj1) l41Var.n()).i).j;
        }
        return 0;
    }

    @Override // defpackage.yo2
    public final void e(int i, long j) {
        z41 z41Var = this.b;
        l41 l41Var = (l41) z41Var.q.g(this.c);
        if (l41Var == null || !l41Var.I()) {
            return;
        }
        int i2 = ((uj1) ((dj1) l41Var.n()).i).j;
        if (i < 0 || i >= i2) {
            ax0.d("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (l41Var.J()) {
            ax0.a("Pre-measure called on node that is not placed");
        }
        l41 l41Var2 = z41Var.h;
        l41Var2.w = true;
        o41.a(l41Var).t((l41) ((dj1) l41Var.n()).get(i), j);
        l41Var2.w = false;
        this.a.a(i);
    }
}
