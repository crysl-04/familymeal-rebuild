package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yd1 extends AbstractCollection implements Collection, l21 {
    public final /* synthetic */ byte h;
    public final Object i;

    public /* synthetic */ yd1(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.h) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.h) {
            case 0:
                ((wd1) this.i).clear();
                break;
            default:
                ((cx1) this.i).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.h) {
            case 0:
                return ((wd1) this.i).containsValue(obj);
            default:
                return ((cx1) this.i).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        switch (this.h) {
            case 0:
                return ((wd1) this.i).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                wd1 wd1Var = (wd1) obj;
                wd1Var.getClass();
                return new td1(wd1Var, (byte) 2);
            default:
                cx1 cx1Var = (cx1) obj;
                f03[] f03VarArr = new f03[8];
                for (int i = 0; i < 8; i++) {
                    f03VarArr[i] = new g03((byte) 2);
                }
                return new jx1(cx1Var, f03VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.h) {
            case 0:
                wd1 wd1Var = (wd1) this.i;
                wd1Var.c();
                int iH = wd1Var.h(obj);
                if (iH < 0) {
                    return false;
                }
                wd1Var.l(iH);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.h) {
            case 0:
                collection.getClass();
                ((wd1) this.i).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.h) {
            case 0:
                collection.getClass();
                ((wd1) this.i).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.h) {
            case 0:
                return ((wd1) this.i).p;
            default:
                return ((cx1) this.i).l;
        }
    }
}
