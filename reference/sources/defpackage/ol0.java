package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ol0 implements qh1, ra2 {
    public final zg a;
    public final bh b;
    public final float c;
    public final g30 d;
    public final float e;
    public final ml0 f;

    public ol0(zg zgVar, bh bhVar, float f, g30 g30Var, float f2, ml0 ml0Var) {
        this.a = zgVar;
        this.b = bhVar;
        this.c = f;
        this.d = g30Var;
        this.e = f2;
        this.f = ml0Var;
    }

    public static int k(List list, int i, int i2, int i3, ml0 ml0Var) {
        int iD0;
        int iU;
        int iU2;
        long jA = iy0.a(0, 0);
        if (!list.isEmpty()) {
            int i4 = Integer.MAX_VALUE;
            il0 il0Var = new il0(ml0Var, l00.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            ue1 ue1Var = (ue1) dv.z0(0, list);
            if (ue1Var != null) {
                iD0 = ue1Var.d0(i);
                iU = ue1Var.U(iD0);
            } else {
                iD0 = 0;
                iU = 0;
            }
            boolean z = true;
            if (list.size() <= 1) {
                z = false;
            }
            int i5 = 0;
            if (il0Var.b(z, 0, iy0.a(i, Integer.MAX_VALUE), ue1Var == null ? null : new iy0(iy0.a(iU, iD0)), 0, 0, 0, false, false).b) {
                ml0Var.getClass();
                jA = jA;
            } else {
                int size = list.size();
                int i6 = i;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i9 < size) {
                    int i12 = i6 - iU;
                    i9++;
                    int iMax = Math.max(i8, iD0);
                    ue1 ue1Var2 = (ue1) dv.z0(i9, list);
                    if (ue1Var2 != null) {
                        iD0 = ue1Var2.d0(i);
                        iU2 = ue1Var2.U(iD0) + i2;
                    } else {
                        iD0 = 0;
                        iU2 = 0;
                    }
                    int i13 = i9 - i11;
                    int i14 = i7;
                    int i15 = iU2;
                    hl0 hl0VarB = il0Var.b(i9 + 2 < list.size() ? z : false, i13, iy0.a(i12, i4), ue1Var2 == null ? null : new iy0(iy0.a(iU2, iD0)), i14, i5, iMax, false, false);
                    if (hl0VarB.a) {
                        int i16 = iMax + i3 + i5;
                        il0Var.a(hl0VarB, ue1Var2 != null, i14, i16, i12, i13);
                        int i17 = i15 - i2;
                        i7 = i14 + 1;
                        if (hl0VarB.b) {
                            i10 = i9;
                            i5 = i16;
                            break;
                        }
                        i6 = i;
                        i11 = i9;
                        iU = i17;
                        i5 = i16;
                        i8 = 0;
                    } else {
                        iU = i15;
                        i6 = i12;
                        i7 = i14;
                        i8 = iMax;
                    }
                    i10 = i9;
                    i4 = Integer.MAX_VALUE;
                    z = true;
                }
                jA = iy0.a(i5 - i3, i10);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // defpackage.qh1
    public final int a(nz0 nz0Var, List list, int i) {
        List list2 = (List) dv.z0(1, list);
        ue1 ue1Var = list2 != null ? (ue1) dv.y0(list2) : null;
        List list3 = (List) dv.z0(2, list);
        ue1 ue1Var2 = list3 != null ? (ue1) dv.y0(list3) : null;
        long jB = l00.b(0, i, 0, 0, 13);
        ml0 ml0Var = this.f;
        ml0Var.a(ue1Var, ue1Var2, jB);
        List list4 = (List) dv.y0(list);
        if (list4 == null) {
            list4 = ag0.h;
        }
        return k(list4, i, nz0Var.R(this.c), nz0Var.R(this.e), ml0Var);
    }

    @Override // defpackage.qh1
    public final int b(nz0 nz0Var, List list, int i) {
        List list2 = (List) dv.z0(1, list);
        ue1 ue1Var = list2 != null ? (ue1) dv.y0(list2) : null;
        List list3 = (List) dv.z0(2, list);
        this.f.a(ue1Var, list3 != null ? (ue1) dv.y0(list3) : null, l00.b(0, 0, 0, i, 7));
        List list4 = (List) dv.y0(list);
        if (list4 == null) {
            list4 = ag0.h;
        }
        int iR = nz0Var.R(this.c);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iA0 = ((ue1) list4.get(i2)).a0(i) + iR;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iA0) - iR);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iA0;
            }
            i2 = i5;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [ny1[]] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r8v5, types: [ny1[]] */
    @Override // defpackage.qh1
    public final af1 c(bf1 bf1Var, List list, long j) {
        ue1 ue1Var;
        ny1 ny1Var;
        iy0 iy0Var;
        Integer numValueOf;
        Integer numValueOf2;
        hl0 hl0Var;
        int i;
        int i2;
        ue1 ue1Var2;
        ue1 ue1Var3;
        iy0 iy0Var2;
        ny1 ny1Var2;
        Integer numValueOf3;
        Integer num;
        iy0 iy0Var3;
        hl0 hl0Var2;
        int i3;
        long jA;
        long jA2;
        ny1 ny1VarE;
        boolean zIsEmpty = ((ArrayList) list).isEmpty();
        bg0 bg0Var = bg0.h;
        if (!zIsEmpty) {
            int iH = k00.h(j);
            ml0 ml0Var = this.f;
            if (iH != 0) {
                List list2 = (List) dv.x0(list);
                if (list2.isEmpty()) {
                    return bf1Var.g0(0, 0, bg0Var, new rt((byte) 24));
                }
                List list3 = (List) dv.z0(1, list);
                ue1 ue1Var4 = list3 != null ? (ue1) dv.y0(list3) : null;
                List list4 = (List) dv.z0(2, list);
                ue1 ue1Var5 = list4 != null ? (ue1) dv.y0(list4) : null;
                list2.size();
                ml0Var.getClass();
                a51 a51Var = a51.h;
                long jD0 = cu.d0(cu.D(10, cu.A(j, a51Var)));
                if (ue1Var4 != null) {
                    if (cy1.B(cy1.x(ue1Var4)) == 0.0f) {
                        cy1.x(ue1Var4);
                        ny1 ny1VarE2 = ue1Var4.e(jD0);
                        ny1VarE2.k0();
                        ny1VarE2.j0();
                        ny1VarE2.k0();
                        ny1VarE2.j0();
                    } else {
                        ue1Var4.d0(ue1Var4.U(Integer.MAX_VALUE));
                    }
                }
                if (ue1Var5 != null) {
                    if (cy1.B(cy1.x(ue1Var5)) == 0.0f) {
                        cy1.x(ue1Var5);
                        ny1 ny1VarE3 = ue1Var5.e(jD0);
                        ny1VarE3.k0();
                        ny1VarE3.j0();
                        ny1VarE3.k0();
                        ny1VarE3.j0();
                    } else {
                        ue1Var5.d0(ue1Var5.U(Integer.MAX_VALUE));
                    }
                }
                Iterator it = list2.iterator();
                long jA3 = cu.A(j, a51Var);
                uj1 uj1Var = new uj1(new af1[16]);
                int i4 = k00.i(jA3);
                int iK = k00.k(jA3);
                int iH2 = k00.h(jA3);
                si1 si1Var = my0.a;
                si1 si1Var2 = new si1();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(bf1Var.A(this.c));
                int iCeil2 = (int) Math.ceil(bf1Var.A(this.e));
                long jA4 = l00.a(0, i4, 0, iH2);
                long jD1 = cu.d0(cu.D(14, jA4));
                if (it.hasNext()) {
                    try {
                        ue1Var = (ue1) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        ue1Var = null;
                    }
                } else {
                    ue1Var = null;
                }
                if (ue1Var != null) {
                    if (cy1.B(cy1.x(ue1Var)) == 0.0f) {
                        cy1.x(ue1Var);
                        ny1VarE = ue1Var.e(jD1);
                        jA2 = iy0.a(ny1VarE.k0(), ny1VarE.j0());
                    } else {
                        int iU = ue1Var.U(Integer.MAX_VALUE);
                        ue1 ue1Var6 = ue1Var;
                        jA2 = iy0.a(iU, ue1Var6.d0(iU));
                        ue1Var = ue1Var6;
                        ny1VarE = null;
                    }
                    iy0Var = new iy0(jA2);
                    ny1Var = ny1VarE;
                } else {
                    it = it;
                    ny1Var = null;
                    iy0Var = null;
                }
                ny1 ny1Var3 = ny1Var;
                if (iy0Var != null) {
                    long j2 = iy0Var.a;
                    Integer numValueOf4 = Integer.valueOf((int) (j2 >> 32));
                    numValueOf = Integer.valueOf((int) (j2 & 4294967295L));
                    numValueOf2 = numValueOf4;
                } else {
                    numValueOf = null;
                    numValueOf2 = null;
                }
                int[] iArr = new int[16];
                int[] iArr2 = new int[16];
                ue1 ue1Var7 = ue1Var;
                ti1 ti1Var = new ti1();
                ml0 ml0Var2 = this.f;
                il0 il0Var = new il0(ml0Var2, jA3, iCeil, iCeil2);
                iy0 iy0Var4 = iy0Var;
                hl0 hl0VarB = il0Var.b(it.hasNext(), 0, iy0.a(i4, iH2), iy0Var4, 0, 0, 0, false, false);
                if (hl0VarB.b) {
                    hl0Var = hl0VarB;
                    il0Var.a(hl0Var, iy0Var4 != null, -1, 0, i4, 0);
                } else {
                    hl0Var = hl0VarB;
                }
                int[] iArrCopyOf = iArr;
                int i5 = i4;
                ny1 ny1Var4 = ny1Var3;
                ue1 ue1Var8 = ue1Var7;
                int[] iArrCopyOf2 = iArr2;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = iK;
                int i12 = iH2;
                ti1 ti1Var2 = ti1Var;
                hl0 hl0Var3 = hl0Var;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (!hl0Var3.b && ue1Var8 != null) {
                    numValueOf2.getClass();
                    int iIntValue = numValueOf2.intValue();
                    numValueOf.getClass();
                    int iIntValue2 = numValueOf.intValue();
                    int i16 = i14;
                    int i17 = i15 + iIntValue;
                    int iMax = Math.max(i13, iIntValue2);
                    int i18 = i5 - iIntValue;
                    i6++;
                    ml0Var2.getClass();
                    arrayList.add(ue1Var8);
                    si1Var2.h(i6, ny1Var4);
                    ue1Var8.l();
                    int i19 = i6 - i8;
                    if (it.hasNext()) {
                        try {
                            ue1Var2 = (ue1) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            ue1Var2 = null;
                        }
                        ue1Var3 = ue1Var2;
                    } else {
                        ue1Var3 = null;
                    }
                    if (ue1Var3 != null) {
                        if (cy1.B(cy1.x(ue1Var3)) == 0.0f) {
                            cy1.x(ue1Var3);
                            ny1 ny1VarE4 = ue1Var3.e(jD1);
                            jA = iy0.a(ny1VarE4.k0(), ny1VarE4.j0());
                            ny1Var2 = ny1VarE4;
                        } else {
                            int iU2 = ue1Var3.U(Integer.MAX_VALUE);
                            jA = iy0.a(iU2, ue1Var3.d0(iU2));
                            ny1Var2 = null;
                        }
                        iy0Var2 = new iy0(jA);
                    } else {
                        ue1Var3 = ue1Var3;
                        i6 = i6;
                        iy0Var2 = null;
                        ny1Var2 = null;
                    }
                    if (iy0Var2 != null) {
                        long j3 = iy0Var2.a;
                        Integer numValueOf5 = Integer.valueOf(((int) (j3 >> 32)) + iCeil);
                        numValueOf3 = Integer.valueOf((int) (j3 & 4294967295L));
                        num = numValueOf5;
                    } else {
                        numValueOf3 = null;
                        num = null;
                    }
                    boolean zHasNext = it.hasNext();
                    int i20 = i9;
                    long jA5 = iy0.a(i18, i12);
                    if (iy0Var2 == null) {
                        iy0Var3 = null;
                    } else {
                        num.getClass();
                        int iIntValue3 = num.intValue();
                        numValueOf3.getClass();
                        iy0Var3 = new iy0(iy0.a(iIntValue3, numValueOf3.intValue()));
                    }
                    hl0 hl0VarB2 = il0Var.b(zHasNext, i19, jA5, iy0Var3, i20, i10, iMax, false, false);
                    if (hl0VarB2.a) {
                        int iMin = Math.min(Math.max(i11, i17), i4);
                        int i21 = i10 + iMax;
                        hl0Var2 = hl0VarB2;
                        il0Var.a(hl0Var2, iy0Var2 != null, i20, i21, i18, i19);
                        int i22 = i16 + 1;
                        if (iArrCopyOf2.length < i22) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i22, (iArrCopyOf2.length * 3) / 2));
                        }
                        iArrCopyOf2[i16] = iMax;
                        i14 = i16 + 1;
                        i12 = (iH2 - i21) - iCeil2;
                        int i23 = i7 + 1;
                        if (iArrCopyOf.length < i23) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i23, (iArrCopyOf.length * 3) / 2));
                        }
                        iArrCopyOf[i7] = i6;
                        i7++;
                        i9 = i20 + 1;
                        i10 = i21 + iCeil2;
                        numValueOf2 = num != null ? Integer.valueOf(num.intValue() - iCeil) : null;
                        i11 = iMin;
                        i18 = i4;
                        i8 = i6;
                        i3 = 0;
                        i13 = 0;
                    } else {
                        hl0Var2 = hl0VarB2;
                        numValueOf2 = num;
                        i3 = i17;
                        i9 = i20;
                        i13 = iMax;
                        i14 = i16;
                    }
                    ny1 ny1Var5 = ny1Var2;
                    i15 = i3;
                    ny1Var4 = ny1Var5;
                    ue1Var8 = ue1Var3;
                    hl0Var3 = hl0Var2;
                    i5 = i18;
                    numValueOf = numValueOf3;
                }
                int i24 = i14;
                int size = arrayList.size();
                ?? r1 = new ny1[size];
                for (int i25 = 0; i25 < size; i25++) {
                    r1[i25] = si1Var2.b(i25);
                }
                int[] iArr3 = new int[i7];
                int[] iArr4 = new int[i7];
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                ?? r2 = r1;
                while (i26 < i7) {
                    int i29 = iArrCopyOf[i26];
                    if (i26 < 0 || i26 >= (i2 = i24)) {
                        wg.i("Index must be between 0 and size");
                        return null;
                    }
                    int iH3 = iArrCopyOf2[i26];
                    ti1 ti1Var3 = ti1Var2;
                    if (!ti1Var3.b(i26)) {
                        if (k00.h(jA4) == Integer.MAX_VALUE) {
                            iH3 = Integer.MAX_VALUE;
                        } else {
                            iH3 = k00.h(jA4) - i28;
                        }
                    }
                    int[] iArr5 = iArrCopyOf;
                    ti1Var2 = ti1Var3;
                    ?? r8 = r2;
                    int i30 = i11;
                    int i31 = i7;
                    int i32 = i26;
                    af1 af1VarT = pz1.t(this, i30, k00.j(jA4), k00.i(jA4), iH3, iCeil, bf1Var, arrayList, r8, i27, i29, iArr3, i32);
                    int iG = af1VarT.g();
                    int iD = af1VarT.d();
                    iArr4[i32] = iD;
                    int iMax2 = Math.max(i30, iG);
                    uj1Var.b(af1VarT);
                    i26 = i32 + 1;
                    i27 = i29;
                    i24 = i2;
                    i7 = i31;
                    iArrCopyOf = iArr5;
                    iArrCopyOf2 = iArrCopyOf2;
                    i11 = iMax2;
                    i28 += iD;
                    r2 = r8;
                }
                int i33 = i11;
                int i34 = i28;
                if (uj1Var.j == 0) {
                    i33 = 0;
                    i = 0;
                } else {
                    i = i34;
                }
                bh bhVar = this.b;
                int iR = ((uj1Var.j - 1) * bf1Var.R(bhVar.a())) + i;
                int iJ = k00.j(jA3);
                int iH4 = k00.h(jA3);
                if (iR < iJ) {
                    iR = iJ;
                }
                if (iR <= iH4) {
                    iH4 = iR;
                }
                bhVar.f(bf1Var, iH4, iArr4, iArr3);
                int iK2 = k00.k(jA3);
                int i35 = k00.i(jA3);
                if (i33 < iK2) {
                    i33 = iK2;
                }
                if (i33 <= i35) {
                    i35 = i33;
                }
                return bf1Var.g0(i35, iH4, bg0Var, new p(uj1Var, (byte) 21));
            }
            ml0Var.getClass();
        }
        return bf1Var.g0(0, 0, bg0Var, new rt((byte) 23));
    }

    @Override // defpackage.qh1
    public final int d(nz0 nz0Var, List list, int i) {
        List list2 = (List) dv.z0(1, list);
        ue1 ue1Var = list2 != null ? (ue1) dv.y0(list2) : null;
        List list3 = (List) dv.z0(2, list);
        ue1 ue1Var2 = list3 != null ? (ue1) dv.y0(list3) : null;
        long jB = l00.b(0, i, 0, 0, 13);
        ml0 ml0Var = this.f;
        ml0Var.a(ue1Var, ue1Var2, jB);
        List list4 = (List) dv.y0(list);
        if (list4 == null) {
            list4 = ag0.h;
        }
        return k(list4, i, nz0Var.R(this.c), nz0Var.R(this.e), ml0Var);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x023a  */
    /* JADX WARN: Code duplicated, block: B:111:0x023f  */
    /* JADX WARN: Code duplicated, block: B:124:0x023e A[SYNTHETIC] */
    @Override // defpackage.qh1
    public final int e(nz0 nz0Var, List list, int i) {
        ml0 ml0Var;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        long jA;
        int i5;
        int i6;
        int i7;
        List list2 = (List) dv.z0(1, list);
        ue1 ue1Var = list2 != null ? (ue1) dv.y0(list2) : null;
        char c = 2;
        List list3 = (List) dv.z0(2, list);
        int i8 = 0;
        this.f.a(ue1Var, list3 != null ? (ue1) dv.y0(list3) : null, l00.b(0, 0, 0, i, 7));
        List list4 = (List) dv.y0(list);
        if (list4 == null) {
            list4 = ag0.h;
        }
        int iR = nz0Var.R(this.c);
        int iR2 = nz0Var.R(this.e);
        long jA2 = iy0.a(0, 0);
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr2 = new int[size];
        int size2 = list4.size();
        int[] iArr3 = new int[size2];
        int size3 = list4.size();
        int i9 = 0;
        while (i9 < size3) {
            ue1 ue1Var2 = (ue1) list4.get(i9);
            char c2 = c;
            int iU = ue1Var2.U(i);
            iArr2[i9] = iU;
            iArr3[i9] = ue1Var2.d0(iU);
            i9++;
            c = c2;
        }
        int size4 = list4.size();
        ml0 ml0Var2 = this.f;
        if (Integer.MAX_VALUE < size4) {
            ml0Var2.getClass();
        }
        if (Integer.MAX_VALUE >= list4.size()) {
            ml0Var2.getClass();
        }
        int iMin = Math.min(Integer.MAX_VALUE, list4.size());
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += iArr2[i11];
        }
        int size5 = ((list4.size() - 1) * iR) + i10;
        if (size2 == 0) {
            wg.p();
            return 0;
        }
        int i12 = iArr3[0];
        int i13 = size2 - 1;
        if (1 <= i13) {
            int i14 = 1;
            while (true) {
                int i15 = iArr3[i14];
                if (i12 < i15) {
                    i12 = i15;
                }
                if (i14 == i13) {
                    break;
                }
                i14++;
            }
        }
        if (size == 0) {
            wg.p();
            return 0;
        }
        int i16 = iArr2[i8];
        int i17 = size - 1;
        if (1 <= i17) {
            int i18 = 1;
            while (true) {
                int i19 = iArr2[i18];
                if (i16 < i19) {
                    i16 = i19;
                }
                if (i18 == i17) {
                    break;
                }
                i18++;
            }
        }
        int i20 = size5;
        while (i16 <= i20 && i12 != i) {
            int i21 = (i16 + i20) / 2;
            if (list4.isEmpty()) {
                i4 = i20;
                iArr = iArr3;
                ml0Var = ml0Var2;
            } else {
                int i22 = i8;
                int[] iArr4 = iArr3;
                ml0Var = ml0Var2;
                il0 il0Var = new il0(ml0Var, l00.a(i22, i21, i22, Integer.MAX_VALUE), iR, iR2);
                ue1 ue1Var3 = (ue1) dv.z0(i22, list4);
                if (ue1Var3 != null) {
                    i2 = iArr4[i22];
                    i3 = iArr2[i22];
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                iArr = iArr4;
                i4 = i20;
                int i23 = 0;
                if (il0Var.b(list4.size() > 1, 0, iy0.a(i21, Integer.MAX_VALUE), ue1Var3 == null ? null : new iy0(iy0.a(i3, i2)), 0, 0, 0, false, false).b) {
                    ml0Var.getClass();
                } else {
                    int size6 = list4.size();
                    int i24 = i21;
                    int i25 = i3;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = i2;
                    int i31 = 0;
                    while (true) {
                        if (i29 >= size6) {
                            list4 = list4;
                            break;
                        }
                        int i32 = i24 - i25;
                        int i33 = size6;
                        int i34 = i29 + 1;
                        int iMax = Math.max(i27, i30);
                        ue1 ue1Var4 = (ue1) dv.z0(i34, list4);
                        if (ue1Var4 != null) {
                            int i35 = iArr[i34];
                            int i36 = iArr2[i34] + iR;
                            i5 = i35;
                            i6 = i36;
                        } else {
                            i5 = 0;
                            i6 = 0;
                        }
                        int i37 = i34 - i28;
                        int i38 = i26;
                        hl0 hl0VarB = il0Var.b(i29 + 2 < list4.size(), i37, iy0.a(i32, Integer.MAX_VALUE), ue1Var4 == null ? null : new iy0(iy0.a(i6, i5)), i38, i23, iMax, false, false);
                        if (hl0VarB.a) {
                            int i39 = iMax + iR2 + i23;
                            il0Var.a(hl0VarB, ue1Var4 != null, i38, i39, i32, i37);
                            i6 -= iR;
                            i26 = i38 + 1;
                            if (hl0VarB.b) {
                                i23 = i39;
                                i31 = i34;
                                break;
                            }
                            i24 = i21;
                            i23 = i39;
                            i7 = i34;
                            i27 = 0;
                        } else {
                            i7 = i28;
                            i24 = i32;
                            i26 = i38;
                            i27 = iMax;
                        }
                        i25 = i6;
                        i28 = i7;
                        list4 = list4;
                        size6 = i33;
                        i29 = i34;
                        i31 = i29;
                        i30 = i5;
                    }
                    jA = iy0.a(i23 - iR2, i31);
                }
                i12 = (int) (jA >> 32);
                int i40 = (int) (jA & 4294967295L);
                if (i12 <= i || i40 < iMin) {
                    i16 = i21 + 1;
                    if (i16 > i4) {
                        return i16;
                    }
                    i20 = i4;
                } else {
                    if (i12 >= i) {
                        return i21;
                    }
                    i20 = i21 - 1;
                }
                size5 = i21;
                list4 = list4;
                ml0Var2 = ml0Var;
                i8 = 0;
                iArr3 = iArr;
            }
            jA = jA2;
            i12 = (int) (jA >> 32);
            int i41 = (int) (jA & 4294967295L);
            if (i12 <= i) {
                i16 = i21 + 1;
                if (i16 > i4) {
                    return i16;
                }
                i20 = i4;
            } else {
                i16 = i21 + 1;
                if (i16 > i4) {
                    return i16;
                }
                i20 = i4;
            }
            size5 = i21;
            list4 = list4;
            ml0Var2 = ml0Var;
            i8 = 0;
            iArr3 = iArr;
        }
        return size5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol0)) {
            return false;
        }
        ol0 ol0Var = (ol0) obj;
        return this.a.equals(ol0Var.a) && this.b.equals(ol0Var.b) && cc0.b(this.c, ol0Var.c) && this.d.equals(ol0Var.d) && cc0.b(this.e, ol0Var.e) && uz0.g(this.f, ol0Var.f);
    }

    @Override // defpackage.ra2
    public final void f(int i, int[] iArr, int[] iArr2, bf1 bf1Var) {
        this.a.d(bf1Var, i, iArr, bf1Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.ra2
    public final long g(int i, int i2, int i3, boolean z) {
        ua2 ua2Var = ta2.a;
        return !z ? l00.a(i, i2, 0, i3) : lt.y(i, i2, 0, i3);
    }

    @Override // defpackage.ra2
    public final int h(ny1 ny1Var) {
        return ny1Var.j0();
    }

    public final int hashCode() {
        return this.f.hashCode() + ((((((Float.hashCode(this.e) + ((this.d.h.hashCode() + wi0.d(this.c, (this.b.hashCode() + ((this.a.hashCode() + 38161) * 31)) * 31, 31)) * 31)) * 31) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31);
    }

    @Override // defpackage.ra2
    public final int i(ny1 ny1Var) {
        return ny1Var.k0();
    }

    @Override // defpackage.ra2
    public final af1 j(final ny1[] ny1VarArr, bf1 bf1Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final u31 u31Var = u31.h;
        return bf1Var.g0(i, i2, bg0.h, new vp0() { // from class: nl0
            @Override // defpackage.vp0
            public final Object h(Object obj) {
                ys ysVar;
                my1 my1Var = (my1) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    ny1 ny1Var = ny1VarArr[i8];
                    ny1Var.getClass();
                    Object objL = ny1Var.l();
                    sa2 sa2Var = objL instanceof sa2 ? (sa2) objL : null;
                    if (sa2Var == null || (ysVar = sa2Var.c) == null) {
                        ysVar = this.d;
                    }
                    my1.i(my1Var, ny1Var, iArr[i8 - i7], ysVar.d(i2, ny1Var.j0(), u31Var) + i6);
                }
                return j23.a;
            }
        });
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + cc0.c(this.c) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + cc0.c(this.e) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ")";
    }
}
