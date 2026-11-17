package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dj1 implements List, l21 {
    public final /* synthetic */ byte h;
    public final Object i;

    public /* synthetic */ dj1(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        byte b = this.h;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                fj1 fj1Var = (fj1) obj2;
                if (i < 0 || i > (i2 = fj1Var.b)) {
                    fj1Var.q(i);
                    throw null;
                }
                int i3 = i2 + 1;
                Object[] objArr = fj1Var.a;
                if (objArr.length < i3) {
                    fj1Var.n(i3, objArr);
                }
                Object[] objArr2 = fj1Var.a;
                int i4 = fj1Var.b;
                if (i != i4) {
                    gi.Q(objArr2, objArr2, i + 1, i, i4);
                }
                objArr2[i] = obj;
                fj1Var.b++;
                return;
            default:
                ((uj1) obj2).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                collection.getClass();
                fj1 fj1Var = (fj1) obj;
                if (i < 0 || i > fj1Var.b) {
                    fj1Var.q(i);
                    throw null;
                }
                int i2 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + fj1Var.b;
                Object[] objArr = fj1Var.a;
                if (objArr.length < size) {
                    fj1Var.n(size, objArr);
                }
                Object[] objArr2 = fj1Var.a;
                if (i != fj1Var.b) {
                    gi.Q(objArr2, objArr2, collection.size() + i, i, fj1Var.b);
                }
                for (Object obj2 : collection) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        lt.h0();
                        throw null;
                    }
                    objArr2[i2 + i] = obj2;
                    i2 = i3;
                }
                fj1Var.b = collection.size() + fj1Var.b;
                return true;
            default:
                return ((uj1) obj).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                ((fj1) obj).d();
                break;
            default:
                ((uj1) obj).g();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.h;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                return ((fj1) obj2).e(obj);
            default:
                return ((uj1) obj2).h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                collection.getClass();
                fj1 fj1Var = (fj1) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!fj1Var.e(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                uj1 uj1Var = (uj1) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!uj1Var.h(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                kp1.a(i, this);
                return ((fj1) obj).g(i);
            default:
                vj1.a(i, this);
                return ((uj1) obj).h[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.h;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                return ((fj1) obj2).h(obj);
            default:
                return ((uj1) obj2).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((fj1) obj).i();
            default:
                return ((uj1) obj).j == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                return new cj1(this, 0, (byte) 0);
            default:
                return new cj1(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        byte b = this.h;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                fj1 fj1Var = (fj1) obj2;
                Object[] objArr = fj1Var.a;
                int i = fj1Var.b - 1;
                if (obj == null) {
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                uj1 uj1Var = (uj1) obj2;
                Object[] objArr2 = uj1Var.h;
                for (int i2 = uj1Var.j - 1; i2 >= 0; i2--) {
                    if (uz0.g(obj, objArr2[i2])) {
                        return i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.h) {
            case 0:
                return new cj1(this, 0, (byte) 0);
            default:
                return new cj1(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                kp1.a(i, this);
                return ((fj1) obj).l(i);
            default:
                vj1.a(i, this);
                return ((uj1) obj).k(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                collection.getClass();
                fj1 fj1Var = (fj1) obj;
                int i = fj1Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    fj1Var.k(it.next());
                }
                return i != fj1Var.b;
            default:
                uj1 uj1Var = (uj1) obj;
                if (!collection.isEmpty()) {
                    int i2 = uj1Var.j;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        uj1Var.j(it2.next());
                    }
                    if (i2 != uj1Var.j) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                collection.getClass();
                fj1 fj1Var = (fj1) obj;
                int i = fj1Var.b;
                Object[] objArr = fj1Var.a;
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (!collection.contains(objArr[i2])) {
                        fj1Var.l(i2);
                    }
                }
                return i != fj1Var.b;
            default:
                uj1 uj1Var = (uj1) obj;
                int i3 = uj1Var.j;
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    if (!collection.contains(uj1Var.h[i4])) {
                        uj1Var.k(i4);
                    }
                }
                return i3 != uj1Var.j;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.h;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                kp1.a(i, this);
                return ((fj1) obj2).o(i, obj);
            default:
                vj1.a(i, this);
                Object[] objArr = ((uj1) obj2).h;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((fj1) obj).b;
            default:
                return ((uj1) obj).j;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.h) {
            case 0:
                kp1.b(this, i, i2);
                return new ej1(this, i, i2, (byte) 0);
            default:
                vj1.b(this, i, i2);
                return new ej1(this, i, i2, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.h) {
            case 0:
                objArr.getClass();
                break;
        }
        return s60.J(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.h) {
            case 0:
                break;
        }
        return s60.I(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.h) {
            case 0:
                return new cj1(this, i, (byte) 0);
            default:
                return new cj1(this, i, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.h;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                return ((fj1) obj2).k(obj);
            default:
                return ((uj1) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        byte b = this.h;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                ((fj1) obj2).a(obj);
                break;
            default:
                ((uj1) obj2).b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                collection.getClass();
                fj1 fj1Var = (fj1) obj;
                int i = fj1Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    fj1Var.a(it.next());
                }
                return i != fj1Var.b;
            default:
                uj1 uj1Var = (uj1) obj;
                return uj1Var.e(uj1Var.j, collection);
        }
    }
}
