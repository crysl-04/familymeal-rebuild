package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qt0 implements a41 {
    public final bv2 h;
    public final int i;
    public final hz2 j;
    public final kp0 k;

    public qt0(bv2 bv2Var, int i, hz2 hz2Var, kp0 kp0Var) {
        this.h = bv2Var;
        this.i = i;
        this.j = hz2Var;
        this.k = kp0Var;
    }

    @Override // defpackage.a41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        long j2;
        if (ue1Var.a0(k00.h(j)) < k00.i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = k00.b(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        ny1 ny1VarE = ue1Var.e(j);
        int iMin = Math.min(ny1VarE.h, k00.i(j2));
        return bf1Var.g0(iMin, ny1VarE.i, bg0.h, new m90((byte) 1, iMin, this, bf1Var, ny1VarE));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qt0) {
            qt0 qt0Var = (qt0) obj;
            if (this.h == qt0Var.h && this.i == qt0Var.i && this.j.equals(qt0Var.j) && uz0.g(this.k, qt0Var.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + jp1.b(this.i, this.h.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.h + ", cursorOffset=" + this.i + ", transformedText=" + this.j + ", textLayoutResultProvider=" + this.k + ")";
    }
}
