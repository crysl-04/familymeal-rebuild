package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface vc2 extends l1, xc2, yc2, zc2, Comparable, ko1 {
    BigDecimal F1();

    default vc2 I1(vc2 vc2Var) {
        return (vc2) f1((Comparable) vc2Var.get());
    }

    vc2 T0();

    Object X1();

    default vc2 m0(vc2 vc2Var) {
        return (vc2) R((Comparable) vc2Var.get());
    }

    default vc2 s1(vc2 vc2Var) {
        return (vc2) i((Comparable) vc2Var.get());
    }

    default vc2 z1(vc2 vc2Var) {
        return (vc2) i0((Comparable) vc2Var.get());
    }
}
