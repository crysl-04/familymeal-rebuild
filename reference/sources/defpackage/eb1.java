package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class eb1 implements View.OnTouchListener {
    public final /* synthetic */ fb1 h;

    public eb1(fb1 fb1Var) {
        this.h = fb1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        fb1 fb1Var = this.h;
        cb1 cb1Var = fb1Var.x;
        Handler handler = fb1Var.B;
        af afVar = fb1Var.F;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && afVar != null && afVar.isShowing() && x >= 0 && x < afVar.getWidth() && y >= 0 && y < afVar.getHeight()) {
            handler.postDelayed(cb1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(cb1Var);
        return false;
    }
}
