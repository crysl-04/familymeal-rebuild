package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class po0 implements n3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yo0 b;

    public /* synthetic */ po0(yo0 yo0Var, byte b) {
        this.a = b;
        this.b = yo0Var;
    }

    @Override // defpackage.n3
    public final void a(Object obj) {
        byte b = this.a;
        yo0 yo0Var = this.b;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                uo0 uo0Var = (uo0) yo0Var.F.pollFirst();
                if (uo0Var != null) {
                    yo0Var.c.n(uo0Var.h);
                }
                break;
            case 1:
                m3 m3Var = (m3) obj;
                uo0 uo0Var2 = (uo0) yo0Var.F.pollLast();
                if (uo0Var2 != null) {
                    String str = uo0Var2.h;
                    int i2 = uo0Var2.i;
                    jo0 jo0VarN = yo0Var.c.n(str);
                    if (jo0VarN != null) {
                        jo0VarN.t(i2, m3Var.h, m3Var.i);
                    }
                }
                break;
            default:
                m3 m3Var2 = (m3) obj;
                uo0 uo0Var3 = (uo0) yo0Var.F.pollFirst();
                if (uo0Var3 != null) {
                    String str2 = uo0Var3.h;
                    int i3 = uo0Var3.i;
                    jo0 jo0VarN2 = yo0Var.c.n(str2);
                    if (jo0VarN2 != null) {
                        jo0VarN2.t(i3, m3Var2.h, m3Var2.i);
                    }
                }
                break;
        }
    }
}
