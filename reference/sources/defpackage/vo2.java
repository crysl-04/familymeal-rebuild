package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vo2 implements List, l21 {
    public final ll2 h;
    public final int i;
    public int j;
    public int k;

    public vo2(ll2 ll2Var, int i, int i2) {
        this.h = ll2Var;
        this.i = i;
        this.j = ia2.n(ll2Var);
        this.k = i2 - i;
    }

    public final void a() {
        if (ia2.n(this.h) != this.j) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.i + this.k;
        ll2 ll2Var = this.h;
        ll2Var.add(i, obj);
        this.k++;
        this.j = ia2.n(ll2Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.i;
        ll2 ll2Var = this.h;
        boolean zAddAll = ll2Var.addAll(i2, collection);
        if (zAddAll) {
            this.k = collection.size() + this.k;
            this.j = ia2.n(ll2Var);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.k > 0) {
            a();
            int i = this.k;
            int i2 = this.i;
            ll2 ll2Var = this.h;
            ll2Var.d(i2, i + i2);
            this.k = 0;
            this.j = ia2.n(ll2Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        ia2.B(i, this.k);
        return this.h.get(this.i + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.k;
        int i2 = this.i;
        Iterator it = cy1.S(i2, i + i2).iterator();
        while (((py0) it).j) {
            int iNextInt = ((jy0) it).nextInt();
            if (uz0.g(obj, this.h.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.k == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.k;
        int i2 = this.i;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (uz0.g(obj, this.h.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        v72 v72Var = new v72();
        v72Var.h = i - 1;
        return new k92(v72Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.i + i;
        ll2 ll2Var = this.h;
        Object objRemove = ll2Var.remove(i2);
        this.k--;
        this.j = ia2.n(ll2Var);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        h0 h0Var;
        uk2 uk2VarH;
        boolean zG;
        a();
        ll2 ll2Var = this.h;
        int i2 = this.i;
        int i3 = this.k + i2;
        int size = ll2Var.size();
        do {
            synchronized (ia2.g0) {
                pn2 pn2Var = ll2Var.h;
                pn2Var.getClass();
                pn2 pn2Var2 = (pn2) bl2.f(pn2Var);
                i = pn2Var2.d;
                h0Var = pn2Var2.c;
            }
            h0Var.getClass();
            ox1 ox1VarE = h0Var.e();
            ox1VarE.subList(i2, i3).retainAll(collection);
            h0 h0VarC = ox1VarE.c();
            if (uz0.g(h0VarC, h0Var)) {
                break;
            }
            pn2 pn2Var3 = ll2Var.h;
            pn2Var3.getClass();
            synchronized (bl2.c) {
                uk2VarH = bl2.h();
                zG = ia2.g((pn2) bl2.w(pn2Var3, ll2Var, uk2VarH), i, h0VarC, true);
            }
            bl2.l(uk2VarH, ll2Var);
        } while (!zG);
        int size2 = size - ll2Var.size();
        if (size2 <= 0) {
            return false;
        }
        this.j = ia2.n(this.h);
        this.k -= size2;
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        ia2.B(i, this.k);
        a();
        int i2 = i + this.i;
        ll2 ll2Var = this.h;
        Object obj2 = ll2Var.set(i2, obj);
        this.j = ia2.n(ll2Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.k;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.k) {
            w12.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.i;
        return new vo2(this.h, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return s60.I(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return s60.J(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.i + i;
        ll2 ll2Var = this.h;
        ll2Var.add(i2, obj);
        this.k++;
        this.j = ia2.n(ll2Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.k, collection);
    }
}
