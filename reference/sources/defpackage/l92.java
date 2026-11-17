package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l92 extends c0 {
    public final List h;

    public l92(List list) {
        list.getClass();
        this.h = list;
    }

    @Override // defpackage.q
    public final int a() {
        return this.h.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= lt.H(this)) {
            return this.h.get(lt.H(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new qy0(0, lt.H(this), 1) + "].");
    }

    @Override // defpackage.c0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new k92(this, 0);
    }

    @Override // defpackage.c0, java.util.List
    public final ListIterator listIterator() {
        return new k92(this, 0);
    }

    @Override // defpackage.c0, java.util.List
    public final ListIterator listIterator(int i) {
        return new k92(this, i);
    }
}
