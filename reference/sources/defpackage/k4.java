package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k4 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ o4 h;
    public final /* synthetic */ l4 i;

    public k4(l4 l4Var, o4 o4Var) {
        this.i = l4Var;
        this.h = o4Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        l4 l4Var = this.i;
        DialogInterface.OnClickListener onClickListener = l4Var.j;
        o4 o4Var = this.h;
        onClickListener.onClick(o4Var.b, i);
        if (l4Var.l) {
            return;
        }
        o4Var.b.dismiss();
    }
}
