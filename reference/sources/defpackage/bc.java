package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bc implements gb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public bc(ka0 ka0Var, pk1 pk1Var, ll2 ll2Var) {
        this.a = (byte) 1;
        this.c = ka0Var;
        this.d = pk1Var;
        this.b = ll2Var;
    }

    @Override // defpackage.gb0
    public final void a() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((ll2) obj3).remove(obj2);
                ((oc) obj).d.l(obj2);
                break;
            case 1:
                pk1 pk1Var = (pk1) obj;
                ((ka0) obj2).b().c(pk1Var);
                ((ll2) obj3).remove(pk1Var);
                break;
            case 2:
                ((e91) obj3).g().f((a91) obj2);
                break;
            case 3:
                ((e91) obj3).g().f((a91) obj2);
                ml1 ml1Var = (ml1) ((x72) obj).h;
                if (ml1Var != null) {
                    ml1Var.a.f(false);
                }
                break;
            default:
                pb2 pb2Var = (pb2) obj3;
                tb2 tb2Var = (tb2) obj;
                if (pb2Var.i.l(obj2) == tb2Var) {
                    Map map = pb2Var.h;
                    Map mapD = tb2Var.d();
                    if (!mapD.isEmpty()) {
                        map.put(obj2, mapD);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }

    public /* synthetic */ bc(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
