package defpackage;

import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class na0 extends jx {
    public kp0 l;
    public la0 m;
    public final View n;
    public final ia0 o;
    public boolean p;

    public na0(kp0 kp0Var, la0 la0Var, View view, u31 u31Var, e90 e90Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme), 0);
        this.l = kp0Var;
        this.m = la0Var;
        this.n = view;
        Window window = getWindow();
        if (window == null) {
            li1.g("Dialog has no window");
            throw null;
        }
        la0 la0Var2 = this.m;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            la0Var2.getClass();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        byte b = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.m.getClass();
        h12.A(window, true);
        window.setGravity(17);
        this.m.getClass();
        ia0 ia0Var = new ia0(getContext(), window);
        this.m.getClass();
        setTitle("");
        ia0Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        ia0Var.setClipChildren(false);
        ia0Var.setElevation(e90Var.A(8.0f));
        ia0Var.setOutlineProvider(new ma0((byte) 0));
        this.o = ia0Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            h(viewGroup);
        }
        setContentView(ia0Var);
        ia0Var.setTag(R.id.view_tree_lifecycle_owner, m02.i(view));
        ia0Var.setTag(R.id.view_tree_view_model_store_owner, r02.q(view));
        ia0Var.setTag(R.id.view_tree_saved_state_registry_owner, p02.y(view));
        i(this.l, this.m, u31Var);
        kq1 kq1VarD = d();
        z7 z7Var = new z7(this, b);
        kq1VarD.getClass();
        kq1VarD.a(new qo0(z7Var), this);
    }

    public static final void h(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof ia0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                h(viewGroup2);
            }
        }
    }

    public final void i(kp0 kp0Var, la0 la0Var, u31 u31Var) {
        int i;
        this.l = kp0Var;
        this.m = la0Var;
        la0Var.getClass();
        boolean zB = ca.b(this.n);
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal = u31Var.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                wg.n();
                return;
            }
            i = 1;
        }
        ia0 ia0Var = this.o;
        ia0Var.setLayoutDirection(i);
        boolean z = la0Var.a;
        Window window2 = ia0Var.q;
        boolean z2 = (ia0Var.u && z == ia0Var.s && true == ia0Var.t) ? false : true;
        ia0Var.s = z;
        ia0Var.t = true;
        if (z2) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z ? -2 : -1;
            if (i2 != attributes.width || !ia0Var.u) {
                window2.setLayout(i2, -2);
                ia0Var.u = true;
            }
        }
        setCanceledOnTouchOutside(true);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(0);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.m.getClass();
        if (!keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.l.a();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iX;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        this.m.getClass();
        ia0 ia0Var = this.o;
        ia0Var.getClass();
        if (Math.abs(motionEvent.getX()) > Float.MAX_VALUE || Math.abs(motionEvent.getY()) > Float.MAX_VALUE || (childAt = ia0Var.getChildAt(0)) == null) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                this.p = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.p = false;
                    return zOnTouchEvent;
                }
            } else if (this.p) {
                this.l.a();
                this.p = false;
                return true;
            }
        } else {
            int left = childAt.getLeft() + ia0Var.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + ia0Var.getTop();
            int height = childAt.getHeight() + top;
            int iX2 = ie1.x(motionEvent.getX());
            if (left > iX2 || iX2 > width || top > (iX = ie1.x(motionEvent.getY())) || iX > height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    this.p = true;
                    return true;
                }
                if (actionMasked != 1) {
                    if (actionMasked == 3) {
                        this.p = false;
                        return zOnTouchEvent;
                    }
                } else if (this.p) {
                    this.l.a();
                    this.p = false;
                    return true;
                }
            } else {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
                    this.p = false;
                    return zOnTouchEvent;
                }
            }
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
