package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class aa implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ aa(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        String str;
        byte b = this.h;
        Object obj2 = null;
        j23 j23Var = j23.a;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                my1.k((my1) obj, (ny1) obj3, 0, 0);
                return j23Var;
            case 1:
                ((sq) obj3).cancel();
                return j23Var;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                for (Object obj4 : (List) ((sj1) obj3).getValue()) {
                    if (uz0.g(((dy1) obj4).a, str2)) {
                        obj2 = obj4;
                        dy1 dy1Var = (dy1) obj2;
                        return (dy1Var == null || (str = dy1Var.b) == null) ? str2 : str;
                    }
                }
                dy1 dy1Var2 = (dy1) obj2;
                if (dy1Var2 == null) {
                    return str2;
                }
            case 3:
                Throwable th = (Throwable) obj;
                sq2 sq2Var = (sq2) obj3;
                rq rqVar = sq2Var.j;
                if (rqVar != null) {
                    rqVar.l(th);
                }
                sq2Var.j = null;
                return j23Var;
            case 4:
                float[] fArr = ((ke1) obj).a;
                t31 t31Var = (t31) obj3;
                if (t31Var.C()) {
                    es.D(t31Var).K(t31Var, fArr);
                }
                return j23Var;
            default:
                String str3 = (String) obj;
                str3.getClass();
                String str4 = (String) ((ez1) obj3).i.get(str3);
                return str4 != null ? str4 : str3;
        }
    }
}
