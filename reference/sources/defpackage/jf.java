package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jf implements pf, DialogInterface.OnClickListener {
    public q4 h;
    public kf i;
    public CharSequence j;
    public final /* synthetic */ qf k;

    public jf(qf qfVar) {
        this.k = qfVar;
    }

    @Override // defpackage.pf
    public final boolean a() {
        q4 q4Var = this.h;
        if (q4Var != null) {
            return q4Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.pf
    public final int b() {
        return 0;
    }

    @Override // defpackage.pf
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.pf
    public final void dismiss() {
        q4 q4Var = this.h;
        if (q4Var != null) {
            q4Var.dismiss();
            this.h = null;
        }
    }

    @Override // defpackage.pf
    public final void e(CharSequence charSequence) {
        this.j = charSequence;
    }

    @Override // defpackage.pf
    public final void m(int i, int i2) {
        if (this.i == null) {
            return;
        }
        qf qfVar = this.k;
        p4 p4Var = new p4(qfVar.getPopupContext());
        l4 l4Var = (l4) p4Var.c;
        CharSequence charSequence = this.j;
        if (charSequence != null) {
            l4Var.d = charSequence;
        }
        kf kfVar = this.i;
        int selectedItemPosition = qfVar.getSelectedItemPosition();
        l4Var.i = kfVar;
        l4Var.j = this;
        l4Var.m = selectedItemPosition;
        l4Var.l = true;
        q4 q4VarC = p4Var.c();
        this.h = q4VarC;
        AlertController$RecycleListView alertController$RecycleListView = q4VarC.j.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.h.show();
    }

    @Override // defpackage.pf
    public final int n() {
        return 0;
    }

    @Override // defpackage.pf
    public final CharSequence o() {
        return this.j;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        qf qfVar = this.k;
        qfVar.setSelection(i);
        if (qfVar.getOnItemClickListener() != null) {
            qfVar.performItemClick(null, i, this.i.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.pf
    public final void p(ListAdapter listAdapter) {
        this.i = (kf) listAdapter;
    }

    @Override // defpackage.pf
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.pf
    public final void i(int i) {
    }

    @Override // defpackage.pf
    public final void j(int i) {
    }

    @Override // defpackage.pf
    public final void l(int i) {
    }
}
