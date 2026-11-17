package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class aw implements ze1, ra2 {
    public final bh a;
    public final bm b;

    public aw(bh bhVar, bm bmVar) {
        this.a = bhVar;
        this.b = bmVar;
    }

    @Override // defpackage.ze1
    public final int a(nz0 nz0Var, List list, int i) {
        int iR = nz0Var.R(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ue1 ue1Var = (ue1) list.get(i3);
            float fB = cy1.B(cy1.x(ue1Var));
            int iG = ue1Var.g(i);
            if (fB == 0.0f) {
                i2 += iG;
            } else if (fB > 0.0f) {
                f += fB;
                iMax = Math.max(iMax, Math.round(iG / fB));
            }
        }
        return ((list.size() - 1) * iR) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.ze1
    public final int b(nz0 nz0Var, List list, int i) {
        int iR = nz0Var.R(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iR, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            ue1 ue1Var = (ue1) list.get(i2);
            float fB = cy1.B(cy1.x(ue1Var));
            if (fB == 0.0f) {
                int iMin2 = Math.min(ue1Var.g(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ue1Var.a0(iMin2));
            } else if (fB > 0.0f) {
                f += fB;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ue1 ue1Var2 = (ue1) list.get(i3);
            float fB2 = cy1.B(cy1.x(ue1Var2));
            if (fB2 > 0.0f) {
                iMax = Math.max(iMax, ue1Var2.a0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fB2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.ze1
    public final af1 c(bf1 bf1Var, List list, long j) {
        return pz1.t(this, k00.j(j), k00.k(j), k00.h(j), k00.i(j), bf1Var.R(this.a.a()), bf1Var, list, new ny1[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.ze1
    public final int d(nz0 nz0Var, List list, int i) {
        int iR = nz0Var.R(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            ue1 ue1Var = (ue1) list.get(i3);
            float fB = cy1.B(cy1.x(ue1Var));
            int iD0 = ue1Var.d0(i);
            if (fB == 0.0f) {
                i2 += iD0;
            } else if (fB > 0.0f) {
                f += fB;
                iMax = Math.max(iMax, Math.round(iD0 / fB));
            }
        }
        return ((list.size() - 1) * iR) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.ze1
    public final int e(nz0 nz0Var, List list, int i) {
        int iR = nz0Var.R(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iR, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            ue1 ue1Var = (ue1) list.get(i2);
            float fB = cy1.B(cy1.x(ue1Var));
            if (fB == 0.0f) {
                int iMin2 = Math.min(ue1Var.g(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ue1Var.U(iMin2));
            } else if (fB > 0.0f) {
                f += fB;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ue1 ue1Var2 = (ue1) list.get(i3);
            float fB2 = cy1.B(cy1.x(ue1Var2));
            if (fB2 > 0.0f) {
                iMax = Math.max(iMax, ue1Var2.U(iRound != Integer.MAX_VALUE ? Math.round(iRound * fB2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw)) {
            return false;
        }
        aw awVar = (aw) obj;
        return this.a.equals(awVar.a) && this.b.equals(awVar.b);
    }

    @Override // defpackage.ra2
    public final void f(int i, int[] iArr, int[] iArr2, bf1 bf1Var) {
        this.a.f(bf1Var, i, iArr, iArr2);
    }

    @Override // defpackage.ra2
    public final long g(int i, int i2, int i3, boolean z) {
        return !z ? l00.a(0, i3, i, i2) : lt.x(0, i3, i, i2);
    }

    @Override // defpackage.ra2
    public final int h(ny1 ny1Var) {
        return ny1Var.h;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.ra2
    public final int i(ny1 ny1Var) {
        return ny1Var.i;
    }

    @Override // defpackage.ra2
    public final af1 j(ny1[] ny1VarArr, bf1 bf1Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return bf1Var.g0(i2, i, bg0.h, new zv(ny1VarArr, this, i2, bf1Var, iArr));
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ")";
    }
}
