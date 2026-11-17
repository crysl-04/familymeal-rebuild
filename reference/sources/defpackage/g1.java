package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements bf0 {
    public final af0 h;
    public final long i;

    public g1(af0 af0Var, long j) {
        this.h = af0Var;
        this.i = j;
    }

    @Override // defpackage.xo1
    public final double A0() {
        return this.h.A0();
    }

    @Override // defpackage.af0
    public final long D0() {
        return this.h.D0();
    }

    @Override // defpackage.bf0
    public final long F0() {
        return this.h.D0() / this.i;
    }

    @Override // defpackage.bf0
    public final long Q1() {
        return this.h.D0() % this.i;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g1 iterator() {
        return new g1(this.h.iterator(), this.i);
    }

    @Override // java.util.Spliterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g1 trySplit() {
        af0 af0VarTrySplit = this.h.trySplit();
        if (af0VarTrySplit != null) {
            return new g1(af0VarTrySplit, this.i);
        }
        return null;
    }

    @Override // java.util.Spliterator
    public final long estimateSize() {
        return this.h.estimateSize();
    }

    @Override // defpackage.l1
    public final Object get() {
        return (Comparable) this.h.get();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.h.next();
        return this;
    }

    public final String toString() {
        return this.h.toString();
    }
}
