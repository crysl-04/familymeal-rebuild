package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ge extends Button {
    public final fe h;
    public final sf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        vx2.a(context);
        dx2.a(this, getContext());
        fe feVar = new fe(this);
        this.h = feVar;
        feVar.q(attributeSet, R.attr.buttonStyle);
        sf sfVar = new sf(this);
        this.i = sfVar;
        sfVar.d(attributeSet, R.attr.buttonStyle);
        sfVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fe feVar = this.h;
        if (feVar != null) {
            feVar.b();
        }
        sf sfVar = this.i;
        if (sfVar != null) {
            sfVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        wx2 wx2Var = this.i.h;
        if (wx2Var != null) {
            return wx2Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        wx2 wx2Var = this.i.h;
        if (wx2Var != null) {
            return wx2Var.b;
        }
        return null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        sf sfVar = this.i;
        if (sfVar != null) {
            sfVar.getClass();
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setSupportAllCaps(boolean z) {
        sf sfVar = this.i;
        if (sfVar != null) {
            sfVar.a.setAllCaps(z);
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        sf sfVar = this.i;
        wx2 wx2Var = sfVar.h;
        if (wx2Var == null) {
            wx2Var = new wx2();
            sfVar.h = wx2Var;
        }
        wx2 wx2Var2 = wx2Var;
        wx2Var.a = colorStateList;
        wx2Var.d = colorStateList != null;
        sfVar.b = wx2Var2;
        sfVar.c = wx2Var2;
        sfVar.d = wx2Var2;
        sfVar.e = wx2Var2;
        sfVar.f = wx2Var2;
        sfVar.g = wx2Var2;
        sfVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        sf sfVar = this.i;
        wx2 wx2Var = sfVar.h;
        if (wx2Var == null) {
            wx2Var = new wx2();
            sfVar.h = wx2Var;
        }
        wx2 wx2Var2 = wx2Var;
        wx2Var.b = mode;
        wx2Var.c = mode != null;
        sfVar.b = wx2Var2;
        sfVar.c = wx2Var2;
        sfVar.d = wx2Var2;
        sfVar.e = wx2Var2;
        sfVar.f = wx2Var2;
        sfVar.g = wx2Var2;
        sfVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        sf sfVar = this.i;
        if (sfVar != null) {
            sfVar.e(context, i);
        }
    }
}
