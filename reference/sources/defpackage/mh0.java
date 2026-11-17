package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mh0 implements Comparable, a1, yj1 {
    public final int h;
    public final zk i;
    public double j;
    public double k;

    public mh0(zk zkVar, int i, double d) {
        this.j = h32.a;
        this.i = zkVar;
        this.k = d;
        this.h = i;
        this.j = zkVar.A(i);
    }

    @Override // defpackage.a1
    public final double A(int i) {
        return this.i.A(i);
    }

    @Override // defpackage.a1
    public final Comparable G(long j) {
        return Double.valueOf(this.i.z(j));
    }

    @Override // defpackage.a1
    public final double S(a1 a1Var) {
        return this.i.S(a1Var);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.h, ((mh0) obj).h);
    }

    @Override // defpackage.mo2
    public final long count() {
        return this.i.count();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof mh0) && this.h == ((mh0) obj).h;
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        zk zkVar = this.i;
        zkVar.f(i, d);
        if (i == this.h) {
            this.j = zkVar.A(i);
        }
    }

    @Override // defpackage.yj1
    public final void g(long j, Comparable comparable) {
        F(j, xo1.c1(comparable));
    }

    public final int hashCode() {
        return 31 + this.h;
    }

    @Override // defpackage.yj1
    public final void n(long j, c23 c23Var) {
        zk zkVar = this.i;
        double dA = c23Var.a(zkVar.z(j));
        zkVar.y(j, dA);
        if (j == this.h) {
            this.j = dA;
        }
    }

    @Override // defpackage.mo2
    public final int size() {
        return this.i.size();
    }

    public final String toString() {
        return this.h + ": " + this.i.toString() + " = " + this.k;
    }

    public final void y(long j, double d) {
        this.i.y(j, d);
        if (j == this.h) {
            this.j = d;
        }
    }
}
