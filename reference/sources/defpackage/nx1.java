package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends h0 {
    public final Object[] h;
    public final Object[] i;
    public final int j;
    public final int k;

    public nx1(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.h = objArr;
        this.i = objArr2;
        this.j = i;
        this.k = i2;
        if (!(a() > 32)) {
            w12.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] i(Object[] objArr, int i, int i2, Object obj, o3 o3Var) {
        int iE = cy1.E(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iE == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            gi.Q(objArr, objArrCopyOf, iE + 1, iE, 31);
            o3Var.a = objArr[31];
            objArrCopyOf[iE] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iE];
        obj2.getClass();
        objArrCopyOf2[iE] = i((Object[]) obj2, i3, i2, obj, o3Var);
        while (true) {
            iE++;
            if (iE >= 32 || objArrCopyOf2[iE] == null) {
                break;
            }
            Object obj3 = objArr[iE];
            obj3.getClass();
            objArrCopyOf2[iE] = i((Object[]) obj3, i3, 0, o3Var.a, o3Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] k(Object[] objArr, int i, int i2, o3 o3Var) {
        Object[] objArrK;
        int iE = cy1.E(i2, i);
        if (i == 5) {
            o3Var.a = objArr[iE];
            objArrK = null;
        } else {
            Object obj = objArr[iE];
            obj.getClass();
            objArrK = k((Object[]) obj, i - 5, i2, o3Var);
        }
        if (objArrK == null && iE == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iE] = objArrK;
        return objArrCopyOf;
    }

    public static Object[] q(Object[] objArr, int i, int i2, Object obj) {
        int iE = cy1.E(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iE] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iE];
        obj2.getClass();
        objArrCopyOf[iE] = q((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    @Override // defpackage.q
    public final int a() {
        return this.j;
    }

    @Override // defpackage.h0
    public final h0 b(int i, Object obj) {
        int i2 = this.j;
        lt.i(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int iP = p();
        Object[] objArr = this.h;
        if (i >= iP) {
            return j(objArr, i - iP, obj);
        }
        o3 o3Var = new o3(null);
        return j(i(objArr, this.k, i, obj, o3Var), 0, o3Var.a);
    }

    @Override // defpackage.h0
    public final h0 c(Object obj) {
        int iP = p();
        int i = this.j;
        int i2 = i - iP;
        Object[] objArr = this.h;
        Object[] objArr2 = this.i;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new nx1(objArr, objArrCopyOf, i + 1, this.k);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return l(objArr, objArr2, objArr3);
    }

    @Override // defpackage.h0
    public final ox1 e() {
        return new ox1(this, this.h, this.i, this.k);
    }

    @Override // defpackage.h0
    public final h0 f(g0 g0Var) {
        ox1 ox1Var = new ox1(this, this.h, this.i, this.k);
        ox1Var.y(g0Var);
        return ox1Var.c();
    }

    @Override // defpackage.h0
    public final h0 g(int i) {
        lt.h(i, a());
        int iP = p();
        int i2 = this.k;
        Object[] objArr = this.h;
        return i >= iP ? o(objArr, iP, i2, i - iP) : o(n(objArr, i2, i, new o3(this.i[0])), iP, i2, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        lt.h(i, a());
        if (p() <= i) {
            objArr = this.i;
        } else {
            Object[] objArr2 = this.h;
            for (int i2 = this.k; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[cy1.E(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.h0
    public final h0 h(int i, Object obj) {
        int i2 = this.j;
        lt.h(i, i2);
        int iP = p();
        Object[] objArr = this.h;
        Object[] objArr2 = this.i;
        int i3 = this.k;
        if (iP > i) {
            return new nx1(q(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new nx1(objArr, objArrCopyOf, i2, i3);
    }

    public final nx1 j(Object[] objArr, int i, Object obj) {
        int iP = p();
        int i2 = this.j;
        int i3 = i2 - iP;
        Object[] objArr2 = this.i;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            gi.Q(objArr2, objArrCopyOf, i + 1, i, i3);
            objArrCopyOf[i] = obj;
            return new nx1(objArr, objArrCopyOf, i2 + 1, this.k);
        }
        Object obj2 = objArr2[31];
        gi.Q(objArr2, objArrCopyOf, i + 1, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, objArrCopyOf, objArr3);
    }

    public final nx1 l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.j;
        int i2 = i >> 5;
        int i3 = this.k;
        if (i2 <= (1 << i3)) {
            return new nx1(m(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new nx1(m(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // defpackage.c0, java.util.List
    public final ListIterator listIterator(int i) {
        lt.i(i, this.j);
        return new px1(this.h, this.i, i, this.j, (this.k / 5) + 1);
    }

    public final Object[] m(int i, Object[] objArr, Object[] objArr2) {
        int iE = cy1.E(a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iE] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iE] = m(i - 5, (Object[]) objArrCopyOf[iE], objArr2);
        return objArrCopyOf;
    }

    public final Object[] n(Object[] objArr, int i, int i2, o3 o3Var) {
        int iE = cy1.E(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iE == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            gi.Q(objArr, objArrCopyOf, iE, iE + 1, 32);
            objArrCopyOf[31] = o3Var.a;
            o3Var.a = objArr[iE];
            return objArrCopyOf;
        }
        int iE2 = objArr[31] == null ? cy1.E(p() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iE + 1;
        if (i4 <= iE2) {
            while (true) {
                Object obj = objArrCopyOf2[iE2];
                obj.getClass();
                objArrCopyOf2[iE2] = n((Object[]) obj, i3, 0, o3Var);
                if (iE2 == i4) {
                    break;
                }
                iE2--;
            }
        }
        Object obj2 = objArrCopyOf2[iE];
        obj2.getClass();
        objArrCopyOf2[iE] = n((Object[]) obj2, i3, i2, o3Var);
        return objArrCopyOf2;
    }

    public final h0 o(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.j - i;
        if (i4 != 1) {
            Object[] objArr2 = this.i;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                gi.Q(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new nx1(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new jk2(objArr);
        }
        o3 o3Var = new o3(null);
        Object[] objArrK = k(objArr, i2, i - 1, o3Var);
        objArrK.getClass();
        Object obj = o3Var.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrK[1] != null) {
            return new nx1(objArrK, objArr3, i, i2);
        }
        Object obj2 = objArrK[0];
        obj2.getClass();
        return new nx1((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int p() {
        return (this.j - 1) & (-32);
    }
}
