package defpackage;

import android.R;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class te extends ke implements gf1, LayoutInflater.Factory2 {
    public static final bj2 d0 = new bj2();
    public static final int[] e0 = {R.attr.windowBackground};
    public static final boolean f0 = !"robolectric".equals(Build.FINGERPRINT);
    public TextView A;
    public View B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public se[] K;
    public se L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final int Q;
    public int R;
    public boolean S;
    public boolean T;
    public pe U;
    public pe V;
    public boolean W;
    public int X;
    public final le Y;
    public boolean Z;
    public Rect a0;
    public Rect b0;
    public ag c0;
    public final q4 j;
    public final Context k;
    public Window l;
    public oe m;
    public j73 n;
    public CharSequence o;
    public ActionBarOverlayLayout p;
    public me q;
    public me r;
    public f3 s;
    public ActionBarContextView t;
    public PopupWindow u;
    public le v;
    public l53 w;
    public final boolean x;
    public boolean y;
    public ViewGroup z;

    public te(q4 q4Var, q4 q4Var2) {
        Context context = q4Var.getContext();
        Window window = q4Var.getWindow();
        this.w = null;
        this.x = true;
        this.Q = -100;
        this.Y = new le(this, (byte) 0);
        this.k = context;
        this.j = q4Var;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.Q == -100) {
            String name = this.j.getClass().getName();
            bj2 bj2Var = d0;
            Integer num = (Integer) bj2Var.get(name);
            if (num != null) {
                this.Q = num.intValue();
                bj2Var.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            f(window);
        }
        ve.c();
    }

    @Override // defpackage.ke
    public final void a() {
        this.N = true;
        e(false);
        n();
        this.O = true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    @Override // defpackage.gf1
    public final boolean b(if1 if1Var, MenuItem menuItem) {
        se seVar;
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.P) {
            if1 if1VarK = if1Var.k();
            se[] seVarArr = this.K;
            int length = seVarArr != null ? seVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                seVar = seVarArr[i];
                if (seVar != null && seVar.h == if1VarK) {
                    if (seVar != null) {
                        return callback.onMenuItemSelected(seVar.a, menuItem);
                    }
                }
            }
            seVar = null;
            if (seVar != null) {
                return callback.onMenuItemSelected(seVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.ke
    public final boolean d(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.I && i == 108) {
            return false;
        }
        if (this.E && i == 1) {
            this.E = false;
        }
        if (i == 1) {
            w();
            this.I = true;
            return true;
        }
        if (i == 2) {
            w();
            this.C = true;
            return true;
        }
        if (i == 5) {
            w();
            this.D = true;
            return true;
        }
        if (i == 10) {
            w();
            this.G = true;
            return true;
        }
        if (i == 108) {
            w();
            this.E = true;
            return true;
        }
        if (i != 109) {
            return this.l.requestFeature(i);
        }
        w();
        this.F = true;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    public final boolean e(boolean z) {
        int i;
        boolean z2 = false;
        if (this.P) {
            return false;
        }
        int i2 = this.Q;
        if (i2 == -100) {
            i2 = -100;
        }
        Context context = this.k;
        int iF = -1;
        if (i2 != -100) {
            if (i2 == -1) {
                iF = i2;
            } else if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    iF = i2;
                } else {
                    if (i2 != 3) {
                        li1.g("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        return false;
                    }
                    pe peVar = this.V;
                    if (peVar == null) {
                        peVar = new pe(this, context);
                        this.V = peVar;
                    }
                    iF = peVar.f();
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() != 0) {
                iF = p(context).f();
            }
        }
        if (iF != 1) {
            i = iF != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i = 16;
        }
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i | (configuration.uiMode & (-49));
        this.T = true;
        int i3 = context.getResources().getConfiguration().uiMode & 48;
        int i4 = configuration.uiMode & 48;
        if (i3 != i4) {
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = i4 | (resources.getConfiguration().uiMode & (-49));
            resources.updateConfiguration(configuration2, null);
            int i5 = this.R;
            if (i5 != 0) {
                context.setTheme(i5);
                context.getTheme().applyStyle(this.R, true);
            }
            z2 = true;
        }
        if (i2 == 0) {
            p(context).l();
        } else {
            pe peVar2 = this.U;
            if (peVar2 != null) {
                peVar2.c();
            }
        }
        pe peVar3 = this.V;
        if (i2 == 3) {
            if (peVar3 == null) {
                peVar3 = new pe(this, context);
                this.V = peVar3;
            }
            peVar3.l();
        } else if (peVar3 != null) {
            peVar3.c();
        }
        return z2;
    }

    public final void f(Window window) {
        int resourceId;
        if (this.l != null) {
            li1.g("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof oe) {
            li1.g("AppCompat has already installed itself into the Window");
            return;
        }
        oe oeVar = new oe(this, callback);
        this.m = oeVar;
        window.setCallback(oeVar);
        Context context = this.k;
        Drawable drawableE = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, e0);
        if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) != 0) {
            ve veVarA = ve.a();
            synchronized (veVarA) {
                drawableE = veVarA.a.e(context, resourceId, true);
            }
        }
        if (drawableE != null) {
            window.setBackgroundDrawable(drawableE);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.l = window;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // defpackage.gf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.if1 r6) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.g(if1):void");
    }

    public final void h(int i, se seVar, if1 if1Var) {
        if (if1Var == null) {
            if (seVar == null && i >= 0) {
                se[] seVarArr = this.K;
                if (i < seVarArr.length) {
                    seVar = seVarArr[i];
                }
            }
            if (seVar != null) {
                if1Var = seVar.h;
            }
        }
        if ((seVar == null || seVar.m) && !this.P) {
            this.m.h.onPanelClosed(i, if1Var);
        }
    }

    public final void i(if1 if1Var) {
        b3 b3Var;
        if (this.J) {
            return;
        }
        this.J = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.p;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((jy2) actionBarOverlayLayout.l).a.h;
        if (actionMenuView != null && (b3Var = actionMenuView.A) != null) {
            b3Var.d();
            x2 x2Var = b3Var.A;
            if (x2Var != null && x2Var.b()) {
                x2Var.i.dismiss();
            }
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.P) {
            callback.onPanelClosed(108, if1Var);
        }
        this.J = false;
    }

    public final void j(se seVar, boolean z) {
        re reVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        b3 b3Var;
        if (z && seVar.a == 0 && (actionBarOverlayLayout = this.p) != null) {
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((jy2) actionBarOverlayLayout.l).a.h;
            if (actionMenuView != null && (b3Var = actionMenuView.A) != null && b3Var.h()) {
                i(seVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && seVar.m && (reVar = seVar.e) != null) {
            windowManager.removeView(reVar);
            if (z) {
                h(seVar.a, seVar, null);
            }
        }
        seVar.k = false;
        seVar.l = false;
        seVar.m = false;
        seVar.f = null;
        seVar.n = true;
        if (this.L == seVar) {
            this.L = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fa  */
    public final boolean k(KeyEvent keyEvent) {
        w60 w60Var;
        cy2 cy2Var;
        lf1 lf1Var;
        boolean z;
        boolean z2;
        boolean zV;
        AudioManager audioManager;
        ActionMenuView actionMenuView;
        b3 b3Var;
        b3 b3Var2;
        b3 b3Var3;
        q4 q4Var = this.j;
        if (((q4Var instanceof w21) || q4Var != null) && this.l.getDecorView() != null) {
            WeakHashMap weakHashMap = t43.a;
        }
        if (keyEvent.getKeyCode() != 82 || !this.m.h.dispatchKeyEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.M = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        se seVarQ = q(0);
                        if (!seVarQ.m) {
                            v(seVarQ, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.s == null) {
                        se seVarQ2 = q(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.p;
                        Context context = this.k;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((jy2) actionBarOverlayLayout.l).a;
                            if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.h) == null || !actionMenuView.z || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                z = seVarQ2.m;
                                if (!z || seVarQ2.l) {
                                    j(seVarQ2, true);
                                    z2 = z;
                                } else {
                                    if (seVarQ2.k) {
                                        if (seVarQ2.o) {
                                            seVarQ2.k = false;
                                            zV = v(seVarQ2, keyEvent);
                                        } else {
                                            zV = true;
                                        }
                                        if (zV) {
                                            t(seVarQ2, keyEvent);
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                            } else {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.p;
                                actionBarOverlayLayout2.k();
                                ActionMenuView actionMenuView2 = ((jy2) actionBarOverlayLayout2.l).a.h;
                                if (actionMenuView2 == null || (b3Var2 = actionMenuView2.A) == null || !b3Var2.h()) {
                                    if (!this.P && v(seVarQ2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = this.p;
                                        actionBarOverlayLayout3.k();
                                        ActionMenuView actionMenuView3 = ((jy2) actionBarOverlayLayout3.l).a.h;
                                        if (actionMenuView3 != null && (b3Var = actionMenuView3.A) != null && b3Var.l()) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.p;
                                    actionBarOverlayLayout4.k();
                                    ActionMenuView actionMenuView4 = ((jy2) actionBarOverlayLayout4.l).a.h;
                                    if (actionMenuView4 == null || (b3Var3 = actionMenuView4.A) == null || !b3Var3.d()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                }
                            }
                        } else {
                            z = seVarQ2.m;
                            if (z) {
                            }
                            j(seVarQ2, true);
                            z2 = z;
                        }
                        if (z2 && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                    }
                }
                return false;
            }
            boolean z3 = this.M;
            this.M = false;
            se seVarQ3 = q(0);
            if (!seVarQ3.m) {
                f3 f3Var = this.s;
                if (f3Var != null) {
                    f3Var.c();
                    return true;
                }
                j73 j73VarR = r();
                if (j73VarR != null && (w60Var = j73VarR.e) != null && (cy2Var = ((jy2) w60Var).a.Q) != null && (lf1Var = cy2Var.i) != null) {
                    if (cy2Var == null) {
                        lf1Var = null;
                    }
                    if (lf1Var != null) {
                        lf1Var.collapseActionView();
                    }
                }
                return false;
            }
            if (!z3) {
                j(seVarQ3, true);
                return true;
            }
        }
        return true;
    }

    public final void l(int i) {
        se seVarQ = q(i);
        if (seVarQ.h != null) {
            Bundle bundle = new Bundle();
            seVarQ.h.t(bundle);
            if (bundle.size() > 0) {
                seVarQ.p = bundle;
            }
            seVarQ.h.w();
            seVarQ.h.clear();
        }
        seVarQ.o = true;
        seVarQ.n = true;
        if ((i == 108 || i == 0) && this.p != null) {
            se seVarQ2 = q(0);
            seVarQ2.k = false;
            v(seVarQ2, null);
        }
    }

    public final void m() {
        ViewGroup viewGroup;
        if (this.y) {
            return;
        }
        Context context = this.k;
        int[] iArr = f52.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(115)) {
            typedArrayObtainStyledAttributes.recycle();
            li1.g("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        byte b = 0;
        byte b2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(124, false)) {
            d(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(115, false)) {
            d(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(116, false)) {
            d(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            d(10);
        }
        this.H = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        n();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.I) {
            viewGroup = this.G ? (ViewGroup) layoutInflaterFrom.inflate(net.zetetic.database.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(net.zetetic.database.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.H) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(net.zetetic.database.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.F = false;
            this.E = false;
        } else if (this.E) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(net.zetetic.database.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new l10(context, typedValue.resourceId) : context).inflate(net.zetetic.database.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(net.zetetic.database.R.id.decor_content_parent);
            this.p = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.l.getCallback());
            if (this.F) {
                this.p.j(109);
            }
            if (this.C) {
                this.p.j(2);
            }
            if (this.D) {
                this.p.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.E + ", windowActionBarOverlay: " + this.F + ", android:windowIsFloating: " + this.H + ", windowActionModeOverlay: " + this.G + ", windowNoTitle: " + this.I + " }");
        }
        me meVar = new me(this, b);
        WeakHashMap weakHashMap = t43.a;
        o43.c(viewGroup, meVar);
        if (this.p == null) {
            this.A = (TextView) viewGroup.findViewById(net.zetetic.database.R.id.title);
        }
        Method method = r53.a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(net.zetetic.database.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new me(this, b2));
        this.z = viewGroup;
        CharSequence charSequence = this.o;
        if (!TextUtils.isEmpty(charSequence)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.p;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(charSequence);
            } else {
                j73 j73Var = this.n;
                if (j73Var != null) {
                    jy2 jy2Var = (jy2) j73Var.e;
                    if (!jy2Var.g) {
                        jy2Var.h = charSequence;
                        if ((jy2Var.b & 8) != 0) {
                            jy2Var.a.setTitle(charSequence);
                        }
                    }
                } else {
                    TextView textView = this.A;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.z.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.n.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = t43.a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(118)) {
            typedArrayObtainStyledAttributes2.getValue(118, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(119)) {
            typedArrayObtainStyledAttributes2.getValue(119, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.y = true;
        se seVarQ = q(0);
        if (this.P || seVarQ.h != null) {
            return;
        }
        s(108);
    }

    public final void n() {
        if (this.l != null) {
            return;
        }
        li1.g("We have not been given a Window");
    }

    public final Context o() {
        Context context;
        j73 j73VarR = r();
        if (j73VarR != null) {
            if (j73VarR.b == null) {
                TypedValue typedValue = new TypedValue();
                j73VarR.a.getTheme().resolveAttribute(net.zetetic.database.R.attr.actionBarWidgetTheme, typedValue, true);
                int i = typedValue.resourceId;
                if (i != 0) {
                    j73VarR.b = new ContextThemeWrapper(j73VarR.a, i);
                } else {
                    j73VarR.b = j73VarR.a;
                }
            }
            context = j73VarR.b;
        } else {
            context = null;
        }
        return context == null ? this.k : context;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View cfVar;
        ag agVar = this.c0;
        View view2 = null;
        if (agVar == null) {
            String string = this.k.obtainStyledAttributes(f52.j).getString(114);
            if (string == null) {
                agVar = new ag();
                this.c0 = agVar;
            } else {
                try {
                    agVar = (ag) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
                    this.c0 = agVar;
                } catch (Throwable unused) {
                    agVar = new ag();
                    this.c0 = agVar;
                }
            }
        }
        int i = i33.a;
        agVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f52.y, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.recycle();
        Context l10Var = (resourceId == 0 || ((context instanceof l10) && ((l10) context).a == resourceId)) ? context : new l10(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                cfVar = new cf(l10Var, attributeSet);
                break;
            case 1:
                cfVar = new ie(l10Var, attributeSet);
                break;
            case 2:
                cfVar = new ze(l10Var, attributeSet);
                break;
            case 3:
                cfVar = new tf(l10Var, attributeSet);
                break;
            case 4:
                cfVar = new xe(l10Var, attributeSet, net.zetetic.database.R.attr.imageButtonStyle);
                break;
            case 5:
                cfVar = new ef(l10Var, attributeSet);
                break;
            case 6:
                cfVar = new qf(l10Var, attributeSet);
                break;
            case 7:
                cfVar = new bf(l10Var, attributeSet);
                break;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                yf yfVar = new yf(l10Var, attributeSet, R.attr.buttonStyleToggle);
                dx2.a(yfVar, yfVar.getContext());
                new sf(yfVar).d(attributeSet, R.attr.buttonStyleToggle);
                cfVar = yfVar;
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                cfVar = new ye(l10Var, attributeSet, 0);
                break;
            case 10:
                cfVar = new ee(l10Var, attributeSet);
                break;
            case 11:
                cfVar = new he(l10Var, attributeSet);
                break;
            case 12:
                cfVar = new we(l10Var, attributeSet);
                break;
            case 13:
                cfVar = new ge(l10Var, attributeSet);
                break;
            default:
                cfVar = null;
                break;
        }
        if (cfVar == null && context != l10Var) {
            Object[] objArr = agVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = l10Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = ag.d;
                        if (i2 < 3) {
                            View viewA = agVar.a(l10Var, str, strArr[i2]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewA2 = agVar.a(l10Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused2) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th) {
                objArr[0] = null;
                objArr[1] = null;
                throw th;
            }
            cfVar = view2;
        }
        if (cfVar != null) {
            Context context2 = cfVar.getContext();
            if (context2 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = t43.a;
                if (cfVar.hasOnClickListeners()) {
                    TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, ag.c);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        cfVar.setOnClickListener(new zf(cfVar, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return cfVar;
    }

    public final r1 p(Context context) {
        pe peVar = this.U;
        if (peVar == null) {
            eg egVar = eg.n;
            if (egVar == null) {
                Context applicationContext = context.getApplicationContext();
                egVar = new eg(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                eg.n = egVar;
            }
            peVar = new pe(this, egVar);
            this.U = peVar;
        }
        return peVar;
    }

    public final se q(int i) {
        se[] seVarArr = this.K;
        if (seVarArr == null || seVarArr.length <= i) {
            se[] seVarArr2 = new se[i + 1];
            if (seVarArr != null) {
                System.arraycopy(seVarArr, 0, seVarArr2, 0, seVarArr.length);
            }
            this.K = seVarArr2;
            seVarArr = seVarArr2;
        }
        se seVar = seVarArr[i];
        if (seVar != null) {
            return seVar;
        }
        se seVar2 = new se();
        seVar2.a = i;
        seVar2.n = false;
        seVarArr[i] = seVar2;
        return seVar2;
    }

    public final j73 r() {
        j73 j73Var;
        m();
        if (this.E && (j73Var = this.n) == null) {
            q4 q4Var = this.j;
            if (q4Var != null) {
                j73Var = new j73(q4Var);
                this.n = j73Var;
            }
            if (j73Var != null) {
                j73Var.c(this.Z);
            }
        }
        return this.n;
    }

    public final void s(int i) {
        this.X |= 1 << i;
        if (this.W) {
            return;
        }
        View decorView = this.l.getDecorView();
        WeakHashMap weakHashMap = t43.a;
        decorView.postOnAnimation(this.Y);
        this.W = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        if (r14.getCount() > 0) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.se r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.t(se, android.view.KeyEvent):void");
    }

    public final boolean u(se seVar, int i, KeyEvent keyEvent) {
        if1 if1Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((seVar.k || v(seVar, keyEvent)) && (if1Var = seVar.h) != null) {
            return if1Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x010f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    /* JADX WARN: Code duplicated, block: B:86:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0133  */
    /* JADX WARN: Code duplicated, block: B:88:0x0138  */
    /* JADX WARN: Code duplicated, block: B:91:0x0143  */
    /* JADX WARN: Code duplicated, block: B:92:0x0145  */
    public final boolean v(se seVar, KeyEvent keyEvent) {
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Bundle bundle;
        int deviceId;
        boolean z;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.P) {
            boolean z2 = seVar.k;
            int i = seVar.a;
            if (z2) {
                return true;
            }
            se seVar2 = this.L;
            if (seVar2 != null && seVar2 != seVar) {
                j(seVar2, false);
            }
            Window.Callback callback = this.l.getCallback();
            if (callback != null) {
                seVar.g = callback.onCreatePanelView(i);
            }
            boolean z3 = i == 0 || i == 108;
            if (z3 && (actionBarOverlayLayout4 = this.p) != null) {
                actionBarOverlayLayout4.k();
                ((jy2) actionBarOverlayLayout4.l).l = true;
            }
            if (seVar.g == null) {
                if1 if1Var = seVar.h;
                if (if1Var != null) {
                    if (seVar.o) {
                    }
                    seVar.h.w();
                    bundle = seVar.p;
                    if (bundle != null) {
                        seVar.h.s(bundle);
                        seVar.p = null;
                    }
                    if (!callback.onPreparePanel(0, seVar.g, seVar.h)) {
                        if (z3 && (actionBarOverlayLayout3 = this.p) != null) {
                            actionBarOverlayLayout3.l(null, this.q);
                        }
                        seVar.h.v();
                        return false;
                    }
                    if (keyEvent != null) {
                        deviceId = keyEvent.getDeviceId();
                    } else {
                        deviceId = -1;
                    }
                    if (KeyCharacterMap.load(deviceId).getKeyboardType() != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    seVar.h.setQwertyMode(z);
                    seVar.h.v();
                } else {
                    Context context = this.k;
                    if ((i == 0 || i == 108) && this.p != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(net.zetetic.database.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(net.zetetic.database.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(net.zetetic.database.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            l10 l10Var = new l10(context, 0);
                            l10Var.getTheme().setTo(themeNewTheme);
                            context = l10Var;
                        }
                    }
                    if1 if1Var2 = new if1(context);
                    if1Var2.e = this;
                    if1 if1Var3 = seVar.h;
                    if (if1Var2 != if1Var3) {
                        if (if1Var3 != null) {
                            if1Var3.r(seVar.i);
                        }
                        seVar.h = if1Var2;
                        ab1 ab1Var = seVar.i;
                        if (ab1Var != null) {
                            if1Var2.b(ab1Var, if1Var2.a);
                        }
                    }
                    if1Var = seVar.h;
                    if (if1Var != null) {
                    }
                }
                if (z3 && (actionBarOverlayLayout2 = this.p) != null) {
                    me meVar = this.q;
                    if (meVar == null) {
                        meVar = new me(this, (byte) 2);
                        this.q = meVar;
                    }
                    actionBarOverlayLayout2.l(if1Var, meVar);
                }
                seVar.h.w();
                if (callback.onCreatePanelMenu(i, seVar.h)) {
                    seVar.o = false;
                    seVar.h.w();
                    bundle = seVar.p;
                    if (bundle != null) {
                        seVar.h.s(bundle);
                        seVar.p = null;
                    }
                    if (!callback.onPreparePanel(0, seVar.g, seVar.h)) {
                        if (z3) {
                            actionBarOverlayLayout3.l(null, this.q);
                        }
                        seVar.h.v();
                        return false;
                    }
                    if (keyEvent != null) {
                        deviceId = keyEvent.getDeviceId();
                    } else {
                        deviceId = -1;
                    }
                    if (KeyCharacterMap.load(deviceId).getKeyboardType() != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    seVar.h.setQwertyMode(z);
                    seVar.h.v();
                } else {
                    if1 if1Var4 = seVar.h;
                    if (if1Var4 != null) {
                        if (if1Var4 != null) {
                            if1Var4.r(seVar.i);
                        }
                        seVar.h = null;
                    }
                    if (z3 && (actionBarOverlayLayout = this.p) != null) {
                        actionBarOverlayLayout.l(null, this.q);
                    }
                }
            }
            seVar.k = true;
            seVar.l = false;
            this.L = seVar;
            return true;
        }
        return false;
    }

    public final void w() {
        if (this.y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
