package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bw0 {
    public static final aw0 Companion = new aw0();
    public final String a;
    public final String b;
    public final String c;
    public final ep1 d;

    public /* synthetic */ bw0(int i, String str, String str2, String str3, ep1 ep1Var) {
        if (15 != (i & 15)) {
            m02.x(i, 15, zv0.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ep1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw0)) {
            return false;
        }
        bw0 bw0Var = (bw0) obj;
        return uz0.g(this.a, bw0Var.a) && uz0.g(this.b, bw0Var.b) && uz0.g(this.c, bw0Var.c) && uz0.g(this.d, bw0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + jp1.f(this.c, jp1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = wi0.l("IngredientDto(id=", this.a, ", name=", this.b, ", category=");
        sbL.append(this.c);
        sbL.append(", per100g=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }

    public bw0(String str, String str2, String str3, ep1 ep1Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ep1Var;
    }
}
