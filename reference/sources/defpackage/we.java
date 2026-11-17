package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class we extends EditText {
    public final fe h;
    public final sf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        vx2.a(context);
        dx2.a(this, getContext());
        fe feVar = new fe(this);
        this.h = feVar;
        feVar.q(attributeSet, R.attr.editTextStyle);
        sf sfVar = new sf(this);
        this.i = sfVar;
        sfVar.d(attributeSet, R.attr.editTextStyle);
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
