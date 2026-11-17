package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uu implements wu {
    public final double h;
    public final double i;

    public uu(double d, double d2) {
        this.h = d;
        this.i = d2;
    }

    @Override // defpackage.xu
    public final Comparable a() {
        return Double.valueOf(this.h);
    }

    @Override // defpackage.xu
    public final Comparable b() {
        return Double.valueOf(this.i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uu)) {
            return false;
        }
        double d = this.h;
        double d2 = this.i;
        if (d > d2) {
            uu uuVar = (uu) obj;
            if (uuVar.h > uuVar.i) {
                return true;
            }
        }
        uu uuVar2 = (uu) obj;
        return d == uuVar2.h && d2 == uuVar2.i;
    }

    public final int hashCode() {
        double d = this.h;
        double d2 = this.i;
        if (d > d2) {
            return -1;
        }
        return Double.hashCode(d2) + (Double.hashCode(d) * 31);
    }

    public final String toString() {
        return this.h + ".." + this.i;
    }
}
