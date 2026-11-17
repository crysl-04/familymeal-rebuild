package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rx1 {
    public final String a;
    public final String b;
    public final e40 c;
    public final Set d;

    public rx1(String str, String str2, e40 e40Var, Set set) {
        str.getClass();
        str2.getClass();
        e40Var.getClass();
        set.getClass();
        this.a = str;
        this.b = str2;
        this.c = e40Var;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx1)) {
            return false;
        }
        rx1 rx1Var = (rx1) obj;
        return uz0.g(this.a, rx1Var.a) && uz0.g(this.b, rx1Var.b) && uz0.g(this.c, rx1Var.c) && uz0.g(this.d, rx1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + jp1.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("Person(id=", this.a, ", name=", this.b, ", targets=");
        sbL.append(this.c);
        sbL.append(", excludedIngredientCategories=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }
}
