package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
@rm1("dialog")
public final class ka0 extends sm1 {
    @Override // defpackage.sm1
    public final dl1 a() {
        return new ja0(this);
    }

    @Override // defpackage.sm1
    public final void d(List list, vl1 vl1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((pk1) it.next());
        }
    }

    @Override // defpackage.sm1
    public final void e(pk1 pk1Var, boolean z) {
        b().e(pk1Var, z);
        int iA0 = dv.A0((Iterable) b().f.h.getValue(), pk1Var);
        int i = 0;
        for (Object obj : (Iterable) b().f.h.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                lt.h0();
                throw null;
            }
            pk1 pk1Var2 = (pk1) obj;
            if (i > iA0) {
                b().c(pk1Var2);
            }
            i = i2;
        }
    }
}
