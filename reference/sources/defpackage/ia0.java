package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ia0 extends u implements cq1 {
    public final Window q;
    public final lu1 r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    public ia0(Context context, Window window) {
        super(context);
        this.q = window;
        this.r = rz1.x(uz0.n);
        WeakHashMap weakHashMap = t43.a;
        o43.c(this, this);
        v73.a(this, new ha0(this));
    }

    @Override // defpackage.cq1
    public final q83 a(View view, q83 q83Var) {
        if (!this.t) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return q83Var.a.q(iMax, iMax2, iMax3, iMax4);
            }
        }
        return q83Var;
    }

    @Override // defpackage.u
    public final void b(int i, dr0 dr0Var) {
        dr0Var.W(1735448596);
        int i2 = (dr0Var.h(this) ? 4 : 2) | i;
        if (dr0Var.N(i2 & 1, (i2 & 3) != 2)) {
            ((zp0) this.r.getValue()).f(dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s(this, i, (byte) 10);
        }
    }

    @Override // defpackage.u
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.v;
    }

    @Override // defpackage.u
    public final void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // defpackage.u
    public final void i(int i, int i2) {
        int iA;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.i(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.q;
        if (mode != Integer.MIN_VALUE || this.s || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.t) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iA = rd.a.a(window);
            } else if (i3 < 32) {
                iA = sd.a.a(window);
            } else {
                iA = size2;
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iA - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.t || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.s) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
