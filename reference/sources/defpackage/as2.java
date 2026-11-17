package defpackage;

import java.util.AbstractSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class as2 {
    public final String a;
    public final Map b;
    public final AbstractSet c;
    public final AbstractSet d;

    public as2(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as2)) {
            return false;
        }
        as2 as2Var = (as2) obj;
        if (!this.a.equals(as2Var.a) || !this.b.equals(as2Var.b) || !this.c.equals(as2Var.c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.d;
        if (abstractSet2 == null || (abstractSet = as2Var.d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(h12.i(dv.M0(this.b.values(), new mm0((byte) 12))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(h12.i(this.c));
        sb.append("\n            |    indices = {");
        AbstractSet abstractSet = this.d;
        sb.append(h12.i(abstractSet != null ? dv.M0(abstractSet, new mm0((byte) 13)) : ag0.h));
        sb.append("\n            |}\n        ");
        return do2.I(sb.toString());
    }
}
