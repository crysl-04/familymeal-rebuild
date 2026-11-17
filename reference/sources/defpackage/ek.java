package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ek {
    public static final dk Companion = new dk();
    public final String a;
    public final String b;
    public final double c;

    public /* synthetic */ ek(double d, int i, String str, String str2) {
        if (7 != (i & 7)) {
            m02.x(i, 7, ck.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek)) {
            return false;
        }
        ek ekVar = (ek) obj;
        return uz0.g(this.a, ekVar.a) && uz0.g(this.b, ekVar.b) && Double.compare(this.c, ekVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + jp1.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("WeightDto(personId=", this.a, ", date=", this.b, ", weightKg=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }

    public ek(String str, String str2, double d) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = d;
    }
}
