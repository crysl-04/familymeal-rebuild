package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h61 {
    public final int a;
    public final int b;

    public h61(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            dx0.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        dx0.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h61)) {
            return false;
        }
        h61 h61Var = (h61) obj;
        return this.a == h61Var.a && this.b == h61Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wi0.g("Interval(start=", this.a, ", end=", this.b, ")");
    }
}
