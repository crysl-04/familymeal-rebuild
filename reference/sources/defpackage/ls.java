package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.PointF;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.DragEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.DoubleUnaryOperator;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ls implements sh {
    public static iu0 h;
    public static iu0 i;
    public static te0 j;
    public static iu0 k;

    public static final int A(p81 p81Var, long j2, v43 v43Var) {
        long jV;
        int iZ;
        kw2 kw2VarD = p81Var.d();
        if (kw2VarD != null) {
            uh1 uh1Var = kw2VarD.a.b;
            t31 t31VarC = p81Var.c();
            if (t31VarC != null && (iZ = z(uh1Var, (jV = t31VarC.v(j2)), v43Var)) != -1) {
                return uh1Var.g(up1.a(jV, (uh1Var.b(iZ) + uh1Var.f(iZ)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long B(g2 g2Var) {
        DragEvent dragEvent = (DragEvent) g2Var.i;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final long C(p81 p81Var, r72 r72Var, int i2) {
        li1 li1Var = vz1.x;
        kw2 kw2VarD = p81Var.d();
        uh1 uh1Var = kw2VarD != null ? kw2VarD.a.b : null;
        t31 t31VarC = p81Var.c();
        return (uh1Var == null || t31VarC == null) ? qw2.b : uh1Var.h(r72Var.i(t31VarC.v(0L)), i2, li1Var);
    }

    public static final long D(p81 p81Var, r72 r72Var, r72 r72Var2, int i2) {
        long jC = C(p81Var, r72Var, i2);
        if (qw2.c(jC)) {
            return qw2.b;
        }
        long jC2 = C(p81Var, r72Var2, i2);
        return qw2.c(jC2) ? qw2.b : m02.a((int) (jC >> 32), (int) (jC2 & 4294967295L));
    }

    public static final void E(o20 o20Var, Throwable th) {
        try {
            r20 r20Var = (r20) o20Var.m(c5.M);
            if (r20Var != null) {
                r20Var.n(o20Var, th);
            } else {
                es.O(o20Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                vs.l(runtimeException, th);
                th = runtimeException;
            }
            es.O(o20Var, th);
        }
    }

    public static m10 F(m10 m10Var) {
        m10Var.getClass();
        n10 n10Var = m10Var instanceof n10 ? (n10) m10Var : null;
        if (n10Var == null || (m10Var = n10Var.j) != null) {
            return m10Var;
        }
        q20 q20Var = (q20) n10Var.e().m(c5.L);
        m10 ta0Var = q20Var != null ? new ta0(q20Var, n10Var) : n10Var;
        n10Var.j = ta0Var;
        return ta0Var;
    }

    public static void G(byte[] bArr, int i2, int i3, int i4, a1 a1Var, tm tmVar, a1 a1Var2) {
        if (!(a1Var instanceof ci) || !(a1Var2 instanceof ci)) {
            if (i4 == 1) {
                while (i2 < i3) {
                    bArr[i2] = tmVar.i(a1Var.v(i2), a1Var2.v(i2));
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    bArr[i2] = tmVar.i(a1Var.v(i2), a1Var2.v(i2));
                    i2 += i4;
                }
                return;
            }
        }
        byte[] bArr2 = ((ci) a1Var).j;
        byte[] bArr3 = ((ci) a1Var2).j;
        if (tmVar == h32.s) {
            if (i4 == 1) {
                while (i2 < i3) {
                    bArr[i2] = (byte) (bArr2[i2] + bArr3[i2]);
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    bArr[i2] = (byte) (bArr2[i2] + bArr3[i2]);
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.v) {
            if (i4 == 1) {
                while (i2 < i3) {
                    bArr[i2] = (byte) (bArr2[i2] / bArr3[i2]);
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    bArr[i2] = (byte) (bArr2[i2] / bArr3[i2]);
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.C) {
            if (i4 == 1) {
                while (i2 < i3) {
                    bArr[i2] = (byte) (bArr2[i2] * bArr3[i2]);
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    bArr[i2] = (byte) (bArr2[i2] * bArr3[i2]);
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.I) {
            if (i4 == 1) {
                while (i2 < i3) {
                    bArr[i2] = (byte) (bArr2[i2] - bArr3[i2]);
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    bArr[i2] = (byte) (bArr2[i2] - bArr3[i2]);
                    i2 += i4;
                }
                return;
            }
        }
        if (i4 == 1) {
            while (i2 < i3) {
                bArr[i2] = tmVar.i(bArr2[i2], bArr3[i2]);
                i2++;
            }
        } else {
            while (i2 < i3) {
                bArr[i2] = tmVar.i(bArr2[i2], bArr3[i2]);
                i2 += i4;
            }
        }
    }

    public static void H(double[] dArr, int i2, int i3, int i4, a1 a1Var, tm tmVar, a1 a1Var2) {
        int i5;
        if (!(a1Var instanceof xh) || !(a1Var2 instanceof xh)) {
            int i6 = i2;
            if (i4 == 1) {
                while (i6 < i3) {
                    dArr[i6] = tmVar.c(a1Var.A(i6), a1Var2.A(i6));
                    i6++;
                }
                return;
            } else {
                while (i6 < i3) {
                    dArr[i6] = tmVar.c(a1Var.A(i6), a1Var2.A(i6));
                    i6 += i4;
                }
                return;
            }
        }
        double[] dArr2 = ((xh) a1Var).j;
        double[] dArr3 = ((xh) a1Var2).j;
        if (tmVar == h32.s) {
            if (i4 == 1) {
                while (i2 < i3) {
                    dArr[i2] = dArr2[i2] + dArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    dArr[i2] = dArr2[i2] + dArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.v) {
            if (i4 == 1) {
                while (i2 < i3) {
                    dArr[i2] = dArr2[i2] / dArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    dArr[i2] = dArr2[i2] / dArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.A) {
            if (i4 == 1) {
                while (i2 < i3) {
                    dArr[i2] = Math.max(dArr2[i2], dArr3[i2]);
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    dArr[i2] = Math.max(dArr2[i2], dArr3[i2]);
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.B) {
            if (i4 == 1) {
                while (i2 < i3) {
                    dArr[i2] = Math.min(dArr2[i2], dArr3[i2]);
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    dArr[i2] = Math.min(dArr2[i2], dArr3[i2]);
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.C) {
            ys.U(dArr, i2, i3, i4, dArr2, dArr3);
            return;
        }
        if (tmVar == h32.I) {
            if (i4 == 1) {
                while (i5 < i3) {
                    dArr[i5] = dArr2[i5] - dArr3[i5];
                    i5++;
                }
                return;
            } else {
                while (i5 < i3) {
                    dArr[i5] = dArr2[i5] - dArr3[i5];
                    i5 += i4;
                }
                return;
            }
        }
        if (i4 == 1) {
            while (i5 < i3) {
                dArr[i5] = tmVar.c(dArr2[i5], dArr3[i5]);
                i5++;
            }
        } else {
            while (i5 < i3) {
                dArr[i5] = tmVar.c(dArr2[i5], dArr3[i5]);
                i5 += i4;
            }
        }
    }

    public static void I(float[] fArr, int i2, int i3, int i4, a1 a1Var, tm tmVar, a1 a1Var2) {
        if (!(a1Var instanceof wh) || !(a1Var2 instanceof wh)) {
            if (i4 == 1) {
                while (i2 < i3) {
                    fArr[i2] = tmVar.h(a1Var.q(i2), a1Var2.q(i2));
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    fArr[i2] = tmVar.h(a1Var.q(i2), a1Var2.q(i2));
                    i2 += i4;
                }
                return;
            }
        }
        float[] fArr2 = ((wh) a1Var).j;
        float[] fArr3 = ((wh) a1Var2).j;
        if (tmVar == h32.s) {
            if (i4 == 1) {
                while (i2 < i3) {
                    fArr[i2] = fArr2[i2] + fArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    fArr[i2] = fArr2[i2] + fArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.v) {
            if (i4 == 1) {
                while (i2 < i3) {
                    fArr[i2] = fArr2[i2] / fArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    fArr[i2] = fArr2[i2] / fArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.C) {
            if (i4 == 1) {
                while (i2 < i3) {
                    fArr[i2] = fArr2[i2] * fArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    fArr[i2] = fArr2[i2] * fArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.I) {
            if (i4 == 1) {
                while (i2 < i3) {
                    fArr[i2] = fArr2[i2] - fArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    fArr[i2] = fArr2[i2] - fArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (i4 == 1) {
            while (i2 < i3) {
                fArr[i2] = tmVar.h(fArr2[i2], fArr3[i2]);
                i2++;
            }
        } else {
            while (i2 < i3) {
                fArr[i2] = tmVar.h(fArr2[i2], fArr3[i2]);
                i2 += i4;
            }
        }
    }

    public static void J(int[] iArr, int i2, int i3, int i4, a1 a1Var, tm tmVar, a1 a1Var2) {
        if (!(a1Var instanceof ei) || !(a1Var2 instanceof ei)) {
            if (i4 == 1) {
                while (i2 < i3) {
                    iArr[i2] = tmVar.d(a1Var.D(i2), a1Var2.D(i2));
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    iArr[i2] = tmVar.d(a1Var.D(i2), a1Var2.D(i2));
                    i2 += i4;
                }
                return;
            }
        }
        int[] iArr2 = ((ei) a1Var).j;
        int[] iArr3 = ((ei) a1Var2).j;
        if (tmVar == h32.s) {
            if (i4 == 1) {
                while (i2 < i3) {
                    iArr[i2] = iArr2[i2] + iArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    iArr[i2] = iArr2[i2] + iArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.v) {
            if (i4 == 1) {
                while (i2 < i3) {
                    iArr[i2] = iArr2[i2] / iArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    iArr[i2] = iArr2[i2] / iArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.C) {
            if (i4 == 1) {
                while (i2 < i3) {
                    iArr[i2] = iArr2[i2] * iArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    iArr[i2] = iArr2[i2] * iArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.I) {
            if (i4 == 1) {
                while (i2 < i3) {
                    iArr[i2] = iArr2[i2] - iArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    iArr[i2] = iArr2[i2] - iArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (i4 == 1) {
            while (i2 < i3) {
                iArr[i2] = tmVar.d(iArr2[i2], iArr3[i2]);
                i2++;
            }
        } else {
            while (i2 < i3) {
                iArr[i2] = tmVar.d(iArr2[i2], iArr3[i2]);
                i2 += i4;
            }
        }
    }

    public static void K(long[] jArr, int i2, int i3, int i4, a1 a1Var, tm tmVar, a1 a1Var2) {
        if (!(a1Var instanceof fi) || !(a1Var2 instanceof fi)) {
            if (i4 == 1) {
                while (i2 < i3) {
                    jArr[i2] = tmVar.g(a1Var.r(i2), a1Var2.r(i2));
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    jArr[i2] = tmVar.g(a1Var.r(i2), a1Var2.r(i2));
                    i2 += i4;
                }
                return;
            }
        }
        long[] jArr2 = ((fi) a1Var).j;
        long[] jArr3 = ((fi) a1Var2).j;
        if (tmVar == h32.s) {
            if (i4 == 1) {
                while (i2 < i3) {
                    jArr[i2] = jArr2[i2] + jArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    jArr[i2] = jArr2[i2] + jArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.v) {
            if (i4 == 1) {
                while (i2 < i3) {
                    jArr[i2] = jArr2[i2] / jArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    jArr[i2] = jArr2[i2] / jArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.C) {
            if (i4 == 1) {
                while (i2 < i3) {
                    jArr[i2] = jArr2[i2] * jArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    jArr[i2] = jArr2[i2] * jArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.I) {
            if (i4 == 1) {
                while (i2 < i3) {
                    jArr[i2] = jArr2[i2] - jArr3[i2];
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    jArr[i2] = jArr2[i2] - jArr3[i2];
                    i2 += i4;
                }
                return;
            }
        }
        if (i4 == 1) {
            while (i2 < i3) {
                jArr[i2] = tmVar.g(jArr2[i2], jArr3[i2]);
                i2++;
            }
        } else {
            while (i2 < i3) {
                jArr[i2] = tmVar.g(jArr2[i2], jArr3[i2]);
                i2 += i4;
            }
        }
    }

    public static void L(Comparable[] comparableArr, int i2, int i3, int i4, a1 a1Var, tm tmVar, a1 a1Var2) {
        while (i2 < i3) {
            long j2 = i2;
            comparableArr[i2] = tmVar.a(a1Var.G(j2), a1Var2.G(j2));
            i2 += i4;
        }
    }

    public static void M(short[] sArr, int i2, int i3, int i4, a1 a1Var, tm tmVar, a1 a1Var2) {
        if (!(a1Var instanceof di) || !(a1Var2 instanceof di)) {
            if (i4 == 1) {
                while (i2 < i3) {
                    sArr[i2] = tmVar.b(a1Var.d(i2), a1Var2.d(i2));
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    sArr[i2] = tmVar.b(a1Var.d(i2), a1Var2.d(i2));
                    i2 += i4;
                }
                return;
            }
        }
        short[] sArr2 = ((di) a1Var).j;
        short[] sArr3 = ((di) a1Var2).j;
        if (tmVar == h32.s) {
            if (i4 == 1) {
                while (i2 < i3) {
                    sArr[i2] = (short) (sArr2[i2] + sArr3[i2]);
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    sArr[i2] = (short) (sArr2[i2] + sArr3[i2]);
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.v) {
            if (i4 == 1) {
                while (i2 < i3) {
                    sArr[i2] = (short) (sArr2[i2] / sArr3[i2]);
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    sArr[i2] = (short) (sArr2[i2] / sArr3[i2]);
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.C) {
            if (i4 == 1) {
                while (i2 < i3) {
                    sArr[i2] = (short) (sArr2[i2] * sArr3[i2]);
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    sArr[i2] = (short) (sArr2[i2] * sArr3[i2]);
                    i2 += i4;
                }
                return;
            }
        }
        if (tmVar == h32.I) {
            if (i4 == 1) {
                while (i2 < i3) {
                    sArr[i2] = (short) (sArr2[i2] - sArr3[i2]);
                    i2++;
                }
                return;
            } else {
                while (i2 < i3) {
                    sArr[i2] = (short) (sArr2[i2] - sArr3[i2]);
                    i2 += i4;
                }
                return;
            }
        }
        if (i4 == 1) {
            while (i2 < i3) {
                sArr[i2] = tmVar.b(sArr2[i2], sArr3[i2]);
                i2++;
            }
        } else {
            while (i2 < i3) {
                sArr[i2] = tmVar.b(sArr2[i2], sArr3[i2]);
                i2 += i4;
            }
        }
    }

    public static final boolean N(jw2 jw2Var, int i2) {
        uh1 uh1Var = jw2Var.b;
        int iD = uh1Var.d(i2);
        return i2 == jw2Var.f(iD) || i2 == uh1Var.c(iD, false) ? jw2Var.g(i2) != jw2Var.a(i2) : jw2Var.a(i2) != jw2Var.a(i2 - 1);
    }

    public static final boolean O(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean P(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final boolean Q(int i2) {
        int type;
        return (!P(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }

    public static final float R(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int S(float f, int i2, int i3) {
        return i2 + ((int) Math.round(((double) (i3 - i2)) * ((double) f)));
    }

    public static final rg1 T(dr0 dr0Var, rg1 rg1Var) {
        if (rg1Var.b(new rt((byte) 3))) {
            return rg1Var;
        }
        dr0Var.R(1219399079, 0, null, null);
        rg1 rg1Var2 = (rg1) rg1Var.a(new s((Object) dr0Var, (byte) 4), og1.h);
        dr0Var.p(false);
        return rg1Var2;
    }

    public static final rg1 U(dr0 dr0Var, rg1 rg1Var) {
        dr0Var.V(439770924);
        rg1 rg1VarT = T(dr0Var, rg1Var);
        dr0Var.p(false);
        return rg1VarT;
    }

    public static final t81 V(c11 c11Var, rh2 rh2Var) {
        rh2Var.getClass();
        p02 p02VarC = rh2Var.c();
        if (p02VarC instanceof g12) {
            return t81.POLY_OBJ;
        }
        if (uz0.g(p02VarC, po2.j)) {
            return t81.LIST;
        }
        if (!uz0.g(p02VarC, po2.k)) {
            return t81.OBJ;
        }
        rh2 rh2VarQ = q(rh2Var.j(0), c11Var.b);
        p02 p02VarC2 = rh2VarQ.c();
        if ((p02VarC2 instanceof d32) || uz0.g(p02VarC2, vh2.i)) {
            return t81.MAP;
        }
        String str = "Value of type '" + rh2VarQ.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + rh2VarQ.c() + '\'';
        rh2VarQ.b();
        throw new l11(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final int X(u51 u51Var, ks1 ks1Var) {
        return (int) (ks1Var == ks1.h ? u51Var.r & 4294967295L : u51Var.r >> 32);
    }

    public static final long Z(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static fp a(int i2, int i3, dp dpVar) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        dp dpVar2 = dp.h;
        if (i4 != 0) {
            dpVar = dpVar2;
        }
        if (i2 == -2) {
            if (dpVar != dpVar2) {
                return new a00(1, dpVar);
            }
            ds.e.getClass();
            return new fp(cs.b);
        }
        if (i2 == -1) {
            if (dpVar == dpVar2) {
                return new a00(1, dp.i);
            }
            wg.m("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i2 == 0) {
            return dpVar == dpVar2 ? new fp(0) : new a00(1, dpVar);
        }
        if (i2 != Integer.MAX_VALUE) {
            return dpVar == dpVar2 ? new fp(i2) : new a00(i2, dpVar);
        }
        return new fp(Integer.MAX_VALUE);
    }

    public static final zm2 a0(gh1 gh1Var, dr0 dr0Var) {
        fh1 fh1Var = (fh1) dr0Var.j(he1.a);
        int iOrdinal = gh1Var.ordinal();
        if (iOrdinal == 0) {
            fh1Var.getClass();
            zm2 zm2Var = fh1.b;
            zm2Var.getClass();
            return zm2Var;
        }
        if (iOrdinal == 1) {
            fh1Var.getClass();
            zm2 zm2Var2 = fh1.c;
            zm2Var2.getClass();
            return zm2Var2;
        }
        if (iOrdinal == 2) {
            fh1Var.getClass();
            zm2 zm2Var3 = fh1.d;
            zm2Var3.getClass();
            return zm2Var3;
        }
        if (iOrdinal == 3) {
            fh1Var.getClass();
            zm2 zm2Var4 = fh1.e;
            zm2Var4.getClass();
            return zm2Var4;
        }
        if (iOrdinal == 4) {
            fh1Var.getClass();
            zm2 zm2Var5 = fh1.f;
            zm2Var5.getClass();
            return zm2Var5;
        }
        if (iOrdinal != 5) {
            wg.n();
            return null;
        }
        fh1Var.getClass();
        zm2 zm2Var6 = fh1.g;
        zm2Var6.getClass();
        return zm2Var6;
    }

    public static final void b(kv2 kv2Var, nx nxVar, dr0 dr0Var, int i2) {
        rg1 rg1VarJ;
        dr0Var.W(1533506138);
        byte b = 2;
        int i3 = (dr0Var.h(kv2Var) ? 4 : 2) | i2;
        byte b2 = 0;
        if (dr0Var.N(i3 & 1, (i3 & 19) != 18)) {
            dr0Var.V(-885604480);
            if (kv2Var.i()) {
                m10 m10Var = null;
                rg1VarJ = tz0.J(aa3.I(new cv2(kv2Var, m10Var, b2)), kv2Var.x, new dv2(kv2Var, null), new ev2(kv2Var, m10Var, b2), new a20(kv2Var, b));
            } else {
                rg1VarJ = og1.h;
            }
            rz1.b(rg1VarJ, nxVar, dr0Var, 48);
            dr0Var.p(false);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new gw(kv2Var, nxVar, i2, b2);
        }
    }

    public static Object b0(zp0 zp0Var, Object obj, m10 m10Var) {
        zp0Var.getClass();
        o20 o20VarE = m10Var.e();
        Object xz0Var = o20VarE == xf0.h ? new xz0(m10Var) : new yz0(m10Var, o20VarE);
        t03.k(2, zp0Var);
        return zp0Var.f(obj, xz0Var);
    }

    public static h90 c() {
        return new h90(1.0f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0144  */
    /* JADX WARN: Code duplicated, block: B:69:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0158  */
    /* JADX WARN: Code duplicated, block: B:76:0x0179  */
    /* JADX WARN: Code duplicated, block: B:78:0x0188  */
    /* JADX WARN: Code duplicated, block: B:82:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b6  */
    public static t8 d(int i2, int i3, int i4) {
        ColorSpace rgb;
        String str;
        float[] fArrA;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] fArr;
        final byte b;
        ColorSpace.Rgb rgb2;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        s92 s92Var = uv.e;
        ie1.C(i4);
        Bitmap.Config configC = ie1.C(i4);
        if (uz0.g(s92Var, s92Var)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (uz0.g(s92Var, uv.q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (uz0.g(s92Var, uv.r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (uz0.g(s92Var, uv.o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (uz0.g(s92Var, uv.j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (uz0.g(s92Var, uv.i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (uz0.g(s92Var, uv.t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (uz0.g(s92Var, uv.s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (uz0.g(s92Var, uv.k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (uz0.g(s92Var, uv.l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (uz0.g(s92Var, uv.g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (uz0.g(s92Var, uv.h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (uz0.g(s92Var, uv.f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (uz0.g(s92Var, uv.m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (uz0.g(s92Var, uv.p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!uz0.g(s92Var, uv.n)) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 34) {
                    if (uz0.g(s92Var, uv.v)) {
                        colorSpace3 = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
                    } else {
                        colorSpace3 = uz0.g(s92Var, uv.w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    }
                    if (colorSpace3 != null) {
                        colorSpace = colorSpace3;
                    } else if (i5 < 36) {
                        if (uz0.g(s92Var, uv.x)) {
                            colorSpace2 = ColorSpace.get(ColorSpace.Named.OK_LAB);
                        } else {
                            colorSpace2 = null;
                        }
                        if (colorSpace2 != null) {
                            colorSpace = colorSpace2;
                        } else if (s92Var != null) {
                            str = s92Var.a;
                            fArrA = s92Var.d.a();
                            dz2 dz2Var = s92Var.g;
                            if (dz2Var != null) {
                            }
                            fArr = s92Var.i;
                            b = 0;
                            if (transferParameters != null) {
                                rgb2 = new ColorSpace.Rgb(str, s92Var.h, fArrA, transferParameters);
                                if (Float.isNaN(fArr[0])) {
                                }
                            } else {
                                float[] fArr2 = s92Var.h;
                                final r92 r92Var = s92Var.l;
                                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: tv
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        byte b2 = b;
                                        r92 r92Var2 = (r92) r92Var;
                                        switch (b2) {
                                            case 0:
                                                break;
                                        }
                                        return ((Number) r92Var2.h(Double.valueOf(d))).doubleValue();
                                    }
                                };
                                final r92 r92Var2 = s92Var.o;
                                final byte b2 = 1;
                                rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: tv
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        byte b3 = b2;
                                        r92 r92Var3 = (r92) r92Var2;
                                        switch (b3) {
                                            case 0:
                                                break;
                                        }
                                        return ((Number) r92Var3.h(Double.valueOf(d))).doubleValue();
                                    }
                                }, s92Var.e, s92Var.f);
                            }
                            colorSpace = rgb2;
                        } else {
                            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                    } else if (s92Var != null) {
                        str = s92Var.a;
                        fArrA = s92Var.d.a();
                        dz2 dz2Var2 = s92Var.g;
                        if (dz2Var2 != null) {
                        }
                        fArr = s92Var.i;
                        b = 0;
                        if (transferParameters != null) {
                            rgb2 = new ColorSpace.Rgb(str, s92Var.h, fArrA, transferParameters);
                            if (Float.isNaN(fArr[0])) {
                            }
                        } else {
                            float[] fArr3 = s92Var.h;
                            final m31 r92Var3 = s92Var.l;
                            DoubleUnaryOperator doubleUnaryOperator2 = new DoubleUnaryOperator() { // from class: tv
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    byte b3 = b;
                                    r92 r92Var4 = (r92) r92Var3;
                                    switch (b3) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) r92Var4.h(Double.valueOf(d))).doubleValue();
                                }
                            };
                            final m31 r92Var4 = s92Var.o;
                            final byte b3 = 1;
                            rgb2 = new ColorSpace.Rgb(str, fArr3, fArrA, doubleUnaryOperator2, new DoubleUnaryOperator() { // from class: tv
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    byte b4 = b3;
                                    r92 r92Var5 = (r92) r92Var4;
                                    switch (b4) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) r92Var5.h(Double.valueOf(d))).doubleValue();
                                }
                            }, s92Var.e, s92Var.f);
                        }
                        colorSpace = rgb2;
                    } else {
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                } else if (i5 < 36) {
                    if (uz0.g(s92Var, uv.x)) {
                        colorSpace2 = ColorSpace.get(ColorSpace.Named.OK_LAB);
                    } else {
                        colorSpace2 = null;
                    }
                    if (colorSpace2 != null) {
                        colorSpace = colorSpace2;
                    } else if (s92Var != null) {
                        str = s92Var.a;
                        fArrA = s92Var.d.a();
                        dz2 dz2Var3 = s92Var.g;
                        if (dz2Var3 != null) {
                        }
                        fArr = s92Var.i;
                        b = 0;
                        if (transferParameters != null) {
                            rgb2 = new ColorSpace.Rgb(str, s92Var.h, fArrA, transferParameters);
                            if (Float.isNaN(fArr[0])) {
                            }
                        } else {
                            float[] fArr4 = s92Var.h;
                            final m31 r92Var5 = s92Var.l;
                            DoubleUnaryOperator doubleUnaryOperator3 = new DoubleUnaryOperator() { // from class: tv
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    byte b4 = b;
                                    r92 r92Var6 = (r92) r92Var5;
                                    switch (b4) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) r92Var6.h(Double.valueOf(d))).doubleValue();
                                }
                            };
                            final m31 r92Var6 = s92Var.o;
                            final byte b4 = 1;
                            rgb2 = new ColorSpace.Rgb(str, fArr4, fArrA, doubleUnaryOperator3, new DoubleUnaryOperator() { // from class: tv
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    byte b5 = b4;
                                    r92 r92Var7 = (r92) r92Var6;
                                    switch (b5) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) r92Var7.h(Double.valueOf(d))).doubleValue();
                                }
                            }, s92Var.e, s92Var.f);
                        }
                        colorSpace = rgb2;
                    } else {
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                } else if (s92Var != null) {
                    str = s92Var.a;
                    fArrA = s92Var.d.a();
                    dz2 dz2Var4 = s92Var.g;
                    transferParameters = dz2Var4 != null ? new ColorSpace.Rgb.TransferParameters(dz2Var4.b, dz2Var4.c, dz2Var4.d, dz2Var4.e, dz2Var4.f, dz2Var4.g, dz2Var4.a) : null;
                    fArr = s92Var.i;
                    b = 0;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, s92Var.h, fArrA, transferParameters);
                        if (Float.isNaN(fArr[0]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr5 = s92Var.h;
                        final m31 r92Var7 = s92Var.l;
                        DoubleUnaryOperator doubleUnaryOperator4 = new DoubleUnaryOperator() { // from class: tv
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                byte b5 = b;
                                r92 r92Var8 = (r92) r92Var7;
                                switch (b5) {
                                    case 0:
                                        break;
                                }
                                return ((Number) r92Var8.h(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final m31 r92Var8 = s92Var.o;
                        final byte b5 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr5, fArrA, doubleUnaryOperator4, new DoubleUnaryOperator() { // from class: tv
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                byte b6 = b5;
                                r92 r92Var9 = (r92) r92Var8;
                                switch (b6) {
                                    case 0:
                                        break;
                                }
                                return ((Number) r92Var9.h(Double.valueOf(d))).doubleValue();
                            }
                        }, s92Var.e, s92Var.f);
                    }
                    colorSpace = rgb2;
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new t8(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configC, true, colorSpace));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace = rgb;
        return new t8(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configC, true, colorSpace));
    }

    public static final ww0 e(r21 r21Var, String str) {
        return new ww0(str, new xw0(r21Var));
    }

    public static final void f(Object obj, int i2, a71 a71Var, nx nxVar, dr0 dr0Var, int i3) {
        nx nxVar2;
        dr0Var.W(872548579);
        int i4 = i3 | (dr0Var.h(obj) ? 4 : 2) | (dr0Var.d(i2) ? 32 : 16) | (dr0Var.h(a71Var) ? 256 : 128);
        byte b = 0;
        if (dr0Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            boolean zF = dr0Var.f(obj) | dr0Var.f(a71Var);
            Object objK = dr0Var.K();
            Object obj2 = zy.a;
            if (zF || objK == obj2) {
                objK = new y61(obj, a71Var);
                dr0Var.f0(objK);
            }
            y61 y61Var = (y61) objK;
            y61Var.c = i2;
            lu1 lu1Var = y61Var.g;
            g42 g42Var = ky1.a;
            y61 y61Var2 = (y61) dr0Var.j(g42Var);
            uk2 uk2VarN = y02.n();
            vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
            uk2 uk2VarQ = y02.q(uk2VarN);
            try {
                if (y61Var2 != ((y61) lu1Var.getValue())) {
                    lu1Var.setValue(y61Var2);
                    if (y61Var.d > 0) {
                        y61 y61Var3 = y61Var.e;
                        if (y61Var3 != null) {
                            y61Var3.b();
                        }
                        if (y61Var2 != null) {
                            y61Var2.a();
                        } else {
                            y61Var2 = null;
                        }
                        y61Var.e = y61Var2;
                    }
                }
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                boolean zF2 = dr0Var.f(y61Var);
                Object objK2 = dr0Var.K();
                if (zF2 || objK2 == obj2) {
                    objK2 = new z61(y61Var, b);
                    dr0Var.f0(objK2);
                }
                h7.G(y61Var, (vp0) objK2, dr0Var);
                nxVar2 = nxVar;
                ys.a(g42Var.a(y61Var), nxVar2, dr0Var, 56);
            } catch (Throwable th) {
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                throw th;
            }
        } else {
            nxVar2 = nxVar;
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha(obj, i2, a71Var, nxVar2, i3, (byte) 7);
        }
    }

    public static final void g(final vv2 vv2Var, final vp0 vp0Var, final rg1 rg1Var, boolean z, xw2 xw2Var, final nx nxVar, final nx nxVar2, final nx nxVar3, final boolean z2, final w53 w53Var, final c31 c31Var, b31 b31Var, final boolean z3, int i2, int i3, hi2 hi2Var, final au2 au2Var, dr0 dr0Var, final int i4) {
        dr0 dr0Var2;
        final boolean z4;
        final xw2 xw2Var2;
        final b31 b31Var2;
        final int i5;
        final int i6;
        final hi2 hi2Var2;
        xw2 xw2Var3;
        hi2 hi2VarA;
        b31 b31Var3;
        int i7;
        boolean z5;
        long j2;
        boolean z6;
        dr0Var.W(2057288437);
        int i8 = i4 | (dr0Var.f(vv2Var) ? 4 : 2) | (dr0Var.h(vp0Var) ? 32 : 16) | (dr0Var.f(rg1Var) ? 256 : 128) | 906062848;
        int i9 = 1;
        if (dr0Var.N(i8 & 1, ((i8 & 306783379) == 306783378 && ((((438 | (dr0Var.g(z2) ? (char) 2048 : (char) 1024)) | (dr0Var.f(w53Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192)) | 840433664) & 306783379) == 306783378 && ((22 | (dr0Var.f(au2Var) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            dr0Var.S();
            if ((i4 & 1) == 0 || dr0Var.x()) {
                xw2Var3 = (xw2) dr0Var.j(gw2.a);
                int i10 = z3 ? 1 : Integer.MAX_VALUE;
                hi2VarA = mi2.a(ia2.w, dr0Var);
                b31Var3 = b31.a;
                i7 = i10;
                z5 = true;
            } else {
                dr0Var.Q();
                z5 = z;
                xw2Var3 = xw2Var;
                b31Var3 = b31Var;
                i7 = i2;
                i9 = i3;
                hi2VarA = hi2Var;
            }
            dr0Var.q();
            dr0Var.V(-502250010);
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new ui1();
                dr0Var.f0(objK);
            }
            ui1 ui1Var = (ui1) objK;
            dr0Var.p(false);
            dr0Var.V(1369277167);
            long jB = xw2Var3.b();
            if (jB != 16) {
                z6 = false;
            } else {
                boolean zBooleanValue = ((Boolean) r(ui1Var, dr0Var, 0).getValue()).booleanValue();
                if (!z5) {
                    j2 = au2Var.c;
                } else if (z2) {
                    j2 = au2Var.d;
                } else {
                    j2 = zBooleanValue ? au2Var.a : au2Var.b;
                }
                jB = j2;
                z6 = false;
            }
            long j3 = jB;
            dr0Var.p(z6);
            xw2 xw2VarD = xw2Var3.d(new xw2(j3, 0L, null, 0L, 0, 0L, 16777214));
            int i11 = i9;
            xw2 xw2Var4 = xw2Var3;
            int i12 = i7;
            dr0Var2 = dr0Var;
            ys.a(sw2.a.a(au2Var.k), dt.N(-2094276683, new ys1(rg1Var, nxVar, z2, au2Var, vv2Var, vp0Var, z5, xw2VarD, c31Var, b31Var3, z3, i12, i11, w53Var, ui1Var, nxVar2, nxVar3, hi2VarA), dr0Var2), dr0Var2, 56);
            z4 = z5;
            i5 = i12;
            i6 = i11;
            hi2Var2 = hi2VarA;
            xw2Var2 = xw2Var4;
            b31Var2 = b31Var3;
        } else {
            dr0Var2 = dr0Var;
            dr0Var2.Q();
            z4 = z;
            xw2Var2 = xw2Var;
            b31Var2 = b31Var;
            i5 = i2;
            i6 = i3;
            hi2Var2 = hi2Var;
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(vp0Var, rg1Var, z4, xw2Var2, nxVar, nxVar2, nxVar3, z2, w53Var, c31Var, b31Var2, z3, i5, i6, hi2Var2, au2Var, i4) { // from class: ts1
                public final /* synthetic */ vp0 i;
                public final /* synthetic */ rg1 j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ xw2 l;
                public final /* synthetic */ nx m;
                public final /* synthetic */ nx n;
                public final /* synthetic */ nx o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ w53 q;
                public final /* synthetic */ c31 r;
                public final /* synthetic */ b31 s;
                public final /* synthetic */ boolean t;
                public final /* synthetic */ int u;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ hi2 w;
                public final /* synthetic */ au2 x;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(14155777);
                    vv2 vv2Var2 = this.h;
                    vp0 vp0Var2 = this.i;
                    rg1 rg1Var2 = this.j;
                    boolean z7 = this.k;
                    xw2 xw2Var5 = this.l;
                    nx nxVar4 = this.m;
                    nx nxVar5 = this.n;
                    nx nxVar6 = this.o;
                    boolean z8 = this.p;
                    w53 w53Var2 = this.q;
                    c31 c31Var2 = this.r;
                    b31 b31Var4 = this.s;
                    boolean z9 = this.t;
                    int i13 = this.u;
                    boolean z10 = this.v;
                    hi2 hi2Var3 = this.w;
                    au2 au2Var2 = this.x;
                    ls.g(vv2Var2, vp0Var2, rg1Var2, z7, xw2Var5, nxVar4, nxVar5, nxVar6, z8, w53Var2, c31Var2, b31Var4, z9, i13, z10 ? 1 : 0, hi2Var3, au2Var2, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0137  */
    /* JADX WARN: Code duplicated, block: B:103:0x0141  */
    /* JADX WARN: Code duplicated, block: B:105:0x0148  */
    /* JADX WARN: Code duplicated, block: B:109:0x016f  */
    /* JADX WARN: Code duplicated, block: B:111:0x017a  */
    /* JADX WARN: Code duplicated, block: B:113:0x017d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0180  */
    /* JADX WARN: Code duplicated, block: B:117:0x0183  */
    /* JADX WARN: Code duplicated, block: B:119:0x0186  */
    /* JADX WARN: Code duplicated, block: B:121:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0192  */
    /* JADX WARN: Code duplicated, block: B:126:0x0195  */
    /* JADX WARN: Code duplicated, block: B:128:0x0198  */
    /* JADX WARN: Code duplicated, block: B:129:0x019b  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:139:0x0206  */
    /* JADX WARN: Code duplicated, block: B:140:0x0209 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x020b  */
    /* JADX WARN: Code duplicated, block: B:142:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x0210  */
    /* JADX WARN: Code duplicated, block: B:144:0x0213  */
    /* JADX WARN: Code duplicated, block: B:147:0x0265  */
    /* JADX WARN: Code duplicated, block: B:150:0x0287  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:97:0x0131  */
    /* JADX WARN: Instruction removed from duplicated block: B:109:0x016f, please report this as an issue */
    public static final void h(final String str, final vp0 vp0Var, final rg1 rg1Var, boolean z, xw2 xw2Var, nx nxVar, nx nxVar2, nx nxVar3, nx nxVar4, nx nxVar5, boolean z2, v53 v53Var, c31 c31Var, b31 b31Var, final boolean z3, int i2, int i3, hi2 hi2Var, au2 au2Var, dr0 dr0Var, final int i4, final int i5, final int i6) {
        int i7;
        nx nxVar6;
        int i8;
        nx nxVar7;
        int i9;
        int i10;
        nx nxVar8;
        int i11;
        int i12;
        int i13;
        int i14;
        nx nxVar9;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        c31 c31Var2;
        int i26;
        boolean z4;
        final boolean z5;
        final xw2 xw2Var2;
        final nx nxVar10;
        final boolean z6;
        final b31 b31Var2;
        final int i27;
        final int i28;
        final hi2 hi2Var2;
        final au2 au2Var2;
        final nx nxVar11;
        final nx nxVar12;
        final nx nxVar13;
        final nx nxVar14;
        final c31 c31Var3;
        final v53 v53Var2;
        e72 e72VarR;
        xw2 xw2Var3;
        boolean z7;
        c31 c31Var4;
        int i29;
        nx nxVar15;
        nx nxVar16;
        v53 v53Var3;
        hi2 hi2Var3;
        boolean z8;
        nx nxVar17;
        boolean z9;
        au2 au2Var3;
        Object objK;
        ui1 ui1Var;
        boolean z10;
        long jB;
        boolean zBooleanValue;
        long j2;
        long j3;
        dr0Var.W(1901501544);
        if ((i4 & 6) == 0) {
            i7 = (dr0Var.f(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= dr0Var.h(vp0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= dr0Var.f(rg1Var) ? 256 : 128;
        }
        int i30 = i7 | 27648;
        if ((i4 & 196608) == 0) {
            i30 = 93184 | i7;
        }
        int i31 = i6 & 64;
        if (i31 == 0) {
            if ((1572864 & i4) == 0) {
                nxVar6 = nxVar;
                i30 |= dr0Var.h(nxVar6) ? 1048576 : 524288;
            }
            i8 = i6 & 128;
            if (i8 != 0) {
                if ((12582912 & i4) == 0) {
                    nxVar7 = nxVar2;
                    if (dr0Var.h(nxVar7)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i30 |= i9;
                }
                i10 = i6 & 256;
                if (i10 != 0) {
                    i30 |= 100663296;
                    nxVar8 = nxVar3;
                } else {
                    nxVar8 = nxVar3;
                    if ((i4 & 100663296) == 0) {
                        if (dr0Var.h(nxVar8)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i30 |= i11;
                    }
                }
                i12 = i30 | 805306368;
                i13 = i5 | 6;
                i14 = i6 & 2048;
                if (i14 != 0) {
                    i16 = i5 | 54;
                    nxVar9 = nxVar4;
                } else {
                    nxVar9 = nxVar4;
                    if (dr0Var.h(nxVar9)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i16 = i13 | i15;
                }
                i17 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i20 = i17 | 384;
                } else {
                    if (dr0Var.h(nxVar5)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i20 = i17 | i19;
                }
                i21 = i6 & 8192;
                if (i21 != 0) {
                    i23 = i20 | 3072;
                } else {
                    if (dr0Var.g(z2)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i23 = i20 | i22;
                }
                i24 = i23 | 24576;
                i25 = i6 & 32768;
                if (i25 != 0) {
                    if ((i5 & 196608) == 0) {
                        c31Var2 = c31Var;
                        if (dr0Var.f(c31Var2)) {
                            i26 = 131072;
                        } else {
                            i26 = 65536;
                        }
                        i24 |= i26;
                    }
                    int i32 = i24 | 840433664;
                    if ((i12 & 306783379) == 306783378 || (i32 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dr0Var.N(i12 & 1, z4)) {
                        dr0Var.S();
                        if ((i4 & 1) != 0 || dr0Var.x()) {
                            xw2Var3 = (xw2) dr0Var.j(gw2.a);
                            if (i31 != 0) {
                                nxVar6 = null;
                            }
                            if (i8 != 0) {
                                nxVar7 = null;
                            }
                            if (i10 != 0) {
                                nxVar8 = null;
                            }
                            if (i14 != 0) {
                                nxVar9 = null;
                            }
                            nx nxVar18 = i18 == 0 ? nxVar5 : null;
                            if (i21 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            v53 v53Var4 = vz1.z;
                            if (i25 != 0) {
                                c31Var4 = c31.d;
                            } else {
                                c31Var4 = c31Var2;
                            }
                            if (z3) {
                                i29 = 1;
                            } else {
                                i29 = Integer.MAX_VALUE;
                            }
                            hi2 hi2VarA = mi2.a(ia2.w, dr0Var);
                            au2 au2VarL = c5.l(6, dr0Var);
                            nxVar15 = nxVar18;
                            nxVar16 = nxVar8;
                            v53Var3 = v53Var4;
                            nxVar14 = nxVar6;
                            hi2Var3 = hi2VarA;
                            b31Var2 = b31.a;
                            i28 = 1;
                            z8 = z7;
                            nxVar17 = nxVar9;
                            c31Var3 = c31Var4;
                            z9 = true;
                            au2Var3 = au2VarL;
                        } else {
                            dr0Var.Q();
                            z9 = z;
                            xw2Var3 = xw2Var;
                            nxVar15 = nxVar5;
                            z8 = z2;
                            v53Var3 = v53Var;
                            b31Var2 = b31Var;
                            i28 = i3;
                            hi2Var3 = hi2Var;
                            nxVar16 = nxVar8;
                            nxVar17 = nxVar9;
                            nxVar14 = nxVar6;
                            au2Var3 = au2Var;
                            c31Var3 = c31Var2;
                            i29 = i2;
                        }
                        nx nxVar19 = nxVar7;
                        dr0Var.q();
                        dr0Var.V(1310051731);
                        objK = dr0Var.K();
                        if (objK == zy.a) {
                            objK = new ui1();
                            dr0Var.f0(objK);
                        }
                        ui1Var = (ui1) objK;
                        z10 = false;
                        dr0Var.p(false);
                        dr0Var.V(1981927842);
                        jB = xw2Var3.b();
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            zBooleanValue = ((Boolean) r(ui1Var, dr0Var, 0).getValue()).booleanValue();
                            if (!z9) {
                                j2 = au2Var3.c;
                            } else if (z8) {
                                j2 = au2Var3.d;
                            } else if (zBooleanValue) {
                                j2 = au2Var3.a;
                            } else {
                                j2 = au2Var3.b;
                            }
                            j3 = j2;
                            z10 = false;
                        }
                        dr0Var.p(z10);
                        i27 = i29;
                        ys.a(sw2.a.a(au2Var3.k), dt.N(1874034984, new ws1(rg1Var, nxVar14, z8, au2Var3, str, vp0Var, z9, xw2Var3.d(new xw2(j3, 0L, null, 0L, 0, 0L, 16777214)), c31Var3, b31Var2, z3, i27, i28, v53Var3, ui1Var, nxVar19, nxVar16, nxVar17, nxVar15, hi2Var3), dr0Var), dr0Var, 56);
                        xw2Var2 = xw2Var3;
                        au2Var2 = au2Var3;
                        z5 = z9;
                        v53Var2 = v53Var3;
                        nxVar13 = nxVar16;
                        nxVar11 = nxVar17;
                        nxVar10 = nxVar15;
                        hi2Var2 = hi2Var3;
                        z6 = z8;
                        nxVar12 = nxVar19;
                    } else {
                        dr0Var.Q();
                        z5 = z;
                        xw2Var2 = xw2Var;
                        nxVar10 = nxVar5;
                        z6 = z2;
                        b31Var2 = b31Var;
                        i27 = i2;
                        i28 = i3;
                        hi2Var2 = hi2Var;
                        au2Var2 = au2Var;
                        nxVar11 = nxVar9;
                        nxVar12 = nxVar7;
                        nxVar13 = nxVar8;
                        nxVar14 = nxVar6;
                        c31Var3 = c31Var2;
                        v53Var2 = v53Var;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: rs1
                            @Override // defpackage.zp0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = m02.A(i4 | 1);
                                int iA2 = m02.A(i5);
                                String str2 = str;
                                vp0 vp0Var2 = vp0Var;
                                rg1 rg1Var2 = rg1Var;
                                boolean z11 = z5;
                                xw2 xw2Var4 = xw2Var2;
                                nx nxVar20 = nxVar14;
                                nx nxVar21 = nxVar12;
                                nx nxVar22 = nxVar13;
                                nx nxVar23 = nxVar11;
                                nx nxVar24 = nxVar10;
                                boolean z12 = z6;
                                v53 v53Var5 = v53Var2;
                                c31 c31Var5 = c31Var3;
                                b31 b31Var3 = b31Var2;
                                boolean z13 = z3;
                                int i33 = i27;
                                boolean z14 = i28;
                                hi2 hi2Var4 = hi2Var2;
                                au2 au2Var4 = au2Var2;
                                int i34 = i6;
                                ls.h(str2, vp0Var2, rg1Var2, z11, xw2Var4, nxVar20, nxVar21, nxVar22, nxVar23, nxVar24, z12, v53Var5, c31Var5, b31Var3, z13, i33, z14 ? 1 : 0, hi2Var4, au2Var4, (dr0) obj, iA, iA2, i34);
                                return j23.a;
                            }
                        };
                    }
                }
                i24 = 221184 | i23;
                c31Var2 = c31Var;
                int i33 = i24 | 840433664;
                if ((i12 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dr0Var.N(i12 & 1, z4)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        xw2Var3 = (xw2) dr0Var.j(gw2.a);
                        if (i31 != 0) {
                            nxVar6 = null;
                        }
                        if (i8 != 0) {
                            nxVar7 = null;
                        }
                        if (i10 != 0) {
                            nxVar8 = null;
                        }
                        if (i14 != 0) {
                            nxVar9 = null;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        v53 v53Var5 = vz1.z;
                        if (i25 != 0) {
                            c31Var4 = c31.d;
                        } else {
                            c31Var4 = c31Var2;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        hi2 hi2VarA2 = mi2.a(ia2.w, dr0Var);
                        au2 au2VarL2 = c5.l(6, dr0Var);
                        nxVar15 = nxVar18;
                        nxVar16 = nxVar8;
                        v53Var3 = v53Var5;
                        nxVar14 = nxVar6;
                        hi2Var3 = hi2VarA2;
                        b31Var2 = b31.a;
                        i28 = 1;
                        z8 = z7;
                        nxVar17 = nxVar9;
                        c31Var3 = c31Var4;
                        z9 = true;
                        au2Var3 = au2VarL2;
                    } else {
                        xw2Var3 = (xw2) dr0Var.j(gw2.a);
                        if (i31 != 0) {
                            nxVar6 = null;
                        }
                        if (i8 != 0) {
                            nxVar7 = null;
                        }
                        if (i10 != 0) {
                            nxVar8 = null;
                        }
                        if (i14 != 0) {
                            nxVar9 = null;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        v53 v53Var6 = vz1.z;
                        if (i25 != 0) {
                            c31Var4 = c31.d;
                        } else {
                            c31Var4 = c31Var2;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        hi2 hi2VarA3 = mi2.a(ia2.w, dr0Var);
                        au2 au2VarL3 = c5.l(6, dr0Var);
                        nxVar15 = nxVar18;
                        nxVar16 = nxVar8;
                        v53Var3 = v53Var6;
                        nxVar14 = nxVar6;
                        hi2Var3 = hi2VarA3;
                        b31Var2 = b31.a;
                        i28 = 1;
                        z8 = z7;
                        nxVar17 = nxVar9;
                        c31Var3 = c31Var4;
                        z9 = true;
                        au2Var3 = au2VarL3;
                    }
                    nx nxVar110 = nxVar7;
                    dr0Var.q();
                    dr0Var.V(1310051731);
                    objK = dr0Var.K();
                    if (objK == zy.a) {
                        objK = new ui1();
                        dr0Var.f0(objK);
                    }
                    ui1Var = (ui1) objK;
                    z10 = false;
                    dr0Var.p(false);
                    dr0Var.V(1981927842);
                    jB = xw2Var3.b();
                    if (jB != 16) {
                        j3 = jB;
                    } else {
                        zBooleanValue = ((Boolean) r(ui1Var, dr0Var, 0).getValue()).booleanValue();
                        if (!z9) {
                            j2 = au2Var3.c;
                        } else if (z8) {
                            j2 = au2Var3.d;
                        } else if (zBooleanValue) {
                            j2 = au2Var3.a;
                        } else {
                            j2 = au2Var3.b;
                        }
                        j3 = j2;
                        z10 = false;
                    }
                    dr0Var.p(z10);
                    i27 = i29;
                    ys.a(sw2.a.a(au2Var3.k), dt.N(1874034984, new ws1(rg1Var, nxVar14, z8, au2Var3, str, vp0Var, z9, xw2Var3.d(new xw2(j3, 0L, null, 0L, 0, 0L, 16777214)), c31Var3, b31Var2, z3, i27, i28, v53Var3, ui1Var, nxVar110, nxVar16, nxVar17, nxVar15, hi2Var3), dr0Var), dr0Var, 56);
                    xw2Var2 = xw2Var3;
                    au2Var2 = au2Var3;
                    z5 = z9;
                    v53Var2 = v53Var3;
                    nxVar13 = nxVar16;
                    nxVar11 = nxVar17;
                    nxVar10 = nxVar15;
                    hi2Var2 = hi2Var3;
                    z6 = z8;
                    nxVar12 = nxVar110;
                } else {
                    dr0Var.Q();
                    z5 = z;
                    xw2Var2 = xw2Var;
                    nxVar10 = nxVar5;
                    z6 = z2;
                    b31Var2 = b31Var;
                    i27 = i2;
                    i28 = i3;
                    hi2Var2 = hi2Var;
                    au2Var2 = au2Var;
                    nxVar11 = nxVar9;
                    nxVar12 = nxVar7;
                    nxVar13 = nxVar8;
                    nxVar14 = nxVar6;
                    c31Var3 = c31Var2;
                    v53Var2 = v53Var;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: rs1
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            vp0 vp0Var2 = vp0Var;
                            rg1 rg1Var2 = rg1Var;
                            boolean z11 = z5;
                            xw2 xw2Var4 = xw2Var2;
                            nx nxVar20 = nxVar14;
                            nx nxVar21 = nxVar12;
                            nx nxVar22 = nxVar13;
                            nx nxVar23 = nxVar11;
                            nx nxVar24 = nxVar10;
                            boolean z12 = z6;
                            v53 v53Var7 = v53Var2;
                            c31 c31Var5 = c31Var3;
                            b31 b31Var3 = b31Var2;
                            boolean z13 = z3;
                            int i34 = i27;
                            boolean z14 = i28;
                            hi2 hi2Var4 = hi2Var2;
                            au2 au2Var4 = au2Var2;
                            int i35 = i6;
                            ls.h(str2, vp0Var2, rg1Var2, z11, xw2Var4, nxVar20, nxVar21, nxVar22, nxVar23, nxVar24, z12, v53Var7, c31Var5, b31Var3, z13, i34, z14 ? 1 : 0, hi2Var4, au2Var4, (dr0) obj, iA, iA2, i35);
                            return j23.a;
                        }
                    };
                }
            }
            i30 |= 12582912;
            nxVar7 = nxVar2;
            i10 = i6 & 256;
            if (i10 != 0) {
                i30 |= 100663296;
                nxVar8 = nxVar3;
            } else {
                nxVar8 = nxVar3;
                if ((i4 & 100663296) == 0) {
                    if (dr0Var.h(nxVar8)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i30 |= i11;
                }
            }
            i12 = i30 | 805306368;
            i13 = i5 | 6;
            i14 = i6 & 2048;
            if (i14 != 0) {
                i16 = i5 | 54;
                nxVar9 = nxVar4;
            } else {
                nxVar9 = nxVar4;
                if (dr0Var.h(nxVar9)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i16 = i13 | i15;
            }
            i17 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
                i20 = i17 | 384;
            } else {
                if (dr0Var.h(nxVar5)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i20 = i17 | i19;
            }
            i21 = i6 & 8192;
            if (i21 != 0) {
                i23 = i20 | 3072;
            } else {
                if (dr0Var.g(z2)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i23 = i20 | i22;
            }
            i24 = i23 | 24576;
            i25 = i6 & 32768;
            if (i25 != 0) {
                if ((i5 & 196608) == 0) {
                    c31Var2 = c31Var;
                    if (dr0Var.f(c31Var2)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i24 |= i26;
                }
                int i34 = i24 | 840433664;
                if ((i12 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dr0Var.N(i12 & 1, z4)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        xw2Var3 = (xw2) dr0Var.j(gw2.a);
                        if (i31 != 0) {
                            nxVar6 = null;
                        }
                        if (i8 != 0) {
                            nxVar7 = null;
                        }
                        if (i10 != 0) {
                            nxVar8 = null;
                        }
                        if (i14 != 0) {
                            nxVar9 = null;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        v53 v53Var7 = vz1.z;
                        if (i25 != 0) {
                            c31Var4 = c31.d;
                        } else {
                            c31Var4 = c31Var2;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        hi2 hi2VarA4 = mi2.a(ia2.w, dr0Var);
                        au2 au2VarL4 = c5.l(6, dr0Var);
                        nxVar15 = nxVar18;
                        nxVar16 = nxVar8;
                        v53Var3 = v53Var7;
                        nxVar14 = nxVar6;
                        hi2Var3 = hi2VarA4;
                        b31Var2 = b31.a;
                        i28 = 1;
                        z8 = z7;
                        nxVar17 = nxVar9;
                        c31Var3 = c31Var4;
                        z9 = true;
                        au2Var3 = au2VarL4;
                    } else {
                        xw2Var3 = (xw2) dr0Var.j(gw2.a);
                        if (i31 != 0) {
                            nxVar6 = null;
                        }
                        if (i8 != 0) {
                            nxVar7 = null;
                        }
                        if (i10 != 0) {
                            nxVar8 = null;
                        }
                        if (i14 != 0) {
                            nxVar9 = null;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        v53 v53Var8 = vz1.z;
                        if (i25 != 0) {
                            c31Var4 = c31.d;
                        } else {
                            c31Var4 = c31Var2;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        hi2 hi2VarA5 = mi2.a(ia2.w, dr0Var);
                        au2 au2VarL5 = c5.l(6, dr0Var);
                        nxVar15 = nxVar18;
                        nxVar16 = nxVar8;
                        v53Var3 = v53Var8;
                        nxVar14 = nxVar6;
                        hi2Var3 = hi2VarA5;
                        b31Var2 = b31.a;
                        i28 = 1;
                        z8 = z7;
                        nxVar17 = nxVar9;
                        c31Var3 = c31Var4;
                        z9 = true;
                        au2Var3 = au2VarL5;
                    }
                    nx nxVar111 = nxVar7;
                    dr0Var.q();
                    dr0Var.V(1310051731);
                    objK = dr0Var.K();
                    if (objK == zy.a) {
                        objK = new ui1();
                        dr0Var.f0(objK);
                    }
                    ui1Var = (ui1) objK;
                    z10 = false;
                    dr0Var.p(false);
                    dr0Var.V(1981927842);
                    jB = xw2Var3.b();
                    if (jB != 16) {
                        j3 = jB;
                    } else {
                        zBooleanValue = ((Boolean) r(ui1Var, dr0Var, 0).getValue()).booleanValue();
                        if (!z9) {
                            j2 = au2Var3.c;
                        } else if (z8) {
                            j2 = au2Var3.d;
                        } else if (zBooleanValue) {
                            j2 = au2Var3.a;
                        } else {
                            j2 = au2Var3.b;
                        }
                        j3 = j2;
                        z10 = false;
                    }
                    dr0Var.p(z10);
                    i27 = i29;
                    ys.a(sw2.a.a(au2Var3.k), dt.N(1874034984, new ws1(rg1Var, nxVar14, z8, au2Var3, str, vp0Var, z9, xw2Var3.d(new xw2(j3, 0L, null, 0L, 0, 0L, 16777214)), c31Var3, b31Var2, z3, i27, i28, v53Var3, ui1Var, nxVar111, nxVar16, nxVar17, nxVar15, hi2Var3), dr0Var), dr0Var, 56);
                    xw2Var2 = xw2Var3;
                    au2Var2 = au2Var3;
                    z5 = z9;
                    v53Var2 = v53Var3;
                    nxVar13 = nxVar16;
                    nxVar11 = nxVar17;
                    nxVar10 = nxVar15;
                    hi2Var2 = hi2Var3;
                    z6 = z8;
                    nxVar12 = nxVar111;
                } else {
                    dr0Var.Q();
                    z5 = z;
                    xw2Var2 = xw2Var;
                    nxVar10 = nxVar5;
                    z6 = z2;
                    b31Var2 = b31Var;
                    i27 = i2;
                    i28 = i3;
                    hi2Var2 = hi2Var;
                    au2Var2 = au2Var;
                    nxVar11 = nxVar9;
                    nxVar12 = nxVar7;
                    nxVar13 = nxVar8;
                    nxVar14 = nxVar6;
                    c31Var3 = c31Var2;
                    v53Var2 = v53Var;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: rs1
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            vp0 vp0Var2 = vp0Var;
                            rg1 rg1Var2 = rg1Var;
                            boolean z11 = z5;
                            xw2 xw2Var4 = xw2Var2;
                            nx nxVar20 = nxVar14;
                            nx nxVar21 = nxVar12;
                            nx nxVar22 = nxVar13;
                            nx nxVar23 = nxVar11;
                            nx nxVar24 = nxVar10;
                            boolean z12 = z6;
                            v53 v53Var9 = v53Var2;
                            c31 c31Var5 = c31Var3;
                            b31 b31Var3 = b31Var2;
                            boolean z13 = z3;
                            int i35 = i27;
                            boolean z14 = i28;
                            hi2 hi2Var4 = hi2Var2;
                            au2 au2Var4 = au2Var2;
                            int i36 = i6;
                            ls.h(str2, vp0Var2, rg1Var2, z11, xw2Var4, nxVar20, nxVar21, nxVar22, nxVar23, nxVar24, z12, v53Var9, c31Var5, b31Var3, z13, i35, z14 ? 1 : 0, hi2Var4, au2Var4, (dr0) obj, iA, iA2, i36);
                            return j23.a;
                        }
                    };
                }
            }
            i24 = 221184 | i23;
            c31Var2 = c31Var;
            int i35 = i24 | 840433664;
            if ((i12 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dr0Var.N(i12 & 1, z4)) {
                dr0Var.S();
                if ((i4 & 1) != 0) {
                    xw2Var3 = (xw2) dr0Var.j(gw2.a);
                    if (i31 != 0) {
                        nxVar6 = null;
                    }
                    if (i8 != 0) {
                        nxVar7 = null;
                    }
                    if (i10 != 0) {
                        nxVar8 = null;
                    }
                    if (i14 != 0) {
                        nxVar9 = null;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    v53 v53Var9 = vz1.z;
                    if (i25 != 0) {
                        c31Var4 = c31.d;
                    } else {
                        c31Var4 = c31Var2;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    hi2 hi2VarA6 = mi2.a(ia2.w, dr0Var);
                    au2 au2VarL6 = c5.l(6, dr0Var);
                    nxVar15 = nxVar18;
                    nxVar16 = nxVar8;
                    v53Var3 = v53Var9;
                    nxVar14 = nxVar6;
                    hi2Var3 = hi2VarA6;
                    b31Var2 = b31.a;
                    i28 = 1;
                    z8 = z7;
                    nxVar17 = nxVar9;
                    c31Var3 = c31Var4;
                    z9 = true;
                    au2Var3 = au2VarL6;
                } else {
                    xw2Var3 = (xw2) dr0Var.j(gw2.a);
                    if (i31 != 0) {
                        nxVar6 = null;
                    }
                    if (i8 != 0) {
                        nxVar7 = null;
                    }
                    if (i10 != 0) {
                        nxVar8 = null;
                    }
                    if (i14 != 0) {
                        nxVar9 = null;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    v53 v53Var10 = vz1.z;
                    if (i25 != 0) {
                        c31Var4 = c31.d;
                    } else {
                        c31Var4 = c31Var2;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    hi2 hi2VarA7 = mi2.a(ia2.w, dr0Var);
                    au2 au2VarL7 = c5.l(6, dr0Var);
                    nxVar15 = nxVar18;
                    nxVar16 = nxVar8;
                    v53Var3 = v53Var10;
                    nxVar14 = nxVar6;
                    hi2Var3 = hi2VarA7;
                    b31Var2 = b31.a;
                    i28 = 1;
                    z8 = z7;
                    nxVar17 = nxVar9;
                    c31Var3 = c31Var4;
                    z9 = true;
                    au2Var3 = au2VarL7;
                }
                nx nxVar112 = nxVar7;
                dr0Var.q();
                dr0Var.V(1310051731);
                objK = dr0Var.K();
                if (objK == zy.a) {
                    objK = new ui1();
                    dr0Var.f0(objK);
                }
                ui1Var = (ui1) objK;
                z10 = false;
                dr0Var.p(false);
                dr0Var.V(1981927842);
                jB = xw2Var3.b();
                if (jB != 16) {
                    j3 = jB;
                } else {
                    zBooleanValue = ((Boolean) r(ui1Var, dr0Var, 0).getValue()).booleanValue();
                    if (!z9) {
                        j2 = au2Var3.c;
                    } else if (z8) {
                        j2 = au2Var3.d;
                    } else if (zBooleanValue) {
                        j2 = au2Var3.a;
                    } else {
                        j2 = au2Var3.b;
                    }
                    j3 = j2;
                    z10 = false;
                }
                dr0Var.p(z10);
                i27 = i29;
                ys.a(sw2.a.a(au2Var3.k), dt.N(1874034984, new ws1(rg1Var, nxVar14, z8, au2Var3, str, vp0Var, z9, xw2Var3.d(new xw2(j3, 0L, null, 0L, 0, 0L, 16777214)), c31Var3, b31Var2, z3, i27, i28, v53Var3, ui1Var, nxVar112, nxVar16, nxVar17, nxVar15, hi2Var3), dr0Var), dr0Var, 56);
                xw2Var2 = xw2Var3;
                au2Var2 = au2Var3;
                z5 = z9;
                v53Var2 = v53Var3;
                nxVar13 = nxVar16;
                nxVar11 = nxVar17;
                nxVar10 = nxVar15;
                hi2Var2 = hi2Var3;
                z6 = z8;
                nxVar12 = nxVar112;
            } else {
                dr0Var.Q();
                z5 = z;
                xw2Var2 = xw2Var;
                nxVar10 = nxVar5;
                z6 = z2;
                b31Var2 = b31Var;
                i27 = i2;
                i28 = i3;
                hi2Var2 = hi2Var;
                au2Var2 = au2Var;
                nxVar11 = nxVar9;
                nxVar12 = nxVar7;
                nxVar13 = nxVar8;
                nxVar14 = nxVar6;
                c31Var3 = c31Var2;
                v53Var2 = v53Var;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: rs1
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = m02.A(i4 | 1);
                        int iA2 = m02.A(i5);
                        String str2 = str;
                        vp0 vp0Var2 = vp0Var;
                        rg1 rg1Var2 = rg1Var;
                        boolean z11 = z5;
                        xw2 xw2Var4 = xw2Var2;
                        nx nxVar20 = nxVar14;
                        nx nxVar21 = nxVar12;
                        nx nxVar22 = nxVar13;
                        nx nxVar23 = nxVar11;
                        nx nxVar24 = nxVar10;
                        boolean z12 = z6;
                        v53 v53Var11 = v53Var2;
                        c31 c31Var5 = c31Var3;
                        b31 b31Var3 = b31Var2;
                        boolean z13 = z3;
                        int i36 = i27;
                        boolean z14 = i28;
                        hi2 hi2Var4 = hi2Var2;
                        au2 au2Var4 = au2Var2;
                        int i37 = i6;
                        ls.h(str2, vp0Var2, rg1Var2, z11, xw2Var4, nxVar20, nxVar21, nxVar22, nxVar23, nxVar24, z12, v53Var11, c31Var5, b31Var3, z13, i36, z14 ? 1 : 0, hi2Var4, au2Var4, (dr0) obj, iA, iA2, i37);
                        return j23.a;
                    }
                };
            }
        }
        i30 |= 1572864;
        nxVar6 = nxVar;
        i8 = i6 & 128;
        if (i8 != 0) {
            if ((12582912 & i4) == 0) {
                nxVar7 = nxVar2;
                if (dr0Var.h(nxVar7)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i30 |= i9;
            }
            i10 = i6 & 256;
            if (i10 != 0) {
                i30 |= 100663296;
                nxVar8 = nxVar3;
            } else {
                nxVar8 = nxVar3;
                if ((i4 & 100663296) == 0) {
                    if (dr0Var.h(nxVar8)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i30 |= i11;
                }
            }
            i12 = i30 | 805306368;
            i13 = i5 | 6;
            i14 = i6 & 2048;
            if (i14 != 0) {
                i16 = i5 | 54;
                nxVar9 = nxVar4;
            } else {
                nxVar9 = nxVar4;
                if (dr0Var.h(nxVar9)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i16 = i13 | i15;
            }
            i17 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
                i20 = i17 | 384;
            } else {
                if (dr0Var.h(nxVar5)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i20 = i17 | i19;
            }
            i21 = i6 & 8192;
            if (i21 != 0) {
                i23 = i20 | 3072;
            } else {
                if (dr0Var.g(z2)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i23 = i20 | i22;
            }
            i24 = i23 | 24576;
            i25 = i6 & 32768;
            if (i25 != 0) {
                if ((i5 & 196608) == 0) {
                    c31Var2 = c31Var;
                    if (dr0Var.f(c31Var2)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i24 |= i26;
                }
                int i36 = i24 | 840433664;
                if ((i12 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dr0Var.N(i12 & 1, z4)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        xw2Var3 = (xw2) dr0Var.j(gw2.a);
                        if (i31 != 0) {
                            nxVar6 = null;
                        }
                        if (i8 != 0) {
                            nxVar7 = null;
                        }
                        if (i10 != 0) {
                            nxVar8 = null;
                        }
                        if (i14 != 0) {
                            nxVar9 = null;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        v53 v53Var11 = vz1.z;
                        if (i25 != 0) {
                            c31Var4 = c31.d;
                        } else {
                            c31Var4 = c31Var2;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        hi2 hi2VarA8 = mi2.a(ia2.w, dr0Var);
                        au2 au2VarL8 = c5.l(6, dr0Var);
                        nxVar15 = nxVar18;
                        nxVar16 = nxVar8;
                        v53Var3 = v53Var11;
                        nxVar14 = nxVar6;
                        hi2Var3 = hi2VarA8;
                        b31Var2 = b31.a;
                        i28 = 1;
                        z8 = z7;
                        nxVar17 = nxVar9;
                        c31Var3 = c31Var4;
                        z9 = true;
                        au2Var3 = au2VarL8;
                    } else {
                        xw2Var3 = (xw2) dr0Var.j(gw2.a);
                        if (i31 != 0) {
                            nxVar6 = null;
                        }
                        if (i8 != 0) {
                            nxVar7 = null;
                        }
                        if (i10 != 0) {
                            nxVar8 = null;
                        }
                        if (i14 != 0) {
                            nxVar9 = null;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        v53 v53Var12 = vz1.z;
                        if (i25 != 0) {
                            c31Var4 = c31.d;
                        } else {
                            c31Var4 = c31Var2;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        hi2 hi2VarA9 = mi2.a(ia2.w, dr0Var);
                        au2 au2VarL9 = c5.l(6, dr0Var);
                        nxVar15 = nxVar18;
                        nxVar16 = nxVar8;
                        v53Var3 = v53Var12;
                        nxVar14 = nxVar6;
                        hi2Var3 = hi2VarA9;
                        b31Var2 = b31.a;
                        i28 = 1;
                        z8 = z7;
                        nxVar17 = nxVar9;
                        c31Var3 = c31Var4;
                        z9 = true;
                        au2Var3 = au2VarL9;
                    }
                    nx nxVar113 = nxVar7;
                    dr0Var.q();
                    dr0Var.V(1310051731);
                    objK = dr0Var.K();
                    if (objK == zy.a) {
                        objK = new ui1();
                        dr0Var.f0(objK);
                    }
                    ui1Var = (ui1) objK;
                    z10 = false;
                    dr0Var.p(false);
                    dr0Var.V(1981927842);
                    jB = xw2Var3.b();
                    if (jB != 16) {
                        j3 = jB;
                    } else {
                        zBooleanValue = ((Boolean) r(ui1Var, dr0Var, 0).getValue()).booleanValue();
                        if (!z9) {
                            j2 = au2Var3.c;
                        } else if (z8) {
                            j2 = au2Var3.d;
                        } else if (zBooleanValue) {
                            j2 = au2Var3.a;
                        } else {
                            j2 = au2Var3.b;
                        }
                        j3 = j2;
                        z10 = false;
                    }
                    dr0Var.p(z10);
                    i27 = i29;
                    ys.a(sw2.a.a(au2Var3.k), dt.N(1874034984, new ws1(rg1Var, nxVar14, z8, au2Var3, str, vp0Var, z9, xw2Var3.d(new xw2(j3, 0L, null, 0L, 0, 0L, 16777214)), c31Var3, b31Var2, z3, i27, i28, v53Var3, ui1Var, nxVar113, nxVar16, nxVar17, nxVar15, hi2Var3), dr0Var), dr0Var, 56);
                    xw2Var2 = xw2Var3;
                    au2Var2 = au2Var3;
                    z5 = z9;
                    v53Var2 = v53Var3;
                    nxVar13 = nxVar16;
                    nxVar11 = nxVar17;
                    nxVar10 = nxVar15;
                    hi2Var2 = hi2Var3;
                    z6 = z8;
                    nxVar12 = nxVar113;
                } else {
                    dr0Var.Q();
                    z5 = z;
                    xw2Var2 = xw2Var;
                    nxVar10 = nxVar5;
                    z6 = z2;
                    b31Var2 = b31Var;
                    i27 = i2;
                    i28 = i3;
                    hi2Var2 = hi2Var;
                    au2Var2 = au2Var;
                    nxVar11 = nxVar9;
                    nxVar12 = nxVar7;
                    nxVar13 = nxVar8;
                    nxVar14 = nxVar6;
                    c31Var3 = c31Var2;
                    v53Var2 = v53Var;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: rs1
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            vp0 vp0Var2 = vp0Var;
                            rg1 rg1Var2 = rg1Var;
                            boolean z11 = z5;
                            xw2 xw2Var4 = xw2Var2;
                            nx nxVar20 = nxVar14;
                            nx nxVar21 = nxVar12;
                            nx nxVar22 = nxVar13;
                            nx nxVar23 = nxVar11;
                            nx nxVar24 = nxVar10;
                            boolean z12 = z6;
                            v53 v53Var13 = v53Var2;
                            c31 c31Var5 = c31Var3;
                            b31 b31Var3 = b31Var2;
                            boolean z13 = z3;
                            int i37 = i27;
                            boolean z14 = i28;
                            hi2 hi2Var4 = hi2Var2;
                            au2 au2Var4 = au2Var2;
                            int i38 = i6;
                            ls.h(str2, vp0Var2, rg1Var2, z11, xw2Var4, nxVar20, nxVar21, nxVar22, nxVar23, nxVar24, z12, v53Var13, c31Var5, b31Var3, z13, i37, z14 ? 1 : 0, hi2Var4, au2Var4, (dr0) obj, iA, iA2, i38);
                            return j23.a;
                        }
                    };
                }
            }
            i24 = 221184 | i23;
            c31Var2 = c31Var;
            int i37 = i24 | 840433664;
            if ((i12 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dr0Var.N(i12 & 1, z4)) {
                dr0Var.S();
                if ((i4 & 1) != 0) {
                    xw2Var3 = (xw2) dr0Var.j(gw2.a);
                    if (i31 != 0) {
                        nxVar6 = null;
                    }
                    if (i8 != 0) {
                        nxVar7 = null;
                    }
                    if (i10 != 0) {
                        nxVar8 = null;
                    }
                    if (i14 != 0) {
                        nxVar9 = null;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    v53 v53Var13 = vz1.z;
                    if (i25 != 0) {
                        c31Var4 = c31.d;
                    } else {
                        c31Var4 = c31Var2;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    hi2 hi2VarA10 = mi2.a(ia2.w, dr0Var);
                    au2 au2VarL10 = c5.l(6, dr0Var);
                    nxVar15 = nxVar18;
                    nxVar16 = nxVar8;
                    v53Var3 = v53Var13;
                    nxVar14 = nxVar6;
                    hi2Var3 = hi2VarA10;
                    b31Var2 = b31.a;
                    i28 = 1;
                    z8 = z7;
                    nxVar17 = nxVar9;
                    c31Var3 = c31Var4;
                    z9 = true;
                    au2Var3 = au2VarL10;
                } else {
                    xw2Var3 = (xw2) dr0Var.j(gw2.a);
                    if (i31 != 0) {
                        nxVar6 = null;
                    }
                    if (i8 != 0) {
                        nxVar7 = null;
                    }
                    if (i10 != 0) {
                        nxVar8 = null;
                    }
                    if (i14 != 0) {
                        nxVar9 = null;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    v53 v53Var14 = vz1.z;
                    if (i25 != 0) {
                        c31Var4 = c31.d;
                    } else {
                        c31Var4 = c31Var2;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    hi2 hi2VarA11 = mi2.a(ia2.w, dr0Var);
                    au2 au2VarL11 = c5.l(6, dr0Var);
                    nxVar15 = nxVar18;
                    nxVar16 = nxVar8;
                    v53Var3 = v53Var14;
                    nxVar14 = nxVar6;
                    hi2Var3 = hi2VarA11;
                    b31Var2 = b31.a;
                    i28 = 1;
                    z8 = z7;
                    nxVar17 = nxVar9;
                    c31Var3 = c31Var4;
                    z9 = true;
                    au2Var3 = au2VarL11;
                }
                nx nxVar114 = nxVar7;
                dr0Var.q();
                dr0Var.V(1310051731);
                objK = dr0Var.K();
                if (objK == zy.a) {
                    objK = new ui1();
                    dr0Var.f0(objK);
                }
                ui1Var = (ui1) objK;
                z10 = false;
                dr0Var.p(false);
                dr0Var.V(1981927842);
                jB = xw2Var3.b();
                if (jB != 16) {
                    j3 = jB;
                } else {
                    zBooleanValue = ((Boolean) r(ui1Var, dr0Var, 0).getValue()).booleanValue();
                    if (!z9) {
                        j2 = au2Var3.c;
                    } else if (z8) {
                        j2 = au2Var3.d;
                    } else if (zBooleanValue) {
                        j2 = au2Var3.a;
                    } else {
                        j2 = au2Var3.b;
                    }
                    j3 = j2;
                    z10 = false;
                }
                dr0Var.p(z10);
                i27 = i29;
                ys.a(sw2.a.a(au2Var3.k), dt.N(1874034984, new ws1(rg1Var, nxVar14, z8, au2Var3, str, vp0Var, z9, xw2Var3.d(new xw2(j3, 0L, null, 0L, 0, 0L, 16777214)), c31Var3, b31Var2, z3, i27, i28, v53Var3, ui1Var, nxVar114, nxVar16, nxVar17, nxVar15, hi2Var3), dr0Var), dr0Var, 56);
                xw2Var2 = xw2Var3;
                au2Var2 = au2Var3;
                z5 = z9;
                v53Var2 = v53Var3;
                nxVar13 = nxVar16;
                nxVar11 = nxVar17;
                nxVar10 = nxVar15;
                hi2Var2 = hi2Var3;
                z6 = z8;
                nxVar12 = nxVar114;
            } else {
                dr0Var.Q();
                z5 = z;
                xw2Var2 = xw2Var;
                nxVar10 = nxVar5;
                z6 = z2;
                b31Var2 = b31Var;
                i27 = i2;
                i28 = i3;
                hi2Var2 = hi2Var;
                au2Var2 = au2Var;
                nxVar11 = nxVar9;
                nxVar12 = nxVar7;
                nxVar13 = nxVar8;
                nxVar14 = nxVar6;
                c31Var3 = c31Var2;
                v53Var2 = v53Var;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: rs1
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = m02.A(i4 | 1);
                        int iA2 = m02.A(i5);
                        String str2 = str;
                        vp0 vp0Var2 = vp0Var;
                        rg1 rg1Var2 = rg1Var;
                        boolean z11 = z5;
                        xw2 xw2Var4 = xw2Var2;
                        nx nxVar20 = nxVar14;
                        nx nxVar21 = nxVar12;
                        nx nxVar22 = nxVar13;
                        nx nxVar23 = nxVar11;
                        nx nxVar24 = nxVar10;
                        boolean z12 = z6;
                        v53 v53Var15 = v53Var2;
                        c31 c31Var5 = c31Var3;
                        b31 b31Var3 = b31Var2;
                        boolean z13 = z3;
                        int i38 = i27;
                        boolean z14 = i28;
                        hi2 hi2Var4 = hi2Var2;
                        au2 au2Var4 = au2Var2;
                        int i39 = i6;
                        ls.h(str2, vp0Var2, rg1Var2, z11, xw2Var4, nxVar20, nxVar21, nxVar22, nxVar23, nxVar24, z12, v53Var15, c31Var5, b31Var3, z13, i38, z14 ? 1 : 0, hi2Var4, au2Var4, (dr0) obj, iA, iA2, i39);
                        return j23.a;
                    }
                };
            }
        }
        i30 |= 12582912;
        nxVar7 = nxVar2;
        i10 = i6 & 256;
        if (i10 != 0) {
            i30 |= 100663296;
            nxVar8 = nxVar3;
        } else {
            nxVar8 = nxVar3;
            if ((i4 & 100663296) == 0) {
                if (dr0Var.h(nxVar8)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i30 |= i11;
            }
        }
        i12 = i30 | 805306368;
        i13 = i5 | 6;
        i14 = i6 & 2048;
        if (i14 != 0) {
            i16 = i5 | 54;
            nxVar9 = nxVar4;
        } else {
            nxVar9 = nxVar4;
            if (dr0Var.h(nxVar9)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i16 = i13 | i15;
        }
        i17 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
            i20 = i17 | 384;
        } else {
            if (dr0Var.h(nxVar5)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i20 = i17 | i19;
        }
        i21 = i6 & 8192;
        if (i21 != 0) {
            i23 = i20 | 3072;
        } else {
            if (dr0Var.g(z2)) {
                i22 = 2048;
            } else {
                i22 = 1024;
            }
            i23 = i20 | i22;
        }
        i24 = i23 | 24576;
        i25 = i6 & 32768;
        if (i25 != 0) {
            if ((i5 & 196608) == 0) {
                c31Var2 = c31Var;
                if (dr0Var.f(c31Var2)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i24 |= i26;
            }
            int i38 = i24 | 840433664;
            if ((i12 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dr0Var.N(i12 & 1, z4)) {
                dr0Var.S();
                if ((i4 & 1) != 0) {
                    xw2Var3 = (xw2) dr0Var.j(gw2.a);
                    if (i31 != 0) {
                        nxVar6 = null;
                    }
                    if (i8 != 0) {
                        nxVar7 = null;
                    }
                    if (i10 != 0) {
                        nxVar8 = null;
                    }
                    if (i14 != 0) {
                        nxVar9 = null;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    v53 v53Var15 = vz1.z;
                    if (i25 != 0) {
                        c31Var4 = c31.d;
                    } else {
                        c31Var4 = c31Var2;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    hi2 hi2VarA12 = mi2.a(ia2.w, dr0Var);
                    au2 au2VarL12 = c5.l(6, dr0Var);
                    nxVar15 = nxVar18;
                    nxVar16 = nxVar8;
                    v53Var3 = v53Var15;
                    nxVar14 = nxVar6;
                    hi2Var3 = hi2VarA12;
                    b31Var2 = b31.a;
                    i28 = 1;
                    z8 = z7;
                    nxVar17 = nxVar9;
                    c31Var3 = c31Var4;
                    z9 = true;
                    au2Var3 = au2VarL12;
                } else {
                    xw2Var3 = (xw2) dr0Var.j(gw2.a);
                    if (i31 != 0) {
                        nxVar6 = null;
                    }
                    if (i8 != 0) {
                        nxVar7 = null;
                    }
                    if (i10 != 0) {
                        nxVar8 = null;
                    }
                    if (i14 != 0) {
                        nxVar9 = null;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    v53 v53Var16 = vz1.z;
                    if (i25 != 0) {
                        c31Var4 = c31.d;
                    } else {
                        c31Var4 = c31Var2;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    hi2 hi2VarA13 = mi2.a(ia2.w, dr0Var);
                    au2 au2VarL13 = c5.l(6, dr0Var);
                    nxVar15 = nxVar18;
                    nxVar16 = nxVar8;
                    v53Var3 = v53Var16;
                    nxVar14 = nxVar6;
                    hi2Var3 = hi2VarA13;
                    b31Var2 = b31.a;
                    i28 = 1;
                    z8 = z7;
                    nxVar17 = nxVar9;
                    c31Var3 = c31Var4;
                    z9 = true;
                    au2Var3 = au2VarL13;
                }
                nx nxVar115 = nxVar7;
                dr0Var.q();
                dr0Var.V(1310051731);
                objK = dr0Var.K();
                if (objK == zy.a) {
                    objK = new ui1();
                    dr0Var.f0(objK);
                }
                ui1Var = (ui1) objK;
                z10 = false;
                dr0Var.p(false);
                dr0Var.V(1981927842);
                jB = xw2Var3.b();
                if (jB != 16) {
                    j3 = jB;
                } else {
                    zBooleanValue = ((Boolean) r(ui1Var, dr0Var, 0).getValue()).booleanValue();
                    if (!z9) {
                        j2 = au2Var3.c;
                    } else if (z8) {
                        j2 = au2Var3.d;
                    } else if (zBooleanValue) {
                        j2 = au2Var3.a;
                    } else {
                        j2 = au2Var3.b;
                    }
                    j3 = j2;
                    z10 = false;
                }
                dr0Var.p(z10);
                i27 = i29;
                ys.a(sw2.a.a(au2Var3.k), dt.N(1874034984, new ws1(rg1Var, nxVar14, z8, au2Var3, str, vp0Var, z9, xw2Var3.d(new xw2(j3, 0L, null, 0L, 0, 0L, 16777214)), c31Var3, b31Var2, z3, i27, i28, v53Var3, ui1Var, nxVar115, nxVar16, nxVar17, nxVar15, hi2Var3), dr0Var), dr0Var, 56);
                xw2Var2 = xw2Var3;
                au2Var2 = au2Var3;
                z5 = z9;
                v53Var2 = v53Var3;
                nxVar13 = nxVar16;
                nxVar11 = nxVar17;
                nxVar10 = nxVar15;
                hi2Var2 = hi2Var3;
                z6 = z8;
                nxVar12 = nxVar115;
            } else {
                dr0Var.Q();
                z5 = z;
                xw2Var2 = xw2Var;
                nxVar10 = nxVar5;
                z6 = z2;
                b31Var2 = b31Var;
                i27 = i2;
                i28 = i3;
                hi2Var2 = hi2Var;
                au2Var2 = au2Var;
                nxVar11 = nxVar9;
                nxVar12 = nxVar7;
                nxVar13 = nxVar8;
                nxVar14 = nxVar6;
                c31Var3 = c31Var2;
                v53Var2 = v53Var;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: rs1
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = m02.A(i4 | 1);
                        int iA2 = m02.A(i5);
                        String str2 = str;
                        vp0 vp0Var2 = vp0Var;
                        rg1 rg1Var2 = rg1Var;
                        boolean z11 = z5;
                        xw2 xw2Var4 = xw2Var2;
                        nx nxVar20 = nxVar14;
                        nx nxVar21 = nxVar12;
                        nx nxVar22 = nxVar13;
                        nx nxVar23 = nxVar11;
                        nx nxVar24 = nxVar10;
                        boolean z12 = z6;
                        v53 v53Var17 = v53Var2;
                        c31 c31Var5 = c31Var3;
                        b31 b31Var3 = b31Var2;
                        boolean z13 = z3;
                        int i39 = i27;
                        boolean z14 = i28;
                        hi2 hi2Var4 = hi2Var2;
                        au2 au2Var4 = au2Var2;
                        int i310 = i6;
                        ls.h(str2, vp0Var2, rg1Var2, z11, xw2Var4, nxVar20, nxVar21, nxVar22, nxVar23, nxVar24, z12, v53Var17, c31Var5, b31Var3, z13, i39, z14 ? 1 : 0, hi2Var4, au2Var4, (dr0) obj, iA, iA2, i310);
                        return j23.a;
                    }
                };
            }
        }
        i24 = 221184 | i23;
        c31Var2 = c31Var;
        int i39 = i24 | 840433664;
        if ((i12 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (dr0Var.N(i12 & 1, z4)) {
            dr0Var.S();
            if ((i4 & 1) != 0) {
                xw2Var3 = (xw2) dr0Var.j(gw2.a);
                if (i31 != 0) {
                    nxVar6 = null;
                }
                if (i8 != 0) {
                    nxVar7 = null;
                }
                if (i10 != 0) {
                    nxVar8 = null;
                }
                if (i14 != 0) {
                    nxVar9 = null;
                }
                if (i18 == 0) {
                }
                if (i21 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                v53 v53Var17 = vz1.z;
                if (i25 != 0) {
                    c31Var4 = c31.d;
                } else {
                    c31Var4 = c31Var2;
                }
                if (z3) {
                    i29 = 1;
                } else {
                    i29 = Integer.MAX_VALUE;
                }
                hi2 hi2VarA14 = mi2.a(ia2.w, dr0Var);
                au2 au2VarL14 = c5.l(6, dr0Var);
                nxVar15 = nxVar18;
                nxVar16 = nxVar8;
                v53Var3 = v53Var17;
                nxVar14 = nxVar6;
                hi2Var3 = hi2VarA14;
                b31Var2 = b31.a;
                i28 = 1;
                z8 = z7;
                nxVar17 = nxVar9;
                c31Var3 = c31Var4;
                z9 = true;
                au2Var3 = au2VarL14;
            } else {
                xw2Var3 = (xw2) dr0Var.j(gw2.a);
                if (i31 != 0) {
                    nxVar6 = null;
                }
                if (i8 != 0) {
                    nxVar7 = null;
                }
                if (i10 != 0) {
                    nxVar8 = null;
                }
                if (i14 != 0) {
                    nxVar9 = null;
                }
                if (i18 == 0) {
                }
                if (i21 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                v53 v53Var18 = vz1.z;
                if (i25 != 0) {
                    c31Var4 = c31.d;
                } else {
                    c31Var4 = c31Var2;
                }
                if (z3) {
                    i29 = 1;
                } else {
                    i29 = Integer.MAX_VALUE;
                }
                hi2 hi2VarA15 = mi2.a(ia2.w, dr0Var);
                au2 au2VarL15 = c5.l(6, dr0Var);
                nxVar15 = nxVar18;
                nxVar16 = nxVar8;
                v53Var3 = v53Var18;
                nxVar14 = nxVar6;
                hi2Var3 = hi2VarA15;
                b31Var2 = b31.a;
                i28 = 1;
                z8 = z7;
                nxVar17 = nxVar9;
                c31Var3 = c31Var4;
                z9 = true;
                au2Var3 = au2VarL15;
            }
            nx nxVar116 = nxVar7;
            dr0Var.q();
            dr0Var.V(1310051731);
            objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new ui1();
                dr0Var.f0(objK);
            }
            ui1Var = (ui1) objK;
            z10 = false;
            dr0Var.p(false);
            dr0Var.V(1981927842);
            jB = xw2Var3.b();
            if (jB != 16) {
                j3 = jB;
            } else {
                zBooleanValue = ((Boolean) r(ui1Var, dr0Var, 0).getValue()).booleanValue();
                if (!z9) {
                    j2 = au2Var3.c;
                } else if (z8) {
                    j2 = au2Var3.d;
                } else if (zBooleanValue) {
                    j2 = au2Var3.a;
                } else {
                    j2 = au2Var3.b;
                }
                j3 = j2;
                z10 = false;
            }
            dr0Var.p(z10);
            i27 = i29;
            ys.a(sw2.a.a(au2Var3.k), dt.N(1874034984, new ws1(rg1Var, nxVar14, z8, au2Var3, str, vp0Var, z9, xw2Var3.d(new xw2(j3, 0L, null, 0L, 0, 0L, 16777214)), c31Var3, b31Var2, z3, i27, i28, v53Var3, ui1Var, nxVar116, nxVar16, nxVar17, nxVar15, hi2Var3), dr0Var), dr0Var, 56);
            xw2Var2 = xw2Var3;
            au2Var2 = au2Var3;
            z5 = z9;
            v53Var2 = v53Var3;
            nxVar13 = nxVar16;
            nxVar11 = nxVar17;
            nxVar10 = nxVar15;
            hi2Var2 = hi2Var3;
            z6 = z8;
            nxVar12 = nxVar116;
        } else {
            dr0Var.Q();
            z5 = z;
            xw2Var2 = xw2Var;
            nxVar10 = nxVar5;
            z6 = z2;
            b31Var2 = b31Var;
            i27 = i2;
            i28 = i3;
            hi2Var2 = hi2Var;
            au2Var2 = au2Var;
            nxVar11 = nxVar9;
            nxVar12 = nxVar7;
            nxVar13 = nxVar8;
            nxVar14 = nxVar6;
            c31Var3 = c31Var2;
            v53Var2 = v53Var;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: rs1
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(i4 | 1);
                    int iA2 = m02.A(i5);
                    String str2 = str;
                    vp0 vp0Var2 = vp0Var;
                    rg1 rg1Var2 = rg1Var;
                    boolean z11 = z5;
                    xw2 xw2Var4 = xw2Var2;
                    nx nxVar20 = nxVar14;
                    nx nxVar21 = nxVar12;
                    nx nxVar22 = nxVar13;
                    nx nxVar23 = nxVar11;
                    nx nxVar24 = nxVar10;
                    boolean z12 = z6;
                    v53 v53Var19 = v53Var2;
                    c31 c31Var5 = c31Var3;
                    b31 b31Var3 = b31Var2;
                    boolean z13 = z3;
                    int i310 = i27;
                    boolean z14 = i28;
                    hi2 hi2Var4 = hi2Var2;
                    au2 au2Var4 = au2Var2;
                    int i311 = i6;
                    ls.h(str2, vp0Var2, rg1Var2, z11, xw2Var4, nxVar20, nxVar21, nxVar22, nxVar23, nxVar24, z12, v53Var19, c31Var5, b31Var3, z13, i310, z14 ? 1 : 0, hi2Var4, au2Var4, (dr0) obj, iA, iA2, i311);
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0279  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:175:0x02df  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:179:0x0318  */
    /* JADX WARN: Code duplicated, block: B:180:0x031c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0337  */
    /* JADX WARN: Code duplicated, block: B:187:0x0353  */
    /* JADX WARN: Code duplicated, block: B:190:0x0368  */
    /* JADX WARN: Code duplicated, block: B:192:0x036e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0374  */
    /* JADX WARN: Code duplicated, block: B:197:0x037a  */
    /* JADX WARN: Code duplicated, block: B:199:0x037f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0385  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:205:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:210:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:212:0x0400  */
    /* JADX WARN: Code duplicated, block: B:214:0x0411  */
    /* JADX WARN: Code duplicated, block: B:216:0x044f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0453  */
    /* JADX WARN: Code duplicated, block: B:222:0x046e  */
    /* JADX WARN: Code duplicated, block: B:225:0x048e  */
    /* JADX WARN: Code duplicated, block: B:228:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:229:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:231:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:232:0x04af  */
    /* JADX WARN: Code duplicated, block: B:235:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:236:0x04df  */
    /* JADX WARN: Code duplicated, block: B:239:0x0511  */
    /* JADX WARN: Code duplicated, block: B:240:0x0515  */
    /* JADX WARN: Code duplicated, block: B:245:0x0530  */
    /* JADX WARN: Code duplicated, block: B:248:0x0549  */
    /* JADX WARN: Code duplicated, block: B:250:0x0554  */
    /* JADX WARN: Code duplicated, block: B:252:0x0558  */
    /* JADX WARN: Code duplicated, block: B:255:0x0561  */
    /* JADX WARN: Code duplicated, block: B:257:0x0565  */
    /* JADX WARN: Code duplicated, block: B:261:0x056e  */
    /* JADX WARN: Code duplicated, block: B:263:0x0572  */
    /* JADX WARN: Code duplicated, block: B:266:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:267:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:270:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:272:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:274:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:276:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:278:0x063b  */
    /* JADX WARN: Code duplicated, block: B:279:0x063f  */
    /* JADX WARN: Code duplicated, block: B:284:0x065a  */
    /* JADX WARN: Code duplicated, block: B:286:0x0676  */
    public static final void i(zp0 zp0Var, nx nxVar, nx nxVar2, final nx nxVar3, final nx nxVar4, final nx nxVar5, final nx nxVar6, final boolean z, final su2 su2Var, final pu2 pu2Var, final vp0 vp0Var, final nx nxVar7, nx nxVar8, final rt1 rt1Var, dr0 dr0Var, final int i2, final int i3) {
        int i4;
        boolean z2;
        int i5;
        nx nxVar9;
        zp0 zp0Var2;
        nx nxVar10;
        dr0 dr0Var2;
        nx nxVar11;
        dm dmVar;
        float f;
        dm dmVar2;
        yx yxVar;
        hg1 hg1Var;
        hg1 hg1Var2;
        boolean z3;
        zp0 zp0Var3;
        float fO;
        float fN;
        float f2;
        float f3;
        zp0 zp0Var4;
        yx yxVar2;
        dm dmVar3;
        zp0 zp0Var5;
        float f4;
        float f5;
        rg1 rg1VarJ;
        dm dmVar4;
        int iHashCode;
        dm dmVar5;
        boolean z4;
        int iHashCode2;
        Object obj;
        boolean z5;
        Object objK;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        float f6;
        int iHashCode6;
        int iHashCode7;
        dm dmVar6 = c5.m;
        dm dmVar7 = c5.i;
        dr0Var.W(753699262);
        int i6 = i2 & 6;
        og1 og1Var = og1.h;
        if (i6 == 0) {
            i4 = i2 | (dr0Var.f(og1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dr0Var.h(zp0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= dr0Var.h(nxVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dr0Var.h(nxVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dr0Var.h(nxVar3) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= dr0Var.h(nxVar4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= dr0Var.h(nxVar5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= dr0Var.h(nxVar6) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            z2 = z;
            i4 |= dr0Var.g(z2) ? 67108864 : 33554432;
        } else {
            z2 = z;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= dr0Var.f(su2Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | ((i3 & 8) == 0 ? dr0Var.f(pu2Var) : dr0Var.h(pu2Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dr0Var.h(vp0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= dr0Var.h(nxVar7) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= dr0Var.h(nxVar8) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= dr0Var.f(rt1Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        int i7 = i5;
        if (dr0Var.N(i4 & 1, ((i4 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            float f7 = ((cc0) dr0Var.j(kz0.c)).h;
            if (Float.isNaN(f7)) {
                f7 = 0.0f;
            }
            float f8 = (f7 - ie1.R) / 2.0f;
            if (f8 < 0.0f) {
                f8 = 0.0f;
            }
            int i8 = i7 & 14;
            boolean zC = ((i7 & 112) == 32) | ((i4 & 234881024) == 67108864) | ((i4 & 1879048192) == 536870912) | (i8 == 4 || ((i7 & 8) != 0 && dr0Var.f(pu2Var))) | ((i7 & 57344) == 16384) | dr0Var.c(f8);
            Object objK2 = dr0Var.K();
            yy yyVar = zy.a;
            if (zC || objK2 == yyVar) {
                dmVar = dmVar6;
                dr0Var2 = dr0Var;
                boolean z6 = z2;
                f = f8;
                at1 at1Var = new at1(vp0Var, z6, su2Var, pu2Var, rt1Var, f);
                dr0Var2.f0(at1Var);
                objK2 = at1Var;
            } else {
                dmVar = dmVar6;
                dr0Var2 = dr0Var;
                f = f8;
            }
            at1 at1Var2 = (at1) objK2;
            u31 u31Var = (u31) dr0Var2.j(uz.n);
            int iHashCode8 = Long.hashCode(dr0Var2.T);
            dx1 dx1VarL = dr0Var2.l();
            rg1 rg1VarU = U(dr0Var2, r21);
            sy.f.getClass();
            dr0Var2.Y();
            float f9 = f;
            boolean z7 = dr0Var2.S;
            jw0 jw0Var = l41.W;
            if (z7) {
                dr0Var2.k(jw0Var);
            } else {
                dr0Var2.i0();
            }
            yx yxVar3 = c5.F;
            h12.y(yxVar3, dr0Var2, at1Var2);
            yx yxVar4 = c5.E;
            h12.y(yxVar4, dr0Var2, dx1VarL);
            yx yxVar5 = c5.G;
            if (dr0Var2.S) {
                dmVar2 = r18;
            } else {
                dmVar2 = dmVar7;
                if (!uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode8))) {
                }
                yxVar = c5.D;
                h12.y(yxVar, dr0Var2, rg1VarU);
                nxVar7.f(dr0Var2, Integer.valueOf((i7 >> 6) & 14));
                hg1Var = hg1.h;
                if (nxVar3 != null) {
                    dr0Var2.V(2145628269);
                    rg1 rg1VarC = s60.w(og1Var, "Leading").c(hg1Var);
                    ze1 ze1VarC = ho.c(dmVar, false);
                    iHashCode7 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL2 = dr0Var2.l();
                    rg1 rg1VarU2 = U(dr0Var2, rg1VarC);
                    dr0Var2.Y();
                    hg1Var2 = hg1Var;
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(yxVar3, dr0Var2, ze1VarC);
                    h12.y(yxVar4, dr0Var2, dx1VarL2);
                    if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode7))) {
                        wi0.o(iHashCode7, dr0Var2, iHashCode7, yxVar5);
                    }
                    h12.y(yxVar, dr0Var2, rg1VarU2);
                    nxVar3.f(dr0Var2, Integer.valueOf((i4 >> 12) & 14));
                    dr0Var2.p(true);
                    z3 = false;
                    dr0Var2.p(false);
                } else {
                    hg1Var2 = hg1Var;
                    z3 = false;
                    dr0Var2.V(2145874285);
                    dr0Var2.p(false);
                }
                if (nxVar4 != null) {
                    dr0Var2.V(2145917003);
                    rg1 rg1VarC2 = s60.w(r21, "Trailing").c(hg1Var2);
                    ze1 ze1VarC2 = ho.c(dmVar, z3);
                    iHashCode6 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL3 = dr0Var2.l();
                    rg1 rg1VarU3 = U(dr0Var2, rg1VarC2);
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(yxVar3, dr0Var2, ze1VarC2);
                    h12.y(yxVar4, dr0Var2, dx1VarL3);
                    if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode6))) {
                        wi0.o(iHashCode6, dr0Var2, iHashCode6, yxVar5);
                    }
                    h12.y(yxVar, dr0Var2, rg1VarU3);
                    zp0Var3 = nxVar4;
                    zp0Var3.f(dr0Var2, Integer.valueOf((i4 >> 15) & 14));
                    dr0Var2.p(true);
                    dr0Var2.p(false);
                } else {
                    zp0Var3 = nxVar4;
                    dr0Var2.V(2146164941);
                    dr0Var2.p(z3);
                }
                fO = t03.o(rt1Var, u31Var);
                fN = t03.n(rt1Var, u31Var);
                if (nxVar3 != null) {
                    fO -= f9;
                    if (fO < 0.0f) {
                        fO = 0.0f;
                    }
                }
                f2 = fO;
                if (zp0Var3 != null) {
                    f6 = fN - f9;
                    if (f6 < 0.0f) {
                        f6 = 0.0f;
                    }
                    f3 = f6;
                } else {
                    f3 = fN;
                }
                if (nxVar5 != null) {
                    dr0Var2.V(2146868920);
                    rg1 rg1VarJ2 = t03.J(yj2.m(yj2.d(s60.w(r21, "Prefix"), 24.0f, 0.0f, 2)), f2, 0.0f, 2.0f, 0.0f, 10);
                    dmVar3 = dmVar2;
                    ze1 ze1VarC3 = ho.c(dmVar3, false);
                    yxVar2 = yxVar;
                    iHashCode5 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL4 = dr0Var2.l();
                    rg1 rg1VarU4 = U(dr0Var2, rg1VarJ2);
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(yxVar3, dr0Var2, ze1VarC3);
                    h12.y(yxVar4, dr0Var2, dx1VarL4);
                    if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode5))) {
                        wi0.o(iHashCode5, dr0Var2, iHashCode5, yxVar5);
                    }
                    h12.y(yxVar2, dr0Var2, rg1VarU4);
                    zp0Var4 = nxVar5;
                    zp0Var4.f(dr0Var2, Integer.valueOf((i4 >> 18) & 14));
                    dr0Var2.p(true);
                    dr0Var2.p(false);
                } else {
                    zp0Var4 = nxVar5;
                    yxVar2 = yxVar;
                    dmVar3 = dmVar2;
                    dr0Var2.V(2147196621);
                    dr0Var2.p(false);
                }
                if (nxVar6 != null) {
                    dr0Var2.V(2147239866);
                    rg1 rg1VarJ3 = t03.J(yj2.m(yj2.d(s60.w(r21, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f3, 0.0f, 10);
                    ze1 ze1VarC4 = ho.c(dmVar3, false);
                    iHashCode4 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL5 = dr0Var2.l();
                    rg1 rg1VarU5 = U(dr0Var2, rg1VarJ3);
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(yxVar3, dr0Var2, ze1VarC4);
                    h12.y(yxVar4, dr0Var2, dx1VarL5);
                    if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode4))) {
                        wi0.o(iHashCode4, dr0Var2, iHashCode4, yxVar5);
                    }
                    h12.y(yxVar2, dr0Var2, rg1VarU5);
                    zp0Var5 = nxVar6;
                    zp0Var5.f(dr0Var2, Integer.valueOf((i4 >> 21) & 14));
                    dr0Var2.p(true);
                    dr0Var2.p(false);
                } else {
                    zp0Var5 = nxVar6;
                    dr0Var2.V(-2147401651);
                    dr0Var2.p(false);
                }
                rg1 rg1VarM = yj2.m(yj2.d(r21, 24.0f, 0.0f, 2));
                if (zp0Var4 == null) {
                    f4 = f2;
                } else {
                    f4 = 0.0f;
                }
                if (zp0Var5 == null) {
                    f5 = f3;
                } else {
                    f5 = 0.0f;
                }
                rg1VarJ = t03.J(rg1VarM, f4, 0.0f, f5, 0.0f, 10);
                if (nxVar != null) {
                    dr0Var2.V(-2147031666);
                    nxVar11 = nxVar;
                    nxVar11.c(s60.w(r21, "Hint").c(rg1VarJ), dr0Var2, Integer.valueOf((i4 >> 3) & 112));
                    dr0Var2.p(false);
                } else {
                    nxVar11 = nxVar;
                    dr0Var2.V(-2146940371);
                    dr0Var2.p(false);
                }
                rg1 rg1VarC3 = s60.w(r21, "TextField").c(rg1VarJ);
                ze1 ze1VarC5 = ho.c(dmVar3, true);
                dmVar4 = dmVar3;
                iHashCode = Long.hashCode(dr0Var2.T);
                dx1 dx1VarL6 = dr0Var2.l();
                rg1 rg1VarU6 = U(dr0Var2, rg1VarC3);
                dr0Var2.Y();
                if (dr0Var2.S) {
                    dr0Var2.k(jw0Var);
                } else {
                    dr0Var2.i0();
                }
                h12.y(yxVar3, dr0Var2, ze1VarC5);
                h12.y(yxVar4, dr0Var2, dx1VarL6);
                if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode))) {
                    wi0.o(iHashCode, dr0Var2, iHashCode, yxVar5);
                }
                h12.y(yxVar2, dr0Var2, rg1VarU6);
                zp0Var2 = zp0Var;
                zp0Var2.f(dr0Var2, Integer.valueOf((i4 >> 3) & 14));
                dr0Var2.p(true);
                if (nxVar2 != null) {
                    dr0Var2.V(-2146287790);
                    if (i8 != 4) {
                        if ((i7 & 8) != 0) {
                            obj = pu2Var;
                            if (dr0Var2.h(obj)) {
                            }
                            objK = dr0Var2.K();
                            if (z5 || objK == yyVar) {
                                objK = new o9(obj, (byte) 29);
                                dr0Var2.f0(objK);
                            }
                            rg1 rg1VarC4 = s60.w(yj2.m(uz0.n(r21, new kw0(objK, (byte) 8))), "Label").c(r21);
                            dmVar5 = dmVar4;
                            ze1 ze1VarC6 = ho.c(dmVar5, false);
                            iHashCode3 = Long.hashCode(dr0Var2.T);
                            dx1 dx1VarL7 = dr0Var2.l();
                            rg1 rg1VarU7 = U(dr0Var2, rg1VarC4);
                            dr0Var2.Y();
                            if (dr0Var2.S) {
                                dr0Var2.k(jw0Var);
                            } else {
                                dr0Var2.i0();
                            }
                            h12.y(yxVar3, dr0Var2, ze1VarC6);
                            h12.y(yxVar4, dr0Var2, dx1VarL7);
                            if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode3))) {
                                wi0.o(iHashCode3, dr0Var2, iHashCode3, yxVar5);
                            }
                            h12.y(yxVar2, dr0Var2, rg1VarU7);
                            nxVar10 = nxVar2;
                            nxVar10.f(dr0Var2, Integer.valueOf((i4 >> 9) & 14));
                            dr0Var2.p(true);
                            dr0Var2.p(false);
                        } else {
                            obj = pu2Var;
                        }
                        z5 = false;
                        objK = dr0Var2.K();
                        if (z5) {
                            objK = new o9(obj, (byte) 29);
                            dr0Var2.f0(objK);
                        } else {
                            objK = new o9(obj, (byte) 29);
                            dr0Var2.f0(objK);
                        }
                        rg1 rg1VarC5 = s60.w(yj2.m(uz0.n(r21, new kw0(objK, (byte) 8))), "Label").c(r21);
                        dmVar5 = dmVar4;
                        ze1 ze1VarC7 = ho.c(dmVar5, false);
                        iHashCode3 = Long.hashCode(dr0Var2.T);
                        dx1 dx1VarL8 = dr0Var2.l();
                        rg1 rg1VarU8 = U(dr0Var2, rg1VarC5);
                        dr0Var2.Y();
                        if (dr0Var2.S) {
                            dr0Var2.k(jw0Var);
                        } else {
                            dr0Var2.i0();
                        }
                        h12.y(yxVar3, dr0Var2, ze1VarC7);
                        h12.y(yxVar4, dr0Var2, dx1VarL8);
                        if (dr0Var2.S) {
                            wi0.o(iHashCode3, dr0Var2, iHashCode3, yxVar5);
                        } else {
                            wi0.o(iHashCode3, dr0Var2, iHashCode3, yxVar5);
                        }
                        h12.y(yxVar2, dr0Var2, rg1VarU8);
                        nxVar10 = nxVar2;
                        nxVar10.f(dr0Var2, Integer.valueOf((i4 >> 9) & 14));
                        dr0Var2.p(true);
                        dr0Var2.p(false);
                    } else {
                        obj = pu2Var;
                    }
                    z5 = true;
                    objK = dr0Var2.K();
                    if (z5) {
                        objK = new o9(obj, (byte) 29);
                        dr0Var2.f0(objK);
                    } else {
                        objK = new o9(obj, (byte) 29);
                        dr0Var2.f0(objK);
                    }
                    rg1 rg1VarC6 = s60.w(yj2.m(uz0.n(r21, new kw0(objK, (byte) 8))), "Label").c(r21);
                    dmVar5 = dmVar4;
                    ze1 ze1VarC8 = ho.c(dmVar5, false);
                    iHashCode3 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL9 = dr0Var2.l();
                    rg1 rg1VarU9 = U(dr0Var2, rg1VarC6);
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(yxVar3, dr0Var2, ze1VarC8);
                    h12.y(yxVar4, dr0Var2, dx1VarL9);
                    if (dr0Var2.S) {
                        wi0.o(iHashCode3, dr0Var2, iHashCode3, yxVar5);
                    } else {
                        wi0.o(iHashCode3, dr0Var2, iHashCode3, yxVar5);
                    }
                    h12.y(yxVar2, dr0Var2, rg1VarU9);
                    nxVar10 = nxVar2;
                    nxVar10.f(dr0Var2, Integer.valueOf((i4 >> 9) & 14));
                    dr0Var2.p(true);
                    dr0Var2.p(false);
                } else {
                    nxVar10 = nxVar2;
                    dmVar5 = dmVar4;
                    dr0Var2.V(-2145892819);
                    dr0Var2.p(false);
                }
                if (nxVar8 != null) {
                    dr0Var2.V(-2145844304);
                    rg1 rg1VarF = t03.F(yj2.m(yj2.d(s60.w(r21, "Supporting"), 16.0f, 0.0f, 2)), new rt1(16.0f, 4.0f, 16.0f, 0.0f));
                    ze1 ze1VarC9 = ho.c(dmVar5, false);
                    iHashCode2 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL10 = dr0Var2.l();
                    rg1 rg1VarU10 = U(dr0Var2, rg1VarF);
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(yxVar3, dr0Var2, ze1VarC9);
                    h12.y(yxVar4, dr0Var2, dx1VarL10);
                    if (dr0Var2.S || !uz0.g(dr0Var2.K(), Integer.valueOf(iHashCode2))) {
                        wi0.o(iHashCode2, dr0Var2, iHashCode2, yxVar5);
                    }
                    h12.y(yxVar2, dr0Var2, rg1VarU10);
                    nxVar9 = nxVar8;
                    nxVar9.f(dr0Var2, Integer.valueOf((i7 >> 9) & 14));
                    z4 = true;
                    dr0Var2.p(true);
                    dr0Var2.p(false);
                } else {
                    nxVar9 = nxVar8;
                    z4 = true;
                    dr0Var2.V(-2145508915);
                    dr0Var2.p(false);
                }
                dr0Var2.p(z4);
            }
            wi0.o(iHashCode8, dr0Var2, iHashCode8, yxVar5);
            yxVar = c5.D;
            h12.y(yxVar, dr0Var2, rg1VarU);
            nxVar7.f(dr0Var2, Integer.valueOf((i7 >> 6) & 14));
            hg1Var = hg1.h;
            if (nxVar3 != null) {
                dr0Var2.V(2145628269);
                rg1 rg1VarC7 = s60.w(og1Var, "Leading").c(hg1Var);
                ze1 ze1VarC10 = ho.c(dmVar, false);
                iHashCode7 = Long.hashCode(dr0Var2.T);
                dx1 dx1VarL11 = dr0Var2.l();
                rg1 rg1VarU11 = U(dr0Var2, rg1VarC7);
                dr0Var2.Y();
                hg1Var2 = hg1Var;
                if (dr0Var2.S) {
                    dr0Var2.k(jw0Var);
                } else {
                    dr0Var2.i0();
                }
                h12.y(yxVar3, dr0Var2, ze1VarC10);
                h12.y(yxVar4, dr0Var2, dx1VarL11);
                if (dr0Var2.S) {
                    wi0.o(iHashCode7, dr0Var2, iHashCode7, yxVar5);
                } else {
                    wi0.o(iHashCode7, dr0Var2, iHashCode7, yxVar5);
                }
                h12.y(yxVar, dr0Var2, rg1VarU11);
                nxVar3.f(dr0Var2, Integer.valueOf((i4 >> 12) & 14));
                dr0Var2.p(true);
                z3 = false;
                dr0Var2.p(false);
            } else {
                hg1Var2 = hg1Var;
                z3 = false;
                dr0Var2.V(2145874285);
                dr0Var2.p(false);
            }
            if (nxVar4 != null) {
                dr0Var2.V(2145917003);
                rg1 rg1VarC8 = s60.w(r21, "Trailing").c(hg1Var2);
                ze1 ze1VarC11 = ho.c(dmVar, z3);
                iHashCode6 = Long.hashCode(dr0Var2.T);
                dx1 dx1VarL12 = dr0Var2.l();
                rg1 rg1VarU12 = U(dr0Var2, rg1VarC8);
                dr0Var2.Y();
                if (dr0Var2.S) {
                    dr0Var2.k(jw0Var);
                } else {
                    dr0Var2.i0();
                }
                h12.y(yxVar3, dr0Var2, ze1VarC11);
                h12.y(yxVar4, dr0Var2, dx1VarL12);
                if (dr0Var2.S) {
                    wi0.o(iHashCode6, dr0Var2, iHashCode6, yxVar5);
                } else {
                    wi0.o(iHashCode6, dr0Var2, iHashCode6, yxVar5);
                }
                h12.y(yxVar, dr0Var2, rg1VarU12);
                zp0Var3 = nxVar4;
                zp0Var3.f(dr0Var2, Integer.valueOf((i4 >> 15) & 14));
                dr0Var2.p(true);
                dr0Var2.p(false);
            } else {
                zp0Var3 = nxVar4;
                dr0Var2.V(2146164941);
                dr0Var2.p(z3);
            }
            fO = t03.o(rt1Var, u31Var);
            fN = t03.n(rt1Var, u31Var);
            if (nxVar3 != null) {
                fO -= f9;
                if (fO < 0.0f) {
                    fO = 0.0f;
                }
            }
            f2 = fO;
            if (zp0Var3 != null) {
                f6 = fN - f9;
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                f3 = f6;
            } else {
                f3 = fN;
            }
            if (nxVar5 != null) {
                dr0Var2.V(2146868920);
                rg1 rg1VarJ4 = t03.J(yj2.m(yj2.d(s60.w(r21, "Prefix"), 24.0f, 0.0f, 2)), f2, 0.0f, 2.0f, 0.0f, 10);
                dmVar3 = dmVar2;
                ze1 ze1VarC12 = ho.c(dmVar3, false);
                yxVar2 = yxVar;
                iHashCode5 = Long.hashCode(dr0Var2.T);
                dx1 dx1VarL13 = dr0Var2.l();
                rg1 rg1VarU13 = U(dr0Var2, rg1VarJ4);
                dr0Var2.Y();
                if (dr0Var2.S) {
                    dr0Var2.k(jw0Var);
                } else {
                    dr0Var2.i0();
                }
                h12.y(yxVar3, dr0Var2, ze1VarC12);
                h12.y(yxVar4, dr0Var2, dx1VarL13);
                if (dr0Var2.S) {
                    wi0.o(iHashCode5, dr0Var2, iHashCode5, yxVar5);
                } else {
                    wi0.o(iHashCode5, dr0Var2, iHashCode5, yxVar5);
                }
                h12.y(yxVar2, dr0Var2, rg1VarU13);
                zp0Var4 = nxVar5;
                zp0Var4.f(dr0Var2, Integer.valueOf((i4 >> 18) & 14));
                dr0Var2.p(true);
                dr0Var2.p(false);
            } else {
                zp0Var4 = nxVar5;
                yxVar2 = yxVar;
                dmVar3 = dmVar2;
                dr0Var2.V(2147196621);
                dr0Var2.p(false);
            }
            if (nxVar6 != null) {
                dr0Var2.V(2147239866);
                rg1 rg1VarJ5 = t03.J(yj2.m(yj2.d(s60.w(r21, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f3, 0.0f, 10);
                ze1 ze1VarC13 = ho.c(dmVar3, false);
                iHashCode4 = Long.hashCode(dr0Var2.T);
                dx1 dx1VarL14 = dr0Var2.l();
                rg1 rg1VarU14 = U(dr0Var2, rg1VarJ5);
                dr0Var2.Y();
                if (dr0Var2.S) {
                    dr0Var2.k(jw0Var);
                } else {
                    dr0Var2.i0();
                }
                h12.y(yxVar3, dr0Var2, ze1VarC13);
                h12.y(yxVar4, dr0Var2, dx1VarL14);
                if (dr0Var2.S) {
                    wi0.o(iHashCode4, dr0Var2, iHashCode4, yxVar5);
                } else {
                    wi0.o(iHashCode4, dr0Var2, iHashCode4, yxVar5);
                }
                h12.y(yxVar2, dr0Var2, rg1VarU14);
                zp0Var5 = nxVar6;
                zp0Var5.f(dr0Var2, Integer.valueOf((i4 >> 21) & 14));
                dr0Var2.p(true);
                dr0Var2.p(false);
            } else {
                zp0Var5 = nxVar6;
                dr0Var2.V(-2147401651);
                dr0Var2.p(false);
            }
            rg1 rg1VarM2 = yj2.m(yj2.d(r21, 24.0f, 0.0f, 2));
            if (zp0Var4 == null) {
                f4 = f2;
            } else {
                f4 = 0.0f;
            }
            if (zp0Var5 == null) {
                f5 = f3;
            } else {
                f5 = 0.0f;
            }
            rg1VarJ = t03.J(rg1VarM2, f4, 0.0f, f5, 0.0f, 10);
            if (nxVar != null) {
                dr0Var2.V(-2147031666);
                nxVar11 = nxVar;
                nxVar11.c(s60.w(r21, "Hint").c(rg1VarJ), dr0Var2, Integer.valueOf((i4 >> 3) & 112));
                dr0Var2.p(false);
            } else {
                nxVar11 = nxVar;
                dr0Var2.V(-2146940371);
                dr0Var2.p(false);
            }
            rg1 rg1VarC9 = s60.w(r21, "TextField").c(rg1VarJ);
            ze1 ze1VarC14 = ho.c(dmVar3, true);
            dmVar4 = dmVar3;
            iHashCode = Long.hashCode(dr0Var2.T);
            dx1 dx1VarL15 = dr0Var2.l();
            rg1 rg1VarU15 = U(dr0Var2, rg1VarC9);
            dr0Var2.Y();
            if (dr0Var2.S) {
                dr0Var2.k(jw0Var);
            } else {
                dr0Var2.i0();
            }
            h12.y(yxVar3, dr0Var2, ze1VarC14);
            h12.y(yxVar4, dr0Var2, dx1VarL15);
            if (dr0Var2.S) {
                wi0.o(iHashCode, dr0Var2, iHashCode, yxVar5);
            } else {
                wi0.o(iHashCode, dr0Var2, iHashCode, yxVar5);
            }
            h12.y(yxVar2, dr0Var2, rg1VarU15);
            zp0Var2 = zp0Var;
            zp0Var2.f(dr0Var2, Integer.valueOf((i4 >> 3) & 14));
            dr0Var2.p(true);
            if (nxVar2 != null) {
                dr0Var2.V(-2146287790);
                if (i8 != 4) {
                    if ((i7 & 8) != 0) {
                        obj = pu2Var;
                        if (dr0Var2.h(obj)) {
                        }
                        objK = dr0Var2.K();
                        if (z5) {
                            objK = new o9(obj, (byte) 29);
                            dr0Var2.f0(objK);
                        } else {
                            objK = new o9(obj, (byte) 29);
                            dr0Var2.f0(objK);
                        }
                        rg1 rg1VarC10 = s60.w(yj2.m(uz0.n(r21, new kw0(objK, (byte) 8))), "Label").c(r21);
                        dmVar5 = dmVar4;
                        ze1 ze1VarC15 = ho.c(dmVar5, false);
                        iHashCode3 = Long.hashCode(dr0Var2.T);
                        dx1 dx1VarL16 = dr0Var2.l();
                        rg1 rg1VarU16 = U(dr0Var2, rg1VarC10);
                        dr0Var2.Y();
                        if (dr0Var2.S) {
                            dr0Var2.k(jw0Var);
                        } else {
                            dr0Var2.i0();
                        }
                        h12.y(yxVar3, dr0Var2, ze1VarC15);
                        h12.y(yxVar4, dr0Var2, dx1VarL16);
                        if (dr0Var2.S) {
                            wi0.o(iHashCode3, dr0Var2, iHashCode3, yxVar5);
                        } else {
                            wi0.o(iHashCode3, dr0Var2, iHashCode3, yxVar5);
                        }
                        h12.y(yxVar2, dr0Var2, rg1VarU16);
                        nxVar10 = nxVar2;
                        nxVar10.f(dr0Var2, Integer.valueOf((i4 >> 9) & 14));
                        dr0Var2.p(true);
                        dr0Var2.p(false);
                    } else {
                        obj = pu2Var;
                    }
                    z5 = false;
                    objK = dr0Var2.K();
                    if (z5) {
                        objK = new o9(obj, (byte) 29);
                        dr0Var2.f0(objK);
                    } else {
                        objK = new o9(obj, (byte) 29);
                        dr0Var2.f0(objK);
                    }
                    rg1 rg1VarC11 = s60.w(yj2.m(uz0.n(r21, new kw0(objK, (byte) 8))), "Label").c(r21);
                    dmVar5 = dmVar4;
                    ze1 ze1VarC16 = ho.c(dmVar5, false);
                    iHashCode3 = Long.hashCode(dr0Var2.T);
                    dx1 dx1VarL17 = dr0Var2.l();
                    rg1 rg1VarU17 = U(dr0Var2, rg1VarC11);
                    dr0Var2.Y();
                    if (dr0Var2.S) {
                        dr0Var2.k(jw0Var);
                    } else {
                        dr0Var2.i0();
                    }
                    h12.y(yxVar3, dr0Var2, ze1VarC16);
                    h12.y(yxVar4, dr0Var2, dx1VarL17);
                    if (dr0Var2.S) {
                        wi0.o(iHashCode3, dr0Var2, iHashCode3, yxVar5);
                    } else {
                        wi0.o(iHashCode3, dr0Var2, iHashCode3, yxVar5);
                    }
                    h12.y(yxVar2, dr0Var2, rg1VarU17);
                    nxVar10 = nxVar2;
                    nxVar10.f(dr0Var2, Integer.valueOf((i4 >> 9) & 14));
                    dr0Var2.p(true);
                    dr0Var2.p(false);
                } else {
                    obj = pu2Var;
                }
                z5 = true;
                objK = dr0Var2.K();
                if (z5) {
                    objK = new o9(obj, (byte) 29);
                    dr0Var2.f0(objK);
                } else {
                    objK = new o9(obj, (byte) 29);
                    dr0Var2.f0(objK);
                }
                rg1 rg1VarC12 = s60.w(yj2.m(uz0.n(r21, new kw0(objK, (byte) 8))), "Label").c(r21);
                dmVar5 = dmVar4;
                ze1 ze1VarC17 = ho.c(dmVar5, false);
                iHashCode3 = Long.hashCode(dr0Var2.T);
                dx1 dx1VarL18 = dr0Var2.l();
                rg1 rg1VarU18 = U(dr0Var2, rg1VarC12);
                dr0Var2.Y();
                if (dr0Var2.S) {
                    dr0Var2.k(jw0Var);
                } else {
                    dr0Var2.i0();
                }
                h12.y(yxVar3, dr0Var2, ze1VarC17);
                h12.y(yxVar4, dr0Var2, dx1VarL18);
                if (dr0Var2.S) {
                    wi0.o(iHashCode3, dr0Var2, iHashCode3, yxVar5);
                } else {
                    wi0.o(iHashCode3, dr0Var2, iHashCode3, yxVar5);
                }
                h12.y(yxVar2, dr0Var2, rg1VarU18);
                nxVar10 = nxVar2;
                nxVar10.f(dr0Var2, Integer.valueOf((i4 >> 9) & 14));
                dr0Var2.p(true);
                dr0Var2.p(false);
            } else {
                nxVar10 = nxVar2;
                dmVar5 = dmVar4;
                dr0Var2.V(-2145892819);
                dr0Var2.p(false);
            }
            if (nxVar8 != null) {
                dr0Var2.V(-2145844304);
                rg1 rg1VarF2 = t03.F(yj2.m(yj2.d(s60.w(r21, "Supporting"), 16.0f, 0.0f, 2)), new rt1(16.0f, 4.0f, 16.0f, 0.0f));
                ze1 ze1VarC18 = ho.c(dmVar5, false);
                iHashCode2 = Long.hashCode(dr0Var2.T);
                dx1 dx1VarL19 = dr0Var2.l();
                rg1 rg1VarU19 = U(dr0Var2, rg1VarF2);
                dr0Var2.Y();
                if (dr0Var2.S) {
                    dr0Var2.k(jw0Var);
                } else {
                    dr0Var2.i0();
                }
                h12.y(yxVar3, dr0Var2, ze1VarC18);
                h12.y(yxVar4, dr0Var2, dx1VarL19);
                if (dr0Var2.S) {
                    wi0.o(iHashCode2, dr0Var2, iHashCode2, yxVar5);
                } else {
                    wi0.o(iHashCode2, dr0Var2, iHashCode2, yxVar5);
                }
                h12.y(yxVar2, dr0Var2, rg1VarU19);
                nxVar9 = nxVar8;
                nxVar9.f(dr0Var2, Integer.valueOf((i7 >> 9) & 14));
                z4 = true;
                dr0Var2.p(true);
                dr0Var2.p(false);
            } else {
                nxVar9 = nxVar8;
                z4 = true;
                dr0Var2.V(-2145508915);
                dr0Var2.p(false);
            }
            dr0Var2.p(z4);
        } else {
            nxVar9 = nxVar8;
            zp0Var2 = zp0Var;
            nxVar10 = nxVar2;
            dr0Var2 = dr0Var;
            nxVar11 = nxVar;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            final nx nxVar12 = nxVar10;
            final zp0 zp0Var6 = zp0Var2;
            final nx nxVar13 = nxVar11;
            final nx nxVar14 = nxVar9;
            e72VarR.d = new zp0() { // from class: ss1
                @Override // defpackage.zp0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = m02.A(i2 | 1);
                    int iA2 = m02.A(i3);
                    ls.i(zp0Var6, nxVar13, nxVar12, nxVar3, nxVar4, nxVar5, nxVar6, z, su2Var, pu2Var, vp0Var, nxVar7, nxVar14, rt1Var, (dr0) obj2, iA, iA2);
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0011, code lost:
    
        if (r3 <= r2) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int o(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L6
            if (r5 == 0) goto L15
            return r0
        L6:
            if (r5 != 0) goto Lb
            if (r3 > r2) goto Lf
            goto L13
        Lb:
            int r1 = r4 - r3
            if (r1 > r2) goto L1a
        Lf:
            if (r5 == 0) goto L17
            if (r3 > r2) goto L15
        L13:
            int r2 = r2 - r3
            return r2
        L15:
            int r4 = r4 - r3
            return r4
        L17:
            int r4 = r4 - r3
            if (r4 <= r2) goto L1b
        L1a:
            return r2
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls.o(int, int, int, boolean):int");
    }

    public static final int p(ad1 ad1Var, e5 e5Var) {
        ad1 ad1VarY0 = ad1Var.y0();
        if (ad1VarY0 == null) {
            ax0.b("Child of " + ad1Var + " cannot be null when calculating alignment line");
        }
        if (ad1Var.C0().a().containsKey(e5Var)) {
            Integer num = (Integer) ad1Var.C0().a().get(e5Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iH0 = ad1VarY0.h0(e5Var);
            if (iH0 != Integer.MIN_VALUE) {
                boolean z = ad1Var.u;
                boolean z2 = ad1Var.v;
                ad1VarY0.u = true;
                ad1Var.v = true;
                ad1Var.I0();
                ad1VarY0.u = z;
                ad1Var.v = z2;
                return iH0 + ((int) (e5Var instanceof mt0 ? ad1VarY0.E0() & 4294967295L : ad1VarY0.E0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final rh2 q(rh2 rh2Var, jy1 jy1Var) {
        rh2Var.getClass();
        jy1Var.getClass();
        if (!uz0.g(rh2Var.c(), uh2.i)) {
            return rh2Var.f() ? q(rh2Var.j(0), jy1Var) : rh2Var;
        }
        es.H(rh2Var);
        return rh2Var;
    }

    public static final sj1 r(hz0 hz0Var, dr0 dr0Var, int i2) {
        Object objK = dr0Var.K();
        yy yyVar = zy.a;
        if (objK == yyVar) {
            objK = rz1.x(Boolean.FALSE);
            dr0Var.f0(objK);
        }
        sj1 sj1Var = (sj1) objK;
        boolean z = (((i2 & 14) ^ 6) > 4 && dr0Var.f(hz0Var)) || (i2 & 6) == 4;
        Object objK2 = dr0Var.K();
        if (z || objK2 == yyVar) {
            objK2 = new h(hz0Var, sj1Var, null, (byte) 17);
            dr0Var.f0(objK2);
        }
        h7.J((zp0) objK2, dr0Var, hz0Var);
        return sj1Var;
    }

    public static final Object s(pk0 pk0Var, zp0 zp0Var, mq2 mq2Var) {
        int i2 = cl0.a;
        Object objA = vs.p(new ks(new bl0(zp0Var, null), pk0Var, xf0.h, -2, dp.h), 0).a(jo1.h, mq2Var);
        j23 j23Var = j23.a;
        y20 y20Var = y20.h;
        if (objA != y20Var) {
            objA = j23Var;
        }
        return objA == y20Var ? objA : j23Var;
    }

    public static rg1 t(rg1 rg1Var, aq0 aq0Var) {
        return rg1Var.c(new xy(aq0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static m10 v(m10 m10Var, m10 m10Var2, zp0 zp0Var) {
        zp0Var.getClass();
        if (zp0Var instanceof rk) {
            return ((rk) zp0Var).p(m10Var2, m10Var);
        }
        o20 o20VarE = m10Var2.e();
        return o20VarE == xf0.h ? new vz0(m10Var2, m10Var, zp0Var) : new wz0(m10Var2, o20VarE, zp0Var, m10Var);
    }

    public static final float w(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static dl1 x(gl1 gl1Var) {
        Iterator it = ph2.H(gl1Var, new de1((byte) 9)).iterator();
        if (!it.hasNext()) {
            li1.m("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (dl1) next;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class y(du duVar) {
        Class cls = duVar.a;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    public static final int z(uh1 uh1Var, long j2, v43 v43Var) {
        float f = v43Var != null ? v43Var.f() : 0.0f;
        int i2 = (int) (4294967295L & j2);
        int iE = uh1Var.e(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) < uh1Var.f(iE) - f || Float.intBitsToFloat(i2) > uh1Var.b(iE) + f) {
            return -1;
        }
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) < (-f) || Float.intBitsToFloat(i3) > uh1Var.d + f) {
            return -1;
        }
        return iE;
    }

    public abstract tm W();

    public abstract tm Y();

    public abstract tm l();

    public abstract s60 m();

    public abstract c23 u();
}
