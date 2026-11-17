package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i23 implements m73 {
    public final m73 a;
    public final m73 b;

    public i23(m73 m73Var, m73 m73Var2) {
        this.a = m73Var;
        this.b = m73Var2;
    }

    @Override // defpackage.m73
    public final int a(e90 e90Var) {
        return Math.max(this.a.a(e90Var), this.b.a(e90Var));
    }

    @Override // defpackage.m73
    public final int b(e90 e90Var) {
        return Math.max(this.a.b(e90Var), this.b.b(e90Var));
    }

    @Override // defpackage.m73
    public final int c(e90 e90Var, u31 u31Var) {
        return Math.max(this.a.c(e90Var, u31Var), this.b.c(e90Var, u31Var));
    }

    @Override // defpackage.m73
    public final int d(e90 e90Var, u31 u31Var) {
        return Math.max(this.a.d(e90Var, u31Var), this.b.d(e90Var, u31Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i23)) {
            return false;
        }
        i23 i23Var = (i23) obj;
        return uz0.g(i23Var.a, this.a) && uz0.g(i23Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
