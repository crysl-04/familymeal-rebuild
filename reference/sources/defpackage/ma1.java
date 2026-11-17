package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ma1 extends e0 implements RandomAccess, Serializable {
    public Object[] h;
    public final int i;
    public int j;
    public final ma1 k;
    public final na1 l;

    public ma1(Object[] objArr, int i, int i2, ma1 ma1Var, na1 na1Var) {
        objArr.getClass();
        na1Var.getClass();
        this.h = objArr;
        this.i = i;
        this.j = i2;
        this.k = ma1Var;
        this.l = na1Var;
        ((AbstractList) this).modCount = ((AbstractList) na1Var).modCount;
    }

    @Override // defpackage.e0
    public final int a() {
        f();
        return this.j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.j;
        if (i < 0 || i > i2) {
            wg.i(wi0.f(i, i2, "index: ", ", size: "));
        } else {
            e(this.i + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        f();
        int i2 = this.j;
        if (i < 0 || i > i2) {
            wg.i(wi0.f(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        d(this.i + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.e0
    public final Object b(int i) {
        g();
        f();
        int i2 = this.j;
        if (i >= 0 && i < i2) {
            return h(this.i + i);
        }
        wg.i(wi0.f(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.i, this.j);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        na1 na1Var = this.l;
        ma1 ma1Var = this.k;
        if (ma1Var != null) {
            ma1Var.d(i, collection, i2);
        } else {
            na1 na1Var2 = na1.k;
            na1Var.d(i, collection, i2);
        }
        this.h = na1Var.h;
        this.j += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        na1 na1Var = this.l;
        ma1 ma1Var = this.k;
        if (ma1Var != null) {
            ma1Var.e(i, obj);
        } else {
            na1 na1Var2 = na1.k;
            na1Var.e(i, obj);
        }
        this.h = na1Var.h;
        this.j++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.h;
            int i = this.j;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (uz0.g(objArr[this.i + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (((AbstractList) this.l).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.l.j) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.j;
        if (i >= 0 && i < i2) {
            return this.h[this.i + i];
        }
        wg.i(wi0.f(i, i2, "index: ", ", size: "));
        return null;
    }

    public final Object h(int i) {
        Object objH;
        ((AbstractList) this).modCount++;
        ma1 ma1Var = this.k;
        if (ma1Var != null) {
            objH = ma1Var.h(i);
        } else {
            na1 na1Var = na1.k;
            objH = this.l.h(i);
        }
        this.j--;
        return objH;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.h;
        int i = this.j;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.i + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        ma1 ma1Var = this.k;
        if (ma1Var != null) {
            ma1Var.i(i, i2);
        } else {
            na1 na1Var = na1.k;
            this.l.i(i, i2);
        }
        this.j -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.j; i++) {
            if (uz0.g(this.h[this.i + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.j == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z) {
        int iJ;
        ma1 ma1Var = this.k;
        if (ma1Var != null) {
            iJ = ma1Var.j(i, i2, collection, z);
        } else {
            na1 na1Var = na1.k;
            iJ = this.l.j(i, i2, collection, z);
        }
        if (iJ > 0) {
            ((AbstractList) this).modCount++;
        }
        this.j -= iJ;
        return iJ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.j - 1; i >= 0; i--) {
            if (uz0.g(this.h[this.i + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.j;
        if (i >= 0 && i <= i2) {
            return new ht0(this, i);
        }
        wg.i(wi0.f(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return j(this.i, this.j, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return j(this.i, this.j, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.j;
        if (i < 0 || i >= i2) {
            wg.i(wi0.f(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.h;
        int i3 = this.i;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        tz0.n(i, i2, this.j);
        return new ma1(this.h, this.i + i, i2 - i, this, this.l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        f();
        int length = objArr.length;
        int i = this.j;
        Object[] objArr2 = this.h;
        int i2 = this.i;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        gi.Q(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.j;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return dt.T(this.h, this.i, this.j, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.i + this.j, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.h;
        int i = this.j;
        int i2 = this.i;
        return gi.T(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        f();
        int size = collection.size();
        d(this.i + this.j, collection, size);
        return size > 0;
    }
}
