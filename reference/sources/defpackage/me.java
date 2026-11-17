package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class me implements cq1, t00, vf1 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ te i;

    public /* synthetic */ me(te teVar, byte b) {
        this.h = b;
        this.i = teVar;
    }

    @Override // defpackage.cq1
    public final q83 a(View view, q83 q83Var) {
        boolean z;
        c83 x73Var;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        q83 q83VarB = q83Var;
        m83 m83Var = q83VarB.a;
        int i3 = m83Var.m().b;
        te teVar = this.i;
        Context context = teVar.k;
        int i4 = m83Var.m().b;
        ActionBarContextView actionBarContextView = teVar.t;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) teVar.t.getLayoutParams();
            if (teVar.t.isShown()) {
                if (teVar.a0 == null) {
                    teVar.a0 = new Rect();
                    teVar.b0 = new Rect();
                }
                Rect rect = teVar.a0;
                Rect rect2 = teVar.b0;
                rect.set(m83Var.m().a, m83Var.m().b, m83Var.m().c, m83Var.m().d);
                ViewGroup viewGroup = teVar.z;
                Method method = r53.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i5 = rect.top;
                int i6 = rect.left;
                int i7 = rect.right;
                ViewGroup viewGroup2 = teVar.z;
                WeakHashMap weakHashMap = t43.a;
                q83 q83VarA = p43.a(viewGroup2);
                if (q83VarA == null) {
                    i2 = 0;
                    i = 0;
                } else {
                    m83 m83Var2 = q83VarA.a;
                    i = m83Var2.m().a;
                    i2 = m83Var2.m().c;
                }
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z3 = true;
                }
                if (i5 <= 0 || teVar.B != null) {
                    View view2 = teVar.B;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (i8 != i9 || marginLayoutParams2.leftMargin != i || marginLayoutParams2.rightMargin != i2) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = i;
                            marginLayoutParams2.rightMargin = i2;
                            teVar.B.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    teVar.B = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i;
                    layoutParams.rightMargin = i2;
                    teVar.z.addView(teVar.B, -1, layoutParams);
                }
                View view4 = teVar.B;
                boolean z4 = view4 != null;
                if (z4 && view4.getVisibility() != 0) {
                    View view5 = teVar.B;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!teVar.G && z4) {
                    i4 = 0;
                }
                z = z4;
                z2 = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            if (z2) {
                teVar.t.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = teVar.B;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (i3 != i4) {
            int i10 = m83Var.m().a;
            int i11 = m83Var.m().c;
            int i12 = m83Var.m().d;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 36) {
                x73Var = new b83(q83VarB);
            } else if (i13 >= 35) {
                x73Var = new a83(q83VarB);
            } else if (i13 >= 34) {
                x73Var = new z73(q83VarB);
            } else if (i13 >= 31) {
                x73Var = new y73(q83VarB);
            } else {
                x73Var = i13 >= 30 ? new x73(q83VarB) : new w73(q83VarB);
            }
            x73Var.g(ox0.b(i10, i4, i11, i12));
            q83VarB = x73Var.b();
        }
        WeakHashMap weakHashMap2 = t43.a;
        WindowInsets windowInsetsB = q83VarB.b();
        if (windowInsetsB == null) {
            return q83VarB;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsB);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsB) ? q83.c(windowInsetsOnApplyWindowInsets, view) : q83VarB;
    }

    @Override // defpackage.vf1
    public final void c(if1 if1Var, boolean z) {
        se seVar;
        byte b = this.h;
        te teVar = this.i;
        switch (b) {
            case 2:
                teVar.i(if1Var);
                break;
            default:
                if1 if1VarK = if1Var.k();
                int i = 0;
                boolean z2 = if1VarK != if1Var;
                if (z2) {
                    if1Var = if1VarK;
                }
                se[] seVarArr = teVar.K;
                int length = seVarArr != null ? seVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        seVar = null;
                    } else {
                        seVar = seVarArr[i];
                        if (seVar == null || seVar.h != if1Var) {
                            i++;
                        }
                    }
                }
                if (seVar != null) {
                    if (!z2) {
                        teVar.j(seVar, z);
                    } else {
                        teVar.h(seVar.a, seVar, if1VarK);
                        teVar.j(seVar, true);
                    }
                }
                break;
        }
    }

    @Override // defpackage.vf1
    public final boolean v(if1 if1Var) {
        Window.Callback callback;
        byte b = this.h;
        te teVar = this.i;
        switch (b) {
            case 2:
                Window.Callback callback2 = teVar.l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, if1Var);
                }
                break;
            default:
                if (if1Var == if1Var.k() && teVar.E && (callback = teVar.l.getCallback()) != null && !teVar.P) {
                    callback.onMenuOpened(108, if1Var);
                }
                break;
        }
        return true;
    }
}
