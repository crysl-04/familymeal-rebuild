package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class ds0 extends wg1 {
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final float q;
    public final long r;
    public final hi2 s;
    public final boolean t;
    public final long u;
    public final long v;
    public final int w;
    public final int x;
    public final ln y;
    public final p31 z;

    public ds0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, hi2 hi2Var, boolean z, long j2, long j3, int i, int i2, ln lnVar, p31 p31Var) {
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
        this.o = f8;
        this.p = f9;
        this.q = f10;
        this.r = j;
        this.s = hi2Var;
        this.t = z;
        this.u = j2;
        this.v = j3;
        this.w = i;
        this.x = i2;
        this.y = lnVar;
        this.z = p31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds0)) {
            return false;
        }
        ds0 ds0Var = (ds0) obj;
        if (Float.compare(this.h, ds0Var.h) != 0 || Float.compare(this.i, ds0Var.i) != 0 || Float.compare(this.j, ds0Var.j) != 0 || Float.compare(this.k, ds0Var.k) != 0 || Float.compare(this.l, ds0Var.l) != 0 || Float.compare(this.m, ds0Var.m) != 0 || Float.compare(this.n, ds0Var.n) != 0 || Float.compare(this.o, ds0Var.o) != 0 || Float.compare(this.p, ds0Var.p) != 0 || Float.compare(this.q, ds0Var.q) != 0 || !ez2.a(this.r, ds0Var.r) || !uz0.g(this.s, ds0Var.s) || this.t != ds0Var.t) {
            return false;
        }
        long j = ds0Var.u;
        int i = kv.h;
        return r13.a(this.u, j) && r13.a(this.v, ds0Var.v) && this.w == ds0Var.w && this.x == ds0Var.x && uz0.g(this.y, ds0Var.y) && uz0.g(this.z, ds0Var.z);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        cj2 cj2Var = new cj2();
        cj2Var.v = this.h;
        cj2Var.w = this.i;
        cj2Var.x = this.j;
        cj2Var.y = this.k;
        cj2Var.z = this.l;
        cj2Var.A = this.m;
        cj2Var.B = this.n;
        cj2Var.C = this.o;
        cj2Var.D = this.p;
        cj2Var.E = this.q;
        cj2Var.F = this.r;
        cj2Var.G = this.s;
        cj2Var.H = this.t;
        cj2Var.I = this.u;
        cj2Var.J = this.v;
        cj2Var.K = this.w;
        cj2Var.L = this.x;
        cj2Var.M = this.y;
        cj2Var.N = this.z;
        cj2Var.O = new z61(cj2Var, (byte) 23);
        return cj2Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        pn1 pn1Var;
        cj2 cj2Var = (cj2) qg1Var;
        cj2Var.v = this.h;
        cj2Var.w = this.i;
        cj2Var.x = this.j;
        cj2Var.y = this.k;
        cj2Var.z = this.l;
        cj2Var.A = this.m;
        cj2Var.B = this.n;
        cj2Var.C = this.o;
        cj2Var.D = this.p;
        cj2Var.E = this.q;
        cj2Var.F = this.r;
        cj2Var.G = this.s;
        cj2Var.H = this.t;
        cj2Var.I = this.u;
        cj2Var.J = this.v;
        cj2Var.K = this.w;
        cj2Var.L = this.x;
        cj2Var.M = this.y;
        cj2Var.N = this.z;
        z61 z61Var = cj2Var.O;
        if (!cj2Var.h.u || (pn1Var = cu.W(cj2Var, 2).C) == null) {
            return;
        }
        pn1Var.v1(z61Var, true);
    }

    public final int hashCode() {
        int iC = jp1.c((this.s.hashCode() + jp1.d(this.r, wi0.d(this.q, wi0.d(this.p, wi0.d(this.o, wi0.d(this.n, wi0.d(this.m, wi0.d(this.l, wi0.d(this.k, wi0.d(this.j, wi0.d(this.i, Float.hashCode(this.h) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 961, this.t);
        int i = kv.h;
        int iB = jp1.b(this.x, jp1.b(this.w, jp1.d(this.v, jp1.d(this.u, iC, 31), 31), 31), 31);
        ln lnVar = this.y;
        int iHashCode = (iB + (lnVar == null ? 0 : lnVar.hashCode())) * 31;
        this.z.getClass();
        return iHashCode;
    }

    public final String toString() {
        String strB = ez2.b(this.r);
        String strH = kv.h(this.u);
        String strH2 = kv.h(this.v);
        String strI = jp1.i(this.w, "CompositingStrategy(value=", ")");
        String strJ = aa3.J(this.x);
        StringBuilder sbJ = wi0.j("GraphicsLayerElement(scaleX=", this.h, ", scaleY=", this.i, ", alpha=");
        sbJ.append(this.j);
        sbJ.append(", translationX=");
        sbJ.append(this.k);
        sbJ.append(", translationY=");
        sbJ.append(this.l);
        sbJ.append(", shadowElevation=");
        sbJ.append(this.m);
        sbJ.append(", rotationX=");
        sbJ.append(this.n);
        sbJ.append(", rotationY=");
        sbJ.append(this.o);
        sbJ.append(", rotationZ=");
        sbJ.append(this.p);
        sbJ.append(", cameraDistance=");
        sbJ.append(this.q);
        sbJ.append(", transformOrigin=");
        sbJ.append(strB);
        sbJ.append(", shape=");
        sbJ.append(this.s);
        sbJ.append(", clip=");
        sbJ.append(this.t);
        sbJ.append(", renderEffect=null, ambientShadowColor=");
        sbJ.append(strH);
        sbJ.append(", spotShadowColor=");
        wi0.v(sbJ, strH2, ", compositingStrategy=", strI, ", blendMode=");
        sbJ.append(strJ);
        sbJ.append(", colorFilter=");
        sbJ.append(this.y);
        sbJ.append(", outsets=");
        sbJ.append(this.z);
        sbJ.append(")");
        return sbJ.toString();
    }
}
