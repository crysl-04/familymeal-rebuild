package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e03 {
    public static final e03 e = new e03(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final yy c;
    public Object[] d;

    public e03(int i, int i2, Object[] objArr, yy yyVar) {
        this.a = i;
        this.b = i2;
        this.c = yyVar;
        this.d = objArr;
    }

    public static e03 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, yy yyVar) {
        if (i3 > 30) {
            return new e03(0, 0, new Object[]{obj, obj2, obj3, obj4}, yyVar);
        }
        int iM = h12.m(i, i3);
        int iM2 = h12.m(i2, i3);
        if (iM != iM2) {
            return new e03((1 << iM) | (1 << iM2), 0, iM < iM2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, yyVar);
        }
        return new e03(0, 1 << iM, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, yyVar)}, yyVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, yy yyVar) {
        Object obj3 = this.d[i];
        e03 e03VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, yyVar);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        gi.S(objArr, objArr2, 0, i, 6);
        gi.Q(objArr, objArr2, i, i + 2, i5);
        objArr2[iT - 1] = e03VarJ;
        gi.Q(objArr, objArr2, iT, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount << 1; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        oy0 oy0VarP = cy1.P(cy1.S(0, this.d.length));
        int i = oy0VarP.h;
        int i2 = oy0VarP.i;
        int i3 = oy0VarP.j;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!uz0.g(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iM = 1 << h12.m(i, i2);
        if (h(iM)) {
            return uz0.g(obj, this.d[f(iM)]);
        }
        if (!i(iM)) {
            return false;
        }
        e03 e03VarS = s(t(iM));
        return i2 == 30 ? e03VarS.c(obj) : e03VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(e03 e03Var) {
        if (this == e03Var) {
            return true;
        }
        if (this.b == e03Var.b && this.a == e03Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == e03Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) << 1;
    }

    public final Object g(int i, int i2, Object obj) {
        int iM = 1 << h12.m(i, i2);
        if (h(iM)) {
            int iF = f(iM);
            if (uz0.g(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iM)) {
            return null;
        }
        e03 e03VarS = s(t(iM));
        if (i2 != 30) {
            return e03VarS.g(i, i2 + 5, obj);
        }
        oy0 oy0VarP = cy1.P(cy1.S(0, e03VarS.d.length));
        int i3 = oy0VarP.h;
        int i4 = oy0VarP.i;
        int i5 = oy0VarP.j;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!uz0.g(obj, e03VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return e03VarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final e03 k(int i, cx1 cx1Var) {
        cx1Var.e(cx1Var.l - 1);
        cx1Var.j = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != cx1Var.h) {
            return new e03(0, 0, h12.v(i, objArr), cx1Var.h);
        }
        this.d = h12.v(i, objArr);
        return this;
    }

    public final e03 l(int i, Object obj, Object obj2, int i2, cx1 cx1Var) {
        cx1 cx1Var2;
        e03 e03VarL;
        int iM = 1 << h12.m(i, i2);
        boolean zH = h(iM);
        yy yyVar = this.c;
        if (zH) {
            int iF = f(iM);
            if (!uz0.g(obj, this.d[iF])) {
                cx1Var.e(cx1Var.l + 1);
                yy yyVar2 = cx1Var.h;
                if (yyVar != yyVar2) {
                    return new e03(this.a ^ iM, this.b | iM, a(iF, iM, i, obj, obj2, i2, yyVar2), yyVar2);
                }
                this.d = a(iF, iM, i, obj, obj2, i2, yyVar2);
                this.a ^= iM;
                this.b |= iM;
                return this;
            }
            cx1Var.j = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (yyVar == cx1Var.h) {
                this.d[iF + 1] = obj2;
                return this;
            }
            cx1Var.k++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new e03(this.a, this.b, objArrCopyOf, cx1Var.h);
        }
        if (!i(iM)) {
            cx1Var.e(cx1Var.l + 1);
            yy yyVar3 = cx1Var.h;
            int iF2 = f(iM);
            Object[] objArr2 = this.d;
            if (yyVar != yyVar3) {
                return new e03(this.a | iM, this.b, h12.n(objArr2, iF2, obj, obj2), yyVar3);
            }
            this.d = h12.n(objArr2, iF2, obj, obj2);
            this.a |= iM;
            return this;
        }
        int iT = t(iM);
        e03 e03VarS = s(iT);
        if (i2 == 30) {
            oy0 oy0VarP = cy1.P(cy1.S(0, e03VarS.d.length));
            int i3 = oy0VarP.h;
            int i4 = oy0VarP.i;
            int i5 = oy0VarP.j;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!uz0.g(obj, e03VarS.d[i3])) {
                        if (i3 == i4) {
                            cx1Var.e(cx1Var.l + 1);
                            e03VarL = new e03(0, 0, h12.n(e03VarS.d, 0, obj, obj2), cx1Var.h);
                            break;
                        }
                        i3 += i5;
                    } else {
                        cx1Var.j = e03VarS.x(i3);
                        if (e03VarS.c != cx1Var.h) {
                            cx1Var.k++;
                            Object[] objArr3 = e03VarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            e03VarL = new e03(0, 0, objArrCopyOf2, cx1Var.h);
                            break;
                        }
                        e03VarS.d[i3 + 1] = obj2;
                        e03VarL = e03VarS;
                        break;
                    }
                }
            } else {
                cx1Var.e(cx1Var.l + 1);
                e03VarL = new e03(0, 0, h12.n(e03VarS.d, 0, obj, obj2), cx1Var.h);
                break;
            }
            cx1Var2 = cx1Var;
        } else {
            cx1Var2 = cx1Var;
            e03VarL = e03VarS.l(i, obj, obj2, i2 + 5, cx1Var2);
        }
        return e03VarS == e03VarL ? this : r(iT, e03VarL, cx1Var2.h);
    }

    public final e03 m(e03 e03Var, int i, v80 v80Var, cx1 cx1Var) {
        e03 e03Var2;
        Object[] objArr;
        e03 e03VarJ;
        if (this == e03Var) {
            v80Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            yy yyVar = cx1Var.h;
            int i3 = e03Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + e03Var.d.length);
            int length = this.d.length;
            oy0 oy0VarP = cy1.P(cy1.S(0, e03Var.d.length));
            int i4 = oy0VarP.h;
            int i5 = oy0VarP.i;
            int i6 = oy0VarP.j;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(e03Var.d[i4])) {
                        v80Var.a++;
                    } else {
                        Object[] objArr3 = e03Var.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                if (length == e03Var.d.length) {
                    return e03Var;
                }
                return length == objArrCopyOf.length ? new e03(0, 0, objArrCopyOf, yyVar) : new e03(0, 0, Arrays.copyOf(objArrCopyOf, length), yyVar);
            }
        } else {
            int i7 = this.b | e03Var.b;
            int i8 = this.a;
            int i9 = e03Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (uz0.g(this.d[f(iLowestOneBit)], e03Var.d[e03Var.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                w12.b("Check failed.");
            }
            if (uz0.g(this.c, cx1Var.h) && this.a == i12 && this.b == i7) {
                e03Var2 = this;
            } else {
                e03Var2 = new e03(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) << 1)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = e03Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    e03VarJ = s(t(iLowestOneBit2));
                    if (e03Var.i(iLowestOneBit2)) {
                        e03VarJ = e03VarJ.m(e03Var.s(e03Var.t(iLowestOneBit2)), i + 5, v80Var, cx1Var);
                    } else if (e03Var.h(iLowestOneBit2)) {
                        int iF = e03Var.f(iLowestOneBit2);
                        Object obj = e03Var.d[iF];
                        Object objX = e03Var.x(iF);
                        int i15 = cx1Var.l;
                        objArr = objArr4;
                        e03VarJ = e03VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, cx1Var);
                        if (cx1Var.l == i15) {
                            v80Var.a++;
                        }
                    }
                    objArr = objArr4;
                } else {
                    objArr = objArr4;
                    if (e03Var.i(iLowestOneBit2)) {
                        e03 e03VarS = e03Var.s(e03Var.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (e03VarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                v80Var.a++;
                                e03VarJ = e03VarS;
                            } else {
                                e03VarJ = e03VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, cx1Var);
                            }
                        } else {
                            e03VarJ = e03VarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = e03Var.f(iLowestOneBit2);
                        Object obj4 = e03Var.d[iF4];
                        e03VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, e03Var.x(iF4), i + 5, cx1Var.h);
                    }
                }
                objArr[length2] = e03VarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 << 1;
                boolean zH = e03Var.h(iLowestOneBit3);
                Object[] objArr5 = e03Var2.d;
                if (zH) {
                    int iF5 = e03Var.f(iLowestOneBit3);
                    objArr5[i18] = e03Var.d[iF5];
                    objArr5[i18 + 1] = e03Var.x(iF5);
                    if (h(iLowestOneBit3)) {
                        v80Var.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    objArr5[i18] = this.d[iF6];
                    objArr5[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(e03Var2)) {
                return e03Var.e(e03Var2) ? e03Var : e03Var2;
            }
        }
        return this;
    }

    public final e03 n(int i, Object obj, int i2, cx1 cx1Var) {
        e03 e03VarN;
        int iM = 1 << h12.m(i, i2);
        if (h(iM)) {
            int iF = f(iM);
            if (uz0.g(obj, this.d[iF])) {
                return p(iF, iM, cx1Var);
            }
        } else if (i(iM)) {
            int iT = t(iM);
            e03 e03VarS = s(iT);
            if (i2 == 30) {
                oy0 oy0VarP = cy1.P(cy1.S(0, e03VarS.d.length));
                int i3 = oy0VarP.h;
                int i4 = oy0VarP.i;
                int i5 = oy0VarP.j;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!uz0.g(obj, e03VarS.d[i3])) {
                            if (i3 == i4) {
                                e03VarN = e03VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            e03VarN = e03VarS.k(i3, cx1Var);
                            break;
                        }
                    }
                } else {
                    e03VarN = e03VarS;
                    break;
                }
            } else {
                e03VarN = e03VarS.n(i, obj, i2 + 5, cx1Var);
            }
            return q(e03VarS, e03VarN, iT, iM, cx1Var.h);
        }
        return this;
    }

    public final e03 o(int i, Object obj, Object obj2, int i2, cx1 cx1Var) {
        cx1 cx1Var2;
        e03 e03VarO;
        int iM = 1 << h12.m(i, i2);
        if (h(iM)) {
            int iF = f(iM);
            return (uz0.g(obj, this.d[iF]) && uz0.g(obj2, x(iF))) ? p(iF, iM, cx1Var) : this;
        }
        if (!i(iM)) {
            return this;
        }
        int iT = t(iM);
        e03 e03VarS = s(iT);
        if (i2 == 30) {
            oy0 oy0VarP = cy1.P(cy1.S(0, e03VarS.d.length));
            int i3 = oy0VarP.h;
            int i4 = oy0VarP.i;
            int i5 = oy0VarP.j;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!uz0.g(obj, e03VarS.d[i3]) || !uz0.g(obj2, e03VarS.x(i3))) {
                        if (i3 == i4) {
                            e03VarO = e03VarS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        e03VarO = e03VarS.k(i3, cx1Var);
                        break;
                    }
                }
            } else {
                e03VarO = e03VarS;
                break;
            }
            cx1Var2 = cx1Var;
        } else {
            cx1Var2 = cx1Var;
            e03VarO = e03VarS.o(i, obj, obj2, i2 + 5, cx1Var2);
        }
        return q(e03VarS, e03VarO, iT, iM, cx1Var2.h);
    }

    public final e03 p(int i, int i2, cx1 cx1Var) {
        cx1Var.e(cx1Var.l - 1);
        cx1Var.j = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != cx1Var.h) {
            return new e03(this.a ^ i2, this.b, h12.v(i, objArr), cx1Var.h);
        }
        this.d = h12.v(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final e03 q(e03 e03Var, e03 e03Var2, int i, int i2, yy yyVar) {
        yy yyVar2 = this.c;
        if (e03Var2 != null) {
            return (yyVar2 == yyVar || e03Var != e03Var2) ? r(i, e03Var2, yyVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (yyVar2 != yyVar) {
            return new e03(this.a, this.b ^ i2, h12.w(i, objArr), yyVar);
        }
        this.d = h12.w(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final e03 r(int i, e03 e03Var, yy yyVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && e03Var.d.length == 2 && e03Var.b == 0) {
            e03Var.a = this.b;
            return e03Var;
        }
        if (this.c == yyVar) {
            objArr[i] = e03Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = e03Var;
        return new e03(this.a, this.b, objArrCopyOf, yyVar);
    }

    public final e03 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (e03) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        if (r13 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r13 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
    
        r13.b = w(r11, r4, (defpackage.e03) r13.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.az u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e03.u(int, int, java.lang.Object, java.lang.Object):az");
    }

    public final e03 v(int i, jy1 jy1Var, int i2) {
        e03 e03VarV;
        int iM = 1 << h12.m(i, i2);
        if (h(iM)) {
            int iF = f(iM);
            if (!uz0.g(jy1Var, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new e03(this.a ^ iM, this.b, h12.v(iF, objArr), null);
            }
        } else {
            if (!i(iM)) {
                return this;
            }
            int iT = t(iM);
            e03 e03VarS = s(iT);
            if (i2 == 30) {
                oy0 oy0VarP = cy1.P(cy1.S(0, e03VarS.d.length));
                int i3 = oy0VarP.h;
                int i4 = oy0VarP.i;
                int i5 = oy0VarP.j;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!uz0.g(jy1Var, e03VarS.d[i3])) {
                            if (i3 == i4) {
                                e03VarV = e03VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = e03VarS.d;
                            if (objArr2.length != 2) {
                                e03VarV = new e03(0, 0, h12.v(i3, objArr2), null);
                                break;
                            }
                            e03VarV = null;
                            break;
                        }
                    }
                } else {
                    e03VarV = e03VarS;
                    break;
                }
            } else {
                e03VarV = e03VarS.v(i, jy1Var, i2 + 5);
            }
            if (e03VarV != null) {
                return e03VarS != e03VarV ? w(iT, iM, e03VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new e03(this.a, this.b ^ iM, h12.w(iT, objArr3), null);
            }
        }
        return null;
    }

    public final e03 w(int i, int i2, e03 e03Var) {
        Object[] objArr = e03Var.d;
        if (objArr.length != 2 || e03Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = e03Var;
            return new e03(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            e03Var.a = this.b;
            return e03Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        gi.Q(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        gi.Q(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new e03(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
