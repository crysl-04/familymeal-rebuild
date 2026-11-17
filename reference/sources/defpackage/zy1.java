package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zy1 {
    public final String a;
    public final p60 b;
    public final bp1 c;
    public final double d;
    public final e40 e;
    public final ArrayList f;

    public zy1(String str, p60 p60Var, bp1 bp1Var, double d, e40 e40Var, ArrayList arrayList) {
        str.getClass();
        e40Var.getClass();
        this.a = str;
        this.b = p60Var;
        this.c = bp1Var;
        this.d = d;
        this.e = e40Var;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy1)) {
            return false;
        }
        zy1 zy1Var = (zy1) obj;
        return uz0.g(this.a, zy1Var.a) && this.b == zy1Var.b && this.c.equals(zy1Var.c) && Double.compare(this.d, zy1Var.d) == 0 && uz0.g(this.e, zy1Var.e) && this.f.equals(zy1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + jp1.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "PersonDay(personId=" + this.a + ", day=" + this.b + ", intake=" + this.c + ", deviation=" + this.d + ", targets=" + this.e + ", meals=" + this.f + ")";
    }
}
