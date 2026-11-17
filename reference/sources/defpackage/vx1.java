package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vx1 {
    public static final ux1 Companion = new ux1();
    public static final d51[] h = {null, null, null, null, null, null, vs.N(g81.h, new jw0(25))};
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final vs2 f;
    public final List g;

    public /* synthetic */ vx1(int i, String str, String str2, int i2, String str3, String str4, vs2 vs2Var, List list) {
        if (63 != (i & 63)) {
            m02.x(i, 63, tx1.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = str3;
        this.e = str4;
        this.f = vs2Var;
        if ((i & 64) == 0) {
            this.g = ag0.h;
        } else {
            this.g = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx1)) {
            return false;
        }
        vx1 vx1Var = (vx1) obj;
        return uz0.g(this.a, vx1Var.a) && uz0.g(this.b, vx1Var.b) && this.c == vx1Var.c && uz0.g(this.d, vx1Var.d) && uz0.g(this.e, vx1Var.e) && uz0.g(this.f, vx1Var.f) && uz0.g(this.g, vx1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + jp1.f(this.e, jp1.f(this.d, jp1.b(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("PersonDto(id=", this.a, ", name=", this.b, ", age=");
        sbL.append(this.c);
        sbL.append(", gender=");
        sbL.append(this.d);
        sbL.append(", goal=");
        sbL.append(this.e);
        sbL.append(", dailyTargets=");
        sbL.append(this.f);
        sbL.append(", excludedIngredients=");
        sbL.append(this.g);
        sbL.append(")");
        return sbL.toString();
    }
}
