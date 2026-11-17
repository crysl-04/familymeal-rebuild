package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ej1 implements List, l21 {
    public final /* synthetic */ byte h;
    public final List i;
    public final int j;
    public int k;

    public /* synthetic */ ej1(List list, int i, int i2, byte b) {
        this.h = b;
        this.i = list;
        this.j = i;
        this.k = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        byte b = this.h;
        int i2 = this.j;
        List list = this.i;
        int i3 = i + i2;
        switch (b) {
            case 0:
                list.add(i3, obj);
                this.k++;
                break;
            default:
                list.add(i3, obj);
                this.k++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.h;
        int i2 = this.j;
        List list = this.i;
        switch (b) {
            case 0:
                collection.getClass();
                list.addAll(i + i2, collection);
                this.k = collection.size() + this.k;
                return collection.size() > 0;
            default:
                list.addAll(i + i2, collection);
                int size = collection.size();
                this.k += size;
                return size > 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.h;
        List list = this.i;
        int i = this.j;
        switch (b) {
            case 0:
                int i2 = this.k - 1;
                if (i <= i2) {
                    while (true) {
                        list.remove(i2);
                        if (i2 != i) {
                            i2--;
                        }
                    }
                }
                this.k = i;
                break;
            default:
                int i3 = this.k - 1;
                if (i <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                this.k = i;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.h;
        List list = this.i;
        int i = this.j;
        switch (b) {
            case 0:
                int i2 = this.k;
                while (i < i2) {
                    if (uz0.g(list.get(i), obj)) {
                        return true;
                    }
                    i++;
                }
                return false;
            default:
                int i3 = this.k;
                while (i < i3) {
                    if (uz0.g(list.get(i), obj)) {
                        return true;
                    }
                    i++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.h) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.h;
        int i2 = this.j;
        List list = this.i;
        switch (b) {
            case 0:
                kp1.a(i, this);
                break;
            default:
                vj1.a(i, this);
                break;
        }
        return list.get(i + i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.h;
        List list = this.i;
        int i = this.j;
        switch (b) {
            case 0:
                int i2 = this.k;
                for (int i3 = i; i3 < i2; i3++) {
                    if (uz0.g(list.get(i3), obj)) {
                        return i3 - i;
                    }
                }
                return -1;
            default:
                int i4 = this.k;
                for (int i5 = i; i5 < i4; i5++) {
                    if (uz0.g(list.get(i5), obj)) {
                        return i5 - i;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.h) {
            case 0:
                return this.k == this.j;
            default:
                return this.k == this.j;
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
        List list = this.i;
        int i = this.j;
        switch (b) {
            case 0:
                int i2 = this.k - 1;
                if (i > i2) {
                    return -1;
                }
                while (!uz0.g(list.get(i2), obj)) {
                    if (i2 == i) {
                        return -1;
                    }
                    i2--;
                }
                return i2 - i;
            default:
                int i3 = this.k - 1;
                if (i > i3) {
                    return -1;
                }
                while (!uz0.g(list.get(i3), obj)) {
                    if (i3 == i) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i;
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

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.h;
        int i = this.j;
        List list = this.i;
        switch (b) {
            case 0:
                int i2 = this.k;
                while (i < i2) {
                    if (uz0.g(list.get(i), obj)) {
                        list.remove(i);
                        this.k--;
                        return true;
                    }
                    i++;
                }
                return false;
            default:
                int i3 = this.k;
                while (i < i3) {
                    if (uz0.g(list.get(i), obj)) {
                        list.remove(i);
                        this.k--;
                        return true;
                    }
                    i++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.h) {
            case 0:
                collection.getClass();
                int i = this.k;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i != this.k;
            default:
                int i2 = this.k;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i2 != this.k;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.h;
        int i = this.j;
        List list = this.i;
        switch (b) {
            case 0:
                collection.getClass();
                int i2 = this.k;
                int i3 = i2 - 1;
                if (i <= i3) {
                    while (true) {
                        if (!collection.contains(list.get(i3))) {
                            list.remove(i3);
                            this.k--;
                        }
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                return i2 != this.k;
            default:
                int i4 = this.k;
                int i5 = i4 - 1;
                if (i <= i5) {
                    while (true) {
                        if (!collection.contains(list.get(i5))) {
                            list.remove(i5);
                            this.k--;
                        }
                        if (i5 != i) {
                            i5--;
                        }
                    }
                }
                return i4 != this.k;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.h;
        int i2 = this.j;
        List list = this.i;
        switch (b) {
            case 0:
                kp1.a(i, this);
                break;
            default:
                vj1.a(i, this);
                break;
        }
        return list.set(i + i2, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.h) {
            case 0:
                i = this.k;
                i2 = this.j;
                break;
            default:
                i = this.k;
                i2 = this.j;
                break;
        }
        return i - i2;
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
    public final boolean add(Object obj) {
        byte b = this.h;
        List list = this.i;
        switch (b) {
            case 0:
                int i = this.k;
                this.k = i + 1;
                list.add(i, obj);
                break;
            default:
                int i2 = this.k;
                this.k = i2 + 1;
                list.add(i2, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.h;
        List list = this.i;
        switch (b) {
            case 0:
                collection.getClass();
                list.addAll(this.k, collection);
                this.k = collection.size() + this.k;
                return collection.size() > 0;
            default:
                list.addAll(this.k, collection);
                int size = collection.size();
                this.k += size;
                return size > 0;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.h;
        int i2 = this.j;
        List list = this.i;
        switch (b) {
            case 0:
                kp1.a(i, this);
                Object objRemove = list.remove(i + i2);
                this.k--;
                return objRemove;
            default:
                vj1.a(i, this);
                Object objRemove2 = list.remove(i + i2);
                this.k--;
                return objRemove2;
        }
    }
}
