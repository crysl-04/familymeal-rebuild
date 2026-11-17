package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ni1 implements oe1 {
    public static final u8 h = fu1.j.a();

    public static void a(float[] fArr, int i, int i2, float[] fArr2, int i3, float[] fArr3) {
        int length = fArr2.length / i3;
        while (i < i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                aa3.x(fArr, i * length, fArr3[(i * i3) + i4], fArr2, i4 * length, 0, length);
            }
            i++;
        }
    }

    public static void b(vc2[] vc2VarArr, int i, int i2, vc2[] vc2VarArr2, int i3, vc2[] vc2VarArr3) {
        int length = vc2VarArr2.length / i3;
        while (i < i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                aa3.y(vc2VarArr, i * length, vc2VarArr3[(i * i3) + i4], vc2VarArr2, i4 * length, 0, length);
            }
            i++;
        }
    }

    public static void c(int i, int i2, sb0 sb0Var) {
        u8 u8Var = h;
        u8Var.a = i2;
        u8Var.b(0, i, sb0Var);
    }

    public static void d(float[] fArr, int i, int i2, float[] fArr2, boolean z, int i3, float[] fArr3, boolean z2) {
        float[] fArr4 = fArr2;
        int length = fArr4.length / i3;
        int length2 = fArr3.length / i3;
        if (!z) {
            int i4 = i;
            while (i4 < i2) {
                int i5 = i4 * length;
                int i6 = i4 + 1;
                Arrays.fill(fArr, i5, i6 * length, 0.0f);
                int i7 = 0;
                while (i7 < i3) {
                    aa3.x(fArr, i5, fArr3[(i7 * length2) + i4], fArr4, i7 * length, 0, length);
                    i7++;
                    fArr4 = fArr2;
                }
                fArr4 = fArr2;
                i4 = i6;
            }
            return;
        }
        float[] fArr5 = z2 ? new float[i3] : fArr3;
        for (int i8 = i; i8 < i2; i8++) {
            int i9 = i8 * i3;
            if (z2) {
                for (int i10 = 0; i10 < i3; i10++) {
                    fArr5[i10] = fArr3[(i10 * length2) + i8];
                }
                i9 = 0;
            }
            for (int i11 = 0; i11 < length; i11++) {
                fArr[(i8 * length) + i11] = es.g0(fArr4, i11 * i3, fArr5, i9, i3);
            }
        }
    }

    public static void e(vc2[] vc2VarArr, int i, int i2, vc2[] vc2VarArr2, boolean z, int i3, vc2[] vc2VarArr3, boolean z2, uc2 uc2Var) {
        int i4;
        vc2[] vc2VarArr4 = vc2VarArr;
        vc2[] vc2VarArr5 = vc2VarArr2;
        int length = vc2VarArr5.length / i3;
        int length2 = vc2VarArr3.length / i3;
        if (!z) {
            vc2 vc2Var = (vc2) uc2Var.k().get();
            int i5 = i;
            while (i5 < i2) {
                int i6 = i5 * length;
                int i7 = i5 + 1;
                Arrays.fill(vc2VarArr4, i6, i7 * length, vc2Var);
                int i8 = 0;
                while (i8 < i3) {
                    int i9 = length;
                    aa3.y(vc2VarArr4, i6, vc2VarArr3[(i8 * length2) + i5], vc2VarArr2, i8 * length, 0, i9);
                    i8++;
                    vc2VarArr4 = vc2VarArr;
                    length = i9;
                }
                vc2VarArr4 = vc2VarArr;
                i5 = i7;
            }
            return;
        }
        uc2 uc2Var2 = uc2Var;
        vc2[] vc2VarArr6 = z2 ? (vc2[]) uc2Var2.j(i3) : vc2VarArr3;
        int i10 = i;
        while (i10 < i2) {
            int i11 = i10 * i3;
            if (z2) {
                for (int i12 = 0; i12 < i3; i12++) {
                    vc2VarArr6[i12] = vc2VarArr3[(i12 * length2) + i10];
                }
                i4 = 0;
            } else {
                i4 = i11;
            }
            int i13 = 0;
            while (i13 < length) {
                vc2VarArr4[(i10 * length) + i13] = es.S(vc2VarArr5, i13 * i3, vc2VarArr6, i4, i3, uc2Var2);
                i13++;
                vc2VarArr5 = vc2VarArr2;
                uc2Var2 = uc2Var;
            }
            i10++;
            vc2VarArr5 = vc2VarArr2;
            uc2Var2 = uc2Var;
        }
    }
}
