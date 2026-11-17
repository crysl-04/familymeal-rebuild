package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lf implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ lf(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                nf nfVar = (nf) obj;
                qf qfVar = nfVar.K;
                qfVar.setSelection(i);
                if (qfVar.getOnItemClickListener() != null) {
                    qfVar.performItemClick(view, i, nfVar.H.getItemId(i));
                }
                nfVar.dismiss();
                break;
            default:
                ((SearchView) obj).l(i);
                break;
        }
    }
}
