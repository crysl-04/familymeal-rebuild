package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cj2 extends qg1 implements c41, ug2 {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public long F;
    public hi2 G;
    public boolean H;
    public long I;
    public long J;
    public int K;
    public int L;
    public ln M;
    public p31 N;
    public z61 O;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        ny1 ny1VarE = ue1Var.e(j);
        return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0.h, new uy1((Object) ny1VarE, (Object) this, (byte) 14));
    }

    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
        if (this.H) {
            bh2.l(dh2Var, this.G);
        }
    }

    @Override // defpackage.ug2
    public final boolean j() {
        return false;
    }

    public final String toString() {
        float f = this.v;
        float f2 = this.w;
        float f3 = this.x;
        float f4 = this.y;
        float f5 = this.z;
        float f6 = this.A;
        float f7 = this.B;
        float f8 = this.C;
        float f9 = this.D;
        float f10 = this.E;
        String strB = ez2.b(this.F);
        hi2 hi2Var = this.G;
        boolean z = this.H;
        String strH = kv.h(this.I);
        String strH2 = kv.h(this.J);
        String strI = jp1.i(this.K, "CompositingStrategy(value=", ")");
        String strJ = aa3.J(this.L);
        ln lnVar = this.M;
        p31 p31Var = this.N;
        StringBuilder sbJ = wi0.j("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        sbJ.append(f3);
        sbJ.append(", translationX=");
        sbJ.append(f4);
        sbJ.append(", translationY=");
        sbJ.append(f5);
        sbJ.append(", shadowElevation=");
        sbJ.append(f6);
        sbJ.append(", rotationX=");
        sbJ.append(f7);
        sbJ.append(", rotationY=");
        sbJ.append(f8);
        sbJ.append(", rotationZ=");
        sbJ.append(f9);
        sbJ.append(", cameraDistance=");
        sbJ.append(f10);
        sbJ.append(", transformOrigin=");
        sbJ.append(strB);
        sbJ.append(", shape=");
        sbJ.append(hi2Var);
        sbJ.append(", clip=");
        sbJ.append(z);
        sbJ.append(", renderEffect=null, ambientShadowColor=");
        sbJ.append(strH);
        sbJ.append(", spotShadowColor=");
        wi0.v(sbJ, strH2, ", compositingStrategy=", strI, ", blendMode=");
        sbJ.append(strJ);
        sbJ.append(", colorFilter=");
        sbJ.append(lnVar);
        sbJ.append("outsets=");
        sbJ.append(p31Var);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
