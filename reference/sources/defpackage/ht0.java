package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ht0 implements ListIterator, l21 {
    public final /* synthetic */ byte h;
    public int i;
    public int j;
    public int k;
    public final Object l;

    public ht0(ll2 ll2Var, int i) {
        this.h = (byte) 3;
        this.l = ll2Var;
        this.i = i - 1;
        this.j = -1;
        this.k = ia2.n(ll2Var);
    }

    public final void a() {
        if (((AbstractList) ((ma1) this.l).l).modCount != this.k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.h;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                ma1 ma1Var = (ma1) obj2;
                int i = this.i;
                this.i = i + 1;
                ma1Var.add(i, obj);
                this.j = -1;
                this.k = ((AbstractList) ma1Var).modCount;
                return;
            case 2:
                b();
                na1 na1Var = (na1) obj2;
                int i2 = this.i;
                this.i = i2 + 1;
                na1Var.add(i2, obj);
                this.j = -1;
                this.k = ((AbstractList) na1Var).modCount;
                return;
            default:
                c();
                ll2 ll2Var = (ll2) obj2;
                ll2Var.add(this.i + 1, obj);
                this.j = -1;
                this.i++;
                this.k = ia2.n(ll2Var);
                return;
        }
    }

    public final void b() {
        if (((AbstractList) ((na1) this.l)).modCount != this.k) {
            throw new ConcurrentModificationException();
        }
    }

    public final void c() {
        if (ia2.n((ll2) this.l) != this.k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.h;
        Object obj = this.l;
        switch (b) {
            case 0:
                return this.i < this.k;
            case 1:
                return this.i < ((ma1) obj).j;
            case 2:
                return this.i < ((na1) obj).i;
            default:
                return this.i < ((ll2) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.h) {
            case 0:
                return this.i > this.j;
            case 1:
                return this.i > 0;
            case 2:
                return this.i > 0;
            default:
                return this.i >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.h;
        Object obj = this.l;
        switch (b) {
            case 0:
                fj1 fj1Var = ((jt0) obj).h;
                int i = this.i;
                this.i = i + 1;
                Object objG = fj1Var.g(i);
                objG.getClass();
                return (qg1) objG;
            case 1:
                a();
                int i2 = this.i;
                ma1 ma1Var = (ma1) obj;
                if (i2 >= ma1Var.j) {
                    wg.p();
                    return null;
                }
                this.i = i2 + 1;
                this.j = i2;
                return ma1Var.h[ma1Var.i + i2];
            case 2:
                b();
                int i3 = this.i;
                na1 na1Var = (na1) obj;
                if (i3 >= na1Var.i) {
                    wg.p();
                    return null;
                }
                this.i = i3 + 1;
                this.j = i3;
                return na1Var.h[i3];
            default:
                c();
                int i4 = this.i + 1;
                this.j = i4;
                ll2 ll2Var = (ll2) obj;
                ia2.B(i4, ll2Var.size());
                Object obj2 = ll2Var.get(i4);
                this.i = i4;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.h) {
            case 0:
                return this.i - this.j;
            case 1:
                return this.i;
            case 2:
                return this.i;
            default:
                return this.i + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.h;
        Object obj = this.l;
        switch (b) {
            case 0:
                fj1 fj1Var = ((jt0) obj).h;
                int i = this.i - 1;
                this.i = i;
                Object objG = fj1Var.g(i);
                objG.getClass();
                return (qg1) objG;
            case 1:
                a();
                int i2 = this.i;
                if (i2 <= 0) {
                    wg.p();
                    return null;
                }
                int i3 = i2 - 1;
                this.i = i3;
                this.j = i3;
                ma1 ma1Var = (ma1) obj;
                return ma1Var.h[ma1Var.i + i3];
            case 2:
                b();
                int i4 = this.i;
                if (i4 <= 0) {
                    wg.p();
                    return null;
                }
                int i5 = i4 - 1;
                this.i = i5;
                this.j = i5;
                return ((na1) obj).h[i5];
            default:
                c();
                ll2 ll2Var = (ll2) obj;
                ia2.B(this.i, ll2Var.size());
                int i6 = this.i;
                this.j = i6;
                Object obj2 = ll2Var.get(i6);
                this.i--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.h) {
            case 0:
                return (this.i - this.j) - 1;
            case 1:
                i = this.i;
                break;
            case 2:
                i = this.i;
                break;
            default:
                return this.i;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.h;
        Object obj = this.l;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ma1 ma1Var = (ma1) obj;
                a();
                int i = this.j;
                if (i == -1) {
                    li1.g("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                ma1Var.b(i);
                this.i = this.j;
                this.j = -1;
                this.k = ((AbstractList) ma1Var).modCount;
                return;
            case 2:
                na1 na1Var = (na1) obj;
                b();
                int i2 = this.j;
                if (i2 == -1) {
                    li1.g("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                na1Var.b(i2);
                this.i = this.j;
                this.j = -1;
                this.k = ((AbstractList) na1Var).modCount;
                return;
            default:
                c();
                ll2 ll2Var = (ll2) obj;
                ll2Var.remove(this.j);
                this.i--;
                this.j = -1;
                this.k = ia2.n(ll2Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.h;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i = this.j;
                if (i != -1) {
                    ((ma1) obj2).set(i, obj);
                    return;
                } else {
                    li1.g("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i2 = this.j;
                if (i2 != -1) {
                    ((na1) obj2).set(i2, obj);
                    return;
                } else {
                    li1.g("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                ll2 ll2Var = (ll2) obj2;
                c();
                int i3 = this.j;
                if (i3 < 0) {
                    li1.g("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    ll2Var.set(i3, obj);
                    this.k = ia2.n(ll2Var);
                    return;
                }
        }
    }

    public ht0(na1 na1Var, int i) {
        this.h = (byte) 2;
        this.l = na1Var;
        this.i = i;
        this.j = -1;
        this.k = ((AbstractList) na1Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ht0(jt0 jt0Var, int i, int i2) {
        this(jt0Var, (i2 & 1) != 0 ? 0 : i, 0, jt0Var.h.b);
        this.h = (byte) 0;
    }

    public ht0(jt0 jt0Var, int i, int i2, int i3) {
        this.h = (byte) 0;
        this.l = jt0Var;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }

    public ht0(ma1 ma1Var, int i) {
        this.h = (byte) 1;
        this.l = ma1Var;
        this.i = i;
        this.j = -1;
        this.k = ((AbstractList) ma1Var).modCount;
    }
}
