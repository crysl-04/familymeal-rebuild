package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface af0 extends l1, Iterable, Iterator, Spliterator, Comparable {
    long D0();

    @Override // java.util.Spliterator
    default int characteristics() {
        return 21845;
    }

    @Override // java.lang.Comparable
    default int compareTo(Object obj) {
        return Long.compare(D0(), ((af0) obj).D0());
    }

    @Override // java.util.Iterator, java.util.Spliterator
    default void forEachRemaining(Consumer consumer) {
        super.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    default Comparator getComparator() {
        return null;
    }

    @Override // java.lang.Iterable
    af0 iterator();

    @Override // java.util.Iterator
    default void remove() {
        a42.b();
        throw null;
    }

    @Override // java.util.Spliterator
    default boolean tryAdvance(Consumer consumer) {
        if (!hasNext()) {
            return false;
        }
        consumer.accept(next());
        return true;
    }

    @Override // java.util.Spliterator
    af0 trySplit();
}
