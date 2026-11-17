package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q11 implements r21 {
    public static final q11 a = new q11();
    public static final th2 b;

    static {
        rh2[] rh2VarArr = new rh2[0];
        vv0 vv0Var = new vv0((byte) 13);
        th2 th2Var = null;
        if (co2.X("kotlinx.serialization.json.JsonElement")) {
            wg.m("Blank serial names are prohibited");
        } else {
            po2 po2Var = po2.i;
            g12 g12Var = g12.i;
            if (g12Var.equals(po2Var)) {
                wg.m("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            } else {
                eu euVar = new eu("kotlinx.serialization.json.JsonElement");
                vv0Var.h(euVar);
                th2Var = new th2("kotlinx.serialization.json.JsonElement", g12Var, euVar.b.size(), gi.b0(rh2VarArr), euVar);
            }
        }
        b = th2Var;
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        return dt.t(v60Var).q0();
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        n11 n11Var = (n11) obj;
        n11Var.getClass();
        dt.u(bVar);
        if (n11Var instanceof f21) {
            bVar.p(g21.a, n11Var);
            return;
        }
        if (n11Var instanceof a21) {
            bVar.p(c21.a, n11Var);
        } else if (n11Var instanceof e11) {
            bVar.p(g11.a, n11Var);
        } else {
            wg.n();
        }
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
