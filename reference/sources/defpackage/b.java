package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b extends gz {
    public final /* synthetic */ byte l;
    public final re1 m;
    public final int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(re1 re1Var, re1 re1Var2, byte b) {
        super(re1Var, re1Var2.h1() + re1Var.h1(), re1Var.B1());
        this.l = b;
        switch (b) {
            case 1:
                super(re1Var, re1Var.h1(), re1Var2.B1() + re1Var.B1());
                this.m = re1Var2;
                this.n = Math.toIntExact(re1Var.B1());
                if (re1Var.h1() == re1Var2.h1()) {
                    return;
                }
                wg.f();
                throw null;
            default:
                this.m = re1Var2;
                this.n = Math.toIntExact(re1Var.h1());
                if (re1Var.B1() == re1Var2.B1()) {
                    return;
                }
                wg.f();
                throw null;
        }
    }

    @Override // defpackage.re1, defpackage.k1
    public final double J(int i, int i2) {
        re1 re1Var;
        re1 re1Var2;
        switch (this.l) {
            case 0:
                int i3 = this.n;
                if (i >= i3) {
                    re1Var = this.m;
                    i -= i3;
                } else {
                    re1Var = this.k;
                }
                return re1Var.J(i, i2);
            default:
                int i4 = this.n;
                if (i2 >= i4) {
                    re1Var2 = this.m;
                    i2 -= i4;
                } else {
                    re1Var2 = this.k;
                }
                return re1Var2.J(i, i2);
        }
    }

    @Override // defpackage.w0, defpackage.no2
    public final int P(int i) {
        re1 re1Var;
        switch (this.l) {
            case 0:
                int iP = this.m.P(i);
                return iP == 0 ? this.k.P(i) : this.n + iP;
            default:
                int i2 = this.n;
                if (i < i2) {
                    re1Var = this.k;
                } else {
                    re1Var = this.m;
                    i -= i2;
                }
                return re1Var.P(i);
        }
    }

    @Override // defpackage.no2
    public final int P0(int i) {
        re1 re1Var;
        switch (this.l) {
            case 0:
                int iP0 = this.k.P0(i);
                int i2 = this.n;
                return iP0 >= i2 ? this.m.P0(i) + i2 : iP0;
            default:
                int i3 = this.n;
                if (i < i3) {
                    re1Var = this.k;
                } else {
                    re1Var = this.m;
                    i -= i3;
                }
                return re1Var.P0(i);
        }
    }

    @Override // defpackage.w0, defpackage.no2
    public final int V(int i) {
        re1 re1Var;
        switch (this.l) {
            case 0:
                int i2 = this.n;
                if (i < i2) {
                    re1Var = this.k;
                } else {
                    re1Var = this.m;
                    i -= i2;
                }
                return re1Var.V(i);
            default:
                int iV = this.m.V(i);
                return iV == 0 ? this.k.V(i) : this.n + iV;
        }
    }

    @Override // defpackage.re1
    public final cf0 W1(l52 l52Var) {
        switch (this.l) {
            case 0:
                return new pe1(l52Var, this);
            default:
                Future futureSubmit = d40.i.submit(new ec1(this, l52Var, (byte) 0));
                cf0 cf0VarW1 = this.m.W1(l52Var);
                re1 re1Var = this.k;
                try {
                    return new b((re1) ((cf0) futureSubmit.get()).o1(re1Var.C0()), (re1) cf0VarW1.o1(re1Var.C0()), (byte) 1);
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace(System.err);
                    return null;
                }
        }
    }

    @Override // defpackage.re1, defpackage.e1
    public final /* bridge */ /* synthetic */ void a(dk1 dk1Var) {
        switch (this.l) {
            case 0:
                a((gz2) dk1Var);
                break;
            default:
                a((gz2) dk1Var);
                break;
        }
    }

    @Override // defpackage.re1
    public final re1 e1(re1 re1Var) {
        switch (this.l) {
            case 0:
                Future futureSubmit = d40.i.submit(new ec1(this, re1Var, (byte) 1));
                try {
                    return new b((re1) futureSubmit.get(), this.m.e1(re1Var), (byte) 0);
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace(System.err);
                    return null;
                }
            default:
                return super.e1(re1Var);
        }
    }

    @Override // defpackage.re1, defpackage.ko1
    public final re1 h(final double d) {
        switch (this.l) {
            case 0:
                Future futureSubmit = d40.i.submit(new Callable() { // from class: fc1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.k.h(d);
                    }
                });
                try {
                    return new b((re1) futureSubmit.get(), this.m.h(d), (byte) 0);
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace(System.err);
                    return null;
                }
            default:
                Future futureSubmit2 = d40.i.submit(new Callable() { // from class: fc1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.k.h(d);
                    }
                });
                try {
                    return new b((re1) futureSubmit2.get(), this.m.h(d), (byte) 1);
                } catch (InterruptedException | ExecutionException e2) {
                    e2.printStackTrace(System.err);
                    return null;
                }
        }
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        re1 re1Var;
        re1 re1Var2;
        switch (this.l) {
            case 0:
                int i3 = this.n;
                if (i >= i3) {
                    re1Var = this.m;
                    i -= i3;
                } else {
                    re1Var = this.k;
                }
                return re1Var.h0(i, i2);
            default:
                int i4 = this.n;
                if (i2 >= i4) {
                    re1Var2 = this.m;
                    i2 -= i4;
                } else {
                    re1Var2 = this.k;
                }
                return re1Var2.h0(i, i2);
        }
    }

    @Override // defpackage.re1, defpackage.ko1
    public final re1 i(Comparable comparable) {
        switch (this.l) {
            case 0:
                Future futureSubmit = d40.i.submit(new ec1(this, comparable, (byte) 2));
                try {
                    return new b((re1) futureSubmit.get(), this.m.i(comparable), (byte) 0);
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace(System.err);
                    return null;
                }
            default:
                Future futureSubmit2 = d40.i.submit(new ec1(this, comparable, (byte) 2));
                try {
                    return new b((re1) futureSubmit2.get(), this.m.i(comparable), (byte) 1);
                } catch (InterruptedException | ExecutionException e2) {
                    e2.printStackTrace(System.err);
                    return null;
                }
        }
    }

    @Override // defpackage.re1
    /* JADX INFO: renamed from: m */
    public final void a(gz2 gz2Var) {
        byte b = this.l;
        re1 re1Var = this.m;
        int i = this.n;
        re1 re1Var2 = this.k;
        switch (b) {
            case 0:
                re1Var2.a(gz2Var.H0(i, this.h));
                re1Var.a(gz2Var.v0(i, 0));
                break;
            default:
                re1Var2.a(gz2Var.H0(this.j, i));
                re1Var.a(gz2Var.v0(0, i));
                break;
        }
    }

    @Override // defpackage.no2
    public final int n0(int i) {
        re1 re1Var;
        switch (this.l) {
            case 0:
                int i2 = this.n;
                if (i < i2) {
                    re1Var = this.k;
                } else {
                    re1Var = this.m;
                    i -= i2;
                }
                return re1Var.n0(i);
            default:
                int iN0 = this.k.n0(i);
                int i3 = this.n;
                return iN0 >= i3 ? this.m.n0(i) + i3 : iN0;
        }
    }

    @Override // defpackage.re1
    public final void r1(a1 a1Var, gz2 gz2Var) {
        switch (this.l) {
            case 0:
                int i = this.h;
                int i2 = this.n;
                Future<?> futureSubmit = d40.i.submit(new xa(this, (q22) a1Var, gz2Var.H0(i2, i), (byte) 2));
                this.m.r1(a1Var, gz2Var.v0(i2, 0));
                try {
                    futureSubmit.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace(System.err);
                    return;
                }
                break;
            default:
                gz2Var.K1(this, a1Var);
                break;
        }
    }
}
