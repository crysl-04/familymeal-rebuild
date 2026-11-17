package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q62 {
    public static final p62 Companion = new p62();
    public static final d51[] l;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final List g;
    public final ep1 h;
    public final List i;
    public final String j;
    public final boolean k;

    static {
        n62 n62Var = new n62((byte) 0);
        g81 g81Var = g81.h;
        l = new d51[]{null, null, vs.N(g81Var, n62Var), null, null, null, vs.N(g81Var, new n62((byte) 1)), null, vs.N(g81Var, new n62((byte) 2)), null, null};
    }

    public /* synthetic */ q62(int i, String str, String str2, List list, String str3, int i2, int i3, List list2, ep1 ep1Var, List list3, String str4, boolean z) {
        if (1759 != (i & 1759)) {
            m02.x(i, 1759, o62.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = i2;
        if ((i & 32) == 0) {
            this.f = 1;
        } else {
            this.f = i3;
        }
        this.g = list2;
        this.h = ep1Var;
        if ((i & 256) == 0) {
            this.i = ag0.h;
        } else {
            this.i = list3;
        }
        this.j = str4;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q62)) {
            return false;
        }
        q62 q62Var = (q62) obj;
        return uz0.g(this.a, q62Var.a) && uz0.g(this.b, q62Var.b) && uz0.g(this.c, q62Var.c) && uz0.g(this.d, q62Var.d) && this.e == q62Var.e && this.f == q62Var.f && uz0.g(this.g, q62Var.g) && uz0.g(this.h, q62Var.h) && uz0.g(this.i, q62Var.i) && uz0.g(this.j, q62Var.j) && this.k == q62Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + jp1.f(this.j, jp1.g(this.i, (this.h.hashCode() + jp1.g(this.g, jp1.b(this.f, jp1.b(this.e, jp1.f(this.d, jp1.g(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("RecipeDto(id=", this.a, ", name=", this.b, ", mealTypes=");
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

    public q62(String str, String str2, ArrayList arrayList, String str3, int i, int i2, ArrayList arrayList2, ep1 ep1Var, List list, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = arrayList2;
        this.h = ep1Var;
        this.i = list;
        this.j = str4;
        this.k = z;
    }
}
