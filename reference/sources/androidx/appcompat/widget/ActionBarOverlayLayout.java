package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import defpackage.a83;
import defpackage.b3;
import defpackage.b83;
import defpackage.c83;
import defpackage.cy2;
import defpackage.df;
import defpackage.fn1;
import defpackage.gn1;
import defpackage.if1;
import defpackage.j73;
import defpackage.ji0;
import defpackage.jy2;
import defpackage.li1;
import defpackage.m83;
import defpackage.n53;
import defpackage.o43;
import defpackage.ox0;
import defpackage.q2;
import defpackage.q83;
import defpackage.r2;
import defpackage.s2;
import defpackage.t2;
import defpackage.t43;
import defpackage.vf1;
import defpackage.w60;
import defpackage.w73;
import defpackage.x73;
import defpackage.y73;
import defpackage.z73;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements fn1, gn1 {
    public static final int[] I = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public q83 A;
    public s2 B;
    public OverScroller C;
    public ViewPropertyAnimator D;
    public final q2 E;
    public final r2 F;
    public final r2 G;
    public final ji0 H;
    public int h;
    public int i;
    public ContentFrameLayout j;
    public ActionBarContainer k;
    public w60 l;
    public Drawable m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public final Rect u;
    public final Rect v;
    public final Rect w;
    public q83 x;
    public q83 y;
    public q83 z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0;
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        q83 q83Var = q83.b;
        this.x = q83Var;
        this.y = q83Var;
        this.z = q83Var;
        this.A = q83Var;
        this.E = new q2(this);
        this.F = new r2(this, (byte) 0);
        this.G = new r2(this, (byte) 1);
        i(context);
        this.H = new ji0();
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        t2 t2Var = (t2) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) t2Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) t2Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) t2Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) t2Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) t2Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) t2Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) t2Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) t2Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.fn1
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.fn1
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.gn1
    public final void c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        d(nestedScrollView, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t2;
    }

    @Override // defpackage.fn1
    public final void d(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(nestedScrollView, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.m == null || this.n) {
            return;
        }
        if (this.k.getVisibility() == 0) {
            translationY = (int) (this.k.getTranslationY() + this.k.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.m.setBounds(0, translationY, getWidth(), this.m.getIntrinsicHeight() + translationY);
        this.m.draw(canvas);
    }

    @Override // defpackage.fn1
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new t2(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new t2(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.k;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ji0 ji0Var = this.H;
        return ji0Var.a | ji0Var.b;
    }

    public CharSequence getTitle() {
        k();
        return ((jy2) this.l).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.F);
        removeCallbacks(this.G);
        ViewPropertyAnimator viewPropertyAnimator = this.D;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(I);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.m = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.n = context.getApplicationInfo().targetSdkVersion < 19;
        this.C = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            this.l.getClass();
        } else if (i == 5) {
            this.l.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        w60 wrapper;
        if (this.j == null) {
            this.j = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.k = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof w60) {
                wrapper = (w60) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    li1.g("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.l = wrapper;
        }
    }

    public final void l(if1 if1Var, vf1 vf1Var) {
        k();
        jy2 jy2Var = (jy2) this.l;
        Toolbar toolbar = jy2Var.a;
        b3 b3Var = jy2Var.m;
        if (b3Var == null) {
            b3Var = new b3(toolbar.getContext());
            jy2Var.m = b3Var;
        }
        b3Var.l = vf1Var;
        if (if1Var == null && toolbar.h == null) {
            return;
        }
        toolbar.f();
        if1 if1Var2 = toolbar.h.w;
        if (if1Var2 == if1Var) {
            return;
        }
        if (if1Var2 != null) {
            if1Var2.r(toolbar.P);
            if1Var2.r(toolbar.Q);
        }
        if (toolbar.Q == null) {
            toolbar.Q = new cy2(toolbar);
        }
        b3Var.x = true;
        Context context = toolbar.q;
        if (if1Var != null) {
            if1Var.b(b3Var, context);
            if1Var.b(toolbar.Q, toolbar.q);
        } else {
            b3Var.i(context, null);
            toolbar.Q.i(toolbar.q, null);
            b3Var.g();
            toolbar.Q.g();
        }
        toolbar.h.setPopupTheme(toolbar.r);
        toolbar.h.setPresenter(b3Var);
        toolbar.P = b3Var;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        q83 q83VarC = q83.c(windowInsets, null);
        m83 m83Var = q83VarC.a;
        boolean zG = g(this.k, new Rect(m83Var.m().a, m83Var.m().b, m83Var.m().c, m83Var.m().d), false);
        WeakHashMap weakHashMap = t43.a;
        Rect rect = this.u;
        o43.b(this, q83VarC, rect);
        q83 q83VarQ = m83Var.q(rect.left, rect.top, rect.right, rect.bottom);
        this.x = q83VarQ;
        boolean z = true;
        if (!this.y.equals(q83VarQ)) {
            this.y = this.x;
            zG = true;
        }
        Rect rect2 = this.v;
        if (rect2.equals(rect)) {
            z = zG;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return m83Var.a().a.c().a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = t43.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                t2 t2Var = (t2) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) t2Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) t2Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        c83 x73Var;
        k();
        measureChildWithMargins(this.k, i, 0, i2, 0);
        t2 t2Var = (t2) this.k.getLayoutParams();
        int iMax = Math.max(0, this.k.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) t2Var).leftMargin + ((ViewGroup.MarginLayoutParams) t2Var).rightMargin);
        int iMax2 = Math.max(0, this.k.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t2Var).topMargin + ((ViewGroup.MarginLayoutParams) t2Var).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.k.getMeasuredState());
        WeakHashMap weakHashMap = t43.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.h;
            if (this.p && this.k.getTabContainer() != null) {
                measuredHeight += this.h;
            }
        } else {
            measuredHeight = this.k.getVisibility() != 8 ? this.k.getMeasuredHeight() : 0;
        }
        Rect rect = this.u;
        Rect rect2 = this.w;
        rect2.set(rect);
        q83 q83Var = this.x;
        this.z = q83Var;
        if (this.o || z) {
            ox0 ox0VarB = ox0.b(q83Var.a.m().a, this.z.a.m().b + measuredHeight, this.z.a.m().c, this.z.a.m().d);
            q83 q83Var2 = this.z;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                x73Var = new b83(q83Var2);
            } else if (i3 >= 35) {
                x73Var = new a83(q83Var2);
            } else if (i3 >= 34) {
                x73Var = new z73(q83Var2);
            } else if (i3 >= 31) {
                x73Var = new y73(q83Var2);
            } else {
                x73Var = i3 >= 30 ? new x73(q83Var2) : new w73(q83Var2);
            }
            x73Var.g(ox0VarB);
            this.z = x73Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.z = q83Var.a.q(0, measuredHeight, 0, 0);
        }
        g(this.j, rect2, true);
        if (!this.A.equals(this.z)) {
            q83 q83Var3 = this.z;
            this.A = q83Var3;
            t43.b(this.j, q83Var3);
        }
        measureChildWithMargins(this.j, i, 0, i2, 0);
        t2 t2Var2 = (t2) this.j.getLayoutParams();
        int iMax3 = Math.max(iMax, this.j.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) t2Var2).leftMargin + ((ViewGroup.MarginLayoutParams) t2Var2).rightMargin);
        int iMax4 = Math.max(iMax2, this.j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t2Var2).topMargin + ((ViewGroup.MarginLayoutParams) t2Var2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.j.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.q || !z) {
            return false;
        }
        this.C.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.C.getFinalY() > this.k.getHeight()) {
            h();
            this.G.run();
        } else {
            h();
            this.F.run();
        }
        this.r = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.s + i2;
        this.s = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        j73 j73Var;
        n53 n53Var;
        this.H.a = i;
        this.s = getActionBarHideOffset();
        h();
        s2 s2Var = this.B;
        if (s2Var == null || (n53Var = (j73Var = (j73) s2Var).s) == null) {
            return;
        }
        n53Var.a();
        j73Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.k.getVisibility() != 0) {
            return false;
        }
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.q || this.r) {
            return;
        }
        if (this.s <= this.k.getHeight()) {
            h();
            postDelayed(this.F, 600L);
        } else {
            h();
            postDelayed(this.G, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.t ^ i;
        this.t = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        s2 s2Var = this.B;
        if (s2Var != null) {
            j73 j73Var = (j73) s2Var;
            j73Var.o = !z2;
            if (z || !z2) {
                if (j73Var.p) {
                    j73Var.p = false;
                    j73Var.d(true);
                }
            } else if (!j73Var.p) {
                j73Var.p = true;
                j73Var.d(true);
            }
        }
        if ((i2 & 256) == 0 || this.B == null) {
            return;
        }
        WeakHashMap weakHashMap = t43.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.i = i;
        s2 s2Var = this.B;
        if (s2Var != null) {
            ((j73) s2Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.k.setTranslationY(-Math.max(0, Math.min(i, this.k.getHeight())));
    }

    public void setActionBarVisibilityCallback(s2 s2Var) {
        this.B = s2Var;
        if (getWindowToken() != null) {
            ((j73) this.B).n = this.i;
            int i = this.t;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = t43.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.p = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.q) {
            this.q = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        jy2 jy2Var = (jy2) this.l;
        jy2Var.d = i != 0 ? df.a(jy2Var.a.getContext(), i) : null;
        jy2Var.c();
    }

    public void setLogo(int i) {
        k();
        jy2 jy2Var = (jy2) this.l;
        jy2Var.e = i != 0 ? df.a(jy2Var.a.getContext(), i) : null;
        jy2Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.o = z;
        this.n = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((jy2) this.l).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        jy2 jy2Var = (jy2) this.l;
        if (jy2Var.g) {
            return;
        }
        jy2Var.h = charSequence;
        if ((jy2Var.b & 8) != 0) {
            jy2Var.a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new t2(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        jy2 jy2Var = (jy2) this.l;
        jy2Var.d = drawable;
        jy2Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.fn1
    public final void e(int i, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }
}
