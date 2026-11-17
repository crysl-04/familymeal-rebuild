package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class di extends z22 {
    public static final vh k = new vh(je1.r, (byte) 3);
    public final short[] j;

    public di(short[] sArr) {
        super(k, sArr.length);
        this.j = sArr;
    }

    @Override // defpackage.ry1, defpackage.a1
    public final double A(int i) {
        return this.j[i];
    }

    @Override // defpackage.ry1
    public final void Q1(int i, Comparable comparable) {
        short sShortValue = ((Double) comparable).shortValue();
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = sShortValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ry1
    public final void U0(int i, Comparable comparable) {
        short sShortValue;
        short[] sArr = this.j;
        short s = sArr[i];
        Objects.requireNonNull(comparable);
        if (comparable instanceof xo1) {
            sShortValue = (short) ((xo1) comparable).U0();
        } else {
            sShortValue = comparable instanceof Number ? ((Number) comparable).shortValue() : Short.MIN_VALUE;
        }
        sArr[i] = (short) (sShortValue + s);
    }

    @Override // defpackage.ry1
    public final Comparable U1(int i) {
        return Double.valueOf(this.j[i]);
    }

    @Override // defpackage.ry1
    public final void b2(int i, int i2, int i3, a1 a1Var, f32 f32Var) {
        ls.M(this.j, i, i2, i3, a1Var, f32Var, this);
    }

    @Override // defpackage.ry1
    public final void c1(int i, int i2, int i3, int i4) {
        short[] sArr = this.j;
        int i5 = 0;
        if (i3 == 1) {
            while (i5 < i4) {
                int i6 = i + i5;
                short s = sArr[i6];
                int i7 = i2 + i5;
                sArr[i6] = sArr[i7];
                sArr[i7] = s;
                i5++;
            }
            return;
        }
        while (i5 < i4) {
            short s2 = sArr[i];
            sArr[i] = sArr[i2];
            sArr[i2] = s2;
            i += i3;
            i2 += i3;
            i5++;
        }
    }

    @Override // defpackage.ry1
    public final void c2(int i, int i2, int i3, tm tmVar, a1 a1Var) {
        ls.M(this.j, i, i2, i3, this, tmVar, a1Var);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final short d(int i) {
        return this.j[i];
    }

    @Override // defpackage.ry1
    public final void d2(int i, int i2, int i3, c23 c23Var) {
        e32 e32Var = h32.D;
        short[] sArr = this.j;
        if (c23Var == e32Var) {
            if (i3 == 1) {
                while (i < i2) {
                    sArr[i] = (short) (-sArr[i]);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    sArr[i] = (short) (-sArr[i]);
                    i += i3;
                }
                return;
            }
        }
        if (c23Var instanceof rm) {
            rm rmVar = (rm) c23Var;
            short sU0 = (short) rmVar.U0();
            f32 f32Var = rmVar.j;
            if (f32Var == h32.s) {
                if (i3 == 1) {
                    while (i < i2) {
                        sArr[i] = (short) (sArr[i] + sU0);
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        sArr[i] = (short) (sArr[i] + sU0);
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.v) {
                if (i3 == 1) {
                    while (i < i2) {
                        sArr[i] = (short) (sU0 / sArr[i]);
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        sArr[i] = (short) (sU0 / sArr[i]);
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.C) {
                if (i3 == 1) {
                    while (i < i2) {
                        sArr[i] = (short) (sArr[i] * sU0);
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        sArr[i] = (short) (sArr[i] * sU0);
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.I) {
                if (i3 == 1) {
                    while (i < i2) {
                        sArr[i] = (short) (sU0 - sArr[i]);
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        sArr[i] = (short) (sU0 - sArr[i]);
                        i += i3;
                    }
                    return;
                }
            }
            if (i3 == 1) {
                while (i < i2) {
                    sArr[i] = f32Var.b(sU0, sArr[i]);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    sArr[i] = f32Var.b(sU0, sArr[i]);
                    i += i3;
                }
                return;
            }
        }
        if (!(c23Var instanceof sm)) {
            if (i3 == 1) {
                while (i < i2) {
                    sArr[i] = (short) c23Var.a(sArr[i]);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    sArr[i] = (short) c23Var.a(sArr[i]);
                    i += i3;
                }
                return;
            }
        }
        sm smVar = (sm) c23Var;
        tm tmVar = smVar.j;
        short sU1 = (short) smVar.U0();
        if (tmVar == h32.s) {
            if (i3 == 1) {
                while (i < i2) {
                    sArr[i] = (short) (sArr[i] + sU1);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    sArr[i] = (short) (sArr[i] + sU1);
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.v) {
            if (i3 == 1) {
                while (i < i2) {
                    sArr[i] = (short) (sArr[i] / sU1);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    sArr[i] = (short) (sArr[i] / sU1);
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.C) {
            if (i3 == 1) {
                while (i < i2) {
                    sArr[i] = (short) (sArr[i] * sU1);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    sArr[i] = (short) (sArr[i] * sU1);
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.I) {
            if (i3 == 1) {
                while (i < i2) {
                    sArr[i] = (short) (sArr[i] - sU1);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    sArr[i] = (short) (sArr[i] - sU1);
                    i += i3;
                }
                return;
            }
        }
        if (i3 == 1) {
            while (i < i2) {
                sArr[i] = tmVar.b(sArr[i], sU1);
                i++;
            }
        } else {
            while (i < i2) {
                sArr[i] = tmVar.b(sArr[i], sU1);
                i += i3;
            }
        }
    }

    @Override // defpackage.ry1
    public final void e2(int i, c23 c23Var) {
        short[] sArr = this.j;
        sArr[i] = (short) c23Var.a(sArr[i]);
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        short[] sArr = this.j;
        sArr[i] = (short) (sArr[i] + ((short) Math.round(d)));
    }

    @Override // defpackage.ry1
    public final void f2(long j, int i, a1 a1Var, f32 f32Var) {
        short sE = a1Var.e(j);
        short[] sArr = this.j;
        sArr[i] = f32Var.b(sE, sArr[i]);
    }

    @Override // defpackage.ry1
    public final void g2(long j, int i, tm tmVar, a1 a1Var) {
        short[] sArr = this.j;
        sArr[i] = tmVar.b(sArr[i], a1Var.e(j));
    }

    @Override // defpackage.ry1
    public final void h2(int i, c23 c23Var) {
        short[] sArr = this.j;
        sArr[i] = (short) c23Var.a(sArr[i]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ry1
    public final void i2(int i, Comparable comparable) {
        short sShortValue;
        if (comparable == 0) {
            sShortValue = 0;
        } else if (comparable instanceof xo1) {
            sShortValue = (short) ((xo1) comparable).U0();
        } else {
            sShortValue = comparable instanceof Number ? ((Number) comparable).shortValue() : Short.MIN_VALUE;
        }
        this.j[i] = sShortValue;
    }

    @Override // defpackage.ry1
    public final void j2(int i, int i2, int i3, im imVar) {
        short[] sArr = this.j;
        if (i3 == 1) {
            while (i < i2) {
                imVar.b(sArr[i]);
                i++;
            }
        } else {
            while (i < i2) {
                imVar.b(sArr[i]);
                i += i3;
            }
        }
    }

    @Override // defpackage.ry1
    public final void k2(int i, im imVar) {
        imVar.b(this.j[i]);
    }

    @Override // defpackage.ry1, defpackage.zj1
    public final void o(int i, double d) {
        this.j[i] = (short) Math.round(d);
    }

    @Override // defpackage.ry1, defpackage.zj1
    public final void p(int i, float f) {
        this.j[i] = (short) Math.round(f);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final float q(int i) {
        return this.j[i];
    }

    @Override // defpackage.zj1
    public final void reset() {
        Arrays.fill(this.j, (short) 0);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final byte v(int i) {
        return (byte) this.j[i];
    }
}
