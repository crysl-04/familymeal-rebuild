package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class sm1 {
    public tk1 a;
    public boolean b;

    public dl1 a() {
        return new j3(this);
    }

    public final tk1 b() {
        tk1 tk1Var = this.a;
        if (tk1Var != null) {
            return tk1Var;
        }
        li1.g("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, vl1 vl1Var) {
        ij0 ij0Var = new ij0(new u80((byte) 1, new jc2((byte) 23), new ds2(new jv(list, (byte) 0), new z61(this, vl1Var, (byte) 8), (byte) 1)));
        while (ij0Var.hasNext()) {
            b().f((pk1) ij0Var.next());
        }
    }

    public void e(pk1 pk1Var, boolean z) {
        List list = (List) b().e.h.getValue();
        if (!list.contains(pk1Var)) {
            li1.n("popBackStack was called with ", pk1Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        pk1 pk1Var2 = null;
        while (f()) {
            pk1Var2 = (pk1) listIterator.previous();
            if (uz0.g(pk1Var2, pk1Var)) {
                break;
            }
        }
        if (pk1Var2 != null) {
            b().d(pk1Var2, z);
        }
    }

    public boolean f() {
        return true;
    }

    public dl1 c(dl1 dl1Var) {
        return dl1Var;
    }
}
