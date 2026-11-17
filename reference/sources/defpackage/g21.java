package defpackage;

import kotlinx.serialization.json.internal.a;
import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g21 implements r21 {
    public static final g21 a = new g21();
    public static final th2 b = m02.b("kotlinx.serialization.json.JsonPrimitive", d32.q, new rh2[0]);

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        a aVarT = dt.t(v60Var);
        n11 n11VarQ0 = aVarT.q0();
        if (n11VarQ0 instanceof f21) {
            return (f21) n11VarQ0;
        }
        throw new l11(lt.z(-1, "Unexpected JSON element, expected JsonPrimitive, had " + z72.a(n11VarQ0.getClass()), null, null, aVarT.r0().a.h ? lt.R(-1, n11VarQ0.toString()).toString() : null));
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        f21 f21Var = (f21) obj;
        f21Var.getClass();
        dt.u(bVar);
        if (f21Var instanceof x11) {
            bVar.p(y11.a, x11.INSTANCE);
        } else {
            bVar.p(v11.a, (u11) f21Var);
        }
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
