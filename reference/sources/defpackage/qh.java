package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qh implements Collection {
    public final /* synthetic */ rh h;

    public qh(rh rhVar) {
        this.h = rhVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.h.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.h.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.h.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new nh(this.h, (byte) 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        rh rhVar = this.h;
        int iA = rhVar.a(obj);
        if (iA < 0) {
            return false;
        }
        rhVar.f(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        rh rhVar = this.h;
        int i = rhVar.j;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(rhVar.h(i2))) {
                rhVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        rh rhVar = this.h;
        int i = rhVar.j;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(rhVar.h(i2))) {
                rhVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.h.j;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        rh rhVar = this.h;
        int i = rhVar.j;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = rhVar.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        rh rhVar = this.h;
        int i = rhVar.j;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = rhVar.h(i2);
        }
        return objArr;
    }
}
