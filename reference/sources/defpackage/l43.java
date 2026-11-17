package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l43 implements a41 {
    public final bv2 h;
    public final int i;
    public final hz2 j;
    public final kp0 k;

    public l43(bv2 bv2Var, int i, hz2 hz2Var, kp0 kp0Var) {
        this.h = bv2Var;
        this.i = i;
        this.j = hz2Var;
        this.k = kp0Var;
    }

    @Override // defpackage.a41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        ny1 ny1VarE = ue1Var.e(k00.b(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(ny1VarE.i, k00.h(j));
        return bf1Var.g0(ny1VarE.h, iMin, bg0.h, new ww1(this, ny1VarE, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l43) {
            l43 l43Var = (l43) obj;
            if (this.h == l43Var.h && this.i == l43Var.i && this.j.equals(l43Var.j) && uz0.g(this.k, l43Var.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + jp1.b(this.i, this.h.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.h + ", cursorOffset=" + this.i + ", transformedText=" + this.j + ", textLayoutResultProvider=" + this.k + ")";
    }
}
