package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qf extends Spinner {
    public static final int[] p = {R.attr.spinnerMode};
    public final fe h;
    public final Context i;
    public final gf j;
    public SpinnerAdapter k;
    public final boolean l;
    public final pf m;
    public int n;
    public final Rect o;

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    public qf(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, net.zetetic.database.R.attr.spinnerStyle);
        this.o = new Rect();
        dx2.a(this, getContext());
        int[] iArr = f52.v;
        eg egVarW = eg.w(context, attributeSet, iArr, net.zetetic.database.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) egVarW.i;
        this.h = new fe(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.i = new l10(context, resourceId);
        } else {
            this.i = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p, net.zetetic.database.R.attr.spinnerStyle, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i != 0) {
                    jf jfVar = new jf(this);
                    this.m = jfVar;
                    jfVar.j = typedArray.getString(2);
                } else if (i == 1) {
                    nf nfVar = new nf(this, this.i, attributeSet);
                    eg egVarW2 = eg.w(this.i, attributeSet, iArr, net.zetetic.database.R.attr.spinnerStyle);
                    this.n = ((TypedArray) egVarW2.i).getLayoutDimension(3, -2);
                    nfVar.f(egVarW2.k(1));
                    nfVar.G = typedArray.getString(2);
                    egVarW2.A();
                    this.m = nfVar;
                    this.j = new gf(this, this, nfVar);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(net.zetetic.database.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                egVarW.A();
                this.l = true;
                spinnerAdapter = this.k;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.k = null;
                }
                this.h.q(attributeSet, net.zetetic.database.R.attr.spinnerStyle);
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            jf jfVar2 = new jf(this);
            this.m = jfVar2;
            jfVar2.j = typedArray.getString(2);
        } else if (i == 1) {
            nf nfVar2 = new nf(this, this.i, attributeSet);
            eg egVarW3 = eg.w(this.i, attributeSet, iArr, net.zetetic.database.R.attr.spinnerStyle);
            this.n = ((TypedArray) egVarW3.i).getLayoutDimension(3, -2);
            nfVar2.f(egVarW3.k(1));
            nfVar2.G = typedArray.getString(2);
            egVarW3.A();
            this.m = nfVar2;
            this.j = new gf(this, this, nfVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(net.zetetic.database.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        egVarW.A();
        this.l = true;
        spinnerAdapter = this.k;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.k = null;
        }
        this.h.q(attributeSet, net.zetetic.database.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.o;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fe feVar = this.h;
        if (feVar != null) {
            feVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        pf pfVar = this.m;
        return pfVar != null ? pfVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        pf pfVar = this.m;
        return pfVar != null ? pfVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.m != null ? this.n : super.getDropDownWidth();
    }

    public final pf getInternalPopup() {
        return this.m;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        pf pfVar = this.m;
        return pfVar != null ? pfVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.i;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        pf pfVar = this.m;
        return pfVar != null ? pfVar.o() : super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pf pfVar = this.m;
        if (pfVar == null || !pfVar.a()) {
            return;
        }
        pfVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        of ofVar = (of) parcelable;
        super.onRestoreInstanceState(ofVar.getSuperState());
        if (!ofVar.h || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new hf(this, (byte) 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        of ofVar = new of(super.onSaveInstanceState());
        pf pfVar = this.m;
        ofVar.h = pfVar != null && pfVar.a();
        return ofVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gf gfVar = this.j;
        if (gfVar == null || !gfVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        pf pfVar = this.m;
        if (pfVar == null) {
            return super.performClick();
        }
        if (pfVar.a()) {
            return true;
        }
        pfVar.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.l) {
            this.k = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        pf pfVar = this.m;
        if (pfVar != null) {
            Context context = this.i;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            kf kfVar = new kf();
            kfVar.h = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                kfVar.i = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            pfVar.p(kfVar);
        }
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        pf pfVar = this.m;
        if (pfVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            pfVar.j(i);
            pfVar.l(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        pf pfVar = this.m;
        if (pfVar != null) {
            pfVar.i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.m != null) {
            this.n = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        pf pfVar = this.m;
        if (pfVar != null) {
            pfVar.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(df.a(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        pf pfVar = this.m;
        if (pfVar != null) {
            pfVar.e(charSequence);
        } else {
            super.setPrompt(charSequence);
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
}
