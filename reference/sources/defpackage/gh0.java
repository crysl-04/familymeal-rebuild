package defpackage;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gh0 implements eh0 {
    public final Comparable h;
    public final long i;

    public gh0(long j, Comparable comparable) {
        Objects.requireNonNull(comparable);
        this.h = comparable;
        this.i = j;
    }

    @Override // defpackage.xo1
    public final double A0() {
        return this.i;
    }

    @Override // defpackage.ih0
    public final Object R() {
        return this.h;
    }

    @Override // defpackage.xo1
    public final int U0() {
        return Math.toIntExact(this.i);
    }

    @Override // defpackage.xo1
    public final long a0() {
        return this.i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.i, ((eh0) obj).a0());
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.h.equals(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return (obj instanceof Comparable) && xo1.T1((Comparable) obj) == this.i;
    }

    @Override // java.util.Map, java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh0)) {
            return false;
        }
        gh0 gh0Var = (gh0) obj;
        return this.h.equals(gh0Var.h) && this.i == gh0Var.i;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (this.h.equals(obj)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.ih0, java.util.Map.Entry
    public final Object getKey() {
        return this.h;
    }

    @Override // java.util.Map, java.util.Map.Entry
    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + 31) * 31;
        long j = this.i;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return Collections.singleton(this.h);
    }

    public final String toString() {
        return String.valueOf(this.h) + "=" + this.i;
    }
}
