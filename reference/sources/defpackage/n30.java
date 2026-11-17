package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n30 extends DataSetObserver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n30(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rp2 rp2Var = (rp2) obj;
                rp2Var.h = true;
                rp2Var.notifyDataSetChanged();
                break;
            default:
                fb1 fb1Var = (fb1) obj;
                if (fb1Var.F.isShowing()) {
                    fb1Var.d();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rp2 rp2Var = (rp2) obj;
                rp2Var.h = false;
                rp2Var.notifyDataSetInvalidated();
                break;
            default:
                ((fb1) obj).dismiss();
                break;
        }
    }
}
