package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ud1 implements Map.Entry, m21 {
    public final wd1 h;
    public final int i;
    public final int j;

    public ud1(wd1 wd1Var, int i) {
        wd1Var.getClass();
        this.h = wd1Var;
        this.i = i;
        this.j = wd1Var.o;
    }

    public final void a() {
        if (this.h.o != this.j) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return uz0.g(entry.getKey(), getKey()) && uz0.g(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.h.h[this.i];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.h.i;
        objArr.getClass();
        return objArr[this.i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        wd1 wd1Var = this.h;
        wd1Var.c();
        Object[] objArr = wd1Var.i;
        if (objArr == null) {
            int length = wd1Var.h.length;
            if (length < 0) {
                wg.m("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            wd1Var.i = objArr;
        }
        int i = this.i;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
