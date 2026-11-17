package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g11 implements r21 {
    public static final g11 a = new g11();
    public static final f11 b = f11.b;

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        dt.t(v60Var);
        return new e11((List) new lh(q11.a).i(v60Var));
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        e11 e11Var = (e11) obj;
        e11Var.getClass();
        dt.u(bVar);
        q11 q11Var = q11.a;
        th2 th2Var = q11.b;
        th2Var.getClass();
        kh khVar = new kh(th2Var);
        List list = e11Var.h;
        int size = list.size();
        b bVarA = bVar.a(khVar);
        Iterator it = list.iterator();
        for (int i = 0; i < size; i++) {
            bVarA.o(khVar, i, q11Var, it.next());
        }
        bVarA.t(khVar);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
