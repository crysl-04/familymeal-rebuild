package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hh0 implements ih0 {
    public final mg1 h;
    public final Object i;

    public hh0(mg1 mg1Var, Object obj) {
        Objects.requireNonNull(mg1Var);
        this.h = mg1Var;
        Objects.requireNonNull(obj);
        this.i = obj;
    }

    @Override // defpackage.ih0
    public final Object R() {
        return this.h;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.h.equals(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.i.equals(obj);
    }

    @Override // java.util.Map, java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh0)) {
            return false;
        }
        hh0 hh0Var = (hh0) obj;
        if (!this.h.equals(hh0Var.h)) {
            return false;
        }
        Object obj2 = hh0Var.i;
        Object obj3 = this.i;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (this.h.equals(obj)) {
            return this.i;
        }
        return null;
    }

    @Override // defpackage.ih0, java.util.Map.Entry
    public final Object getKey() {
        return this.h;
    }

    @Override // defpackage.ih0, java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // java.util.Map, java.util.Map.Entry
    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + 31) * 31;
        Object obj = this.i;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @Override // defpackage.ih0
    public final Object j() {
        return this.i;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return Collections.singleton(this.h);
    }

    public final String toString() {
        return wi0.h(String.valueOf(this.h), "=", String.valueOf(this.i));
    }

    @Override // java.util.Map
    public final Collection values() {
        return Collections.singleton(this.i);
    }
}
