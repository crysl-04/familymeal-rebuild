package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.WeakHashMap;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q6 implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ q6(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        int i;
        Object obj;
        b3 b3Var;
        byte b = 1;
        switch (this.h) {
            case 0:
                t6 t6Var = (t6) this.i;
                t6Var.removeCallbacks(this);
                MotionEvent motionEvent = t6Var.t0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i2 = 7;
                if (actionMasked != 7) {
                    i = 9;
                    if (actionMasked != 8) {
                        if (actionMasked != 9) {
                            i2 = 2;
                        }
                        i = i2;
                    }
                } else {
                    i = i2;
                }
                t6Var.H(motionEvent, i, t6Var.u0, false);
                return;
            case 1:
                hb1 hb1Var = (hb1) this.i;
                be0 be0Var = hb1Var.j;
                qi qiVar = hb1Var.h;
                if (hb1Var.u) {
                    if (hb1Var.s) {
                        hb1Var.s = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        qiVar.d = jCurrentAnimationTimeMillis;
                        qiVar.f = -1L;
                        qiVar.e = jCurrentAnimationTimeMillis;
                        qiVar.g = 0.5f;
                    }
                    if ((qiVar.f > 0 && AnimationUtils.currentAnimationTimeMillis() > qiVar.f + ((long) qiVar.h)) || !hb1Var.e()) {
                        hb1Var.u = false;
                        return;
                    }
                    if (hb1Var.t) {
                        hb1Var.t = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        be0Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (qiVar.e == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = qiVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - qiVar.e;
                    qiVar.e = jCurrentAnimationTimeMillis2;
                    hb1Var.w.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * qiVar.c));
                    WeakHashMap weakHashMap = t43.a;
                    be0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                jn jnVar = ((bn) this.i).g0;
                if (jnVar.c == null) {
                    jnVar.c = new gg(b);
                    return;
                }
                return;
            case 3:
                ca0 ca0Var = (ca0) this.i;
                ca0Var.i0.onDismiss(ca0Var.q0);
                return;
            case 4:
                be0 be0Var2 = (be0) this.i;
                be0Var2.t = null;
                be0Var2.drawableStateChanged();
                return;
            case 5:
                mj0 mj0Var = (mj0) this.i;
                Context contextJ = mj0Var.j();
                if (contextJ != null) {
                    mj0Var.x0.e(1);
                    jn jnVar2 = mj0Var.x0;
                    String string = contextJ.getString(R.string.fingerprint_dialog_touch_sensor);
                    vi1 vi1Var = jnVar2.v;
                    if (vi1Var == null) {
                        vi1Var = new vi1();
                        jnVar2.v = vi1Var;
                    }
                    jn.g(vi1Var, string);
                    return;
                }
                return;
            case 6:
                jo0 jo0Var = (jo0) this.i;
                if (jo0Var.P != null) {
                    jo0Var.e();
                    return;
                }
                return;
            case 7:
                ((yo0) this.i).A(true);
                return;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                synchronized (((vi1) this.i).a) {
                    obj = ((vi1) this.i).f;
                    ((vi1) this.i).f = vi1.k;
                    break;
                }
                ((vi1) this.i).f(obj);
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) this.i).h;
                if (actionMenuView == null || (b3Var = actionMenuView.A) == null) {
                    return;
                }
                b3Var.l();
                return;
        }
    }
}
