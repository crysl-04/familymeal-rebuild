package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jy extends RuntimeException {
    public final fj1 h;
    public final fj1 i;
    public final ri1 j;
    public final int k;

    public jy(fj1 fj1Var, fj1 fj1Var2, ri1 ri1Var, int i, Exception exc) {
        super(exc);
        this.h = fj1Var;
        this.i = fj1Var2;
        this.j = ri1Var;
        this.k = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listP;
        oh2 oh2VarU = rz1.u(new iy(this, null));
        if (oh2VarU.hasNext()) {
            Object next = oh2VarU.next();
            if (oh2VarU.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (oh2VarU.hasNext()) {
                    arrayList.add(oh2VarU.next());
                }
                listP = arrayList;
            } else {
                listP = lt.P(next);
            }
        } else {
            listP = ag0.h;
        }
        return do2.I("\n            |Failed to execute op number " + this.k + ":\n            |" + dv.E0(dv.O0(50, listP), "\n", null, null, null, 62) + "\n            ");
    }
}
