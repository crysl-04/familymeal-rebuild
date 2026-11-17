package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ui0 implements Map.Entry, l21 {
    public final d91 h;
    public final g91 i;
    public ui0 j;
    public ui0 k;
    public boolean l;

    public ui0(d91 d91Var, g91 g91Var) {
        this.h = d91Var;
        this.i = g91Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ui0) {
            ui0 ui0Var = (ui0) obj;
            return this.h.equals(ui0Var.h) && this.i == ui0Var.i;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.i.hashCode() + (this.h.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.h + ", value=" + this.i + ")";
    }
}
