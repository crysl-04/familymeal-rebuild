package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k92 implements ListIterator, l21 {
    public final /* synthetic */ byte h = 0;
    public final Object i;
    public final /* synthetic */ Object j;

    public k92(l92 l92Var, int i) {
        this.j = l92Var;
        List list = l92Var.h;
        if (i >= 0 && i <= l92Var.a()) {
            this.i = list.listIterator(l92Var.a() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new qy0(0, l92Var.a(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((v72) obj).h < ((vo2) this.j).k - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                return ((v72) obj).h >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                v72 v72Var = (v72) obj;
                int i = v72Var.h + 1;
                vo2 vo2Var = (vo2) this.j;
                ia2.B(i, vo2Var.k);
                v72Var.h = i;
                return vo2Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return (((l92) this.j).size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((v72) obj).h + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                v72 v72Var = (v72) obj;
                int i = v72Var.h;
                vo2 vo2Var = (vo2) this.j;
                ia2.B(i, vo2Var.k);
                v72Var.h = i - 1;
                return vo2Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                return (((l92) this.j).size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((v72) obj).h;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public k92(v72 v72Var, vo2 vo2Var) {
        this.i = v72Var;
        this.j = vo2Var;
    }
}
