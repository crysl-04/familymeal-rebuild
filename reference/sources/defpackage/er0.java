package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class er0 implements lz {
    public final iz h;

    public er0(iz izVar) {
        this.h = izVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof er0) {
            return this.h.equals(((er0) obj).h);
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() * 31;
    }
}
