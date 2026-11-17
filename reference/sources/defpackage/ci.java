package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ci extends z22 {
    public static final vh k = new vh(je1.q, (byte) 2);
    public final byte[] j;

    public ci(byte[] bArr) {
        super(k, bArr.length);
        this.j = bArr;
    }

    @Override // defpackage.ry1, defpackage.a1
    public final double A(int i) {
        return this.j[i];
    }

    @Override // defpackage.ry1
    public final void Q1(int i, Comparable comparable) {
        byte bByteValue = ((Double) comparable).byteValue();
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = bByteValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ry1
    public final void U0(int i, Comparable comparable) {
        byte bByteValue;
        byte[] bArr = this.j;
        byte b = bArr[i];
        Objects.requireNonNull(comparable);
        if (comparable instanceof xo1) {
            bByteValue = (byte) ((xo1) comparable).U0();
        } else {
            bByteValue = comparable instanceof Number ? ((Number) comparable).byteValue() : (byte) -128;
        }
        bArr[i] = (byte) (bByteValue + b);
    }

    @Override // defpackage.ry1
    public final Comparable U1(int i) {
        return Double.valueOf(this.j[i]);
    }

    @Override // defpackage.ry1
    public final void b2(int i, int i2, int i3, a1 a1Var, f32 f32Var) {
        ls.G(this.j, i, i2, i3, a1Var, f32Var, this);
    }

    @Override // defpackage.ry1
    public final void c1(int i, int i2, int i3, int i4) {
        byte[] bArr = this.j;
        int i5 = 0;
        if (i3 == 1) {
            while (i5 < i4) {
                int i6 = i + i5;
                byte b = bArr[i6];
                int i7 = i2 + i5;
                bArr[i6] = bArr[i7];
                bArr[i7] = b;
                i5++;
            }
            return;
        }
        while (i5 < i4) {
            byte b2 = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
            i += i3;
            i2 += i3;
            i5++;
        }
    }

    @Override // defpackage.ry1
    public final void c2(int i, int i2, int i3, tm tmVar, a1 a1Var) {
        ls.G(this.j, i, i2, i3, this, tmVar, a1Var);
    }

    @Override // defpackage.ry1
    public final void d2(int i, int i2, int i3, c23 c23Var) {
        e32 e32Var = h32.D;
        byte[] bArr = this.j;
        if (c23Var == e32Var) {
            if (i3 == 1) {
                while (i < i2) {
                    bArr[i] = (byte) (-bArr[i]);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    bArr[i] = (byte) (-bArr[i]);
                    i += i3;
                }
                return;
            }
        }
        if (c23Var instanceof rm) {
            rm rmVar = (rm) c23Var;
            byte bU0 = (byte) rmVar.U0();
            f32 f32Var = rmVar.j;
            if (f32Var == h32.s) {
                if (i3 == 1) {
                    while (i < i2) {
                        bArr[i] = (byte) (bArr[i] + bU0);
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        bArr[i] = (byte) (bArr[i] + bU0);
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.v) {
                if (i3 == 1) {
                    while (i < i2) {
                        bArr[i] = (byte) (bU0 / bArr[i]);
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        bArr[i] = (byte) (bU0 / bArr[i]);
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.C) {
                if (i3 == 1) {
                    while (i < i2) {
                        bArr[i] = (byte) (bArr[i] * bU0);
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        bArr[i] = (byte) (bArr[i] * bU0);
                        i += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.I) {
                if (i3 == 1) {
                    while (i < i2) {
                        bArr[i] = (byte) (bU0 - bArr[i]);
                        i++;
                    }
                    return;
                } else {
                    while (i < i2) {
                        bArr[i] = (byte) (bU0 - bArr[i]);
                        i += i3;
                    }
                    return;
                }
            }
            if (i3 == 1) {
                while (i < i2) {
                    bArr[i] = f32Var.i(bU0, bArr[i]);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    bArr[i] = f32Var.i(bU0, bArr[i]);
                    i += i3;
                }
                return;
            }
        }
        if (!(c23Var instanceof sm)) {
            if (i3 == 1) {
                while (i < i2) {
                    bArr[i] = (byte) c23Var.a(bArr[i]);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    bArr[i] = (byte) c23Var.a(bArr[i]);
                    i += i3;
                }
                return;
            }
        }
        sm smVar = (sm) c23Var;
        tm tmVar = smVar.j;
        byte bU1 = (byte) smVar.U0();
        if (tmVar == h32.s) {
            if (i3 == 1) {
                while (i < i2) {
                    bArr[i] = (byte) (bArr[i] + bU1);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    bArr[i] = (byte) (bArr[i] + bU1);
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.v) {
            if (i3 == 1) {
                while (i < i2) {
                    bArr[i] = (byte) (bArr[i] / bU1);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    bArr[i] = (byte) (bArr[i] / bU1);
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.C) {
            if (i3 == 1) {
                while (i < i2) {
                    bArr[i] = (byte) (bArr[i] * bU1);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    bArr[i] = (byte) (bArr[i] * bU1);
                    i += i3;
                }
                return;
            }
        }
        if (tmVar == h32.I) {
            if (i3 == 1) {
                while (i < i2) {
                    bArr[i] = (byte) (bArr[i] - bU1);
                    i++;
                }
                return;
            } else {
                while (i < i2) {
                    bArr[i] = (byte) (bArr[i] - bU1);
                    i += i3;
                }
                return;
            }
        }
        if (i3 == 1) {
            while (i < i2) {
                bArr[i] = tmVar.i(bArr[i], bU1);
                i++;
            }
        } else {
            while (i < i2) {
                bArr[i] = tmVar.i(bArr[i], bU1);
                i += i3;
            }
        }
    }

    @Override // defpackage.ry1
    public final void e2(int i, c23 c23Var) {
        byte[] bArr = this.j;
        bArr[i] = (byte) c23Var.a(bArr[i]);
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        byte[] bArr = this.j;
        bArr[i] = (byte) (bArr[i] + ((byte) Math.round(d)));
    }

    @Override // defpackage.ry1
    public final void f2(long j, int i, a1 a1Var, f32 f32Var) {
        byte bW = a1Var.w(j);
        byte[] bArr = this.j;
        bArr[i] = f32Var.i(bW, bArr[i]);
    }

    @Override // defpackage.ry1
    public final void g2(long j, int i, tm tmVar, a1 a1Var) {
        byte[] bArr = this.j;
        bArr[i] = tmVar.i(bArr[i], a1Var.w(j));
    }

    @Override // defpackage.ry1
    public final void h2(int i, c23 c23Var) {
        byte[] bArr = this.j;
        bArr[i] = (byte) c23Var.a(bArr[i]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ry1
    public final void i2(int i, Comparable comparable) {
        byte bByteValue;
        if (comparable == 0) {
            bByteValue = 0;
        } else if (comparable instanceof xo1) {
            bByteValue = (byte) ((xo1) comparable).U0();
        } else {
            bByteValue = comparable instanceof Number ? ((Number) comparable).byteValue() : (byte) -128;
        }
        this.j[i] = bByteValue;
    }

    @Override // defpackage.ry1
    public final void j2(int i, int i2, int i3, im imVar) {
        byte[] bArr = this.j;
        if (i3 == 1) {
            while (i < i2) {
                imVar.b(bArr[i]);
                i++;
            }
        } else {
            while (i < i2) {
                imVar.b(bArr[i]);
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
        this.j[i] = (byte) Math.round(d);
    }

    @Override // defpackage.ry1, defpackage.zj1
    public final void p(int i, float f) {
        this.j[i] = (byte) Math.round(f);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final float q(int i) {
        return this.j[i];
    }

    @Override // defpackage.zj1
    public final void reset() {
        Arrays.fill(this.j, (byte) 0);
    }

    @Override // defpackage.ry1, defpackage.a1
    public final byte v(int i) {
        return this.j[i];
    }
}
