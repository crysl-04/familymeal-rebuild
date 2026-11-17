package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q4 extends Dialog implements DialogInterface {
    public te h;
    public final ue i;
    public final o4 j;

    public q4(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iC = c(contextThemeWrapper, i);
        if (iC == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iC;
        }
        super(contextThemeWrapper, i2);
        this.i = new ue(this);
        ke keVarA = a();
        if (iC == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iC = typedValue2.resourceId;
        }
        ((te) keVarA).R = iC;
        keVarA.a();
        this.j = new o4(getContext(), this, getWindow());
    }

    public static int c(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final ke a() {
        te teVar = this.h;
        if (teVar != null) {
            return teVar;
        }
        bi biVar = ke.h;
        te teVar2 = new te(this, this);
        this.h = teVar2;
        return teVar2;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        te teVar = (te) a();
        teVar.m();
        ((ViewGroup) teVar.z.findViewById(android.R.id.content)).addView(view, layoutParams);
        teVar.m.h.onContentChanged();
    }

    public final void b(Bundle bundle) {
        te teVar = (te) a();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(teVar.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(teVar);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        a().a();
    }

    public final void d(CharSequence charSequence) {
        super.setTitle(charSequence);
        te teVar = (te) a();
        teVar.o = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = teVar.p;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        j73 j73Var = teVar.n;
        if (j73Var == null) {
            TextView textView = teVar.A;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        jy2 jy2Var = (jy2) j73Var.e;
        if (jy2Var.g) {
            return;
        }
        jy2Var.h = charSequence;
        if ((jy2Var.b & 8) != 0) {
            jy2Var.a.setTitle(charSequence);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        te teVar = (te) a();
        q4 q4Var = teVar.j;
        if (teVar.W) {
            teVar.l.getDecorView().removeCallbacks(teVar.Y);
        }
        teVar.P = true;
        if (teVar.Q != -100) {
            q4 q4Var2 = teVar.j;
        }
        te.d0.remove(teVar.j.getClass().getName());
        pe peVar = teVar.U;
        if (peVar != null) {
            peVar.c();
        }
        pe peVar2 = teVar.V;
        if (peVar2 != null) {
            peVar2.c();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        ue ueVar = this.i;
        if (ueVar == null) {
            return false;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        te teVar = (te) a();
        teVar.m();
        return teVar.l.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        te teVar = (te) a();
        teVar.r();
        teVar.s(0);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        char c;
        ListAdapter listAdapter;
        View viewFindViewById;
        b(bundle);
        o4 o4Var = this.j;
        o4Var.b.setContentView(o4Var.u);
        Context context = o4Var.a;
        Window window = o4Var.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = o4Var.f;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !o4.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (o4Var.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (o4Var.e != null) {
                ((z91) viewGroup.getLayoutParams()).a = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = o4.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = o4.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = o4.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        o4Var.m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        o4Var.m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        o4Var.q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            o4Var.m.removeView(o4Var.q);
            if (o4Var.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) o4Var.m.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(o4Var.m);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(o4Var.e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        o4Var.h = button;
        p2 p2Var = o4Var.A;
        button.setOnClickListener(p2Var);
        o4Var.h.setVisibility(8);
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        o4Var.i = button2;
        button2.setOnClickListener(p2Var);
        boolean zIsEmpty = TextUtils.isEmpty(o4Var.j);
        Button button3 = o4Var.i;
        if (zIsEmpty) {
            button3.setVisibility(8);
            c = 0;
        } else {
            button3.setText(o4Var.j);
            o4Var.i.setVisibility(0);
            c = 2;
        }
        Button button4 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        o4Var.l = button4;
        button4.setOnClickListener(p2Var);
        o4Var.l.setVisibility(8);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (c == 1) {
                Button button5 = o4Var.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button5.setLayoutParams(layoutParams);
            } else if (c == 2) {
                Button button6 = o4Var.i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button6.setLayoutParams(layoutParams2);
            }
        }
        if (c == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (o4Var.r != null) {
            viewGroupB.addView(o4Var.r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            o4Var.o = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(o4Var.d) || !o4Var.y) {
                window.findViewById(R.id.title_template).setVisibility(8);
                o4Var.o.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                o4Var.p = textView2;
                textView2.setText(o4Var.d);
                Drawable drawable = o4Var.n;
                if (drawable != null) {
                    o4Var.o.setImageDrawable(drawable);
                } else {
                    o4Var.p.setPadding(o4Var.o.getPaddingLeft(), o4Var.o.getPaddingTop(), o4Var.o.getPaddingRight(), o4Var.o.getPaddingBottom());
                    o4Var.o.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i != 0) {
            NestedScrollView nestedScrollView2 = o4Var.m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = o4Var.e != null ? viewGroupB.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = o4Var.e;
        if (alertController$RecycleListView != null && (!z3 || i == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.h, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.i);
        }
        if (!z2) {
            View view2 = o4Var.e;
            if (view2 == null) {
                view2 = o4Var.m;
            }
            if (view2 != null) {
                int i2 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = t43.a;
                view2.setScrollIndicators(i | i2, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = o4Var.e;
        if (alertController$RecycleListView2 == null || (listAdapter = o4Var.s) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i3 = o4Var.t;
        if (i3 > -1) {
            alertController$RecycleListView2.setItemChecked(i3, true);
            alertController$RecycleListView2.setSelection(i3);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.j.m;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.j.m;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onStop() {
        n53 n53Var;
        super.onStop();
        j73 j73VarR = ((te) a()).r();
        if (j73VarR == null || (n53Var = j73VarR.s) == null) {
            return;
        }
        n53Var.a();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        te teVar = (te) a();
        teVar.m();
        ViewGroup viewGroup = (ViewGroup) teVar.z.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(teVar.k).inflate(i, viewGroup);
        teVar.m.h.onContentChanged();
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        ke keVarA = a();
        String string = getContext().getString(i);
        te teVar = (te) keVarA;
        teVar.o = string;
        ActionBarOverlayLayout actionBarOverlayLayout = teVar.p;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(string);
            return;
        }
        j73 j73Var = teVar.n;
        if (j73Var == null) {
            TextView textView = teVar.A;
            if (textView != null) {
                textView.setText(string);
                return;
            }
            return;
        }
        jy2 jy2Var = (jy2) j73Var.e;
        if (jy2Var.g) {
            return;
        }
        jy2Var.h = string;
        if ((jy2Var.b & 8) != 0) {
            jy2Var.a.setTitle(string);
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        te teVar = (te) a();
        teVar.m();
        ViewGroup viewGroup = (ViewGroup) teVar.z.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        teVar.m.h.onContentChanged();
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        te teVar = (te) a();
        teVar.m();
        ViewGroup viewGroup = (ViewGroup) teVar.z.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        teVar.m.h.onContentChanged();
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        d(charSequence);
        o4 o4Var = this.j;
        o4Var.d = charSequence;
        TextView textView = o4Var.p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
