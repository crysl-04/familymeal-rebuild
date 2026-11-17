package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bu1 {
    public String a;
    public xw2 b;
    public sm0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public bf1 i;
    public g9 j;
    public boolean k;
    public fg1 m;
    public k9 n;
    public u31 o;
    public long s;
    public long h = ex0.a;
    public long l = 0;
    public long p = l00.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public bu1(String str, xw2 xw2Var, sm0 sm0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = xw2Var;
        this.c = sm0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long e(bu1 bu1Var, long j, u31 u31Var) {
        int iJ;
        xw2 xw2Var = bu1Var.b;
        fg1 fg1Var = bu1Var.m;
        bf1 bf1Var = bu1Var.i;
        bf1Var.getClass();
        sm0 sm0Var = bu1Var.c;
        if ((fg1Var == null || u31Var != fg1Var.a || !p02.H(xw2Var, u31Var).equals(fg1Var.b) || bf1Var.b() != fg1Var.c.h || sm0Var != fg1Var.d) && ((fg1Var = fg1.h) == null || u31Var != fg1Var.a || !p02.H(xw2Var, u31Var).equals(fg1Var.b) || bf1Var.b() != fg1Var.c.h || sm0Var != fg1Var.d)) {
            fg1Var = new fg1(u31Var, p02.H(xw2Var, u31Var), new h90(bf1Var.b(), bf1Var.n()), sm0Var);
            fg1.h = fg1Var;
        }
        bu1Var.m = fg1Var;
        int i = bu1Var.g;
        h90 h90Var = fg1Var.c;
        xw2 xw2Var2 = fg1Var.e;
        float f = fg1Var.g;
        float f2 = fg1Var.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = gg1.a;
            sm0 sm0Var2 = fg1Var.d;
            ag0 ag0Var = ag0.h;
            g9 g9Var = new g9(new k9(str, xw2Var2, ag0Var, ag0Var, sm0Var2, h90Var, false), 1, 1, l00.b(0, 0, 0, 0, 15));
            float f3 = new g9(new k9(gg1.b, xw2Var2, ag0Var, ag0Var, fg1Var.d, h90Var, true), 2, 1, l00.b(0, 0, 0, 0, 15)).f;
            float f4 = g9Var.f;
            float f5 = f3 - f4;
            fg1Var.g = f4;
            fg1Var.f = f5;
            f2 = f5;
            f = f4;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iJ = iRound >= 0 ? iRound : 0;
            int iH = k00.h(j);
            if (iJ > iH) {
                iJ = iH;
            }
        } else {
            iJ = k00.j(j);
        }
        return l00.a(k00.k(j), k00.i(j), iJ, k00.h(j));
    }

    public final int a(int i, u31 u31Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = l00.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = e(this, jA, u31Var);
        }
        au1 au1VarD = d(u31Var);
        k9 k9Var = (k9) au1VarD;
        long jW = lt.w(k9Var.p.c(), this.d, jA, this.e);
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iG = rz1.g(new g9(k9Var, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jW).f);
        int iJ = k00.j(jA);
        if (iG < iJ) {
            iG = iJ;
        }
        this.q = i;
        this.r = iG;
        return iG;
    }

    public final boolean b(long j, u31 u31Var) {
        k9 k9Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jE = this.g > 1 ? e(this, j, u31Var) : j;
        g9 g9Var = this.j;
        boolean z2 = false;
        if (g9Var != null && (k9Var = this.n) != null && !k9Var.a() && u31Var == this.o && (k00.c(jE, this.p) || (k00.i(jE) == k00.i(this.p) && k00.k(jE) == k00.k(this.p) && k00.h(jE) >= g9Var.f && !g9Var.d.d))) {
            if (!k00.c(jE, this.p)) {
                g9 g9Var2 = this.j;
                g9Var2.getClass();
                long jD = l00.d(jE, (((long) rz1.g(Math.min(g9Var2.a.p.c(), g9Var2.c()))) << 32) | (((long) rz1.g(g9Var2.f)) & 4294967295L));
                this.l = jD;
                if (this.d == 3 || (((int) (jD >> 32)) >= g9Var2.c() && ((int) (jD & 4294967295L)) >= g9Var2.f)) {
                    z = false;
                }
                this.k = z;
                this.p = jE;
            }
            return false;
        }
        k9 k9Var2 = (k9) d(u31Var);
        long jW = lt.w(k9Var2.p.c(), this.d, jE, this.e);
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        g9 g9Var3 = new g9(k9Var2, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jW);
        this.p = jE;
        int iG = rz1.g(g9Var3.c());
        float f = g9Var3.f;
        long jD2 = l00.d(jE, (((long) iG) << 32) | (((long) rz1.g(f)) & 4294967295L));
        this.l = jD2;
        if (this.d != 3 && (((int) (jD2 >> 32)) < g9Var3.c() || ((int) (jD2 & 4294967295L)) < f)) {
            z2 = true;
        }
        this.k = z2;
        this.j = g9Var3;
        return true;
    }

    public final void c(bf1 bf1Var) {
        long jA;
        bf1 bf1Var2 = this.i;
        if (bf1Var != null) {
            int i = ex0.b;
            jA = ex0.a(bf1Var.b(), bf1Var.n());
        } else {
            jA = ex0.a;
        }
        if (bf1Var2 == null) {
            this.i = bf1Var;
            this.h = jA;
            return;
        }
        if (bf1Var == null || this.h != jA) {
            this.i = bf1Var;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            this.j = null;
            this.n = null;
            this.o = null;
            this.q = -1;
            this.r = -1;
            this.p = l00.h(0, 0, 0, 0);
            this.l = 0L;
            this.k = false;
        }
    }

    public final au1 d(u31 u31Var) {
        k9 k9Var = this.n;
        if (k9Var == null || u31Var != this.o || k9Var.a()) {
            this.o = u31Var;
            String str = this.a;
            xw2 xw2VarH = p02.H(this.b, u31Var);
            bf1 bf1Var = this.i;
            bf1Var.getClass();
            sm0 sm0Var = this.c;
            boolean z = this.e;
            ag0 ag0Var = ag0.h;
            k9Var = new k9(str, xw2VarH, ag0Var, ag0Var, sm0Var, bf1Var, z);
        }
        this.n = k9Var;
        return k9Var;
    }

    public final String toString() {
        String str = this.j != null ? "<paragraph>" : "null";
        String strB = ex0.b(this.h);
        long j = this.s;
        StringBuilder sbL = wi0.l("ParagraphLayoutCache(paragraph=", str, ", lastDensity=", strB, ", history=");
        sbL.append(j);
        sbL.append(", constraints=$)");
        return sbL.toString();
    }
}
