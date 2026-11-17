package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j5 implements Function {
    public final /* synthetic */ byte h;

    public /* synthetic */ j5(byte b) {
        this.h = b;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.h) {
            case 0:
                return (a1) ((Supplier) obj).get();
            case 1:
                no2 no2Var = (no2) obj;
                return (60 >= no2Var.T() || no2Var.count() > 2147483639) ? new d62() : new x80(l52.q);
            case 2:
                no2 no2Var2 = (no2) obj;
                if (no2Var2.T() <= 0 || no2Var2.count() > 2147483639) {
                    a62 a62Var = new a62();
                    a62Var.o = h32.b;
                    a62Var.p = h32.a;
                    a62Var.q = 0;
                    a62Var.r = false;
                    return a62Var;
                }
                w80 w80Var = new w80(l52.q);
                w80Var.n = h32.b;
                w80Var.o = h32.a;
                w80Var.p = 0;
                w80Var.q = false;
                return w80Var;
            case 3:
                return new HashMap((Map) obj);
            case 4:
                return new ArrayList();
            case 5:
                return new um2((ea1) obj);
            default:
                return new d90((ea1) obj);
        }
    }
}
