package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.b3;
import defpackage.df;
import defpackage.f3;
import defpackage.f52;
import defpackage.if1;
import defpackage.l53;
import defpackage.li1;
import defpackage.p2;
import defpackage.r53;
import defpackage.t43;
import defpackage.x2;
import defpackage.yf1;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final defpackage.c h;
    public final Context i;
    public ActionMenuView j;
    public b3 k;
    public int l;
    public l53 m;
    public boolean n;
    public boolean o;
    public CharSequence p;
    public CharSequence q;
    public View r;
    public View s;
    public LinearLayout t;
    public TextView u;
    public TextView v;
    public final int w;
    public final int x;
    public boolean y;
    public final int z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.h = new defpackage.c(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.i = context;
        } else {
            this.i = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f52.d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : df.a(context, resourceId);
        WeakHashMap weakHashMap = t43.a;
        setBackground(drawable);
        this.w = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.x = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.l = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int e(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int f(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public final void c(f3 f3Var) {
        View view = this.r;
        byte b = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.z, (ViewGroup) this, false);
            this.r = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.r);
        }
        this.r.findViewById(R.id.action_mode_close_button).setOnClickListener(new p2(f3Var, b));
        if1 if1VarF = f3Var.f();
        b3 b3Var = this.k;
        if (b3Var != null) {
            b3Var.d();
            x2 x2Var = b3Var.A;
            if (x2Var != null && x2Var.b()) {
                x2Var.i.dismiss();
            }
        }
        b3 b3Var2 = new b3(getContext());
        this.k = b3Var2;
        b3Var2.s = true;
        b3Var2.t = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        if1VarF.b(this.k, this.i);
        b3 b3Var3 = this.k;
        yf1 yf1Var = b3Var3.o;
        if (yf1Var == null) {
            yf1 yf1Var2 = (yf1) b3Var3.k.inflate(b3Var3.m, (ViewGroup) this, false);
            b3Var3.o = yf1Var2;
            yf1Var2.b(b3Var3.j);
            b3Var3.g();
        }
        yf1 yf1Var3 = b3Var3.o;
        if (yf1Var != yf1Var3) {
            ((ActionMenuView) yf1Var3).setPresenter(b3Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) yf1Var3;
        this.j = actionMenuView;
        WeakHashMap weakHashMap = t43.a;
        actionMenuView.setBackground(null);
        addView(this.j, layoutParams);
    }

    public final void d() {
        if (this.t == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.t = linearLayout;
            this.u = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.v = (TextView) this.t.findViewById(R.id.action_bar_subtitle);
            int i = this.w;
            if (i != 0) {
                this.u.setTextAppearance(getContext(), i);
            }
            int i2 = this.x;
            if (i2 != 0) {
                this.v.setTextAppearance(getContext(), i2);
            }
        }
        this.u.setText(this.p);
        this.v.setText(this.q);
        boolean zIsEmpty = TextUtils.isEmpty(this.p);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.q);
        this.v.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.t.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.t.getParent() == null) {
            addView(this.t);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            l53 l53Var = this.m;
            if (l53Var != null) {
                l53Var.b();
            }
            super.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.m != null ? this.h.b : getVisibility();
    }

    public int getContentHeight() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.q;
    }

    public CharSequence getTitle() {
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l53 h(int i, long j) {
        l53 l53Var = this.m;
        if (l53Var != null) {
            l53Var.b();
        }
        defpackage.c cVar = this.h;
        if (i != 0) {
            l53 l53VarA = t43.a(this);
            l53VarA.a(0.0f);
            l53VarA.c(j);
            cVar.c.m = l53VarA;
            cVar.b = i;
            l53VarA.d(cVar);
            return l53VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        l53 l53VarA2 = t43.a(this);
        l53VarA2.a(1.0f);
        l53VarA2.c(j);
        cVar.c.m = l53VarA2;
        cVar.b = i;
        l53VarA2.d(cVar);
        return l53VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, f52.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        b3 b3Var = this.k;
        if (b3Var != null) {
            Configuration configuration2 = b3Var.i.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            b3Var.w = i;
            if1 if1Var = b3Var.j;
            if (if1Var != null) {
                if1Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.k;
        if (b3Var != null) {
            b3Var.d();
            x2 x2Var = this.k.A;
            if (x2Var == null || !x2Var.b()) {
                return;
            }
            x2Var.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.o = false;
        }
        if (!this.o) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.o = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.o = false;
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean zA = r53.a(this);
        int paddingRight = zA ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.r;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.r.getLayoutParams();
            if (zA) {
                int i7 = marginLayoutParams.rightMargin;
                i5 = marginLayoutParams.leftMargin;
                i6 = paddingRight - i7;
            } else {
                int i8 = marginLayoutParams.leftMargin;
                i5 = marginLayoutParams.rightMargin;
                i6 = paddingRight + i8;
            }
            int iF = f(this.r, i6, paddingTop, paddingTop2, zA) + i6;
            paddingRight = zA ? iF - i5 : iF + i5;
        }
        LinearLayout linearLayout = this.t;
        if (linearLayout != null && this.s == null && linearLayout.getVisibility() != 8) {
            paddingRight += f(this.t, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view2 = this.s;
        if (view2 != null) {
            f(view2, paddingRight, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.j;
        if (actionMenuView != null) {
            f(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zA);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            li1.g(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            li1.g(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.l;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.r;
        if (view != null) {
            int iE = e(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.r.getLayoutParams();
            paddingLeft = iE - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.j;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = e(this.j, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.t;
        if (linearLayout != null && this.s == null) {
            if (this.y) {
                linearLayout.measure(0, iMakeMeasureSpec);
                int measuredWidth = this.t.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.t.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = e(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.s;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.s.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.l > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.n = false;
        }
        if (!this.n) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.n = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.n = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.l = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.s;
        if (view2 != null) {
            removeView(view2);
        }
        this.s = view;
        if (view != null && (linearLayout = this.t) != null) {
            removeView(linearLayout);
            this.t = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.q = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.p = charSequence;
        d();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.y) {
            requestLayout();
        }
        this.y = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
