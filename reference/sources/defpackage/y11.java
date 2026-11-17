package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y11 implements r21 {
    public static final y11 a = new y11();
    public static final th2 b = m02.b("kotlinx.serialization.json.JsonNull", vh2.i, new rh2[0]);

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        dt.t(v60Var);
        if (v60Var.e()) {
            throw new l11(lt.z(-1, "Expected 'null' literal", null, null, null));
        }
        return x11.INSTANCE;
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        ((x11) obj).getClass();
        dt.u(bVar);
        bVar.m();
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
