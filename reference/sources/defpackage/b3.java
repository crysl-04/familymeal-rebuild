package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b3 implements wf1 {
    public x2 A;
    public z2 B;
    public y2 C;
    public final Context h;
    public Context i;
    public if1 j;
    public final LayoutInflater k;
    public vf1 l;
    public yf1 o;
    public a3 p;
    public Drawable q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public x2 z;
    public final int m = R.layout.abc_action_menu_layout;
    public final int n = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray y = new SparseBooleanArray();
    public final g2 D = new g2((Object) this, (byte) 1);

    public b3(Context context) {
        this.h = context;
        this.k = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(lf1 lf1Var, View view, ViewGroup viewGroup) {
        View actionView = lf1Var.getActionView();
        if (actionView == null || lf1Var.e()) {
            xf1 xf1Var = view instanceof xf1 ? (xf1) view : (xf1) this.k.inflate(this.n, viewGroup, false);
            xf1Var.a(lf1Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) xf1Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.o);
            y2 y2Var = this.C;
            if (y2Var == null) {
                y2Var = new y2(this);
                this.C = y2Var;
            }
            actionMenuItemView.setPopupCallback(y2Var);
            actionView = (View) xf1Var;
        }
        actionView.setVisibility(lf1Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof d3)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.wf1
    public final boolean b(lf1 lf1Var) {
        return false;
    }

    @Override // defpackage.wf1
    public final void c(if1 if1Var, boolean z) {
        d();
        x2 x2Var = this.A;
        if (x2Var != null && x2Var.b()) {
            x2Var.i.dismiss();
        }
        vf1 vf1Var = this.l;
        if (vf1Var != null) {
            vf1Var.c(if1Var, z);
        }
    }

    public final boolean d() {
        Object obj;
        z2 z2Var = this.B;
        if (z2Var != null && (obj = this.o) != null) {
            ((View) obj).removeCallbacks(z2Var);
            this.B = null;
            return true;
        }
        x2 x2Var = this.z;
        if (x2Var == null) {
            return false;
        }
        if (x2Var.b()) {
            x2Var.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.wf1
    public final void e(vf1 vf1Var) {
        throw null;
    }

    @Override // defpackage.wf1
    public final boolean f(lf1 lf1Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wf1
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.o;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            if1 if1Var = this.j;
            if (if1Var != null) {
                if1Var.i();
                ArrayList arrayListL = this.j.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    lf1 lf1Var = (lf1) arrayListL.get(i2);
                    if ((lf1Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        lf1 itemData = childAt instanceof xf1 ? ((xf1) childAt).getItemData() : null;
                        View viewA = a(lf1Var, childAt, viewGroup);
                        if (lf1Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.o).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.p) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.o).requestLayout();
        if1 if1Var2 = this.j;
        if (if1Var2 != null) {
            if1Var2.i();
            ArrayList arrayList2 = if1Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                mf1 mf1Var = ((lf1) arrayList2.get(i3)).A;
            }
        }
        if1 if1Var3 = this.j;
        if (if1Var3 != null) {
            if1Var3.i();
            arrayList = if1Var3.j;
        }
        if (this.s && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((lf1) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        a3 a3Var = this.p;
        if (z) {
            if (a3Var == null) {
                a3Var = new a3(this, this.h);
                this.p = a3Var;
            }
            ViewGroup viewGroup3 = (ViewGroup) a3Var.getParent();
            if (viewGroup3 != this.o) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.p);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.o;
                a3 a3Var2 = this.p;
                actionMenuView.getClass();
                d3 d3VarI = ActionMenuView.i();
                d3VarI.c = true;
                actionMenuView.addView(a3Var2, d3VarI);
            }
        } else if (a3Var != null) {
            Object parent = a3Var.getParent();
            Object obj = this.o;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.p);
            }
        }
        ((ActionMenuView) this.o).setOverflowReserved(this.s);
    }

    public final boolean h() {
        x2 x2Var = this.z;
        return x2Var != null && x2Var.b();
    }

    @Override // defpackage.wf1
    public final void i(Context context, if1 if1Var) {
        this.i = context;
        LayoutInflater.from(context);
        this.j = if1Var;
        Resources resources = context.getResources();
        if (!this.t) {
            this.s = true;
        }
        int i = 2;
        this.u = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.w = i;
        int measuredWidth = this.u;
        if (this.s) {
            if (this.p == null) {
                a3 a3Var = new a3(this, this.h);
                this.p = a3Var;
                if (this.r) {
                    a3Var.setImageDrawable(this.q);
                    this.q = null;
                    this.r = false;
                }
                this.p.measure(0, 0);
            }
            measuredWidth -= this.p.getMeasuredWidth();
        } else {
            this.p = null;
        }
        this.v = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wf1
    public final boolean j(wo2 wo2Var) {
        boolean z;
        if (wo2Var.hasVisibleItems()) {
            wo2 wo2Var2 = wo2Var;
            while (true) {
                if1 if1Var = wo2Var2.z;
                if (if1Var == this.j) {
                    break;
                }
                wo2Var2 = (wo2) if1Var;
            }
            lf1 lf1Var = wo2Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.o;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof xf1) && ((xf1) childAt).getItemData() == lf1Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                int size = wo2Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = wo2Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                x2 x2Var = new x2(this, this.i, wo2Var, view);
                this.A = x2Var;
                x2Var.g = z;
                qf1 qf1Var = x2Var.i;
                if (qf1Var != null) {
                    qf1Var.o(z);
                }
                x2 x2Var2 = this.A;
                if (!x2Var2.b()) {
                    if (x2Var2.e == null) {
                        li1.g("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    x2Var2.d(0, 0, false, false);
                }
                vf1 vf1Var = this.l;
                if (vf1Var != null) {
                    vf1Var.v(wo2Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wf1
    public final boolean k() {
        ArrayList arrayListL;
        int size;
        int i;
        boolean z;
        boolean z2;
        if1 if1Var = this.j;
        View view = null;
        if (if1Var != null) {
            arrayListL = if1Var.l();
            size = arrayListL.size();
        } else {
            arrayListL = null;
            size = 0;
        }
        int i2 = this.w;
        int i3 = this.v;
        ViewGroup viewGroup = (ViewGroup) this.o;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            lf1 lf1Var = (lf1) arrayListL.get(i4);
            int i7 = lf1Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z3 = true;
            }
            if (this.x && lf1Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (this.s && (z3 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.y;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            lf1 lf1Var2 = (lf1) arrayListL.get(i9);
            int i11 = lf1Var2.y;
            boolean z4 = (i11 & 2) == i ? z : false;
            int i12 = lf1Var2.b;
            if (z4) {
                View viewA = a(lf1Var2, view, viewGroup);
                viewA.measure(0, 0);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                lf1Var2.f(z);
                z2 = z;
            } else if ((i11 & 1) == z) {
                boolean z5 = sparseBooleanArray.get(i12);
                boolean z6 = ((i8 > 0 || z5) && i3 > 0) ? z : false;
                if (z6) {
                    View viewA2 = a(lf1Var2, view, viewGroup);
                    viewA2.measure(0, 0);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z6 &= i3 + i10 > 0 ? z : false;
                }
                if (z6 && i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                } else if (z5) {
                    sparseBooleanArray.put(i12, false);
                    int i13 = 0;
                    while (i13 < i9) {
                        lf1 lf1Var3 = (lf1) arrayListL.get(i13);
                        if (lf1Var3.b == i12) {
                            if ((lf1Var3.x & 32) == 32) {
                                i8++;
                            }
                            lf1Var3.f(false);
                        }
                        i13++;
                        z = z;
                    }
                }
                z2 = z;
                if (z6) {
                    i8--;
                }
                lf1Var2.f(z6);
            } else {
                z2 = z;
                lf1Var2.f(false);
            }
            i9++;
            z = z2;
            view = null;
            i = 2;
        }
        return z;
    }

    public final boolean l() {
        if1 if1Var;
        byte b = 0;
        if (this.s && !h() && (if1Var = this.j) != null && this.o != null && this.B == null) {
            if1Var.i();
            if (!if1Var.j.isEmpty()) {
                z2 z2Var = new z2(this, new x2(this, this.i, this.j, this.p), b);
                this.B = z2Var;
                ((View) this.o).post(z2Var);
                return true;
            }
        }
        return false;
    }
}
