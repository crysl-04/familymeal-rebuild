package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qk1 extends ou {
    public final pk1 g;

    public qk1(pk1 pk1Var) {
        this.g = pk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qk1.class != obj.getClass()) {
            return false;
        }
        return uz0.g(this.g, ((qk1) obj).g);
    }

    public final int hashCode() {
        pk1 pk1Var = this.g;
        if (pk1Var != null) {
            return pk1Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "NavBackStackEntryInfo(visibleEntry=" + this.g + ")";
    }
}
