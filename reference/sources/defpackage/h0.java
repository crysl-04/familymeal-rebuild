package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends c0 {
    public abstract h0 b(int i, Object obj);

    public abstract h0 c(Object obj);

    @Override // defpackage.q, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.q, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public h0 d(Collection collection) {
        ox1 ox1VarE = e();
        ox1VarE.addAll(collection);
        return ox1VarE.c();
    }

    public abstract ox1 e();

    public abstract h0 f(g0 g0Var);

    public abstract h0 g(int i);

    public abstract h0 h(int i, Object obj);

    @Override // defpackage.c0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.c0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.c0, java.util.List
    public final List subList(int i, int i2) {
        return new pu0(this, i, i2);
    }
}
