package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class op2 implements oe1 {
    public static final u8 h = fu1.i.a();

    public static void a(double[] dArr, int i, int i2, int i3, k1 k1Var, boolean z, boolean z2) {
        int iG = lg1.g(k1Var.h1(), k1Var.B1());
        double[] dArr2 = new double[iG];
        for (int i4 = iG - 1; i4 >= 0; i4--) {
            for (int i5 = i4; i5 < iG; i5++) {
                dArr2[i5] = z2 ? k1Var.J(i5, i4) : k1Var.J(i4, i5);
            }
            for (int i6 = i2; i6 < i3; i6++) {
                int i7 = i6 * i;
                double d = h32.a;
                for (int i8 = i4 + 1; i8 < iG; i8++) {
                    d += dArr2[i8] * dArr[i8 + i7];
                }
                int i9 = i7 + i4;
                double d2 = dArr[i9] - d;
                if (!z) {
                    d2 /= dArr2[i4];
                }
                dArr[i9] = d2;
            }
        }
    }

    public static void b(float[] fArr, int i, int i2, int i3, k1 k1Var, boolean z, boolean z2) {
        int iG = lg1.g(k1Var.h1(), k1Var.B1());
        float[] fArr2 = new float[iG];
        for (int i4 = iG - 1; i4 >= 0; i4--) {
            for (int i5 = i4; i5 < iG; i5++) {
                fArr2[i5] = z2 ? k1Var.Z0(i5, i4) : k1Var.Z0(i4, i5);
            }
            for (int i6 = i2; i6 < i3; i6++) {
                int i7 = i6 * i;
                float f = 0.0f;
                for (int i8 = i4 + 1; i8 < iG; i8++) {
                    f += fArr2[i8] * fArr[i8 + i7];
                }
                int i9 = i7 + i4;
                float f2 = fArr[i9] - f;
                if (!z) {
                    f2 /= fArr2[i4];
                }
                fArr[i9] = f2;
            }
        }
    }

    public static void c(vc2[] vc2VarArr, int i, int i2, int i3, k1 k1Var, boolean z, boolean z2, uc2 uc2Var) {
        int iMin = (int) Math.min(k1Var.h1(), k1Var.B1());
        vc2[] vc2VarArr2 = (vc2[]) uc2Var.j(iMin);
        for (int i4 = iMin - 1; i4 >= 0; i4--) {
            for (int i5 = i4; i5 < iMin; i5++) {
                vc2VarArr2[i5] = (vc2) (z2 ? ((vc2) k1Var.H(i5, i4)).T0().get() : k1Var.H(i4, i5));
            }
            for (int i6 = i2; i6 < i3; i6++) {
                int i7 = i6 * i;
                vc2 vc2VarK = uc2Var.k();
                for (int i8 = i4 + 1; i8 < iMin; i8++) {
                    vc2VarK = vc2VarK.z1((vc2) vc2VarArr2[i8].i(vc2VarArr[i8 + i7]));
                }
                int i9 = i7 + i4;
                vc2 vc2VarM0 = vc2VarArr[i9].m0(vc2VarK);
                if (!z) {
                    vc2VarM0 = vc2VarM0.T0().I1(vc2VarArr2[i4].T0()).T0();
                }
                vc2VarArr[i9] = (vc2) vc2VarM0.get();
            }
        }
    }
}
