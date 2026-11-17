package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hr implements jr {
    public final na1 a;

    public hr(na1 na1Var) {
        na1Var.getClass();
        this.a = na1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hr) && this.a.equals(((hr) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Invalid(problems=" + this.a + ")";
    }
}
