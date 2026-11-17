package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class x implements ne1 {
    public final fy1 i;
    public boolean h = false;
    public Boolean j = null;

    public x(fy1 fy1Var) {
        this.i = fy1Var;
    }

    public static void R(ly1 ly1Var, gy1 gy1Var) {
        if (ly1Var.b) {
            int i = 0;
            if (gy1Var.T() != 1) {
                gy1 gy1VarU = gy1Var.U();
                int[] iArr = ly1Var.c;
                gy1VarU.getClass();
                int length = iArr.length;
                gy1VarU.T();
                gy1VarU.C0().h().k();
                gy1VarU.C0().h().c();
                int length2 = iArr.length;
                while (i < length2) {
                    gy1Var.X0(i, gy1VarU.N1(iArr[i]));
                    i++;
                }
                return;
            }
            if (ly1Var.b) {
                int[] iArrD = ly1Var.d();
                BitSet bitSet = ly1Var.a;
                if (gy1Var instanceof l52) {
                    l52 l52Var = (l52) gy1Var;
                    if (l52Var.n == 1 || l52Var.o == 1) {
                        ly1Var.b(l52Var.j, iArrD);
                        return;
                    }
                }
                boolean z = gy1Var.Z1() == 1;
                bitSet.clear();
                int length3 = iArrD.length;
                while (i < length3) {
                    if (!bitSet.get(i)) {
                        bitSet.set(i);
                        for (int i2 = iArrD[i]; i2 != i; i2 = iArrD[i2]) {
                            bitSet.set(i2);
                            long j = i;
                            long j2 = i2;
                            if (z) {
                                gy1Var.E(j, j2);
                            } else {
                                gy1Var.K(j, j2);
                            }
                        }
                    }
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d0(g01 g01Var, gy1 gy1Var) {
        if (gy1Var.T() == 1 && (gy1Var instanceof xh)) {
            g01Var.x1(((xh) gy1Var).j);
            return;
        }
        int iZ1 = gy1Var.Z1();
        double[] dArr = new double[iZ1];
        k1 k1Var = gy1Var.a2().h;
        long j = 1;
        long jB1 = k1Var.B1() - 1;
        dk1 dk1Var = k1Var instanceof dk1 ? (dk1) k1Var : null;
        long j2 = -1;
        while (true) {
            if (!(j2 < jB1)) {
                return;
            }
            j2 += j;
            int iMin = Math.min(k1Var.Z1(), iZ1);
            for (int i = 0; i < iMin; i++) {
                dArr[i] = k1Var.y1(i, j2);
            }
            g01Var.x1(dArr);
            int iMin2 = Math.min(dArr.length, k1Var.Z1());
            int i2 = 0;
            while (i2 < iMin2) {
                double d = dArr[i2];
                if (dk1Var == null) {
                    throw new UnsupportedOperationException();
                }
                long j3 = j2;
                dk1Var.Y1(i2, j3, d);
                i2++;
                j2 = j3;
            }
            j = 1;
        }
    }

    public abstract boolean a0();

    public final double i0() {
        return this.i.h().g() * ((double) Math.toIntExact(Math.max(Z1(), T())));
    }

    public final gy1 m0(int i, int i2) {
        return (gy1) this.i.q(i, i2);
    }

    @Override // defpackage.ne1
    public void reset() {
        this.h = false;
        this.j = null;
    }

    public final boolean s0() {
        Boolean bool;
        if (this.h && this.j == null) {
            this.j = Boolean.valueOf(a0());
        }
        return this.h && (bool = this.j) != null && bool.booleanValue();
    }
}
