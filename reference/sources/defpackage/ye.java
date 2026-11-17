package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ye extends ImageView {
    public final fe h;
    public final ix0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.a(context);
        dx2.a(this, getContext());
        fe feVar = new fe(this);
        this.h = feVar;
        feVar.q(attributeSet, i);
        ix0 ix0Var = new ix0((Object) this, (byte) 4);
        this.i = ix0Var;
        ix0Var.I(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fe feVar = this.h;
        if (feVar != null) {
            feVar.b();
        }
        ix0 ix0Var = this.i;
        if (ix0Var != null) {
            ix0Var.o();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        fe feVar = this.h;
        if (feVar != null) {
            return feVar.o();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fe feVar = this.h;
        if (feVar != null) {
            return feVar.p();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        wx2 wx2Var;
        ix0 ix0Var = this.i;
        if (ix0Var == null || (wx2Var = (wx2) ix0Var.j) == null) {
            return null;
        }
        return wx2Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        wx2 wx2Var;
        ix0 ix0Var = this.i;
        if (ix0Var == null || (wx2Var = (wx2) ix0Var.j) == null) {
            return null;
        }
        return wx2Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.i.i).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fe feVar = this.h;
        if (feVar != null) {
            feVar.s();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fe feVar = this.h;
        if (feVar != null) {
            feVar.t(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ix0 ix0Var = this.i;
        if (ix0Var != null) {
            ix0Var.o();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ix0 ix0Var = this.i;
        if (ix0Var != null) {
            ix0Var.o();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        ix0 ix0Var = this.i;
        if (ix0Var != null) {
            ImageView imageView = (ImageView) ix0Var.i;
            if (i != 0) {
                Drawable drawableA = df.a(imageView.getContext(), i);
                if (drawableA != null) {
                    int i2 = zd0.a;
                }
                imageView.setImageDrawable(drawableA);
            } else {
                imageView.setImageDrawable(null);
            }
            ix0Var.o();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ix0 ix0Var = this.i;
        if (ix0Var != null) {
            ix0Var.o();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fe feVar = this.h;
        if (feVar != null) {
            feVar.C(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fe feVar = this.h;
        if (feVar != null) {
            feVar.D(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ix0 ix0Var = this.i;
        if (ix0Var != null) {
            wx2 wx2Var = (wx2) ix0Var.j;
            if (wx2Var == null) {
                wx2Var = new wx2();
                ix0Var.j = wx2Var;
            }
            wx2Var.a = colorStateList;
            wx2Var.d = true;
            ix0Var.o();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ix0 ix0Var = this.i;
        if (ix0Var != null) {
            wx2 wx2Var = (wx2) ix0Var.j;
            if (wx2Var == null) {
                wx2Var = new wx2();
                ix0Var.j = wx2Var;
            }
            wx2Var.b = mode;
            wx2Var.c = true;
            ix0Var.o();
        }
    }
}
