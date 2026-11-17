package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j73 implements s2 {
    public static final AccelerateInterpolator x = new AccelerateInterpolator();
    public static final DecelerateInterpolator y = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public w60 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public i73 i;
    public i73 j;
    public ix0 k;
    public boolean l;
    public boolean p;
    public boolean q;
    public n53 s;
    public boolean t;
    public final ArrayList m = new ArrayList();
    public int n = 0;
    public boolean o = true;
    public boolean r = true;
    public final h73 u = new h73(this, 0);
    public final h73 v = new h73(this, 1);
    public final xl1 w = new xl1((Object) this, (byte) 25);

    public j73(Activity activity, boolean z) {
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z) {
        l53 l53VarH;
        l53 l53VarH2;
        boolean z2 = this.q;
        if (z) {
            if (!z2) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (z2) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = t43.a;
        boolean zIsLaidOut = actionBarContainer.isLaidOut();
        w60 w60Var = this.e;
        if (!zIsLaidOut) {
            if (z) {
                ((jy2) w60Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((jy2) w60Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z) {
            jy2 jy2Var = (jy2) w60Var;
            l53VarH = t43.a(jy2Var.a);
            l53VarH.a(0.0f);
            l53VarH.c(100L);
            l53VarH.d(new iy2(jy2Var, 4));
            l53VarH2 = this.f.h(0, 200L);
        } else {
            jy2 jy2Var2 = (jy2) w60Var;
            l53 l53VarA = t43.a(jy2Var2.a);
            l53VarA.a(1.0f);
            l53VarA.c(200L);
            l53VarA.d(new iy2(jy2Var2, 0));
            l53VarH = this.f.h(8, 100L);
            l53VarH2 = l53VarA;
        }
        n53 n53Var = new n53();
        ArrayList arrayList = n53Var.a;
        arrayList.add(l53VarH);
        View view = (View) l53VarH.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) l53VarH2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(l53VarH2);
        n53Var.b();
    }

    public final void b(View view) {
        w60 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(net.zetetic.database.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(net.zetetic.database.R.id.action_bar);
        if (callbackFindViewById instanceof w60) {
            wrapper = (w60) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(net.zetetic.database.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(net.zetetic.database.R.id.action_bar_container);
        this.d = actionBarContainer;
        w60 w60Var = this.e;
        if (w60Var == null || this.f == null || actionBarContainer == null) {
            li1.g(j73.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((jy2) w60Var).a.getContext();
        this.a = context;
        if ((((jy2) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        if (context.getResources().getBoolean(net.zetetic.database.R.bool.abc_action_bar_embed_tabs)) {
            this.d.setTabContainer(null);
            ((jy2) this.e).getClass();
        } else {
            ((jy2) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((jy2) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, f52.a, net.zetetic.database.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.o) {
                li1.g("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.t = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = t43.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void c(boolean z) {
        if (this.h) {
            return;
        }
        int i = z ? 4 : 0;
        jy2 jy2Var = (jy2) this.e;
        int i2 = jy2Var.b;
        this.h = true;
        jy2Var.a((i & 4) | (i2 & (-5)));
    }

    public final void d(boolean z) {
        boolean z2 = this.q || !this.p;
        boolean z3 = this.r;
        final xl1 xl1Var = this.w;
        View view = this.g;
        if (!z2) {
            if (z3) {
                this.r = false;
                n53 n53Var = this.s;
                if (n53Var != null) {
                    n53Var.a();
                }
                int i = this.n;
                h73 h73Var = this.u;
                if (i != 0 || !z) {
                    h73Var.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                n53 n53Var2 = new n53();
                float f = -this.d.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                l53 l53VarA = t43.a(this.d);
                l53VarA.e(f);
                final View view2 = (View) l53VarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(xl1Var != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: k53
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((j73) this.a.i).d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z4 = n53Var2.e;
                ArrayList arrayList = n53Var2.a;
                if (!z4) {
                    arrayList.add(l53VarA);
                }
                if (this.o && view != null) {
                    l53 l53VarA2 = t43.a(view);
                    l53VarA2.e(f);
                    if (!n53Var2.e) {
                        arrayList.add(l53VarA2);
                    }
                }
                boolean z5 = n53Var2.e;
                if (!z5) {
                    n53Var2.c = x;
                }
                if (!z5) {
                    n53Var2.b = 250L;
                }
                if (!z5) {
                    n53Var2.d = h73Var;
                }
                this.s = n53Var2;
                n53Var2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.r = true;
        n53 n53Var3 = this.s;
        if (n53Var3 != null) {
            n53Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        h73 h73Var2 = this.v;
        if (i2 == 0 && z) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.d.setTranslationY(f2);
            n53 n53Var4 = new n53();
            l53 l53VarA3 = t43.a(this.d);
            l53VarA3.e(0.0f);
            final View view3 = (View) l53VarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(xl1Var != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: k53
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((j73) this.a.i).d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z6 = n53Var4.e;
            ArrayList arrayList2 = n53Var4.a;
            if (!z6) {
                arrayList2.add(l53VarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                l53 l53VarA4 = t43.a(view);
                l53VarA4.e(0.0f);
                if (!n53Var4.e) {
                    arrayList2.add(l53VarA4);
                }
            }
            boolean z7 = n53Var4.e;
            if (!z7) {
                n53Var4.c = y;
            }
            if (!z7) {
                n53Var4.b = 250L;
            }
            if (!z7) {
                n53Var4.d = h73Var2;
            }
            this.s = n53Var4;
            n53Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            h73Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = t43.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public j73(q4 q4Var) {
        b(q4Var.getWindow().getDecorView());
    }
}
