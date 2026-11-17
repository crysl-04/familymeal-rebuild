package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wx0 implements pt1 {
    public final m73 a;
    public final ap2 b;

    public wx0(m73 m73Var, ap2 ap2Var) {
        this.a = m73Var;
        this.b = ap2Var;
    }

    @Override // defpackage.pt1
    public final float a(u31 u31Var) {
        m73 m73Var = this.a;
        ap2 ap2Var = this.b;
        return ap2Var.r0(m73Var.d(ap2Var, u31Var));
    }

    @Override // defpackage.pt1
    public final float b(u31 u31Var) {
        m73 m73Var = this.a;
        ap2 ap2Var = this.b;
        return ap2Var.r0(m73Var.c(ap2Var, u31Var));
    }

    @Override // defpackage.pt1
    public final float c() {
        m73 m73Var = this.a;
        ap2 ap2Var = this.b;
        return ap2Var.r0(m73Var.a(ap2Var));
    }

    @Override // defpackage.pt1
    public final float d() {
        m73 m73Var = this.a;
        ap2 ap2Var = this.b;
        return ap2Var.r0(m73Var.b(ap2Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx0)) {
            return false;
        }
        wx0 wx0Var = (wx0) obj;
        return uz0.g(this.a, wx0Var.a) && this.b.equals(wx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ")";
    }
}
