package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yl2 implements kd {
    public final xv2 a;
    public final long b;
    public final qn0 c;
    public final on0 d;
    public final pn0 e;
    public final ar2 f;
    public final String g;
    public final long h;
    public final uk i;
    public final yv2 j;
    public final ub1 k;
    public final long l;
    public final vt2 m;
    public final ei2 n;
    public final f02 o;
    public final ud0 p;

    public yl2(long j, long j2, qn0 qn0Var, on0 on0Var, pn0 pn0Var, ar2 ar2Var, String str, long j3, uk ukVar, yv2 yv2Var, ub1 ub1Var, long j4, vt2 vt2Var, ei2 ei2Var, int i) {
        this((i & 1) != 0 ? kv.g : j, (i & 2) != 0 ? ax2.c : j2, (i & 4) != 0 ? null : qn0Var, (i & 8) != 0 ? null : on0Var, (i & 16) != 0 ? null : pn0Var, (i & 32) != 0 ? null : ar2Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? ax2.c : j3, (i & 256) != 0 ? null : ukVar, (i & 512) != 0 ? null : yv2Var, (i & 1024) != 0 ? null : ub1Var, (i & 2048) != 0 ? kv.g : j4, (i & 4096) != 0 ? null : vt2Var, (i & 8192) != 0 ? null : ei2Var, (f02) null);
    }

    public final boolean a(yl2 yl2Var) {
        if (this == yl2Var) {
            return true;
        }
        if (!ax2.a(this.b, yl2Var.b) || !uz0.g(this.c, yl2Var.c) || !uz0.g(this.d, yl2Var.d) || !uz0.g(this.e, yl2Var.e) || !uz0.g(this.f, yl2Var.f) || !uz0.g(this.g, yl2Var.g) || !ax2.a(this.h, yl2Var.h) || !uz0.g(this.i, yl2Var.i) || !uz0.g(this.j, yl2Var.j) || !uz0.g(this.k, yl2Var.k)) {
            return false;
        }
        long j = yl2Var.l;
        int i = kv.h;
        return r13.a(this.l, j) && uz0.g(this.o, yl2Var.o);
    }

    public final boolean b(yl2 yl2Var) {
        return uz0.g(this.a, yl2Var.a) && uz0.g(this.m, yl2Var.m) && uz0.g(this.n, yl2Var.n) && uz0.g(this.p, yl2Var.p);
    }

    public final yl2 c(yl2 yl2Var) {
        if (yl2Var == null) {
            return this;
        }
        xv2 xv2Var = yl2Var.a;
        return zl2.a(this, xv2Var.a(), xv2Var.b(), xv2Var.c(), yl2Var.b, yl2Var.c, yl2Var.d, yl2Var.e, yl2Var.f, yl2Var.g, yl2Var.h, yl2Var.i, yl2Var.j, yl2Var.k, yl2Var.l, yl2Var.m, yl2Var.n, yl2Var.o, yl2Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl2)) {
            return false;
        }
        yl2 yl2Var = (yl2) obj;
        return a(yl2Var) && b(yl2Var);
    }

    public final int hashCode() {
        xv2 xv2Var = this.a;
        long jA = xv2Var.a();
        int i = kv.h;
        int iHashCode = Long.hashCode(jA) * 31;
        zo zoVarB = xv2Var.b();
        int iHashCode2 = (Float.hashCode(xv2Var.c()) + ((iHashCode + (zoVarB != null ? zoVarB.hashCode() : 0)) * 31)) * 31;
        bx2[] bx2VarArr = ax2.b;
        int iD = jp1.d(this.b, iHashCode2, 31);
        qn0 qn0Var = this.c;
        int i2 = (iD + (qn0Var != null ? qn0Var.h : 0)) * 31;
        on0 on0Var = this.d;
        int iHashCode3 = (i2 + (on0Var != null ? Integer.hashCode(on0Var.a) : 0)) * 31;
        pn0 pn0Var = this.e;
        int iHashCode4 = (iHashCode3 + (pn0Var != null ? Integer.hashCode(pn0Var.a) : 0)) * 31;
        ar2 ar2Var = this.f;
        int iHashCode5 = (iHashCode4 + (ar2Var != null ? ar2Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iD2 = jp1.d(this.h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        uk ukVar = this.i;
        int iHashCode6 = (iD2 + (ukVar != null ? Float.hashCode(ukVar.a) : 0)) * 31;
        yv2 yv2Var = this.j;
        int iHashCode7 = (iHashCode6 + (yv2Var != null ? yv2Var.hashCode() : 0)) * 31;
        ub1 ub1Var = this.k;
        int iD3 = jp1.d(this.l, (iHashCode7 + (ub1Var != null ? ub1Var.h.hashCode() : 0)) * 31, 31);
        vt2 vt2Var = this.m;
        int i3 = (iD3 + (vt2Var != null ? vt2Var.a : 0)) * 31;
        ei2 ei2Var = this.n;
        int iHashCode8 = (i3 + (ei2Var != null ? ei2Var.hashCode() : 0)) * 31;
        f02 f02Var = this.o;
        int iHashCode9 = (iHashCode8 + (f02Var != null ? f02Var.hashCode() : 0)) * 31;
        ud0 ud0Var = this.p;
        return iHashCode9 + (ud0Var != null ? ud0Var.hashCode() : 0);
    }

    public final String toString() {
        xv2 xv2Var = this.a;
        String strH = kv.h(xv2Var.a());
        zo zoVarB = xv2Var.b();
        float fC = xv2Var.c();
        String strD = ax2.d(this.b);
        String strD2 = ax2.d(this.h);
        String strH2 = kv.h(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(zoVarB);
        sb.append(", alpha=");
        sb.append(fC);
        sb.append(", fontSize=");
        sb.append(strD);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        wi0.v(sb, this.g, ", letterSpacing=", strD2, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public yl2(xv2 xv2Var, long j, qn0 qn0Var, on0 on0Var, pn0 pn0Var, ar2 ar2Var, String str, long j2, uk ukVar, yv2 yv2Var, ub1 ub1Var, long j3, vt2 vt2Var, ei2 ei2Var, f02 f02Var, ud0 ud0Var) {
        this.a = xv2Var;
        this.b = j;
        this.c = qn0Var;
        this.d = on0Var;
        this.e = pn0Var;
        this.f = ar2Var;
        this.g = str;
        this.h = j2;
        this.i = ukVar;
        this.j = yv2Var;
        this.k = ub1Var;
        this.l = j3;
        this.m = vt2Var;
        this.n = ei2Var;
        this.o = f02Var;
        this.p = ud0Var;
    }

    public yl2(long j, long j2, qn0 qn0Var, on0 on0Var, pn0 pn0Var, ar2 ar2Var, String str, long j3, uk ukVar, yv2 yv2Var, ub1 ub1Var, long j4, vt2 vt2Var, ei2 ei2Var, f02 f02Var) {
        xv2 wvVar;
        if (j != 16) {
            wvVar = new wv(j);
        } else {
            wvVar = wv2.a;
        }
        this(wvVar, j2, qn0Var, on0Var, pn0Var, ar2Var, str, j3, ukVar, yv2Var, ub1Var, j4, vt2Var, ei2Var, f02Var, null);
    }
}
