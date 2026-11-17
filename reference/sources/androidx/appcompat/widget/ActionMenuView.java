package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.a3;
import defpackage.aa1;
import defpackage.b3;
import defpackage.c3;
import defpackage.d3;
import defpackage.e3;
import defpackage.hf1;
import defpackage.if1;
import defpackage.lf1;
import defpackage.r53;
import defpackage.vz1;
import defpackage.x2;
import defpackage.yf1;
import defpackage.z91;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends aa1 implements hf1, yf1 {
    public b3 A;
    public boolean B;
    public int C;
    public final int D;
    public final int E;
    public if1 w;
    public Context x;
    public int y;
    public boolean z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.D = (int) (56.0f * f);
        this.E = (int) (f * 4.0f);
        this.x = context;
        this.y = 0;
    }

    public static d3 i() {
        d3 d3Var = new d3(-2);
        d3Var.c = false;
        d3Var.b = 16;
        return d3Var;
    }

    public static d3 j(ViewGroup.LayoutParams layoutParams) {
        d3 d3Var;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof d3) {
            d3 d3Var2 = (d3) layoutParams;
            d3Var = new d3(d3Var2);
            d3Var.c = d3Var2.c;
        } else {
            d3Var = new d3(layoutParams);
        }
        if (d3Var.b <= 0) {
            d3Var.b = 16;
        }
        return d3Var;
    }

    @Override // defpackage.hf1
    public final boolean a(lf1 lf1Var) {
        return this.w.q(lf1Var, null, 0);
    }

    @Override // defpackage.yf1
    public final void b(if1 if1Var) {
        this.w = if1Var;
    }

    @Override // defpackage.aa1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d3;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.aa1
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ z91 generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.aa1
    /* JADX INFO: renamed from: f */
    public final z91 generateLayoutParams(AttributeSet attributeSet) {
        return new d3(getContext(), attributeSet);
    }

    @Override // defpackage.aa1
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ z91 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // defpackage.aa1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.aa1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d3(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if1 if1Var = this.w;
        if (if1Var != null) {
            return if1Var;
        }
        Context context = getContext();
        if1 if1Var2 = new if1(context);
        this.w = if1Var2;
        if1Var2.e = new vz1(this);
        b3 b3Var = new b3(context);
        this.A = b3Var;
        b3Var.s = true;
        b3Var.t = true;
        b3Var.l = new vz1((byte) 16);
        this.w.b(b3Var, this.x);
        b3 b3Var2 = this.A;
        b3Var2.o = this;
        if1 if1Var3 = b3Var2.j;
        this.w = if1Var3;
        return if1Var3;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        b3 b3Var = this.A;
        a3 a3Var = b3Var.p;
        if (a3Var != null) {
            return a3Var.getDrawable();
        }
        if (b3Var.r) {
            return b3Var.q;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.y;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof c3)) {
            zB = ((c3) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof c3)) ? zB : zB | ((c3) childAt2).c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b3 b3Var = this.A;
        if (b3Var != null) {
            b3Var.g();
            if (this.A.h()) {
                this.A.d();
                this.A.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.A;
        if (b3Var != null) {
            b3Var.d();
            x2 x2Var = b3Var.A;
            if (x2Var == null || !x2Var.b()) {
                return;
            }
            x2Var.i.dismiss();
        }
    }

    @Override // defpackage.aa1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zA = r53.a(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                d3 d3Var = (d3) childAt.getLayoutParams();
                if (d3Var.c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) d3Var).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) d3Var).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) d3Var).leftMargin) + ((ViewGroup.MarginLayoutParams) d3Var).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                d3 d3Var2 = (d3) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !d3Var2.c) {
                    int i15 = width2 - ((ViewGroup.MarginLayoutParams) d3Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) d3Var2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            d3 d3Var3 = (d3) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !d3Var3.c) {
                int i18 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) d3Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((ViewGroup.MarginLayoutParams) d3Var3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v37 */
    @Override // defpackage.aa1, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        if1 if1Var;
        boolean z = this.B;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.B = z2;
        if (z != z2) {
            this.C = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.B && (if1Var = this.w) != null && size != this.C) {
            this.C = size;
            if1Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.B || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                d3 d3Var = (d3) getChildAt(i7).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) d3Var).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) d3Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.D;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.E;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                d3 d3Var2 = (d3) childAt.getLayoutParams();
                d3Var2.h = false;
                d3Var2.e = 0;
                d3Var2.d = 0;
                d3Var2.f = false;
                ((ViewGroup.MarginLayoutParams) d3Var2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) d3Var2).rightMargin = 0;
                d3Var2.g = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = d3Var2.c ? 1 : i10;
                d3 d3Var3 = (d3) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                d3Var3.f = !d3Var3.c && z6;
                d3Var3.d = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (d3Var2.f) {
                    i15++;
                }
                if (d3Var2.c) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                d3 d3Var4 = (d3) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (d3Var4.f) {
                    int i28 = d3Var4.d;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                d3 d3Var5 = (d3) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && d3Var5.g) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    d3Var5.d += r11;
                    d3Var5.h = r11;
                    i23--;
                } else if (d3Var5.d == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((d3) getChildAt(0).getLayoutParams()).g) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((d3) getChildAt(i31).getLayoutParams()).g) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    d3 d3Var6 = (d3) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        d3Var6.e = i32;
                        d3Var6.h = true;
                        if (i33 == 0 && !d3Var6.g) {
                            ((ViewGroup.MarginLayoutParams) d3Var6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (d3Var6.c) {
                        d3Var6.e = i32;
                        d3Var6.h = true;
                        ((ViewGroup.MarginLayoutParams) d3Var6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((ViewGroup.MarginLayoutParams) d3Var6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) d3Var6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                d3 d3Var7 = (d3) childAt4.getLayoutParams();
                if (d3Var7.h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((d3Var7.d * i22) + d3Var7.e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.A.x = z;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        b3 b3Var = this.A;
        a3 a3Var = b3Var.p;
        if (a3Var != null) {
            a3Var.setImageDrawable(drawable);
        } else {
            b3Var.r = true;
            b3Var.q = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.z = z;
    }

    public void setPopupTheme(int i) {
        if (this.y != i) {
            this.y = i;
            if (i == 0) {
                this.x = getContext();
            } else {
                this.x = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(b3 b3Var) {
        this.A = b3Var;
        b3Var.o = this;
        this.w = b3Var.j;
    }

    @Override // defpackage.aa1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public void setOnMenuItemClickListener(e3 e3Var) {
    }
}
