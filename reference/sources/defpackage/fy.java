package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
@rm1("composable")
public final class fy extends sm1 {
    public final lu1 c = rz1.x(Boolean.FALSE);

    @Override // defpackage.sm1
    public final dl1 a() {
        return new ey(this, aa3.k);
    }

    @Override // defpackage.sm1
    public final void d(List list, vl1 vl1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pk1 pk1Var = (pk1) it.next();
            tk1 tk1VarB = b();
            nn2 nn2Var = tk1VarB.e.h;
            pk1Var.getClass();
            nn2 nn2Var2 = tk1VarB.c;
            Iterable iterable = (Iterable) nn2Var2.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((pk1) it2.next()) == pk1Var) {
                            Iterable iterable2 = (Iterable) nn2Var.getValue();
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it3 = iterable2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((pk1) it3.next()) == pk1Var) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            pk1 pk1Var2 = (pk1) dv.G0((List) nn2Var.getValue());
            if (pk1Var2 != null) {
                nn2Var2.i(null, ci2.I((Set) nn2Var2.getValue(), pk1Var2));
            }
            nn2Var2.i(null, ci2.I((Set) nn2Var2.getValue(), pk1Var));
            tk1VarB.f(pk1Var);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // defpackage.sm1
    public final void e(pk1 pk1Var, boolean z) {
        b().e(pk1Var, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(pk1 pk1Var) {
        tk1 tk1VarB = b();
        pk1Var.getClass();
        nn2 nn2Var = tk1VarB.c;
        nn2Var.i(null, ci2.I((Set) nn2Var.getValue(), pk1Var));
        xk1 xk1Var = tk1VarB.h.b;
        xk1Var.getClass();
        if (!xk1Var.f.contains(pk1Var)) {
            li1.g("Cannot transition entry that is not in the back stack");
        } else {
            pk1Var.s = x81.k;
            pk1Var.e();
        }
    }
}
