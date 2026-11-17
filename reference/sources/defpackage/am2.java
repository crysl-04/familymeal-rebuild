package defpackage;

import java.util.Spliterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class am2 implements af0 {
    public int h;
    public final int[] i;
    public final int j;
    public final ry1 k;

    public am2(int[] iArr, ry1 ry1Var, int i, int i2) {
        this.i = iArr;
        this.k = ry1Var;
        this.h = i;
        this.j = i2;
    }

    @Override // defpackage.xo1
    public final double A0() {
        return this.k.A(this.h);
    }

    @Override // defpackage.af0
    public final long D0() {
        return this.i[this.h];
    }

    @Override // defpackage.l1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Comparable get() {
        return this.k.U1(this.h);
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final am2 iterator() {
        return new am2(this.i, this.k, -1, this.j);
    }

    public final void c() {
        this.h++;
    }

    @Override // java.util.Spliterator
    public final long estimateSize() {
        return this.j - this.h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h < this.j;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        c();
        return this;
    }

    @Override // defpackage.af0, java.util.Spliterator
    public final af0 trySplit() {
        int i = this.h;
        int i2 = this.j - i;
        if (i2 <= 1) {
            return null;
        }
        int i3 = (i2 / 2) + i;
        am2 am2Var = new am2(this.i, this.k, i, i3);
        this.h = i3;
        return am2Var;
    }

    @Override // java.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.h;
        int i2 = this.j - i;
        if (i2 <= 1) {
            return null;
        }
        int i3 = (i2 / 2) + i;
        am2 am2Var = new am2(this.i, this.k, i, i3);
        this.h = i3;
        return am2Var;
    }
}
