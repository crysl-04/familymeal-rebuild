package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ta0 extends va0 implements z20, m10 {
    public static final /* synthetic */ long o = hi.a.objectFieldOffset(ta0.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final q20 k;
    public final n10 l;
    public Object m;
    public final Object n;

    public ta0(q20 q20Var, n10 n10Var) {
        super(-1);
        this.k = q20Var;
        this.l = n10Var;
        this.m = tz0.Q;
        this.n = ie1.B(n10Var.e());
    }

    @Override // defpackage.z20
    public final z20 d() {
        return this.l;
    }

    @Override // defpackage.m10
    public final o20 e() {
        return this.l.e();
    }

    @Override // defpackage.m10
    public final void g(Object obj) {
        Throwable thA = e92.a(obj);
        Object mwVar = thA == null ? obj : new mw(thA, false);
        n10 n10Var = this.l;
        o20 o20VarE = n10Var.e();
        q20 q20Var = this.k;
        if (q20Var.f(o20VarE)) {
            this.m = mwVar;
            this.j = 0;
            q20Var.e(n10Var.e(), this);
            return;
        }
        nh0 nh0VarA = fx2.a();
        if (nh0VarA.j >= 4294967296L) {
            this.m = mwVar;
            this.j = 0;
            nh0VarA.k(this);
            return;
        }
        nh0VarA.l(true);
        try {
            o20 o20VarE2 = n10Var.e();
            Object objE = ie1.E(o20VarE2, this.n);
            try {
                n10Var.g(obj);
                ie1.v(o20VarE2, objE);
                while (nh0VarA.s()) {
                }
            } catch (Throwable th) {
                ie1.v(o20VarE2, objE);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                i(th2);
            } finally {
                nh0VarA.j(true);
            }
        }
    }

    @Override // defpackage.va0
    public final Object m() {
        Object obj = this.m;
        this.m = tz0.Q;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.k + ", " + s60.K(this.l) + ']';
    }

    @Override // defpackage.va0
    public final m10 c() {
        return this;
    }
}
