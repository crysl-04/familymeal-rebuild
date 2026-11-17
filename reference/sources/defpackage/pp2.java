package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class pp2 implements oe1 {
    public static final u8 h = fu1.i.a();

    public static void a(double[] dArr, int i, int i2, int i3, k1 k1Var, boolean z, boolean z2) {
        int iG = lg1.g(k1Var.h1(), k1Var.B1());
        double[] dArr2 = new double[iG];
        for (int i4 = 0; i4 < iG; i4++) {
            for (int i5 = 0; i5 <= i4; i5++) {
                dArr2[i5] = z2 ? k1Var.J(i5, i4) : k1Var.J(i4, i5);
            }
            for (int i6 = i2; i6 < i3; i6++) {
                int i7 = i6 * i;
                double d = h32.a;
                for (int i8 = 0; i8 < i4; i8++) {
                    d += dArr2[i8] * dArr[i8 + i7];
                }
                double d2 = dArr[i4 + i7] - d;
                if (!z) {
                    d2 /= dArr2[i4];
                }
                dArr[i7 + i4] = d2;
            }
        }
    }

    public static void b(float[] fArr, int i, int i2, int i3, k1 k1Var, boolean z, boolean z2) {
        int iG = lg1.g(k1Var.h1(), k1Var.B1());
        float[] fArr2 = new float[iG];
        for (int i4 = 0; i4 < iG; i4++) {
            for (int i5 = 0; i5 <= i4; i5++) {
                fArr2[i5] = z2 ? k1Var.Z0(i5, i4) : k1Var.Z0(i4, i5);
            }
            for (int i6 = i2; i6 < i3; i6++) {
                int i7 = i6 * i;
                float f = 0.0f;
                for (int i8 = 0; i8 < i4; i8++) {
                    f += fArr2[i8] * fArr[i8 + i7];
                }
                float f2 = fArr[i4 + i7] - f;
                if (!z) {
                    f2 /= fArr2[i4];
                }
                fArr[i7 + i4] = f2;
            }
        }
    }

    public static void c(vc2[] vc2VarArr, int i, int i2, int i3, k1 k1Var, boolean z, boolean z2, uc2 uc2Var) {
        int iG = lg1.g(k1Var.h1(), k1Var.B1());
        vc2[] vc2VarArr2 = (vc2[]) uc2Var.j(iG);
        for (int i4 = 0; i4 < iG; i4++) {
            for (int i5 = 0; i5 <= i4; i5++) {
                vc2VarArr2[i5] = (vc2) (z2 ? ((vc2) k1Var.H(i5, i4)).T0().get() : k1Var.H(i4, i5));
            }
            for (int i6 = i2; i6 < i3; i6++) {
                int i7 = i6 * i;
                vc2 vc2VarK = uc2Var.k();
                for (int i8 = 0; i8 < i4; i8++) {
                    vc2VarK = vc2VarK.z1((vc2) vc2VarArr2[i8].i(vc2VarArr[i8 + i7]));
                }
                vc2 vc2VarM0 = vc2VarArr[i4 + i7].m0(vc2VarK);
                if (!z) {
                    vc2VarM0 = vc2VarM0.T0().I1(vc2VarArr2[i4].T0()).T0();
                }
                vc2VarArr[i7 + i4] = (vc2) vc2VarM0.get();
            }
        }
    }
}
