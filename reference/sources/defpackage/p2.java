package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements View.OnClickListener {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ p2(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        byte b = this.h;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.i;
        switch (b) {
            case 0:
                ((f3) obj).c();
                break;
            case 1:
                o4 o4Var = (o4) obj;
                if (view == o4Var.i && (message = o4Var.k) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                o4Var.z.obtainMessage(1, o4Var.b).sendToTarget();
                break;
            default:
                cy2 cy2Var = ((Toolbar) obj).Q;
                lf1 lf1Var = cy2Var != null ? cy2Var.i : null;
                if (lf1Var != null) {
                    lf1Var.collapseActionView();
                }
                break;
        }
    }
}
