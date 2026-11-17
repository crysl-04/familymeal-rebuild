package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yr2 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public yr2(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr2)) {
            return false;
        }
        yr2 yr2Var = (yr2) obj;
        if (uz0.g(this.a, yr2Var.a) && uz0.g(this.b, yr2Var.b) && uz0.g(this.c, yr2Var.c) && this.d.equals(yr2Var.d)) {
            return this.e.equals(yr2Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + jp1.g(this.d, jp1.f(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return do2.G(do2.I("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + h12.q(dv.L0(this.d)) + "\n            |   referenceColumnNames = {" + h12.p(dv.L0(this.e)) + "\n            |}\n        "));
    }
}
