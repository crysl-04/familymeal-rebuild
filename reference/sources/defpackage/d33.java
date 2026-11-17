package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d33 implements m73 {
    public final String a;
    public final lu1 b;

    public d33(xx0 xx0Var, String str) {
        this.a = str;
        this.b = rz1.x(xx0Var);
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

    public final xx0 e() {
        return (xx0) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d33) {
            return uz0.g(e(), ((d33) obj).e());
        }
        return false;
    }

    public final void f(xx0 xx0Var) {
        this.b.setValue(xx0Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ")";
    }
}
