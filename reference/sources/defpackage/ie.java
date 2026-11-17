package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ie extends CheckedTextView {
    public static final int[] i = {R.attr.checkMark};
    public final sf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        vx2.a(context);
        dx2.a(this, getContext());
        sf sfVar = new sf(this);
        this.h = sfVar;
        sfVar.d(attributeSet, R.attr.checkedTextViewStyle);
        sfVar.b();
        eg egVarW = eg.w(getContext(), attributeSet, i, R.attr.checkedTextViewStyle);
        setCheckMarkDrawable(egVarW.k(0));
        egVarW.A();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        sf sfVar = this.h;
        if (sfVar != null) {
            sfVar.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        t03.C(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(df.a(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        sf sfVar = this.h;
        if (sfVar != null) {
            sfVar.e(context, i2);
        }
    }
}
