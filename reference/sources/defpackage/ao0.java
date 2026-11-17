package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ao0 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ao0(int i, Object obj, byte b) {
        this.h = b;
        this.i = i;
        this.j = obj;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj2 = this.j;
        int i = this.i;
        switch (b) {
            case 0:
                vp0 vp0Var = (vp0) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.length() <= i) {
                    vp0Var.h(str);
                }
                return j23Var;
            case 1:
                b71 b71Var = (b71) obj;
                k70 k70Var = ((c61) obj2).a;
                uk2 uk2VarN = y02.n();
                y02.u(uk2VarN, y02.q(uk2VarN), uk2VarN != null ? uk2VarN.e() : null);
                k70Var.getClass();
                int i2 = b71Var.a;
                if (i2 == -1) {
                    i2 = 2;
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    b71Var.a(i + i3);
                }
                return j23Var;
            case 2:
                x62 x62Var = (x62) obj2;
                String str2 = (String) obj;
                str2.getClass();
                ArrayList arrayListS0 = dv.S0(x62Var.e());
                String str3 = ((w62) arrayListS0.get(i)).a;
                str3.getClass();
                arrayListS0.set(i, new w62(str3, str2));
                x62Var.n.setValue(arrayListS0);
                return j23Var;
            default:
                return Boolean.valueOf(((List) obj).addAll(i, (Collection) obj2));
        }
    }

    public /* synthetic */ ao0(Object obj, int i, byte b) {
        this.h = b;
        this.j = obj;
        this.i = i;
    }
}
