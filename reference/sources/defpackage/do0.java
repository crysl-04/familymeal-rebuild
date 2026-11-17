package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class do0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float h;
    public final int i;
    public final int j;
    public final View k;
    public co0 l;
    public co0 m;
    public boolean n;
    public int o;
    public final int[] p = new int[2];

    public do0(View view) {
        this.k = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.h = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.i = tapTimeout;
        this.j = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        co0 co0Var = this.m;
        View view = this.k;
        if (co0Var != null) {
            view.removeCallbacks(co0Var);
        }
        co0 co0Var2 = this.l;
        if (co0Var2 != null) {
            view.removeCallbacks(co0Var2);
        }
    }

    public abstract aj2 b();

    public abstract boolean c();

    public boolean d() {
        aj2 aj2VarB = b();
        if (aj2VarB == null || !aj2VarB.a()) {
            return true;
        }
        aj2VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        be0 be0VarH;
        boolean z2 = this.n;
        View view2 = this.k;
        if (z2) {
            aj2 aj2VarB = b();
            if (aj2VarB != null && aj2VarB.a() && (be0VarH = aj2VarB.h()) != null && be0VarH.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.p;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                be0VarH.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = be0VarH.b(motionEventObtainNoHistory, this.o);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z3) {
                    z = true;
                } else if (d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.o = motionEvent.getPointerId(0);
                    co0 co0Var = this.l;
                    if (co0Var == null) {
                        co0Var = new co0(this, (byte) 0);
                        this.l = co0Var;
                    }
                    view2.postDelayed(co0Var, this.i);
                    co0 co0Var2 = this.m;
                    if (co0Var2 == null) {
                        co0Var2 = new co0(this, (byte) 1);
                        this.m = co0Var2;
                    }
                    view2.postDelayed(co0Var2, this.j);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.o);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.h;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.n = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.n = false;
        this.o = -1;
        co0 co0Var = this.l;
        if (co0Var != null) {
            this.k.removeCallbacks(co0Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
