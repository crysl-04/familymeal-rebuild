package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vd0 extends CharacterStyle implements UpdateAppearance {
    public final ud0 h;

    public vd0(ud0 ud0Var) {
        this.h = ud0Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            xi0 xi0Var = xi0.a;
            ud0 ud0Var = this.h;
            if (uz0.g(ud0Var, xi0Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(ud0Var instanceof ko2)) {
                wg.n();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            ko2 ko2Var = (ko2) ud0Var;
            textPaint.setStrokeWidth(ko2Var.a);
            textPaint.setStrokeMiter(ko2Var.b);
            int i = ko2Var.d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = ko2Var.c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
