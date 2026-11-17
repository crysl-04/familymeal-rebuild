package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sa implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ za i;

    public /* synthetic */ sa(za zaVar, byte b) {
        this.h = b;
        this.i = zaVar;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        za zaVar = this.i;
        switch (b) {
            case 0:
                kp0 kp0Var = (kp0) obj;
                View view = zaVar.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    kp0Var.a();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new i6(kp0Var, (byte) 1));
                    }
                }
                return j23Var;
            case 1:
                ActionMode actionMode = zaVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return j23Var;
            case 2:
                ActionMode actionMode2 = zaVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return j23Var;
            default:
                zaVar.e.e();
                return new w3(zaVar, (byte) 3);
        }
    }
}
