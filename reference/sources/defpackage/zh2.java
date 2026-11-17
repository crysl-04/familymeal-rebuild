package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zh2 implements we0 {
    public final int a;
    public final int b;

    public zh2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.we0
    public final void a(xe0 xe0Var) {
        boolean z = xe0Var.d != -1;
        rf rfVar = xe0Var.a;
        if (z) {
            xe0Var.d = -1;
            xe0Var.e = -1;
        }
        int iN = cy1.n(this.a, 0, rfVar.c());
        int iN2 = cy1.n(this.b, 0, rfVar.c());
        if (iN != iN2) {
            if (iN < iN2) {
                xe0Var.e(iN, iN2);
            } else {
                xe0Var.e(iN2, iN);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh2)) {
            return false;
        }
        zh2 zh2Var = (zh2) obj;
        return this.a == zh2Var.a && this.b == zh2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return wi0.g("SetComposingRegionCommand(start=", this.a, ", end=", this.b, ")");
    }
}
