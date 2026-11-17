package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zr2 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public zr2(String str, boolean z, List list, List list2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr2)) {
            return false;
        }
        zr2 zr2Var = (zr2) obj;
        String str = zr2Var.a;
        if (this.b != zr2Var.b || !this.c.equals(zr2Var.c) || !uz0.g(this.d, zr2Var.d)) {
            return false;
        }
        String str2 = this.a;
        return jo2.N(str2, "index_") ? jo2.N(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + jp1.g(this.c, (((jo2.N(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        return do2.G(do2.I("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + h12.q(this.c) + "\n            |   orders = {" + h12.p(this.d) + "\n            |}\n        "));
    }
}
