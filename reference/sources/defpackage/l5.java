package defpackage;

import java.util.Set;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l5 implements Function {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Set i;

    public /* synthetic */ l5(Set set, byte b) {
        this.h = b;
        this.i = set;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.h;
        Set set = this.i;
        zh0 zh0Var = (zh0) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return zh0Var.G(set);
    }
}
