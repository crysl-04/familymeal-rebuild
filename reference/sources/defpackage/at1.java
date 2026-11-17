package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class at1 implements ze1 {
    public final vp0 a;
    public final boolean b;
    public final su2 c;
    public final pu2 d;
    public final rt1 e;
    public final float f;

    public at1(vp0 vp0Var, boolean z, su2 su2Var, pu2 pu2Var, rt1 rt1Var, float f) {
        this.a = vp0Var;
        this.b = z;
        this.c = su2Var;
        this.d = pu2Var;
        this.e = rt1Var;
        this.f = f;
    }

    public static final int j(int i, at1 at1Var, int i2, int i3, ny1 ny1Var, ny1 ny1Var2) {
        if (at1Var.b) {
            i3 = Math.round(((i2 - ny1Var2.i) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (ny1Var != null ? ny1Var.i : 0) / 2);
    }

    @Override // defpackage.ze1
    public final int a(nz0 nz0Var, List list, int i) {
        return h(nz0Var, list, i, new yx((byte) 24));
    }

    @Override // defpackage.ze1
    public final int b(nz0 nz0Var, List list, int i) {
        return i(nz0Var, list, i, new yx((byte) 23));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v4 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.ze1
    public final defpackage.af1 c(defpackage.bf1 r45, java.util.List r46, long r47) {
        /*
            Method dump skipped, instruction units count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at1.c(bf1, java.util.List, long):af1");
    }

    @Override // defpackage.ze1
    public final int d(nz0 nz0Var, List list, int i) {
        return h(nz0Var, list, i, new yx((byte) 22));
    }

    @Override // defpackage.ze1
    public final int e(nz0 nz0Var, List list, int i) {
        return i(nz0Var, list, i, new yx((byte) 25));
    }

    public final int f(e90 e90Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, ls.S(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        rt1 rt1Var = this.e;
        float fA = e90Var.A(rt1Var.b);
        return l00.f(Math.max(i, Math.max(i2, ie1.x(ls.R(fA, Math.max(fA, i6 / 2.0f), f) + i5 + e90Var.A(rt1Var.d)))) + i8, j);
    }

    public final int g(e90 e90Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, ls.S(f, i6, 0))) + i + i2;
        rt1 rt1Var = this.e;
        u31 u31Var = u31.h;
        return l00.g(Math.max(iMax, ie1.x((i6 + e90Var.A(rt1Var.b(u31Var) + rt1Var.a(u31Var))) * f)), j);
    }

    public final int h(nz0 nz0Var, List list, int i, zp0 zp0Var) {
        Object obj;
        int iU;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        at1 at1Var = this;
        float fA = at1Var.d.a();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (uz0.g(dt.D((ue1) obj), "Leading")) {
                break;
            }
            i2++;
        }
        ue1 ue1Var = (ue1) obj;
        if (ue1Var != null) {
            iU = dt.U(i, ue1Var.a0(Integer.MAX_VALUE));
            iIntValue = ((Number) zp0Var.f(ue1Var, Integer.valueOf(i))).intValue();
        } else {
            iU = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (uz0.g(dt.D((ue1) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        ue1 ue1Var2 = (ue1) obj2;
        if (ue1Var2 != null) {
            iU = dt.U(iU, ue1Var2.a0(Integer.MAX_VALUE));
            iIntValue2 = ((Number) zp0Var.f(ue1Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (uz0.g(dt.D((ue1) obj3), "Label")) {
                break;
            }
            i4++;
        }
        Object obj8 = (ue1) obj3;
        int iIntValue5 = obj8 != null ? ((Number) zp0Var.f(obj8, Integer.valueOf(ls.S(fA, iU, i)))).intValue() : 0;
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i5);
            if (uz0.g(dt.D((ue1) obj4), "Prefix")) {
                break;
            }
            i5++;
        }
        ue1 ue1Var3 = (ue1) obj4;
        if (ue1Var3 != null) {
            iIntValue3 = ((Number) zp0Var.f(ue1Var3, Integer.valueOf(iU))).intValue();
            iU = dt.U(iU, ue1Var3.a0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i6);
            if (uz0.g(dt.D((ue1) obj5), "Suffix")) {
                break;
            }
            i6++;
        }
        ue1 ue1Var4 = (ue1) obj5;
        if (ue1Var4 != null) {
            iIntValue4 = ((Number) zp0Var.f(ue1Var4, Integer.valueOf(iU))).intValue();
            iU = dt.U(iU, ue1Var4.a0(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj9 = list.get(i7);
            if (uz0.g(dt.D((ue1) obj9), "TextField")) {
                int iIntValue6 = ((Number) zp0Var.f(obj9, Integer.valueOf(iU))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (uz0.g(dt.D((ue1) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                Object obj10 = (ue1) obj6;
                int iIntValue7 = obj10 != null ? ((Number) zp0Var.f(obj10, Integer.valueOf(iU))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (uz0.g(dt.D((ue1) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                Object obj11 = (ue1) obj7;
                return at1Var.f(nz0Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) zp0Var.f(obj11, Integer.valueOf(i))).intValue() : 0, l00.b(0, 0, 0, 0, 15), fA);
            }
            i7++;
            iIntValue4 = iIntValue4;
            at1Var = this;
            iIntValue3 = iIntValue3;
        }
        gb1.b("Collection contains no element matching the predicate.");
        wg.k();
        return 0;
    }

    public final int i(nz0 nz0Var, List list, int i, zp0 zp0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (uz0.g(dt.D((ue1) obj7), "TextField")) {
                int iIntValue = ((Number) zp0Var.f(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (uz0.g(dt.D((ue1) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                ue1 ue1Var = (ue1) obj2;
                int iIntValue2 = ue1Var != null ? ((Number) zp0Var.f(ue1Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (uz0.g(dt.D((ue1) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                ue1 ue1Var2 = (ue1) obj3;
                int iIntValue3 = ue1Var2 != null ? ((Number) zp0Var.f(ue1Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (uz0.g(dt.D((ue1) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                ue1 ue1Var3 = (ue1) obj4;
                int iIntValue4 = ue1Var3 != null ? ((Number) zp0Var.f(ue1Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (uz0.g(dt.D((ue1) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                ue1 ue1Var4 = (ue1) obj5;
                int iIntValue5 = ue1Var4 != null ? ((Number) zp0Var.f(ue1Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (uz0.g(dt.D((ue1) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                ue1 ue1Var5 = (ue1) obj6;
                int iIntValue6 = ue1Var5 != null ? ((Number) zp0Var.f(ue1Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (uz0.g(dt.D((ue1) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                ue1 ue1Var6 = (ue1) obj;
                return g(nz0Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, ue1Var6 != null ? ((Number) zp0Var.f(ue1Var6, Integer.valueOf(i))).intValue() : 0, l00.b(0, 0, 0, 0, 15), this.d.a());
            }
        }
        gb1.b("Collection contains no element matching the predicate.");
        wg.k();
        return 0;
    }
}
