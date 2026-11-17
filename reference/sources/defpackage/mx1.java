package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mx1 extends t0 implements Set, Collection, l21 {
    public static final mx1 k;
    public final Object h;
    public final Object i;
    public final ex1 j;

    static {
        c5 c5Var = c5.U;
        k = new mx1(c5Var, c5Var, ex1.j);
    }

    public mx1(Object obj, Object obj2, ex1 ex1Var) {
        this.h = obj;
        this.i = obj2;
        this.j = ex1Var;
    }

    @Override // defpackage.q
    public final int a() {
        return this.j.i;
    }

    @Override // defpackage.q, java.util.Collection
    public final boolean contains(Object obj) {
        return this.j.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new lr0(this.h, this.j);
    }
}
