package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
@rm1("activity")
public class k3 extends sm1 {
    public final Activity c;

    public k3(Context context) {
        context.getClass();
        for (Object obj : ph2.H(context, new s0((byte) 1))) {
            if (((Context) obj) instanceof Activity) {
                this.c = (Activity) obj;
            }
        }
        obj = null;
        this.c = (Activity) obj;
    }

    @Override // defpackage.sm1
    public final dl1 c(dl1 dl1Var) {
        throw new IllegalStateException(jp1.i(((j3) dl1Var).i.b, "Destination ", " does not have an Intent set.").toString());
    }

    @Override // defpackage.sm1
    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
