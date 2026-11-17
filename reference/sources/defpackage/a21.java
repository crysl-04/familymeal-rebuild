package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a21 extends n11 implements Map<String, n11>, l21 {
    public static final z11 Companion = new z11();
    public final Map h;

    public a21(Map map) {
        map.getClass();
        this.h = map;
    }

    @Override // defpackage.n11
    public final void a(StringBuilder sb) {
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : this.h.entrySet()) {
            String str = (String) entry.getKey();
            n11 n11Var = (n11) entry.getValue();
            if (!z) {
                sb.append(',');
            }
            ao2.a(sb, str);
            sb.append(':');
            n11Var.a(sb);
            z = false;
        }
        sb.append('}');
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n11 compute(String str, BiFunction<? super String, ? super n11, ? extends n11> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n11 computeIfAbsent(String str, Function<? super String, ? extends n11> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n11 computeIfPresent(String str, BiFunction<? super String, ? super n11, ? extends n11> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.h.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof n11)) {
            return false;
        }
        return this.h.containsValue((n11) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, n11>> entrySet() {
        return this.h.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return uz0.g(this.h, obj);
    }

    @Override // java.util.Map
    public final n11 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (n11) this.h.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.h.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.h.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n11 merge(String str, n11 n11Var, BiFunction<? super n11, ? super n11, ? extends n11> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n11 put(String str, n11 n11Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends n11> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n11 putIfAbsent(String str, n11 n11Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final n11 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n11 replace(String str, n11 n11Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super n11, ? extends n11> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.h.size();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.h.size() * 6);
        a(sb);
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection<n11> values() {
        return this.h.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, n11 n11Var, n11 n11Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
