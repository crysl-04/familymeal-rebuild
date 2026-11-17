package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n01 implements ListIterator {
    public final yo1 h;
    public final long i;
    public long j;

    public n01(yo1 yo1Var, long j) {
        this.h = yo1Var;
        this.i = yo1Var.h;
        this.j = j;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a42.b();
        throw null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.j < this.i;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.j > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        long j = this.j;
        this.j = 1 + j;
        return this.h.G(j);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return (int) this.j;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        long j = this.j - 1;
        this.j = j;
        return this.h.G(j);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (int) (this.j - 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a42.b();
        throw null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a42.b();
        throw null;
    }

    public n01(yo1 yo1Var) {
        this(yo1Var, 0L);
    }
}
