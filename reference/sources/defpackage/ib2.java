package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ib2 implements Map.Entry {
    public final qp1 h;
    public final kb1 i;
    public ib2 j;
    public ib2 k;

    public ib2(qp1 qp1Var, kb1 kb1Var) {
        this.h = qp1Var;
        this.i = kb1Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ib2)) {
            return false;
        }
        ib2 ib2Var = (ib2) obj;
        return this.h.equals(ib2Var.h) && this.i.equals(ib2Var.i);
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
        return this.h.hashCode() ^ this.i.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.h + "=" + this.i;
    }
}
