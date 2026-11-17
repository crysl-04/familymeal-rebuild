package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements af0 {
    public long h;
    public final long i;
    public final a1 j;

    public y0(a1 a1Var) {
        this(a1Var, -1L, a1Var.count() - 1);
    }

    @Override // defpackage.xo1
    public final double A0() {
        return this.j.z(this.h);
    }

    @Override // defpackage.af0
    public final long D0() {
        return this.h;
    }

    @Override // java.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y0 trySplit() {
        long j = this.h;
        long j2 = this.i - j;
        if (j2 <= 1) {
            return null;
        }
        long j3 = (j2 / 2) + j;
        y0 y0Var = new y0(this.j, j, j3);
        this.h = j3;
        return y0Var;
    }

    @Override // java.util.Spliterator
    public final long estimateSize() {
        return this.i - this.h;
    }

    @Override // defpackage.l1
    public final Object get() {
        return this.j.G(this.h);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h < this.i;
    }

    @Override // defpackage.af0, java.lang.Iterable
    public final af0 iterator() {
        return new y0(this.j);
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.h++;
        return this;
    }

    public final String toString() {
        long j = this.h;
        return j + " = " + String.valueOf(this.j.G(j));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new y0(this.j);
    }

    public y0(a1 a1Var, long j, long j2) {
        this.j = a1Var;
        this.h = j;
        this.i = j2;
    }
}
