package defpackage;

import android.os.Bundle;
import com.familymeal.app.MainActivity;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class go0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jo0 b;

    public /* synthetic */ go0(jo0 jo0Var, byte b) {
        this.a = b;
        this.b = jo0Var;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                jo0 jo0Var = this.b;
                ((cc2) jo0Var.Z.i).a();
                h7.d0(jo0Var);
                Bundle bundle = jo0Var.i;
                jo0Var.Z.f(bundle != null ? bundle.getBundle("registryState") : null);
                break;
            default:
                jo0 jo0Var2 = this.b;
                c10 c10Var = jo0Var2.V;
                MainActivity mainActivity = jo0Var2.B.m;
                c10Var.b = mainActivity;
                Iterator it = c10Var.a.iterator();
                while (it.hasNext()) {
                    ((ax) it.next()).a(mainActivity);
                }
                break;
        }
    }
}
