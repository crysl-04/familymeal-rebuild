package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i93 implements c91 {
    public final /* synthetic */ k10 h;
    public final /* synthetic */ kb i;
    public final /* synthetic */ l72 j;
    public final /* synthetic */ x72 k;

    public i93(k10 k10Var, kb kbVar, l72 l72Var, x72 x72Var) {
        this.h = k10Var;
        this.i = kbVar;
        this.j = l72Var;
        this.k = x72Var;
    }

    @Override // defpackage.c91
    public final void e(e91 e91Var, w81 w81Var) {
        boolean z;
        qq qqVarY = null;
        switch (h93.a[w81Var.ordinal()]) {
            case 1:
                ie1.p(this.h, null, new b9(this.k, this.j, e91Var, this, null, (byte) 8), 1);
                return;
            case 2:
                kb kbVar = this.i;
                if (kbVar != null) {
                    n31 n31Var = (n31) kbVar.j;
                    synchronized (n31Var.b) {
                        synchronized (n31Var.b) {
                            z = n31Var.a;
                        }
                        if (!z) {
                            ArrayList arrayList = (ArrayList) n31Var.c;
                            n31Var.c = (ArrayList) n31Var.d;
                            n31Var.d = arrayList;
                            n31Var.a = true;
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                ((m10) arrayList.get(i)).g(j23.a);
                            }
                            arrayList.clear();
                        }
                    }
                }
                l72 l72Var = this.j;
                synchronized (l72Var.c) {
                    if (l72Var.t) {
                        l72Var.t = false;
                        qqVarY = l72Var.y();
                    }
                    break;
                }
                if (qqVarY != null) {
                    ((rq) qqVarY).g(j23.a);
                    return;
                }
                return;
            case 3:
                l72 l72Var2 = this.j;
                synchronized (l72Var2.c) {
                    l72Var2.t = true;
                }
                return;
            case 4:
                this.j.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                wg.n();
                return;
        }
    }
}
