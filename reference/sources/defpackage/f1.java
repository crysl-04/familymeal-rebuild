package defpackage;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements a1, Iterable, Iterator, Spliterator, Comparable, mo2, zj1 {
    public final k1 h;
    public long i;
    public final long j;
    public final dk1 k;

    public f1(k1 k1Var, long j, long j2) {
        this.i = -1L;
        this.h = k1Var;
        if (k1Var instanceof dk1) {
            this.k = (dk1) k1Var;
        } else {
            this.k = null;
        }
        this.j = j2;
        this.i = j;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        return this.h.y1(i, this.i);
    }

    @Override // defpackage.zj1
    public final void B(long j, Comparable comparable) {
        dk1 dk1Var = this.k;
        if (dk1Var == null) {
            throw new UnsupportedOperationException();
        }
        dk1Var.y0(j, this.i, comparable);
    }

    @Override // defpackage.a1
    public final Comparable G(long j) {
        return this.h.H(j, this.i);
    }

    @Override // java.util.Spliterator
    public final int characteristics() {
        return 21845;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.i, ((f1) obj).i);
    }

    @Override // defpackage.mo2
    public final long count() {
        return this.h.h1();
    }

    @Override // java.util.Spliterator
    public final long estimateSize() {
        return this.j - this.i;
    }

    @Override // java.util.Iterator, java.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        super.forEachRemaining(consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f1(this.h);
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.i++;
        return this;
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        dk1 dk1Var = this.k;
        if (dk1Var == null) {
            throw new UnsupportedOperationException();
        }
        dk1Var.Y1(i, this.i, d);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a42.b();
        throw null;
    }

    @Override // defpackage.mo2
    public final int size() {
        return this.h.Z1();
    }

    public final String toString() {
        return a1.V0(this);
    }

    @Override // java.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        if (!hasNext()) {
            return false;
        }
        this.i++;
        consumer.accept(this);
        return true;
    }

    @Override // java.util.Spliterator
    public final Spliterator trySplit() {
        long j = this.i;
        long j2 = this.j - j;
        if (j2 <= 1) {
            return null;
        }
        long j3 = (j2 / 2) + j;
        f1 f1Var = new f1(this.h, j, j3);
        this.i = j3;
        return f1Var;
    }

    public f1(k1 k1Var) {
        this(k1Var, -1L, k1Var.B1() - 1);
    }
}
