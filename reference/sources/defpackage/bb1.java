package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bb1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ bb1(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        be0 be0Var;
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                if (i != -1 && (be0Var = ((fb1) obj).j) != null) {
                    be0Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).m(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        byte b = this.h;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
