package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fh0 implements eh0 {
    public final ih0 h;
    public final double i;

    public fh0(ih0 ih0Var, double d) {
        this.h = ih0Var;
        this.i = d;
    }

    @Override // defpackage.xo1
    public final double A0() {
        return this.i;
    }

    @Override // defpackage.ih0
    public final Object R() {
        return this.h;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Double.compare(this.i, ((eh0) obj).A0());
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.h.equals(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return (obj instanceof Comparable) && xo1.c1((Comparable) obj) == this.i;
    }

    @Override // java.util.Map, java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh0)) {
            return false;
        }
        fh0 fh0Var = (fh0) obj;
        return this.h.equals(fh0Var.h) && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(fh0Var.i);
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
        int iHashCode = this.h.hashCode() + 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.i);
        return (iHashCode * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return Collections.singleton(this.h);
    }

    public final String toString() {
        return String.valueOf(this.h) + "=" + this.i;
    }
}
