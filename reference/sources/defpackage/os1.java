package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class os1 extends ou {
    public final na2 g;
    public final l9 h;

    public os1(na2 na2Var) {
        l9 l9VarA;
        this.g = na2Var;
        if (h12.o(na2Var)) {
            l9VarA = null;
        } else {
            l9VarA = n9.a();
            l9.b(l9VarA, na2Var);
        }
        this.h = l9VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof os1) {
            return this.g.equals(((os1) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.ou
    public final r72 x() {
        na2 na2Var = this.g;
        return new r72(na2Var.a, na2Var.b, na2Var.c, na2Var.d);
    }
}
