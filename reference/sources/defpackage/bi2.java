package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bi2 implements we0 {
    public final int a;
    public final int b;

    public bi2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.we0
    public final void a(xe0 xe0Var) {
        int iN = cy1.n(this.a, 0, xe0Var.a.c());
        int iN2 = cy1.n(this.b, 0, xe0Var.a.c());
        if (iN < iN2) {
            xe0Var.f(iN, iN2);
        } else {
            xe0Var.f(iN2, iN);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi2)) {
            return false;
        }
        bi2 bi2Var = (bi2) obj;
        return this.a == bi2Var.a && this.b == bi2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return wi0.g("SetSelectionCommand(start=", this.a, ", end=", this.b, ")");
    }
}
