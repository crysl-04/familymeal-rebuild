package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import defpackage.b3;
import defpackage.cy2;
import defpackage.df;
import defpackage.dy2;
import defpackage.eg;
import defpackage.ey2;
import defpackage.f52;
import defpackage.fy2;
import defpackage.hy2;
import defpackage.if1;
import defpackage.jy1;
import defpackage.jy2;
import defpackage.lf1;
import defpackage.p2;
import defpackage.q6;
import defpackage.r43;
import defpackage.r53;
import defpackage.t43;
import defpackage.tf;
import defpackage.w60;
import defpackage.xe;
import defpackage.ye;
import defpackage.yp2;
import defpackage.za2;
import java.util.ArrayList;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public za2 A;
    public int B;
    public int C;
    public final int D;
    public CharSequence E;
    public CharSequence F;
    public ColorStateList G;
    public ColorStateList H;
    public boolean I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public final int[] M;
    public final jy1 N;
    public jy2 O;
    public b3 P;
    public cy2 Q;
    public boolean R;
    public final q6 S;
    public ActionMenuView h;
    public tf i;
    public tf j;
    public xe k;
    public ye l;
    public final Drawable m;
    public final CharSequence n;
    public xe o;
    public View p;
    public Context q;
    public int r;
    public int s;
    public int t;
    public final int u;
    public final int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.D = 8388627;
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new int[2];
        this.N = new jy1(this, (byte) 25);
        this.S = new q6(this, (byte) 9);
        Context context2 = getContext();
        int[] iArr = f52.x;
        eg egVarW = eg.w(context2, attributeSet, iArr, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) egVarW.i;
        WeakHashMap weakHashMap = t43.a;
        r43.b(this, context, iArr, attributeSet, typedArray, R.attr.toolbarStyle, 0);
        TypedArray typedArray2 = (TypedArray) egVarW.i;
        this.s = typedArray2.getResourceId(28, 0);
        this.t = typedArray2.getResourceId(19, 0);
        this.D = typedArray2.getInteger(0, 8388627);
        this.u = typedArray2.getInteger(2, 48);
        int dimensionPixelOffset = typedArray2.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray2.hasValue(27) ? typedArray2.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.z = dimensionPixelOffset;
        this.y = dimensionPixelOffset;
        this.x = dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray2.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.w = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray2.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.x = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray2.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.y = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray2.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.z = dimensionPixelOffset5;
        }
        this.v = typedArray2.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray2.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray2.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(8, 0);
        d();
        za2 za2Var = this.A;
        za2Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            za2Var.e = dimensionPixelSize;
            za2Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            za2Var.f = dimensionPixelSize2;
            za2Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            za2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.B = typedArray2.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.C = typedArray2.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.m = egVarW.k(4);
        this.n = typedArray2.getText(3);
        CharSequence text = typedArray2.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray2.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.q = getContext();
        setPopupTheme(typedArray2.getResourceId(17, 0));
        Drawable drawableK = egVarW.k(16);
        if (drawableK != null) {
            setNavigationIcon(drawableK);
        }
        CharSequence text3 = typedArray2.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableK2 = egVarW.k(11);
        if (drawableK2 != null) {
            setLogo(drawableK2);
        }
        CharSequence text4 = typedArray2.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray2.hasValue(29)) {
            setTitleTextColor(egVarW.h(29));
        }
        if (typedArray2.hasValue(20)) {
            setSubtitleTextColor(egVarW.h(20));
        }
        if (typedArray2.hasValue(14)) {
            getMenuInflater().inflate(typedArray2.getResourceId(14, 0), getMenu());
        }
        egVarW.A();
    }

    private MenuInflater getMenuInflater() {
        return new yp2(getContext());
    }

    public static dy2 h() {
        dy2 dy2Var = new dy2(-2, -2);
        dy2Var.b = (byte) 0;
        dy2Var.a = 8388627;
        return dy2Var;
    }

    public static dy2 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof dy2;
        if (z) {
            dy2 dy2Var = (dy2) layoutParams;
            dy2 dy2Var2 = new dy2(dy2Var);
            dy2Var2.b = (byte) 0;
            dy2Var2.b = dy2Var.b;
            return dy2Var2;
        }
        if (z) {
            dy2 dy2Var3 = new dy2((dy2) layoutParams);
            dy2Var3.b = (byte) 0;
            return dy2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            dy2 dy2Var4 = new dy2(layoutParams);
            dy2Var4.b = (byte) 0;
            return dy2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        dy2 dy2Var5 = new dy2(marginLayoutParams);
        dy2Var5.b = (byte) 0;
        ((ViewGroup.MarginLayoutParams) dy2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) dy2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) dy2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) dy2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return dy2Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        WeakHashMap weakHashMap = t43.a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                dy2 dy2Var = (dy2) childAt.getLayoutParams();
                if (dy2Var.b == 0 && r(childAt)) {
                    int i3 = dy2Var.a;
                    WeakHashMap weakHashMap2 = t43.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            dy2 dy2Var2 = (dy2) childAt2.getLayoutParams();
            if (dy2Var2.b == 0 && r(childAt2)) {
                int i5 = dy2Var2.a;
                WeakHashMap weakHashMap3 = t43.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        dy2 dy2VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            dy2VarI = h();
        } else {
            dy2VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (dy2) layoutParams;
        }
        dy2VarI.b = (byte) 1;
        if (!z || this.p == null) {
            addView(view, dy2VarI);
        } else {
            view.setLayoutParams(dy2VarI);
            this.L.add(view);
        }
    }

    public final void c() {
        if (this.o == null) {
            xe xeVar = new xe(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.o = xeVar;
            xeVar.setImageDrawable(this.m);
            this.o.setContentDescription(this.n);
            dy2 dy2VarH = h();
            dy2VarH.a = (this.u & 112) | 8388611;
            dy2VarH.b = (byte) 2;
            this.o.setLayoutParams(dy2VarH);
            this.o.setOnClickListener(new p2(this, (byte) 2));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof dy2);
    }

    public final void d() {
        if (this.A == null) {
            za2 za2Var = new za2();
            za2Var.a = 0;
            za2Var.b = 0;
            za2Var.c = Integer.MIN_VALUE;
            za2Var.d = Integer.MIN_VALUE;
            za2Var.e = 0;
            za2Var.f = 0;
            za2Var.g = false;
            za2Var.h = false;
            this.A = za2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView.w == null) {
            if1 if1Var = (if1) actionMenuView.getMenu();
            if (this.Q == null) {
                this.Q = new cy2(this);
            }
            this.h.setExpandedActionViewsExclusive(true);
            if1Var.b(this.Q, this.q);
        }
    }

    public final void f() {
        if (this.h == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.h = actionMenuView;
            actionMenuView.setPopupTheme(this.r);
            this.h.setOnMenuItemClickListener(this.N);
            this.h.getClass();
            dy2 dy2VarH = h();
            dy2VarH.a = (this.u & 112) | 8388613;
            this.h.setLayoutParams(dy2VarH);
            b(this.h, false);
        }
    }

    public final void g() {
        if (this.k == null) {
            this.k = new xe(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            dy2 dy2VarH = h();
            dy2VarH.a = (this.u & 112) | 8388611;
            this.k.setLayoutParams(dy2VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        dy2 dy2Var = new dy2(context, attributeSet);
        dy2Var.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f52.b);
        dy2Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        dy2Var.b = (byte) 0;
        return dy2Var;
    }

    public CharSequence getCollapseContentDescription() {
        xe xeVar = this.o;
        if (xeVar != null) {
            return xeVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        xe xeVar = this.o;
        if (xeVar != null) {
            return xeVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        za2 za2Var = this.A;
        if (za2Var != null) {
            return za2Var.g ? za2Var.a : za2Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.C;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        za2 za2Var = this.A;
        if (za2Var != null) {
            return za2Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        za2 za2Var = this.A;
        if (za2Var != null) {
            return za2Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        za2 za2Var = this.A;
        if (za2Var != null) {
            return za2Var.g ? za2Var.b : za2Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.B;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        if1 if1Var;
        ActionMenuView actionMenuView = this.h;
        return (actionMenuView == null || (if1Var = actionMenuView.w) == null || !if1Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.C, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = t43.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = t43.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.B, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ye yeVar = this.l;
        if (yeVar != null) {
            return yeVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ye yeVar = this.l;
        if (yeVar != null) {
            return yeVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.h.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        xe xeVar = this.k;
        if (xeVar != null) {
            return xeVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        xe xeVar = this.k;
        if (xeVar != null) {
            return xeVar.getDrawable();
        }
        return null;
    }

    public b3 getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.h.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.q;
    }

    public int getPopupTheme() {
        return this.r;
    }

    public CharSequence getSubtitle() {
        return this.F;
    }

    public final TextView getSubtitleTextView() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.E;
    }

    public int getTitleMarginBottom() {
        return this.z;
    }

    public int getTitleMarginEnd() {
        return this.x;
    }

    public int getTitleMarginStart() {
        return this.w;
    }

    public int getTitleMarginTop() {
        return this.y;
    }

    public final TextView getTitleTextView() {
        return this.i;
    }

    public w60 getWrapper() {
        Drawable drawable;
        jy2 jy2Var = this.O;
        if (jy2Var == null) {
            jy2Var = new jy2();
            jy2Var.n = 0;
            jy2Var.a = this;
            jy2Var.h = getTitle();
            jy2Var.i = getSubtitle();
            jy2Var.g = jy2Var.h != null;
            jy2Var.f = getNavigationIcon();
            eg egVarW = eg.w(getContext(), null, f52.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) egVarW.i;
            jy2Var.o = egVarW.k(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                jy2Var.g = true;
                jy2Var.h = text;
                if ((jy2Var.b & 8) != 0) {
                    setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                jy2Var.i = text2;
                if ((jy2Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableK = egVarW.k(20);
            if (drawableK != null) {
                jy2Var.e = drawableK;
                jy2Var.c();
            }
            Drawable drawableK2 = egVarW.k(17);
            if (drawableK2 != null) {
                jy2Var.d = drawableK2;
                jy2Var.c();
            }
            if (jy2Var.f == null && (drawable = jy2Var.o) != null) {
                jy2Var.f = drawable;
                if ((jy2Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            jy2Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = jy2Var.c;
                if (view != null && (jy2Var.b & 16) != 0) {
                    removeView(view);
                }
                jy2Var.c = viewInflate;
                if (viewInflate != null && (jy2Var.b & 16) != 0) {
                    addView(viewInflate);
                }
                jy2Var.a(jy2Var.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.A.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.s = resourceId2;
                tf tfVar = this.i;
                if (tfVar != null) {
                    tfVar.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.t = resourceId3;
                tf tfVar2 = this.j;
                if (tfVar2 != null) {
                    tfVar2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            egVarW.A();
            if (R.string.abc_action_bar_up_description != jy2Var.n) {
                jy2Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = jy2Var.n;
                    jy2Var.j = i != 0 ? getContext().getString(i) : null;
                    jy2Var.b();
                }
            }
            jy2Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new hy2(jy2Var));
            this.O = jy2Var;
        }
        return jy2Var;
    }

    public final int j(View view, int i) {
        dy2 dy2Var = (dy2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = dy2Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.D & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) dy2Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) dy2Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) dy2Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.L.contains(view);
    }

    public final int n(View view, int i, int i2, int[] iArr) {
        dy2 dy2Var = (dy2) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) dy2Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) dy2Var).rightMargin + iMax;
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        dy2 dy2Var = (dy2) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) dy2Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) dy2Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.J = false;
        }
        if (!this.J) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.J = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.J = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0249  */
    /* JADX WARN: Code duplicated, block: B:101:0x026b  */
    /* JADX WARN: Code duplicated, block: B:103:0x026e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0280 A[LOOP:0: B:105:0x027e->B:106:0x0280, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0298 A[LOOP:1: B:108:0x0296->B:109:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02b8 A[LOOP:2: B:111:0x02b6->B:112:0x02b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x02fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:117:0x0303  */
    /* JADX WARN: Code duplicated, block: B:120:0x030a A[LOOP:3: B:119:0x0308->B:120:0x030a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:49:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:66:0x0155  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    /* JADX WARN: Code duplicated, block: B:71:0x016c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0178  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184  */
    /* JADX WARN: Code duplicated, block: B:76:0x018e  */
    /* JADX WARN: Code duplicated, block: B:78:0x019b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01da  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0201  */
    /* JADX WARN: Code duplicated, block: B:91:0x0209 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x020b  */
    /* JADX WARN: Code duplicated, block: B:94:0x020f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0223  */
    /* JADX WARN: Code duplicated, block: B:98:0x0246  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iN;
        int iO;
        int iMax;
        int iMin;
        boolean zR;
        boolean zR2;
        int measuredHeight;
        tf tfVar;
        ArrayList arrayList;
        int size;
        int iN2;
        int i5;
        int size2;
        int i6;
        int i7;
        int size3;
        int i8;
        int i9;
        int measuredWidth;
        int i10;
        int i11;
        int i12;
        int size4;
        tf tfVar2;
        dy2 dy2Var;
        dy2 dy2Var2;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iMax2;
        int i22;
        int i23;
        int i24;
        int i25;
        ye yeVar;
        View view;
        ActionMenuView actionMenuView;
        xe xeVar;
        WeakHashMap weakHashMap = t43.a;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.M;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (r(this.k)) {
            xe xeVar2 = this.k;
            if (z3) {
                iO = o(xeVar2, i26, iMin2, iArr);
                iN = paddingLeft;
            } else {
                iN = n(xeVar2, paddingLeft, iMin2, iArr);
            }
            if (r(this.o)) {
                xeVar = this.o;
                if (z3) {
                    iO = o(xeVar, iO, iMin2, iArr);
                } else {
                    iN = n(xeVar, iN, iMin2, iArr);
                }
            }
            if (r(this.h)) {
                actionMenuView = this.h;
                if (z3) {
                    iN = n(actionMenuView, iN, iMin2, iArr);
                } else {
                    iO = o(actionMenuView, iO, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iN);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iO));
            iMax = Math.max(iN, currentContentInsetLeft);
            iMin = Math.min(iO, i26 - currentContentInsetRight);
            if (r(this.p)) {
                view = this.p;
                if (z3) {
                    iMin = o(view, iMin, iMin2, iArr);
                } else {
                    iMax = n(view, iMax, iMin2, iArr);
                }
            }
            if (r(this.l)) {
                yeVar = this.l;
                if (z3) {
                    iMin = o(yeVar, iMin, iMin2, iArr);
                } else {
                    iMax = n(yeVar, iMax, iMin2, iArr);
                }
            }
            zR = r(this.i);
            zR2 = r(this.j);
            if (zR) {
                dy2 dy2Var3 = (dy2) this.i.getLayoutParams();
                measuredHeight = this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dy2Var3).topMargin + ((ViewGroup.MarginLayoutParams) dy2Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zR2) {
                dy2 dy2Var4 = (dy2) this.j.getLayoutParams();
                measuredHeight = this.j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dy2Var4).topMargin + ((ViewGroup.MarginLayoutParams) dy2Var4).bottomMargin + measuredHeight;
            }
            if (!zR) {
                if (zR2) {
                    tfVar = this.j;
                }
                arrayList = this.K;
                a(arrayList, 3);
                size = arrayList.size();
                iN2 = iMax;
                for (i5 = 0; i5 < size; i5++) {
                    iN2 = n((View) arrayList.get(i5), iN2, iMin2, iArr);
                }
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i6 = 0; i6 < size2; i6++) {
                    iMin = o((View) arrayList.get(i6), iMin, iMin2, iArr);
                }
                a(arrayList, 1);
                int i27 = iArr[0];
                i7 = iArr[1];
                size3 = arrayList.size();
                i8 = i27;
                i9 = 0;
                measuredWidth = 0;
                while (i9 < size3) {
                    View view2 = (View) arrayList.get(i9);
                    dy2 dy2Var5 = (dy2) view2.getLayoutParams();
                    int i28 = i7;
                    int i29 = ((ViewGroup.MarginLayoutParams) dy2Var5).leftMargin - i8;
                    int i30 = ((ViewGroup.MarginLayoutParams) dy2Var5).rightMargin - i28;
                    int iMax3 = Math.max(0, i29);
                    int iMax4 = Math.max(0, i30);
                    int iMax5 = Math.max(0, -i29);
                    int iMax6 = Math.max(0, -i30);
                    measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                    i9++;
                    i8 = iMax5;
                    i7 = iMax6;
                }
                i11 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
                i12 = measuredWidth + i11;
                if (i11 >= iN2) {
                    if (i12 > iMin) {
                        iN2 = i11 - (i12 - iMin);
                    } else {
                        iN2 = i11;
                    }
                }
                size4 = arrayList.size();
                for (i10 = 0; i10 < size4; i10++) {
                    iN2 = n((View) arrayList.get(i10), iN2, iMin2, iArr);
                }
                arrayList.clear();
            }
            tfVar = this.i;
            if (zR2) {
                tfVar2 = this.j;
            } else {
                tfVar2 = this.i;
            }
            dy2Var = (dy2) tfVar.getLayoutParams();
            dy2Var2 = (dy2) tfVar2.getLayoutParams();
            i13 = measuredHeight;
            z2 = (!zR && this.i.getMeasuredWidth() > 0) || (zR2 && this.j.getMeasuredWidth() > 0);
            i14 = this.D & 112;
            i15 = iMax;
            if (i14 != 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) dy2Var).topMargin + this.y;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) dy2Var).topMargin + this.y;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) dy2Var).bottomMargin;
                    i25 = this.z;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) dy2Var2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) dy2Var2).bottomMargin) - this.z) - i13;
            }
            if (z3) {
                if (z2) {
                    i19 = this.w;
                } else {
                    i19 = 0;
                }
                int i31 = i19 - iArr[1];
                iMin -= Math.max(0, i31);
                iArr[1] = Math.max(0, -i31);
                if (zR) {
                    dy2 dy2Var6 = (dy2) this.i.getLayoutParams();
                    int measuredWidth2 = iMin - this.i.getMeasuredWidth();
                    int measuredHeight2 = this.i.getMeasuredHeight() + paddingTop;
                    this.i.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                    i20 = measuredWidth2 - this.x;
                    paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) dy2Var6).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zR2) {
                    int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((dy2) this.j.getLayoutParams())).topMargin;
                    this.j.layout(iMin - this.j.getMeasuredWidth(), i32, iMin, this.j.getMeasuredHeight() + i32);
                    i21 = iMin - this.x;
                } else {
                    i21 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i20, i21);
                }
                iMax = i15;
            } else {
                if (z2) {
                    i16 = this.w;
                } else {
                    i16 = 0;
                }
                int i33 = i16 - iArr[0];
                iMax = Math.max(0, i33) + i15;
                iArr[0] = Math.max(0, -i33);
                if (zR) {
                    dy2 dy2Var7 = (dy2) this.i.getLayoutParams();
                    int measuredWidth3 = this.i.getMeasuredWidth() + iMax;
                    int measuredHeight3 = this.i.getMeasuredHeight() + paddingTop;
                    this.i.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                    i17 = measuredWidth3 + this.x;
                    paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) dy2Var7).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zR2) {
                    int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((dy2) this.j.getLayoutParams())).topMargin;
                    int measuredWidth4 = this.j.getMeasuredWidth() + iMax;
                    this.j.layout(iMax, i34, measuredWidth4, this.j.getMeasuredHeight() + i34);
                    i18 = measuredWidth4 + this.x;
                } else {
                    i18 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i17, i18);
                }
            }
            arrayList = this.K;
            a(arrayList, 3);
            size = arrayList.size();
            iN2 = iMax;
            while (i5 < size) {
                iN2 = n((View) arrayList.get(i5), iN2, iMin2, iArr);
            }
            a(arrayList, 5);
            size2 = arrayList.size();
            while (i6 < size2) {
                iMin = o((View) arrayList.get(i6), iMin, iMin2, iArr);
            }
            a(arrayList, 1);
            int i210 = iArr[0];
            i7 = iArr[1];
            size3 = arrayList.size();
            i8 = i210;
            i9 = 0;
            measuredWidth = 0;
            while (i9 < size3) {
                View view3 = (View) arrayList.get(i9);
                dy2 dy2Var8 = (dy2) view3.getLayoutParams();
                int i211 = i7;
                int i212 = ((ViewGroup.MarginLayoutParams) dy2Var8).leftMargin - i8;
                int i35 = ((ViewGroup.MarginLayoutParams) dy2Var8).rightMargin - i211;
                int iMax7 = Math.max(0, i212);
                int iMax8 = Math.max(0, i35);
                int iMax9 = Math.max(0, -i212);
                int iMax10 = Math.max(0, -i35);
                measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
                i9++;
                i8 = iMax9;
                i7 = iMax10;
            }
            i11 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i12 = measuredWidth + i11;
            if (i11 >= iN2) {
                if (i12 > iMin) {
                    iN2 = i11 - (i12 - iMin);
                } else {
                    iN2 = i11;
                }
            }
            size4 = arrayList.size();
            while (i10 < size4) {
                iN2 = n((View) arrayList.get(i10), iN2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iN = paddingLeft;
        iO = i26;
        if (r(this.o)) {
            xeVar = this.o;
            if (z3) {
                iO = o(xeVar, iO, iMin2, iArr);
            } else {
                iN = n(xeVar, iN, iMin2, iArr);
            }
        }
        if (r(this.h)) {
            actionMenuView = this.h;
            if (z3) {
                iN = n(actionMenuView, iN, iMin2, iArr);
            } else {
                iO = o(actionMenuView, iO, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iN);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iO));
        iMax = Math.max(iN, currentContentInsetLeft2);
        iMin = Math.min(iO, i26 - currentContentInsetRight2);
        if (r(this.p)) {
            view = this.p;
            if (z3) {
                iMin = o(view, iMin, iMin2, iArr);
            } else {
                iMax = n(view, iMax, iMin2, iArr);
            }
        }
        if (r(this.l)) {
            yeVar = this.l;
            if (z3) {
                iMin = o(yeVar, iMin, iMin2, iArr);
            } else {
                iMax = n(yeVar, iMax, iMin2, iArr);
            }
        }
        zR = r(this.i);
        zR2 = r(this.j);
        if (zR) {
            dy2 dy2Var9 = (dy2) this.i.getLayoutParams();
            measuredHeight = this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dy2Var9).topMargin + ((ViewGroup.MarginLayoutParams) dy2Var9).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zR2) {
            dy2 dy2Var10 = (dy2) this.j.getLayoutParams();
            measuredHeight = this.j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dy2Var10).topMargin + ((ViewGroup.MarginLayoutParams) dy2Var10).bottomMargin + measuredHeight;
        }
        if (!zR) {
            if (zR2) {
                tfVar = this.j;
            }
            arrayList = this.K;
            a(arrayList, 3);
            size = arrayList.size();
            iN2 = iMax;
            while (i5 < size) {
                iN2 = n((View) arrayList.get(i5), iN2, iMin2, iArr);
            }
            a(arrayList, 5);
            size2 = arrayList.size();
            while (i6 < size2) {
                iMin = o((View) arrayList.get(i6), iMin, iMin2, iArr);
            }
            a(arrayList, 1);
            int i213 = iArr[0];
            i7 = iArr[1];
            size3 = arrayList.size();
            i8 = i213;
            i9 = 0;
            measuredWidth = 0;
            while (i9 < size3) {
                View view4 = (View) arrayList.get(i9);
                dy2 dy2Var11 = (dy2) view4.getLayoutParams();
                int i214 = i7;
                int i215 = ((ViewGroup.MarginLayoutParams) dy2Var11).leftMargin - i8;
                int i36 = ((ViewGroup.MarginLayoutParams) dy2Var11).rightMargin - i214;
                int iMax11 = Math.max(0, i215);
                int iMax12 = Math.max(0, i36);
                int iMax13 = Math.max(0, -i215);
                int iMax14 = Math.max(0, -i36);
                measuredWidth += view4.getMeasuredWidth() + iMax11 + iMax12;
                i9++;
                i8 = iMax13;
                i7 = iMax14;
            }
            i11 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i12 = measuredWidth + i11;
            if (i11 >= iN2) {
                if (i12 > iMin) {
                    iN2 = i11 - (i12 - iMin);
                } else {
                    iN2 = i11;
                }
            }
            size4 = arrayList.size();
            while (i10 < size4) {
                iN2 = n((View) arrayList.get(i10), iN2, iMin2, iArr);
            }
            arrayList.clear();
        }
        tfVar = this.i;
        if (zR2) {
            tfVar2 = this.j;
        } else {
            tfVar2 = this.i;
        }
        dy2Var = (dy2) tfVar.getLayoutParams();
        dy2Var2 = (dy2) tfVar2.getLayoutParams();
        i13 = measuredHeight;
        if (zR) {
        }
        i14 = this.D & 112;
        i15 = iMax;
        if (i14 != 48) {
            paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) dy2Var).topMargin + this.y;
        } else if (i14 != 80) {
            iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
            i22 = ((ViewGroup.MarginLayoutParams) dy2Var).topMargin + this.y;
            if (iMax2 < i22) {
                iMax2 = i22;
            } else {
                i23 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                i24 = ((ViewGroup.MarginLayoutParams) dy2Var).bottomMargin;
                i25 = this.z;
                if (i23 < i24 + i25) {
                    iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) dy2Var2).bottomMargin + i25) - i23));
                }
            }
            paddingTop = paddingTop2 + iMax2;
        } else {
            paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) dy2Var2).bottomMargin) - this.z) - i13;
        }
        if (z3) {
            if (z2) {
                i19 = this.w;
            } else {
                i19 = 0;
            }
            int i37 = i19 - iArr[1];
            iMin -= Math.max(0, i37);
            iArr[1] = Math.max(0, -i37);
            if (zR) {
                dy2 dy2Var12 = (dy2) this.i.getLayoutParams();
                int measuredWidth5 = iMin - this.i.getMeasuredWidth();
                int measuredHeight4 = this.i.getMeasuredHeight() + paddingTop;
                this.i.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                i20 = measuredWidth5 - this.x;
                paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) dy2Var12).bottomMargin;
            } else {
                i20 = iMin;
            }
            if (zR2) {
                int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((dy2) this.j.getLayoutParams())).topMargin;
                this.j.layout(iMin - this.j.getMeasuredWidth(), i38, iMin, this.j.getMeasuredHeight() + i38);
                i21 = iMin - this.x;
            } else {
                i21 = iMin;
            }
            if (z2) {
                iMin = Math.min(i20, i21);
            }
            iMax = i15;
        } else {
            if (z2) {
                i16 = this.w;
            } else {
                i16 = 0;
            }
            int i39 = i16 - iArr[0];
            iMax = Math.max(0, i39) + i15;
            iArr[0] = Math.max(0, -i39);
            if (zR) {
                dy2 dy2Var13 = (dy2) this.i.getLayoutParams();
                int measuredWidth6 = this.i.getMeasuredWidth() + iMax;
                int measuredHeight5 = this.i.getMeasuredHeight() + paddingTop;
                this.i.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                i17 = measuredWidth6 + this.x;
                paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) dy2Var13).bottomMargin;
            } else {
                i17 = iMax;
            }
            if (zR2) {
                int i310 = paddingTop + ((ViewGroup.MarginLayoutParams) ((dy2) this.j.getLayoutParams())).topMargin;
                int measuredWidth7 = this.j.getMeasuredWidth() + iMax;
                this.j.layout(iMax, i310, measuredWidth7, this.j.getMeasuredHeight() + i310);
                i18 = measuredWidth7 + this.x;
            } else {
                i18 = iMax;
            }
            if (z2) {
                iMax = Math.max(i17, i18);
            }
        }
        arrayList = this.K;
        a(arrayList, 3);
        size = arrayList.size();
        iN2 = iMax;
        while (i5 < size) {
            iN2 = n((View) arrayList.get(i5), iN2, iMin2, iArr);
        }
        a(arrayList, 5);
        size2 = arrayList.size();
        while (i6 < size2) {
            iMin = o((View) arrayList.get(i6), iMin, iMin2, iArr);
        }
        a(arrayList, 1);
        int i216 = iArr[0];
        i7 = iArr[1];
        size3 = arrayList.size();
        i8 = i216;
        i9 = 0;
        measuredWidth = 0;
        while (i9 < size3) {
            View view5 = (View) arrayList.get(i9);
            dy2 dy2Var14 = (dy2) view5.getLayoutParams();
            int i217 = i7;
            int i218 = ((ViewGroup.MarginLayoutParams) dy2Var14).leftMargin - i8;
            int i311 = ((ViewGroup.MarginLayoutParams) dy2Var14).rightMargin - i217;
            int iMax15 = Math.max(0, i218);
            int iMax16 = Math.max(0, i311);
            int iMax17 = Math.max(0, -i218);
            int iMax18 = Math.max(0, -i311);
            measuredWidth += view5.getMeasuredWidth() + iMax15 + iMax16;
            i9++;
            i8 = iMax17;
            i7 = iMax18;
        }
        i11 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i12 = measuredWidth + i11;
        if (i11 >= iN2) {
            if (i12 > iMin) {
                iN2 = i11 - (i12 - iMin);
            } else {
                iN2 = i11;
            }
        }
        size4 = arrayList.size();
        while (i10 < size4) {
            iN2 = n((View) arrayList.get(i10), iN2, iMin2, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = r53.a(this);
        int i3 = !zA ? 1 : 0;
        int i4 = 0;
        if (r(this.k)) {
            q(this.k, i, 0, i2, this.v);
            iK = k(this.k) + this.k.getMeasuredWidth();
            iMax = Math.max(0, l(this.k) + this.k.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.k.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (r(this.o)) {
            q(this.o, i, 0, i2, this.v);
            iK = k(this.o) + this.o.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.o) + this.o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.o.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.M;
        iArr[zA ? 1 : 0] = iMax4;
        if (r(this.h)) {
            q(this.h, i, iMax3, i2, this.v);
            iK2 = k(this.h) + this.h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.h) + this.h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[i3] = Math.max(0, currentContentInsetEnd - iK2);
        if (r(this.p)) {
            iMax5 += p(this.p, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.p) + this.p.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.p.getMeasuredState());
        }
        if (r(this.l)) {
            iMax5 += p(this.l, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.l) + this.l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.l.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((dy2) childAt.getLayoutParams()).b == 0 && r(childAt)) {
                iMax5 += p(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i6 = iMax5;
        int i7 = this.y + this.z;
        int i8 = this.w + this.x;
        if (r(this.i)) {
            p(this.i, i, i6 + i8, i2, i7, iArr);
            int iK3 = k(this.i) + this.i.getMeasuredWidth();
            iL = l(this.i) + this.i.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (r(this.j)) {
            iMax2 = Math.max(iMax2, p(this.j, i, i6 + i8, i2, i7 + iL, iArr));
            iL += l(this.j) + this.j.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.j.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i6 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.R) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof fy2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fy2 fy2Var = (fy2) parcelable;
        super.onRestoreInstanceState(fy2Var.h);
        ActionMenuView actionMenuView = this.h;
        if1 if1Var = actionMenuView != null ? actionMenuView.w : null;
        int i = fy2Var.j;
        if (i != 0 && this.Q != null && if1Var != null && (menuItemFindItem = if1Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (fy2Var.k) {
            q6 q6Var = this.S;
            removeCallbacks(q6Var);
            post(q6Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        za2 za2Var = this.A;
        boolean z = i == 1;
        if (z == za2Var.g) {
            return;
        }
        za2Var.g = z;
        if (!za2Var.h) {
            za2Var.a = za2Var.e;
            za2Var.b = za2Var.f;
            return;
        }
        if (z) {
            int i2 = za2Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = za2Var.e;
            }
            za2Var.a = i2;
            int i3 = za2Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = za2Var.f;
            }
            za2Var.b = i3;
            return;
        }
        int i4 = za2Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = za2Var.e;
        }
        za2Var.a = i4;
        int i5 = za2Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = za2Var.f;
        }
        za2Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b3 b3Var;
        lf1 lf1Var;
        fy2 fy2Var = new fy2(super.onSaveInstanceState());
        cy2 cy2Var = this.Q;
        if (cy2Var != null && (lf1Var = cy2Var.i) != null) {
            fy2Var.j = lf1Var.a;
        }
        ActionMenuView actionMenuView = this.h;
        fy2Var.k = (actionMenuView == null || (b3Var = actionMenuView.A) == null || !b3Var.h()) ? false : true;
        return fy2Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = false;
        }
        if (!this.I) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.I = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.I = false;
        return true;
    }

    public final int p(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void q(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        xe xeVar = this.o;
        if (xeVar != null) {
            xeVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.o.setImageDrawable(drawable);
        } else {
            xe xeVar = this.o;
            if (xeVar != null) {
                xeVar.setImageDrawable(this.m);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.R = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.C) {
            this.C = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.B) {
            this.B = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        ye yeVar = this.l;
        if (drawable != null) {
            if (yeVar == null) {
                yeVar = new ye(getContext(), null, 0);
                this.l = yeVar;
            }
            if (!m(yeVar)) {
                b(this.l, true);
            }
        } else if (yeVar != null && m(yeVar)) {
            removeView(this.l);
            this.L.remove(this.l);
        }
        ye yeVar2 = this.l;
        if (yeVar2 != null) {
            yeVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.l == null) {
            this.l = new ye(getContext(), null, 0);
        }
        ye yeVar = this.l;
        if (yeVar != null) {
            yeVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        xe xeVar = this.k;
        if (xeVar != null) {
            xeVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!m(this.k)) {
                b(this.k, true);
            }
        } else {
            xe xeVar = this.k;
            if (xeVar != null && m(xeVar)) {
                removeView(this.k);
                this.L.remove(this.k);
            }
        }
        xe xeVar2 = this.k;
        if (xeVar2 != null) {
            xeVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.k.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.h.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        tf tfVar = this.j;
        if (!zIsEmpty) {
            if (tfVar == null) {
                Context context = getContext();
                tf tfVar2 = new tf(context, null);
                this.j = tfVar2;
                tfVar2.setSingleLine();
                this.j.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.t;
                if (i != 0) {
                    this.j.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.j.setTextColor(colorStateList);
                }
            }
            if (!m(this.j)) {
                b(this.j, true);
            }
        } else if (tfVar != null && m(tfVar)) {
            removeView(this.j);
            this.L.remove(this.j);
        }
        tf tfVar3 = this.j;
        if (tfVar3 != null) {
            tfVar3.setText(charSequence);
        }
        this.F = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        tf tfVar = this.j;
        if (tfVar != null) {
            tfVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        tf tfVar = this.i;
        if (!zIsEmpty) {
            if (tfVar == null) {
                Context context = getContext();
                tf tfVar2 = new tf(context, null);
                this.i = tfVar2;
                tfVar2.setSingleLine();
                this.i.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.s;
                if (i != 0) {
                    this.i.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.i.setTextColor(colorStateList);
                }
            }
            if (!m(this.i)) {
                b(this.i, true);
            }
        } else if (tfVar != null && m(tfVar)) {
            removeView(this.i);
            this.L.remove(this.i);
        }
        tf tfVar3 = this.i;
        if (tfVar3 != null) {
            tfVar3.setText(charSequence);
        }
        this.E = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.z = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.x = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.w = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.y = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        tf tfVar = this.i;
        if (tfVar != null) {
            tfVar.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(df.a(getContext(), i));
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setOnMenuItemClickListener(ey2 ey2Var) {
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(df.a(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(df.a(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
