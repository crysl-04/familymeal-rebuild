package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class o30 extends BaseAdapter implements Filterable {
    public boolean h;
    public boolean i;
    public Cursor j;
    public Context k;
    public int l;
    public m30 m;
    public n30 n;
    public r30 o;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.j;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                m30 m30Var = this.m;
                if (m30Var != null) {
                    cursor2.unregisterContentObserver(m30Var);
                }
                n30 n30Var = this.n;
                if (n30Var != null) {
                    cursor2.unregisterDataSetObserver(n30Var);
                }
            }
            this.j = cursor;
            if (cursor != null) {
                m30 m30Var2 = this.m;
                if (m30Var2 != null) {
                    cursor.registerContentObserver(m30Var2);
                }
                n30 n30Var2 = this.n;
                if (n30Var2 != null) {
                    cursor.registerDataSetObserver(n30Var2);
                }
                this.l = cursor.getColumnIndexOrThrow("_id");
                this.h = true;
                notifyDataSetChanged();
            } else {
                this.l = -1;
                this.h = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.h || (cursor = this.j) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.h) {
            return null;
        }
        this.j.moveToPosition(i);
        if (view == null) {
            rp2 rp2Var = (rp2) this;
            view = rp2Var.r.inflate(rp2Var.q, viewGroup, false);
        }
        a(view, this.j);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        r30 r30Var = this.o;
        if (r30Var != null) {
            return r30Var;
        }
        r30 r30Var2 = new r30();
        r30Var2.a = this;
        this.o = r30Var2;
        return r30Var2;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.h || (cursor = this.j) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.j;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.h && (cursor = this.j) != null && cursor.moveToPosition(i)) {
            return this.j.getLong(this.l);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.h) {
            li1.g("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.j.moveToPosition(i)) {
            li1.g(jp1.h(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            rp2 rp2Var = (rp2) this;
            view = rp2Var.r.inflate(rp2Var.p, viewGroup, false);
            view.setTag(new qp2(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(rp2Var.w);
        }
        a(view, this.j);
        return view;
    }
}
