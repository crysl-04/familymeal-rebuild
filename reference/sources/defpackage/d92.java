package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d92 implements Serializable {
    public final Throwable h;

    public d92(Throwable th) {
        th.getClass();
        this.h = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d92) {
            return uz0.g(this.h, ((d92) obj).h);
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.h + ')';
    }
}
