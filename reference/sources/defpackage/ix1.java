package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ix1 implements Iterator, l21 {
    public final /* synthetic */ byte h = 0;
    public final Iterator i;

    public ix1(cx1 cx1Var) {
        f03[] f03VarArr = new f03[8];
        for (int i = 0; i < 8; i++) {
            f03VarArr[i] = new h03(this);
        }
        this.i = new gx1(cx1Var, f03VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                return ((gx1) this.i).j;
            default:
                return this.i.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                return (Map.Entry) ((gx1) this.i).next();
            default:
                return (l33) this.i.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                ((gx1) this.i).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ix1(j33 j33Var) {
        this.i = j33Var.q.iterator();
    }
}
