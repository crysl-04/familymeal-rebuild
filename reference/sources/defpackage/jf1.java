package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jf1 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, vf1 {
    public if1 h;
    public q4 i;
    public ab1 j;

    @Override // defpackage.vf1
    public final void c(if1 if1Var, boolean z) {
        q4 q4Var;
        if ((z || if1Var == this.h) && (q4Var = this.i) != null) {
            q4Var.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if1 if1Var = this.h;
        ab1 ab1Var = this.j;
        za1 za1Var = ab1Var.m;
        if (za1Var == null) {
            za1Var = new za1(ab1Var);
            ab1Var.m = za1Var;
        }
        if1Var.q(za1Var.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.j.c(this.h, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if1 if1Var = this.h;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.i.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.i.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                if1Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return if1Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.vf1
    public final boolean v(if1 if1Var) {
        return false;
    }
}
