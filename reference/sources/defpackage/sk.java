package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sk extends ei0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ sk(byte b) {
        this.a = b;
    }

    public static rj2 l(ii0 ii0Var) {
        boolean z;
        cs1 cs1Var;
        cs1 cs1Var2;
        cs1 cs1Var3;
        ArrayList arrayList;
        ii0 ii0Var2 = ii0Var;
        ds1 ds1Var = ii0Var2.a;
        wo1 wo1Var = oj2.C;
        Boolean bool = Boolean.TRUE;
        ds1Var.getClass();
        j5 j5Var = bool.equals(null) ? new j5((byte) 5) : new j5((byte) 6);
        wo1 wo1Var2 = rj2.m;
        List listJ = ii0Var2.j();
        List listI = ii0Var2.i();
        Set setF = ii0Var2.f();
        List<e33> list = (List) ii0Var2.c().collect(Collectors.toList());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (e33 e33Var : list) {
            if (e33Var.H()) {
                if (e33Var.u() && e33Var.l.signum() > 0) {
                    arrayList2.add(e33Var);
                }
                if (e33Var.r() && e33Var.j.signum() > 0) {
                    arrayList3.add(e33Var);
                }
            }
            if (e33Var.G()) {
                if (e33Var.u() && e33Var.l.signum() < 0) {
                    arrayList4.add(e33Var);
                }
                if (e33Var.r() && e33Var.j.signum() < 0) {
                    arrayList5.add(e33Var);
                }
            }
        }
        List list2 = (List) ii0Var2.d().map(new l5(setF, (byte) 2)).collect(Collectors.toList());
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Iterator it2 = it;
            zh0 zh0Var = (zh0) it.next();
            if (zh0Var.p()) {
                arrayList = arrayList4;
                if (zh0Var.l.signum() < 0) {
                    arrayList11.add(zh0Var);
                } else {
                    arrayList10.add(zh0Var);
                }
            } else {
                arrayList = arrayList4;
                if (zh0Var.r()) {
                    if (zh0Var.j.signum() < 0) {
                        arrayList9.add(zh0Var);
                    } else {
                        arrayList8.add(zh0Var);
                    }
                }
                if (zh0Var.u()) {
                    if (zh0Var.l.signum() < 0) {
                        arrayList7.add(zh0Var);
                    } else {
                        arrayList6.add(zh0Var);
                    }
                }
            }
            arrayList4 = arrayList;
            it = it2;
        }
        ArrayList arrayList12 = arrayList4;
        zh0 zh0VarG = ii0Var2.C().G(setF);
        int size = listJ.size();
        int size2 = listI.size();
        int size3 = arrayList5.size() + arrayList2.size() + arrayList9.size() + arrayList6.size();
        int size4 = arrayList3.size() + arrayList12.size() + arrayList8.size() + arrayList7.size();
        ea1 ea1Var = new ea1((arrayList11.size() + (arrayList10.size() + (size3 + size4))) - (arrayList11.size() + arrayList10.size()), arrayList11.size() + arrayList10.size(), size, size2, size4, size3, true);
        oj2 oj2Var = (oj2) j5Var.apply(ea1Var);
        double[] dArr = oj2Var.j;
        ArrayList arrayList13 = arrayList7;
        ArrayList arrayList14 = arrayList8;
        Arrays.fill(oj2Var.o, Double.POSITIVE_INFINITY);
        a90 a90VarF2 = oj2Var.d0();
        r22 r22VarG2 = oj2Var.i0();
        r22 r22VarO2 = oj2Var.y;
        if (r22VarO2 == null) {
            r22VarO2 = oj2Var.O2();
            oj2Var.y = r22VarO2;
        }
        int i = size + size2;
        int i2 = i + size4;
        ArrayList arrayList15 = arrayList11;
        oj2 oj2Var2 = oj2Var;
        for (int i3 = 0; i3 < listJ.size(); i3++) {
            ea1Var.j[i3] = ((e33) listJ.get(i3)).p.h;
        }
        for (int i4 = 0; i4 < listI.size(); i4++) {
            ea1Var.i[i4] = ((e33) listI.get(i4)).p.h;
        }
        ea1Var.a.j = zh0VarG.h();
        Iterator it3 = zh0VarG.u.keySet().iterator();
        while (true) {
            z = true;
            if (!it3.hasNext()) {
                break;
            }
            lo2 lo2Var = (lo2) it3.next();
            a90 a90Var = a90VarF2;
            double dM = ii0Var2.i == 1 ? -zh0VarG.M(lo2Var, true) : zh0VarG.M(lo2Var, true);
            int iR = ii0Var2.r(lo2Var.h);
            if (iR >= 0) {
                r22VarO2.o(iR, dM);
            }
            int iQ = ii0Var2.q(lo2Var.h);
            if (iQ >= 0) {
                r22VarO2.o(size + iQ, -dM);
            }
            arrayList10 = arrayList10;
            a90VarF2 = a90Var;
        }
        a90 a90Var2 = a90VarF2;
        ArrayList arrayList16 = arrayList10;
        int size5 = arrayList6.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            cs1Var = cs1.l;
            if (i5 >= size5) {
                break;
            }
            int i7 = i5 + 1;
            zh0 zh0Var2 = (zh0) arrayList6.get(i5);
            for (lo2 lo2Var2 : zh0Var2.u.keySet()) {
                double dM2 = zh0Var2.M(lo2Var2, z);
                int i8 = size;
                int i9 = i2;
                ArrayList arrayList17 = arrayList6;
                rj2.q(ii0Var2, a90Var2, i6, i8, lo2Var2, dM2);
                size = i8;
                arrayList16 = arrayList16;
                ii0Var2 = ii0Var;
                zh0Var2 = zh0Var2;
                size5 = size5;
                oj2Var2 = oj2Var2;
                arrayList6 = arrayList17;
                i2 = i9;
                z = true;
            }
            int i10 = i2;
            ArrayList arrayList18 = arrayList6;
            oj2 oj2Var3 = oj2Var2;
            int i11 = size5;
            zh0 zh0Var3 = zh0Var2;
            a90 a90Var3 = a90Var2;
            a90Var3.b0(h32.b, i6, i10);
            r22VarG2.o(i6, zh0Var3.n(true, Double.POSITIVE_INFINITY));
            ea1Var.a.d0(i6, zh0Var3, cs1Var, false, true);
            i6++;
            int i12 = i10 + 1;
            size = size;
            arrayList16 = arrayList16;
            a90Var2 = a90Var3;
            size5 = i11;
            i5 = i7;
            z = true;
            oj2Var2 = oj2Var3;
            arrayList6 = arrayList18;
            i2 = i12;
            ii0Var2 = ii0Var;
        }
        int i13 = size;
        ArrayList arrayList19 = arrayList16;
        oj2 oj2Var4 = oj2Var2;
        a90 a90Var4 = a90Var2;
        int size6 = arrayList9.size();
        int i14 = i2;
        int i15 = 0;
        while (true) {
            cs1Var2 = cs1.i;
            if (i15 >= size6) {
                break;
            }
            int i16 = i15 + 1;
            zh0 zh0Var4 = (zh0) arrayList9.get(i15);
            for (lo2 lo2Var3 : zh0Var4.u.keySet()) {
                a90Var4 = a90Var4;
                i6 = i6;
                rj2.q(ii0Var, a90Var4, i6, i13, lo2Var3, -zh0Var4.M(lo2Var3, true));
                zh0Var4 = zh0Var4;
                arrayList9 = arrayList9;
                size6 = size6;
            }
            int i17 = size6;
            zh0 zh0Var5 = zh0Var4;
            a90Var4.b0(h32.b, i6, i14);
            r22VarG2.o(i6, -zh0Var5.k(true));
            ea1Var.a.d0(i6, zh0Var5, cs1Var2, false, true);
            i6++;
            i14++;
            i15 = i16;
            arrayList9 = arrayList9;
            size6 = i17;
        }
        int i18 = 0;
        for (int size7 = arrayList2.size(); i18 < size7; size7 = size7) {
            e33 e33Var2 = (e33) arrayList2.get(i18);
            double d = h32.b;
            rj2.r(ii0Var, a90Var4, i6, i13, e33Var2, d);
            a90Var4.b0(d, i6, i14);
            r22VarG2.o(i6, e33Var2.n(false, Double.POSITIVE_INFINITY));
            ea1Var.a.d0(i6, e33Var2, cs1Var, false, false);
            i6++;
            i14++;
            i18++;
            arrayList2 = arrayList2;
        }
        int size8 = arrayList5.size();
        for (int i19 = 0; i19 < size8; i19++) {
            e33 e33Var3 = (e33) arrayList5.get(i19);
            rj2.r(ii0Var, a90Var4, i6, i13, e33Var3, h32.e);
            a90Var4.b0(h32.b, i6, i14);
            r22VarG2.o(i6, -e33Var3.k(false));
            ea1Var.a.d0(i6, e33Var3, cs1Var2, false, false);
            i6++;
            i14++;
        }
        int size9 = arrayList14.size();
        int i20 = i;
        int i21 = 0;
        while (i21 < size9) {
            ArrayList arrayList20 = arrayList14;
            int i22 = i21 + 1;
            zh0 zh0Var6 = (zh0) arrayList20.get(i21);
            for (lo2 lo2Var4 : zh0Var6.u.keySet()) {
                rj2.q(ii0Var, a90Var4, i6, i13, lo2Var4, zh0Var6.M(lo2Var4, true));
                size9 = size9;
            }
            a90Var4.b0(h32.e, i6, i20);
            r22VarG2.o(i6, zh0Var6.k(true));
            ea1Var.a.d0(i6, zh0Var6, cs1Var2, true, true);
            i6++;
            i20++;
            arrayList14 = arrayList20;
            i21 = i22;
            size9 = size9;
        }
        int size10 = arrayList13.size();
        int i23 = 0;
        while (i23 < size10) {
            ArrayList arrayList21 = arrayList13;
            int i24 = i23 + 1;
            zh0 zh0Var7 = (zh0) arrayList21.get(i23);
            for (lo2 lo2Var5 : zh0Var7.u.keySet()) {
                rj2.q(ii0Var, a90Var4, i6, i13, lo2Var5, -zh0Var7.M(lo2Var5, true));
                size10 = size10;
            }
            a90Var4.b0(h32.e, i6, i20);
            r22VarG2.o(i6, -zh0Var7.n(true, Double.POSITIVE_INFINITY));
            ea1Var.a.d0(i6, zh0Var7, cs1Var, true, true);
            i6++;
            i20++;
            arrayList13 = arrayList21;
            i23 = i24;
            size10 = size10;
            a90Var4 = a90Var4;
        }
        a90 a90Var5 = a90Var4;
        int size11 = arrayList3.size();
        for (int i25 = 0; i25 < size11; i25++) {
            e33 e33Var4 = (e33) arrayList3.get(i25);
            rj2.r(ii0Var, a90Var5, i6, i13, e33Var4, h32.b);
            a90Var5.b0(h32.e, i6, i20);
            r22VarG2.o(i6, e33Var4.k(false));
            ea1Var.a.d0(i6, e33Var4, cs1Var2, true, false);
            i6++;
            i20++;
        }
        a90 a90Var6 = a90Var5;
        int size12 = arrayList12.size();
        int i26 = 0;
        while (i26 < size12) {
            e33 e33Var5 = (e33) arrayList12.get(i26);
            double d2 = h32.e;
            rj2.r(ii0Var, a90Var6, i6, i13, e33Var5, d2);
            a90Var6.b0(d2, i6, i20);
            r22VarG2.o(i6, -e33Var5.n(false, Double.POSITIVE_INFINITY));
            ea1Var.a.d0(i6, e33Var5, cs1Var, true, false);
            i6++;
            i20++;
            i26++;
            a90Var6 = a90Var6;
        }
        a90 a90Var7 = a90Var6;
        int size13 = arrayList19.size();
        int i27 = 0;
        while (true) {
            cs1Var3 = cs1.h;
            if (i27 >= size13) {
                break;
            }
            ArrayList arrayList22 = arrayList19;
            int i28 = i27 + 1;
            zh0 zh0Var8 = (zh0) arrayList22.get(i27);
            for (lo2 lo2Var6 : zh0Var8.u.keySet()) {
                rj2.q(ii0Var, a90Var7, i6, i13, lo2Var6, zh0Var8.M(lo2Var6, true));
            }
            r22VarG2.o(i6, zh0Var8.n(true, Double.POSITIVE_INFINITY));
            ea1Var.a.d0(i6, zh0Var8, cs1Var3, false, true);
            i6++;
            arrayList19 = arrayList22;
            i27 = i28;
        }
        int size14 = arrayList15.size();
        int i29 = 0;
        while (i29 < size14) {
            ArrayList arrayList23 = arrayList15;
            int i30 = i29 + 1;
            zh0 zh0Var9 = (zh0) arrayList23.get(i29);
            for (lo2 lo2Var7 : zh0Var9.u.keySet()) {
                rj2.q(ii0Var, a90Var7, i6, i13, lo2Var7, -zh0Var9.M(lo2Var7, true));
            }
            r22VarG2.o(i6, -zh0Var9.k(true));
            ea1Var.a.d0(i6, zh0Var9, cs1Var3, true, true);
            i6++;
            arrayList15 = arrayList23;
            i29 = i30;
        }
        return new rj2(oj2Var4, ds1Var);
    }

    @Override // defpackage.ei0
    public final hs1 a(ii0 ii0Var) {
        o5 o5Var;
        cs1 cs1Var;
        cs1 cs1Var2;
        cs1 cs1Var3;
        ii0 ii0Var2 = ii0Var;
        byte b = 1;
        switch (this.a) {
            case 0:
                return k(ii0Var);
            case 1:
                ds1 ds1Var = ii0Var2.a;
                ds1Var.j.getClass();
                int size = ii0Var2.o.size();
                int size2 = ii0Var2.c.size();
                char c = (size2 > size * 50 || (size <= size2 * 100 && size2 + size < 826)) ? (char) 1 : (char) 2;
                fi0 fi0Var = fi0.h;
                if (c == 1) {
                    ii0Var2.G(fi0Var, false);
                    return tk.o.k(ii0Var2);
                }
                if (c != 2) {
                    li1.g("Unknown algorithm: ".concat(c != 1 ? c != 2 ? "null" : "ADMM" : "ACTIVE_SET"));
                    return null;
                }
                ii0Var2.G(fi0Var, true);
                ds1Var.j.getClass();
                g52 g52Var = l52.q;
                g52 g52Var2 = l52.q;
                List listG = ii0Var2.g();
                Set setF = ii0Var2.f();
                zh0 zh0VarG = ii0Var2.C().G(setF);
                byte b2 = 0;
                zh0[] zh0VarArr = (zh0[]) ii0Var2.d().map(new l5(setF, (byte) 0)).filter(new m5(b2)).toArray(new n5(b2));
                byte b3 = 1;
                e33[] e33VarArr = (e33[]) listG.stream().filter(new m5(b3)).toArray(new n5(b3));
                int size3 = listG.size();
                o5 o5Var2 = new o5(zh0VarArr.length + e33VarArr.length, size3);
                gy1 gy1Var = (gy1) o5Var2.e;
                gy1 gy1Var2 = (gy1) o5Var2.c;
                cw cwVar = (cw) o5Var2.a;
                t5 t5Var = (t5) o5Var2.f;
                for (int i = 0; i < size3; i++) {
                    t5Var.d[i] = ((e33) listG.get(i)).p.h;
                }
                boolean z = ii0Var2.i == 1;
                t5Var.c.j = zh0VarG.h();
                for (lo2 lo2Var : zh0VarG.u.keySet()) {
                    int iO = ii0Var2.o(lo2Var.h);
                    if (iO >= 0 && iO < size3) {
                        BigDecimal bigDecimalO = zh0VarG.O(lo2Var, true);
                        if (z) {
                            bigDecimalO = bigDecimalO.negate();
                        }
                        ((gy1) o5Var2.d).B(iO, bigDecimalO);
                    }
                    gy1Var = gy1Var;
                }
                zj1 zj1Var = gy1Var;
                Map map = zh0VarG.x;
                Iterator it = (map != null ? map.keySet() : Collections.EMPTY_SET).iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    li1.c();
                    o5Var = null;
                } else {
                    int length = zh0VarArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        cs1 cs1Var4 = cs1.j;
                        cs1 cs1Var5 = cs1.l;
                        cs1 cs1Var6 = cs1.i;
                        cs1 cs1Var7 = cs1.k;
                        cs1 cs1Var8 = cs1.h;
                        if (i3 < length) {
                            int i4 = length;
                            zh0 zh0Var = zh0VarArr[i3];
                            zh0[] zh0VarArr2 = zh0VarArr;
                            Iterator it2 = zh0Var.u.keySet().iterator();
                            while (it2.hasNext()) {
                                Iterator it3 = it2;
                                lo2 lo2Var2 = (lo2) it2.next();
                                int i5 = i3;
                                int iO2 = ii0Var2.o(lo2Var2.h);
                                if (iO2 < 0 || iO2 >= size3) {
                                    cs1Var3 = cs1Var4;
                                } else {
                                    cs1Var3 = cs1Var4;
                                    cwVar.y0(i2, iO2, zh0Var.O(lo2Var2, true));
                                }
                                it2 = it3;
                                cs1Var4 = cs1Var3;
                                i3 = i5;
                                size3 = size3;
                            }
                            int i6 = i3;
                            int i7 = size3;
                            cs1 cs1Var9 = cs1Var4;
                            BigDecimal bigDecimal = p5.e;
                            BigDecimal bigDecimalNegate = bigDecimal.negate();
                            BigDecimal bigDecimalI = zh0Var.i(true);
                            if (bigDecimalI != null) {
                                bigDecimalNegate = bigDecimalI;
                            }
                            BigDecimal bigDecimalM = zh0Var.m(true);
                            if (bigDecimalM != null) {
                                bigDecimal = bigDecimalM;
                            }
                            BigDecimal bigDecimal2 = zh0Var.j;
                            BigDecimal bigDecimal3 = zh0Var.l;
                            if (bigDecimal2 == null) {
                                cs1Var2 = bigDecimal3 != null ? cs1Var5 : cs1Var9;
                            } else if (bigDecimal3 != null) {
                                cs1Var2 = bigDecimal2.compareTo(bigDecimal3) == 0 ? cs1Var8 : cs1Var7;
                            } else {
                                cs1Var2 = cs1Var6;
                            }
                            long j = i2;
                            gy1Var2.B(j, bigDecimalNegate);
                            zj1Var.B(j, bigDecimal);
                            t5Var.c.d0(i2, zh0Var, cs1Var2, false, true);
                            i2++;
                            zh0VarArr = zh0VarArr2;
                            size3 = i7;
                            i3 = i6 + 1;
                            length = i4;
                        } else {
                            int length2 = e33VarArr.length;
                            int i8 = 0;
                            while (i8 < length2) {
                                e33 e33Var = e33VarArr[i8];
                                int iP = ii0Var2.p(e33Var);
                                BigDecimal bigDecimal4 = om.b;
                                int i9 = length2;
                                long j2 = i2;
                                cwVar.y0(j2, iP, bigDecimal4);
                                BigDecimal bigDecimal5 = p5.e;
                                BigDecimal bigDecimalNegate2 = bigDecimal5.negate();
                                int i10 = i2;
                                BigDecimal bigDecimal6 = e33Var.j;
                                int i11 = i8;
                                BigDecimal bigDecimal7 = bigDecimal6 != null ? bigDecimal6 : bigDecimalNegate2;
                                e33[] e33VarArr2 = e33VarArr;
                                BigDecimal bigDecimal8 = e33Var.l;
                                BigDecimal bigDecimal9 = bigDecimal8 != null ? bigDecimal8 : bigDecimal5;
                                if (bigDecimal6 == null) {
                                    cs1Var = bigDecimal8 != null ? cs1Var5 : cs1Var4;
                                } else if (bigDecimal8 != null) {
                                    cs1Var = bigDecimal6.compareTo(bigDecimal8) == 0 ? cs1Var8 : cs1Var7;
                                } else {
                                    cs1Var = cs1Var6;
                                }
                                gy1Var2.B(j2, bigDecimal7);
                                zj1Var.B(j2, bigDecimal9);
                                t5Var.c.d0(i10, e33Var, cs1Var, false, false);
                                double dDoubleValue = bigDecimal4.doubleValue();
                                t5Var.a[iP] = i10;
                                t5Var.b[iP] = dDoubleValue;
                                i2 = i10 + 1;
                                i8 = i11 + 1;
                                e33VarArr = e33VarArr2;
                                ii0Var2 = ii0Var;
                                length2 = i9;
                            }
                            o5Var = o5Var2;
                        }
                    }
                }
                return new v5(new q5((cw) o5Var.b, (gy1) o5Var.d, (cw) o5Var.a, (gy1) o5Var.c, (gy1) o5Var.e), ds1Var, (t5) o5Var.f);
            case 2:
                return new zy0(ii0Var2);
            case 3:
                Boolean bool = Boolean.FALSE;
                ii0Var2.a.l.getClass();
                boolean zEquals = bool.equals(null);
                ii0Var2.G(fi0.i, !zEquals);
                if (zEquals) {
                    return l(ii0Var2);
                }
                ds1 ds1Var2 = ii0Var2.a;
                wo1 wo1Var = lj2.v;
                yy0 yy0Var = new yy0(ds1Var2, b);
                wo1 wo1Var2 = ey1.B;
                Set setF2 = ii0Var2.f();
                List listG2 = ii0Var2.g();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ii0Var2.d().map(new l5(setF2, (byte) 1)).forEach(new xy0(arrayList, arrayList2, arrayList3, (byte) 1));
                zh0 zh0VarG2 = ii0Var2.C().G(setF2);
                int size4 = arrayList3.size();
                int size5 = arrayList2.size();
                int size6 = arrayList.size();
                int size7 = listG2.size();
                int i12 = size4 + size5;
                ea1 ea1Var = new ea1(i12, size6, size7, 0, 0, i12, true);
                lj2 lj2Var = (lj2) yy0Var.apply(ea1Var);
                double[] dArr = lj2Var.j;
                double[] dArr2 = lj2Var.o;
                dk1 dk1VarD0 = lj2Var.d0();
                zj1 zj1VarI0 = lj2Var.i0();
                zj1 zj1VarM2 = lj2Var.m2();
                ArrayList arrayList4 = arrayList;
                int i13 = 0;
                while (i13 < size4) {
                    zh0 zh0Var2 = (zh0) arrayList3.get(i13);
                    Iterator it4 = zh0Var2.u.keySet().iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = it4;
                        lo2 lo2Var3 = (lo2) it4.next();
                        dk1VarD0.b0(zh0Var2.M(lo2Var3, true), i13, ii0Var2.o(lo2Var3.h));
                        it4 = it5;
                        arrayList3 = arrayList3;
                        size4 = size4;
                        size6 = size6;
                        zj1VarM2 = zj1VarM2;
                    }
                    int i14 = size7 + i13;
                    dk1VarD0.b0(h32.b, i13, i14);
                    zj1VarI0.o(i13, zh0Var2.n(true, Double.POSITIVE_INFINITY));
                    dArr[i14] = h32.a;
                    dArr2[i14] = Double.POSITIVE_INFINITY;
                    int i15 = i13;
                    ea1Var.a.d0(i15, zh0Var2, cs1.l, false, true);
                    i13 = i15 + 1;
                    zh0VarG2 = zh0VarG2;
                    arrayList3 = arrayList3;
                    size4 = size4;
                    size6 = size6;
                    zj1VarM2 = zj1VarM2;
                    dk1VarD0 = dk1VarD0;
                }
                zh0 zh0Var3 = zh0VarG2;
                dk1 dk1Var = dk1VarD0;
                int i16 = size4;
                zj1 zj1Var2 = zj1VarM2;
                int i17 = size6;
                for (int i18 = 0; i18 < size5; i18++) {
                    zh0 zh0Var4 = (zh0) arrayList2.get(i18);
                    for (lo2 lo2Var4 : zh0Var4.u.keySet()) {
                        dk1Var.b0(zh0Var4.M(lo2Var4, true), i16 + i18, ii0Var2.o(lo2Var4.h));
                    }
                    int i19 = i16 + i18;
                    int i20 = size7 + i16 + i18;
                    dk1Var.b0(h32.b, i19, i20);
                    zj1VarI0.o(i19, zh0Var4.k(true));
                    dArr[i20] = Double.NEGATIVE_INFINITY;
                    dArr2[i20] = h32.a;
                    ea1Var.a.d0(i19, zh0Var4, cs1.i, true, true);
                }
                int i21 = 0;
                while (i21 < i17) {
                    ArrayList arrayList5 = arrayList4;
                    zh0 zh0Var5 = (zh0) arrayList5.get(i21);
                    for (lo2 lo2Var5 : zh0Var5.u.keySet()) {
                        int i22 = i21;
                        dk1Var.b0(zh0Var5.M(lo2Var5, true), i12 + i22, ii0Var2.o(lo2Var5.h));
                        i21 = i22;
                        arrayList5 = arrayList5;
                    }
                    int i23 = i21;
                    arrayList4 = arrayList5;
                    int i24 = i12 + i23;
                    int i25 = size7 + i12 + i23;
                    dk1Var.b0(h32.b, i24, i25);
                    double d = h32.a;
                    zj1VarI0.o(i24, zh0Var5.n(true, d));
                    dArr[i25] = d;
                    dArr2[i25] = d;
                    ea1Var.a.d0(i24, zh0Var5, cs1.h, false, true);
                    i21 = i23 + 1;
                    zh0Var3 = zh0Var3;
                }
                zh0 zh0Var6 = zh0Var3;
                for (int i26 = 0; i26 < size7; i26++) {
                    e33 e33Var2 = (e33) listG2.get(i26);
                    dArr[i26] = e33Var2.k(false);
                    dArr2[i26] = e33Var2.n(false, Double.POSITIVE_INFINITY);
                    ea1Var.j[i26] = e33Var2.p.h;
                }
                ea1Var.a.j = zh0Var6.h();
                boolean z2 = true;
                boolean z3 = ii0Var2.i == 1;
                for (lo2 lo2Var6 : zh0Var6.u.keySet()) {
                    double dM = zh0Var6.M(lo2Var6, z2);
                    int iO3 = ii0Var2.o(lo2Var6.h);
                    if (z3) {
                        dM = -dM;
                    }
                    zj1 zj1Var3 = zj1Var2;
                    zj1Var3.o(iO3, dM);
                    zj1Var2 = zj1Var3;
                    z2 = true;
                }
                lj2Var.F0(ds1Var2.l);
                return new ey1(ds1Var2, lj2Var);
            default:
                return l(ii0Var2);
        }
    }

    @Override // defpackage.ei0
    public final int d(ii0 ii0Var, e33 e33Var) {
        int iQ;
        int iR;
        switch (this.a) {
            case 1:
                return ii0Var.p(e33Var);
            case 2:
            default:
                return super.d(ii0Var, e33Var);
            case 3:
                if (ii0Var.x(fi0.i)) {
                    return ii0Var.p(e33Var);
                }
                BigDecimal bigDecimalE = e33Var.E();
                int i = e33Var.p.h;
                if (((bigDecimalE != null && bigDecimalE.signum() >= 0) || e33Var.H()) && (iR = ii0Var.r(i)) >= 0) {
                    return iR;
                }
                if (((bigDecimalE == null || bigDecimalE.signum() > 0) && !e33Var.G()) || (iQ = ii0Var.q(i)) < 0) {
                    return -1;
                }
                return ii0Var.j().size() + iQ;
            case 4:
                BigDecimal bigDecimalE2 = e33Var.E();
                int i2 = e33Var.p.h;
                if ((bigDecimalE2 != null && bigDecimalE2.signum() >= 0) || e33Var.H()) {
                    ii0Var.getClass();
                    int iR2 = ii0Var.r(i2);
                    if (iR2 >= 0) {
                        return iR2;
                    }
                }
                if ((bigDecimalE2 == null || bigDecimalE2.signum() > 0) && !e33Var.G()) {
                    return -1;
                }
                ii0Var.getClass();
                int iQ2 = ii0Var.q(i2);
                if (iQ2 >= 0) {
                    return ii0Var.j().size() + iQ2;
                }
                return -1;
        }
    }

    @Override // defpackage.ei0
    public final boolean e(ii0 ii0Var) {
        switch (this.a) {
            case 0:
                return m(ii0Var);
            case 1:
                return tk.o.m(ii0Var) || !(ii0Var.v() || !ii0Var.u() || ii0Var.s());
            case 2:
                return !ii0Var.s();
            case 3:
                return ((ii0Var.v() || ii0Var.t()) && (ii0Var.v() || ii0Var.t())) ? false : true;
            default:
                return (ii0Var.v() || ii0Var.t()) ? false : true;
        }
    }

    @Override // defpackage.ei0
    public final gs1 f(gs1 gs1Var, ii0 ii0Var) {
        switch (this.a) {
            case 3:
            case 4:
                return null;
            default:
                return super.f(gs1Var, ii0Var);
        }
    }

    @Override // defpackage.ei0
    public final gs1 i(final gs1 gs1Var, final ii0 ii0Var) {
        gs1 gs1Var2;
        gs1 gs1Var3;
        byte b = this.a;
        is1 is1Var = is1.INFEASIBLE;
        switch (b) {
            case 0:
                if (gs1Var.m == is1Var) {
                    gs1Var2 = new gs1(is1Var, gs1Var.n, gs1Var);
                } else {
                    ei0.h(gs1Var, ii0Var);
                    gs1Var2 = gs1Var;
                }
                ii0Var.a.j.getClass();
                return ei0.c(gs1Var2, ii0Var, xh.k, Optional.ofNullable(gs1Var2.k));
            case 1:
                if (!ii0Var.x(fi0.h)) {
                    return tk.o.i(gs1Var, ii0Var);
                }
                if (gs1Var.m == is1Var) {
                    gs1Var3 = new gs1(is1Var, gs1Var.n, gs1Var);
                } else {
                    ei0.h(gs1Var, ii0Var);
                    gs1Var3 = gs1Var;
                }
                ii0Var.a.j.getClass();
                gs1 gs1VarC = ei0.c(gs1Var3, ii0Var, xh.k, Optional.ofNullable(gs1Var3.k));
                return (gs1VarC.m == is1.APPROXIMATE && ii0Var.H(gs1VarC)) ? gs1VarC.f1(is1.OPTIMAL) : gs1VarC;
            case 2:
            default:
                return gs1Var;
            case 3:
                if (!ii0Var.x(fi0.i)) {
                    return da1.i.i(gs1Var, ii0Var);
                }
                ei0.h(gs1Var, ii0Var);
                return ei0.c(gs1Var, ii0Var, xh.k, Optional.ofNullable(gs1Var.k));
            case 4:
                final xh xhVarL2 = xh.l2(ii0Var.o.size());
                double[] dArr = xhVarL2.j;
                Iterator it = ii0Var.f().iterator();
                while (it.hasNext()) {
                    int i = ((lo2) it.next()).h;
                    dArr[i] = ii0Var.k(i).E().doubleValue();
                }
                List listJ = ii0Var.j();
                boolean z = false;
                for (int i2 = 0; i2 < listJ.size(); i2++) {
                    dArr[((e33) listJ.get(i2)).p.h] = gs1Var.l.A(i2);
                }
                List listI = ii0Var.i();
                for (int i3 = 0; i3 < listI.size(); i3++) {
                    xhVarL2.f(((e33) listI.get(i3)).p.h, -gs1Var.l.A(listJ.size() + i3));
                }
                int i4 = ii0Var.i;
                if (i4 != 0 && 2 != i4) {
                    z = true;
                }
                final boolean z2 = z;
                ei0.h(gs1Var, ii0Var);
                gs1 gs1VarA1 = gs1Var.a1(xhVarL2);
                if (z2) {
                    gs1VarA1 = gs1VarA1.u1(-gs1VarA1.n);
                }
                gs1 gs1VarU1 = gs1VarA1.u1(gs1VarA1.n + ii0Var.g.doubleValue());
                final Optional optionalOfNullable = Optional.ofNullable(gs1Var.k);
                if (optionalOfNullable.isPresent()) {
                    gs1VarU1.k = new Supplier(optionalOfNullable, ii0Var, z2, gs1Var, xhVarL2) { // from class: ca1
                        public final /* synthetic */ Optional a;
                        public final /* synthetic */ ii0 b;
                        public final /* synthetic */ boolean c;
                        public final /* synthetic */ gs1 d;

                        @Override // java.util.function.Supplier
                        public final Object get() {
                            a1 a1Var = (a1) ((Supplier) this.a.get()).get();
                            ii0 ii0Var2 = this.b;
                            int size = ii0Var2.o.size();
                            double[] dArr2 = new double[size];
                            List listJ2 = ii0Var2.j();
                            int size2 = listJ2.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                dArr2[((e33) listJ2.get(i5)).p.h] = a1Var.A(i5);
                            }
                            List listI2 = ii0Var2.i();
                            for (int i6 = 0; i6 < listI2.size(); i6++) {
                                e33 e33Var = (e33) listI2.get(i6);
                                if (!e33Var.H()) {
                                    dArr2[e33Var.p.h] = -a1Var.A(size2 + i6);
                                }
                            }
                            if (this.c) {
                                for (int i7 = 0; i7 < size; i7++) {
                                    dArr2[i7] = -dArr2[i7];
                                }
                            }
                            Iterator it2 = ii0Var2.f().iterator();
                            while (it2.hasNext()) {
                                int i8 = ((lo2) it2.next()).h;
                                dArr2[i8] = ei0.b(ii0Var2, i8, this.d);
                            }
                            return new xh(dArr2);
                        }
                    };
                }
                return gs1VarU1;
        }
    }

    @Override // defpackage.ei0
    public final gs1 j(gs1 gs1Var, ii0 ii0Var) {
        switch (this.a) {
            case 0:
                return ei0.g(gs1Var, ii0Var, xh.k);
            case 1:
                if (ii0Var.x(fi0.h)) {
                    return ei0.g(gs1Var, ii0Var, xh.k);
                }
                tk.o.getClass();
                return ei0.g(gs1Var, ii0Var, xh.k);
            case 2:
            default:
                return gs1Var;
            case 3:
                return ii0Var.x(fi0.i) ? ei0.g(gs1Var, ii0Var, xh.k) : da1.i.j(gs1Var, ii0Var);
            case 4:
                List listJ = ii0Var.j();
                List listI = ii0Var.i();
                int size = listJ.size();
                int size2 = listI.size();
                xh xhVarL2 = xh.l2(size + size2);
                double[] dArr = xhVarL2.j;
                for (int i = 0; i < size; i++) {
                    int i2 = ((e33) listJ.get(i)).p.h;
                    f32 f32Var = h32.A;
                    double dA = gs1Var.l.A(i2);
                    double d = h32.a;
                    f32Var.getClass();
                    dArr[i] = Math.max(dA, d);
                }
                for (int i3 = 0; i3 < size2; i3++) {
                    int i4 = ((e33) listI.get(i3)).p.h;
                    f32 f32Var2 = h32.A;
                    double d2 = -gs1Var.l.A(i4);
                    double d3 = h32.a;
                    f32Var2.getClass();
                    dArr[size + i3] = Math.max(d2, d3);
                }
                return gs1Var.a1(xhVarL2);
        }
    }

    public final r10 k(ii0 ii0Var) {
        m00 m00Var;
        eg egVar;
        boolean z;
        cs1 cs1Var;
        ya2 ya2Var;
        cs1 cs1Var2;
        ds1 ds1Var = ii0Var.a;
        ds1Var.j.getClass();
        g52 g52Var = l52.q;
        List listG = ii0Var.g();
        Set setF = ii0Var.f();
        int size = listG.size();
        List list = (List) ii0Var.d().filter(new m5((byte) 2)).collect(Collectors.toList());
        int size2 = list.size();
        List list2 = (List) ii0Var.d().filter(new m5((byte) 3)).collect(Collectors.toList());
        int size3 = list2.size();
        List list3 = (List) ii0Var.c().filter(new m5((byte) 4)).collect(Collectors.toList());
        int size4 = list3.size();
        List list4 = (List) ii0Var.d().filter(new m5((byte) 5)).collect(Collectors.toList());
        int size5 = list4.size();
        List list5 = (List) ii0Var.c().filter(new m5((byte) 6)).collect(Collectors.toList());
        int size6 = list5.size();
        int i = size3 + size4;
        int i2 = i + size5;
        List list6 = list5;
        o10 o10Var = new o10(size, size2, i2 + size6, true);
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3;
            o10Var.g[i4] = ((e33) listG.get(i3)).p.h;
            i3 = i4 + 1;
        }
        zh0 zh0VarG = ii0Var.C().G(setF);
        boolean z2 = ii0Var.i == 1;
        double dH = zh0VarG.h();
        boolean z3 = z2;
        m00 m00Var2 = o10Var.e;
        m00Var2.j = dH;
        if (zh0VarG.U()) {
            Map map = zh0VarG.x;
            Iterator it = (map != null ? map.keySet() : Collections.EMPTY_SET).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                li1.c();
                return null;
            }
        }
        boolean zT = zh0VarG.T();
        eg egVar2 = o10Var.f;
        if (zT) {
            HashMap map2 = zh0VarG.u;
            if (z3) {
                Iterator it2 = map2.keySet().iterator();
                z = false;
                while (it2.hasNext()) {
                    m00 m00Var3 = m00Var2;
                    lo2 lo2Var = (lo2) it2.next();
                    eg egVar3 = egVar2;
                    egVar3.u().y0(ii0Var.o(lo2Var.h), 0L, zh0VarG.O(lo2Var, true));
                    m00Var2 = m00Var3;
                    it2 = it2;
                    egVar2 = egVar3;
                    z = true;
                }
                m00Var = m00Var2;
                egVar = egVar2;
            } else {
                m00Var = m00Var2;
                egVar = egVar2;
                Iterator it3 = map2.keySet().iterator();
                boolean z4 = false;
                while (it3.hasNext()) {
                    lo2 lo2Var2 = (lo2) it3.next();
                    egVar.u().y0(ii0Var.o(lo2Var2.h), 0L, zh0VarG.O(lo2Var2, true).negate());
                    it3 = it3;
                    z4 = true;
                }
                z = z4;
            }
        } else {
            m00Var = m00Var2;
            egVar = egVar2;
            z = false;
        }
        if (!z) {
            for (int i5 = 0; i5 < size; i5++) {
                long j = i5;
                egVar.y().y0(j, j, om.b);
            }
        }
        int i6 = 0;
        while (i6 < size2) {
            zh0 zh0VarG2 = ((zh0) list.get(i6)).G(setF);
            Iterator it4 = zh0VarG2.u.keySet().iterator();
            while (it4.hasNext()) {
                lo2 lo2Var3 = (lo2) it4.next();
                o10Var.a.a0(i6).B(ii0Var.o(lo2Var3.h), zh0VarG2.O(lo2Var3, true));
                it4 = it4;
                list = list;
                size2 = size2;
            }
            List list7 = list;
            int i7 = size2;
            BigDecimal bigDecimal = om.P;
            BigDecimal bigDecimalM = zh0VarG2.m(true);
            o10Var.c.y0(i6, 0L, bigDecimalM != null ? bigDecimalM : bigDecimal);
            m00 m00Var4 = m00Var;
            int i8 = i6;
            m00Var4.d0(i8, zh0VarG2, cs1.h, false, true);
            i6 = i8 + 1;
            m00Var = m00Var4;
            list = list7;
            size2 = i7;
        }
        int i9 = 0;
        while (true) {
            cs1Var = cs1.l;
            ya2Var = o10Var.b;
            if (i9 >= size3) {
                break;
            }
            zh0 zh0VarG3 = ((zh0) list2.get(i9)).G(setF);
            for (lo2 lo2Var4 : zh0VarG3.u.keySet()) {
                ya2Var.a0(i9).B(ii0Var.o(lo2Var4.h), zh0VarG3.O(lo2Var4, true));
                list2 = list2;
                size3 = size3;
            }
            List list8 = list2;
            int i10 = size3;
            BigDecimal bigDecimal2 = om.P;
            BigDecimal bigDecimalM2 = zh0VarG3.m(true);
            int i11 = i9;
            o10Var.k(i11, zh0VarG3, cs1Var, bigDecimalM2 != null ? bigDecimalM2 : bigDecimal2, false, true);
            i9 = i11 + 1;
            list2 = list8;
            size3 = i10;
        }
        int i12 = size3;
        for (int i13 = 0; i13 < size4; i13++) {
            e33 e33Var = (e33) list3.get(i13);
            int i14 = i12 + i13;
            ya2Var.a0(i14).o(ii0Var.p(e33Var), h32.b);
            BigDecimal bigDecimal3 = om.P;
            BigDecimal bigDecimal4 = e33Var.l;
            o10Var.k(i14, e33Var, cs1Var, bigDecimal4 != null ? bigDecimal4 : bigDecimal3, false, false);
        }
        int i15 = 0;
        while (true) {
            cs1Var2 = cs1.i;
            if (i15 >= size5) {
                break;
            }
            zh0 zh0VarG4 = ((zh0) list4.get(i15)).G(setF);
            for (lo2 lo2Var5 : zh0VarG4.u.keySet()) {
                ya2Var.a0(i + i15).B(ii0Var.o(lo2Var5.h), zh0VarG4.O(lo2Var5, true).negate());
            }
            int i16 = i + i15;
            BigDecimal bigDecimal5 = om.Q;
            BigDecimal bigDecimalI = zh0VarG4.i(true);
            if (bigDecimalI != null) {
                bigDecimal5 = bigDecimalI;
            }
            o10Var.k(i16, zh0VarG4, cs1Var2, bigDecimal5.negate(), true, true);
            i15++;
        }
        int i17 = 0;
        while (i17 < size6) {
            List list9 = list6;
            e33 e33Var2 = (e33) list9.get(i17);
            int i18 = i2 + i17;
            ya2Var.a0(i18).o(ii0Var.p(e33Var2), h32.e);
            BigDecimal bigDecimal6 = om.Q;
            BigDecimal bigDecimal7 = e33Var2.j;
            if (bigDecimal7 != null) {
                bigDecimal6 = bigDecimal7;
            }
            o10Var.k(i18, e33Var2, cs1Var2, bigDecimal6.negate(), true, false);
            i17++;
            list6 = list9;
        }
        int iJ = o10Var.j();
        int iH = o10Var.h();
        int i19 = o10Var.i();
        ds1Var.j.getClass();
        return (iH <= 0 || i19 <= 0 || iH > iJ || (!Boolean.TRUE.equals(null) && (iJ < 80 || iJ > (iH << 6) || ((long) iJ) * ((long) (iJ - iH)) > 16000000))) ? tk.B(o10Var, ds1Var) : new qo1(o10Var, ds1Var);
    }

    public final boolean m(ii0 ii0Var) {
        return (ii0Var.v() || !ii0Var.u() || ii0Var.s()) ? false : true;
    }
}
