package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.UUID;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m12 extends u {
    public static final vw1 K = new vw1(12);
    public final lu1 A;
    public final lu1 B;
    public ry0 C;
    public final o90 D;
    public final Rect E;
    public final nl2 F;
    public vd G;
    public final lu1 H;
    public boolean I;
    public final int[] J;
    public kp0 q;
    public p12 r;
    public String s;
    public final View t;
    public final boolean u;
    public final jy1 v;
    public final WindowManager w;
    public final WindowManager.LayoutParams x;
    public o12 y;
    public u31 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m12(kp0 kp0Var, p12 p12Var, String str, View view, e90 e90Var, o12 o12Var, UUID uuid, boolean z) {
        super(view.getContext());
        jy1 n12Var = Build.VERSION.SDK_INT >= 30 ? new n12((byte) 4) : new jy1((byte) 4);
        this.q = kp0Var;
        this.r = p12Var;
        this.s = str;
        this.t = view;
        this.u = z;
        this.v = n12Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.w = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        p12 p12Var2 = this.r;
        boolean zB = ca.b(view);
        boolean z2 = p12Var2.b;
        int i = p12Var2.a;
        if (z2) {
            if (zB) {
                i |= 8192;
            } else if (!zB) {
                i &= -8193;
            }
        }
        layoutParams.flags = i;
        layoutParams.type = this.r.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.x = layoutParams;
        this.y = o12Var;
        this.z = u31.h;
        this.A = rz1.x(null);
        this.B = rz1.x(null);
        this.D = il2.b(new xu1(this, (byte) 1));
        this.E = new Rect();
        this.F = new nl2(new t9(this, (byte) 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, m02.i(view));
        setTag(R.id.view_tree_view_model_store_owner, r02.q(view));
        setTag(R.id.view_tree_saved_state_registry_owner, p02.y(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(e90Var.A(8.0f));
        setOutlineProvider(new ma0((byte) 1));
        this.H = rz1.x(ie1.m);
        this.J = new int[2];
    }

    private final zp0 getContent() {
        return (zp0) this.H.getValue();
    }

    private final ry0 getDisplayBounds() {
        int i = this.r.a & 512;
        View view = this.t;
        Rect rect = this.E;
        jy1 jy1Var = this.v;
        if (i == 0) {
            jy1Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            jy1Var.C(view, rect);
        }
        return new ry0(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final t31 getParentLayoutCoordinates() {
        return (t31) this.B.getValue();
    }

    public static final boolean m(m12 m12Var) {
        t31 parentLayoutCoordinates = m12Var.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.C()) {
            parentLayoutCoordinates = null;
        }
        return (parentLayoutCoordinates == null || m12Var.m0getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    private final void setContent(zp0 zp0Var) {
        this.H.setValue(zp0Var);
    }

    private final void setParentLayoutCoordinates(t31 t31Var) {
        this.B.setValue(t31Var);
    }

    @Override // defpackage.u
    public final void b(int i, dr0 dr0Var) {
        dr0Var.W(-857613600);
        int i2 = (dr0Var.h(this) ? 4 : 2) | i;
        if (dr0Var.N(i2 & 1, (i2 & 3) != 2)) {
            getContent().f(dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s(this, i, (byte) 17);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.r.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                kp0 kp0Var = this.q;
                if (kp0Var != null) {
                    kp0Var.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.x;
    }

    public final u31 getParentLayoutDirection() {
        return this.z;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final vy0 m0getPopupContentSizebOM6tXw() {
        return (vy0) this.A.getValue();
    }

    public final o12 getPositionProvider() {
        return this.y;
    }

    @Override // defpackage.u
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.I;
    }

    public final String getTestTag() {
        return this.s;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.u
    public final void h(boolean z, int i, int i2, int i3, int i4) {
        super.h(z, i, i2, i3, i4);
        this.r.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.x;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.v.getClass();
        this.w.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.u
    public final void i(int i, int i2) {
        this.r.getClass();
        ry0 displayBounds = getDisplayBounds();
        super.i(View.MeasureSpec.makeMeasureSpec(displayBounds.c - displayBounds.a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.d - displayBounds.b, Integer.MIN_VALUE));
    }

    public final void n(jz jzVar, zp0 zp0Var) {
        setParentCompositionContext(jzVar);
        setContent(zp0Var);
        this.I = true;
    }

    public final void o(kp0 kp0Var, p12 p12Var, String str, u31 u31Var) {
        int i;
        this.q = kp0Var;
        this.s = str;
        if (!uz0.g(this.r, p12Var)) {
            p12Var.getClass();
            this.r = p12Var;
            boolean zB = ca.b(this.t);
            boolean z = p12Var.b;
            int i2 = p12Var.a;
            if (z) {
                if (zB) {
                    i2 |= 8192;
                } else if (!zB) {
                    i2 &= -8193;
                }
            }
            WindowManager.LayoutParams layoutParams = this.x;
            layoutParams.flags = i2;
            this.v.getClass();
            this.w.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = u31Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                wg.n();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // defpackage.u, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.e();
        if (!this.r.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        vd vdVar = this.G;
        if (vdVar == null) {
            vd vdVar2 = new vd(this.q, (byte) 0);
            this.G = vdVar2;
            vdVar = vdVar2;
        }
        b2.f(this, vdVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nl2 nl2Var = this.F;
        v3 v3Var = nl2Var.h;
        if (v3Var != null) {
            v3Var.b();
        }
        nl2Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            b2.g(this, this.G);
        }
        this.G = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.r.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            kp0 kp0Var = this.q;
            if (kp0Var != null) {
                kp0Var.a();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            kp0 kp0Var2 = this.q;
            if (kp0Var2 != null) {
                kp0Var2.a();
            }
        }
        return true;
    }

    public final void p() {
        t31 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.C()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long jO = parentLayoutCoordinates.O();
                long jC = this.u ? parentLayoutCoordinates.c(0L) : parentLayoutCoordinates.k(0L);
                long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jC >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jC & 4294967295L)))) & 4294967295L);
                int i = (int) (jRound >> 32);
                int i2 = (int) (jRound & 4294967295L);
                ry0 ry0Var = new ry0(i, i2, ((int) (jO >> 32)) + i, ((int) (jO & 4294967295L)) + i2);
                if (ry0Var.equals(this.C)) {
                    return;
                }
                this.C = ry0Var;
                r();
            }
        }
    }

    public final void q(t31 t31Var) {
        setParentLayoutCoordinates(t31Var);
        p();
    }

    public final void r() {
        vy0 vy0VarM0getPopupContentSizebOM6tXw;
        final ry0 ry0Var = this.C;
        if (ry0Var == null || (vy0VarM0getPopupContentSizebOM6tXw = m0getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = vy0VarM0getPopupContentSizebOM6tXw.a;
        ry0 displayBounds = getDisplayBounds();
        final long j2 = (((long) (displayBounds.d - displayBounds.b)) & 4294967295L) | (((long) (displayBounds.c - displayBounds.a)) << 32);
        final w72 w72Var = new w72();
        w72Var.h = 0L;
        this.F.d(this, K, new kp0() { // from class: l12
            @Override // defpackage.kp0
            public final Object a() {
                m12 m12Var = this;
                w72Var.h = m12Var.y.f(ry0Var, j2, m12Var.z, j);
                return j23.a;
            }
        });
        long j3 = w72Var.h;
        WindowManager.LayoutParams layoutParams = this.x;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.r.e;
        jy1 jy1Var = this.v;
        if (z) {
            jy1Var.getClass();
            setSystemGestureExclusionRects(lt.S(new Rect(0, 0, (int) (j2 >> 32), (int) (j2 & 4294967295L))));
        }
        jy1Var.getClass();
        this.w.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(u31 u31Var) {
        this.z = u31Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(vy0 vy0Var) {
        this.A.setValue(vy0Var);
    }

    public final void setPositionProvider(o12 o12Var) {
        this.y = o12Var;
    }

    public final void setTestTag(String str) {
        this.s = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public u getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
