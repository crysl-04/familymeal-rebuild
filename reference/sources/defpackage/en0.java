package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class en0 implements p00 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ en0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.p00
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                fn0 fn0Var = (fn0) obj;
                if (fn0Var == null) {
                    fn0Var = new fn0(-3);
                }
                ((ix0) this.b).N(fn0Var);
                return;
            default:
                fn0 fn0Var2 = (fn0) obj;
                synchronized (gn0.c) {
                    bj2 bj2Var = gn0.d;
                    ArrayList arrayList = (ArrayList) bj2Var.get((String) this.b);
                    if (arrayList == null) {
                        return;
                    }
                    bj2Var.remove((String) this.b);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((p00) arrayList.get(i)).accept(fn0Var2);
                    }
                    return;
                }
        }
    }
}
