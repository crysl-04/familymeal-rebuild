package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ox1 extends e0 implements Collection, l21 {
    public h0 h;
    public Object[] i;
    public Object[] j;
    public int k;
    public yy l = new yy(25);
    public Object[] m;
    public Object[] n;
    public int o;

    public ox1(h0 h0Var, Object[] objArr, Object[] objArr2, int i) {
        this.h = h0Var;
        this.i = objArr;
        this.j = objArr2;
        this.k = i;
        this.m = objArr;
        this.n = objArr2;
        this.o = h0Var.a();
    }

    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object A(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.o - i;
        Object[] objArr2 = this.n;
        if (i4 == 1) {
            Object obj = objArr2[0];
            q(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrK = k(objArr2);
        gi.Q(objArr2, objArrK, i3, i3 + 1, i4);
        objArrK[i4 - 1] = null;
        this.m = objArr;
        this.n = objArrK;
        this.o = (i + i4) - 1;
        this.k = i2;
        return obj2;
    }

    public final int B() {
        int i = this.o;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] C(Object[] objArr, int i, int i2, Object obj, o3 o3Var) {
        int iE = cy1.E(i2, i);
        Object[] objArrK = k(objArr);
        if (i != 0) {
            Object obj2 = objArrK[iE];
            obj2.getClass();
            objArrK[iE] = C((Object[]) obj2, i - 5, i2, obj, o3Var);
            return objArrK;
        }
        if (objArrK != objArr) {
            ((AbstractList) this).modCount++;
        }
        o3Var.a = objArrK[iE];
        objArrK[iE] = obj;
        return objArrK;
    }

    public final void D(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM;
        if (i3 < 1) {
            w12.a("requires at least one nullBuffer");
        }
        Object[] objArrK = k(objArr);
        objArr2[0] = objArrK;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            gi.Q(objArrK, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM = objArrK;
            } else {
                objArrM = m();
                i3--;
                objArr2[i3] = objArrM;
            }
            int i7 = i2 - i6;
            gi.Q(objArrK, objArr3, 0, i7, i2);
            gi.Q(objArrK, objArrM, size + 1, i4, i7);
            objArr3 = objArrM;
        }
        Iterator it = collection.iterator();
        d(objArrK, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM2 = m();
            d(objArrM2, 0, it);
            objArr2[i8] = objArrM2;
        }
        d(objArr3, 0, it);
    }

    public final int E() {
        int i = this.o;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.e0
    public final int a() {
        return this.o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        lt.i(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iB = B();
        if (i >= iB) {
            h(this.m, i - iB, obj);
            return;
        }
        o3 o3Var = new o3(null);
        Object[] objArr = this.m;
        objArr.getClass();
        h(g(objArr, this.k, i, obj, o3Var), 0, o3Var.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM;
        lt.i(i, this.o);
        if (i == this.o) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.o - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.n;
            Object[] objArrK = k(objArr);
            gi.Q(objArr, objArrK, size2 + 1, i3, E());
            d(objArrK, i3, collection.iterator());
            this.n = objArrK;
            this.o = collection.size() + this.o;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iE = E();
        int size3 = collection.size() + this.o;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= B()) {
            objArrM = m();
            collection2 = collection;
            D(collection2, i, this.n, iE, objArr2, size, objArrM);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.n;
            if (size3 > iE) {
                int i4 = size3 - iE;
                Object[] objArrL = l(i4, objArr3);
                f(collection2, i, i4, objArr2, size, objArrL);
                objArr2 = objArr2;
                objArrM = objArrL;
            } else {
                objArrM = m();
                int i5 = iE - size3;
                gi.Q(objArr3, objArrM, 0, i5, iE);
                int i6 = 32 - i5;
                Object[] objArrL2 = l(i6, this.n);
                int i7 = size - 1;
                objArr2[i7] = objArrL2;
                f(collection2, i, i6, objArr2, i7, objArrL2);
                collection2 = collection2;
            }
        }
        this.m = s(this.m, i2, objArr2);
        this.n = objArrM;
        this.o = collection2.size() + this.o;
        return true;
    }

    @Override // defpackage.e0
    public final Object b(int i) {
        lt.h(i, a());
        ((AbstractList) this).modCount++;
        int iB = B();
        if (i >= iB) {
            return A(this.m, iB, this.k, i - iB);
        }
        o3 o3Var = new o3(this.n[0]);
        Object[] objArr = this.m;
        objArr.getClass();
        A(z(objArr, this.k, i, o3Var), iB, this.k, 0);
        return o3Var.a;
    }

    public final h0 c() {
        h0 nx1Var;
        Object[] objArr = this.m;
        if (objArr == this.i && this.n == this.j) {
            nx1Var = this.h;
        } else {
            this.l = new yy((byte) 25);
            this.i = objArr;
            Object[] objArr2 = this.n;
            this.j = objArr2;
            if (objArr == null) {
                nx1Var = objArr2.length == 0 ? jk2.i : new jk2(Arrays.copyOf(this.n, a()));
            } else {
                objArr.getClass();
                nx1Var = new nx1(objArr, this.n, a(), this.k);
            }
        }
        this.h = nx1Var;
        return nx1Var;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.m == null) {
            li1.g("root is null");
            return;
        }
        int i4 = i >> 5;
        d0 d0VarJ = j(B() >> 5);
        int i5 = i3;
        Object[] objArrL = objArr2;
        while (d0VarJ.h - 1 != i4) {
            Object[] objArr3 = (Object[]) d0VarJ.previous();
            gi.Q(objArr3, objArrL, 0, 32 - i2, 32);
            objArrL = l(i2, objArr3);
            i5--;
            objArr[i5] = objArrL;
        }
        Object[] objArr4 = (Object[]) d0VarJ.previous();
        int iB = i3 - (((B() >> 5) - 1) - i4);
        if (iB < i3) {
            objArr2 = objArr[iB];
            objArr2.getClass();
        }
        D(collection, i, objArr4, 32, objArr, iB, objArr2);
    }

    public final Object[] g(Object[] objArr, int i, int i2, Object obj, o3 o3Var) {
        Object obj2;
        int iE = cy1.E(i2, i);
        if (i == 0) {
            o3Var.a = objArr[31];
            Object[] objArrK = k(objArr);
            gi.Q(objArr, objArrK, iE + 1, iE, 31);
            objArrK[iE] = obj;
            return objArrK;
        }
        Object[] objArrK2 = k(objArr);
        int i3 = i - 5;
        Object obj3 = objArrK2[iE];
        obj3.getClass();
        objArrK2[iE] = g((Object[]) obj3, i3, i2, obj, o3Var);
        while (true) {
            iE++;
            if (iE >= 32 || (obj2 = objArrK2[iE]) == null) {
                break;
            }
            objArrK2[iE] = g((Object[]) obj2, i3, 0, o3Var.a, o3Var);
        }
        return objArrK2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        lt.h(i, a());
        if (B() <= i) {
            objArr = this.n;
        } else {
            Object[] objArr2 = this.m;
            objArr2.getClass();
            for (int i2 = this.k; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[cy1.E(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final void h(Object[] objArr, int i, Object obj) {
        int iE = E();
        Object[] objArrK = k(this.n);
        Object[] objArr2 = this.n;
        if (iE >= 32) {
            Object obj2 = objArr2[31];
            gi.Q(objArr2, objArrK, i + 1, i, 31);
            objArrK[i] = obj;
            t(objArr, objArrK, n(obj2));
            return;
        }
        gi.Q(objArr2, objArrK, i + 1, i, iE);
        objArrK[i] = obj;
        this.m = objArr;
        this.n = objArrK;
        this.o++;
    }

    public final boolean i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final d0 j(int i) {
        Object[] objArr = this.m;
        if (objArr == null) {
            li1.g("Invalid root");
            return null;
        }
        int iB = B() >> 5;
        lt.i(i, iB);
        int i2 = this.k;
        return i2 == 0 ? new cp(i, objArr) : new d03(objArr, i, iB, i2 / 5);
    }

    public final Object[] k(Object[] objArr) {
        if (objArr == null) {
            return m();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] objArrM = m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        gi.S(objArr, objArrM, 0, length, 6);
        return objArrM;
    }

    public final Object[] l(int i, Object[] objArr) {
        if (i(objArr)) {
            gi.Q(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] objArrM = m();
        gi.Q(objArr, objArrM, i, 0, 32 - i);
        return objArrM;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        lt.i(i, this.o);
        return new qx1(this, i);
    }

    public final Object[] m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.l;
        return objArr;
    }

    public final Object[] n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.l;
        return objArr;
    }

    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            w12.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iE = cy1.E(i, i2);
        Object obj = objArr[iE];
        obj.getClass();
        Object objO = o((Object[]) obj, i, i2 - 5);
        if (iE < 31) {
            int i3 = iE + 1;
            if (objArr[i3] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM = m();
                gi.Q(objArr, objArrM, 0, 0, i3);
                objArr = objArrM;
            }
        }
        if (objO == objArr[iE]) {
            return objArr;
        }
        Object[] objArrK = k(objArr);
        objArrK[iE] = objO;
        return objArrK;
    }

    public final Object[] p(Object[] objArr, int i, int i2, o3 o3Var) {
        Object[] objArrP;
        int iE = cy1.E(i2 - 1, i);
        if (i == 5) {
            o3Var.a = objArr[iE];
            objArrP = null;
        } else {
            Object obj = objArr[iE];
            obj.getClass();
            objArrP = p((Object[]) obj, i - 5, i2, o3Var);
        }
        if (objArrP == null && iE == 0) {
            return null;
        }
        Object[] objArrK = k(objArr);
        objArrK[iE] = objArrP;
        return objArrK;
    }

    public final void q(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.m = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.n = objArr;
            this.o = i;
            this.k = i2;
            return;
        }
        o3 o3Var = new o3(null);
        objArr.getClass();
        Object[] objArrP = p(objArr, i2, i, o3Var);
        objArrP.getClass();
        Object obj = o3Var.a;
        obj.getClass();
        this.n = (Object[]) obj;
        this.o = i;
        if (objArrP[1] == null) {
            this.m = (Object[]) objArrP[0];
            this.k = i2 - 5;
        } else {
            this.m = objArrP;
            this.k = i2;
        }
    }

    public final Object[] r(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            w12.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            w12.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrK = k(objArr);
        int iE = cy1.E(i, i2);
        int i3 = i2 - 5;
        objArrK[iE] = r((Object[]) objArrK[iE], i, i3, it);
        while (true) {
            iE++;
            if (iE >= 32 || !it.hasNext()) {
                break;
            }
            objArrK[iE] = r((Object[]) objArrK[iE], 0, i3, it);
        }
        return objArrK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return y(new g0(collection, (byte) 1));
    }

    public final Object[] s(Object[] objArr, int i, Object[][] objArr2) {
        z zVar = new z(objArr2);
        int i2 = i >> 5;
        int i3 = this.k;
        Object[] objArrR = i2 < (1 << i3) ? r(objArr, i, i3, zVar) : k(objArr);
        while (zVar.hasNext()) {
            this.k += 5;
            objArrR = n(objArrR);
            int i4 = this.k;
            r(objArrR, 1 << i4, i4, zVar);
        }
        return objArrR;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        lt.h(i, a());
        if (B() > i) {
            o3 o3Var = new o3(null);
            Object[] objArr = this.m;
            objArr.getClass();
            this.m = C(objArr, this.k, i, obj, o3Var);
            return o3Var.a;
        }
        Object[] objArrK = k(this.n);
        if (objArrK != this.n) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrK[i2];
        objArrK[i2] = obj;
        this.n = objArrK;
        return obj2;
    }

    public final void t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.o;
        int i2 = i >> 5;
        int i3 = this.k;
        if (i2 > (1 << i3)) {
            this.m = u(this.k + 5, n(objArr), objArr2);
            this.n = objArr3;
            this.k += 5;
            this.o++;
            return;
        }
        if (objArr == null) {
            this.m = objArr2;
            this.n = objArr3;
            this.o = i + 1;
        } else {
            this.m = u(i3, objArr, objArr2);
            this.n = objArr3;
            this.o++;
        }
    }

    public final Object[] u(int i, Object[] objArr, Object[] objArr2) {
        int iE = cy1.E(a() - 1, i);
        Object[] objArrK = k(objArr);
        if (i == 5) {
            objArrK[iE] = objArr2;
            return objArrK;
        }
        objArrK[iE] = u(i - 5, (Object[]) objArrK[iE], objArr2);
        return objArrK;
    }

    public final int v(vp0 vp0Var, Object[] objArr, int i, int i2, o3 o3Var, ArrayList arrayList, ArrayList arrayList2) {
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = o3Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) vp0Var.h(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m();
                    i2 = 0;
                }
                objArrM[i2] = obj2;
                i2++;
            }
        }
        o3Var.a = objArrM;
        if (objArr2 != objArrM) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int w(vp0 vp0Var, Object[] objArr, int i, o3 o3Var) {
        Object[] objArrK = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) vp0Var.h(obj)).booleanValue()) {
                if (!z) {
                    objArrK = k(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrK[i2] = obj;
                i2++;
            }
        }
        o3Var.a = objArrK;
        return i2;
    }

    public final int x(vp0 vp0Var, int i, o3 o3Var) {
        int iW = w(vp0Var, this.n, i, o3Var);
        Object obj = o3Var.a;
        if (iW == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iW, i, (Object) null);
        this.n = objArr;
        this.o -= i - iW;
        return iW;
    }

    public final boolean y(vp0 vp0Var) {
        int i;
        vp0 vp0Var2 = vp0Var;
        int iE = E();
        Object[] objArrO = null;
        o3 o3Var = new o3(null);
        boolean z = false;
        if (this.m != null) {
            d0 d0VarJ = j(0);
            int iW = 32;
            while (true) {
                if (iW != 32) {
                    int i2 = (d0VarJ.h - 1) << 5;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int iV = iW;
                    while (d0VarJ.hasNext()) {
                        iV = v(vp0Var2, (Object[]) d0VarJ.next(), 32, iV, o3Var, arrayList2, arrayList);
                        vp0Var2 = vp0Var;
                    }
                    int iV2 = v(vp0Var, this.n, iE, iV, o3Var, arrayList2, arrayList);
                    Object obj = o3Var.a;
                    obj.getClass();
                    Object[] objArr = (Object[]) obj;
                    Arrays.fill(objArr, iV2, 32, (Object) null);
                    boolean zIsEmpty = arrayList.isEmpty();
                    Object[] objArrR = this.m;
                    if (zIsEmpty) {
                        objArrR.getClass();
                    } else {
                        objArrR = r(objArrR, i2, this.k, arrayList.iterator());
                    }
                    int size = i2 + (arrayList.size() << 5);
                    if ((size & 31) != 0) {
                        w12.a("invalid size");
                    }
                    if (size == 0) {
                        this.k = 0;
                    } else {
                        int i3 = size - 1;
                        while (true) {
                            i = this.k;
                            if ((i3 >> i) != 0) {
                                break;
                            }
                            this.k = i - 5;
                            Object[] objArr2 = objArrR[0];
                            objArr2.getClass();
                            objArrR = objArr2;
                        }
                        objArrO = o(objArrR, i3, i);
                    }
                    this.m = objArrO;
                    this.n = objArr;
                    this.o = size + iV2;
                } else {
                    if (!d0VarJ.hasNext()) {
                        int iX = x(vp0Var2, iE, o3Var);
                        if (iX == 0) {
                            q(this.m, this.o, this.k);
                        }
                        if (iX == iE) {
                            break;
                        }
                        break;
                    }
                    iW = w(vp0Var2, (Object[]) d0VarJ.next(), 32, o3Var);
                }
                z = true;
                break;
            }
        } else if (x(vp0Var2, iE, o3Var) != iE) {
            z = true;
            break;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] z(Object[] objArr, int i, int i2, o3 o3Var) {
        int iE = cy1.E(i2, i);
        if (i == 0) {
            Object obj = objArr[iE];
            Object[] objArrK = k(objArr);
            gi.Q(objArr, objArrK, iE, iE + 1, 32);
            objArrK[31] = o3Var.a;
            o3Var.a = obj;
            return objArrK;
        }
        int iE2 = objArr[31] == null ? cy1.E(B() - 1, i) : 31;
        Object[] objArrK2 = k(objArr);
        int i3 = i - 5;
        int i4 = iE + 1;
        if (i4 <= iE2) {
            while (true) {
                Object obj2 = objArrK2[iE2];
                obj2.getClass();
                objArrK2[iE2] = z((Object[]) obj2, i3, 0, o3Var);
                if (iE2 == i4) {
                    break;
                }
                iE2--;
            }
        }
        Object obj3 = objArrK2[iE];
        obj3.getClass();
        objArrK2[iE] = z((Object[]) obj3, i3, i2, o3Var);
        return objArrK2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iE = E();
        if (iE < 32) {
            Object[] objArrK = k(this.n);
            objArrK[iE] = obj;
            this.n = objArrK;
            this.o = a() + 1;
        } else {
            t(this.m, this.n, n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iE = E();
        Iterator it = collection.iterator();
        if (32 - iE >= collection.size()) {
            Object[] objArrK = k(this.n);
            d(objArrK, iE, it);
            this.n = objArrK;
            this.o = collection.size() + this.o;
            return true;
        }
        int size = ((collection.size() + iE) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrK2 = k(this.n);
        d(objArrK2, iE, it);
        objArr[0] = objArrK2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM = m();
            d(objArrM, 0, it);
            objArr[i] = objArrM;
        }
        this.m = s(this.m, B(), objArr);
        Object[] objArrM2 = m();
        d(objArrM2, 0, it);
        this.n = objArrM2;
        this.o = collection.size() + this.o;
        return true;
    }
}
