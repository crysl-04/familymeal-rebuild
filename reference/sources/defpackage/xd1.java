package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xd1 extends f0 {
    public final /* synthetic */ byte h;
    public final wd1 i;

    public /* synthetic */ xd1(wd1 wd1Var, byte b) {
        this.h = b;
        this.i = wd1Var;
    }

    @Override // defpackage.f0
    public final int a() {
        switch (this.h) {
            case 0:
                break;
        }
        return this.i.p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.h) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        byte b = this.h;
        collection.getClass();
        switch (b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.h) {
            case 0:
                this.i.clear();
                break;
            default:
                this.i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.h;
        wd1 wd1Var = this.i;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                wd1Var.getClass();
                int iG = wd1Var.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = wd1Var.i;
                objArr.getClass();
                return uz0.g(objArr[iG], entry.getValue());
            default:
                return wd1Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        switch (this.h) {
            case 0:
                collection.getClass();
                return this.i.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.h) {
            case 0:
                break;
        }
        return this.i.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.h;
        wd1 wd1Var = this.i;
        switch (b) {
            case 0:
                wd1Var.getClass();
                return new td1(wd1Var, (byte) 0);
            default:
                wd1Var.getClass();
                return new td1(wd1Var, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.h;
        wd1 wd1Var = this.i;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    wd1Var.getClass();
                    wd1Var.c();
                    int iG = wd1Var.g(entry.getKey());
                    if (iG >= 0) {
                        Object[] objArr = wd1Var.i;
                        objArr.getClass();
                        if (uz0.g(objArr[iG], entry.getValue())) {
                            wd1Var.l(iG);
                            return true;
                        }
                    }
                }
                return false;
            default:
                wd1Var.c();
                int iG2 = wd1Var.g(obj);
                if (iG2 < 0) {
                    return false;
                }
                wd1Var.l(iG2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        byte b = this.h;
        wd1 wd1Var = this.i;
        collection.getClass();
        switch (b) {
            case 0:
                wd1Var.c();
                break;
            default:
                wd1Var.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        byte b = this.h;
        wd1 wd1Var = this.i;
        collection.getClass();
        switch (b) {
            case 0:
                wd1Var.c();
                break;
            default:
                wd1Var.c();
                break;
        }
        return super.retainAll(collection);
    }
}
