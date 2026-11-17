package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y03 extends ReplacementSpan {
    public final x03 i;
    public TextPaint l;
    public final Paint.FontMetricsInt h = new Paint.FontMetricsInt();
    public short j = -1;
    public float k = 1.0f;

    public y03(x03 x03Var) {
        m02.c(x03Var, "rasterizer cannot be null");
        this.i = x03Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.l;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.l = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.j, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        if0.a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        x03 x03Var = this.i;
        wk wkVar = x03Var.b;
        Typeface typeface = (Typeface) wkVar.l;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) wkVar.j, x03Var.a << 1, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.h;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        x03 x03Var = this.i;
        cg1 cg1VarB = x03Var.b();
        int iA = cg1VarB.a(14);
        this.k = fAbs / (iA != 0 ? ((ByteBuffer) cg1VarB.k).getShort(iA + cg1VarB.h) : (short) 0);
        cg1 cg1VarB2 = x03Var.b();
        int iA2 = cg1VarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) cg1VarB2.k).getShort(iA2 + cg1VarB2.h);
        }
        cg1 cg1VarB3 = x03Var.b();
        int iA3 = cg1VarB3.a(12);
        short s = (short) ((iA3 != 0 ? ((ByteBuffer) cg1VarB3.k).getShort(iA3 + cg1VarB3.h) : (short) 0) * this.k);
        this.j = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
