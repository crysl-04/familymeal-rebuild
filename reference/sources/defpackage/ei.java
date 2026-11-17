package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ei extends z22 {
    public static final vh k = new vh(je1.s, (byte) 4);
    public final int[] j;

    public ei(int[] iArr) {
        super(k, iArr.length);
        this.j = iArr;
    }

    @Override // defpackage.ry1, defpackage.a1
    public final double A(int i) {
        return this.j[i];
    }

    @Override // defpackage.ry1, defpackage.a1
    public final int D(int i) {
        return this.j[i];
    }

    @Override // defpackage.ry1
    public final void Q1(int i, Comparable comparable) {
        int iIntValue = ((Double) comparable).intValue();
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = iIntValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ry1
    public final void U0(int i, Comparable comparable) {
        int iIntValue;
        int[] iArr = this.j;
        int i2 = iArr[i];
        Objects.requireNonNull(comparable);
        if (comparable instanceof xo1) {
            iIntValue = ((xo1) comparable).U0();
        } else {
            iIntValue = comparable instanceof Number ? ((Number) comparable).intValue() : Integer.MIN_VALUE;
        }
        iArr[i] = iIntValue + i2;
    }

    @Override // defpackage.ry1
    public final Comparable U1(int i) {
        return Double.valueOf(this.j[i]);
    }

    @Override // defpackage.ry1
    public final void b2(int i, int i2, int i3, a1 a1Var, f32 f32Var) {
        ls.J(this.j, i, i2, i3, a1Var, f32Var, this);
    }

    @Override // defpackage.ry1
    public final void c1(int i, int i2, int i3, int i4) {
        int[] iArr = this.j;
        int i5 = 0;
        if (i3 == 1) {
            while (i5 < i4) {
                int i6 = i + i5;
                int i7 = iArr[i6];
                int i8 = i2 + i5;
                iArr[i6] = iArr[i8];
                iArr[i8] = i7;
                i5++;
            }
            return;
        }
        while (i5 < i4) {
            int i9 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i9;
            i += i3;
            i2 += i3;
            i5++;
        }
    }

    @Override // defpackage.ry1
    public final void c2(int i, int i2, int i3, tm tmVar, a1 a1Var) {
        ls.J(this.j, i, i2, i3, this, tmVar, a1Var);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final short d(int i) {
        return (short) this.j[i];
    }

    @Override // defpackage.ry1
    public final void d2(int i, int i2, int i3, c23 c23Var) {
        e32 e32Var = h32.D;
        int[] iArr = this.j;
        if (c23Var == e32Var) {
            if (i3 == 1) {
                while (i < i2) {
                    iArr[i] = -iArr[i];
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    iArr[i] = -iArr[i];
                    i += i3;
                }
                return;
            }
        }
        if (c23Var instanceof rm) {
            rm rmVar = (rm) c23Var;
            int iU0 = rmVar.U0();
            f32 f32Var = rmVar.j;
            if (f32Var == h32.s) {
                if (i3 == 1) {
                    while (i < i2) {
                        iArr[i] = iArr[i] + iU0;
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        iArr[i] = iArr[i] + iU0;
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.v) {
                if (i3 == 1) {
                    while (i < i2) {
                        iArr[i] = iU0 / iArr[i];
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        iArr[i] = iU0 / iArr[i];
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.C) {
                if (i3 == 1) {
                    while (i < i2) {
                        iArr[i] = iArr[i] * iU0;
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        iArr[i] = iArr[i] * iU0;
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.I) {
                if (i3 == 1) {
                    while (i < i2) {
                        iArr[i] = iU0 - iArr[i];
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        iArr[i] = iU0 - iArr[i];
                        i += i3;
                    }
                    return;
                }
            }
            if (i3 == 1) {
                while (i < i2) {
                    iArr[i] = f32Var.d(iU0, iArr[i]);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    iArr[i] = f32Var.d(iU0, iArr[i]);
                    i += i3;
                }
                return;
            }
        }
        if (!(c23Var instanceof sm)) {
            if (i3 == 1) {
                while (i < i2) {
                    iArr[i] = Math.round((float) c23Var.a(iArr[i]));
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    iArr[i] = Math.round((float) c23Var.a(iArr[i]));
                    i += i3;
                }
                return;
            }
        }
        sm smVar = (sm) c23Var;
        tm tmVar = smVar.j;
        int iU1 = smVar.U0();
        if (tmVar == h32.s) {
            if (i3 == 1) {
                while (i < i2) {
                    iArr[i] = iArr[i] + iU1;
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    iArr[i] = iArr[i] + iU1;
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.v) {
            if (i3 == 1) {
                while (i < i2) {
                    iArr[i] = iArr[i] / iU1;
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    iArr[i] = iArr[i] / iU1;
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.C) {
            if (i3 == 1) {
                while (i < i2) {
                    iArr[i] = iArr[i] * iU1;
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    iArr[i] = iArr[i] * iU1;
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.I) {
            if (i3 == 1) {
                while (i < i2) {
                    iArr[i] = iArr[i] - iU1;
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    iArr[i] = iArr[i] - iU1;
                    i += i3;
                }
                return;
            }
        }
        if (i3 == 1) {
            while (i < i2) {
                iArr[i] = tmVar.d(iArr[i], iU1);
                i++;
            }
        } else {
            while (i < i2) {
                iArr[i] = tmVar.d(iArr[i], iU1);
                i += i3;
            }
        }
    }

    @Override // defpackage.ry1
    public final void e2(int i, c23 c23Var) {
        int[] iArr = this.j;
        iArr[i] = Math.round((float) c23Var.a(iArr[i]));
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        int[] iArr = this.j;
        iArr[i] = iArr[i] + ((int) Math.round(d));
    }

    @Override // defpackage.ry1
    public final void f2(long j, int i, a1 a1Var, f32 f32Var) {
        int iC = a1Var.C(j);
        int[] iArr = this.j;
        iArr[i] = f32Var.d(iC, iArr[i]);
    }

    @Override // defpackage.ry1
    public final void g2(long j, int i, tm tmVar, a1 a1Var) {
        int[] iArr = this.j;
        iArr[i] = tmVar.d(iArr[i], a1Var.C(j));
    }

    @Override // defpackage.ry1
    public final void h2(int i, c23 c23Var) {
        int[] iArr = this.j;
        iArr[i] = Math.round((float) c23Var.a(iArr[i]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ry1
    public final void i2(int i, Comparable comparable) {
        int iIntValue;
        if (comparable == 0) {
            iIntValue = 0;
        } else if (comparable instanceof xo1) {
            iIntValue = ((xo1) comparable).U0();
        } else {
            iIntValue = comparable instanceof Number ? ((Number) comparable).intValue() : Integer.MIN_VALUE;
        }
        this.j[i] = iIntValue;
    }

    @Override // defpackage.ry1
    public final void j2(int i, int i2, int i3, im imVar) {
        int[] iArr = this.j;
        if (i3 == 1) {
            while (i < i2) {
                imVar.b(iArr[i]);
                i++;
            }
        } else {
            while (i < i2) {
                imVar.b(iArr[i]);
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
        this.j[i] = (int) Math.round(d);
    }

    @Override // defpackage.ry1, defpackage.zj1
    public final void p(int i, float f) {
        this.j[i] = Math.round(f);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final float q(int i) {
        return this.j[i];
    }

    @Override // defpackage.zj1
    public final void reset() {
        Arrays.fill(this.j, 0);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final byte v(int i) {
        return (byte) this.j[i];
    }
}
