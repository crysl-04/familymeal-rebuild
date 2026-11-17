package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q03 implements ee0 {
    public final int a;
    public final int b;
    public final ke0 c;

    public q03(int i, int i2, ke0 ke0Var) {
        this.a = i;
        this.b = i2;
        this.c = ke0Var;
    }

    @Override // defpackage.cd
    public final o33 a(s03 s03Var) {
        return new vp1(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q03) {
            q03 q03Var = (q03) obj;
            if (q03Var.a == this.a && q03Var.b == this.b && uz0.g(q03Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.ee0, defpackage.cd
    public final q33 a(s03 s03Var) {
        return new vp1(this.a, this.b, this.c);
    }
}
