package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gq1 extends ou {
    public final qo0 g;
    public final e91 h;

    public gq1(qo0 qo0Var, e91 e91Var) {
        qo0Var.getClass();
        this.g = qo0Var;
        this.h = e91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq1)) {
            return false;
        }
        gq1 gq1Var = (gq1) obj;
        return uz0.g(this.g, gq1Var.g) && uz0.g(this.h, gq1Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        e91 e91Var = this.h;
        return iHashCode + (e91Var == null ? 0 : e91Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.g + ", owner=" + this.h + ')';
    }
}
