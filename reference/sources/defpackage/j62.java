package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j62 {
    public final String a;
    public final String b;
    public final Set c;
    public final zr d;
    public final int e;
    public final int f;
    public final List g;
    public final bp1 h;
    public final Set i;
    public final cf2 j;
    public final boolean k;

    public j62(String str, String str2, Set set, zr zrVar, int i, int i2, List list, bp1 bp1Var, Set set2, cf2 cf2Var, boolean z) {
        str.getClass();
        str2.getClass();
        set.getClass();
        zrVar.getClass();
        cf2Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = set;
        this.d = zrVar;
        this.e = i;
        this.f = i2;
        this.g = list;
        this.h = bp1Var;
        this.i = set2;
        this.j = cf2Var;
        this.k = z;
        if (i < 1) {
            wg.m("baseServings must be >= 1");
            throw null;
        }
        if (i2 >= 1) {
            return;
        }
        wg.m("minDiners must be >= 1");
        throw null;
    }

    public static j62 a(j62 j62Var, bp1 bp1Var) {
        String str = j62Var.a;
        String str2 = j62Var.b;
        Set set = j62Var.c;
        zr zrVar = j62Var.d;
        int i = j62Var.e;
        int i2 = j62Var.f;
        List list = j62Var.g;
        Set set2 = j62Var.i;
        cf2 cf2Var = j62Var.j;
        boolean z = j62Var.k;
        str.getClass();
        str2.getClass();
        set.getClass();
        zrVar.getClass();
        cf2Var.getClass();
        return new j62(str, str2, set, zrVar, i, i2, list, bp1Var, set2, cf2Var, z);
    }

    public final bp1 b() {
        return this.h.c(1.0d / ((double) this.e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j62)) {
            return false;
        }
        j62 j62Var = (j62) obj;
        return uz0.g(this.a, j62Var.a) && uz0.g(this.b, j62Var.b) && uz0.g(this.c, j62Var.c) && this.d == j62Var.d && this.e == j62Var.e && this.f == j62Var.f && this.g.equals(j62Var.g) && this.h.equals(j62Var.h) && this.i.equals(j62Var.i) && this.j == j62Var.j && this.k == j62Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + jp1.g(this.g, jp1.b(this.f, jp1.b(this.e, (this.d.hashCode() + ((this.c.hashCode() + jp1.f(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("Recipe(id=", this.a, ", name=", this.b, ", mealTypes=");
        sbL.append(this.c);
        sbL.append(", category=");
        sbL.append(this.d);
        sbL.append(", baseServings=");
        sbL.append(this.e);
        sbL.append(", minDiners=");
        sbL.append(this.f);
        sbL.append(", ingredients=");
        sbL.append(this.g);
        sbL.append(", totalNutrients=");
        sbL.append(this.h);
        sbL.append(", tags=");
        sbL.append(this.i);
        sbL.append(", season=");
        sbL.append(this.j);
        sbL.append(", quick=");
        sbL.append(this.k);
        sbL.append(")");
        return sbL.toString();
    }
}
