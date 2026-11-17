package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uy2 implements ze1 {
    public final bk0 a;
    public final float b;

    public uy2(bk0 bk0Var, float f) {
        this.a = bk0Var;
        this.b = f;
    }

    @Override // defpackage.ze1
    public final int a(nz0 nz0Var, List list, int i) {
        Integer numValueOf;
        int iR = nz0Var.R(this.b);
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
        return Math.max(iR, numValueOf != null ? numValueOf.intValue() : 0);
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
    public final af1 c(final bf1 bf1Var, List list, final long j) {
        int i;
        int size = list.size();
        final int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ue1 ue1Var = (ue1) list.get(i3);
            if (uz0.g(s60.s(ue1Var), "navigationIcon")) {
                final ny1 ny1VarE = ue1Var.e(k00.b(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    ue1 ue1Var2 = (ue1) list.get(i4);
                    if (uz0.g(s60.s(ue1Var2), "actionIcons")) {
                        final ny1 ny1VarE2 = ue1Var2.e(k00.b(j, 0, 0, 0, 0, 14));
                        if (k00.i(j) == Integer.MAX_VALUE) {
                            i = k00.i(j);
                        } else {
                            i = (k00.i(j) - ny1VarE.h) - ny1VarE2.h;
                            if (i < 0) {
                                i = 0;
                            }
                        }
                        int i5 = i;
                        int size3 = list.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            ue1 ue1Var3 = (ue1) list.get(i6);
                            if (uz0.g(s60.s(ue1Var3), "title")) {
                                final ny1 ny1VarE3 = ue1Var3.e(k00.b(j, 0, i5, 0, 0, 12));
                                mt0 mt0Var = h5.b;
                                int iH0 = ny1VarE3.h0(mt0Var) != Integer.MIN_VALUE ? ny1VarE3.h0(mt0Var) : 0;
                                float fA = this.a.a();
                                int iX = Float.isNaN(fA) ? 0 : ie1.x(fA);
                                final int iMax = Math.max(bf1Var.R(this.b), ny1VarE3.i);
                                if (k00.h(j) == Integer.MAX_VALUE) {
                                    i2 = iMax;
                                } else {
                                    int i7 = iX + iMax;
                                    if (i7 >= 0) {
                                        i2 = i7;
                                    }
                                }
                                final int i8 = iH0;
                                return bf1Var.g0(k00.i(j), i2, bg0.h, new vp0(i2, ny1VarE3, ny1VarE2, j, bf1Var, this, i8, iMax) { // from class: ty2
                                    public final /* synthetic */ int i;
                                    public final /* synthetic */ ny1 j;
                                    public final /* synthetic */ ny1 k;
                                    public final /* synthetic */ long l;
                                    public final /* synthetic */ bf1 m;

                                    @Override // defpackage.vp0
                                    public final Object h(Object obj) {
                                        int i9;
                                        my1 my1Var = (my1) obj;
                                        ny1 ny1Var = this.h;
                                        int i10 = ny1Var.i;
                                        int i11 = this.i;
                                        my1.k(my1Var, ny1Var, 0, (i11 - i10) / 2);
                                        int iMax2 = Math.max(this.m.R(de.c), ny1Var.h);
                                        ny1 ny1Var2 = this.k;
                                        int i12 = ny1Var2.h;
                                        ny1 ny1Var3 = this.j;
                                        int i13 = ny1Var3.h;
                                        long j2 = this.l;
                                        int iRound = Math.round((1.0f - 1.0f) * ((k00.i(j2) - i13) / 2.0f));
                                        if (iRound >= iMax2) {
                                            if (ny1Var3.h + iRound > k00.i(j2) - i12) {
                                                i9 = (k00.i(j2) - i12) - (ny1Var3.h + iRound);
                                            }
                                            my1.k(my1Var, ny1Var3, iRound, (i11 - ny1Var3.i) / 2);
                                            my1.k(my1Var, ny1Var2, k00.i(j2) - ny1Var2.h, (i11 - ny1Var2.i) / 2);
                                            return j23.a;
                                        }
                                        i9 = iMax2 - iRound;
                                        iRound += i9;
                                        my1.k(my1Var, ny1Var3, iRound, (i11 - ny1Var3.i) / 2);
                                        my1.k(my1Var, ny1Var2, k00.i(j2) - ny1Var2.h, (i11 - ny1Var2.i) / 2);
                                        return j23.a;
                                    }
                                });
                            }
                            i6++;
                            this = this;
                        }
                        gb1.b("Collection contains no element matching the predicate.");
                        wg.k();
                        return null;
                    }
                    i4++;
                    this = this;
                }
                gb1.b("Collection contains no element matching the predicate.");
                wg.k();
                return null;
            }
        }
        gb1.b("Collection contains no element matching the predicate.");
        wg.k();
        return null;
    }

    @Override // defpackage.ze1
    public final int d(nz0 nz0Var, List list, int i) {
        Integer numValueOf;
        int iR = nz0Var.R(this.b);
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
        return Math.max(iR, numValueOf != null ? numValueOf.intValue() : 0);
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
