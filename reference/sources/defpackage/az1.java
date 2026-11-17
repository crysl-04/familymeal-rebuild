package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class az1 {
    public final double a;
    public final ArrayList b;
    public final ArrayList c;

    public az1(double d, ArrayList arrayList, ArrayList arrayList2) {
        this.a = d;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az1)) {
            return false;
        }
        az1 az1Var = (az1) obj;
        return Double.compare(this.a, az1Var.a) == 0 && this.b.equals(az1Var.b) && this.c.equals(az1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Double.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Report(objective=" + this.a + ", violations=" + this.b + ", personDays=" + this.c + ")";
    }
}
