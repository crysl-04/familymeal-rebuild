package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fi extends z22 {
    public static final vh k = new vh(je1.t, (byte) 5);
    public final long[] j;

    public fi(long[] jArr) {
        super(k, jArr.length);
        this.j = jArr;
    }

    @Override // defpackage.ry1, defpackage.a1
    public final double A(int i) {
        return this.j[i];
    }

    @Override // defpackage.ry1, defpackage.a1
    public final int D(int i) {
        return (int) this.j[i];
    }

    @Override // defpackage.ry1
    public final void Q1(int i, Comparable comparable) {
        long jLongValue = ((Double) comparable).longValue();
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = jLongValue;
        }
    }

    @Override // defpackage.ry1
    public final void U0(int i, Comparable comparable) {
        long[] jArr = this.j;
        jArr[i] = xo1.T1(comparable) + jArr[i];
    }

    @Override // defpackage.ry1
    public final Comparable U1(int i) {
        return Double.valueOf(this.j[i]);
    }

    @Override // defpackage.ry1
    public final void b2(int i, int i2, int i3, a1 a1Var, f32 f32Var) {
        ls.K(this.j, i, i2, i3, a1Var, f32Var, this);
    }

    @Override // defpackage.ry1
    public final void c1(int i, int i2, int i3, int i4) {
        long[] jArr = this.j;
        int i5 = 0;
        if (i3 == 1) {
            while (i5 < i4) {
                int i6 = i + i5;
                long j = jArr[i6];
                int i7 = i2 + i5;
                jArr[i6] = jArr[i7];
                jArr[i7] = j;
                i5++;
            }
            return;
        }
        while (i5 < i4) {
            long j2 = jArr[i];
            jArr[i] = jArr[i2];
            jArr[i2] = j2;
            i += i3;
            i2 += i3;
            i5++;
        }
    }

    @Override // defpackage.ry1
    public final void c2(int i, int i2, int i3, tm tmVar, a1 a1Var) {
        ls.K(this.j, i, i2, i3, this, tmVar, a1Var);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final short d(int i) {
        return (short) this.j[i];
    }

    @Override // defpackage.ry1
    public final void d2(int i, int i2, int i3, c23 c23Var) {
        e32 e32Var = h32.D;
        long[] jArr = this.j;
        if (c23Var == e32Var) {
            if (i3 == 1) {
                while (i < i2) {
                    jArr[i] = -jArr[i];
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    jArr[i] = -jArr[i];
                    i += i3;
                }
                return;
            }
        }
        if (c23Var instanceof rm) {
            rm rmVar = (rm) c23Var;
            long jA0 = rmVar.a0();
            f32 f32Var = rmVar.j;
            if (f32Var == h32.s) {
                if (i3 == 1) {
                    while (i < i2) {
                        jArr[i] = jArr[i] + jA0;
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        jArr[i] = jArr[i] + jA0;
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.v) {
                if (i3 == 1) {
                    while (i < i2) {
                        jArr[i] = jA0 / jArr[i];
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        jArr[i] = jA0 / jArr[i];
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.C) {
                if (i3 == 1) {
                    while (i < i2) {
                        jArr[i] = jArr[i] * jA0;
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        jArr[i] = jArr[i] * jA0;
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.I) {
                if (i3 == 1) {
                    while (i < i2) {
                        jArr[i] = jA0 - jArr[i];
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        jArr[i] = jA0 - jArr[i];
                        i += i3;
                    }
                    return;
                }
            }
            if (i3 == 1) {
                while (i < i2) {
                    jArr[i] = f32Var.g(jA0, jArr[i]);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    jArr[i] = f32Var.g(jA0, jArr[i]);
                    i += i3;
                }
                return;
            }
        }
        if (!(c23Var instanceof sm)) {
            if (i3 == 1) {
                while (i < i2) {
                    jArr[i] = Math.round(c23Var.a(jArr[i]));
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    jArr[i] = Math.round(c23Var.a(jArr[i]));
                    i += i3;
                }
                return;
            }
        }
        sm smVar = (sm) c23Var;
        tm tmVar = smVar.j;
        long jA1 = smVar.a0();
        if (tmVar == h32.s) {
            if (i3 == 1) {
                while (i < i2) {
                    jArr[i] = jArr[i] + jA1;
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    jArr[i] = jArr[i] + jA1;
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.v) {
            if (i3 == 1) {
                while (i < i2) {
                    jArr[i] = jArr[i] / jA1;
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    jArr[i] = jArr[i] / jA1;
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.C) {
            if (i3 == 1) {
                while (i < i2) {
                    jArr[i] = jArr[i] * jA1;
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    jArr[i] = jArr[i] * jA1;
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.I) {
            if (i3 == 1) {
                while (i < i2) {
                    jArr[i] = jArr[i] - jA1;
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    jArr[i] = jArr[i] - jA1;
                    i += i3;
                }
                return;
            }
        }
        if (i3 == 1) {
            while (i < i2) {
                jArr[i] = tmVar.g(jArr[i], jA1);
                i++;
            }
        } else {
            while (i < i2) {
                jArr[i] = tmVar.g(jArr[i], jA1);
                i += i3;
            }
        }
    }

    @Override // defpackage.ry1
    public final void e2(int i, c23 c23Var) {
        long[] jArr = this.j;
        jArr[i] = Math.round(c23Var.a(jArr[i]));
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        long[] jArr = this.j;
        jArr[i] = Math.round(d) + jArr[i];
    }

    @Override // defpackage.ry1
    public final void f2(long j, int i, a1 a1Var, f32 f32Var) {
        long jS = a1Var.s(j);
        long[] jArr = this.j;
        jArr[i] = f32Var.g(jS, jArr[i]);
    }

    @Override // defpackage.ry1
    public final void g2(long j, int i, tm tmVar, a1 a1Var) {
        long[] jArr = this.j;
        jArr[i] = tmVar.g(jArr[i], a1Var.s(j));
    }

    @Override // defpackage.ry1
    public final void h2(int i, c23 c23Var) {
        long[] jArr = this.j;
        jArr[i] = Math.round(c23Var.a(jArr[i]));
    }

    @Override // defpackage.ry1
    public final void i2(int i, Comparable comparable) {
        this.j[i] = comparable != null ? xo1.T1(comparable) : 0L;
    }

    @Override // defpackage.ry1
    public final void j2(int i, int i2, int i3, im imVar) {
        long[] jArr = this.j;
        if (i3 == 1) {
            while (i < i2) {
                imVar.b(jArr[i]);
                i++;
            }
        } else {
            while (i < i2) {
                imVar.b(jArr[i]);
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
        this.j[i] = Math.round(d);
    }

    @Override // defpackage.ry1, defpackage.zj1
    public final void p(int i, float f) {
        this.j[i] = Math.round(f);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final float q(int i) {
        return this.j[i];
    }

    @Override // defpackage.ry1, defpackage.a1
    public final long r(int i) {
        return this.j[i];
    }

    @Override // defpackage.zj1
    public final void reset() {
        Arrays.fill(this.j, 0L);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final byte v(int i) {
        return (byte) this.j[i];
    }
}
