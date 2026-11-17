package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wt1 implements Serializable {
    public final Object h;
    public final Object i;

    public wt1(Object obj, Object obj2) {
        this.h = obj;
        this.i = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt1)) {
            return false;
        }
        wt1 wt1Var = (wt1) obj;
        return uz0.g(this.h, wt1Var.h) && uz0.g(this.i, wt1Var.i);
    }

    public final int hashCode() {
        Object obj = this.h;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.i;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.h + ", " + this.i + ')';
    }
}
