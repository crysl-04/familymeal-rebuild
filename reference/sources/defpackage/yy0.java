package defpackage;

import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yy0 implements Function {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ yy0(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.h;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                ix0 ix0Var = (ix0) obj2;
                oi1 oi1Var = new oi1(ix0Var, (ConcurrentHashMap.KeySetView) ix0Var.i, (Comparator) obj);
                ((CopyOnWriteArrayList) ix0Var.j).add(oi1Var);
                return oi1Var;
            default:
                ea1 ea1Var = (ea1) obj;
                Boolean bool = Boolean.TRUE;
                ((ds1) obj2).getClass();
                if (bool.equals(null)) {
                    return new n92(ea1Var);
                }
                if (Boolean.FALSE.equals(null)) {
                    return new d90(ea1Var);
                }
                long jG = ((long) ea1Var.g()) * ((long) ea1Var.i());
                double dI = ((double) ea1Var.i()) / ((double) ea1Var.g());
                return (jG >= 150000 || dI >= 5.0d || (jG >= 30000 && dI >= 3.0d)) ? new n92(ea1Var) : new d90(ea1Var);
        }
    }
}
