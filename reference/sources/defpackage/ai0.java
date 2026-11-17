package defpackage;

import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ai0 implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ii0 b;
    public final /* synthetic */ zh0 c;

    public /* synthetic */ ai0(ii0 ii0Var, zh0 zh0Var, byte b) {
        this.a = b;
        this.b = ii0Var;
        this.c = zh0Var;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        byte b = this.a;
        zh0 zh0Var = this.c;
        ii0 ii0Var = this.b;
        lo2 lo2Var = (lo2) obj;
        switch (b) {
            case 0:
                break;
        }
        return ii0Var.a.a.E(zh0Var.O(lo2Var, false));
    }
}
