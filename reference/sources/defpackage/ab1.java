package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ab1 implements wf1, AdapterView.OnItemClickListener {
    public Context h;
    public LayoutInflater i;
    public if1 j;
    public ExpandedMenuView k;
    public vf1 l;
    public za1 m;

    public ab1(ContextWrapper contextWrapper) {
        this.h = contextWrapper;
        this.i = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.wf1
    public final boolean b(lf1 lf1Var) {
        return false;
    }

    @Override // defpackage.wf1
    public final void c(if1 if1Var, boolean z) {
        vf1 vf1Var = this.l;
        if (vf1Var != null) {
            vf1Var.c(if1Var, z);
        }
    }

    @Override // defpackage.wf1
    public final void e(vf1 vf1Var) {
        throw null;
    }

    @Override // defpackage.wf1
    public final boolean f(lf1 lf1Var) {
        return false;
    }

    @Override // defpackage.wf1
    public final void g() {
        za1 za1Var = this.m;
        if (za1Var != null) {
            za1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.wf1
    public final void i(Context context, if1 if1Var) {
        if (this.h != null) {
            this.h = context;
            if (this.i == null) {
                this.i = LayoutInflater.from(context);
            }
        }
        this.j = if1Var;
        za1 za1Var = this.m;
        if (za1Var != null) {
            za1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.wf1
    public final boolean j(wo2 wo2Var) {
        boolean zHasVisibleItems = wo2Var.hasVisibleItems();
        Context context = wo2Var.a;
        if (!zHasVisibleItems) {
            return false;
        }
        jf1 jf1Var = new jf1();
        jf1Var.h = wo2Var;
        p4 p4Var = new p4(context);
        l4 l4Var = (l4) p4Var.c;
        ab1 ab1Var = new ab1(l4Var.a);
        jf1Var.j = ab1Var;
        ab1Var.l = jf1Var;
        wo2Var.b(ab1Var, context);
        ab1 ab1Var2 = jf1Var.j;
        za1 za1Var = ab1Var2.m;
        if (za1Var == null) {
            za1Var = new za1(ab1Var2);
            ab1Var2.m = za1Var;
        }
        l4Var.i = za1Var;
        l4Var.j = jf1Var;
        View view = wo2Var.o;
        if (view != null) {
            l4Var.e = view;
        } else {
            l4Var.c = wo2Var.n;
            l4Var.d = wo2Var.m;
        }
        l4Var.h = jf1Var;
        q4 q4VarC = p4Var.c();
        jf1Var.i = q4VarC;
        q4VarC.setOnDismissListener(jf1Var);
        WindowManager.LayoutParams attributes = jf1Var.i.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        jf1Var.i.show();
        vf1 vf1Var = this.l;
        if (vf1Var == null) {
            return true;
        }
        vf1Var.v(wo2Var);
        return true;
    }

    @Override // defpackage.wf1
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.j.q(this.m.getItem(i), this, 0);
    }
}
