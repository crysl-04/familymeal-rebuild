package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bz1 {
    public final List a;
    public final List b;
    public final List c;
    public final ed2 d;
    public final int e;
    public final lz1 f;
    public final Map g;
    public final Map h;

    public bz1(List list, List list2, List list3, ed2 ed2Var, int i, lz1 lz1Var, Map map, Map map2) {
        list.getClass();
        list2.getClass();
        lz1Var.getClass();
        map.getClass();
        map2.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = ed2Var;
        this.e = i;
        this.f = lz1Var;
        this.g = map;
        this.h = map2;
        if (1 > i || i >= 13) {
            wg.m("Failed requirement.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz1)) {
            return false;
        }
        bz1 bz1Var = (bz1) obj;
        return uz0.g(this.a, bz1Var.a) && uz0.g(this.b, bz1Var.b) && uz0.g(this.c, bz1Var.c) && uz0.g(this.d, bz1Var.d) && this.e == bz1Var.e && uz0.g(this.f, bz1Var.f) && uz0.g(this.g, bz1Var.g) && uz0.g(this.h, bz1Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + jp1.b(this.e, (this.d.a.hashCode() + jp1.g(this.c, jp1.g(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlanInput(recipes=" + this.a + ", ingredients=" + this.b + ", persons=" + this.c + ", schedule=" + this.d + ", month=" + this.e + ", rules=" + this.f + ", locked=" + this.g + ", banned=" + this.h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bz1(List list, List list2, List list3, ed2 ed2Var, int i, lz1 lz1Var, int i2) {
        lz1 lz1Var2 = (i2 & 32) != 0 ? new lz1() : lz1Var;
        bg0 bg0Var = bg0.h;
        this(list, list2, list3, ed2Var, i, lz1Var2, bg0Var, bg0Var);
    }
}
