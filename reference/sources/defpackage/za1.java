package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class za1 extends BaseAdapter {
    public int h = -1;
    public final /* synthetic */ ab1 i;

    public za1(ab1 ab1Var) {
        this.i = ab1Var;
        a();
    }

    public final void a() {
        if1 if1Var = this.i.j;
        lf1 lf1Var = if1Var.v;
        if (lf1Var != null) {
            if1Var.i();
            ArrayList arrayList = if1Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((lf1) arrayList.get(i)) == lf1Var) {
                    this.h = i;
                    return;
                }
            }
        }
        this.h = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lf1 getItem(int i) {
        if1 if1Var = this.i.j;
        if1Var.i();
        ArrayList arrayList = if1Var.j;
        int i2 = this.h;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (lf1) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if1 if1Var = this.i.j;
        if1Var.i();
        int size = if1Var.j.size();
        return this.h < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.i.i.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((xf1) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
