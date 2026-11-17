package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ez1 {
    public final yy1 a;
    public final c63 b;
    public final Set c;
    public final Map d;
    public final ed2 e;
    public final Map f;
    public final Map g;
    public final List h;
    public final Map i;

    public ez1(yy1 yy1Var, c63 c63Var, Set set, Map map, ed2 ed2Var, Map map2, Map map3, List list, Map map4) {
        yy1Var.getClass();
        this.a = yy1Var;
        this.b = c63Var;
        this.c = set;
        this.d = map;
        this.e = ed2Var;
        this.f = map2;
        this.g = map3;
        this.h = list;
        this.i = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez1)) {
            return false;
        }
        ez1 ez1Var = (ez1) obj;
        return uz0.g(this.a, ez1Var.a) && this.b.equals(ez1Var.b) && this.c.equals(ez1Var.c) && this.d.equals(ez1Var.d) && this.e.equals(ez1Var.e) && this.f.equals(ez1Var.f) && this.g.equals(ez1Var.g) && this.h.equals(ez1Var.h) && this.i.equals(ez1Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + jp1.g(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((this.e.a.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "PlanView(plan=" + this.a + ", week=" + this.b + ", locked=" + this.c + ", dishNames=" + this.d + ", diners=" + this.e + ", recipes=" + this.f + ", ingredients=" + this.g + ", persons=" + this.h + ", personNames=" + this.i + ")";
    }
}
