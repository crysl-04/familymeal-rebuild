package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ph implements Iterator, Map.Entry {
    public int h;
    public int i = -1;
    public boolean j;
    public final /* synthetic */ rh k;

    public ph(rh rhVar) {
        this.k = rhVar;
        this.h = rhVar.j - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.j) {
            li1.g("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.i;
            rh rhVar = this.k;
            if (uz0.g(key, rhVar.e(i)) && uz0.g(entry.getValue(), rhVar.h(this.i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.j) {
            return this.k.e(this.i);
        }
        li1.g("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.j) {
            return this.k.h(this.i);
        }
        li1.g("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.j) {
            li1.g("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.i;
        rh rhVar = this.k;
        Object objE = rhVar.e(i);
        Object objH = rhVar.h(this.i);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            wg.p();
            return null;
        }
        this.i++;
        this.j = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.j) {
            throw new IllegalStateException();
        }
        this.k.f(this.i);
        this.i--;
        this.h--;
        this.j = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.j) {
            return this.k.g(this.i, obj);
        }
        li1.g("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
