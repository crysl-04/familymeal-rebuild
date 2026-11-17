package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ff extends ix0 {
    public final ef l;
    public Drawable m;
    public ColorStateList n;
    public PorterDuff.Mode o;
    public boolean p;
    public boolean q;

    public ff(ef efVar) {
        super((Object) efVar, (byte) 1);
        this.n = null;
        this.o = null;
        this.p = false;
        this.q = false;
        this.l = efVar;
    }

    @Override // defpackage.ix0
    public final void I(AttributeSet attributeSet, int i) {
        super.I(attributeSet, R.attr.seekBarStyle);
        ef efVar = this.l;
        Context context = efVar.getContext();
        int[] iArr = f52.g;
        eg egVarW = eg.w(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) egVarW.i;
        Context context2 = efVar.getContext();
        TypedArray typedArray2 = (TypedArray) egVarW.i;
        WeakHashMap weakHashMap = t43.a;
        r43.b(efVar, context2, iArr, attributeSet, typedArray2, R.attr.seekBarStyle, 0);
        Drawable drawableL = egVarW.l(0);
        if (drawableL != null) {
            efVar.setThumb(drawableL);
        }
        Drawable drawableK = egVarW.k(1);
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.m = drawableK;
        if (drawableK != null) {
            drawableK.setCallback(efVar);
            drawableK.setLayoutDirection(efVar.getLayoutDirection());
            if (drawableK.isStateful()) {
                drawableK.setState(efVar.getDrawableState());
            }
            S();
        }
        efVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.o = zd0.b(typedArray.getInt(3, -1), this.o);
            this.q = true;
        }
        if (typedArray.hasValue(2)) {
            this.n = egVarW.h(2);
            this.p = true;
        }
        egVarW.A();
        S();
    }

    public final void S() {
        Drawable drawable = this.m;
        if (drawable != null) {
            if (this.p || this.q) {
                Drawable drawableMutate = drawable.mutate();
                this.m = drawableMutate;
                if (this.p) {
                    drawableMutate.setTintList(this.n);
                }
                if (this.q) {
                    this.m.setTintMode(this.o);
                }
                if (this.m.isStateful()) {
                    this.m.setState(this.l.getDrawableState());
                }
            }
        }
    }

    public final void T(Canvas canvas) {
        if (this.m != null) {
            ef efVar = this.l;
            int max = efVar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.m.getIntrinsicWidth();
                int intrinsicHeight = this.m.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.m.setBounds(-i, -i2, i, i2);
                float width = ((efVar.getWidth() - efVar.getPaddingLeft()) - efVar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(efVar.getPaddingLeft(), efVar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.m.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
