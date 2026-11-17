package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fr extends qf1 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int A;
    public boolean C;
    public vf1 D;
    public ViewTreeObserver E;
    public rf1 F;
    public boolean G;
    public final Context i;
    public final int j;
    public final int k;
    public final boolean l;
    public final Handler m;
    public View u;
    public View v;
    public int w;
    public boolean x;
    public boolean y;
    public int z;
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final hf p = new hf(this, 2);
    public final r8 q = new r8(this, 1);
    public final g2 r = new g2((Object) this, (byte) 6);
    public int s = 0;
    public int t = 0;
    public boolean B = false;

    public fr(Context context, View view, int i, boolean z) {
        this.i = context;
        this.u = view;
        this.k = i;
        this.l = z;
        WeakHashMap weakHashMap = t43.a;
        this.w = view.getLayoutDirection() == 1 ? (byte) 0 : (byte) 1;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.m = new Handler();
    }

    @Override // defpackage.aj2
    public final boolean a() {
        ArrayList arrayList = this.o;
        return arrayList.size() > 0 && ((er) arrayList.get(0)).a.F.isShowing();
    }

    @Override // defpackage.wf1
    public final void c(if1 if1Var, boolean z) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (if1Var == ((er) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < arrayList.size()) {
                ((er) arrayList.get(i2)).b.c(false);
            }
            er erVar = (er) arrayList.remove(i);
            if1 if1Var2 = erVar.b;
            uf1 uf1Var = erVar.a;
            af afVar = uf1Var.F;
            if1Var2.r(this);
            if (this.G) {
                afVar.setExitTransition(null);
                afVar.setAnimationStyle(0);
            }
            uf1Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.w = ((er) arrayList.get(size2 - 1)).c;
            } else {
                View view = this.u;
                WeakHashMap weakHashMap = t43.a;
                this.w = view.getLayoutDirection() == 1 ? 0 : 1;
            }
            if (size2 != 0) {
                if (z) {
                    ((er) arrayList.get(0)).b.c(false);
                    return;
                }
                return;
            }
            dismiss();
            vf1 vf1Var = this.D;
            if (vf1Var != null) {
                vf1Var.c(if1Var, true);
            }
            ViewTreeObserver viewTreeObserver = this.E;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.E.removeGlobalOnLayoutListener(this.p);
                }
                this.E = null;
            }
            this.v.removeOnAttachStateChangeListener(this.q);
            this.F.onDismiss();
        }
    }

    @Override // defpackage.aj2
    public final void d() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((if1) obj);
        }
        arrayList.clear();
        View view = this.u;
        this.v = view;
        if (view != null) {
            boolean z = this.E == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.p);
            }
            this.v.addOnAttachStateChangeListener(this.q);
        }
    }

    @Override // defpackage.aj2
    public final void dismiss() {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        if (size > 0) {
            er[] erVarArr = (er[]) arrayList.toArray(new er[size]);
            for (int i = size - 1; i >= 0; i--) {
                er erVar = erVarArr[i];
                if (erVar.a.F.isShowing()) {
                    erVar.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.wf1
    public final void e(vf1 vf1Var) {
        this.D = vf1Var;
    }

    @Override // defpackage.wf1
    public final void g() {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((er) obj).a.j.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((ff1) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.aj2
    public final be0 h() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((er) arrayList.get(arrayList.size() - 1)).a.j;
    }

    @Override // defpackage.wf1
    public final boolean j(wo2 wo2Var) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            er erVar = (er) obj;
            if (wo2Var == erVar.b) {
                erVar.a.j.requestFocus();
                return true;
            }
        }
        if (!wo2Var.hasVisibleItems()) {
            return false;
        }
        l(wo2Var);
        vf1 vf1Var = this.D;
        if (vf1Var != null) {
            vf1Var.v(wo2Var);
        }
        return true;
    }

    @Override // defpackage.wf1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.qf1
    public final void l(if1 if1Var) {
        if1Var.b(this, this.i);
        if (a()) {
            u(if1Var);
        } else {
            this.n.add(if1Var);
        }
    }

    @Override // defpackage.qf1
    public final void n(View view) {
        if (this.u != view) {
            this.u = view;
            int i = this.s;
            WeakHashMap weakHashMap = t43.a;
            this.t = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // defpackage.qf1
    public final void o(boolean z) {
        this.B = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        er erVar;
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                erVar = null;
                break;
            }
            erVar = (er) arrayList.get(i);
            if (!erVar.a.F.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (erVar != null) {
            erVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.qf1
    public final void p(int i) {
        if (this.s != i) {
            this.s = i;
            View view = this.u;
            WeakHashMap weakHashMap = t43.a;
            this.t = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // defpackage.qf1
    public final void q(int i) {
        this.x = true;
        this.z = i;
    }

    @Override // defpackage.qf1
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.F = (rf1) onDismissListener;
    }

    @Override // defpackage.qf1
    public final void s(boolean z) {
        this.C = z;
    }

    @Override // defpackage.qf1
    public final void t(int i) {
        this.y = true;
        this.A = i;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    public final void u(if1 if1Var) {
        boolean z;
        int i;
        View childAt;
        er erVar;
        int i2;
        int i3;
        MenuItem item;
        ff1 ff1Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.i;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ff1 ff1Var2 = new ff1(if1Var, layoutInflaterFrom, this.l, R.layout.abc_cascading_menu_item_layout);
        int i4 = 1;
        if (!a() && this.B) {
            ff1Var2.j = true;
        } else if (a()) {
            int size = if1Var.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = if1Var.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            ff1Var2.j = z;
        }
        int iM = qf1.m(ff1Var2, context, this.j);
        uf1 uf1Var = new uf1(context, null, this.k);
        uf1Var.G = this.r;
        uf1Var.w = this;
        af afVar = uf1Var.F;
        afVar.setOnDismissListener(this);
        uf1Var.v = this.u;
        uf1Var.s = this.t;
        uf1Var.E = true;
        afVar.setFocusable(true);
        afVar.setInputMethodMode(2);
        uf1Var.p(ff1Var2);
        uf1Var.r(iM);
        uf1Var.s = this.t;
        ArrayList arrayList = this.o;
        if (arrayList.size() > 0) {
            erVar = (er) arrayList.get(arrayList.size() - 1);
            if1 if1Var2 = erVar.b;
            int size2 = if1Var2.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    i = i4;
                    item = null;
                    break;
                }
                item = if1Var2.getItem(i6);
                if (item.hasSubMenu()) {
                    i = i4;
                    if (if1Var == item.getSubMenu()) {
                        break;
                    }
                } else {
                    i = i4;
                }
                i6++;
                i4 = i;
            }
            if (item == null) {
                childAt = null;
            } else {
                be0 be0Var = erVar.a.j;
                ListAdapter adapter = be0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    ff1Var = (ff1) headerViewListAdapter.getWrappedAdapter();
                } else {
                    ff1Var = (ff1) adapter;
                    headersCount = 0;
                }
                int count = ff1Var.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == ff1Var.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 == -1 || (firstVisiblePosition = (i7 + headersCount) - be0Var.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= be0Var.getChildCount()) ? null : be0Var.getChildAt(firstVisiblePosition);
            }
        } else {
            i = 1;
            childAt = null;
            erVar = null;
        }
        if (childAt != null) {
            afVar.setTouchModal(false);
            afVar.setEnterTransition(null);
            be0 be0Var2 = ((er) arrayList.get(arrayList.size() - 1)).a.j;
            int[] iArr = new int[2];
            be0Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.v.getWindowVisibleDisplayFrame(rect);
            if (this.w == i) {
                if (be0Var2.getWidth() + iArr[0] + iM > rect.right) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            boolean z2 = i2 == 1;
            this.w = i2;
            uf1Var.v = childAt;
            if ((this.t & 5) != 5) {
                i3 = 0;
                iM = z2 ? childAt.getWidth() : 0 - iM;
            } else if (z2) {
                i3 = 0;
            } else {
                i3 = 0;
                iM = 0 - childAt.getWidth();
            }
            uf1Var.m = iM;
            uf1Var.r = true;
            uf1Var.q = true;
            uf1Var.i(i3);
        } else {
            if (this.x) {
                uf1Var.m = this.z;
            }
            if (this.y) {
                uf1Var.i(this.A);
            }
            Rect rect2 = this.h;
            uf1Var.D = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new er(uf1Var, if1Var, this.w));
        uf1Var.d();
        be0 be0Var3 = uf1Var.j;
        be0Var3.setOnKeyListener(this);
        if (erVar == null && this.C && if1Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) be0Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(if1Var.m);
            be0Var3.addHeaderView(frameLayout, null, false);
            uf1Var.d();
        }
    }
}
