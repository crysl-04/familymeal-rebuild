package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hl1 extends el1 {
    public final tm1 f;
    public final ArrayList g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl1(tm1 tm1Var) {
        super(tm1Var.b(vs.D(jl1.class)), null);
        tm1Var.getClass();
        this.g = new ArrayList();
        this.f = tm1Var;
    }

    public final gl1 c() {
        gl1 gl1Var = (gl1) super.a();
        u30 u30Var = gl1Var.m;
        u30Var.getClass();
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dl1 dl1Var = (dl1) obj;
            if (dl1Var != null) {
                dm2 dm2Var = (dm2) u30Var.d;
                gl1 gl1Var2 = (gl1) u30Var.c;
                fe feVar = gl1Var2.i;
                fe feVar2 = dl1Var.i;
                int i2 = feVar2.b;
                String str = (String) feVar2.f;
                if (i2 == 0 && str == null) {
                    wg.m("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) feVar.f;
                if (str2 != null && uz0.g(str, str2)) {
                    li1.i("Destination ", dl1Var, " cannot have the same route as graph ", gl1Var2);
                    return null;
                }
                if (i2 == feVar.b) {
                    li1.i("Destination ", dl1Var, " cannot have the same id as graph ", gl1Var2);
                    return null;
                }
                dl1 dl1Var2 = (dl1) aa3.g(dm2Var, i2);
                if (dl1Var2 == dl1Var) {
                    continue;
                } else {
                    if (dl1Var.j != null) {
                        li1.g("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (dl1Var2 != null) {
                        dl1Var2.j = null;
                    }
                    dl1Var.j = gl1Var2;
                    dm2Var.c(feVar2.b, dl1Var);
                }
            }
        }
        gl1 gl1Var3 = (gl1) u30Var.c;
        if ("week".equals((String) gl1Var3.i.f)) {
            li1.i("Start destination ", "week", " cannot use the same route as the graph ", gl1Var3);
        } else if (co2.X("week")) {
            wg.m("Cannot have an empty start destination route");
        } else {
            int i3 = dl1.l;
            u30Var.b = "android-app://androidx.navigation/".concat("week").hashCode();
            u30Var.f = "week";
        }
        return gl1Var;
    }
}
