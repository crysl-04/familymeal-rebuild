package defpackage;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class te2 implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ SearchView i;

    public /* synthetic */ te2(SearchView searchView, byte b) {
        this.h = b;
        this.i = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.h;
        SearchView searchView = this.i;
        switch (b) {
            case 0:
                searchView.q();
                break;
            default:
                o30 o30Var = searchView.V;
                if (o30Var instanceof rp2) {
                    o30Var.b(null);
                }
                break;
        }
    }
}
