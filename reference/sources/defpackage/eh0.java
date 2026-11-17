package defpackage;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface eh0 extends ih0, xo1, Comparable {
    @Override // java.util.Map
    default Collection values() {
        return Collections.singleton(this);
    }

    @Override // defpackage.ih0, java.util.Map.Entry
    default Object getValue() {
        return this;
    }

    @Override // defpackage.ih0
    default Object j() {
        return this;
    }
}
