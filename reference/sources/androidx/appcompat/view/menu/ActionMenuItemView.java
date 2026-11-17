package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.c3;
import defpackage.f52;
import defpackage.hf1;
import defpackage.if1;
import defpackage.lf1;
import defpackage.tf;
import defpackage.v2;
import defpackage.w2;
import defpackage.xf1;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends tf implements xf1, View.OnClickListener, c3 {
    public lf1 k;
    public CharSequence l;
    public Drawable m;
    public hf1 n;
    public v2 o;
    public w2 p;
    public boolean q;
    public boolean r;
    public final int s;
    public int t;
    public final int u;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.q = d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f52.c, 0, 0);
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.t = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.xf1
    public final void a(lf1 lf1Var) {
        this.k = lf1Var;
        setIcon(lf1Var.getIcon());
        setTitle(lf1Var.getTitleCondensed());
        setId(lf1Var.a);
        setVisibility(lf1Var.isVisible() ? 0 : 8);
        setEnabled(lf1Var.isEnabled());
        if (lf1Var.hasSubMenu() && this.o == null) {
            this.o = new v2(this);
        }
    }

    @Override // defpackage.c3
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.c3
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.k.getIcon() == null;
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void e() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.l);
        if (this.m != null && ((this.k.y & 4) != 4 || (!this.q && !this.r))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.l : null);
        CharSequence charSequence = this.k.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.k.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.k.r;
        if (TextUtils.isEmpty(charSequence2)) {
            setTooltipText(z3 ? null : this.k.e);
        } else {
            setTooltipText(charSequence2);
        }
    }

    @Override // defpackage.xf1
    public lf1 getItemData() {
        return this.k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hf1 hf1Var = this.n;
        if (hf1Var != null) {
            hf1Var.a(this.k);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q = d();
        e();
    }

    @Override // defpackage.tf, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.t) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.s;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.m == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v2 v2Var;
        if (this.k.hasSubMenu() && (v2Var = this.o) != null && v2Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.r != z) {
            this.r = z;
            lf1 lf1Var = this.k;
            if (lf1Var != null) {
                if1 if1Var = lf1Var.n;
                if1Var.k = true;
                if1Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.u;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(hf1 hf1Var) {
        this.n = hf1Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.t = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(w2 w2Var) {
        this.p = w2Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.l = charSequence;
        e();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
