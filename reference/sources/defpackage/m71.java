package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m71 extends qg1 implements ug2 {
    public final k71 A = new k71(this, 0);
    public k71 B;
    public p21 v;
    public h71 w;
    public ks1 x;
    public boolean y;
    public md2 z;

    public m71(p21 p21Var, h71 h71Var, ks1 ks1Var, boolean z) {
        this.v = p21Var;
        this.w = h71Var;
        this.x = ks1Var;
        this.y = z;
        J0();
    }

    public final void J0() {
        this.z = new md2(new l71(this, (byte) 0), new l71(this, (byte) 1));
        this.B = this.y ? new k71(this, (byte) 1) : null;
    }

    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
        bh2.n(dh2Var);
        dh2Var.a(ah2.P, this.A);
        ks1 ks1Var = this.x;
        md2 md2Var = this.z;
        if (ks1Var == ks1.h) {
            if (md2Var == null) {
                uz0.A("scrollAxisRange");
                throw null;
            }
            ch2 ch2Var = ah2.w;
            q21 q21Var = bh2.a[13];
            ch2Var.getClass();
            dh2Var.a(ch2Var, md2Var);
        } else {
            if (md2Var == null) {
                uz0.A("scrollAxisRange");
                throw null;
            }
            bh2.i(dh2Var, md2Var);
        }
        k71 k71Var = this.B;
        if (k71Var != null) {
            dh2Var.a(qg2.f, new m1(null, k71Var));
        }
        dh2Var.a(qg2.C, new m1(null, new z61(new l71(this, (byte) 2), (byte) 20)));
        Object objD = this.w.d();
        ch2 ch2Var2 = ah2.f;
        q21 q21Var2 = bh2.a[24];
        ch2Var2.getClass();
        dh2Var.a(ch2Var2, objD);
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
