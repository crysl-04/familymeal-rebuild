package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ys implements sh, oe1 {
    public static final r72 A(lm0 lm0Var) {
        pn1 pn1Var;
        if (lm0Var.u && (pn1Var = lm0Var.o) != null) {
            t31 t31VarD = es.D(pn1Var);
            if (!t31VarD.C()) {
                t31VarD = null;
            }
            if (t31VarD != null) {
                return lm0Var.M0(t31VarD);
            }
        }
        return r72.e;
    }

    public static final lm0 B(lm0 lm0Var) {
        boolean z = lm0Var.h.u;
        if (z) {
            if (!z) {
                ax0.b("visitChildren called on an unattached node");
            }
            uj1 uj1Var = new uj1(new qg1[16]);
            qg1 qg1Var = lm0Var.h;
            qg1 qg1Var2 = qg1Var.m;
            if (qg1Var2 == null) {
                cu.q(uj1Var, qg1Var);
            } else {
                uj1Var.b(qg1Var2);
            }
            while (true) {
                int i = uj1Var.j;
                if (i == 0) {
                    break;
                }
                qg1 qg1VarR = (qg1) uj1Var.k(i - 1);
                if ((qg1VarR.k & 1024) == 0) {
                    cu.q(uj1Var, qg1VarR);
                } else {
                    while (qg1VarR != null) {
                        if ((qg1VarR.j & 1024) != 0) {
                            uj1 uj1Var2 = null;
                            while (qg1VarR != null) {
                                if (qg1VarR instanceof lm0) {
                                    lm0 lm0Var2 = (lm0) qg1VarR;
                                    if (lm0Var2.h.u) {
                                        int iOrdinal = lm0Var2.O0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return lm0Var2;
                                        }
                                        if (iOrdinal != 3) {
                                            wg.n();
                                            return null;
                                        }
                                    }
                                } else if ((qg1VarR.j & 1024) != 0 && (qg1VarR instanceof k80)) {
                                    int i2 = 0;
                                    for (qg1 qg1Var3 = ((k80) qg1VarR).w; qg1Var3 != null; qg1Var3 = qg1Var3.m) {
                                        if ((qg1Var3.j & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                qg1VarR = qg1Var3;
                                            } else {
                                                if (uj1Var2 == null) {
                                                    uj1Var2 = new uj1(new qg1[16]);
                                                }
                                                if (qg1VarR != null) {
                                                    uj1Var2.b(qg1VarR);
                                                    qg1VarR = null;
                                                }
                                                uj1Var2.b(qg1Var3);
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                qg1VarR = cu.R(uj1Var2);
                            }
                            break;
                        }
                        qg1VarR = qg1VarR.m;
                    }
                }
            }
        }
        return null;
    }

    public static final Rect C(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i, iNextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i, i2, rect3);
        return rect3;
    }

    public static final ArrayList D(nz0 nz0Var) {
        nz0Var.getClass();
        l41 l41VarB0 = ((ad1) nz0Var).B0();
        boolean zQ = Q(l41VarB0);
        dj1 dj1Var = (dj1) l41VarB0.o();
        uj1 uj1Var = (uj1) dj1Var.i;
        ArrayList arrayList = new ArrayList(uj1Var.j);
        int i = uj1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var = (l41) dj1Var.get(i2);
            arrayList.add(zQ ? l41Var.l() : l41Var.m());
        }
        return arrayList;
    }

    public static final s01 E(o20 o20Var) {
        s01 s01Var = (s01) o20Var.m(c5.Z);
        if (s01Var != null) {
            return s01Var;
        }
        wg.h(o20Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final long F(KeyEvent keyEvent) {
        return lt.a(keyEvent.getKeyCode());
    }

    public static final int G(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static int H(int i, int i2, int i3, int[] iArr) {
        while (i < i2) {
            if (iArr[i] == i3) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final long I(long j) {
        if (j < 0) {
            yy yyVar = de0.i;
            return de0.k;
        }
        yy yyVar2 = de0.i;
        return de0.j;
    }

    public static void J(final boolean z, final int i, int i2, final double[] dArr, final int i3, final int[] iArr, final double[] dArr2, final int i4) {
        sh.n("GETRS", "n", i >= 0);
        sh.n("GETRS", "nrhs", i2 >= 0);
        int i5 = i3;
        sh.n("GETRS", "lda", i5 >= Math.max(1, i));
        sh.n("GETRS", "ldb", i4 >= Math.max(1, i));
        if (i == 0 || i2 == 0) {
            return;
        }
        if (i2 > 7) {
            double d = i;
            int iK = oe1.k(40, d, d);
            if (i2 <= iK) {
                vq0.b(z, i, dArr, i3, iArr, dArr2, i4, 0, i2);
                return;
            }
            u8 u8Var = vq0.a;
            u8Var.a = iK;
            u8Var.b(0, i2, new sb0() { // from class: uq0
                @Override // defpackage.sb0
                public final void a(int i6, int i7) {
                    vq0.b(z, i, dArr, i3, iArr, dArr2, i4, i6, i7);
                }
            });
            return;
        }
        int i6 = 0;
        while (i6 < i2) {
            int i7 = i6 * i4;
            if (z) {
                m02.o(true, true, false, i, dArr, i5, dArr2, i7);
                m02.o(false, true, true, i, dArr, i3, dArr2, i7);
                vq0.a(i, iArr, dArr2, i7, true);
            } else {
                vq0.a(i, iArr, dArr2, i7, false);
                m02.o(false, false, true, i, dArr, i3, dArr2, i7);
                m02.o(true, false, false, i, dArr, i3, dArr2, i7);
            }
            i6++;
            i5 = i3;
        }
    }

    public static void K(double[] dArr, int i, int i2, int i3, double[] dArr2, c23 c23Var) {
        if (c23Var == h32.D) {
            int i4 = i;
            if (i3 == 1) {
                while (i4 < i2) {
                    dArr[i4] = -dArr2[i4];
                    i4++;
                }
                return;
            } else {
                while (i4 < i2) {
                    dArr[i4] = -dArr2[i4];
                    i4 += i3;
                }
                return;
            }
        }
        if (c23Var instanceof rm) {
            rm rmVar = (rm) c23Var;
            double d = rmVar.h;
            f32 f32Var = rmVar.j;
            if (f32Var == h32.s) {
                int i5 = i;
                if (i3 == 1) {
                    while (i5 < i2) {
                        dArr[i5] = dArr2[i5] + d;
                        i5++;
                    }
                    return;
                } else {
                    while (i5 < i2) {
                        dArr[i5] = dArr2[i5] + d;
                        i5 += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.v) {
                r(dArr, i, i2, i3, d, dArr2);
                return;
            }
            if (f32Var == h32.A) {
                int i6 = i;
                if (i3 == 1) {
                    while (i6 < i2) {
                        dArr[i6] = Math.max(d, dArr2[i6]);
                        i6++;
                    }
                    return;
                } else {
                    while (i6 < i2) {
                        dArr[i6] = Math.max(d, dArr2[i6]);
                        i6 += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.B) {
                int i7 = i;
                if (i3 == 1) {
                    while (i7 < i2) {
                        dArr[i7] = Math.min(d, dArr2[i7]);
                        i7++;
                    }
                    return;
                } else {
                    while (i7 < i2) {
                        dArr[i7] = Math.min(d, dArr2[i7]);
                        i7 += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.C) {
                int i8 = i;
                if (i3 == 1) {
                    while (i8 < i2) {
                        dArr[i8] = dArr2[i8] * d;
                        i8++;
                    }
                    return;
                } else {
                    while (i8 < i2) {
                        dArr[i8] = dArr2[i8] * d;
                        i8 += i3;
                    }
                    return;
                }
            }
            if (f32Var == h32.I) {
                int i9 = i;
                if (i3 == 1) {
                    while (i9 < i2) {
                        dArr[i9] = d - dArr2[i9];
                        i9++;
                    }
                    return;
                } else {
                    while (i9 < i2) {
                        dArr[i9] = d - dArr2[i9];
                        i9 += i3;
                    }
                    return;
                }
            }
            int i10 = i;
            if (i3 == 1) {
                while (i10 < i2) {
                    dArr[i10] = d - dArr2[i10];
                    i10++;
                }
                return;
            } else {
                while (i10 < i2) {
                    dArr[i10] = d - dArr2[i10];
                    i10 += i3;
                }
                return;
            }
        }
        if (!(c23Var instanceof sm)) {
            int i11 = i;
            if (i3 == 1) {
                while (i11 < i2) {
                    dArr[i11] = c23Var.a(dArr2[i11]);
                    i11++;
                }
                return;
            } else {
                while (i11 < i2) {
                    dArr[i11] = c23Var.a(dArr2[i11]);
                    i11 += i3;
                }
                return;
            }
        }
        sm smVar = (sm) c23Var;
        tm tmVar = smVar.j;
        double d2 = smVar.h;
        if (tmVar == h32.s) {
            int i12 = i;
            if (i3 == 1) {
                while (i12 < i2) {
                    dArr[i12] = dArr2[i12] + d2;
                    i12++;
                }
                return;
            } else {
                while (i12 < i2) {
                    dArr[i12] = dArr2[i12] + d2;
                    i12 += i3;
                }
                return;
            }
        }
        if (tmVar == h32.v) {
            s(dArr, i, i2, i3, dArr2, d2);
            return;
        }
        if (tmVar == h32.A) {
            int i13 = i;
            if (i3 == 1) {
                while (i13 < i2) {
                    dArr[i13] = Math.max(dArr2[i13], d2);
                    i13++;
                }
                return;
            } else {
                while (i13 < i2) {
                    dArr[i13] = Math.max(dArr2[i13], d2);
                    i13 += i3;
                }
                return;
            }
        }
        if (tmVar == h32.B) {
            int i14 = i;
            if (i3 == 1) {
                while (i14 < i2) {
                    dArr[i14] = Math.min(dArr2[i14], d2);
                    i14++;
                }
                return;
            } else {
                while (i14 < i2) {
                    dArr[i14] = Math.min(dArr2[i14], d2);
                    i14 += i3;
                }
                return;
            }
        }
        if (tmVar == h32.C) {
            T(dArr, i, i2, i3, d2, dArr2);
            return;
        }
        if (tmVar == h32.I) {
            int i15 = i;
            if (i3 == 1) {
                while (i15 < i2) {
                    dArr[i15] = dArr2[i15] - d2;
                    i15++;
                }
                return;
            } else {
                while (i15 < i2) {
                    dArr[i15] = dArr2[i15] - d2;
                    i15 += i3;
                }
                return;
            }
        }
        int i16 = i;
        if (i3 == 1) {
            while (i16 < i2) {
                dArr[i16] = tmVar.c(dArr2[i16], d2);
                i16++;
            }
        } else {
            while (i16 < i2) {
                dArr[i16] = tmVar.c(dArr2[i16], d2);
                i16 += i3;
            }
        }
    }

    public static final void L(dr0 dr0Var, zp0 zp0Var) {
        zp0Var.getClass();
        t03.k(2, zp0Var);
        zp0Var.f(dr0Var, 1);
    }

    public static final jb0 M(s01 s01Var, boolean z, v01 v01Var) {
        if (s01Var instanceof z01) {
            return ((z01) s01Var).R(z, v01Var);
        }
        return s01Var.w(v01Var.m(), z, new i(1, v01Var, v01.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, (byte) 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object N(ox2 ox2Var, e01 e01Var, Throwable th, m10 m10Var) {
        vk0 vk0Var;
        if (m10Var instanceof vk0) {
            vk0Var = (vk0) m10Var;
            int i = vk0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                vk0Var.m = i - Integer.MIN_VALUE;
            } else {
                vk0Var = new vk0(m10Var);
            }
        } else {
            vk0Var = new vk0(m10Var);
        }
        Object obj = vk0Var.l;
        int i2 = vk0Var.m;
        j23 j23Var = j23.a;
        try {
            if (i2 == 0) {
                m02.y(obj);
                vk0Var.k = th;
                vk0Var.m = 1;
                e01Var.c(ox2Var, th, vk0Var);
                y20 y20Var = y20.h;
                if (j23Var == y20Var) {
                    return y20Var;
                }
            } else {
                if (i2 != 1) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = vk0Var.k;
                m02.y(obj);
            }
            return j23Var;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                vs.l(th2, th);
            }
            throw th2;
        }
    }

    public static final boolean O(o20 o20Var) {
        s01 s01Var = (s01) o20Var.m(c5.Z);
        if (s01Var != null) {
            return s01Var.b();
        }
        return true;
    }

    public static final boolean P(lm0 lm0Var) {
        l41 l41Var;
        pn1 pn1Var;
        l41 l41Var2;
        pn1 pn1Var2 = lm0Var.o;
        return (pn1Var2 == null || (l41Var = pn1Var2.B) == null || !l41Var.J() || (pn1Var = lm0Var.o) == null || (l41Var2 = pn1Var.B) == null || !l41Var2.I()) ? false : true;
    }

    public static final boolean Q(l41 l41Var) {
        int iOrdinal = l41Var.M.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            wg.n();
                            return false;
                        }
                        l41 l41VarU = l41Var.u();
                        if (l41VarU != null) {
                            return Q(l41VarU);
                        }
                        wg.m("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean R(l41 l41Var) {
        if (l41Var.o == null) {
            return false;
        }
        l41 l41VarU = l41Var.u();
        return (l41VarU != null ? l41VarU.o : null) == null || l41Var.M.b;
    }

    public static final boolean S(q02 q02Var, long j) {
        Object obj;
        List list = q02Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (y02.k(((z02) obj).a, j)) {
                break;
            }
            i++;
        }
        z02 z02Var = (z02) obj;
        if (z02Var != null && z02Var.d) {
            z = true;
        }
        return !z;
    }

    public static void T(double[] dArr, int i, int i2, int i3, double d, double[] dArr2) {
        if (i3 == 1) {
            while (i < i2) {
                dArr[i] = dArr2[i] * d;
                i++;
            }
        } else {
            while (i < i2) {
                dArr[i] = dArr2[i] * d;
                i += i3;
            }
        }
    }

    public static void U(double[] dArr, int i, int i2, int i3, double[] dArr2, double[] dArr3) {
        if (i3 == 1) {
            while (i < i2) {
                dArr[i] = dArr2[i] * dArr3[i];
                i++;
            }
        } else {
            while (i < i2) {
                dArr[i] = dArr2[i] * dArr3[i];
                i += i3;
            }
        }
    }

    public static final qg1 V(j80 j80Var, int i) {
        qg1 qg1Var = ((qg1) j80Var).h.m;
        if (qg1Var == null || (qg1Var.k & i) == 0) {
            return null;
        }
        while (qg1Var != null) {
            int i2 = qg1Var.j;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return qg1Var;
            }
            qg1Var = qg1Var.m;
        }
        return null;
    }

    public static final float W(v43 v43Var, int i) {
        return i == 2 ? v43Var.d() * 0.0069444445f : v43Var.d();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0487 -> B:151:0x05ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x05d4 -> B:148:0x05db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x05fe -> B:79:0x03d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x0664 -> B:165:0x066d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0249 -> B:31:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0315 -> B:31:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0342 -> B:72:0x03ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x039a -> B:69:0x03a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0449 -> B:85:0x03f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18541. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final java.lang.Object X(defpackage.sq2 r28, defpackage.z02 r29, defpackage.sz r30, defpackage.kw0 r31, defpackage.s r32, defpackage.qc1 r33, defpackage.p r34, defpackage.rk r35) {
        /*
            Method dump skipped, instruction units count: 1854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys.X(sq2, z02, sz, kw0, s, qc1, p, rk):java.lang.Object");
    }

    public static final Object Y(Object obj) {
        return obj instanceof mw ? m02.e(((mw) obj).a) : obj;
    }

    public static final void Z(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("Illegal index " + i + ", " + str + " expects only non-negative indices");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(i42 i42Var, zp0 zp0Var, dr0 dr0Var, int i) {
        c33 c33Var;
        boolean z;
        e72 e72VarR;
        dr0Var.W(-149765515);
        wy0 wy0Var = dr0Var.x;
        dx1 dx1VarL = dr0Var.l();
        dr0Var.T(201, ez.b);
        Object objK = dr0Var.K();
        if (uz0.g(objK, zy.a)) {
            c33Var = null;
        } else {
            objK.getClass();
            c33Var = (c33) objK;
        }
        g42 g42Var = i42Var.a;
        c33 c33VarD = g42Var.d(i42Var, c33Var);
        boolean zEquals = c33VarD.equals(c33Var);
        if (!zEquals) {
            dr0Var.f0(c33VarD);
        }
        if (!dr0Var.S) {
            dk2 dk2Var = dr0Var.G;
            Object objB = dk2Var.b(dk2Var.b, dk2Var.g);
            objB.getClass();
            dx1 dx1Var = (dx1) objB;
            if (!(dr0Var.z() && zEquals) && (i42Var.g || !dx1VarL.containsKey(g42Var))) {
                dx1VarL = dx1VarL.b(g42Var, c33VarD);
            } else if ((zEquals && !dr0Var.w) || !dr0Var.w) {
                dx1VarL = dx1Var;
            }
            if (dr0Var.y || dx1Var != dx1VarL) {
                z = true;
            }
            if (z && !dr0Var.S) {
                dr0Var.I(dx1VarL);
            }
            wy0Var.c(dr0Var.w ? 1 : 0);
            dr0Var.w = z;
            dr0Var.K = dx1VarL;
            dr0Var.R(202, 0, ez.c, dx1VarL);
            zp0Var.f(dr0Var, Integer.valueOf((i >> 3) & 14));
            dr0Var.p(false);
            dr0Var.p(false);
            dr0Var.w = wy0Var.b() != 0;
            dr0Var.K = null;
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new lx((byte) 2, i, i42Var, zp0Var);
            }
        }
        if (i42Var.g || !dx1VarL.containsKey(g42Var)) {
            dx1VarL = dx1VarL.b(g42Var, c33VarD);
        }
        dr0Var.J = true;
        z = false;
        if (z) {
            dr0Var.I(dx1VarL);
        }
        wy0Var.c(dr0Var.w ? 1 : 0);
        dr0Var.w = z;
        dr0Var.K = dx1VarL;
        dr0Var.R(202, 0, ez.c, dx1VarL);
        zp0Var.f(dr0Var, Integer.valueOf((i >> 3) & 14));
        dr0Var.p(false);
        dr0Var.p(false);
        dr0Var.w = wy0Var.b() != 0;
        dr0Var.K = null;
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new lx((byte) 2, i, i42Var, zp0Var);
        }
    }

    public static final void a0(rq rqVar, m10 m10Var, boolean z) {
        Object objM = rqVar.m();
        Throwable thF = rqVar.f(objM);
        Object d92Var = thF != null ? new d92(thF) : rqVar.h(objM);
        if (!z) {
            m10Var.g(d92Var);
            return;
        }
        m10Var.getClass();
        ta0 ta0Var = (ta0) m10Var;
        n10 n10Var = ta0Var.l;
        Object obj = ta0Var.n;
        o20 o20VarE = n10Var.e();
        Object objE = ie1.E(o20VarE, obj);
        g23 g23VarI = objE != ie1.u0 ? ou.I(n10Var, o20VarE, objE) : null;
        try {
            n10Var.g(d92Var);
            if (g23VarI == null || g23VarI.j0()) {
            }
        } finally {
            if (g23VarI == null || g23VarI.j0()) {
                ie1.v(o20VarE, objE);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(i42[] i42VarArr, zp0 zp0Var, dr0 dr0Var, int i) {
        dx1 dx1VarE0;
        boolean z;
        e72 e72VarR;
        dr0Var.W(415205898);
        wy0 wy0Var = dr0Var.x;
        dx1 dx1VarL = dr0Var.l();
        dr0Var.T(201, ez.b);
        byte b = 1;
        if (dr0Var.S) {
            dx1VarE0 = dr0Var.e0(dx1VarL, dt.V(i42VarArr, dx1VarL, dx1.k));
            dr0Var.J = true;
        } else {
            dk2 dk2Var = dr0Var.G;
            Object objH = dk2Var.h(dk2Var.g, 0);
            objH.getClass();
            dx1 dx1Var = (dx1) objH;
            dk2 dk2Var2 = dr0Var.G;
            Object objH2 = dk2Var2.h(dk2Var2.g, 1);
            objH2.getClass();
            dx1 dx1Var2 = (dx1) objH2;
            dx1 dx1VarV = dt.V(i42VarArr, dx1VarL, dx1Var2);
            if (!dr0Var.z() || dr0Var.y || !dx1Var2.equals(dx1VarV)) {
                dx1VarE0 = dr0Var.e0(dx1VarL, dx1VarV);
                if (dr0Var.y || !uz0.g(dx1VarE0, dx1Var)) {
                    z = true;
                }
                if (z && !dr0Var.S) {
                    dr0Var.I(dx1VarE0);
                }
                wy0Var.c(dr0Var.w ? 1 : 0);
                dr0Var.w = z;
                dr0Var.K = dx1VarE0;
                dr0Var.R(202, 0, ez.c, dx1VarE0);
                zp0Var.f(dr0Var, Integer.valueOf((i >> 3) & 14));
                dr0Var.p(false);
                dr0Var.p(false);
                dr0Var.w = wy0Var.b() != 0;
                dr0Var.K = null;
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new lx(b, i, i42VarArr, zp0Var);
                }
            }
            dr0Var.l = dr0Var.G.s() + dr0Var.l;
            dx1VarE0 = dx1Var;
        }
        z = false;
        if (z) {
            dr0Var.I(dx1VarE0);
        }
        wy0Var.c(dr0Var.w ? 1 : 0);
        dr0Var.w = z;
        dr0Var.K = dx1VarE0;
        dr0Var.R(202, 0, ez.c, dx1VarE0);
        zp0Var.f(dr0Var, Integer.valueOf((i >> 3) & 14));
        dr0Var.p(false);
        dr0Var.p(false);
        dr0Var.w = wy0Var.b() != 0;
        dr0Var.K = null;
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new lx(b, i, i42VarArr, zp0Var);
        }
    }

    public static final long b0(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        he0 he0Var = he0.NANOSECONDS;
        if (j4 >= 0) {
            return lt.j0(j3, he0Var);
        }
        he0 he0Var2 = he0.MILLISECONDS;
        if (he0Var.compareTo(he0Var2) >= 0) {
            return de0.g(I(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        yy yyVar = de0.i;
        return de0.e(lt.j0(j5, he0Var2), lt.j0(j6, he0Var));
    }

    public static final long c(float f, boolean z, boolean z2) {
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L);
    }

    public static void c0(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            a2.g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            a2.g(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        if (i2 <= i3) {
            i3 = i2;
            i2 = i3;
        }
        int length = charSequence.length();
        if (i3 < 0 || i2 > length) {
            d0(editorInfo, null, 0, 0);
            return;
        }
        int i4 = editorInfo.inputType & 4095;
        if (i4 == 129 || i4 == 225 || i4 == 18) {
            d0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            d0(editorInfo, charSequence, i3, i2);
            return;
        }
        int i5 = i2 - i3;
        int i6 = i5 > 1024 ? 0 : i5;
        int i7 = 2048 - i6;
        int iMin = Math.min(charSequence.length() - i2, i7 - Math.min(i3, (int) (((double) i7) * 0.8d)));
        int iMin2 = Math.min(i3, i7 - iMin);
        int i8 = i3 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i8))) {
            i8++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i9 = iMin2 + i6;
        d0(editorInfo, i6 != i5 ? TextUtils.concat(charSequence.subSequence(i8, i8 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i8, i9 + iMin + i8), iMin2, i9);
    }

    public static void d0(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static final List e(jy1 jy1Var, int i, int i2, ArrayList arrayList, ri1 ri1Var, int i3, int i4, int i5, boolean z, vp0 vp0Var) {
        int i6;
        ri1 ri1Var2;
        int i7;
        Object obj;
        int i8;
        if (jy1Var == null || arrayList.isEmpty() || (i6 = ri1Var.b) == 0) {
            return ag0.h;
        }
        int i9 = -1;
        int i10 = 0;
        if (i2 - i < 0 || i6 == 0) {
            ri1Var2 = ky0.a;
        } else {
            qy0 qy0VarS = cy1.S(0, i6);
            int i11 = qy0VarS.h;
            int i12 = qy0VarS.i;
            int iC = -1;
            if (i11 <= i12) {
                while (ri1Var.c(i11) <= i) {
                    iC = ri1Var.c(i11);
                    if (i11 == i12) {
                        break;
                    }
                    i11++;
                }
            }
            if (iC == -1) {
                ri1Var2 = ky0.a;
            } else {
                ri1 ri1Var3 = ky0.a;
                ri1Var2 = new ri1(1);
                ri1Var2.a(iC);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj2 = arrayList.get(i13);
            int index = ((w61) obj2).getIndex();
            int[] iArr = ri1Var.a;
            int i14 = ri1Var.b;
            for (int i15 = i10; i15 < i14; i15++) {
                if (iArr[i15] == index) {
                    arrayList3.add(obj2);
                    break;
                }
            }
            i13++;
            i10 = 0;
        }
        int[] iArr2 = ri1Var2.a;
        int i16 = ri1Var2.b;
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr2[i17];
            int size2 = arrayList.size();
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (i20 >= size2) {
                    i19 = i9;
                    break;
                }
                Object obj3 = arrayList.get(i20);
                i20++;
                if (((w61) obj3).getIndex() == i18) {
                    break;
                }
                i19++;
            }
            w61 w61Var = i19 == i9 ? (w61) vp0Var.h(Integer.valueOf(i18)) : (w61) arrayList.remove(i19);
            int iY = t03.y(w61Var, z);
            if (i19 == i9) {
                i7 = Integer.MIN_VALUE;
            } else {
                long jB = w61Var.b(0);
                i7 = (int) (z ? jB & 4294967295L : jB >> 32);
            }
            int size3 = arrayList3.size();
            int i21 = 0;
            while (true) {
                if (i21 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i21);
                if (((w61) obj).getIndex() != i18) {
                    break;
                }
                i21++;
            }
            w61 w61Var2 = (w61) obj;
            if (w61Var2 != null) {
                long jB2 = w61Var2.b(0);
                i8 = (int) (z ? jB2 & 4294967295L : jB2 >> 32);
            } else {
                i8 = Integer.MIN_VALUE;
            }
            int iMax = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i8 - iY);
            }
            w61Var.g();
            w61Var.i(iMax, 0, i4, i5);
            arrayList2.add(w61Var);
            i17++;
            i9 = -1;
        }
        return arrayList2;
    }

    public static final ExtractedText e0(vv2 vv2Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = vv2Var.a.i;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = vv2Var.b;
        extractedText.selectionStart = qw2.f(j);
        extractedText.selectionEnd = qw2.e(j);
        extractedText.flags = !co2.R(vv2Var.a.i, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078 A[LOOP:0: B:22:0x0065->B:25:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x007c A[EDGE_INSN: B:50:0x007c->B:27:0x007c BREAK  A[LOOP:0: B:22:0x0065->B:25:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object f(defpackage.sq2 r12, long r13, defpackage.n10 r15) {
        /*
            boolean r0 = r15 instanceof defpackage.vc0
            if (r0 == 0) goto L13
            r0 = r15
            vc0 r0 = (defpackage.vc0) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            vc0 r0 = new vc0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.m
            int r1 = r0.n
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2d
            w72 r12 = r0.l
            sq2 r13 = r0.k
            defpackage.m02.y(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5b
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r12)
            return r3
        L33:
            defpackage.m02.y(r15)
            tq2 r15 = r12.l
            q02 r15 = r15.z
            boolean r15 = S(r15, r13)
            if (r15 != 0) goto Lbd
            w72 r15 = new w72
            r15.<init>()
            r15.h = r13
        L47:
            r0.k = r12
            r0.l = r15
            r0.n = r2
            s02 r13 = defpackage.s02.i
            java.lang.Object r13 = r12.a(r13, r0)
            y20 r14 = defpackage.y20.h
            if (r13 != r14) goto L58
            return r14
        L58:
            r11 = r15
            r15 = r13
            r13 = r11
        L5b:
            q02 r15 = (defpackage.q02) r15
            java.util.List r14 = r15.a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L65:
            if (r5 >= r1) goto L7b
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            z02 r7 = (defpackage.z02) r7
            long r7 = r7.a
            long r9 = r13.h
            boolean r7 = defpackage.y02.k(r7, r9)
            if (r7 != 0) goto L7c
            int r5 = r5 + 1
            goto L65
        L7b:
            r6 = r3
        L7c:
            z02 r6 = (defpackage.z02) r6
            if (r6 != 0) goto L82
            r6 = r3
            goto Lb4
        L82:
            boolean r14 = defpackage.r02.m(r6)
            if (r14 == 0) goto La8
            java.util.List r14 = r15.a
            int r15 = r14.size()
        L8e:
            if (r4 >= r15) goto L9e
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            z02 r5 = (defpackage.z02) r5
            boolean r5 = r5.d
            if (r5 != 0) goto L9f
            int r4 = r4 + 1
            goto L8e
        L9e:
            r1 = r3
        L9f:
            z02 r1 = (defpackage.z02) r1
            if (r1 == 0) goto Lb4
            long r14 = r1.a
            r13.h = r14
            goto Lbe
        La8:
            long r14 = defpackage.r02.B(r6, r2)
            r4 = 0
            boolean r14 = defpackage.up1.b(r14, r4)
            if (r14 != 0) goto Lbe
        Lb4:
            if (r6 == 0) goto Lbd
            boolean r12 = r6.c()
            if (r12 != 0) goto Lbd
            return r6
        Lbd:
            return r3
        Lbe:
            r15 = r13
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys.f(sq2, long, n10):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [x72] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static final Object g(sq2 sq2Var, long j, n10 n10Var) {
        wc0 wc0Var;
        Object obj;
        z02 z02Var;
        t72 t72Var;
        if (n10Var instanceof wc0) {
            wc0Var = (wc0) n10Var;
            int i = wc0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                wc0Var.o = i - Integer.MIN_VALUE;
            } else {
                wc0Var = new wc0(n10Var);
            }
        } else {
            wc0Var = new wc0(n10Var);
        }
        Object obj2 = wc0Var.n;
        int i2 = wc0Var.o;
        try {
            if (i2 == 0) {
                m02.y(obj2);
                if (!S(sq2Var.l.z, j)) {
                    List list = sq2Var.l.z.a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (y02.k(((z02) obj).a, j)) {
                            break;
                        }
                        i3++;
                    }
                    z02Var = (z02) obj;
                    if (z02Var != null) {
                        x72 x72Var = new x72();
                        x72 x72Var2 = new x72();
                        x72Var2.h = z02Var;
                        long jC = sq2Var.i().c();
                        t72 t72Var2 = new t72();
                        zp0 xc0Var = new xc0(t72Var2, x72Var2, x72Var, null);
                        wc0Var.k = z02Var;
                        wc0Var.l = x72Var;
                        wc0Var.m = t72Var2;
                        wc0Var.o = 1;
                        Object objM = sq2Var.m(jC, xc0Var, wc0Var);
                        Object obj3 = y20.h;
                        if (objM == obj3) {
                            return obj3;
                        }
                        t72Var = t72Var2;
                        j = x72Var;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t72Var = wc0Var.m;
            x72 x72Var3 = wc0Var.l;
            z02Var = wc0Var.k;
            m02.y(obj2);
            j = x72Var3;
            if (t72Var.h) {
                z02 z02Var2 = (z02) j.h;
                return z02Var2 == null ? z02Var : z02Var2;
            }
            return null;
        } catch (t02 unused) {
            z02 z02Var3 = (z02) j.h;
            return z02Var3 != null ? z02Var3 : z02Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c6 A[LOOP:0: B:25:0x00b2->B:28:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb A[EDGE_INSN: B:63:0x00cb->B:30:0x00cb BREAK  A[LOOP:0: B:25:0x00b2->B:28:0x00c6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x014b -> B:57:0x0151). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object h(defpackage.sq2 r18, long r19, defpackage.s r21, defpackage.rk r22) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys.h(sq2, long, s, rk):java.lang.Object");
    }

    public static final ri1 i(s61 s61Var, a71 a71Var, lo loVar) {
        int iMin;
        h0 h0Var = ia2.m(a71Var.h).c;
        uj1 uj1Var = loVar.a;
        int i = 1;
        if (!(uj1Var.j != 0) && h0Var.isEmpty()) {
            return ky0.a;
        }
        ri1 ri1Var = new ri1();
        if (loVar.a.j != 0) {
            int i2 = uj1Var.j;
            if (i2 == 0) {
                li1.m("MutableVector is empty.");
                return null;
            }
            Object[] objArr = uj1Var.h;
            int i3 = ((h61) objArr[0]).a;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = ((h61) objArr[i4]).a;
                if (i5 < i3) {
                    i3 = i5;
                }
            }
            if (i3 < 0) {
                dx0.a("negative minIndex");
            }
            int i6 = uj1Var.j;
            if (i6 == 0) {
                li1.m("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = uj1Var.h;
            int i7 = ((h61) objArr2[0]).b;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = ((h61) objArr2[i8]).b;
                if (i9 > i7) {
                    i7 = i9;
                }
            }
            iMin = Math.min(i7, s61Var.a() - 1);
            i = i3;
        } else {
            iMin = 0;
        }
        int iA = h0Var.a();
        for (int i10 = 0; i10 < iA; i10++) {
            y61 y61Var = (y61) h0Var.get(i10);
            int iU = ou.u(y61Var.c, s61Var, y61Var.a);
            if ((i > iU || iU > iMin) && iU >= 0 && iU < s61Var.a()) {
                ri1Var.a(iU);
            }
        }
        if (i <= iMin) {
            while (true) {
                ri1Var.a(i);
                if (i == iMin) {
                    break;
                }
                i++;
            }
        }
        int i11 = ri1Var.b;
        if (i11 == 0) {
            return ri1Var;
        }
        int[] iArr = ri1Var.a;
        iArr.getClass();
        Arrays.sort(iArr, 0, i11);
        return ri1Var;
    }

    public static final float l(u60 u60Var, float f) {
        ak0 ak0Var = u60Var.a;
        ed edVar = new ed(0.0f);
        int iB = edVar.b();
        int i = 0;
        while (i < iB) {
            edVar.e(i, ak0Var.f(0.0f, i == 0 ? f : 0.0f));
            i++;
        }
        return edVar.a;
    }

    public static final void m(o20 o20Var, CancellationException cancellationException) {
        s01 s01Var = (s01) o20Var.m(c5.Z);
        if (s01Var != null) {
            s01Var.a(cancellationException);
        }
    }

    public static final void o(int i) {
        if (i >= 1) {
            return;
        }
        li1.e(jp1.h(i, "Expected positive parallelism level, but got "));
    }

    public static final void p(long j, ks1 ks1Var) {
        if (ks1Var == ks1.h) {
            if (k00.h(j) == Integer.MAX_VALUE) {
                dx0.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else {
            if (k00.i(j) != Integer.MAX_VALUE) {
                return;
            }
            dx0.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final kl1 q(Context context) {
        context.getClass();
        kl1 kl1Var = new kl1(context);
        xk1 xk1Var = kl1Var.b;
        tm1 tm1Var = xk1Var.s;
        tm1Var.a(new dy(tm1Var));
        tm1 tm1Var2 = xk1Var.s;
        tm1Var2.a(new fy());
        tm1Var2.a(new ka0());
        return kl1Var;
    }

    public static void r(double[] dArr, int i, int i2, int i3, double d, double[] dArr2) {
        if (i3 == 1) {
            while (i < i2) {
                dArr[i] = d / dArr2[i];
                i++;
            }
        } else {
            while (i < i2) {
                dArr[i] = d / dArr2[i];
                i += i3;
            }
        }
    }

    public static void s(double[] dArr, int i, int i2, int i3, double[] dArr2, double d) {
        if (i3 == 1) {
            while (i < i2) {
                dArr[i] = dArr2[i] / d;
                i++;
            }
        } else {
            while (i < i2) {
                dArr[i] = dArr2[i] / d;
                i += i3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object t(defpackage.sq2 r4, long r5, defpackage.vp0 r7, defpackage.n10 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ad0
            if (r0 == 0) goto L13
            r0 = r8
            ad0 r0 = (defpackage.ad0) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            ad0 r0 = new ad0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.m
            int r1 = r0.n
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            vp0 r4 = r0.l
            sq2 r5 = r0.k
            defpackage.m02.y(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r4)
            r4 = 0
            return r4
        L32:
            defpackage.m02.y(r8)
        L35:
            r0.k = r4
            r0.l = r7
            r0.n = r2
            java.lang.Object r8 = f(r4, r5, r0)
            y20 r5 = defpackage.y20.h
            if (r8 != r5) goto L44
            return r5
        L44:
            z02 r8 = (defpackage.z02) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = defpackage.r02.m(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.h(r8)
            long r5 = r8.a
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys.t(sq2, long, vp0, n10):java.lang.Object");
    }

    public static final void u(o20 o20Var) {
        s01 s01Var = (s01) o20Var.m(c5.Z);
        if (s01Var != null && !s01Var.b()) {
            throw s01Var.o();
        }
    }

    public static final lm0 v(lm0 lm0Var) {
        lm0 lm0VarF = ((em0) cu.Z(lm0Var).getFocusOwner()).f();
        if (lm0VarF == null || !lm0VarF.u) {
            return null;
        }
        return lm0VarF;
    }

    public static final int w(int i, List list) {
        int i2;
        byte b;
        int i3 = ((yt1) dv.F0(list)).c;
        if (i > ((yt1) dv.F0(list)).c) {
            bx0.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        byte b2 = 1;
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            yt1 yt1Var = (yt1) list.get(i2);
            if (yt1Var.b > i) {
                b = 1;
            } else {
                b = yt1Var.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String strA = gb1.a(list, null, new de1(b2), 31);
        StringBuilder sbK = wi0.k("Found paragraph index ", i2, " should be in range [0, ", size2, ").\nDebug info: index=");
        sbK.append(i);
        sbK.append(", paragraphs=[");
        sbK.append(strA);
        sbK.append("]");
        bx0.a(sbK.toString());
        return i2;
    }

    public static final int x(int i, List list) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            yt1 yt1Var = (yt1) list.get(i3);
            if (yt1Var.d > i) {
                b = 1;
            } else {
                b = yt1Var.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int y(ArrayList arrayList, float f) {
        byte b;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((yt1) dv.F0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            yt1 yt1Var = (yt1) arrayList.get(i2);
            if (yt1Var.f > f) {
                b = 1;
            } else {
                b = yt1Var.g <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void z(ArrayList arrayList, long j, vp0 vp0Var) {
        int size = arrayList.size();
        for (int iW = w(qw2.f(j), arrayList); iW < size; iW++) {
            yt1 yt1Var = (yt1) arrayList.get(iW);
            if (yt1Var.b >= qw2.e(j)) {
                return;
            }
            if (yt1Var.b != yt1Var.c) {
                vp0Var.h(yt1Var);
            }
        }
    }

    public abstract int d(int i, int i2, u31 u31Var);
}
