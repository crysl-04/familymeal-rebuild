package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zj2 extends qg1 implements c41 {
    public float v;
    public float w;
    public float x;
    public float y;
    public boolean z;

    @Override // defpackage.c41
    public final int E(ad1 ad1Var, ue1 ue1Var, int i) {
        long jJ0 = J0(ad1Var);
        if (k00.f(jJ0)) {
            return k00.h(jJ0);
        }
        if (!this.z) {
            i = l00.g(i, jJ0);
        }
        return l00.f(ue1Var.d0(i), jJ0);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    public final long J0(bf1 bf1Var) {
        int iR;
        int iR2;
        int iR3;
        int i = 0;
        if (Float.isNaN(this.x)) {
            iR = Integer.MAX_VALUE;
        } else {
            iR = bf1Var.R(this.x);
            if (iR < 0) {
                iR = 0;
            }
        }
        if (Float.isNaN(this.y)) {
            iR2 = Integer.MAX_VALUE;
        } else {
            iR2 = bf1Var.R(this.y);
            if (iR2 < 0) {
                iR2 = 0;
            }
        }
        if (Float.isNaN(this.v)) {
            iR3 = 0;
        } else {
            iR3 = bf1Var.R(this.v);
            if (iR3 < 0) {
                iR3 = 0;
            }
            if (iR3 > iR) {
                iR3 = iR;
            }
            if (iR3 == Integer.MAX_VALUE) {
                iR3 = 0;
            }
        }
        if (!Float.isNaN(this.w)) {
            int iR4 = bf1Var.R(this.w);
            if (iR4 < 0) {
                iR4 = 0;
            }
            if (iR4 > iR2) {
                iR4 = iR2;
            }
            if (iR4 != Integer.MAX_VALUE) {
                i = iR4;
            }
        }
        return l00.a(iR3, iR, i, iR2);
    }

    @Override // defpackage.c41
    public final int S(ad1 ad1Var, ue1 ue1Var, int i) {
        long jJ0 = J0(ad1Var);
        if (k00.g(jJ0)) {
            return k00.i(jJ0);
        }
        if (!this.z) {
            i = l00.f(i, jJ0);
        }
        return l00.g(ue1Var.U(i), jJ0);
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        int iK;
        int i;
        int iJ;
        int iH;
        long jA;
        long jJ0 = J0(bf1Var);
        if (this.z) {
            jA = l00.e(j, jJ0);
        } else {
            if (Float.isNaN(this.v)) {
                iK = k00.k(j);
                int i2 = k00.i(jJ0);
                if (iK > i2) {
                    iK = i2;
                }
            } else {
                iK = k00.k(jJ0);
            }
            if (Float.isNaN(this.x)) {
                i = k00.i(j);
                int iK2 = k00.k(jJ0);
                if (i < iK2) {
                    i = iK2;
                }
            } else {
                i = k00.i(jJ0);
            }
            if (Float.isNaN(this.w)) {
                iJ = k00.j(j);
                int iH2 = k00.h(jJ0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = k00.j(jJ0);
            }
            if (Float.isNaN(this.y)) {
                iH = k00.h(j);
                int iJ2 = k00.j(jJ0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = k00.h(jJ0);
            }
            jA = l00.a(iK, i, iJ, iH);
        }
        ny1 ny1VarE = ue1Var.e(jA);
        return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0.h, new m6(ny1VarE, (byte) 9));
    }

    @Override // defpackage.c41
    public final int g(ad1 ad1Var, ue1 ue1Var, int i) {
        long jJ0 = J0(ad1Var);
        if (k00.g(jJ0)) {
            return k00.i(jJ0);
        }
        if (!this.z) {
            i = l00.f(i, jJ0);
        }
        return l00.g(ue1Var.a0(i), jJ0);
    }

    @Override // defpackage.c41
    public final int p(ad1 ad1Var, ue1 ue1Var, int i) {
        long jJ0 = J0(ad1Var);
        if (k00.f(jJ0)) {
            return k00.h(jJ0);
        }
        if (!this.z) {
            i = l00.g(i, jJ0);
        }
        return l00.f(ue1Var.g(i), jJ0);
    }
}
