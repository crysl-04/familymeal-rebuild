package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ms0 implements Iterator, l21 {
    public final fk2 h;
    public final int i;
    public int j;
    public final int k;

    public ms0(fk2 fk2Var, int i, int i2) {
        this.h = fk2Var;
        this.i = i2;
        this.j = i;
        this.k = fk2Var.o;
        if (fk2Var.n) {
            hk2.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j < this.i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        fk2 fk2Var = this.h;
        int i = fk2Var.o;
        int i2 = this.k;
        if (i != i2) {
            hk2.e();
        }
        int i3 = this.j;
        this.j = fk2Var.h[(i3 * 5) + 3] + i3;
        return new gk2(fk2Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
