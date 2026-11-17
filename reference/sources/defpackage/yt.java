package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yt implements ze1 {
    @Override // defpackage.ze1
    public final int a(nz0 nz0Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((ue1) list.get(0)).g(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ue1) list.get(i2)).g(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ze1
    public final int b(nz0 nz0Var, List list, int i) {
        int size = list.size();
        int iA0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iA0 += ((ue1) list.get(i2)).a0(i);
        }
        return iA0;
    }

    @Override // defpackage.ze1
    public final af1 c(bf1 bf1Var, List list, long j) {
        Object obj;
        int i;
        final int i2;
        Object obj2;
        int i3;
        final int i4;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (uz0.g(s60.s((ue1) obj), "leadingIcon")) {
                break;
            }
            i5++;
        }
        ue1 ue1Var = (ue1) obj;
        final ny1 ny1VarE = ue1Var != null ? ue1Var.e(k00.b(j, 0, 0, 0, 0, 10)) : null;
        if (ny1VarE != null) {
            i = ny1VarE.h;
            i2 = ny1VarE.i;
        } else {
            i = 0;
            i2 = 0;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (uz0.g(s60.s((ue1) obj2), "trailingIcon")) {
                break;
            }
            i6++;
        }
        ue1 ue1Var2 = (ue1) obj2;
        final ny1 ny1VarE2 = ue1Var2 != null ? ue1Var2.e(k00.b(j, 0, 0, 0, 0, 10)) : null;
        if (ny1VarE2 != null) {
            i3 = ny1VarE2.h;
            i4 = ny1VarE2.i;
        } else {
            i3 = 0;
            i4 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (i7 < size3) {
            ue1 ue1Var3 = (ue1) list.get(i7);
            if (uz0.g(s60.s(ue1Var3), "label")) {
                final ny1 ny1VarE3 = ue1Var3.e(l00.j(-(i + i3), 0, 2, j));
                int i8 = ny1VarE3.h + i + i3;
                final int iMax = Math.max(i2, Math.max(ny1VarE3.i, i4));
                final int i9 = i;
                return bf1Var.g0(i8, iMax, bg0.h, new vp0() { // from class: xt
                    @Override // defpackage.vp0
                    public final Object h(Object obj3) {
                        my1 my1Var = (my1) obj3;
                        ny1 ny1Var = ny1VarE;
                        int i10 = iMax;
                        if (ny1Var != null) {
                            my1.k(my1Var, ny1Var, 0, Math.round(((i10 - i2) / 2.0f) * 1.0f));
                        }
                        ny1 ny1Var2 = ny1VarE3;
                        int i11 = i9;
                        my1.k(my1Var, ny1Var2, i11, 0);
                        ny1 ny1Var3 = ny1VarE2;
                        if (ny1Var3 != null) {
                            my1.k(my1Var, ny1Var3, i11 + ny1Var2.h, Math.round(((i10 - i4) / 2.0f) * 1.0f));
                        }
                        return j23.a;
                    }
                });
            }
            i7++;
            ny1VarE = ny1VarE;
            i = i;
        }
        gb1.b("Collection contains no element matching the predicate.");
        wg.k();
        return null;
    }

    @Override // defpackage.ze1
    public final int d(nz0 nz0Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((ue1) list.get(0)).d0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ue1) list.get(i2)).d0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ze1
    public final int e(nz0 nz0Var, List list, int i) {
        int size = list.size();
        int iU = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iU += ((ue1) list.get(i2)).U(i);
        }
        return iU;
    }
}
