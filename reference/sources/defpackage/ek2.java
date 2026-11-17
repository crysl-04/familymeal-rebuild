package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ek2 {
    public final p60 a;
    public final te1 b;

    public ek2(p60 p60Var, te1 te1Var) {
        p60Var.getClass();
        te1Var.getClass();
        this.a = p60Var;
        this.b = te1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek2)) {
            return false;
        }
        ek2 ek2Var = (ek2) obj;
        return this.a == ek2Var.a && this.b == ek2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SlotRef(day=" + this.a + ", meal=" + this.b + ")";
    }
}
