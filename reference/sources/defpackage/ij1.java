package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ij1 implements o21, Set, l21 {
    public final gj1 h;
    public final gj1 i;

    public ij1(gj1 gj1Var) {
        this.h = gj1Var;
        this.i = gj1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.i.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        gj1 gj1Var = this.i;
        int i = gj1Var.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gj1Var.g(it.next());
        }
        return i != gj1Var.g;
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
        if (obj == null || ij1.class != obj.getClass()) {
            return false;
        }
        return this.h.equals(((ij1) obj).h);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.h.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lr0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.i.h(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        collection.getClass();
        gj1 gj1Var = this.i;
        int i = gj1Var.g;
        Iterator it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = i4 & 127;
            int i6 = gj1Var.f;
            int i7 = (i4 >>> 7) & i6;
            while (true) {
                long[] jArr = gj1Var.a;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                long j = (jArr[i8] >>> i9) | ((jArr[i8 + i2] << (64 - i9)) & ((-i9) >> 63));
                long j2 = (((long) i5) * 72340172838076673L) ^ j;
                long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L);
                while (j3 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                    int i10 = i2;
                    if (uz0.g(gj1Var.b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i2 = i10;
                }
                int i11 = i2;
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 += 8;
                i7 = (i7 + i3) & i6;
                i2 = i11;
            }
            if (iNumberOfTrailingZeros >= 0) {
                gj1Var.i(iNumberOfTrailingZeros);
            }
        }
        return i != gj1Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.i.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.h.g;
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
