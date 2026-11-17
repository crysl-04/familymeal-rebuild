package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pb implements m73 {
    public final short a;
    public final String b;
    public final lu1 c = rz1.x(ox0.e);
    public final lu1 d = rz1.x(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public pb(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.m73
    public final int a(e90 e90Var) {
        return e().d;
    }

    @Override // defpackage.m73
    public final int b(e90 e90Var) {
        return e().b;
    }

    @Override // defpackage.m73
    public final int c(e90 e90Var, u31 u31Var) {
        return e().c;
    }

    @Override // defpackage.m73
    public final int d(e90 e90Var, u31 u31Var) {
        return e().a;
    }

    public final ox0 e() {
        return (ox0) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pb) {
            return this.a == ((pb) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(q83 q83Var, int i) {
        short s = this.a;
        if (i == 0 || (i & s) != 0) {
            this.c.setValue(q83Var.a.h(s));
            f(q83Var.a.t(s));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + "(" + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ")";
    }
}
