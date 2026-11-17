package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g9 {
    public final k9 a;
    public final int b;
    public final long c;
    public final hw2 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Code duplicated, block: B:103:0x0184  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:128:0x0206  */
    /* JADX WARN: Code duplicated, block: B:130:0x0220  */
    /* JADX WARN: Code duplicated, block: B:131:0x0239  */
    /* JADX WARN: Code duplicated, block: B:133:0x023c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0240 A[LOOP:1: B:134:0x023e->B:135:0x0240, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x0269  */
    /* JADX WARN: Code duplicated, block: B:139:0x026d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0285  */
    /* JADX WARN: Code duplicated, block: B:143:0x029b  */
    /* JADX WARN: Code duplicated, block: B:144:0x029d  */
    /* JADX WARN: Code duplicated, block: B:150:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:177:0x033a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Instruction removed from duplicated block: B:133:0x023c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:139:0x026d, please report this as an issue */
    public g9(k9 k9Var, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TextUtils.TruncateAt truncateAt;
        char c;
        TextUtils.TruncateAt truncateAt2;
        hw2 hw2VarA;
        int i9;
        g9 g9Var;
        int i10;
        Layout layout;
        di2[] di2VarArr;
        CharSequence charSequence;
        Spanned spanned;
        ArrayList arrayList;
        int i11;
        List list;
        int spanEnd;
        int iG;
        boolean z;
        boolean z2;
        boolean z3;
        r72 r72Var;
        boolean z4;
        float fK;
        int iC;
        float fJ;
        int iC2;
        int i12;
        Spanned spanned2;
        int i13;
        CharSequence charSequence2 = k9Var.o;
        this.a = k9Var;
        this.b = i;
        this.c = j;
        if (k00.j(j) != 0 || k00.k(j) != 0) {
            bx0.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            bx0.a("maxLines should be greater than 0");
        }
        xw2 xw2Var = k9Var.i;
        if (i2 == 2) {
            i3 = 0;
            if (!ax2.a(xw2Var.a.h, r02.t(0)) && !ax2.a(xw2Var.a.h, ax2.c) && (i13 = xw2Var.b.a) != 0 && i13 != 5 && i13 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!cy1.C(spannableString, vu0.class)) {
                    spannableString.setSpan(new vu0(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        cu1 cu1Var = xw2Var.b;
        yl2 yl2Var = xw2Var.a;
        int i14 = cu1Var.a;
        int i15 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 == 5 || i14 != 6) ? i3 : 1;
        int i16 = i14 == 4 ? 1 : i3;
        int i17 = cu1Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i18 = cu1Var.g;
        int i19 = i18 & 255;
        if (i19 == 1) {
            i4 = i3;
        } else if (i19 == 2) {
            i4 = 1;
        } else if (i19 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i20 = (i18 >> 8) & 255;
        if (i20 == 1) {
            i5 = i3;
        } else if (i20 == 2) {
            i5 = 1;
        } else if (i20 == 3) {
            i5 = 2;
        } else if (i20 == 4) {
            i5 = 3;
        } else {
            i5 = i3;
        }
        int i21 = (i18 >> 16) & 255;
        if (i21 == 1) {
            i7 = i3;
            i6 = 2;
        } else {
            i6 = 2;
            i7 = i21 == 2 ? 1 : i3;
        }
        if (i2 != i6) {
            if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else if (i2 == 4) {
                truncateAt2 = TextUtils.TruncateAt.START;
                i8 = i17;
                truncateAt = truncateAt2;
                c = ' ';
            } else {
                i8 = i17;
                yl2Var = yl2Var;
                truncateAt = null;
                c = ' ';
            }
            hw2VarA = a(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
            Layout layout2 = hw2VarA.f;
            if (Build.VERSION.SDK_INT < 35 || k9Var.n.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                i9 = 2;
                g9Var = this;
                i10 = i;
            } else {
                int ellipsisStart = layout2.getEllipsisStart(0);
                int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                i9 = 2;
                CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(ellipsisCount, charSequence3.length())};
                g9Var = this;
                i10 = i;
                hw2VarA = g9Var.a(i15, i16, truncateAt, i10, i8, i4, i5, i7, TextUtils.concat(charSequenceArr));
            }
            int i22 = hw2VarA.g;
            if (i2 == i9 || hw2VarA.a() <= k00.h(j) || i10 <= 1) {
                g9Var.d = hw2VarA;
            } else {
                int iH = k00.h(j);
                for (int i23 = 0; i23 < i22; i23++) {
                    if (hw2VarA.e(i23) > iH) {
                        i22 = i23;
                        break;
                    }
                }
                if (i22 >= 0 && i22 != g9Var.b) {
                    hw2VarA = g9Var.a(i15, i16, truncateAt, i22 < 1 ? 1 : i22, i8, i4, i5, i7, g9Var.e);
                }
                g9Var.d = hw2VarA;
            }
            g9Var.f = hw2VarA.a();
            yl2 yl2Var2 = yl2Var;
            g9Var.a.n.c(yl2Var2.a.b(), (((long) Float.floatToRawIntBits(g9Var.c())) << c) | (((long) Float.floatToRawIntBits(g9Var.f)) & 4294967295L), yl2Var2.a.c());
            layout = hw2VarA.f;
            if (layout.getText() instanceof Spanned) {
                CharSequence text = layout.getText();
                text.getClass();
                spanned2 = (Spanned) text;
                if (spanned2.nextSpanTransition(-1, spanned2.length(), di2.class) != spanned2.length()) {
                    CharSequence text2 = layout.getText();
                    text2.getClass();
                    di2VarArr = (di2[]) ((Spanned) text2).getSpans(0, layout.getText().length(), di2.class);
                } else {
                    di2VarArr = null;
                }
            } else {
                di2VarArr = null;
            }
            if (di2VarArr != null) {
                for (di2 di2Var : di2VarArr) {
                    di2Var.j.setValue(new wj2((((long) Float.floatToRawIntBits(g9Var.c())) << c) | (((long) Float.floatToRawIntBits(g9Var.f)) & 4294967295L)));
                }
            }
            charSequence = g9Var.e;
            if (charSequence instanceof Spanned) {
                spanned = (Spanned) charSequence;
                Object[] spans = spanned.getSpans(0, charSequence.length(), qy1.class);
                arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    qy1 qy1Var = (qy1) obj;
                    int spanStart = spanned.getSpanStart(qy1Var);
                    spanEnd = spanned.getSpanEnd(qy1Var);
                    iG = g9Var.d.g(spanStart);
                    if (iG >= g9Var.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (g9Var.d.f.getEllipsisCount(iG) > 0 || spanEnd <= g9Var.d.f.getEllipsisStart(iG) + g9Var.d.f.getLineStart(iG)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (spanEnd > g9Var.d.f(iG)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z2 || z3 || z) {
                        r72Var = null;
                    } else {
                        boolean z5 = g9Var.d.f.getParagraphDirection(iG) == 1;
                        boolean zIsRtlCharAt = g9Var.d.f.isRtlCharAt(spanStart);
                        if (z5) {
                            if (zIsRtlCharAt) {
                                z4 = false;
                                if (zIsRtlCharAt) {
                                    fJ = g9Var.d.k(spanStart, false);
                                    iC2 = qy1Var.c();
                                }
                                fK = fJ - iC2;
                                hw2 hw2Var = g9Var.d;
                                qy1Var.getClass();
                                float fD = hw2Var.d(iG) - qy1Var.b();
                                r72Var = new r72(fK, fD, fJ, qy1Var.b() + fD);
                            } else {
                                fK = g9Var.d.j(spanStart, false);
                                iC = qy1Var.c();
                            }
                            fJ = iC + fK;
                            hw2 hw2Var2 = g9Var.d;
                            qy1Var.getClass();
                            float fD2 = hw2Var2.d(iG) - qy1Var.b();
                            r72Var = new r72(fK, fD2, fJ, qy1Var.b() + fD2);
                        } else {
                            z4 = false;
                        }
                        hw2 hw2Var3 = g9Var.d;
                        if (zIsRtlCharAt) {
                            fJ = hw2Var3.j(spanStart, z4);
                            iC2 = qy1Var.c();
                            fK = fJ - iC2;
                            hw2 hw2Var4 = g9Var.d;
                            qy1Var.getClass();
                            float fD3 = hw2Var4.d(iG) - qy1Var.b();
                            r72Var = new r72(fK, fD3, fJ, qy1Var.b() + fD3);
                        } else {
                            fK = hw2Var3.k(spanStart, z4);
                            iC = qy1Var.c();
                            fJ = iC + fK;
                            hw2 hw2Var5 = g9Var.d;
                            qy1Var.getClass();
                            float fD4 = hw2Var5.d(iG) - qy1Var.b();
                            r72Var = new r72(fK, fD4, fJ, qy1Var.b() + fD4);
                        }
                    }
                    arrayList.add(r72Var);
                }
                list = arrayList;
            } else {
                list = ag0.h;
            }
            g9Var.g = list;
        }
        truncateAt2 = TextUtils.TruncateAt.END;
        i8 = i17;
        truncateAt = truncateAt2;
        c = ' ';
        hw2VarA = a(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
        Layout layout3 = hw2VarA.f;
        if (Build.VERSION.SDK_INT < 35) {
            i9 = 2;
            g9Var = this;
            i10 = i;
        } else {
            i9 = 2;
            g9Var = this;
            i10 = i;
        }
        int i24 = hw2VarA.g;
        if (i2 == i9) {
            g9Var.d = hw2VarA;
        } else {
            g9Var.d = hw2VarA;
        }
        g9Var.f = hw2VarA.a();
        yl2 yl2Var3 = yl2Var;
        g9Var.a.n.c(yl2Var3.a.b(), (((long) Float.floatToRawIntBits(g9Var.c())) << c) | (((long) Float.floatToRawIntBits(g9Var.f)) & 4294967295L), yl2Var3.a.c());
        layout = hw2VarA.f;
        if (layout.getText() instanceof Spanned) {
            CharSequence text3 = layout.getText();
            text3.getClass();
            spanned2 = (Spanned) text3;
            if (spanned2.nextSpanTransition(-1, spanned2.length(), di2.class) != spanned2.length()) {
                CharSequence text4 = layout.getText();
                text4.getClass();
                di2VarArr = (di2[]) ((Spanned) text4).getSpans(0, layout.getText().length(), di2.class);
            } else {
                di2VarArr = null;
            }
        } else {
            di2VarArr = null;
        }
        if (di2VarArr != null) {
            while (i12 < r2) {
                di2Var.j.setValue(new wj2((((long) Float.floatToRawIntBits(g9Var.c())) << c) | (((long) Float.floatToRawIntBits(g9Var.f)) & 4294967295L)));
            }
        }
        charSequence = g9Var.e;
        if (charSequence instanceof Spanned) {
            list = ag0.h;
        } else {
            spanned = (Spanned) charSequence;
            Object[] spans2 = spanned.getSpans(0, charSequence.length(), qy1.class);
            arrayList = new ArrayList(spans2.length);
            while (i11 < r4) {
                qy1 qy1Var2 = (qy1) obj;
                int spanStart2 = spanned.getSpanStart(qy1Var2);
                spanEnd = spanned.getSpanEnd(qy1Var2);
                iG = g9Var.d.g(spanStart2);
                if (iG >= g9Var.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (g9Var.d.f.getEllipsisCount(iG) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > g9Var.d.f(iG)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    r72Var = null;
                } else {
                    r72Var = null;
                }
                arrayList.add(r72Var);
            }
            list = arrayList;
        }
        g9Var.g = list;
    }

    public final hw2 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        xz1 xz1Var;
        float fC = c();
        k9 k9Var = this.a;
        db dbVar = k9Var.n;
        byte b = k9Var.s;
        z31 z31Var = k9Var.p;
        xw2 xw2Var = k9Var.i;
        h9 h9Var = i9.a;
        k02 k02Var = xw2Var.c;
        return new hw2(charSequence, fC, dbVar, i, truncateAt, b, (k02Var == null || (xz1Var = k02Var.b) == null) ? false : xz1Var.a, i3, i5, i6, i7, i4, i2, z31Var);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[EDGE_INSN: B:31:0x0098->B:33:0x00a8 BREAK  A[LOOP:0: B:23:0x0078->B:26:0x007e]] */
    public final long b(r72 r72Var, int i, li1 li1Var) {
        int[] iArrE;
        RectF rectFX = y02.x(r72Var);
        boolean z = false;
        int i2 = (i == 0 || i != 1) ? 0 : 1;
        s sVar = new s((Object) li1Var, (byte) 2);
        hw2 hw2Var = this.d;
        Layout layout = hw2Var.f;
        if (Build.VERSION.SDK_INT < 34) {
            bj bjVarC = hw2Var.c();
            rf2 k42Var = i2 == 1 ? new k42(layout.getText(), hw2Var.l(), (byte) 11) : new ix0(layout.getText(), hw2Var.a, (byte) 15, z);
            int lineForVertical = layout.getLineForVertical((int) rectFX.top);
            if (rectFX.top > hw2Var.e(lineForVertical) && (lineForVertical = lineForVertical + 1) >= hw2Var.g) {
                iArrE = null;
                break;
            }
            int i3 = lineForVertical;
            int lineForVertical2 = layout.getLineForVertical((int) rectFX.bottom);
            if (lineForVertical2 == 0 && rectFX.bottom < hw2Var.i(0)) {
                iArrE = null;
                break;
            }
            int iQ = rz1.q(hw2Var, layout, bjVarC, i3, rectFX, k42Var, sVar, true);
            while (true) {
                int i4 = i3;
                if (iQ != -1) {
                    int i5 = lineForVertical2;
                    int iQ2 = rz1.q(hw2Var, layout, bjVarC, i5, rectFX, k42Var, sVar, false);
                    while (true) {
                        if (iQ2 != -1) {
                            iArrE = new int[]{k42Var.b(iQ + 1), k42Var.e(iQ2 - 1)};
                            break;
                        }
                        if (i4 < i5) {
                            i5--;
                            iQ2 = rz1.q(hw2Var, layout, bjVarC, i5, rectFX, k42Var, sVar, false);
                        }
                    }
                } else if (i4 < lineForVertical2) {
                    i3 = i4 + 1;
                    iQ = rz1.q(hw2Var, layout, bjVarC, i3, rectFX, k42Var, sVar, true);
                }
                iArrE = null;
                break;
            }
        } else {
            iArrE = q1.e(hw2Var, rectFX, i2, sVar);
        }
        return iArrE == null ? qw2.b : m02.a(iArrE[0], iArrE[1]);
    }

    public final float c() {
        return k00.i(this.c);
    }

    public final void d(wq wqVar) {
        Canvas canvasA = b6.a(wqVar);
        hw2 hw2Var = this.d;
        if (hw2Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, c(), this.f);
        }
        int i = hw2Var.h;
        if (canvasA.getClipBounds(hw2Var.o)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal threadLocal = lw2.a;
            Object bt2Var = threadLocal.get();
            if (bt2Var == null) {
                bt2Var = new bt2();
                threadLocal.set(bt2Var);
            }
            bt2 bt2Var2 = (bt2) bt2Var;
            bt2Var2.a = canvasA;
            try {
                hw2Var.f.draw(bt2Var2);
                bt2Var2.a = null;
                if (i != 0) {
                    canvasA.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                bt2Var2.a = null;
                throw th;
            }
        }
        if (hw2Var.d) {
            canvasA.restore();
        }
    }

    public final void e(wq wqVar, long j, ei2 ei2Var, vt2 vt2Var, ud0 ud0Var) {
        db dbVar = this.a.n;
        byte b = dbVar.c;
        dbVar.d(j);
        dbVar.f(ei2Var);
        dbVar.g(vt2Var);
        dbVar.e(ud0Var);
        dbVar.b(3);
        d(wqVar);
        dbVar.b(b);
    }

    public final void f(wq wqVar, zo zoVar, float f, ei2 ei2Var, vt2 vt2Var, ud0 ud0Var) {
        db dbVar = this.a.n;
        byte b = dbVar.c;
        dbVar.c(zoVar, (((long) Float.floatToRawIntBits(c())) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L), f);
        dbVar.f(ei2Var);
        dbVar.g(vt2Var);
        dbVar.e(ud0Var);
        dbVar.b(3);
        d(wqVar);
        dbVar.b(b);
    }
}
