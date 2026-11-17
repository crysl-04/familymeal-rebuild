package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class he extends CheckBox {
    public final je h;
    public final fe i;
    public final sf j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        vx2.a(context);
        dx2.a(this, getContext());
        je jeVar = new je(this);
        this.h = jeVar;
        jeVar.b(attributeSet, R.attr.checkboxStyle);
        fe feVar = new fe(this);
        this.i = feVar;
        feVar.q(attributeSet, R.attr.checkboxStyle);
        sf sfVar = new sf(this);
        this.j = sfVar;
        sfVar.d(attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fe feVar = this.i;
        if (feVar != null) {
            feVar.b();
        }
        sf sfVar = this.j;
        if (sfVar != null) {
            sfVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        je jeVar = this.h;
        if (jeVar != null) {
            jeVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        fe feVar = this.i;
        if (feVar != null) {
            return feVar.o();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fe feVar = this.i;
        if (feVar != null) {
            return feVar.p();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        je jeVar = this.h;
        if (jeVar != null) {
            return jeVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        je jeVar = this.h;
        if (jeVar != null) {
            return jeVar.c;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fe feVar = this.i;
        if (feVar != null) {
            feVar.s();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fe feVar = this.i;
        if (feVar != null) {
            feVar.t(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        je jeVar = this.h;
        if (jeVar != null) {
            if (jeVar.f) {
                jeVar.f = false;
            } else {
                jeVar.f = true;
                jeVar.a();
            }
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fe feVar = this.i;
        if (feVar != null) {
            feVar.C(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fe feVar = this.i;
        if (feVar != null) {
            feVar.D(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        je jeVar = this.h;
        if (jeVar != null) {
            jeVar.b = colorStateList;
            jeVar.d = true;
            jeVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        je jeVar = this.h;
        if (jeVar != null) {
            jeVar.c = mode;
            jeVar.e = true;
            jeVar.a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(df.a(getContext(), i));
    }
}
