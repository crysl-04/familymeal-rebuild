package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e11 extends n11 implements List<n11>, l21 {
    public static final d11 Companion = new d11();
    public final List h;

    public e11(List list) {
        list.getClass();
        this.h = list;
    }

    @Override // defpackage.n11
    public final void a(StringBuilder sb) {
        sb.append('[');
        boolean z = true;
        for (n11 n11Var : this.h) {
            if (!z) {
                sb.append(',');
            }
            n11Var.a(sb);
            z = false;
        }
        sb.append(']');
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, n11 n11Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends n11> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof n11)) {
            return false;
        }
        return this.h.contains((n11) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.h.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return uz0.g(this.h, obj);
    }

    @Override // java.util.List
    public final n11 get(int i) {
        return (n11) this.h.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof n11)) {
            return -1;
        }
        return this.h.indexOf((n11) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.h.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.h.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof n11)) {
            return -1;
        }
        return this.h.lastIndexOf((n11) obj);
    }

    @Override // java.util.List
    public final ListIterator<n11> listIterator() {
        return this.h.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ n11 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<n11> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ n11 set(int i, n11 n11Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.h.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super n11> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<n11> subList(int i, int i2) {
        return this.h.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return s60.J(this, objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.h.size() + 1) << 1);
        a(sb);
        return sb.toString();
    }

    @Override // java.util.List
    public final ListIterator<n11> listIterator(int i) {
        return this.h.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return s60.I(this);
    }
}
