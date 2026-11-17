package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class th0 implements m73 {
    public final m73 a;
    public final m73 b;

    public th0(m73 m73Var, m73 m73Var2) {
        this.a = m73Var;
        this.b = m73Var2;
    }

    @Override // defpackage.m73
    public final int a(e90 e90Var) {
        int iA = this.a.a(e90Var) - this.b.a(e90Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.m73
    public final int b(e90 e90Var) {
        int iB = this.a.b(e90Var) - this.b.b(e90Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.m73
    public final int c(e90 e90Var, u31 u31Var) {
        int iC = this.a.c(e90Var, u31Var) - this.b.c(e90Var, u31Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.m73
    public final int d(e90 e90Var, u31 u31Var) {
        int iD = this.a.d(e90Var, u31Var) - this.b.d(e90Var, u31Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th0)) {
            return false;
        }
        th0 th0Var = (th0) obj;
        return uz0.g(th0Var.a, this.a) && uz0.g(th0Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}
