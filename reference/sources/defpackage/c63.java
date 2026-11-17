package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c63 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;

    public c63(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
    }

    public final List a(p60 p60Var, te1 te1Var) {
        p60Var.getClass();
        te1Var.getClass();
        List list = (List) this.a.get(new ek2(p60Var, te1Var));
        return list == null ? ag0.h : list;
    }

    public final double b(ek2 ek2Var, String str, String str2) {
        ek2Var.getClass();
        str.getClass();
        str2.getClass();
        Double d = (Double) this.b.get(new q12(ek2Var, str, str2));
        if (d != null) {
            return d.doubleValue();
        }
        return 1.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c63)) {
            return false;
        }
        c63 c63Var = (c63) obj;
        return this.a.equals(c63Var.a) && this.b.equals(c63Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WeekPlan(slots=" + this.a + ", portions=" + this.b + ")";
    }
}
