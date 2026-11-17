package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jt0 implements List, l21 {
    public final fj1 h = new fj1(16);
    public final wi1 i = new wi1(16);
    public int j = -1;

    public final long a() {
        long jC = ys.c(Float.POSITIVE_INFINITY, false, false);
        int i = this.j + 1;
        int i2 = this.h.b - 1;
        if (i > i2) {
            return jC;
        }
        while (i >= 0) {
            wi1 wi1Var = this.i;
            if (i >= wi1Var.b) {
                break;
            }
            long j = wi1Var.a[i];
            if (lt.o(j, jC) < 0) {
                jC = j;
            }
            if ((lt.D(jC) < 0.0f && lt.O(jC)) || i == i2) {
                return jC;
            }
            i++;
        }
        wg.i("Index must be between 0 and size");
        return 0L;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int i, int i2) {
        wi1 wi1Var;
        int i3;
        if (i < i2) {
            this.h.m(i, i2);
            if (i < 0 || i > (i3 = (wi1Var = this.i).b) || i2 < 0 || i2 > i3) {
                wg.i("Index must be between 0 and size");
                return;
            }
            if (i2 < i) {
                wg.m("The end index must be < start index");
            } else if (i2 != i) {
                if (i2 < i3) {
                    long[] jArr = wi1Var.a;
                    gi.P(jArr, jArr, i, i2, i3);
                }
                wi1Var.b -= i2 - i;
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.j = -1;
        this.h.d();
        this.i.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof qg1) && indexOf((qg1) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((qg1) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objG = this.h.g(i);
        objG.getClass();
        return (qg1) objG;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof qg1)) {
            return -1;
        }
        qg1 qg1Var = (qg1) obj;
        fj1 fj1Var = this.h;
        int i = fj1Var.b - 1;
        if (i < 0) {
            return -1;
        }
        int i2 = 0;
        while (!uz0.g(fj1Var.g(i2), qg1Var)) {
            if (i2 == i) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.h.i();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ht0(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof qg1) {
            qg1 qg1Var = (qg1) obj;
            fj1 fj1Var = this.h;
            for (int i = fj1Var.b - 1; -1 < i; i--) {
                if (uz0.g(fj1Var.g(i), qg1Var)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ht0(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.h.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new it0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return s60.I(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return s60.J(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ht0(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
