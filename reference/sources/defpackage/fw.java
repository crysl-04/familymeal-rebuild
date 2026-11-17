package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fw implements we0 {
    public final od a;
    public final int b;

    public fw(String str, int i) {
        this(new od(str), i);
    }

    @Override // defpackage.we0
    public final void a(xe0 xe0Var) {
        int i = xe0Var.d;
        od odVar = this.a;
        if (i != -1) {
            xe0Var.d(odVar.i, i, xe0Var.e);
        } else {
            xe0Var.d(odVar.i, xe0Var.b, xe0Var.c);
        }
        int i2 = xe0Var.b;
        int i3 = xe0Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int i6 = i4 + i5;
        int iN = cy1.n(i5 > 0 ? i6 - 1 : i6 - odVar.i.length(), 0, xe0Var.a.c());
        xe0Var.f(iN, iN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw)) {
            return false;
        }
        fw fwVar = (fw) obj;
        return uz0.g(this.a.i, fwVar.a.i) && this.b == fwVar.b;
    }

    public final int hashCode() {
        return (this.a.i.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + this.a.i + "', newCursorPosition=" + this.b + ")";
    }

    public fw(od odVar, int i) {
        this.a = odVar;
        this.b = i;
    }
}
