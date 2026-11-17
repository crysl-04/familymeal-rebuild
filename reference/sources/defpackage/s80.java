package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s80 implements we0 {
    public final int a;
    public final int b;

    public s80(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        bx0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.we0
    public final void a(xe0 xe0Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = i + 1;
            int i4 = xe0Var.b;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(xe0Var.b((i4 - i3) + (-1))) && Character.isLowSurrogate(xe0Var.b(xe0Var.b - i3))) ? i + 2 : i3;
        }
        int iC = 0;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = iC + 1;
            int i7 = xe0Var.c;
            rf rfVar = xe0Var.a;
            if (i7 + i6 >= rfVar.c()) {
                iC = rfVar.c() - xe0Var.c;
                break;
            }
            iC = (Character.isHighSurrogate(xe0Var.b((xe0Var.c + i6) + (-1))) && Character.isLowSurrogate(xe0Var.b(xe0Var.c + i6))) ? iC + 2 : i6;
        }
        int i8 = xe0Var.c;
        xe0Var.a(i8, iC + i8);
        int i9 = xe0Var.b;
        xe0Var.a(i9 - i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s80)) {
            return false;
        }
        s80 s80Var = (s80) obj;
        return this.a == s80Var.a && this.b == s80Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return wi0.g("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", this.a, ", lengthAfterCursor=", this.b, ")");
    }
}
