package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jj2 {
    public final hj2 a;
    public final ij2 b;

    public jj2(lj2 lj2Var) {
        this.a = new hj2(lj2Var.q);
        this.b = new ij2(lj2Var.r);
    }

    public final boolean a() {
        return this.a.d >= 0 && this.b.c >= 0;
    }

    public final boolean b() {
        int i;
        hj2 hj2Var = this.a;
        return hj2Var.d >= 0 && (i = hj2Var.b) != 3 && i == this.b.b;
    }

    public final void c() {
        ij2 ij2Var = this.b;
        ij2Var.c = -1;
        kj2 kj2Var = kj2.BASIS;
        ij2Var.d = kj2Var;
        ij2Var.b = 3;
        hj2 hj2Var = this.a;
        hj2Var.d = -1;
        hj2Var.c = kj2Var;
        hj2Var.b = 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj2)) {
            return false;
        }
        jj2 jj2Var = (jj2) obj;
        return this.a.equals(jj2Var.a) && this.b.equals(jj2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 31) * 31);
    }

    public final String toString() {
        boolean zA = a();
        hj2 hj2Var = this.a;
        ij2 ij2Var = this.b;
        if (zA) {
            return wi0.h(ij2Var.toString(), " -> ", hj2Var.toString());
        }
        return b() ? wi0.h(hj2Var.toString(), " -> ", String.valueOf(ij2Var.d)) : "-";
    }
}
