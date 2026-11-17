package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oe implements Window.Callback {
    public final Window.Callback h;
    public final /* synthetic */ te i;

    public oe(te teVar, Window.Callback callback) {
        this.i = teVar;
        if (callback != null) {
            this.h = callback;
        } else {
            wg.m("Window callback may not be null");
            throw null;
        }
    }

    public final boolean a(int i, Menu menu) {
        return this.h.onMenuOpened(i, menu);
    }

    public final void b(int i, Menu menu) {
        this.h.onPanelClosed(i, menu);
    }

    public final void c(List list, Menu menu, int i) {
        this.h.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.h.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.i.k(keyEvent) || this.h.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        se seVar;
        boolean zU;
        boolean zPerformShortcut;
        if1 if1Var;
        if (!this.h.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            te teVar = this.i;
            j73 j73VarR = teVar.r();
            if (j73VarR == null) {
                seVar = teVar.L;
                if (seVar != null || !teVar.u(seVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (teVar.L == null) {
                        se seVarQ = teVar.q(0);
                        teVar.v(seVarQ, keyEvent);
                        zU = teVar.u(seVarQ, keyEvent.getKeyCode(), keyEvent);
                        seVarQ.k = false;
                        if (!zU) {
                        }
                    }
                    return false;
                }
                se seVar2 = teVar.L;
                if (seVar2 != null) {
                    seVar2.l = true;
                    return true;
                }
            } else {
                i73 i73Var = j73VarR.i;
                if (i73Var == null || (if1Var = i73Var.k) == null) {
                    zPerformShortcut = false;
                } else {
                    if1Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = if1Var.performShortcut(keyCode, keyEvent, 0);
                }
                if (!zPerformShortcut) {
                    seVar = teVar.L;
                    if (seVar != null) {
                        if (teVar.L == null) {
                            se seVarQ2 = teVar.q(0);
                            teVar.v(seVarQ2, keyEvent);
                            zU = teVar.u(seVarQ2, keyEvent.getKeyCode(), keyEvent);
                            seVarQ2.k = false;
                            if (!zU) {
                            }
                        }
                        return false;
                    }
                    if (teVar.L == null) {
                        se seVarQ3 = teVar.q(0);
                        teVar.v(seVarQ3, keyEvent);
                        zU = teVar.u(seVarQ3, keyEvent.getKeyCode(), keyEvent);
                        seVarQ3.k = false;
                        if (!zU) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.h.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.h.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.h.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.h.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.h.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.h.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof if1)) {
            return this.h.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.h.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.h.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.h.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        j73 j73VarR;
        a(i, menu);
        if (i == 108 && (j73VarR = this.i.r()) != null) {
            ArrayList arrayList = j73VarR.m;
            if (true != j73VarR.l) {
                j73VarR.l = true;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    li1.c();
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        b(i, menu);
        te teVar = this.i;
        if (i != 108) {
            if (i == 0) {
                se seVarQ = teVar.q(i);
                if (seVarQ.m) {
                    teVar.j(seVarQ, false);
                    return;
                }
                return;
            }
            return;
        }
        j73 j73VarR = teVar.r();
        if (j73VarR != null) {
            ArrayList arrayList = j73VarR.m;
            if (j73VarR.l) {
                j73VarR.l = false;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    li1.c();
                }
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        this.h.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if1 if1Var = menu instanceof if1 ? (if1) menu : null;
        if (i == 0 && if1Var == null) {
            return false;
        }
        if (if1Var != null) {
            if1Var.x = true;
        }
        boolean zOnPreparePanel = this.h.onPreparePanel(i, view, menu);
        if (if1Var != null) {
            if1Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        if1 if1Var = this.i.q(0).h;
        if (if1Var != null) {
            c(list, if1Var, i);
        } else {
            c(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.h.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.h.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.h.onWindowFocusChanged(z);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0186  */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        boolean z;
        ViewGroup viewGroup;
        te teVar = this.i;
        Context context = teVar.k;
        if (!teVar.x || i != 0) {
            return this.h.onWindowStartingActionMode(callback, i);
        }
        wk wkVar = new wk(context, callback);
        f3 f3Var = teVar.s;
        if (f3Var != null) {
            f3Var.c();
        }
        ix0 ix0Var = new ix0((Object) teVar, (Object) wkVar, (byte) 3);
        j73 j73VarR = teVar.r();
        byte b = 1;
        if (j73VarR != null) {
            i73 i73Var = j73VarR.i;
            if (i73Var != null) {
                i73Var.c();
            }
            j73VarR.c.setHideOnContentScrollEnabled(false);
            ActionBarContextView actionBarContextView = j73VarR.f;
            actionBarContextView.removeAllViews();
            actionBarContextView.s = null;
            actionBarContextView.j = null;
            i73 i73Var2 = new i73(j73VarR, j73VarR.f.getContext(), ix0Var);
            if1 if1Var = i73Var2.k;
            if1Var.w();
            try {
                boolean zD = ((wk) i73Var2.l.i).D(i73Var2, if1Var);
                if1Var.v();
                if (zD) {
                    j73VarR.i = i73Var2;
                    i73Var2.k();
                    j73VarR.f.c(i73Var2);
                    j73VarR.a(true);
                    j73VarR.f.sendAccessibilityEvent(32);
                } else {
                    i73Var2 = null;
                }
                teVar.s = i73Var2;
            } catch (Throwable th) {
                if1Var.v();
                throw th;
            }
        }
        f3 f3Var2 = teVar.s;
        if (f3Var2 == null) {
            l53 l53Var = teVar.w;
            if (l53Var != null) {
                l53Var.b();
            }
            f3 f3Var3 = teVar.s;
            if (f3Var3 != null) {
                f3Var3.c();
            }
            if (teVar.t == null) {
                if (teVar.H) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        l10 l10Var = new l10(context, 0);
                        l10Var.getTheme().setTo(themeNewTheme);
                        context = l10Var;
                    }
                    teVar.t = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    teVar.u = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    teVar.u.setContentView(teVar.t);
                    teVar.u.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    teVar.t.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    teVar.u.setHeight(-2);
                    teVar.v = new le(teVar, b);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) teVar.z.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(teVar.o()));
                        teVar.t = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (teVar.t != null) {
                l53 l53Var2 = teVar.w;
                if (l53Var2 != null) {
                    l53Var2.b();
                }
                ActionBarContextView actionBarContextView2 = teVar.t;
                actionBarContextView2.removeAllViews();
                actionBarContextView2.s = null;
                actionBarContextView2.j = null;
                Context context2 = teVar.t.getContext();
                ActionBarContextView actionBarContextView3 = teVar.t;
                cn2 cn2Var = new cn2();
                cn2Var.j = context2;
                cn2Var.k = actionBarContextView3;
                cn2Var.l = ix0Var;
                if1 if1Var2 = new if1(actionBarContextView3.getContext());
                if1Var2.l = true;
                cn2Var.o = if1Var2;
                if1Var2.e = cn2Var;
                if (wkVar.D(cn2Var, if1Var2)) {
                    cn2Var.k();
                    teVar.t.c(cn2Var);
                    teVar.s = cn2Var;
                    if (!teVar.y || (viewGroup = teVar.z) == null) {
                        z = false;
                    } else {
                        WeakHashMap weakHashMap = t43.a;
                        if (viewGroup.isLaidOut()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    ActionBarContextView actionBarContextView4 = teVar.t;
                    if (z) {
                        actionBarContextView4.setAlpha(0.0f);
                        l53 l53VarA = t43.a(teVar.t);
                        l53VarA.a(1.0f);
                        teVar.w = l53VarA;
                        l53VarA.d(new ne(teVar, b));
                    } else {
                        actionBarContextView4.setAlpha(1.0f);
                        teVar.t.setVisibility(0);
                        teVar.t.sendAccessibilityEvent(32);
                        if (teVar.t.getParent() instanceof View) {
                            View view = (View) teVar.t.getParent();
                            WeakHashMap weakHashMap2 = t43.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (teVar.u != null) {
                        teVar.l.getDecorView().post(teVar.v);
                    }
                } else {
                    teVar.s = null;
                }
            }
            f3Var2 = teVar.s;
            teVar.s = f3Var2;
        }
        if (f3Var2 != null) {
            return wkVar.r(f3Var2);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.h.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
