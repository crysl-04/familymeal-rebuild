package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class gj0 implements sh {
    public static final u8 h = fu1.i.a();

    public static void a(vc2[] vc2VarArr, int i, int i2, int i3, re1 re1Var, uc2 uc2Var) {
        int i4 = i * i2;
        while (i2 < i3) {
            int i5 = 0;
            while (i5 < i) {
                vc2VarArr[i4] = (vc2) ((vc2) uc2Var.n(re1Var.H(i2, i5))).T0().get();
                i5++;
                i4++;
            }
            i2++;
        }
    }

    public static void b(vc2[] vc2VarArr, int i, int i2, int i3, k1 k1Var, uc2 uc2Var) {
        int i4 = i * i2;
        while (i2 < i3) {
            int i5 = 0;
            while (i5 < i) {
                vc2VarArr[i4] = (vc2) uc2Var.n(k1Var.H(i5, i2));
                i5++;
                i4++;
            }
            i2++;
        }
    }

    public static void c(int i, int i2, int i3, int i4, double[] dArr, double[] dArr2) {
        if (i <= 120) {
            while (i2 < i3) {
                int i5 = i2 * i;
                int i6 = i2;
                int i7 = 0;
                while (i7 < i) {
                    dArr[i5] = dArr2[i6];
                    i7++;
                    i5++;
                    i6 += i4;
                }
                i2++;
            }
            return;
        }
        while (i2 < i3) {
            int i8 = i2 + 32;
            int iMin = Math.min(i3, i8);
            int i9 = 0;
            while (i9 < i) {
                int i10 = i9 + 32;
                int iMin2 = Math.min(i, i10);
                for (int i11 = i2; i11 < iMin; i11++) {
                    int i12 = (i11 * i) + i9;
                    int i13 = (i9 * i4) + i11;
                    int i14 = i9;
                    while (i14 < iMin2) {
                        dArr[i12] = dArr2[i13];
                        i14++;
                        i12++;
                        i13 += i4;
                    }
                }
                i9 = i10;
            }
            i2 = i8;
        }
    }

    public static void d(vc2[] vc2VarArr, int i, int i2, int i3, re1 re1Var, uc2 uc2Var) {
        int i4 = i * i2;
        while (i2 < i3) {
            int i5 = 0;
            while (i5 < i) {
                vc2VarArr[i4] = (vc2) uc2Var.n(re1Var.H(i2, i5));
                i5++;
                i4++;
            }
            i2++;
        }
    }
}
