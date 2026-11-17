package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f6 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ x72 i;

    public /* synthetic */ f6(x72 x72Var, byte b) {
        this.h = b;
        this.i = x72Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        boolean z = true;
        x72 x72Var = this.i;
        switch (b) {
            case 0:
                x72Var.h = (lm0) obj;
                return Boolean.TRUE;
            case 1:
                pr0 pr0Var = (pr0) obj;
                if (uz0.g(pr0Var.q0(), "waiting")) {
                    x72Var.h = pr0Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                tt0 tt0Var = (tt0) obj;
                if (x72Var.h != null) {
                    tt0Var.getClass();
                } else if (tt0Var.x) {
                    x72Var.h = tt0Var;
                }
                return Boolean.TRUE;
            case 3:
                String str = (String) obj;
                str.getClass();
                Object obj2 = x72Var.h;
                if (obj2 != null && ((Bundle) obj2).containsKey(str)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                j80 j80Var = (yz2) obj;
                if (((qg1) j80Var).h.u) {
                    x72Var.h = j80Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                yz2 yz2Var = (yz2) obj;
                yz2Var.getClass();
                d71 d71Var = ((a03) yz2Var).v;
                List listS = (List) x72Var.h;
                if (listS != null) {
                    listS.add(d71Var);
                } else {
                    listS = lt.S(d71Var);
                }
                x72Var.h = listS;
                return xz2.i;
        }
    }
}
