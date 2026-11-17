package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ai2 implements we0 {
    public final od a;
    public final int b;

    public ai2(String str, int i) {
        this.a = new od(str);
        this.b = i;
    }

    @Override // defpackage.we0
    public final void a(xe0 xe0Var) {
        String str = this.a.i;
        int i = xe0Var.d;
        if (i != -1) {
            xe0Var.d(str, i, xe0Var.e);
            if (str.length() > 0) {
                xe0Var.e(i, str.length() + i);
            }
        } else {
            int i2 = xe0Var.b;
            xe0Var.d(str, i2, xe0Var.c);
            if (str.length() > 0) {
                xe0Var.e(i2, str.length() + i2);
            }
        }
        int i3 = xe0Var.b;
        int i4 = xe0Var.c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.b;
        int i7 = i5 + i6;
        int iN = cy1.n(i6 > 0 ? i7 - 1 : i7 - str.length(), 0, xe0Var.a.c());
        xe0Var.f(iN, iN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai2)) {
            return false;
        }
        ai2 ai2Var = (ai2) obj;
        return uz0.g(this.a.i, ai2Var.a.i) && this.b == ai2Var.b;
    }

    public final int hashCode() {
        return (this.a.i.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + this.a.i + "', newCursorPosition=" + this.b + ")";
    }
}
