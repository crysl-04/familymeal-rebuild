package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bp2 implements Collection, l21 {
    public final /* synthetic */ byte h;
    public final Object i;

    public bp2() {
        this.h = (byte) 0;
        this.i = js1.a();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.h) {
            case 0:
                return ((gj1) this.i).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.h) {
            case 0:
                ((gj1) this.i).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.h;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                return ((gj1) obj2).c(obj);
            default:
                return ((mj1) obj2).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((gj1) obj).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((mj1) obj).d(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((gj1) obj).g == 0;
            default:
                return ((mj1) obj).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                return new lr0(new ij1((gj1) this.i));
            default:
                return rz1.u(new ch0(this, null, (byte) 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.h) {
            case 0:
                return ((gj1) this.i).h(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.h) {
            case 0:
                return ((gj1) this.i).h(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.h) {
            case 0:
                return ((gj1) this.i).j(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((gj1) obj).g;
            default:
                return ((mj1) obj).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.h) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return s60.J(this, objArr);
    }

    public bp2(mj1 mj1Var) {
        this.h = (byte) 1;
        this.i = mj1Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.h) {
            case 0:
                break;
        }
        return s60.I(this);
    }
}
