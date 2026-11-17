package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o10 implements ci0 {
    public final ya2 a;
    public final ya2 b;
    public final gy1 c;
    public final gy1 d;
    public final m00 e;
    public final eg f;
    public final int[] g;

    public o10(int i, int i2, int i3, boolean z) {
        g52 g52Var = l52.q;
        this.f = new eg(i);
        ya2 ya2Var = new ya2(g52Var, i, 0);
        this.a = ya2Var;
        ya2Var.j(i2);
        this.c = g52.R(i2, 1);
        ya2 ya2Var2 = new ya2(g52Var, i, 0);
        this.b = ya2Var2;
        ya2Var2.j(i3);
        this.d = g52.R(i3, 1);
        this.g = new int[i];
        this.e = m00.a0(i2 + i3, z);
    }

    @Override // defpackage.ci0
    public final int b() {
        return 0;
    }

    @Override // defpackage.ci0
    public final boolean c(int i) {
        return false;
    }

    @Override // defpackage.ci0
    public final int d() {
        return j();
    }

    @Override // defpackage.ci0
    public final ih0 e(int i) {
        return null;
    }

    @Override // defpackage.ci0
    public final int f(int i) {
        return this.g[i];
    }

    public final void g(double[] dArr, a1 a1Var) {
        int iH = h();
        int i = i();
        for (int i2 = 0; i2 < iH; i2++) {
            double dA = a1Var.A(i2);
            if (dA != h32.a) {
                am2 it = this.a.a0(i2).b().iterator();
                while (it.hasNext()) {
                    it.c();
                    int intExact = Math.toIntExact(it.D0());
                    dArr[intExact] = (it.A0() * dA) + dArr[intExact];
                }
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iH + i3;
            double dA2 = a1Var.A(i4);
            ih0[] ih0VarArr = this.e.i;
            ih0 ih0Var = ih0VarArr != null ? ih0VarArr[i4] : null;
            if (dA2 != h32.a && (ih0Var == null || !(ih0Var.R() instanceof e33))) {
                am2 it2 = this.b.a0(i3).b().iterator();
                while (it2.hasNext()) {
                    it2.c();
                    int intExact2 = Math.toIntExact(it2.D0());
                    dArr[intExact2] = (it2.A0() * dA2) + dArr[intExact2];
                }
            }
        }
    }

    public final int h() {
        return this.a.k.size();
    }

    public final int i() {
        return this.b.k.size();
    }

    public final int j() {
        return Math.toIntExact(((re1) ((g2) this.f.i).i).count());
    }

    public final void k(int i, mg1 mg1Var, cs1 cs1Var, BigDecimal bigDecimal, boolean z, boolean z2) {
        this.d.y0(i, 0L, bigDecimal);
        this.e.d0(this.c.Z1() + i, mg1Var, cs1Var, z, z2);
    }
}
