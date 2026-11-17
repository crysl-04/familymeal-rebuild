package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s92 extends sv {
    public static final li1 r = new li1(15);
    public final g73 d;
    public final float e;
    public final float f;
    public final dz2 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final yb0 k;
    public final r92 l;
    public final o92 m;
    public final yb0 n;
    public final r92 o;
    public final o92 p;
    public final boolean q;

    /* JADX WARN: Code duplicated, block: B:42:0x0192  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c4 A[SYNTHETIC] */
    public s92(String str, float[] fArr, g73 g73Var, float[] fArr2, yb0 yb0Var, yb0 yb0Var2, float f, float f2, dz2 dz2Var, int i) {
        boolean z;
        float f3;
        float[] fArr3;
        boolean z2;
        s92 s92Var;
        double d;
        super(str, 12884901888L, i);
        this.d = g73Var;
        this.e = f;
        this.f = f2;
        this.g = dz2Var;
        this.k = yb0Var;
        byte b = 1;
        this.l = new r92(this, b);
        byte b2 = 0;
        this.m = new o92(this, b2);
        this.n = yb0Var2;
        this.o = new r92(this, b2);
        this.p = new o92(this, b);
        if (fArr.length != 6 && fArr.length != 9) {
            wg.m("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = f4 + f5 + fArr[2];
            fArr4[0] = f4 / f6;
            fArr4[1] = f5 / f6;
            float f7 = fArr[3];
            float f8 = fArr[4];
            float f9 = f7 + f8 + fArr[5];
            fArr4[2] = f7 / f9;
            fArr4[3] = f8 / f9;
            float f10 = fArr[6];
            float f11 = fArr[7];
            float f12 = f10 + f11 + fArr[8];
            fArr4[4] = f10 / f12;
            fArr4[5] = f11 / f12;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.h = fArr4;
        if (fArr2 == null) {
            float f13 = fArr4[0];
            float f14 = fArr4[1];
            float f15 = fArr4[2];
            float f16 = fArr4[3];
            float f17 = fArr4[4];
            float f18 = fArr4[5];
            f3 = 1.0f;
            float f19 = g73Var.a;
            z = true;
            float f20 = g73Var.b;
            float f21 = 1.0f - f13;
            float f22 = f21 / f14;
            float f23 = 1.0f - f15;
            float f24 = 1.0f - f17;
            float f25 = (1.0f - f19) / f20;
            float f26 = f13 / f14;
            float f27 = (f15 / f16) - f26;
            float f28 = (f19 / f20) - f26;
            float f29 = (f23 / f16) - f22;
            float f30 = (f17 / f18) - f26;
            float f31 = (((f25 - f22) * f27) - (f28 * f29)) / ((((f24 / f18) - f22) * f27) - (f29 * f30));
            float f32 = (f28 - (f30 * f31)) / f27;
            float f33 = (1.0f - f32) - f31;
            float f34 = f33 / f14;
            float f35 = f32 / f16;
            float f36 = f31 / f18;
            fArr3 = new float[]{f13 * f34, f33, (f21 - f14) * f34, f15 * f35, f32, (f23 - f16) * f35, f17 * f36, f31, (f24 - f18) * f36};
            this.i = fArr3;
        } else {
            z = true;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                wg.m(jp1.h(fArr2.length, "Transform must have 9 entries! Has "));
                throw null;
            }
            this.i = fArr2;
            fArr3 = fArr2;
        }
        this.j = es.R(fArr3);
        float f37 = p02.f(fArr4);
        float[] fArr5 = uv.a;
        if (f37 / p02.f(uv.b) > 0.9f) {
            float[] fArr6 = uv.a;
        }
        if (i == 0) {
            z2 = z;
        } else {
            float[] fArr7 = uv.a;
            if (fArr4 != fArr7) {
                int i2 = 0;
                while (true) {
                    if (i2 < 6) {
                        if (Float.compare(fArr4[i2], fArr7[i2]) == 0 || Math.abs(fArr4[i2] - fArr7[i2]) <= 0.001f) {
                            i2++;
                        }
                    } else if (es.u(g73Var, s60.W) && f == 0.0f && f2 == f3) {
                        float[] fArr8 = uv.a;
                        s92Var = uv.e;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z2 = z;
                            } else if (Math.abs(yb0Var.a(d) - s92Var.k.a(d)) > 0.001d && Math.abs(yb0Var2.a(d) - s92Var.n.a(d)) <= 0.001d) {
                                d += 0.00392156862745098d;
                            }
                        }
                    }
                }
            } else if (es.u(g73Var, s60.W)) {
                float[] fArr9 = uv.a;
                s92Var = uv.e;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z2 = z;
                    } else if (Math.abs(yb0Var.a(d) - s92Var.k.a(d)) > 0.001d) {
                    }
                    d += 0.00392156862745098d;
                }
            }
            z2 = false;
        }
        this.q = z2;
    }

    @Override // defpackage.sv
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.sv
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.sv
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.sv
    public final long d(float f, float f2, float f3) {
        double d = f;
        o92 o92Var = this.p;
        float fA = (float) o92Var.a(d);
        float fA2 = (float) o92Var.a(f2);
        float fA3 = (float) o92Var.a(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fA3) + ((fArr[3] * fA2) + (fArr[0] * fA)))) << 32) | (((long) Float.floatToRawIntBits((fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA))) & 4294967295L);
    }

    @Override // defpackage.sv
    public final float e(float f, float f2, float f3) {
        double d = f;
        o92 o92Var = this.p;
        float fA = (float) o92Var.a(d);
        float fA2 = (float) o92Var.a(f2);
        float fA3 = (float) o92Var.a(f3);
        float[] fArr = this.i;
        return (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
    }

    @Override // defpackage.sv
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s92.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        s92 s92Var = (s92) obj;
        if (Float.compare(s92Var.e, this.e) != 0 || Float.compare(s92Var.f, this.f) != 0 || !uz0.g(this.d, s92Var.d) || !Arrays.equals(this.h, s92Var.h)) {
            return false;
        }
        dz2 dz2Var = s92Var.g;
        dz2 dz2Var2 = this.g;
        if (dz2Var2 != null) {
            return uz0.g(dz2Var2, dz2Var);
        }
        if (dz2Var == null) {
            return true;
        }
        if (uz0.g(this.k, s92Var.k)) {
            return uz0.g(this.n, s92Var.n);
        }
        return false;
    }

    @Override // defpackage.sv
    public final long f(float f, float f2, float f3, float f4, sv svVar) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        o92 o92Var = this.m;
        return cu.a((float) o92Var.a(f5), (float) o92Var.a(f6), (float) o92Var.a(f7), f4, svVar);
    }

    @Override // defpackage.sv
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        dz2 dz2Var = this.g;
        int iHashCode2 = iFloatToIntBits2 + (dz2Var != null ? dz2Var.hashCode() : 0);
        if (dz2Var != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public s92(String str, float[] fArr, g73 g73Var, final dz2 dz2Var, int i) {
        double d;
        yb0 yb0Var;
        yb0 yb0Var2;
        double d2 = dz2Var.a;
        final byte b = 0;
        final byte b2 = 1;
        boolean z = d2 == -3.0d;
        double d3 = dz2Var.g;
        double d4 = dz2Var.f;
        if (z) {
            d = -3.0d;
            final byte b3 = 4;
            yb0Var = new yb0() { // from class: q92
                @Override // defpackage.yb0
                public final double a(double d5) {
                    byte b4 = b3;
                    dz2 dz2Var2 = dz2Var;
                    switch (b4) {
                        case 0:
                            float[] fArr2 = uv.a;
                            return uv.a(dz2Var2, d5);
                        case 1:
                            float[] fArr3 = uv.a;
                            return uv.c(dz2Var2, d5);
                        case 2:
                            double d6 = dz2Var2.b;
                            return d5 >= dz2Var2.e ? Math.pow((d6 * d5) + dz2Var2.c, dz2Var2.a) : dz2Var2.d * d5;
                        case 3:
                            double d7 = dz2Var2.b;
                            double d8 = dz2Var2.c;
                            double d9 = dz2Var2.d;
                            return d5 >= dz2Var2.e ? Math.pow((d7 * d5) + d8, dz2Var2.a) + dz2Var2.f : (d9 * d5) + dz2Var2.g;
                        case 4:
                            float[] fArr4 = uv.a;
                            return uv.b(dz2Var2, d5);
                        case 5:
                            float[] fArr5 = uv.a;
                            return uv.d(dz2Var2, d5);
                        case 6:
                            double d10 = dz2Var2.b;
                            double d11 = dz2Var2.c;
                            double d12 = dz2Var2.d;
                            return d5 >= dz2Var2.e * d12 ? (Math.pow(d5, 1.0d / dz2Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = dz2Var2.b;
                            double d14 = dz2Var2.c;
                            double d15 = dz2Var2.d;
                            return d5 >= dz2Var2.e * d15 ? (Math.pow(d5 - dz2Var2.f, 1.0d / dz2Var2.a) - d14) / d13 : (d5 - dz2Var2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final byte b4 = 5;
                yb0Var = new yb0() { // from class: q92
                    @Override // defpackage.yb0
                    public final double a(double d5) {
                        byte b5 = b4;
                        dz2 dz2Var2 = dz2Var;
                        switch (b5) {
                            case 0:
                                float[] fArr2 = uv.a;
                                return uv.a(dz2Var2, d5);
                            case 1:
                                float[] fArr3 = uv.a;
                                return uv.c(dz2Var2, d5);
                            case 2:
                                double d6 = dz2Var2.b;
                                return d5 >= dz2Var2.e ? Math.pow((d6 * d5) + dz2Var2.c, dz2Var2.a) : dz2Var2.d * d5;
                            case 3:
                                double d7 = dz2Var2.b;
                                double d8 = dz2Var2.c;
                                double d9 = dz2Var2.d;
                                return d5 >= dz2Var2.e ? Math.pow((d7 * d5) + d8, dz2Var2.a) + dz2Var2.f : (d9 * d5) + dz2Var2.g;
                            case 4:
                                float[] fArr4 = uv.a;
                                return uv.b(dz2Var2, d5);
                            case 5:
                                float[] fArr5 = uv.a;
                                return uv.d(dz2Var2, d5);
                            case 6:
                                double d10 = dz2Var2.b;
                                double d11 = dz2Var2.c;
                                double d12 = dz2Var2.d;
                                return d5 >= dz2Var2.e * d12 ? (Math.pow(d5, 1.0d / dz2Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = dz2Var2.b;
                                double d14 = dz2Var2.c;
                                double d15 = dz2Var2.d;
                                return d5 >= dz2Var2.e * d15 ? (Math.pow(d5 - dz2Var2.f, 1.0d / dz2Var2.a) - d14) / d13 : (d5 - dz2Var2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final byte b5 = 6;
                yb0Var = new yb0() { // from class: q92
                    @Override // defpackage.yb0
                    public final double a(double d5) {
                        byte b6 = b5;
                        dz2 dz2Var2 = dz2Var;
                        switch (b6) {
                            case 0:
                                float[] fArr2 = uv.a;
                                return uv.a(dz2Var2, d5);
                            case 1:
                                float[] fArr3 = uv.a;
                                return uv.c(dz2Var2, d5);
                            case 2:
                                double d6 = dz2Var2.b;
                                return d5 >= dz2Var2.e ? Math.pow((d6 * d5) + dz2Var2.c, dz2Var2.a) : dz2Var2.d * d5;
                            case 3:
                                double d7 = dz2Var2.b;
                                double d8 = dz2Var2.c;
                                double d9 = dz2Var2.d;
                                return d5 >= dz2Var2.e ? Math.pow((d7 * d5) + d8, dz2Var2.a) + dz2Var2.f : (d9 * d5) + dz2Var2.g;
                            case 4:
                                float[] fArr4 = uv.a;
                                return uv.b(dz2Var2, d5);
                            case 5:
                                float[] fArr5 = uv.a;
                                return uv.d(dz2Var2, d5);
                            case 6:
                                double d10 = dz2Var2.b;
                                double d11 = dz2Var2.c;
                                double d12 = dz2Var2.d;
                                return d5 >= dz2Var2.e * d12 ? (Math.pow(d5, 1.0d / dz2Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = dz2Var2.b;
                                double d14 = dz2Var2.c;
                                double d15 = dz2Var2.d;
                                return d5 >= dz2Var2.e * d15 ? (Math.pow(d5 - dz2Var2.f, 1.0d / dz2Var2.a) - d14) / d13 : (d5 - dz2Var2.g) / d15;
                        }
                    }
                };
            } else {
                final byte b6 = 7;
                yb0Var = new yb0() { // from class: q92
                    @Override // defpackage.yb0
                    public final double a(double d5) {
                        byte b7 = b6;
                        dz2 dz2Var2 = dz2Var;
                        switch (b7) {
                            case 0:
                                float[] fArr2 = uv.a;
                                return uv.a(dz2Var2, d5);
                            case 1:
                                float[] fArr3 = uv.a;
                                return uv.c(dz2Var2, d5);
                            case 2:
                                double d6 = dz2Var2.b;
                                return d5 >= dz2Var2.e ? Math.pow((d6 * d5) + dz2Var2.c, dz2Var2.a) : dz2Var2.d * d5;
                            case 3:
                                double d7 = dz2Var2.b;
                                double d8 = dz2Var2.c;
                                double d9 = dz2Var2.d;
                                return d5 >= dz2Var2.e ? Math.pow((d7 * d5) + d8, dz2Var2.a) + dz2Var2.f : (d9 * d5) + dz2Var2.g;
                            case 4:
                                float[] fArr4 = uv.a;
                                return uv.b(dz2Var2, d5);
                            case 5:
                                float[] fArr5 = uv.a;
                                return uv.d(dz2Var2, d5);
                            case 6:
                                double d10 = dz2Var2.b;
                                double d11 = dz2Var2.c;
                                double d12 = dz2Var2.d;
                                return d5 >= dz2Var2.e * d12 ? (Math.pow(d5, 1.0d / dz2Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = dz2Var2.b;
                                double d14 = dz2Var2.c;
                                double d15 = dz2Var2.d;
                                return d5 >= dz2Var2.e * d15 ? (Math.pow(d5 - dz2Var2.f, 1.0d / dz2Var2.a) - d14) / d13 : (d5 - dz2Var2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            yb0Var2 = new yb0() { // from class: q92
                @Override // defpackage.yb0
                public final double a(double d5) {
                    byte b7 = b;
                    dz2 dz2Var2 = dz2Var;
                    switch (b7) {
                        case 0:
                            float[] fArr2 = uv.a;
                            return uv.a(dz2Var2, d5);
                        case 1:
                            float[] fArr3 = uv.a;
                            return uv.c(dz2Var2, d5);
                        case 2:
                            double d6 = dz2Var2.b;
                            return d5 >= dz2Var2.e ? Math.pow((d6 * d5) + dz2Var2.c, dz2Var2.a) : dz2Var2.d * d5;
                        case 3:
                            double d7 = dz2Var2.b;
                            double d8 = dz2Var2.c;
                            double d9 = dz2Var2.d;
                            return d5 >= dz2Var2.e ? Math.pow((d7 * d5) + d8, dz2Var2.a) + dz2Var2.f : (d9 * d5) + dz2Var2.g;
                        case 4:
                            float[] fArr4 = uv.a;
                            return uv.b(dz2Var2, d5);
                        case 5:
                            float[] fArr5 = uv.a;
                            return uv.d(dz2Var2, d5);
                        case 6:
                            double d10 = dz2Var2.b;
                            double d11 = dz2Var2.c;
                            double d12 = dz2Var2.d;
                            return d5 >= dz2Var2.e * d12 ? (Math.pow(d5, 1.0d / dz2Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = dz2Var2.b;
                            double d14 = dz2Var2.c;
                            double d15 = dz2Var2.d;
                            return d5 >= dz2Var2.e * d15 ? (Math.pow(d5 - dz2Var2.f, 1.0d / dz2Var2.a) - d14) / d13 : (d5 - dz2Var2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            yb0Var2 = new yb0() { // from class: q92
                @Override // defpackage.yb0
                public final double a(double d5) {
                    byte b7 = b2;
                    dz2 dz2Var2 = dz2Var;
                    switch (b7) {
                        case 0:
                            float[] fArr2 = uv.a;
                            return uv.a(dz2Var2, d5);
                        case 1:
                            float[] fArr3 = uv.a;
                            return uv.c(dz2Var2, d5);
                        case 2:
                            double d6 = dz2Var2.b;
                            return d5 >= dz2Var2.e ? Math.pow((d6 * d5) + dz2Var2.c, dz2Var2.a) : dz2Var2.d * d5;
                        case 3:
                            double d7 = dz2Var2.b;
                            double d8 = dz2Var2.c;
                            double d9 = dz2Var2.d;
                            return d5 >= dz2Var2.e ? Math.pow((d7 * d5) + d8, dz2Var2.a) + dz2Var2.f : (d9 * d5) + dz2Var2.g;
                        case 4:
                            float[] fArr4 = uv.a;
                            return uv.b(dz2Var2, d5);
                        case 5:
                            float[] fArr5 = uv.a;
                            return uv.d(dz2Var2, d5);
                        case 6:
                            double d10 = dz2Var2.b;
                            double d11 = dz2Var2.c;
                            double d12 = dz2Var2.d;
                            return d5 >= dz2Var2.e * d12 ? (Math.pow(d5, 1.0d / dz2Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = dz2Var2.b;
                            double d14 = dz2Var2.c;
                            double d15 = dz2Var2.d;
                            return d5 >= dz2Var2.e * d15 ? (Math.pow(d5 - dz2Var2.f, 1.0d / dz2Var2.a) - d14) / d13 : (d5 - dz2Var2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final byte b7 = 2;
            yb0Var2 = new yb0() { // from class: q92
                @Override // defpackage.yb0
                public final double a(double d5) {
                    byte b8 = b7;
                    dz2 dz2Var2 = dz2Var;
                    switch (b8) {
                        case 0:
                            float[] fArr2 = uv.a;
                            return uv.a(dz2Var2, d5);
                        case 1:
                            float[] fArr3 = uv.a;
                            return uv.c(dz2Var2, d5);
                        case 2:
                            double d6 = dz2Var2.b;
                            return d5 >= dz2Var2.e ? Math.pow((d6 * d5) + dz2Var2.c, dz2Var2.a) : dz2Var2.d * d5;
                        case 3:
                            double d7 = dz2Var2.b;
                            double d8 = dz2Var2.c;
                            double d9 = dz2Var2.d;
                            return d5 >= dz2Var2.e ? Math.pow((d7 * d5) + d8, dz2Var2.a) + dz2Var2.f : (d9 * d5) + dz2Var2.g;
                        case 4:
                            float[] fArr4 = uv.a;
                            return uv.b(dz2Var2, d5);
                        case 5:
                            float[] fArr5 = uv.a;
                            return uv.d(dz2Var2, d5);
                        case 6:
                            double d10 = dz2Var2.b;
                            double d11 = dz2Var2.c;
                            double d12 = dz2Var2.d;
                            return d5 >= dz2Var2.e * d12 ? (Math.pow(d5, 1.0d / dz2Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = dz2Var2.b;
                            double d14 = dz2Var2.c;
                            double d15 = dz2Var2.d;
                            return d5 >= dz2Var2.e * d15 ? (Math.pow(d5 - dz2Var2.f, 1.0d / dz2Var2.a) - d14) / d13 : (d5 - dz2Var2.g) / d15;
                    }
                }
            };
        } else {
            final byte b8 = 3;
            yb0Var2 = new yb0() { // from class: q92
                @Override // defpackage.yb0
                public final double a(double d5) {
                    byte b9 = b8;
                    dz2 dz2Var2 = dz2Var;
                    switch (b9) {
                        case 0:
                            float[] fArr2 = uv.a;
                            return uv.a(dz2Var2, d5);
                        case 1:
                            float[] fArr3 = uv.a;
                            return uv.c(dz2Var2, d5);
                        case 2:
                            double d6 = dz2Var2.b;
                            return d5 >= dz2Var2.e ? Math.pow((d6 * d5) + dz2Var2.c, dz2Var2.a) : dz2Var2.d * d5;
                        case 3:
                            double d7 = dz2Var2.b;
                            double d8 = dz2Var2.c;
                            double d9 = dz2Var2.d;
                            return d5 >= dz2Var2.e ? Math.pow((d7 * d5) + d8, dz2Var2.a) + dz2Var2.f : (d9 * d5) + dz2Var2.g;
                        case 4:
                            float[] fArr4 = uv.a;
                            return uv.b(dz2Var2, d5);
                        case 5:
                            float[] fArr5 = uv.a;
                            return uv.d(dz2Var2, d5);
                        case 6:
                            double d10 = dz2Var2.b;
                            double d11 = dz2Var2.c;
                            double d12 = dz2Var2.d;
                            return d5 >= dz2Var2.e * d12 ? (Math.pow(d5, 1.0d / dz2Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = dz2Var2.b;
                            double d14 = dz2Var2.c;
                            double d15 = dz2Var2.d;
                            return d5 >= dz2Var2.e * d15 ? (Math.pow(d5 - dz2Var2.f, 1.0d / dz2Var2.a) - d14) / d13 : (d5 - dz2Var2.g) / d15;
                    }
                }
            };
        }
        this(str, fArr, g73Var, null, yb0Var, yb0Var2, 0.0f, 1.0f, dz2Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s92(String str, float[] fArr, g73 g73Var, final double d, float f, float f2, int i) {
        yb0 yb0Var;
        yb0 yb0Var2;
        if (d == 1.0d) {
            yb0Var2 = r;
            yb0Var = yb0Var2;
        } else {
            final byte b = 0;
            final byte b2 = 1;
            yb0Var = new yb0() { // from class: p92
                @Override // defpackage.yb0
                public final double a(double d2) {
                    switch (b) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
            yb0Var2 = new yb0() { // from class: p92
                @Override // defpackage.yb0
                public final double a(double d2) {
                    switch (b2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        yb0 yb0Var3 = yb0Var;
        this(str, fArr, g73Var, null, yb0Var3, yb0Var2, f, f2, new dz2(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
