package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ee extends AutoCompleteTextView {
    public static final int[] j = {R.attr.popupBackground};
    public final fe h;
    public final sf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, net.zetetic.database.R.attr.autoCompleteTextViewStyle);
        vx2.a(context);
        dx2.a(this, getContext());
        eg egVarW = eg.w(getContext(), attributeSet, j, net.zetetic.database.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) egVarW.i).hasValue(0)) {
            setDropDownBackgroundDrawable(egVarW.k(0));
        }
        egVarW.A();
        fe feVar = new fe(this);
        this.h = feVar;
        feVar.q(attributeSet, net.zetetic.database.R.attr.autoCompleteTextViewStyle);
        sf sfVar = new sf(this);
        this.i = sfVar;
        sfVar.d(attributeSet, net.zetetic.database.R.attr.autoCompleteTextViewStyle);
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        t03.C(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(df.a(getContext(), i));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        sf sfVar = this.i;
        if (sfVar != null) {
            sfVar.e(context, i);
        }
    }
}
