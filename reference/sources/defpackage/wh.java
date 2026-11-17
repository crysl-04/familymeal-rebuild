package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class wh extends z22 {
    public static final vh k = new vh(je1.m, (byte) 0);
    public final float[] j;

    public wh(float[] fArr) {
        super(k, fArr.length);
        this.j = fArr;
    }

    @Override // defpackage.ry1, defpackage.a1
    public final double A(int i) {
        return this.j[i];
    }

    @Override // defpackage.ry1, defpackage.a1
    public final int D(int i) {
        return Math.round(this.j[i]);
    }

    @Override // defpackage.zk
    public final void F0(dk1 dk1Var) {
        float[] fArr = this.j;
        int iMin = Math.min(fArr.length, dk1Var.size());
        for (int i = 0; i < iMin; i++) {
            dk1Var.p(i, fArr[i]);
        }
    }

    @Override // defpackage.ry1
    public final void Q1(int i, Comparable comparable) {
        float fFloatValue = ((Double) comparable).floatValue();
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = fFloatValue;
        }
    }

    @Override // defpackage.a1
    public double S(a1 a1Var) {
        double dA = h32.a;
        float[] fArr = this.j;
        int iMin = Math.min(fArr.length, (int) a1Var.count());
        for (int i = 0; i < iMin; i++) {
            dA += a1Var.A(i) * ((double) fArr[i]);
        }
        return dA;
    }

    @Override // defpackage.ry1
    public final void U0(int i, Comparable comparable) {
        float[] fArr = this.j;
        fArr[i] = xo1.U1(comparable) + fArr[i];
    }

    @Override // defpackage.ry1
    public final Comparable U1(int i) {
        return Double.valueOf(this.j[i]);
    }

    @Override // defpackage.xj1
    public final void Z(a1 a1Var) {
        boolean z = a1Var instanceof wh;
        int i = 0;
        float[] fArr = this.j;
        if (!z) {
            u8 u8Var = gj0.h;
            int iMin = Math.min(fArr.length, a1Var.size());
            while (i < iMin) {
                fArr[i] = a1Var.q(i);
                i++;
            }
            return;
        }
        float[] fArr2 = ((wh) a1Var).j;
        u8 u8Var2 = gj0.h;
        int iMin2 = Math.min(fArr.length, fArr2.length);
        while (i < iMin2) {
            fArr[i] = fArr2[i];
            i++;
        }
    }

    @Override // defpackage.ry1
    public final void b2(int i, int i2, int i3, a1 a1Var, f32 f32Var) {
        ls.I(this.j, i, i2, i3, a1Var, f32Var, this);
    }

    @Override // defpackage.ry1
    public final void c1(int i, int i2, int i3, int i4) {
        float[] fArr = this.j;
        int i5 = 0;
        if (i3 == 1) {
            while (i5 < i4) {
                int i6 = i + i5;
                float f = fArr[i6];
                int i7 = i2 + i5;
                fArr[i6] = fArr[i7];
                fArr[i7] = f;
                i5++;
            }
            return;
        }
        while (i5 < i4) {
            float f2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f2;
            i += i3;
            i2 += i3;
            i5++;
        }
    }

    @Override // defpackage.ry1
    public final void c2(int i, int i2, int i3, tm tmVar, a1 a1Var) {
        ls.I(this.j, i, i2, i3, this, tmVar, a1Var);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final short d(int i) {
        return (short) Math.round(this.j[i]);
    }

    @Override // defpackage.ry1
    public final void d2(int i, int i2, int i3, c23 c23Var) {
        e32 e32Var = h32.D;
        float[] fArr = this.j;
        if (c23Var == e32Var) {
            if (i3 == 1) {
                while (i < i2) {
                    fArr[i] = -fArr[i];
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    fArr[i] = -fArr[i];
                    i += i3;
                }
                return;
            }
        }
        if (c23Var instanceof rm) {
            rm rmVar = (rm) c23Var;
            float f = rmVar.i;
            f32 f32Var = rmVar.j;
            if (f32Var == h32.s) {
                if (i3 == 1) {
                    while (i < i2) {
                        fArr[i] = fArr[i] + f;
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        fArr[i] = fArr[i] + f;
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.v) {
                if (i3 == 1) {
                    while (i < i2) {
                        fArr[i] = f / fArr[i];
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        fArr[i] = f / fArr[i];
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.C) {
                if (i3 == 1) {
                    while (i < i2) {
                        fArr[i] = fArr[i] * f;
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        fArr[i] = fArr[i] * f;
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.I) {
                if (i3 == 1) {
                    while (i < i2) {
                        fArr[i] = f - fArr[i];
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        fArr[i] = f - fArr[i];
                        i += i3;
                    }
                    return;
                }
            }
            if (i3 == 1) {
                while (i < i2) {
                    fArr[i] = f32Var.h(f, fArr[i]);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    fArr[i] = f32Var.h(f, fArr[i]);
                    i += i3;
                }
                return;
            }
        }
        if (!(c23Var instanceof sm)) {
            if (i3 == 1) {
                while (i < i2) {
                    fArr[i] = c23Var.c(fArr[i]);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    fArr[i] = c23Var.c(fArr[i]);
                    i += i3;
                }
                return;
            }
        }
        sm smVar = (sm) c23Var;
        tm tmVar = smVar.j;
        float f2 = smVar.i;
        if (tmVar == h32.s) {
            if (i3 == 1) {
                while (i < i2) {
                    fArr[i] = fArr[i] + f2;
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    fArr[i] = fArr[i] + f2;
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.v) {
            if (i3 == 1) {
                while (i < i2) {
                    fArr[i] = fArr[i] / f2;
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    fArr[i] = fArr[i] / f2;
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.C) {
            if (i3 == 1) {
                while (i < i2) {
                    fArr[i] = fArr[i] * f2;
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    fArr[i] = fArr[i] * f2;
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.I) {
            if (i3 == 1) {
                while (i < i2) {
                    fArr[i] = fArr[i] - f2;
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    fArr[i] = fArr[i] - f2;
                    i += i3;
                }
                return;
            }
        }
        if (i3 == 1) {
            while (i < i2) {
                fArr[i] = tmVar.h(fArr[i], f2);
                i++;
            }
        } else {
            while (i < i2) {
                fArr[i] = tmVar.h(fArr[i], f2);
                i += i3;
            }
        }
    }

    @Override // defpackage.ry1
    public final void e2(int i, c23 c23Var) {
        float[] fArr = this.j;
        fArr[i] = c23Var.c(fArr[i]);
    }

    @Override // defpackage.zk
    public boolean equals(Object obj) {
        if (this != obj) {
            return super.equals(obj) && (obj instanceof wh) && Arrays.equals(this.j, ((wh) obj).j);
        }
        return true;
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        float[] fArr = this.j;
        fArr[i] = fArr[i] + ((float) d);
    }

    @Override // defpackage.ry1
    public final void f2(long j, int i, a1 a1Var, f32 f32Var) {
        double dZ = a1Var.z(j);
        float[] fArr = this.j;
        fArr[i] = (float) (dZ - ((double) fArr[i]));
    }

    @Override // defpackage.ry1
    public final void g2(long j, int i, tm tmVar, a1 a1Var) {
        float[] fArr = this.j;
        fArr[i] = (float) tmVar.c(fArr[i], a1Var.z(j));
    }

    @Override // defpackage.ry1
    public final void h2(int i, c23 c23Var) {
        float[] fArr = this.j;
        fArr[i] = c23Var.c(fArr[i]);
    }

    @Override // defpackage.zk
    public int hashCode() {
        return Arrays.hashCode(this.j) + (super.hashCode() * 31);
    }

    @Override // defpackage.ry1
    public final void i2(int i, Comparable comparable) {
        this.j[i] = comparable != null ? xo1.U1(comparable) : 0.0f;
    }

    @Override // defpackage.ry1
    public final void j2(int i, int i2, int i3, im imVar) {
        float[] fArr = this.j;
        if (i3 == 1) {
            while (i < i2) {
                imVar.c(fArr[i]);
                i++;
            }
        } else {
            while (i < i2) {
                imVar.c(fArr[i]);
                i += i3;
            }
        }
    }

    @Override // defpackage.ry1
    public final void k2(int i, im imVar) {
        imVar.c(this.j[i]);
    }

    @Override // defpackage.a1
    public final void m1(double d, yj1 yj1Var) {
        int i = 0;
        while (true) {
            float[] fArr = this.j;
            if (i >= fArr.length) {
                return;
            }
            ((xh) yj1Var).f(i, ((double) fArr[i]) * d);
            i++;
        }
    }

    @Override // defpackage.ry1, defpackage.zj1
    public final void o(int i, double d) {
        this.j[i] = (float) d;
    }

    @Override // defpackage.ry1, defpackage.zj1
    public final void p(int i, float f) {
        this.j[i] = f;
    }

    @Override // defpackage.ry1, defpackage.a1
    public final float q(int i) {
        return this.j[i];
    }

    @Override // defpackage.zj1
    public final void reset() {
        Arrays.fill(this.j, 0.0f);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final byte v(int i) {
        return (byte) Math.round(this.j[i]);
    }
}
