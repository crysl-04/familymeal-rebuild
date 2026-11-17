package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xa1 implements qh1 {
    public static int f(nz0 nz0Var, ArrayList arrayList, int i, zp0 zp0Var) {
        int iIntValue;
        int iIntValue2;
        int i2;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iU = dt.U(i, nz0Var.R(32.0f));
        ue1 ue1Var = (ue1) dv.y0(list4);
        if (ue1Var != null) {
            iIntValue = ((Number) zp0Var.f(ue1Var, Integer.valueOf(iU))).intValue();
            iU = dt.U(iU, ue1Var.a0(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        ue1 ue1Var2 = (ue1) dv.y0(list5);
        if (ue1Var2 != null) {
            iIntValue2 = ((Number) zp0Var.f(ue1Var2, Integer.valueOf(iU))).intValue();
            iU = dt.U(iU, ue1Var2.a0(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (ue1) dv.y0(list2);
        int iIntValue3 = obj != null ? ((Number) zp0Var.f(obj, Integer.valueOf(iU))).intValue() : 0;
        Object obj2 = (ue1) dv.y0(list);
        int iIntValue4 = obj2 != null ? ((Number) zp0Var.f(obj2, Integer.valueOf(iU))).intValue() : 0;
        Object obj3 = (ue1) dv.y0(list3);
        int iIntValue5 = obj3 != null ? ((Number) zp0Var.f(obj3, Integer.valueOf(iU))).intValue() : 0;
        boolean z = iIntValue5 > nz0Var.J(r02.t(30));
        boolean z2 = iIntValue3 > 0;
        boolean z3 = iIntValue5 > 0;
        if ((z2 && z3) || z) {
            i2 = 3;
        } else {
            i2 = (z2 || z3) ? 2 : 1;
        }
        return cu.u(nz0Var, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i2, nz0Var.R((i2 == 3 ? 12.0f : 8.0f) * 2.0f), l00.b(0, 0, 0, 0, 15));
    }

    public static int g(nz0 nz0Var, ArrayList arrayList, int i, zp0 zp0Var) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        ue1 ue1Var = (ue1) dv.y0(list4);
        int iIntValue = ue1Var != null ? ((Number) zp0Var.f(ue1Var, Integer.valueOf(i))).intValue() : 0;
        ue1 ue1Var2 = (ue1) dv.y0(list5);
        int iIntValue2 = ue1Var2 != null ? ((Number) zp0Var.f(ue1Var2, Integer.valueOf(i))).intValue() : 0;
        ue1 ue1Var3 = (ue1) dv.y0(list);
        int iIntValue3 = ue1Var3 != null ? ((Number) zp0Var.f(ue1Var3, Integer.valueOf(i))).intValue() : 0;
        ue1 ue1Var4 = (ue1) dv.y0(list2);
        int iIntValue4 = ue1Var4 != null ? ((Number) zp0Var.f(ue1Var4, Integer.valueOf(i))).intValue() : 0;
        ue1 ue1Var5 = (ue1) dv.y0(list3);
        int iIntValue5 = ue1Var5 != null ? ((Number) zp0Var.f(ue1Var5, Integer.valueOf(i))).intValue() : 0;
        int iR = nz0Var.R(32.0f);
        long jB = l00.b(0, 0, 0, 0, 15);
        if (k00.e(jB)) {
            return k00.i(jB);
        }
        return iR + iIntValue + Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)) + iIntValue2;
    }

    @Override // defpackage.qh1
    public final int a(nz0 nz0Var, List list, int i) {
        return f(nz0Var, (ArrayList) list, i, ta1.o);
    }

    @Override // defpackage.qh1
    public final int b(nz0 nz0Var, List list, int i) {
        return g(nz0Var, (ArrayList) list, i, ua1.o);
    }

    @Override // defpackage.qh1
    public final af1 c(bf1 bf1Var, List list, long j) {
        int i;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        List list6 = (List) arrayList.get(4);
        long jB = k00.b(j, 0, 0, 0, 0, 10);
        int iR = bf1Var.R(32.0f);
        ue1 ue1Var = (ue1) dv.y0(list5);
        int iU = ue1Var != null ? ue1Var.U(k00.h(j)) : 0;
        ue1 ue1Var2 = (ue1) dv.y0(list6);
        int iU2 = dt.U(k00.i(jB), iU + (ue1Var2 != null ? ue1Var2.U(k00.h(j)) : 0) + iR);
        ue1 ue1Var3 = (ue1) dv.y0(list4);
        long jI = l00.i(jB, -iR, -bf1Var.R(((((dv.y0(list3) != null) && (dv.y0(list4) != null)) || ((ue1Var3 != null ? ue1Var3.d0(iU2) : 0) > bf1Var.J(r02.t(30)))) ? 12.0f : 8.0f) * 2.0f));
        ue1 ue1Var4 = (ue1) dv.y0(list5);
        ny1 ny1VarE = ue1Var4 != null ? ue1Var4.e(jI) : null;
        int i2 = ny1VarE != null ? ny1VarE.h : 0;
        ue1 ue1Var5 = (ue1) dv.y0(list6);
        ny1 ny1VarE2 = ue1Var5 != null ? ue1Var5.e(l00.j(-i2, 0, 2, jI)) : null;
        int i3 = i2 + (ny1VarE2 != null ? ny1VarE2.h : 0);
        ue1 ue1Var6 = (ue1) dv.y0(list2);
        ny1 ny1VarE3 = ue1Var6 != null ? ue1Var6.e(l00.j(-i3, 0, 2, jI)) : null;
        int i4 = ny1VarE3 != null ? ny1VarE3.i : 0;
        ue1 ue1Var7 = (ue1) dv.y0(list4);
        ny1 ny1VarE4 = ue1Var7 != null ? ue1Var7.e(l00.i(jI, -i3, -i4)) : null;
        int i5 = i4 + (ny1VarE4 != null ? ny1VarE4.i : 0);
        boolean z = (ny1VarE4 == null || ny1VarE4.h0(h5.a) == ny1VarE4.h0(h5.b)) ? false : true;
        ue1 ue1Var8 = (ue1) dv.y0(list3);
        ny1 ny1VarE5 = ue1Var8 != null ? ue1Var8.e(l00.i(jI, -i3, -i5)) : null;
        boolean z2 = ny1VarE5 != null;
        boolean z3 = ny1VarE4 != null;
        if ((z2 && z3) || z) {
            i = 3;
        } else {
            i = (z2 || z3) ? 2 : 1;
        }
        float f = i == 3 ? 12.0f : 8.0f;
        float f2 = f * 2.0f;
        final int i6 = k00.e(j) ? k00.i(j) : iR + (ny1VarE != null ? ny1VarE.h : 0) + Math.max(ny1VarE3 != null ? ny1VarE3.h : 0, Math.max(ny1VarE5 != null ? ny1VarE5.h : 0, ny1VarE4 != null ? ny1VarE4.h : 0)) + (ny1VarE2 != null ? ny1VarE2.h : 0);
        final ny1 ny1Var = ny1VarE5;
        float f3 = f;
        final int iU3 = cu.u(bf1Var, ny1VarE != null ? ny1VarE.i : 0, ny1VarE2 != null ? ny1VarE2.i : 0, ny1VarE3 != null ? ny1VarE3.i : 0, ny1VarE5 != null ? ny1VarE5.i : 0, ny1VarE4 != null ? ny1VarE4.i : 0, i, bf1Var.R(f2), j);
        final boolean z4 = i == 3;
        final int iR2 = bf1Var.R(16.0f);
        final int iR3 = bf1Var.R(16.0f);
        final int iR4 = bf1Var.R(f3);
        final ny1 ny1Var2 = ny1VarE2;
        final ny1 ny1Var3 = ny1VarE3;
        final ny1 ny1Var4 = ny1VarE4;
        final ny1 ny1Var5 = ny1VarE;
        return bf1Var.g0(i6, iU3, bg0.h, new vp0() { // from class: ra1
            @Override // defpackage.vp0
            public final Object h(Object obj) {
                int iRound;
                int i7;
                my1 my1Var = (my1) obj;
                ny1 ny1Var6 = ny1Var5;
                int i8 = iR2;
                boolean z5 = z4;
                int iRound2 = iR4;
                int i9 = iU3;
                if (ny1Var6 != null) {
                    my1.k(my1Var, ny1Var6, i8, z5 ? iRound2 : Math.round(((i9 - ny1Var6.i) / 2.0f) * 1.0f));
                }
                int i10 = 0;
                int i11 = i8 + (ny1Var6 != null ? ny1Var6.h : 0);
                ny1 ny1Var7 = ny1Var3;
                ny1 ny1Var8 = ny1Var;
                ny1 ny1Var9 = ny1Var4;
                if (z5) {
                    iRound = iRound2;
                } else {
                    iRound = Math.round(((i9 - (((ny1Var7 != null ? ny1Var7.i : 0) + (ny1Var8 != null ? ny1Var8.i : 0)) + (ny1Var9 != null ? ny1Var9.i : 0))) / 2.0f) * 1.0f);
                }
                if (ny1Var8 != null) {
                    my1.k(my1Var, ny1Var8, i11, iRound);
                    i7 = ny1Var8.i;
                } else {
                    i7 = 0;
                }
                int i12 = iRound + i7;
                if (ny1Var7 != null) {
                    my1.k(my1Var, ny1Var7, i11, i12);
                    i10 = ny1Var7.i;
                }
                int i13 = i12 + i10;
                if (ny1Var9 != null) {
                    my1.k(my1Var, ny1Var9, i11, i13);
                }
                ny1 ny1Var10 = ny1Var2;
                if (ny1Var10 != null) {
                    int i14 = (i6 - iR3) - ny1Var10.h;
                    if (!z5) {
                        iRound2 = Math.round(((i9 - ny1Var10.i) / 2.0f) * 1.0f);
                    }
                    my1.k(my1Var, ny1Var10, i14, iRound2);
                }
                return j23.a;
            }
        });
    }

    @Override // defpackage.qh1
    public final int d(nz0 nz0Var, List list, int i) {
        return f(nz0Var, (ArrayList) list, i, va1.o);
    }

    @Override // defpackage.qh1
    public final int e(nz0 nz0Var, List list, int i) {
        return g(nz0Var, (ArrayList) list, i, wa1.o);
    }
}
