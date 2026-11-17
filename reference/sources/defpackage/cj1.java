package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cj1 implements ListIterator, l21 {
    public final /* synthetic */ byte h;
    public final List i;
    public int j;

    public cj1(List list, int i, byte b) {
        this.h = b;
        switch (b) {
            case 1:
                this.i = list;
                this.j = i;
                break;
            default:
                this.i = list;
                this.j = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.h;
        List list = this.i;
        switch (b) {
            case 0:
                int i = this.j + 1;
                this.j = i;
                list.add(i, obj);
                break;
            default:
                list.add(this.j, obj);
                this.j++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.h;
        List list = this.i;
        switch (b) {
            case 0:
                return this.j < list.size() - 1;
            default:
                return this.j < list.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.h) {
            case 0:
                return this.j >= 0;
            default:
                return this.j > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.h;
        List list = this.i;
        switch (b) {
            case 0:
                int i = this.j + 1;
                this.j = i;
                return list.get(i);
            default:
                int i2 = this.j;
                this.j = i2 + 1;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.h) {
            case 0:
                return this.j + 1;
            default:
                return this.j;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.h;
        List list = this.i;
        switch (b) {
            case 0:
                int i = this.j;
                this.j = i - 1;
                return list.get(i);
            default:
                int i2 = this.j - 1;
                this.j = i2;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.h) {
            case 0:
                return this.j;
            default:
                return this.j - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.h;
        List list = this.i;
        switch (b) {
            case 0:
                list.remove(this.j);
                this.j--;
                break;
            default:
                int i = this.j - 1;
                this.j = i;
                list.remove(i);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.h;
        List list = this.i;
        switch (b) {
            case 0:
                list.set(this.j, obj);
                break;
            default:
                list.set(this.j, obj);
                break;
        }
    }
}
