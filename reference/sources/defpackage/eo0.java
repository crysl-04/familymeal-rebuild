package defpackage;

import android.os.Bundle;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eo0 implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ jo0 i;

    public /* synthetic */ eo0(jo0 jo0Var, Bundle bundle) {
        this.h = (byte) 10;
        this.i = jo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.h;
        jo0 jo0Var = this.i;
        switch (b) {
            case 0:
                jo0Var.U.d(w81.ON_DESTROY);
                break;
            case 1:
                jo0Var.L = true;
                break;
            case 2:
                jo0Var.x();
                break;
            case 3:
                jo0Var.A();
                break;
            case 4:
                jo0Var.U.d(w81.ON_RESUME);
                break;
            case 5:
                jo0Var.w();
                break;
            case 6:
                jo0Var.U.d(w81.ON_CREATE);
                break;
            case 7:
                ip0 ip0Var = jo0Var.W;
                ip0Var.m.f(jo0Var.k);
                jo0Var.k = null;
                break;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                jo0Var.U.d(w81.ON_STOP);
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                jo0Var.D();
                break;
            case 10:
                jo0Var.s();
                break;
            case 11:
                jo0Var.C();
                break;
            case 12:
                jo0Var.U.d(w81.ON_START);
                break;
            case 13:
                jo0Var.u(jo0Var.B.m);
                break;
            case 14:
                jo0Var.U.d(w81.ON_PAUSE);
                break;
            default:
                jo0Var.z();
                break;
        }
    }

    public /* synthetic */ eo0(jo0 jo0Var, byte b) {
        this.h = b;
        this.i = jo0Var;
    }
}
