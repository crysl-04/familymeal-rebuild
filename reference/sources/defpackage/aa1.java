package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class aa1 extends ViewGroup {
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public boolean o;
    public int[] p;
    public int[] q;
    public Drawable r;
    public int s;
    public int t;
    public int u;
    public int v;

    public aa1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = true;
        this.i = -1;
        this.j = 0;
        this.l = 8388659;
        int[] iArr = f52.m;
        eg egVarW = eg.w(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) egVarW.i;
        WeakHashMap weakHashMap = t43.a;
        r43.b(this, context, iArr, attributeSet, typedArray, i, 0);
        TypedArray typedArray2 = (TypedArray) egVarW.i;
        int i2 = typedArray2.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray2.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray2.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.n = typedArray2.getFloat(4, -1.0f);
        this.i = typedArray2.getInt(3, -1);
        this.o = typedArray2.getBoolean(7, false);
        setDividerDrawable(egVarW.k(5));
        this.u = typedArray2.getInt(8, 0);
        this.v = typedArray2.getDimensionPixelSize(6, 0);
        egVarW.A();
    }

    public final void c(Canvas canvas, int i) {
        this.r.setBounds(getPaddingLeft() + this.v, i, (getWidth() - getPaddingRight()) - this.v, this.t + i);
        this.r.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof z91;
    }

    public final void d(Canvas canvas, int i) {
        this.r.setBounds(i, getPaddingTop() + this.v, this.s + i, (getHeight() - getPaddingBottom()) - this.v);
        this.r.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public z91 generateDefaultLayoutParams() {
        int i = this.k;
        if (i == 0) {
            return new z91(-2);
        }
        if (i == 1) {
            return new z91(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public z91 generateLayoutParams(AttributeSet attributeSet) {
        return new z91(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public z91 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new z91(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.i < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.i;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.i == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.j;
        if (this.k == 1 && (i = this.l & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.m) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.m;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((z91) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.i;
    }

    public Drawable getDividerDrawable() {
        return this.r;
    }

    public int getDividerPadding() {
        return this.v;
    }

    public int getDividerWidth() {
        return this.s;
    }

    public int getGravity() {
        return this.l;
    }

    public int getOrientation() {
        return this.k;
    }

    public int getShowDividers() {
        return this.u;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.n;
    }

    public final boolean h(int i) {
        if (i == 0) {
            return (this.u & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.u;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.r != null) {
            int i2 = 0;
            if (this.k == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i2 < virtualChildCount) {
                    View childAt = getChildAt(i2);
                    if (childAt != null && childAt.getVisibility() != 8 && h(i2)) {
                        c(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((z91) childAt.getLayoutParams())).topMargin) - this.t);
                    }
                    i2++;
                }
                if (h(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.t;
                    } else {
                        bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((z91) childAt2.getLayoutParams())).bottomMargin;
                    }
                    c(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean zA = r53.a(this);
            while (i2 < virtualChildCount2) {
                View childAt3 = getChildAt(i2);
                if (childAt3 != null && childAt3.getVisibility() != 8 && h(i2)) {
                    z91 z91Var = (z91) childAt3.getLayoutParams();
                    d(canvas, zA ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) z91Var).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) z91Var).leftMargin) - this.s);
                }
                i2++;
            }
            if (h(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    z91 z91Var2 = (z91) childAt4.getLayoutParams();
                    if (zA) {
                        left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) z91Var2).leftMargin;
                        i = this.s;
                        right = left - i;
                    } else {
                        right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) z91Var2).rightMargin;
                    }
                } else if (zA) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i = this.s;
                    right = left - i;
                }
                d(canvas, right);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0173  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0186  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:76:0x019f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a4  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int i11;
        int measuredHeight;
        int i12;
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        char c = 2;
        if (this.k == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i17 = i3 - i;
            int paddingRight = i17 - getPaddingRight();
            int paddingRight2 = (i17 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i18 = this.l;
            int i19 = i18 & 112;
            int i20 = i18 & 8388615;
            if (i19 != 16) {
                paddingTop = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.m;
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.m) / 2);
            }
            int i21 = 0;
            while (i21 < virtualChildCount) {
                View childAt = getChildAt(i21);
                if (childAt != null && childAt.getVisibility() != i16) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    z91 z91Var = (z91) childAt.getLayoutParams();
                    int i22 = z91Var.b;
                    if (i22 < 0) {
                        i22 = i20;
                    }
                    WeakHashMap weakHashMap = t43.a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i15 = ((ViewGroup.MarginLayoutParams) z91Var).leftMargin + paddingLeft2;
                        } else {
                            i13 = paddingRight - measuredWidth;
                            i14 = ((ViewGroup.MarginLayoutParams) z91Var).rightMargin;
                        }
                        if (h(i21)) {
                            paddingTop += this.t;
                        }
                        int i23 = paddingTop + ((ViewGroup.MarginLayoutParams) z91Var).topMargin;
                        childAt.layout(i15, i23, measuredWidth + i15, i23 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) z91Var).bottomMargin + i23;
                    } else {
                        i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((ViewGroup.MarginLayoutParams) z91Var).leftMargin;
                        i14 = ((ViewGroup.MarginLayoutParams) z91Var).rightMargin;
                    }
                    i15 = i13 - i14;
                    if (h(i21)) {
                        paddingTop += this.t;
                    }
                    int i24 = paddingTop + ((ViewGroup.MarginLayoutParams) z91Var).topMargin;
                    childAt.layout(i15, i24, measuredWidth + i15, i24 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) z91Var).bottomMargin + i24;
                }
                i21++;
                c = c;
                i16 = 8;
            }
            return;
        }
        boolean zA = r53.a(this);
        int paddingTop2 = getPaddingTop();
        int i25 = i4 - i2;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i26 = this.l;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z2 = this.h;
        int[] iArr = this.p;
        int[] iArr2 = this.q;
        WeakHashMap weakHashMap2 = t43.a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i27, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.m;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.m) / 2);
        }
        if (zA) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i29 = 0;
        while (i29 < virtualChildCount2) {
            int i30 = (i5 * i29) + i6;
            View childAt2 = getChildAt(i30);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    z91 z91Var2 = (z91) childAt2.getLayoutParams();
                    int i31 = paddingLeft;
                    if (z2) {
                        i8 = paddingTop2;
                        baseline = ((ViewGroup.MarginLayoutParams) z91Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = z91Var2.b;
                        if (i9 < 0) {
                            i9 = i28;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            if (i10 != 48) {
                                i11 = i8 + ((ViewGroup.MarginLayoutParams) z91Var2).topMargin;
                                if (baseline != -1) {
                                    i11 = (iArr[1] - baseline) + i11;
                                }
                            } else if (i10 != 80) {
                                i11 = i8;
                            } else {
                                i11 = (paddingBottom - measuredHeight3) - ((ViewGroup.MarginLayoutParams) z91Var2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (h(i30)) {
                                i12 = i31 + this.s;
                            } else {
                                i12 = i31;
                            }
                            int i32 = i12 + ((ViewGroup.MarginLayoutParams) z91Var2).leftMargin;
                            childAt2.layout(i32, i11, i32 + measuredWidth2, i11 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((ViewGroup.MarginLayoutParams) z91Var2).rightMargin + i32;
                        } else {
                            i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((ViewGroup.MarginLayoutParams) z91Var2).topMargin;
                            measuredHeight = ((ViewGroup.MarginLayoutParams) z91Var2).bottomMargin;
                        }
                        i11 -= measuredHeight;
                        if (h(i30)) {
                            i12 = i31 + this.s;
                        } else {
                            i12 = i31;
                        }
                        int i33 = i12 + ((ViewGroup.MarginLayoutParams) z91Var2).leftMargin;
                        childAt2.layout(i33, i11, i33 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((ViewGroup.MarginLayoutParams) z91Var2).rightMargin + i33;
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = z91Var2.b;
                    if (i9 < 0) {
                        i9 = i28;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            i11 = i8 + ((ViewGroup.MarginLayoutParams) z91Var2).topMargin;
                            if (baseline != -1) {
                                i11 = (iArr[1] - baseline) + i11;
                            }
                        } else if (i10 != 80) {
                            i11 = i8;
                        } else {
                            i11 = (paddingBottom - measuredHeight3) - ((ViewGroup.MarginLayoutParams) z91Var2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (h(i30)) {
                            i12 = i31 + this.s;
                        } else {
                            i12 = i31;
                        }
                        int i34 = i12 + ((ViewGroup.MarginLayoutParams) z91Var2).leftMargin;
                        childAt2.layout(i34, i11, i34 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((ViewGroup.MarginLayoutParams) z91Var2).rightMargin + i34;
                    } else {
                        i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((ViewGroup.MarginLayoutParams) z91Var2).topMargin;
                        measuredHeight = ((ViewGroup.MarginLayoutParams) z91Var2).bottomMargin;
                    }
                    i11 -= measuredHeight;
                    if (h(i30)) {
                        i12 = i31 + this.s;
                    } else {
                        i12 = i31;
                    }
                    int i35 = i12 + ((ViewGroup.MarginLayoutParams) z91Var2).leftMargin;
                    childAt2.layout(i35, i11, i35 + measuredWidth2, i11 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((ViewGroup.MarginLayoutParams) z91Var2).rightMargin + i35;
                }
                i29++;
                i6 = i7;
                paddingTop2 = i8;
            }
            i8 = paddingTop2;
            i29++;
            i6 = i7;
            paddingTop2 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:221:0x04be  */
    /* JADX WARN: Code duplicated, block: B:224:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:226:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:228:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:230:0x0501  */
    /* JADX WARN: Code duplicated, block: B:236:0x0511  */
    /* JADX WARN: Code duplicated, block: B:239:0x0518 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x051a  */
    /* JADX WARN: Code duplicated, block: B:242:0x0521 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x0523  */
    /* JADX WARN: Code duplicated, block: B:348:0x0742  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0137  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int iMax;
        int i6;
        int baseline;
        int i7;
        int i8;
        int i9;
        int[] iArr2;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        z91 z91Var;
        View view;
        int i12;
        int[] iArr3;
        int i13;
        int i14;
        boolean z3;
        int i15;
        int measuredHeight;
        boolean z4;
        boolean z5;
        int iMax2;
        int i16;
        int baseline2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z6;
        int i22;
        int i23;
        int i24;
        View view2;
        boolean z7;
        aa1 aa1Var = this;
        int i25 = -2;
        int iMax3 = 0;
        int i26 = 1073741824;
        int i27 = 8;
        if (aa1Var.k == 1) {
            aa1Var.m = 0;
            int virtualChildCount = aa1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i28 = aa1Var.i;
            boolean z8 = aa1Var.o;
            int i29 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z9 = false;
            int i30 = 0;
            boolean z10 = false;
            boolean z11 = true;
            float f = 0.0f;
            int iMax6 = 0;
            while (i29 < virtualChildCount) {
                int i31 = mode;
                View childAt = aa1Var.getChildAt(i29);
                if (childAt == null) {
                    aa1Var.m = aa1Var.m;
                } else {
                    if (childAt.getVisibility() != i27) {
                        if (aa1Var.h(i29)) {
                            aa1Var.m += aa1Var.t;
                        }
                        z91 z91Var2 = (z91) childAt.getLayoutParams();
                        float f2 = z91Var2.a;
                        f += f2;
                        if (mode2 == i26 && ((ViewGroup.MarginLayoutParams) z91Var2).height == 0 && f2 > 0.0f) {
                            int i32 = aa1Var.m;
                            aa1Var.m = Math.max(i32, ((ViewGroup.MarginLayoutParams) z91Var2).topMargin + i32 + ((ViewGroup.MarginLayoutParams) z91Var2).bottomMargin);
                            view2 = childAt;
                            i21 = mode2;
                            i22 = i28;
                            z6 = z8;
                            i23 = i29;
                            z9 = true;
                            i24 = i31;
                        } else {
                            if (((ViewGroup.MarginLayoutParams) z91Var2).height != 0 || f2 <= 0.0f) {
                                i20 = Integer.MIN_VALUE;
                            } else {
                                ((ViewGroup.MarginLayoutParams) z91Var2).height = i25;
                                i20 = 0;
                            }
                            i21 = mode2;
                            z6 = z8;
                            i22 = i28;
                            i23 = i29;
                            i24 = i31;
                            aa1Var.measureChildWithMargins(childAt, i, 0, i2, f == 0.0f ? aa1Var.m : 0);
                            if (i20 != Integer.MIN_VALUE) {
                                ((ViewGroup.MarginLayoutParams) z91Var2).height = i20;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i33 = aa1Var.m;
                            view2 = childAt;
                            aa1Var.m = Math.max(i33, i33 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) z91Var2).topMargin + ((ViewGroup.MarginLayoutParams) z91Var2).bottomMargin);
                            if (z6) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i22 >= 0 && i22 == i23 + 1) {
                            aa1Var.j = aa1Var.m;
                        }
                        if (i23 < i22 && z91Var2.a > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i24 == 1073741824 || ((ViewGroup.MarginLayoutParams) z91Var2).width != -1) {
                            z7 = false;
                        } else {
                            z7 = true;
                            z10 = true;
                        }
                        int i34 = ((ViewGroup.MarginLayoutParams) z91Var2).leftMargin + ((ViewGroup.MarginLayoutParams) z91Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i34;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z12 = z7;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i30, measuredState);
                        if (z11) {
                            i30 = iCombineMeasuredStates;
                            boolean z13 = ((ViewGroup.MarginLayoutParams) z91Var2).width == -1;
                            if (z91Var2.a > 0.0f) {
                                if (!z12) {
                                    i34 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i34);
                            } else {
                                if (!z12) {
                                    i34 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i34);
                            }
                            z11 = z13;
                        } else {
                            i30 = iCombineMeasuredStates;
                        }
                        if (z91Var2.a > 0.0f) {
                            if (!z12) {
                                i34 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i34);
                        } else {
                            if (!z12) {
                                i34 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i34);
                        }
                        z11 = z13;
                    }
                    i29 = i23 + 1;
                    i28 = i22;
                    mode = i24;
                    z8 = z6;
                    mode2 = i21;
                    i25 = -2;
                    i26 = 1073741824;
                    i27 = 8;
                }
                i21 = mode2;
                i22 = i28;
                z6 = z8;
                i23 = i29;
                i24 = i31;
                i29 = i23 + 1;
                i28 = i22;
                mode = i24;
                z8 = z6;
                mode2 = i21;
                i25 = -2;
                i26 = 1073741824;
                i27 = 8;
            }
            int i35 = mode;
            int i36 = mode2;
            boolean z14 = z8;
            int i37 = i30;
            int i38 = i2;
            if (aa1Var.m > 0 && aa1Var.h(virtualChildCount)) {
                aa1Var.m += aa1Var.t;
            }
            if (z14 && (i36 == Integer.MIN_VALUE || i36 == 0)) {
                aa1Var.m = 0;
                for (int i39 = 0; i39 < virtualChildCount; i39++) {
                    View childAt2 = aa1Var.getChildAt(i39);
                    if (childAt2 == null) {
                        aa1Var.m = aa1Var.m;
                    } else if (childAt2.getVisibility() != 8) {
                        z91 z91Var3 = (z91) childAt2.getLayoutParams();
                        int i40 = aa1Var.m;
                        aa1Var.m = Math.max(i40, i40 + iMax6 + ((ViewGroup.MarginLayoutParams) z91Var3).topMargin + ((ViewGroup.MarginLayoutParams) z91Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = aa1Var.getPaddingBottom() + aa1Var.getPaddingTop() + aa1Var.m;
            aa1Var.m = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, aa1Var.getSuggestedMinimumHeight()), i38, 0);
            int i41 = (iResolveSizeAndState & 16777215) - aa1Var.m;
            if (z9 || (i41 != 0 && f > 0.0f)) {
                float f3 = aa1Var.n;
                if (f3 > 0.0f) {
                    f = f3;
                }
                aa1Var.m = 0;
                int iCombineMeasuredStates2 = i37;
                int i42 = 0;
                while (i42 < virtualChildCount) {
                    View childAt3 = aa1Var.getChildAt(i42);
                    if (childAt3.getVisibility() == 8) {
                        i42 = i42;
                    } else {
                        z91 z91Var4 = (z91) childAt3.getLayoutParams();
                        float f4 = z91Var4.a;
                        if (f4 > 0.0f) {
                            int i43 = (int) ((i41 * f4) / f);
                            f -= f4;
                            i41 -= i43;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, aa1Var.getPaddingRight() + aa1Var.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) z91Var4).leftMargin + ((ViewGroup.MarginLayoutParams) z91Var4).rightMargin, ((ViewGroup.MarginLayoutParams) z91Var4).width);
                            if (((ViewGroup.MarginLayoutParams) z91Var4).height == 0) {
                                i19 = 1073741824;
                                if (i36 == 1073741824) {
                                    if (i43 <= 0) {
                                        i43 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i43, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i19 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i43;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i19));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i44 = ((ViewGroup.MarginLayoutParams) z91Var4).leftMargin + ((ViewGroup.MarginLayoutParams) z91Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i44;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i35 != 1073741824) {
                            i18 = -1;
                            if (((ViewGroup.MarginLayoutParams) z91Var4).width == -1) {
                                measuredWidth2 = i44;
                            }
                        } else {
                            i18 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z15 = z11 && ((ViewGroup.MarginLayoutParams) z91Var4).width == i18;
                        int i45 = aa1Var.m;
                        aa1Var.m = Math.max(i45, childAt3.getMeasuredHeight() + i45 + ((ViewGroup.MarginLayoutParams) z91Var4).topMargin + ((ViewGroup.MarginLayoutParams) z91Var4).bottomMargin);
                        z11 = z15;
                    }
                    i42++;
                }
                aa1Var.m = aa1Var.getPaddingBottom() + aa1Var.getPaddingTop() + aa1Var.m;
                i37 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z14 && i36 != 1073741824) {
                    for (int i46 = 0; i46 < virtualChildCount; i46++) {
                        View childAt4 = aa1Var.getChildAt(i46);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((z91) childAt4.getLayoutParams()).a > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z11 || i35 == 1073741824) {
                iMax4 = iMax3;
            }
            aa1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(aa1Var.getPaddingRight() + aa1Var.getPaddingLeft() + iMax4, aa1Var.getSuggestedMinimumWidth()), i, i37), iResolveSizeAndState);
            if (z10) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(aa1Var.getMeasuredWidth(), 1073741824);
                int i47 = 0;
                while (i47 < virtualChildCount) {
                    View childAt5 = aa1Var.getChildAt(i47);
                    if (childAt5.getVisibility() != 8) {
                        z91 z91Var5 = (z91) childAt5.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) z91Var5).width == -1) {
                            int i48 = ((ViewGroup.MarginLayoutParams) z91Var5).height;
                            ((ViewGroup.MarginLayoutParams) z91Var5).height = childAt5.getMeasuredHeight();
                            aa1Var.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i38, 0);
                            ((ViewGroup.MarginLayoutParams) z91Var5).height = i48;
                        }
                    }
                    i47++;
                    i38 = i2;
                }
                return;
            }
            return;
        }
        int i49 = i;
        aa1Var.m = 0;
        int virtualChildCount2 = aa1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i49);
        int mode4 = View.MeasureSpec.getMode(i2);
        int[] iArr4 = aa1Var.p;
        if (iArr4 == null || (iArr = aa1Var.q) == null) {
            iArr4 = new int[4];
            aa1Var.p = iArr4;
            iArr = new int[4];
            aa1Var.q = iArr;
        }
        int[] iArr5 = iArr4;
        int[] iArr6 = iArr;
        iArr5[3] = -1;
        char c = 2;
        iArr5[2] = -1;
        iArr5[1] = -1;
        iArr5[0] = -1;
        iArr6[3] = -1;
        iArr6[2] = -1;
        iArr6[1] = -1;
        iArr6[0] = -1;
        boolean z16 = aa1Var.h;
        boolean z17 = aa1Var.o;
        boolean z18 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z19 = true;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i50 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = aa1Var.getChildAt(i50);
            if (childAt6 == null) {
                aa1Var.m = aa1Var.m;
                i11 = i50;
                i16 = i52;
                iArr3 = iArr5;
                iArr2 = iArr6;
                z = z16;
                z2 = z17;
            } else {
                int i53 = i51;
                if (childAt6.getVisibility() == 8) {
                    i49 = i;
                    i11 = i50;
                    i16 = i52;
                    iArr2 = iArr6;
                    z = z16;
                    z2 = z17;
                    i51 = i53;
                    iArr3 = iArr5;
                } else {
                    if (aa1Var.h(i50)) {
                        aa1Var.m += aa1Var.s;
                    }
                    z91 z91Var6 = (z91) childAt6.getLayoutParams();
                    float f6 = z91Var6.a;
                    f5 += f6;
                    int i54 = i50;
                    if (mode3 == 1073741824 && ((ViewGroup.MarginLayoutParams) z91Var6).width == 0 && f6 > 0.0f) {
                        int i55 = aa1Var.m;
                        int i56 = ((ViewGroup.MarginLayoutParams) z91Var6).leftMargin;
                        if (z18) {
                            aa1Var.m = i56 + ((ViewGroup.MarginLayoutParams) z91Var6).rightMargin + i55;
                        } else {
                            aa1Var.m = Math.max(i55, i55 + i56 + ((ViewGroup.MarginLayoutParams) z91Var6).rightMargin);
                        }
                        if (z16) {
                            childAt6.measure(0, 0);
                            view = childAt6;
                            z = z16;
                            z2 = z17;
                            i12 = i53;
                            i11 = i54;
                            z91Var = z91Var6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i49 = i;
                            i13 = i52;
                            i10 = iMax7;
                        } else {
                            view = childAt6;
                            z = z16;
                            z2 = z17;
                            z21 = true;
                            i12 = i53;
                            i11 = i54;
                            i14 = 1073741824;
                            z91Var = z91Var6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i49 = i;
                            i13 = i52;
                            i10 = iMax7;
                        }
                        if (mode4 == i14 && ((ViewGroup.MarginLayoutParams) z91Var).height == -1) {
                            z3 = true;
                            z20 = true;
                        } else {
                            z3 = false;
                        }
                        i15 = ((ViewGroup.MarginLayoutParams) z91Var).topMargin + ((ViewGroup.MarginLayoutParams) z91Var).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i15;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z) {
                            baseline2 = view.getBaseline();
                            z4 = z3;
                            if (baseline2 != -1) {
                                i17 = z91Var.b;
                                if (i17 < 0) {
                                    i17 = aa1Var.l;
                                }
                                int i57 = (((i17 & 112) >> 4) & (-2)) >> 1;
                                iArr3[i57] = Math.max(iArr3[i57], baseline2);
                                iArr2[i57] = Math.max(iArr2[i57], measuredHeight - baseline2);
                            }
                        } else {
                            z4 = z3;
                        }
                        int iMax9 = Math.max(i12, measuredHeight);
                        if (z19 || ((ViewGroup.MarginLayoutParams) z91Var).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z91Var.a > 0.0f) {
                            if (!z4) {
                                i15 = measuredHeight;
                            }
                            iMax7 = Math.max(i10, i15);
                            iMax2 = i13;
                        } else {
                            if (!z4) {
                                i15 = measuredHeight;
                            }
                            iMax2 = Math.max(i13, i15);
                            iMax7 = i10;
                        }
                        int i58 = iMax2;
                        i51 = iMax9;
                        i16 = i58;
                        z19 = z5;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) z91Var6).width != 0 || f6 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) z91Var6).width = -2;
                            i9 = 0;
                        }
                        iArr2 = iArr6;
                        i10 = iMax7;
                        i11 = i54;
                        z = z16;
                        z2 = z17;
                        int i59 = i9;
                        z91Var = z91Var6;
                        view = childAt6;
                        i12 = i53;
                        i49 = i;
                        iArr3 = iArr5;
                        i13 = i52;
                        aa1Var.measureChildWithMargins(view, i49, f5 == 0.0f ? aa1Var.m : 0, i2, 0);
                        if (i59 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) z91Var).width = i59;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        int i60 = aa1Var.m;
                        int i61 = ((ViewGroup.MarginLayoutParams) z91Var).leftMargin;
                        if (z18) {
                            aa1Var.m = i61 + measuredWidth3 + ((ViewGroup.MarginLayoutParams) z91Var).rightMargin + i60;
                        } else {
                            aa1Var.m = Math.max(i60, i60 + measuredWidth3 + i61 + ((ViewGroup.MarginLayoutParams) z91Var).rightMargin);
                        }
                        if (z2) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i14 = 1073741824;
                    if (mode4 == i14) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    i15 = ((ViewGroup.MarginLayoutParams) z91Var).topMargin + ((ViewGroup.MarginLayoutParams) z91Var).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i15;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z) {
                        baseline2 = view.getBaseline();
                        z4 = z3;
                        if (baseline2 != -1) {
                            i17 = z91Var.b;
                            if (i17 < 0) {
                                i17 = aa1Var.l;
                            }
                            int i510 = (((i17 & 112) >> 4) & (-2)) >> 1;
                            iArr3[i510] = Math.max(iArr3[i510], baseline2);
                            iArr2[i510] = Math.max(iArr2[i510], measuredHeight - baseline2);
                        }
                    } else {
                        z4 = z3;
                    }
                    int iMax10 = Math.max(i12, measuredHeight);
                    if (z19) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z91Var.a > 0.0f) {
                        if (!z4) {
                            i15 = measuredHeight;
                        }
                        iMax7 = Math.max(i10, i15);
                        iMax2 = i13;
                    } else {
                        if (!z4) {
                            i15 = measuredHeight;
                        }
                        iMax2 = Math.max(i13, i15);
                        iMax7 = i10;
                    }
                    int i511 = iMax2;
                    i51 = iMax10;
                    i16 = i511;
                    z19 = z5;
                }
            }
            i52 = i16;
            i50 = i11 + 1;
            c = c2;
            iArr5 = iArr3;
            iArr6 = iArr2;
            z16 = z;
            z17 = z2;
        }
        int[] iArr7 = iArr5;
        int[] iArr8 = iArr6;
        char c3 = c;
        boolean z22 = z16;
        boolean z23 = z17;
        int i62 = i51;
        int i63 = i52;
        int i64 = iMax7;
        if (aa1Var.m > 0 && aa1Var.h(virtualChildCount2)) {
            aa1Var.m += aa1Var.s;
        }
        int i65 = iArr7[1];
        int iMax11 = (i65 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) ? i62 : Math.max(i62, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i65, iArr7[c3]))));
        if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            aa1Var.m = 0;
            for (int i66 = 0; i66 < virtualChildCount2; i66++) {
                View childAt7 = aa1Var.getChildAt(i66);
                if (childAt7 == null) {
                    aa1Var.m = aa1Var.m;
                } else if (childAt7.getVisibility() != 8) {
                    z91 z91Var7 = (z91) childAt7.getLayoutParams();
                    int i67 = aa1Var.m;
                    if (z18) {
                        aa1Var.m = ((ViewGroup.MarginLayoutParams) z91Var7).leftMargin + iMax8 + ((ViewGroup.MarginLayoutParams) z91Var7).rightMargin + i67;
                    } else {
                        aa1Var.m = Math.max(i67, i67 + iMax8 + ((ViewGroup.MarginLayoutParams) z91Var7).leftMargin + ((ViewGroup.MarginLayoutParams) z91Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = aa1Var.getPaddingRight() + aa1Var.getPaddingLeft() + aa1Var.m;
        aa1Var.m = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, aa1Var.getSuggestedMinimumWidth()), i49, 0);
        int i68 = (iResolveSizeAndState2 & 16777215) - aa1Var.m;
        if (z21 || (i68 != 0 && f5 > 0.0f)) {
            float f7 = aa1Var.n;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr7[3] = -1;
            iArr7[c3] = -1;
            iArr7[1] = -1;
            iArr7[0] = -1;
            iArr8[3] = -1;
            iArr8[c3] = -1;
            iArr8[1] = -1;
            iArr8[0] = -1;
            aa1Var.m = 0;
            iMax11 = -1;
            int i69 = 0;
            while (i69 < virtualChildCount2) {
                View childAt8 = aa1Var.getChildAt(i69);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    z91 z91Var8 = (z91) childAt8.getLayoutParams();
                    float f8 = z91Var8.a;
                    if (f8 > 0.0f) {
                        int i70 = (int) ((i68 * f8) / f5);
                        f5 -= f8;
                        i68 -= i70;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, aa1Var.getPaddingBottom() + aa1Var.getPaddingTop() + ((ViewGroup.MarginLayoutParams) z91Var8).topMargin + ((ViewGroup.MarginLayoutParams) z91Var8).bottomMargin, ((ViewGroup.MarginLayoutParams) z91Var8).height);
                        if (((ViewGroup.MarginLayoutParams) z91Var8).width == 0) {
                            i8 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i70 <= 0) {
                                    i70 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i70, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i8 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i70;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i8), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    int i71 = aa1Var.m;
                    if (z18) {
                        aa1Var.m = childAt8.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) z91Var8).leftMargin + ((ViewGroup.MarginLayoutParams) z91Var8).rightMargin + i71;
                    } else {
                        aa1Var.m = Math.max(i71, childAt8.getMeasuredWidth() + i71 + ((ViewGroup.MarginLayoutParams) z91Var8).leftMargin + ((ViewGroup.MarginLayoutParams) z91Var8).rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && ((ViewGroup.MarginLayoutParams) z91Var8).height == -1;
                    int i72 = ((ViewGroup.MarginLayoutParams) z91Var8).topMargin + ((ViewGroup.MarginLayoutParams) z91Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i72;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z24) {
                        i72 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i63, i72);
                    if (z19) {
                        i6 = -1;
                        boolean z25 = ((ViewGroup.MarginLayoutParams) z91Var8).height == -1;
                        if (z22 && (baseline = childAt8.getBaseline()) != i6) {
                            i7 = z91Var8.b;
                            if (i7 < 0) {
                                i7 = aa1Var.l;
                            }
                            int i73 = (((i7 & 112) >> 4) & (-2)) >> 1;
                            iArr7[i73] = Math.max(iArr7[i73], baseline);
                            iArr8[i73] = Math.max(iArr8[i73], measuredHeight4 - baseline);
                        }
                        z19 = z25;
                        i63 = iMax12;
                    } else {
                        i6 = -1;
                    }
                    if (z22) {
                        i7 = z91Var8.b;
                        if (i7 < 0) {
                            i7 = aa1Var.l;
                        }
                        int i74 = (((i7 & 112) >> 4) & (-2)) >> 1;
                        iArr7[i74] = Math.max(iArr7[i74], baseline);
                        iArr8[i74] = Math.max(iArr8[i74], measuredHeight4 - baseline);
                    }
                    z19 = z25;
                    i63 = iMax12;
                }
                i69++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            aa1Var.m = aa1Var.getPaddingRight() + aa1Var.getPaddingLeft() + aa1Var.m;
            int i75 = iArr7[1];
            if (i75 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i75, iArr7[c3]))));
            }
            iMax = i63;
        } else {
            iMax = Math.max(i63, i64);
            if (z23 && mode3 != 1073741824) {
                for (int i76 = 0; i76 < virtualChildCount2; i76++) {
                    View childAt9 = aa1Var.getChildAt(i76);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((z91) childAt9.getLayoutParams()).a > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        aa1Var.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(aa1Var.getPaddingBottom() + aa1Var.getPaddingTop() + iMax11, aa1Var.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
        if (z20) {
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(aa1Var.getMeasuredHeight(), 1073741824);
            int i77 = i5;
            while (i77 < virtualChildCount2) {
                View childAt10 = aa1Var.getChildAt(i77);
                if (childAt10.getVisibility() != 8) {
                    z91 z91Var9 = (z91) childAt10.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) z91Var9).height == -1) {
                        int i78 = ((ViewGroup.MarginLayoutParams) z91Var9).width;
                        ((ViewGroup.MarginLayoutParams) z91Var9).width = childAt10.getMeasuredWidth();
                        aa1Var.measureChildWithMargins(childAt10, i49, 0, iMakeMeasureSpec2, 0);
                        ((ViewGroup.MarginLayoutParams) z91Var9).width = i78;
                    }
                }
                i77++;
                aa1Var = this;
                i49 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.h = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.i = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.r) {
            return;
        }
        this.r = drawable;
        boolean z = false;
        if (drawable != null) {
            this.s = drawable.getIntrinsicWidth();
            this.t = drawable.getIntrinsicHeight();
        } else {
            this.s = 0;
            this.t = 0;
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.v = i;
    }

    public void setGravity(int i) {
        if (this.l != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.l = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.l;
        if ((8388615 & i3) != i2) {
            this.l = (i3 & (-8388616)) | i2;
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.o = z;
    }

    public void setOrientation(int i) {
        if (this.k != i) {
            this.k = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.u) {
            requestLayout();
        }
        this.u = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.l;
        if ((i3 & 112) != i2) {
            this.l = (i3 & (-113)) | i2;
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.n = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
