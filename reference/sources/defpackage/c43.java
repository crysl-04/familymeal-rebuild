package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c43 {
    public final boolean a;
    public final b43 b;
    public final byte c;
    public final f40[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public c43(boolean z, b43 b43Var) {
        byte b;
        this.a = z;
        this.b = b43Var;
        if (z && b43Var.equals(b43.h)) {
            li1.g("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = b43Var.ordinal();
        if (iOrdinal == 0) {
            b = 3;
        } else {
            if (iOrdinal != 1) {
                wg.n();
                throw null;
            }
            b = 2;
        }
        this.c = b;
        this.d = new f40[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        f40[] f40VarArr = this.d;
        f40 f40Var = f40VarArr[i];
        if (f40Var != null) {
            f40Var.a = j;
            f40Var.b = f;
        } else {
            f40 f40Var2 = new f40();
            f40Var2.a = j;
            f40Var2.b = f;
            f40VarArr[i] = f40Var2;
        }
    }

    public final float b() {
        boolean z;
        b43 b43Var;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float fSignum;
        int i3 = this.e;
        f40[] f40VarArr = this.d;
        f40 f40Var = f40VarArr[i3];
        if (f40Var == null) {
            return 0.0f;
        }
        int i4 = 0;
        f40 f40Var2 = f40Var;
        do {
            f40 f40Var3 = f40VarArr[i3];
            z = this.a;
            b43Var = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (f40Var3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = 0.0f;
            } else {
                long j = f40Var.a;
                i = i4;
                f = 0.0f;
                long j2 = f40Var3.a;
                float f3 = j - j2;
                fArr2 = fArr3;
                i2 = 1;
                float fAbs = Math.abs(j2 - f40Var2.a);
                f40Var2 = (b43Var == b43.h || z) ? f40Var3 : f40Var;
                if (f3 <= 100.0f && fAbs <= 40.0f) {
                    fArr2[i] = f40Var3.b;
                    fArr[i] = -f3;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 < this.c) {
            return f;
        }
        int iOrdinal = b43Var.ordinal();
        if (iOrdinal == 0) {
            try {
                float[] fArr4 = this.h;
                r02.A(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            fSignum = f2;
        } else {
            if (iOrdinal != i2) {
                wg.n();
                return f;
            }
            int i5 = i4 - i2;
            float f4 = fArr[i5];
            int i6 = i5;
            float f5 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f6 = fArr[i7];
                if (f4 != f6) {
                    float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
                    float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f))))) + f5;
                    if (i6 == i5) {
                        fAbs2 *= 0.5f;
                    }
                    f5 = fAbs2;
                }
                i6--;
                f4 = f6;
            }
            fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
        }
        return fSignum * 1000.0f;
    }

    public final float c(float f) {
        if (f <= 0.0f) {
            ax0.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fB = b();
        if (fB == 0.0f || Float.isNaN(fB)) {
            return 0.0f;
        }
        if (fB <= 0.0f) {
            float f2 = -f;
            if (fB < f2) {
                return f2;
            }
        } else if (fB > f) {
            return f;
        }
        return fB;
    }

    public /* synthetic */ c43() {
        this(false, b43.h);
    }

    public c43(boolean z) {
        this(z, b43.i);
    }
}
