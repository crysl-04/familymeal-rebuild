package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nf extends fb1 implements pf {
    public CharSequence G;
    public kf H;
    public final Rect I;
    public int J;
    public final /* synthetic */ qf K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(qf qfVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.K = qfVar;
        this.I = new Rect();
        this.v = qfVar;
        this.E = true;
        this.F.setFocusable(true);
        this.w = new lf(this, (byte) 0);
    }

    @Override // defpackage.pf
    public final void e(CharSequence charSequence) {
        this.G = charSequence;
    }

    @Override // defpackage.pf
    public final void j(int i) {
        this.J = i;
    }

    @Override // defpackage.pf
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        af afVar = this.F;
        boolean zIsShowing = afVar.isShowing();
        s();
        afVar.setInputMethodMode(2);
        d();
        be0 be0Var = this.j;
        byte b = 1;
        be0Var.setChoiceMode(1);
        be0Var.setTextDirection(i);
        be0Var.setTextAlignment(i2);
        qf qfVar = this.K;
        int selectedItemPosition = qfVar.getSelectedItemPosition();
        be0 be0Var2 = this.j;
        if (afVar.isShowing() && be0Var2 != null) {
            be0Var2.setListSelectionHidden(false);
            be0Var2.setSelection(selectedItemPosition);
            if (be0Var2.getChoiceMode() != 0) {
                be0Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = qfVar.getViewTreeObserver()) == null) {
            return;
        }
        hf hfVar = new hf(this, b);
        viewTreeObserver.addOnGlobalLayoutListener(hfVar);
        afVar.setOnDismissListener(new mf(this, hfVar));
    }

    @Override // defpackage.pf
    public final CharSequence o() {
        return this.G;
    }

    @Override // defpackage.fb1, defpackage.pf
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.H = (kf) listAdapter;
    }

    public final void s() {
        int i;
        af afVar = this.F;
        Drawable background = afVar.getBackground();
        qf qfVar = this.K;
        Rect rect = qfVar.o;
        if (background != null) {
            background.getPadding(rect);
            i = r53.a(qfVar) ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = qfVar.getPaddingLeft();
        int paddingRight = qfVar.getPaddingRight();
        int width = qfVar.getWidth();
        int i2 = qfVar.n;
        if (i2 == -2) {
            int iA = qfVar.a(this.H, afVar.getBackground());
            int i3 = (qfVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.m = r53.a(qfVar) ? (((width - paddingRight) - this.l) - this.J) + i : paddingLeft + this.J + i;
    }
}
