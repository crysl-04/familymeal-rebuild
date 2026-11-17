package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ae1 implements Map, l21 {
    public final mj1 h;
    public dh0 i;
    public dh0 j;
    public bp2 k;

    public ae1(mj1 mj1Var) {
        this.h = mj1Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.h.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.h.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        dh0 dh0Var = this.i;
        if (dh0Var != null) {
            return dh0Var;
        }
        dh0 dh0Var2 = new dh0(this.h, (byte) 0);
        this.i = dh0Var2;
        return dh0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ae1.class != obj.getClass()) {
            return false;
        }
        return this.h.equals(((ae1) obj).h);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.h.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.h.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        dh0 dh0Var = this.j;
        if (dh0Var != null) {
            return dh0Var;
        }
        dh0 dh0Var2 = new dh0(this.h, (byte) 1);
        this.j = dh0Var2;
        return dh0Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.h.e;
    }

    public final String toString() {
        return this.h.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        bp2 bp2Var = this.k;
        if (bp2Var != null) {
            return bp2Var;
        }
        bp2 bp2Var2 = new bp2(this.h);
        this.k = bp2Var2;
        return bp2Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
