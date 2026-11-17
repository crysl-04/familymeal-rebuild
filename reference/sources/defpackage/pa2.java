package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pa2 implements hi2 {
    public final l20 a;
    public final l20 b;
    public final l20 c;
    public final l20 d;

    public pa2(l20 l20Var, l20 l20Var2, l20 l20Var3, l20 l20Var4) {
        this.a = l20Var;
        this.b = l20Var2;
        this.c = l20Var3;
        this.d = l20Var4;
    }

    public static pa2 b(pa2 pa2Var, l20 l20Var, l20 l20Var2, l20 l20Var3, l20 l20Var4, int i) {
        if ((i & 1) != 0) {
            l20Var = pa2Var.a;
        }
        if ((i & 2) != 0) {
            l20Var2 = pa2Var.b;
        }
        if ((i & 4) != 0) {
            l20Var3 = pa2Var.c;
        }
        if ((i & 8) != 0) {
            l20Var4 = pa2Var.d;
        }
        pa2Var.getClass();
        return new pa2(l20Var, l20Var2, l20Var3, l20Var4);
    }

    @Override // defpackage.hi2
    public final ou a(long j, u31 u31Var, e90 e90Var) {
        float fA = this.a.a(j, e90Var);
        float fA2 = this.b.a(j, e90Var);
        float fA3 = this.c.a(j, e90Var);
        float fA4 = this.d.a(j, e90Var);
        float fB = wj2.b(j);
        float f = fA + fA4;
        if (f > fB) {
            float f2 = fB / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fB) {
            float f4 = fB / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            StringBuilder sbJ = wi0.j("Corner size in Px can't be negative(topStart = ", fA, ", topEnd = ", fA2, ", bottomEnd = ");
            sbJ.append(fA3);
            sbJ.append(", bottomStart = ");
            sbJ.append(fA4);
            sbJ.append(")!");
            dx0.a(sbJ.toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new ns1(h12.b(0L, j));
        }
        r72 r72VarB = h12.b(0L, j);
        u31 u31Var2 = u31.h;
        float f5 = u31Var == u31Var2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (u31Var == u31Var2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f6 = u31Var == u31Var2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (u31Var != u31Var2) {
            fA4 = fA3;
        }
        return new os1(new na2(r72VarB.a, r72VarB.b, r72VarB.c, r72VarB.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa2)) {
            return false;
        }
        pa2 pa2Var = (pa2) obj;
        return uz0.g(this.a, pa2Var.a) && uz0.g(this.b, pa2Var.b) && uz0.g(this.c, pa2Var.c) && uz0.g(this.d, pa2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
