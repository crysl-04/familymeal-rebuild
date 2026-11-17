package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ih extends e0 {
    public static final Object[] k = new Object[0];
    public int h;
    public Object[] i;
    public int j;

    public ih(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = k;
        } else {
            if (i <= 0) {
                wg.m(jp1.h(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.i = objArr;
    }

    @Override // defpackage.e0
    public final int a() {
        return this.j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.j;
        if (i < 0 || i > i2) {
            wg.i(wi0.f(i, i2, "index: ", ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        k();
        d(this.j + 1);
        int iJ = j(this.h + i);
        int i3 = this.j;
        if (i < ((i3 + 1) >> 1)) {
            if (iJ == 0) {
                Object[] objArr = this.i;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iJ - 1;
            }
            int length2 = this.h;
            if (length2 == 0) {
                Object[] objArr2 = this.i;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.h;
            Object[] objArr3 = this.i;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                gi.Q(objArr3, objArr3, i5, i5 + 1, length + 1);
            } else {
                gi.Q(objArr3, objArr3, i5 - 1, i5, objArr3.length);
                Object[] objArr4 = this.i;
                objArr4[objArr4.length - 1] = objArr4[0];
                gi.Q(objArr4, objArr4, 0, 1, length + 1);
            }
            this.i[length] = obj;
            this.h = i4;
        } else {
            int iJ2 = j(i3 + this.h);
            Object[] objArr5 = this.i;
            if (iJ < iJ2) {
                gi.Q(objArr5, objArr5, iJ + 1, iJ, iJ2);
            } else {
                gi.Q(objArr5, objArr5, 1, 0, iJ2);
                Object[] objArr6 = this.i;
                objArr6[0] = objArr6[objArr6.length - 1];
                gi.Q(objArr6, objArr6, iJ + 1, iJ, objArr6.length - 1);
            }
            this.i[iJ] = obj;
        }
        this.j++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.j;
        if (i < 0 || i > i2) {
            wg.i(wi0.f(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.j) {
            return addAll(collection);
        }
        k();
        d(collection.size() + this.j);
        int iJ = j(this.j + this.h);
        int iJ2 = j(this.h + i);
        int size = collection.size();
        if (i >= ((this.j + 1) >> 1)) {
            int i3 = iJ2 + size;
            Object[] objArr = this.i;
            if (iJ2 < iJ) {
                int i4 = size + iJ;
                if (i4 <= objArr.length) {
                    gi.Q(objArr, objArr, i3, iJ2, iJ);
                } else if (i3 >= objArr.length) {
                    gi.Q(objArr, objArr, i3 - objArr.length, iJ2, iJ);
                } else {
                    int length = iJ - (i4 - objArr.length);
                    gi.Q(objArr, objArr, 0, length, iJ);
                    Object[] objArr2 = this.i;
                    gi.Q(objArr2, objArr2, i3, iJ2, length);
                }
            } else {
                gi.Q(objArr, objArr, size, 0, iJ);
                Object[] objArr3 = this.i;
                if (i3 >= objArr3.length) {
                    gi.Q(objArr3, objArr3, i3 - objArr3.length, iJ2, objArr3.length);
                } else {
                    gi.Q(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.i;
                    gi.Q(objArr4, objArr4, i3, iJ2, objArr4.length - size);
                }
            }
            c(iJ2, collection);
            return true;
        }
        int i5 = this.h;
        int length2 = i5 - size;
        Object[] objArr5 = this.i;
        if (iJ2 < i5) {
            gi.Q(objArr5, objArr5, length2, i5, objArr5.length);
            Object[] objArr6 = this.i;
            if (size >= iJ2) {
                gi.Q(objArr6, objArr6, objArr6.length - size, 0, iJ2);
            } else {
                gi.Q(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.i;
                gi.Q(objArr7, objArr7, 0, size, iJ2);
            }
        } else if (length2 >= 0) {
            gi.Q(objArr5, objArr5, length2, i5, iJ2);
        } else {
            length2 += objArr5.length;
            int i6 = iJ2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                gi.Q(objArr5, objArr5, length2, i5, iJ2);
            } else {
                gi.Q(objArr5, objArr5, length2, i5, i5 + length3);
                Object[] objArr8 = this.i;
                gi.Q(objArr8, objArr8, 0, this.h + length3, iJ2);
            }
        }
        this.h = length2;
        c(h(iJ2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        k();
        d(this.j + 1);
        int length = this.h;
        if (length == 0) {
            Object[] objArr = this.i;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.h = i;
        this.i[i] = obj;
        this.j++;
    }

    public final void addLast(Object obj) {
        k();
        d(a() + 1);
        this.i[j(a() + this.h)] = obj;
        this.j = a() + 1;
    }

    @Override // defpackage.e0
    public final Object b(int i) {
        int i2 = this.j;
        if (i < 0 || i >= i2) {
            wg.i(wi0.f(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        k();
        int iJ = j(this.h + i);
        Object[] objArr = this.i;
        Object obj = objArr[iJ];
        int i3 = this.j >> 1;
        int i4 = this.h;
        if (i < i3) {
            if (iJ >= i4) {
                gi.Q(objArr, objArr, i4 + 1, i4, iJ);
            } else {
                gi.Q(objArr, objArr, 1, 0, iJ);
                Object[] objArr2 = this.i;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.h;
                gi.Q(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.i;
            int i6 = this.h;
            objArr3[i6] = null;
            this.h = f(i6);
        } else {
            int iJ2 = j((a() - 1) + i4);
            Object[] objArr4 = this.i;
            int i7 = iJ + 1;
            if (iJ <= iJ2) {
                gi.Q(objArr4, objArr4, iJ, i7, iJ2 + 1);
            } else {
                gi.Q(objArr4, objArr4, iJ, i7, objArr4.length);
                Object[] objArr5 = this.i;
                objArr5[objArr5.length - 1] = objArr5[0];
                gi.Q(objArr5, objArr5, 0, 1, iJ2 + 1);
            }
            this.i[iJ2] = null;
        }
        this.j--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.i.length;
        while (i < length && it.hasNext()) {
            this.i[i] = it.next();
            i++;
        }
        int i2 = this.h;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.i[i3] = it.next();
        }
        this.j = collection.size() + this.j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            i(this.h, j(a() + this.h));
        }
        this.h = 0;
        this.j = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            li1.g("Deque is too big.");
            return;
        }
        Object[] objArr = this.i;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == k) {
            if (i < 10) {
                i = 10;
            }
            this.i = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        gi.Q(objArr, objArr2, 0, this.h, objArr.length);
        Object[] objArr3 = this.i;
        int length2 = objArr3.length;
        int i3 = this.h;
        gi.Q(objArr3, objArr2, length2 - i3, 0, i3);
        this.h = 0;
        this.i = objArr2;
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return this.i[this.h];
    }

    public final int f(int i) {
        Object[] objArr = this.i;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.i[this.h];
        }
        li1.m("ArrayDeque is empty.");
        return null;
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.i[j((size() - 1) + this.h)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i >= 0 && i < iA) {
            return this.i[j(this.h + i)];
        }
        wg.i(wi0.f(i, iA, "index: ", ", size: "));
        return null;
    }

    public final int h(int i) {
        return i < 0 ? i + this.i.length : i;
    }

    public final void i(int i, int i2) {
        Object[] objArr = this.i;
        if (i < i2) {
            gi.U(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            gi.U(this.i, 0, i2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iJ = j(a() + this.h);
        int length = this.h;
        if (length < iJ) {
            while (length < iJ) {
                if (uz0.g(obj, this.i[length])) {
                    i = this.h;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.h) < iJ) {
            return -1;
        }
        int length2 = this.i.length;
        while (length < length2) {
            if (uz0.g(obj, this.i[length])) {
                i = this.h;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iJ; i2++) {
            if (uz0.g(obj, this.i[i2])) {
                length = i2 + this.i.length;
                i = this.h;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int j(int i) {
        Object[] objArr = this.i;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            li1.m("ArrayDeque is empty.");
            return null;
        }
        return this.i[j((size() - 1) + this.h)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iJ = j(this.j + this.h);
        int i2 = this.h;
        if (i2 < iJ) {
            length = iJ - 1;
            if (i2 <= length) {
                while (!uz0.g(obj, this.i[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.h;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.h >= iJ) {
            do {
                iJ--;
                objArr = this.i;
                if (-1 >= iJ) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.h;
                    if (i3 <= length) {
                        while (!uz0.g(obj, this.i[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.h;
                    }
                }
                return length - i;
            } while (!uz0.g(obj, objArr[iJ]));
            length = iJ + this.i.length;
            i = this.h;
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iJ;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.i.length != 0) {
            int iJ2 = j(this.j + this.h);
            int i = this.h;
            if (i < iJ2) {
                iJ = i;
                while (true) {
                    objArr = this.i;
                    if (i >= iJ2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.i[iJ] = obj;
                        iJ++;
                    }
                    i++;
                }
                gi.U(objArr, iJ, iJ2);
            } else {
                int length = this.i.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.i;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.i[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iJ = j(i2);
                for (int i3 = 0; i3 < iJ2; i3++) {
                    Object[] objArr3 = this.i;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.i[iJ] = obj3;
                        iJ = f(iJ);
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.j = h(iJ - this.h);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            li1.m("ArrayDeque is empty.");
            return null;
        }
        k();
        Object[] objArr = this.i;
        int i = this.h;
        Object obj = objArr[i];
        objArr[i] = null;
        this.h = f(i);
        this.j = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            li1.m("ArrayDeque is empty.");
            return null;
        }
        k();
        int iJ = j((size() - 1) + this.h);
        Object[] objArr = this.i;
        Object obj = objArr[iJ];
        objArr[iJ] = null;
        this.j = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        tz0.n(i, i2, this.j);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.j) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        k();
        int i4 = this.j - i2;
        int i5 = this.h;
        if (i < i4) {
            int iJ = j((i - 1) + i5);
            int iJ2 = j(this.h + (i2 - 1));
            while (i > 0) {
                int i6 = iJ + 1;
                int iMin = Math.min(i, Math.min(i6, iJ2 + 1));
                Object[] objArr = this.i;
                int i7 = iJ2 - iMin;
                int i8 = iJ - iMin;
                gi.Q(objArr, objArr, i7 + 1, i8 + 1, i6);
                iJ = h(i8);
                iJ2 = h(i7);
                i -= iMin;
            }
            int iJ3 = j(this.h + i3);
            i(this.h, iJ3);
            this.h = iJ3;
        } else {
            int iJ4 = j(i5 + i2);
            int iJ5 = j(this.h + i);
            int i9 = this.j;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.i;
                i2 = Math.min(i9, Math.min(objArr2.length - iJ4, objArr2.length - iJ5));
                Object[] objArr3 = this.i;
                int i10 = iJ4 + i2;
                gi.Q(objArr3, objArr3, iJ5, iJ4, i10);
                iJ4 = j(i10);
                iJ5 = j(iJ5 + i2);
            }
            int iJ6 = j(this.j + this.h);
            i(h(iJ6 - i3), iJ6);
        }
        this.j -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iJ;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.i.length != 0) {
            int iJ2 = j(this.j + this.h);
            int i = this.h;
            if (i < iJ2) {
                iJ = i;
                while (true) {
                    objArr = this.i;
                    if (i >= iJ2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.i[iJ] = obj;
                        iJ++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                gi.U(objArr, iJ, iJ2);
            } else {
                int length = this.i.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.i;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.i[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iJ = j(i2);
                for (int i3 = 0; i3 < iJ2; i3++) {
                    Object[] objArr3 = this.i;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.i[iJ] = obj3;
                        iJ = f(iJ);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.j = h(iJ - this.h);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iA = a();
        if (i < 0 || i >= iA) {
            wg.i(wi0.f(i, iA, "index: ", ", size: "));
            return null;
        }
        int iJ = j(this.h + i);
        Object[] objArr = this.i;
        Object obj2 = objArr[iJ];
        objArr[iJ] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.j;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iJ = j(this.j + this.h);
        int i2 = this.h;
        if (i2 < iJ) {
            gi.S(this.i, objArr, i2, iJ, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.i;
            gi.Q(objArr2, objArr, 0, this.h, objArr2.length);
            Object[] objArr3 = this.i;
            gi.Q(objArr3, objArr, objArr3.length - this.h, 0, iJ);
        }
        int i3 = this.j;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public ih() {
        this.i = k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        k();
        d(collection.size() + a());
        c(j(a() + this.h), collection);
        return true;
    }
}
