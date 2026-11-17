package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xw2 {
    public static final xw2 d = new xw2(0, 0, null, 0, 0, 0, 16777215);
    public final yl2 a;
    public final cu1 b;
    public final k02 c;

    public xw2(long j, long j2, qn0 qn0Var, long j3, int i, long j4, int i2) {
        this(new yl2((i2 & 1) != 0 ? kv.g : j, (i2 & 2) != 0 ? ax2.c : j2, (i2 & 4) != 0 ? null : qn0Var, (on0) null, (pn0) null, (ar2) null, (String) null, (i2 & 128) != 0 ? ax2.c : j3, (uk) null, (yv2) null, (ub1) null, kv.g, (vt2) null, (ei2) null, (f02) null), new cu1((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? ax2.c : j4, null, null, null, 0, 0, null), null);
    }

    public static xw2 a(xw2 xw2Var, long j, long j2, qn0 qn0Var, ar2 ar2Var, long j3, long j4, w91 w91Var, int i) {
        xv2 wvVar;
        k02 k02Var = ia2.k;
        long jA = (i & 1) != 0 ? xw2Var.a.a.a() : j;
        long j5 = (i & 2) != 0 ? xw2Var.a.b : j2;
        qn0 qn0Var2 = (i & 4) != 0 ? xw2Var.a.c : qn0Var;
        yl2 yl2Var = xw2Var.a;
        on0 on0Var = yl2Var.d;
        pn0 pn0Var = yl2Var.e;
        ar2 ar2Var2 = (i & 32) != 0 ? yl2Var.f : ar2Var;
        String str = yl2Var.g;
        long j6 = (i & 128) != 0 ? yl2Var.h : j3;
        uk ukVar = yl2Var.i;
        yv2 yv2Var = yl2Var.j;
        ub1 ub1Var = yl2Var.k;
        long j7 = yl2Var.l;
        vt2 vt2Var = yl2Var.m;
        ei2 ei2Var = yl2Var.n;
        ud0 ud0Var = yl2Var.p;
        int i2 = (i & 32768) != 0 ? xw2Var.b.a : 3;
        int i3 = (i & 65536) != 0 ? xw2Var.b.b : 1;
        long j8 = (i & 131072) != 0 ? xw2Var.b.c : j4;
        cu1 cu1Var = xw2Var.b;
        zv2 zv2Var = cu1Var.d;
        k02 k02Var2 = (i & 524288) != 0 ? xw2Var.c : k02Var;
        w91 w91Var2 = (i & 1048576) != 0 ? cu1Var.f : w91Var;
        int i4 = cu1Var.g;
        int i5 = cu1Var.h;
        ow2 ow2Var = cu1Var.i;
        long jA2 = yl2Var.a.a();
        int i6 = kv.h;
        if (r13.a(jA, jA2)) {
            wvVar = yl2Var.a;
        } else {
            wvVar = jA != 16 ? new wv(jA) : wv2.a;
        }
        return new xw2(new yl2(wvVar, j5, qn0Var2, on0Var, pn0Var, ar2Var2, str, j6, ukVar, yv2Var, ub1Var, j7, vt2Var, ei2Var, k02Var2 != null ? k02Var2.a : null, ud0Var), new cu1(i2, i3, j8, zv2Var, k02Var2 != null ? k02Var2.b : null, w91Var2, i4, i5, ow2Var), k02Var2);
    }

    public static xw2 e(xw2 xw2Var, long j, long j2, qn0 qn0Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? ax2.c : j2;
        qn0 qn0Var2 = (i2 & 4) != 0 ? null : qn0Var;
        long j6 = (i2 & 128) != 0 ? ax2.c : j3;
        long j7 = kv.g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? ax2.c : j4;
        yl2 yl2VarA = zl2.a(xw2Var.a, j, null, Float.NaN, j5, qn0Var2, null, null, null, null, j6, null, null, null, j7, null, null, null, null);
        cu1 cu1VarA = du1.a(xw2Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (xw2Var.a == yl2VarA && xw2Var.b == cu1VarA) ? xw2Var : new xw2(yl2VarA, cu1VarA);
    }

    public final long b() {
        return this.a.a.a();
    }

    public final boolean c(xw2 xw2Var) {
        if (this != xw2Var) {
            return uz0.g(this.b, xw2Var.b) && this.a.a(xw2Var.a);
        }
        return true;
    }

    public final xw2 d(xw2 xw2Var) {
        return (xw2Var == null || xw2Var.equals(d)) ? this : new xw2(this.a.c(xw2Var.a), this.b.a(xw2Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw2)) {
            return false;
        }
        xw2 xw2Var = (xw2) obj;
        return uz0.g(this.a, xw2Var.a) && uz0.g(this.b, xw2Var.b) && uz0.g(this.c, xw2Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        k02 k02Var = this.c;
        return iHashCode + (k02Var != null ? k02Var.hashCode() : 0);
    }

    public final String toString() {
        String strH = kv.h(b());
        yl2 yl2Var = this.a;
        zo zoVarB = yl2Var.a.b();
        float fC = yl2Var.a.c();
        String strD = ax2.d(yl2Var.b);
        qn0 qn0Var = yl2Var.c;
        on0 on0Var = yl2Var.d;
        pn0 pn0Var = yl2Var.e;
        ar2 ar2Var = yl2Var.f;
        String str = yl2Var.g;
        String strD2 = ax2.d(yl2Var.h);
        uk ukVar = yl2Var.i;
        yv2 yv2Var = yl2Var.j;
        ub1 ub1Var = yl2Var.k;
        String strH2 = kv.h(yl2Var.l);
        vt2 vt2Var = yl2Var.m;
        ei2 ei2Var = yl2Var.n;
        ud0 ud0Var = yl2Var.p;
        cu1 cu1Var = this.b;
        String strA = zs2.a(cu1Var.a);
        String strA2 = yt2.a(cu1Var.b);
        String strD3 = ax2.d(cu1Var.c);
        zv2 zv2Var = cu1Var.d;
        w91 w91Var = cu1Var.f;
        String strA3 = r91.a(cu1Var.g);
        String strA4 = wt0.a(cu1Var.h);
        ow2 ow2Var = cu1Var.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(zoVarB);
        sb.append(", alpha=");
        sb.append(fC);
        sb.append(", fontSize=");
        sb.append(strD);
        sb.append(", fontWeight=");
        sb.append(qn0Var);
        sb.append(", fontStyle=");
        sb.append(on0Var);
        sb.append(", fontSynthesis=");
        sb.append(pn0Var);
        sb.append(", fontFamily=");
        sb.append(ar2Var);
        sb.append(", fontFeatureSettings=");
        wi0.v(sb, str, ", letterSpacing=", strD2, ", baselineShift=");
        sb.append(ukVar);
        sb.append(", textGeometricTransform=");
        sb.append(yv2Var);
        sb.append(", localeList=");
        sb.append(ub1Var);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(vt2Var);
        sb.append(", shadow=");
        sb.append(ei2Var);
        sb.append(", drawStyle=");
        sb.append(ud0Var);
        sb.append(", textAlign=");
        sb.append(strA);
        sb.append(", textDirection=");
        wi0.v(sb, strA2, ", lineHeight=", strD3, ", textIndent=");
        sb.append(zv2Var);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(w91Var);
        sb.append(", lineBreak=");
        sb.append(strA3);
        sb.append(", hyphens=");
        sb.append(strA4);
        sb.append(", textMotion=");
        sb.append(ow2Var);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xw2(yl2 yl2Var, cu1 cu1Var) {
        f02 f02Var = yl2Var.o;
        xz1 xz1Var = cu1Var.e;
        this(yl2Var, cu1Var, (f02Var == null && xz1Var == null) ? null : new k02(f02Var, xz1Var));
    }

    public xw2(yl2 yl2Var, cu1 cu1Var, k02 k02Var) {
        this.a = yl2Var;
        this.b = cu1Var;
        this.c = k02Var;
    }
}
