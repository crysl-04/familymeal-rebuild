package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rt1 implements pt1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public rt1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            yw0.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.pt1
    public final float a(u31 u31Var) {
        return u31Var == u31.h ? this.a : this.c;
    }

    @Override // defpackage.pt1
    public final float b(u31 u31Var) {
        return u31Var == u31.h ? this.c : this.a;
    }

    @Override // defpackage.pt1
    public final float c() {
        return this.d;
    }

    @Override // defpackage.pt1
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rt1)) {
            return false;
        }
        rt1 rt1Var = (rt1) obj;
        return cc0.b(this.a, rt1Var.a) && cc0.b(this.b, rt1Var.b) && cc0.b(this.c, rt1Var.c) && cc0.b(this.d, rt1Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + wi0.d(this.c, wi0.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String strC = cc0.c(this.a);
        String strC2 = cc0.c(this.b);
        String strC3 = cc0.c(this.c);
        String strC4 = cc0.c(this.d);
        StringBuilder sbL = wi0.l("PaddingValues(start=", strC, ", top=", strC2, ", end=");
        sbL.append(strC3);
        sbL.append(", bottom=");
        sbL.append(strC4);
        sbL.append(")");
        return sbL.toString();
    }
}
