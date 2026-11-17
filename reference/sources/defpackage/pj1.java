package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pj1 implements o21, Set, l21 {
    public final nj1 h;
    public final nj1 i;

    public pj1(nj1 nj1Var) {
        this.h = nj1Var;
        this.i = nj1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.i.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        nj1 nj1Var = this.i;
        int i = nj1Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            nj1Var.k(it.next());
        }
        return i != nj1Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.i.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.h.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.h.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pj1.class != obj.getClass()) {
            return false;
        }
        return this.h.equals(((pj1) obj).h);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.h.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lr0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.i.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        nj1 nj1Var = this.i;
        int i = nj1Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            nj1Var.i(it.next());
        }
        return i != nj1Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[LOOP:0: B:5:0x0014->B:17:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[EDGE_INSN: B:24:0x0056->B:18:0x0056 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x0053], SYNTHETIC] */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        nj1 nj1Var = this.i;
        Object[] objArr = nj1Var.b;
        int i = nj1Var.d;
        long[] jArr = nj1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!dv.v0(collection, objArr[i5])) {
                                nj1Var.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != nj1Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.h.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return s60.J(this, objArr);
    }

    public final String toString() {
        return this.h.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return s60.I(this);
    }
}
