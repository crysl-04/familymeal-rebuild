package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qm1 extends ls {
    public final jm1 l;

    public qm1(jm1 jm1Var) {
        jm1Var.getClass();
        this.l = jm1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && qm1.class == obj.getClass() && uz0.g(this.l, ((qm1) obj).l);
        }
        return true;
    }

    public final int hashCode() {
        return this.l.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.l + ", direction=-1)";
    }
}
