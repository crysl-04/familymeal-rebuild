package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ff1 extends BaseAdapter {
    public final if1 h;
    public int i = -1;
    public boolean j;
    public final boolean k;
    public final LayoutInflater l;
    public final int m;

    public ff1(if1 if1Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.k = z;
        this.l = layoutInflater;
        this.h = if1Var;
        this.m = i;
        a();
    }

    public final void a() {
        if1 if1Var = this.h;
        lf1 lf1Var = if1Var.v;
        if (lf1Var != null) {
            if1Var.i();
            ArrayList arrayList = if1Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((lf1) arrayList.get(i)) == lf1Var) {
                    this.i = i;
                    return;
                }
            }
        }
        this.i = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lf1 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.k;
        if1 if1Var = this.h;
        if (z) {
            if1Var.i();
            arrayListL = if1Var.j;
        } else {
            arrayListL = if1Var.l();
        }
        int i2 = this.i;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (lf1) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.k;
        if1 if1Var = this.h;
        if (z) {
            if1Var.i();
            arrayListL = if1Var.j;
        } else {
            arrayListL = if1Var.l();
        }
        return this.i < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.l.inflate(this.m, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.h.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        xf1 xf1Var = (xf1) view;
        if (this.j) {
            listMenuItemView.setForceShowIcon(true);
        }
        xf1Var.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
