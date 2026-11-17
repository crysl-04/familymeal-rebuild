package defpackage;

import java.util.Map;
import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c21 implements r21 {
    public static final c21 a = new c21();
    public static final b21 b = b21.b;

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        dt.t(v60Var);
        bo2 bo2Var = bo2.a;
        return new a21((Map) new ka1(q11.a).i(v60Var));
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        a21 a21Var = (a21) obj;
        a21Var.getClass();
        dt.u(bVar);
        bo2 bo2Var = bo2.a;
        new ka1(q11.a).c(bVar, a21Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
