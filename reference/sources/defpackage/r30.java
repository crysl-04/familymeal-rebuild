package defpackage;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r30 extends Filter {
    public o30 a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorF;
        rp2 rp2Var = (rp2) this.a;
        SearchView searchView = rp2Var.s;
        String string = charSequence == null ? "" : charSequence.toString();
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorF = rp2Var.f(rp2Var.t, string);
                if (cursorF != null) {
                    cursorF.getCount();
                } else {
                    cursorF = null;
                }
            } catch (RuntimeException unused) {
            }
        } else {
            cursorF = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorF != null) {
            filterResults.count = cursorF.getCount();
            filterResults.values = cursorF;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        o30 o30Var = this.a;
        Cursor cursor = o30Var.j;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        o30Var.b((Cursor) obj);
    }
}
