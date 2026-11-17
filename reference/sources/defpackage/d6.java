package defpackage;

import android.os.Handler;
import android.os.Looper;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d6 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ t6 i;

    public /* synthetic */ d6(t6 t6Var, byte b) {
        this.h = b;
        this.i = t6Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        t6 t6Var = this.i;
        switch (b) {
            case 0:
                return new r9(t6Var, t6Var.getTextInputService(), (x20) obj);
            case 1:
                kp0 kp0Var = (kp0) obj;
                Handler handler = t6Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    kp0Var.a();
                } else {
                    Handler handler2 = t6Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new i6(kp0Var, (byte) 0));
                    }
                }
                return j23Var;
            case 2:
                ((em0) t6Var.getFocusOwner()).g(((ul0) obj).a, false);
                return j23Var;
            case 3:
                return t6Var.getSavedStateRegistry();
            case 4:
                return Boolean.valueOf(t6Var.getScrollCaptureInProgress());
            case 5:
                return t6Var.getInputModeManager();
            case 6:
                return t6Var.getTextInputService();
            case 7:
                return t6Var.getSoftwareKeyboardController();
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return t6Var.getTextToolbar();
            default:
                return t6Var.getPointerIconService();
        }
    }
}
