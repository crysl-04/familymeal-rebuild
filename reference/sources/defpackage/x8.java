package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x8 implements qk0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ x8(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // defpackage.qk0
    public final Object m(Object obj, m10 m10Var) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                ix0 ix0Var = (ix0) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    ix0Var.F().startStylusHandwriting((View) ix0Var.i);
                }
                return j23Var;
            case 1:
                ((x72) obj2).h = obj;
                throw new a(this);
            case 2:
                ((ah1) obj2).j.h(((Number) obj).floatValue());
                return j23Var;
            default:
                ((u32) obj2).setValue(obj);
                return j23Var;
        }
    }
}
