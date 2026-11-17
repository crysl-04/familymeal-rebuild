package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rh extends bj2 implements Map {
    public mh k;
    public oh l;
    public qh m;

    @Override // java.util.Map
    public final Set entrySet() {
        mh mhVar = this.k;
        if (mhVar != null) {
            return mhVar;
        }
        mh mhVar2 = new mh(this, (byte) 0);
        this.k = mhVar2;
        return mhVar2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.j;
    }

    @Override // java.util.Map
    public final Set keySet() {
        oh ohVar = this.l;
        if (ohVar != null) {
            return ohVar;
        }
        oh ohVar2 = new oh(this);
        this.l = ohVar2;
        return ohVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.j;
        int i = this.j;
        int[] iArr = this.h;
        if (iArr.length < size) {
            this.h = Arrays.copyOf(iArr, size);
            this.i = Arrays.copyOf(this.i, size << 1);
        }
        if (this.j != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        qh qhVar = this.m;
        if (qhVar != null) {
            return qhVar;
        }
        qh qhVar2 = new qh(this);
        this.m = qhVar2;
        return qhVar2;
    }
}
