package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hw2 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public rf e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final x91[] n;
    public final Rect o = new Rect();
    public bj p;

    /* JADX WARN: Code duplicated, block: B:114:0x0213  */
    /* JADX WARN: Code duplicated, block: B:115:0x0215  */
    /* JADX WARN: Code duplicated, block: B:117:0x021a  */
    /* JADX WARN: Code duplicated, block: B:118:0x021c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r6v25 */
    public hw2(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, z31 z31Var) throws Throwable {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutH;
        boolean z2;
        x91[] x91VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        long jA;
        int i14;
        long j;
        char c;
        Throwable th;
        int i15;
        long jA2;
        int i16;
        int i17;
        long jA3;
        ?? r13;
        boolean zIsFallbackLineSpacingEnabled;
        int topPadding;
        boolean zIsFallbackLineSpacingEnabled2;
        int i18;
        ?? r6;
        boolean z3;
        ?? r15;
        int i19;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = lw2.b(i2);
        Layout.Alignment alignment = at2.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : at2.b : at2.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, vk.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = z31Var.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || z31Var.c() > f || z4) {
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutH = rz1.h(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
                z2 = false;
            } else {
                if (iCeil < 0) {
                    bx0.a("negative width");
                    bx0.a("negative ellipsized width");
                }
                layoutH = Build.VERSION.SDK_INT >= 33 ? y1.b(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                z2 = true;
            }
            this.f = layoutH;
            Trace.endSection();
            int iMin = Math.min(layoutH.getLineCount(), i9);
            this.g = iMin;
            int i20 = iMin - 1;
            this.d = iMin >= i9 && (layoutH.getEllipsisCount(i20) > 0 || layoutH.getLineEnd(i20) != charSequence.length());
            if (layoutH.getText() instanceof Spanned) {
                CharSequence text = layoutH.getText();
                text.getClass();
                if (cy1.C((Spanned) text, x91.class) || layoutH.getText().length() <= 0) {
                    CharSequence text2 = layoutH.getText();
                    text2.getClass();
                    i10 = 0;
                    x91VarArr = (x91[]) ((Spanned) text2).getSpans(0, layoutH.getText().length(), x91.class);
                } else {
                    x91VarArr = null;
                    i10 = 0;
                }
            } else {
                x91VarArr = null;
                i10 = 0;
            }
            this.n = x91VarArr;
            if (x91VarArr == null) {
                i11 = 2;
                i12 = i10;
            } else {
                x91 x91Var = x91VarArr.length == 0 ? null : x91VarArr[i10];
                if (x91Var != null) {
                    if (x91Var.j) {
                        i11 = 2;
                        i19 = x91Var.m == 2 ? 1 : i19;
                        i12 = i19;
                    } else {
                        i11 = 2;
                    }
                    i19 = i10;
                    i12 = i19;
                } else {
                    i11 = 2;
                    i12 = i10;
                }
            }
            if (x91VarArr == null) {
                i13 = i10;
            } else {
                x91 x91Var2 = x91VarArr.length == 0 ? null : x91VarArr[i10];
                if (x91Var2 != null && x91Var2.k && x91Var2.m == i11) {
                    i13 = 1;
                } else {
                    i13 = i10;
                }
            }
            if (i12 == 0 || i13 == 0) {
                jA = lw2.b;
                if (z) {
                    i14 = 33;
                } else {
                    if (z2) {
                        BoringLayout boringLayout = (BoringLayout) layoutH;
                        i14 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zIsFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                        } else {
                            r13 = i10;
                        }
                    } else {
                        i14 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutH;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zIsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                        } else {
                            r13 = 1;
                        }
                    }
                    if (r13 == 0) {
                        r13 = zIsFallbackLineSpacingEnabled;
                        TextPaint paint = layoutH.getPaint();
                        CharSequence text3 = layoutH.getText();
                        th = null;
                        c = ' ';
                        Rect rectC = ys.C(paint, text3, layoutH.getLineStart(i10), layoutH.getLineEnd(i10));
                        int lineAscent = layoutH.getLineAscent(i10);
                        j = 4294967295L;
                        int i21 = rectC.top;
                        if (i21 < lineAscent) {
                            r13 = zIsFallbackLineSpacingEnabled2;
                            topPadding = lineAscent - i21;
                        } else {
                            r13 = zIsFallbackLineSpacingEnabled2;
                            topPadding = layoutH.getTopPadding();
                        }
                        i15 = 1;
                        rectC = iMin != 1 ? ys.C(paint, text3, layoutH.getLineStart(i20), layoutH.getLineEnd(i20)) : rectC;
                        int lineDescent = layoutH.getLineDescent(i20);
                        int i22 = rectC.bottom;
                        int bottomPadding = i22 > lineDescent ? i22 - lineDescent : layoutH.getBottomPadding();
                        jA2 = (topPadding == 0 && bottomPadding == 0) ? jA2 : lw2.a(topPadding, bottomPadding);
                        if (i12 != 0) {
                            i16 = i10;
                        } else {
                            i16 = (int) (jA2 >> c);
                        }
                        if (i13 != 0) {
                            i17 = i10;
                        } else {
                            i17 = (int) (jA2 & j);
                        }
                        jA3 = lw2.a(i16, i17);
                    }
                    jA2 = jA;
                    if (i12 != 0) {
                        i16 = i10;
                    } else {
                        i16 = (int) (jA2 >> c);
                    }
                    if (i13 != 0) {
                        i17 = i10;
                    } else {
                        i17 = (int) (jA2 & j);
                    }
                    jA3 = lw2.a(i16, i17);
                }
                r13 = zIsFallbackLineSpacingEnabled;
                r13 = zIsFallbackLineSpacingEnabled2;
                th = null;
                c = ' ';
                j = 4294967295L;
                i15 = 1;
                jA2 = jA;
                if (i12 != 0) {
                    i16 = i10;
                } else {
                    i16 = (int) (jA2 >> c);
                }
                if (i13 != 0) {
                    i17 = i10;
                } else {
                    i17 = (int) (jA2 & j);
                }
                jA3 = lw2.a(i16, i17);
            } else {
                jA3 = lw2.b;
                jA = jA3;
                th = null;
                c = ' ';
                j = 4294967295L;
                i15 = 1;
                i14 = 33;
            }
            if (x91VarArr != null) {
                int length2 = x91VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i23 = iMax2; i23 < length2; i23++) {
                    x91 x91Var3 = x91VarArr[i23];
                    int i24 = x91Var3.r;
                    iMax = i24 < 0 ? Math.max(iMax, Math.abs(i24)) : iMax;
                    int i25 = x91Var3.s;
                    if (i25 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i25));
                    }
                }
                jA = (iMax == 0 && iMax2 == 0) ? lw2.b : lw2.a(iMax, iMax2);
            }
            this.h = Math.max((int) (jA3 >> c), (int) (jA >> c));
            this.i = Math.max((int) (jA3 & j), (int) (jA & j));
            TextPaint textPaint2 = this.a;
            x91[] x91VarArr2 = this.n;
            int i26 = this.g - i15;
            Layout layout = this.f;
            if (layout.getLineStart(i26) != layout.getLineEnd(i26) || x91VarArr2 == null || x91VarArr2.length == 0) {
                i18 = i10;
                r6 = th;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                if (x91VarArr2.length == 0) {
                    li1.m("Array is empty.");
                    throw th;
                }
                x91 x91Var4 = x91VarArr2[i10];
                int length3 = spannableString.length();
                if (i26 == 0 || !(z3 = x91Var4.k)) {
                    boolean z5 = x91Var4.k;
                    z3 = z5 ? 1 : 0;
                    r15 = z5;
                } else {
                    r15 = i10;
                }
                spannableString.setSpan(new x91(x91Var4.h, length3, r15, z3, x91Var4.l, x91Var4.m), i10, spannableString.length(), i14);
                i18 = i10;
                StaticLayout staticLayoutH = rz1.h(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, s31.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutH.getLineAscent(i18);
                fontMetricsInt.descent = staticLayoutH.getLineDescent(i18);
                fontMetricsInt.top = staticLayoutH.getLineTop(i18);
                fontMetricsInt.bottom = staticLayoutH.getLineBottom(i18);
                r6 = fontMetricsInt;
            }
            this.m = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) h(i20)) : i18;
            this.l = r6;
            Layout layout2 = this.f;
            this.j = vs.B(layout2, i20, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = vs.C(layout3, i20, layout3.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.m;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final bj c() {
        bj bjVar = this.p;
        if (bjVar != null) {
            return bjVar;
        }
        bj bjVar2 = new bj();
        bjVar2.a = this.f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iU = co2.U(((Layout) bjVar2.a).getText(), '\n', length, 4);
            length = iU < 0 ? ((Layout) bjVar2.a).getText().length() : iU + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) bjVar2.a).getText().length());
        bjVar2.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        bjVar2.c = arrayList2;
        bjVar2.d = new boolean[((ArrayList) bjVar2.b).size()];
        ((ArrayList) bjVar2.b).size();
        this.p = bjVar2;
        return bjVar2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.l) == null) ? this.f.getLineBaseline(i) : i(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        ThreadLocal threadLocal = lw2.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int g(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float h(int i) {
        return e(i) - i(i);
    }

    public final float i(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float j(int i, boolean z) {
        return b(g(i)) + c().e(i, true, z);
    }

    public final float k(int i, boolean z) {
        return b(g(i)) + c().e(i, false, z);
    }

    public final rf l() {
        rf rfVar = this.e;
        if (rfVar != null) {
            return rfVar;
        }
        Layout layout = this.f;
        rf rfVar2 = new rf(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = rfVar2;
        return rfVar2;
    }
}
