package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gm1 implements ze1 {
    public final /* synthetic */ kp0 a;
    public final /* synthetic */ nx b;
    public final /* synthetic */ boolean c;

    public gm1(kp0 kp0Var, nx nxVar, boolean z) {
        this.a = kp0Var;
        this.b = nxVar;
        this.c = z;
    }

    @Override // defpackage.ze1
    public final af1 c(final bf1 bf1Var, List list, long j) {
        float f;
        boolean z;
        Object obj;
        ny1 ny1VarE;
        ny1 ny1VarE2;
        float fFloatValue = ((Number) this.a.a()).floatValue();
        float f2 = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
        long jB = k00.b(j, 0, 0, 0, 0, 10);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ue1 ue1Var = (ue1) list.get(i);
            if (uz0.g(s60.s(ue1Var), "icon")) {
                final ny1 ny1VarE3 = ue1Var.e(jB);
                float f3 = 2.0f;
                int iR = bf1Var.R(hm1.d * 2.0f) + ny1VarE3.h;
                int iX = ie1.x(iR * f2);
                int iR2 = bf1Var.R(hm1.e * 2.0f) + ny1VarE3.i;
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    ue1 ue1Var2 = (ue1) list.get(i2);
                    float f4 = f3;
                    if (uz0.g(s60.s(ue1Var2), "indicatorRipple")) {
                        if (!((iR >= 0) & (iR2 >= 0))) {
                            cx0.a("width and height must be >= 0");
                        }
                        final ny1 ny1VarE4 = ue1Var2.e(l00.h(iR, iR, iR2, iR2));
                        int size3 = list.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                f = f2;
                                z = true;
                                obj = null;
                                break;
                            }
                            obj = list.get(i3);
                            z = true;
                            f = f2;
                            if (uz0.g(s60.s((ue1) obj), "indicator")) {
                                break;
                            }
                            i3++;
                            f2 = f;
                        }
                        ue1 ue1Var3 = (ue1) obj;
                        if (ue1Var3 != null) {
                            if (!((iX >= 0 ? z : false) & (iR2 >= 0 ? z : false))) {
                                cx0.a("width and height must be >= 0");
                            }
                            ny1VarE = ue1Var3.e(l00.h(iX, iX, iR2, iR2));
                        } else {
                            ny1VarE = null;
                        }
                        nx nxVar = this.b;
                        if (nxVar != null) {
                            int size4 = list.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size4) {
                                    gb1.b("Collection contains no element matching the predicate.");
                                    wg.k();
                                    return null;
                                }
                                ue1 ue1Var4 = (ue1) list.get(i4);
                                if (uz0.g(s60.s(ue1Var4), "label")) {
                                    ny1VarE2 = ue1Var4.e(jB);
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            ny1VarE2 = null;
                        }
                        bg0 bg0Var = bg0.h;
                        if (nxVar == null) {
                            final int iR3 = k00.i(j) == Integer.MAX_VALUE ? ny1VarE3.h + (bf1Var.R(hm1.g) << 1) : k00.i(j);
                            final int iF = l00.f(bf1Var.R(hm1.a), j);
                            final int i5 = (iR3 - ny1VarE3.h) / 2;
                            final int i6 = (iF - ny1VarE3.i) / 2;
                            final int i7 = (iR3 - ny1VarE4.h) / 2;
                            final int i8 = (iF - ny1VarE4.i) / 2;
                            final ny1 ny1Var = ny1VarE;
                            return bf1Var.g0(iR3, iF, bg0Var, new vp0() { // from class: em1
                                @Override // defpackage.vp0
                                public final Object h(Object obj2) {
                                    my1 my1Var = (my1) obj2;
                                    ny1 ny1Var2 = ny1Var;
                                    if (ny1Var2 != null) {
                                        my1.k(my1Var, ny1Var2, (iR3 - ny1Var2.h) / 2, (iF - ny1Var2.i) / 2);
                                    }
                                    my1.k(my1Var, ny1VarE3, i5, i6);
                                    my1.k(my1Var, ny1VarE4, i7, i8);
                                    return j23.a;
                                }
                            });
                        }
                        final ny1 ny1Var2 = ny1VarE;
                        ny1VarE2.getClass();
                        float f5 = ny1VarE3.i;
                        float f6 = hm1.e;
                        float fA = bf1Var.A(f6) + f5;
                        float f7 = hm1.c;
                        float fA2 = bf1Var.A(f7) + fA + ny1VarE2.i;
                        float fJ = (k00.j(j) - fA2) / f4;
                        float fA3 = bf1Var.A(f6);
                        if (fJ < fA3) {
                            fJ = fA3;
                        }
                        float f8 = (fJ * f4) + fA2;
                        final boolean z2 = this.c;
                        final float f9 = (1.0f - f) * ((z2 ? fJ : (f8 - ny1VarE3.i) / f4) - fJ);
                        final float fA4 = bf1Var.A(f7) + bf1Var.A(f6) + ny1VarE3.i + fJ;
                        final int iR4 = k00.i(j) == Integer.MAX_VALUE ? ny1VarE3.h + (bf1Var.R(hm1.g) << 1) : k00.i(j);
                        final int i9 = (iR4 - ny1VarE2.h) / 2;
                        final int i10 = (iR4 - ny1VarE3.h) / 2;
                        final int i11 = (iR4 - ny1VarE4.h) / 2;
                        final float fA5 = fJ - bf1Var.A(f6);
                        final float f10 = fJ;
                        final ny1 ny1Var3 = ny1VarE2;
                        final float f11 = f;
                        return bf1Var.g0(iR4, ie1.x(f8), bg0Var, new vp0() { // from class: dm1
                            @Override // defpackage.vp0
                            public final Object h(Object obj2) {
                                my1 my1Var = (my1) obj2;
                                ny1 ny1Var4 = ny1Var2;
                                float f12 = f9;
                                float f13 = f10;
                                if (ny1Var4 != null) {
                                    my1.k(my1Var, ny1Var4, (iR4 - ny1Var4.h) / 2, ie1.x((f13 - bf1Var.R(hm1.e)) + f12));
                                }
                                if (z2 || f11 != 0.0f) {
                                    my1.k(my1Var, ny1Var3, i9, ie1.x(fA4 + f12));
                                }
                                my1.k(my1Var, ny1VarE3, i10, ie1.x(f13 + f12));
                                my1.k(my1Var, ny1VarE4, i11, ie1.x(fA5 + f12));
                                return j23.a;
                            }
                        });
                    }
                    i2++;
                    f3 = f4;
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
}
