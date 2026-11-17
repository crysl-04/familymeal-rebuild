package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface ih0 extends Map, Map.Entry {
    Object R();

    @Override // java.util.Map
    default void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    default Set entrySet() {
        return Collections.singleton(this);
    }

    Object getKey();

    Object getValue();

    @Override // java.util.Map
    default boolean isEmpty() {
        return false;
    }

    Object j();

    @Override // java.util.Map
    default Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    default void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    default Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    default Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    default int size() {
        return 1;
    }
}
