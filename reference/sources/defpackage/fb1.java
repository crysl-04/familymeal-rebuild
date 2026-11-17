package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class fb1 implements aj2 {
    public final Handler B;
    public Rect D;
    public boolean E;
    public final af F;
    public final Context h;
    public ListAdapter i;
    public be0 j;
    public int m;
    public int n;
    public boolean p;
    public boolean q;
    public boolean r;
    public n30 u;
    public View v;
    public AdapterView.OnItemClickListener w;
    public final int k = -2;
    public int l = -2;
    public final short o = 1002;
    public int s = 0;
    public final int t = Integer.MAX_VALUE;
    public final cb1 x = new cb1(this, (byte) 1);
    public final eb1 y = new eb1(this);
    public final db1 z = new db1(this);
    public final cb1 A = new cb1(this, (byte) 0);
    public final Rect C = new Rect();

    public fb1(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.h = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f52.o, i, 0);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.n = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.p = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        af afVar = new af(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f52.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            afVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        afVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : df.a(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.F = afVar;
        afVar.setInputMethodMode(1);
    }

    @Override // defpackage.aj2
    public final boolean a() {
        return this.F.isShowing();
    }

    public final int b() {
        return this.m;
    }

    public final Drawable c() {
        return this.F.getBackground();
    }

    @Override // defpackage.aj2
    public final void d() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        be0 be0Var;
        be0 be0Var2 = this.j;
        Context context = this.h;
        af afVar = this.F;
        if (be0Var2 == null) {
            be0 be0VarQ = q(context, !this.E);
            this.j = be0VarQ;
            be0VarQ.setAdapter(this.i);
            this.j.setOnItemClickListener(this.w);
            this.j.setFocusable(true);
            this.j.setFocusableInTouchMode(true);
            this.j.setOnItemSelectedListener(new bb1(this, (byte) 0));
            this.j.setOnScrollListener(this.z);
            afVar.setContentView(this.j);
        }
        Drawable background = afVar.getBackground();
        Rect rect = this.C;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.p) {
                this.n = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = afVar.getMaxAvailableHeight(this.v, this.n, afVar.getInputMethodMode() == 2);
        int i3 = this.k;
        if (i3 == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i4 = this.l;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA = this.j.a(iMakeMeasureSpec, maxAvailableHeight);
            paddingBottom = iA + (iA > 0 ? this.j.getPaddingBottom() + this.j.getPaddingTop() + i : 0);
        }
        boolean z = afVar.getInputMethodMode() == 2;
        afVar.setWindowLayoutType(this.o);
        if (!afVar.isShowing()) {
            int width = this.l;
            if (width == -1) {
                width = -1;
            } else if (width == -2) {
                width = this.v.getWidth();
            }
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = paddingBottom;
            }
            afVar.setWidth(width);
            afVar.setHeight(i3);
            afVar.setIsClippedToScreen(true);
            afVar.setOutsideTouchable(true);
            afVar.setTouchInterceptor(this.y);
            if (this.r) {
                afVar.setOverlapAnchor(this.q);
            }
            afVar.setEpicenterBounds(this.D);
            afVar.showAsDropDown(this.v, this.m, this.n, this.s);
            this.j.setSelection(-1);
            if ((!this.E || this.j.isInTouchMode()) && (be0Var = this.j) != null) {
                be0Var.setListSelectionHidden(true);
                be0Var.requestLayout();
            }
            if (this.E) {
                return;
            }
            this.B.post(this.A);
            return;
        }
        View view = this.v;
        WeakHashMap weakHashMap = t43.a;
        if (view.isAttachedToWindow()) {
            int width2 = this.l;
            if (width2 == -1) {
                width2 = -1;
            } else if (width2 == -2) {
                width2 = this.v.getWidth();
            }
            if (i3 == -1) {
                i3 = z ? paddingBottom : -1;
                int i5 = this.l;
                if (z) {
                    afVar.setWidth(i5 == -1 ? -1 : 0);
                    afVar.setHeight(0);
                } else {
                    afVar.setWidth(i5 == -1 ? -1 : 0);
                    afVar.setHeight(-1);
                }
            } else if (i3 == -2) {
                i3 = paddingBottom;
            }
            afVar.setOutsideTouchable(true);
            View view2 = this.v;
            int i6 = width2;
            int i7 = this.m;
            int i8 = this.n;
            int i9 = i6 < 0 ? -1 : i6;
            if (i3 < 0) {
                i3 = -1;
            }
            afVar.update(view2, i7, i8, i9, i3);
        }
    }

    @Override // defpackage.aj2
    public final void dismiss() {
        af afVar = this.F;
        afVar.dismiss();
        afVar.setContentView(null);
        this.j = null;
        this.B.removeCallbacks(this.x);
    }

    public final void f(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.aj2
    public final be0 h() {
        return this.j;
    }

    public final void i(int i) {
        this.n = i;
        this.p = true;
    }

    public final void l(int i) {
        this.m = i;
    }

    public final int n() {
        if (this.p) {
            return this.n;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        n30 n30Var = this.u;
        if (n30Var == null) {
            this.u = new n30(this, (byte) 1);
        } else {
            ListAdapter listAdapter2 = this.i;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(n30Var);
            }
        }
        this.i = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.u);
        }
        be0 be0Var = this.j;
        if (be0Var != null) {
            be0Var.setAdapter(this.i);
        }
    }

    public be0 q(Context context, boolean z) {
        return new be0(context, z);
    }

    public final void r(int i) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            this.l = i;
            return;
        }
        Rect rect = this.C;
        background.getPadding(rect);
        this.l = rect.left + rect.right + i;
    }
}
