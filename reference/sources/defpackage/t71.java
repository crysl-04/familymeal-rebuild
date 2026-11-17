package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t71 implements u61 {
    public final /* synthetic */ b81 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ rt1 c;
    public final /* synthetic */ p21 d;
    public final /* synthetic */ bh e;
    public final /* synthetic */ zg f;
    public final /* synthetic */ x20 g;
    public final /* synthetic */ jy1 h;
    public final /* synthetic */ bm i;
    public final /* synthetic */ cm j;

    public t71(b81 b81Var, boolean z, rt1 rt1Var, p21 p21Var, bh bhVar, zg zgVar, x20 x20Var, bs0 bs0Var, jy1 jy1Var, bm bmVar, cm cmVar) {
        this.a = b81Var;
        this.b = z;
        this.c = rt1Var;
        this.d = p21Var;
        this.e = bhVar;
        this.f = zgVar;
        this.g = x20Var;
        this.h = jy1Var;
        this.i = bmVar;
        this.j = cmVar;
    }

    /* JADX WARN: Code duplicated, block: B:282:0x067d  */
    /* JADX WARN: Code duplicated, block: B:299:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:308:0x0702  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.u61
    public final af1 a(v61 v61Var, long j) throws Throwable {
        int iR;
        int iR2;
        float fA;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        float f2;
        List arrayList;
        int i9;
        int i10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        ArrayList arrayList4;
        int i12;
        int i13;
        s71 s71Var;
        int i14;
        int i15;
        Integer numValueOf;
        Integer numValueOf2;
        u71 u71Var;
        ap2 ap2Var;
        int[] iArr;
        int i16;
        boolean zA = vy0.a(0L, 0L);
        ap2 ap2Var2 = v61Var.i;
        b81 b81Var = this.a;
        b81Var.t.getValue();
        boolean z = b81Var.b || ap2Var2.u();
        ks1 ks1Var = ks1.i;
        ks1 ks1Var2 = ks1.h;
        boolean z2 = this.b;
        ys.p(j, z2 ? ks1Var2 : ks1Var);
        rt1 rt1Var = this.c;
        if (z2) {
            iR = ap2Var2.R(rt1Var.a(ap2Var2.getLayoutDirection()));
            iR2 = ap2Var2.R(rt1Var.b(ap2Var2.getLayoutDirection()));
        } else {
            iR = ap2Var2.R(t03.o(rt1Var, ap2Var2.getLayoutDirection()));
            iR2 = ap2Var2.R(t03.n(rt1Var, ap2Var2.getLayoutDirection()));
        }
        int iR3 = ap2Var2.R(rt1Var.b);
        int iR4 = ap2Var2.R(rt1Var.d) + iR3;
        int i17 = iR + iR2;
        int i18 = z2 ? iR4 : i17;
        int i19 = z2 ? iR3 : z2 ? iR2 : iR;
        int i20 = i18 - i19;
        long jI = l00.i(j, -i17, -iR4);
        q71 q71Var = (q71) this.d.a();
        g61 g61Var = q71Var.c;
        int i21 = k00.i(jI);
        int iH = k00.h(jI);
        g61Var.a.h(i21);
        g61Var.b.h(iH);
        zg zgVar = this.f;
        bh bhVar = this.e;
        if (z2) {
            if (bhVar == null) {
                throw wi0.w("null verticalArrangement when isVertical == true");
            }
            fA = bhVar.a();
        } else {
            if (zgVar == null) {
                throw wi0.w("null horizontalAlignment when isVertical == false");
            }
            fA = zgVar.a();
        }
        int iR5 = ap2Var2.R(fA);
        int iA = q71Var.a();
        long j3 = (((long) iR) << 32) | (((long) iR3) & 4294967295L);
        int iH2 = z2 ? k00.h(j) - iR4 : k00.i(j) - i17;
        int i22 = i19;
        s71 s71Var2 = new s71(jI, this.b, q71Var, v61Var, iA, iR5, this.i, this.j, i22, i20, j3, this.a);
        q71 q71Var2 = s71Var2.b;
        u8 u8Var = q71Var2.d;
        uk2 uk2VarN = y02.n();
        vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
        uk2 uk2VarQ = y02.q(uk2VarN);
        try {
            int iH3 = b81Var.h();
            w51 w51Var = b81Var.e;
            int iU = ou.u(iH3, q71Var, w51Var.e);
            if (iH3 != iU) {
                w51Var.b.h(iU);
                w51Var.f.a(iH3);
            }
            int i23 = b81Var.i();
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
            ri1 ri1VarI = ys.i(q71Var, b81Var.s, b81Var.p);
            float fFloatValue = (ap2Var2.u() || !z) ? b81Var.h : ((Number) ((dd) b81Var.x.j).i.getValue()).floatValue();
            p61 p61Var = b81Var.o;
            boolean zU = ap2Var2.u();
            sj1 sj1Var = b81Var.w;
            boolean z3 = b81Var.i;
            if (i22 < 0) {
                dx0.a("invalid beforeContentPadding");
            }
            if (i20 < 0) {
                dx0.a("invalid afterContentPadding");
            }
            bg0 bg0Var = bg0.h;
            boolean z4 = this.b;
            x20 x20Var = this.g;
            ag0 ag0Var = ag0.h;
            if (iA <= 0) {
                int iK = k00.k(jI);
                int iJ = k00.j(jI);
                p61Var.c(iK, iJ, new ArrayList(), u8Var, s71Var2, z4, zU, 1, z, 0, 0);
                if (!zU) {
                    p61Var.b();
                    if (!zA) {
                        iK = l00.g(0, jI);
                        iJ = l00.f(0, jI);
                    }
                }
                ap2Var = ap2Var2;
                u71Var = new u71(null, 0, false, 0.0f, ap2Var2.g0(l00.g(iK + i17, j), l00.f(iJ + iR4, j), bg0Var, new vv0((byte) 19)), 0.0f, false, x20Var, v61Var, s71Var2.d, 0, ag0Var, -i22, iH2 + i20, 0, z4 ? ks1Var2 : ks1Var, i20, iR5);
            } else {
                s71 s71Var3 = s71Var2;
                if (iU >= iA) {
                    iU = iA - 1;
                    i23 = 0;
                }
                int iRound = Math.round(fFloatValue);
                int i24 = i23 - iRound;
                if (iU == 0 && i24 < 0) {
                    iRound += i24;
                    i24 = 0;
                }
                ih ihVar = new ih();
                int i25 = -i22;
                int i26 = (iR5 < 0 ? iR5 : 0) + i25;
                int iK2 = i24 + i26;
                int i27 = iU;
                int iMax = 0;
                while (true) {
                    j2 = s71Var3.d;
                    if (iK2 >= 0 || i27 <= 0) {
                        break;
                    }
                    float f3 = fFloatValue;
                    int i28 = i27 - 1;
                    v71 v71VarQ = s71Var3.q(i28, j2);
                    ihVar.add(0, v71VarQ);
                    iMax = Math.max(iMax, v71VarQ.r);
                    iK2 += v71VarQ.k();
                    i27 = i28;
                    fFloatValue = f3;
                }
                float f4 = fFloatValue;
                if (iK2 < i26) {
                    iRound -= i26 - iK2;
                    iK2 = i26;
                }
                int i29 = iRound;
                int i30 = iK2 - i26;
                int i31 = iH2 + i20;
                int i32 = i31 >= 0 ? i31 : 0;
                int i33 = iMax;
                int i34 = -i30;
                int iK3 = i30;
                int i35 = i27;
                int i36 = 0;
                boolean z5 = false;
                while (i36 < ihVar.j) {
                    if (i34 >= i32) {
                        ihVar.b(i36);
                        z5 = true;
                    } else {
                        i35++;
                        int iK4 = ((v71) ihVar.get(i36)).k() + i34;
                        i36++;
                        i34 = iK4;
                    }
                }
                int iMax2 = i33;
                boolean z6 = z5;
                int i37 = i35;
                while (i37 < iA && (i34 < i32 || i34 <= 0 || ihVar.isEmpty())) {
                    int i38 = i32;
                    v71 v71VarQ2 = s71Var3.q(i37, j2);
                    int iK5 = v71VarQ2.k() + i34;
                    if (iK5 <= i26) {
                        i16 = iK5;
                        if (i37 != iA - 1) {
                            iK3 -= v71VarQ2.k();
                            i27 = i37 + 1;
                            z6 = true;
                        }
                        i37++;
                        i32 = i38;
                        i34 = i16;
                    } else {
                        i16 = iK5;
                    }
                    int iMax3 = Math.max(iMax2, v71VarQ2.r);
                    ihVar.addLast(v71VarQ2);
                    iMax2 = iMax3;
                    i37++;
                    i32 = i38;
                    i34 = i16;
                }
                if (i34 < iH2) {
                    int i39 = iH2 - i34;
                    int i40 = i34 + i39;
                    int iK6 = iK3 - i39;
                    while (iK6 < i22 && i27 > 0) {
                        int i41 = i40;
                        int i42 = i27 - 1;
                        int i43 = i39;
                        v71 v71VarQ3 = s71Var3.q(i42, j2);
                        i27 = i42;
                        ihVar.add(0, v71VarQ3);
                        iMax2 = Math.max(iMax2, v71VarQ3.r);
                        iK6 += v71VarQ3.k();
                        i40 = i41;
                        i39 = i43;
                    }
                    int i44 = i40;
                    int i45 = i39;
                    i = i29;
                    int i46 = i + i45;
                    if (iK6 < 0) {
                        int i47 = i46 + iK6;
                        int i48 = i44 + iK6;
                        int i49 = i27;
                        i2 = iMax2;
                        i3 = i49;
                        i4 = i48;
                        i5 = i47;
                        i6 = 0;
                    } else {
                        int i50 = i27;
                        i2 = iMax2;
                        i3 = i50;
                        i6 = iK6;
                        i4 = i44;
                        i5 = i46;
                    }
                } else {
                    i = i29;
                    int i51 = i27;
                    i2 = iMax2;
                    i3 = i51;
                    i4 = i34;
                    i5 = i;
                    i6 = iK3;
                }
                if (Integer.signum(Math.round(f4)) != Integer.signum(i5) || Math.abs(Math.round(f4)) < Math.abs(i5)) {
                    i7 = i5;
                    f = f4;
                } else {
                    i7 = i5;
                    f = i7;
                }
                float f5 = f4 - f;
                float f6 = 0.0f;
                if (zU && i7 > i && f5 <= 0.0f) {
                    f6 = (i7 - i) + f5;
                }
                float f7 = f6;
                if (i6 < 0) {
                    dx0.a("negative currentFirstItemScrollOffset");
                }
                int i52 = -i6;
                v71 v71Var = (v71) ihVar.first();
                if (i22 > 0 || iR5 < 0) {
                    int i53 = i6;
                    int iA2 = ihVar.a();
                    int i54 = i53;
                    int i55 = 0;
                    while (i55 < iA2) {
                        int i56 = iA2;
                        int iK7 = ((v71) ihVar.get(i55)).k();
                        if (i54 == 0 || iK7 > i54 || i55 == ihVar.a() - 1) {
                            break;
                        }
                        i54 -= iK7;
                        i55++;
                        v71Var = (v71) ihVar.get(i55);
                        iA2 = i56;
                    }
                    i8 = i54;
                } else {
                    i8 = i6;
                }
                v71 v71Var2 = v71Var;
                int iMax4 = Math.max(0, i3);
                int i57 = i3 - 1;
                if (iMax4 <= i57) {
                    List arrayList5 = null;
                    while (true) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        f2 = f;
                        arrayList = arrayList5;
                        arrayList.add(s71Var3.q(i57, j2));
                        if (i57 == iMax4) {
                            break;
                        }
                        i57--;
                        arrayList5 = arrayList;
                        f = f2;
                    }
                } else {
                    f2 = f;
                    arrayList = null;
                }
                int[] iArr2 = ri1VarI.a;
                for (int i58 = ri1VarI.b - 1; -1 < i58; i58--) {
                    int i59 = iArr2[i58];
                    if (i59 < iMax4) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(s71Var3.q(i59, j2));
                    }
                }
                if (arrayList == null) {
                    arrayList = ag0Var;
                }
                int iMax5 = i2;
                int i60 = 0;
                for (int size = arrayList.size(); i60 < size; size = size) {
                    iMax5 = Math.max(iMax5, ((v71) arrayList.get(i60)).r);
                    i60++;
                }
                int iMin = Math.min(((v71) dv.F0(ihVar)).a, iA - 1);
                int i61 = ((v71) dv.F0(ihVar)).a + 1;
                if (i61 <= iMin) {
                    ArrayList arrayList6 = null;
                    while (true) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        i9 = iMax5;
                        i10 = i37;
                        arrayList2 = arrayList6;
                        arrayList2.add(s71Var3.q(i61, j2));
                        if (i61 == iMin) {
                            break;
                        }
                        i61++;
                        arrayList6 = arrayList2;
                        iMax5 = i9;
                        i37 = i10;
                    }
                } else {
                    i9 = iMax5;
                    i10 = i37;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((v71) dv.F0(arrayList2)).a > iMin) {
                    iMin = ((v71) dv.F0(arrayList2)).a;
                }
                int[] iArr3 = ri1VarI.a;
                int i62 = ri1VarI.b;
                List arrayList7 = arrayList2;
                int i63 = 0;
                while (i63 < i62) {
                    int i64 = i62;
                    int i65 = iArr3[i63];
                    if (i65 > iMin) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(s71Var3.q(i65, j2));
                    }
                    i63++;
                    i62 = i64;
                }
                if (arrayList7 == null) {
                    arrayList7 = ag0Var;
                }
                int size2 = arrayList7.size();
                int iMax6 = i9;
                for (int i66 = 0; i66 < size2; i66++) {
                    iMax6 = Math.max(iMax6, ((v71) arrayList7.get(i66)).r);
                }
                boolean z7 = uz0.g(v71Var2, ihVar.first()) && arrayList.isEmpty() && arrayList7.isEmpty();
                int iG = l00.g(z4 ? iMax6 : i4, jI);
                if (z4) {
                    iMax6 = i4;
                }
                int iF = l00.f(iMax6, jI);
                int i67 = z4 ? iF : iG;
                boolean z8 = i4 < Math.min(i67, iH2);
                if (z8 && i52 != 0) {
                    dx0.c("non-zero itemsScrollOffset");
                }
                boolean z9 = z7;
                ArrayList arrayList8 = new ArrayList(arrayList7.size() + arrayList.size() + ihVar.a());
                if (z8) {
                    if (!arrayList.isEmpty() || !arrayList7.isEmpty()) {
                        dx0.a("no extra items");
                    }
                    int iA3 = ihVar.a();
                    int[] iArr4 = new int[iA3];
                    for (int i68 = 0; i68 < iA3; i68++) {
                        iArr4[i68] = ((v71) ihVar.get(i68)).m;
                    }
                    int[] iArr5 = new int[iA3];
                    if (z4) {
                        if (bhVar == null) {
                            throw wi0.w("null verticalArrangement when isVertical == true");
                        }
                        bhVar.f(v61Var, i67, iArr4, iArr5);
                        iArr = iArr5;
                        i11 = 0;
                    } else {
                        if (zgVar == null) {
                            throw wi0.w("null horizontalArrangement when isVertical == false");
                        }
                        iArr = iArr5;
                        i11 = 0;
                        zgVar.d(v61Var, i67, iArr4, u31.h, iArr);
                    }
                    int i69 = gi.X(iArr).i;
                    if (i69 >= 0) {
                        int i70 = i11;
                        while (true) {
                            int i71 = iArr[i70];
                            v71 v71Var3 = (v71) ihVar.get(i70);
                            v71Var3.m(i71, iG, iF);
                            arrayList8.add(v71Var3);
                            if (i70 == i69) {
                                break;
                            }
                            i70++;
                        }
                    }
                    arrayList3 = r35;
                } else {
                    v71Var2 = v71Var2;
                    arrayList3 = arrayList8;
                    s71Var3 = s71Var3;
                    i11 = 0;
                    int size3 = arrayList.size();
                    int iK8 = i52;
                    for (int i72 = 0; i72 < size3; i72++) {
                        v71 v71Var4 = (v71) arrayList.get(i72);
                        iK8 -= v71Var4.k();
                        v71Var4.m(iK8, iG, iF);
                        arrayList3.add(v71Var4);
                    }
                    int iA4 = ihVar.a();
                    int iK9 = i52;
                    for (int i73 = 0; i73 < iA4; i73++) {
                        v71 v71Var5 = (v71) ihVar.get(i73);
                        v71Var5.m(iK9, iG, iF);
                        arrayList3.add(v71Var5);
                        iK9 += v71Var5.k();
                    }
                    int size4 = arrayList7.size();
                    for (int i74 = 0; i74 < size4; i74++) {
                        v71 v71Var6 = (v71) arrayList7.get(i74);
                        v71Var6.m(iK9, iG, iF);
                        arrayList3.add(v71Var6);
                        iK9 += v71Var6.k();
                    }
                }
                if (z3) {
                    arrayList4 = arrayList3;
                    i12 = iF;
                    i13 = i4;
                    s71Var = s71Var3;
                    i14 = i8;
                } else {
                    i14 = i8;
                    ArrayList arrayList9 = arrayList3;
                    int i75 = i4;
                    s71 s71Var4 = s71Var3;
                    p61Var.c(iG, iF, arrayList9, u8Var, s71Var4, z4, zU, 1, z, i14, i75);
                    i12 = iF;
                    arrayList4 = arrayList9;
                    s71Var = s71Var4;
                    i13 = i75;
                }
                if (zU) {
                    i15 = i12;
                } else {
                    p61Var.b();
                    if (zA) {
                        i15 = i12;
                    } else {
                        int i76 = z4 ? i12 : iG;
                        iG = l00.g(Math.max(iG, i11), jI);
                        int iF2 = l00.f(Math.max(i12, i11), jI);
                        int i77 = z4 ? iF2 : iG;
                        if (i77 != i76) {
                            int size5 = arrayList4.size();
                            for (int i78 = i11; i78 < size5; i78++) {
                                ((v71) arrayList4.get(i78)).t = i77;
                            }
                        }
                        i15 = iF2;
                    }
                }
                int i79 = iG;
                v71 v71Var7 = (v71) ihVar.e();
                int i80 = v71Var7 != null ? v71Var7.a : i11;
                v71 v71Var8 = (v71) ihVar.g();
                int i81 = v71Var8 != null ? v71Var8.a : i11;
                q71Var2.b.getClass();
                ArrayList arrayList10 = arrayList4;
                List listE = ys.e(this.h, i80, i81, arrayList10, ky0.a, i22, i79, i15, z4, new z61(s71Var, (byte) 2));
                if (z9) {
                    v71 v71Var9 = (v71) dv.y0(arrayList10);
                    if (v71Var9 != null) {
                        numValueOf = Integer.valueOf(v71Var9.a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    v71 v71Var10 = (v71) ihVar.e();
                    if (v71Var10 != null) {
                        numValueOf = Integer.valueOf(v71Var10.a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z9) {
                    v71 v71Var11 = (v71) dv.G0(arrayList10);
                    if (v71Var11 != null) {
                        numValueOf2 = Integer.valueOf(v71Var11.a);
                    } else {
                        numValueOf2 = null;
                    }
                } else {
                    v71 v71Var12 = (v71) ihVar.g();
                    if (v71Var12 != null) {
                        numValueOf2 = Integer.valueOf(v71Var12.a);
                    } else {
                        numValueOf2 = null;
                    }
                }
                boolean z10 = (i10 < r54 || i13 > iH2) ? 1 : i11;
                af1 af1VarG0 = ap2Var2.g0(l00.g(i79 + i17, j), l00.f(i15 + iR4, j), bg0Var, new s51(sj1Var, arrayList10, listE, zU, (byte) 1));
                List listT = t03.T(numValueOf != null ? numValueOf.intValue() : i11, numValueOf2 != null ? numValueOf2.intValue() : i11, arrayList10, listE);
                ks1 ks1Var3 = z4 ? ks1Var2 : ks1Var;
                int size6 = listE.size();
                int i82 = i11;
                int i83 = i82;
                while (i82 < size6) {
                    i83 += ((v71) listE.get(i82)).m;
                    i82++;
                }
                ap2Var = ap2Var2;
                u71Var = new u71(v71Var2, i14, z10, f2, af1VarG0, f7, z6, x20Var, v61Var, s71Var.d, i83, listT, i25, i31, iA, ks1Var3, i20, iR5);
            }
            b81Var.g(u71Var, ap2Var.u(), false);
            return u71Var;
        } catch (Throwable th) {
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
            throw th;
        }
    }
}
