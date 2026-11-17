package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m30 extends ContentObserver {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(rp2 rp2Var) {
        super(new Handler());
        this.b = rp2Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                rp2 rp2Var = (rp2) this.b;
                if (rp2Var.i && (cursor = rp2Var.j) != null && !cursor.isClosed()) {
                    rp2Var.h = rp2Var.j.requery();
                    break;
                }
                break;
            default:
                super.onChange(z);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(fp fpVar, Handler handler) {
        super(handler);
        this.b = fpVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 1:
                ((fp) this.b).s(j23.a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}
