package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u63 {
    public final String a;
    public final LocalDate b;
    public final double c;

    public u63(String str, LocalDate localDate, double d) {
        str.getClass();
        this.a = str;
        this.b = localDate;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u63)) {
            return false;
        }
        u63 u63Var = (u63) obj;
        return uz0.g(this.a, u63Var.a) && this.b.equals(u63Var.b) && Double.compare(this.c, u63Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WeightRecord(personId=" + this.a + ", date=" + this.b + ", kg=" + this.c + ")";
    }
}
