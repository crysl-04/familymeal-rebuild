package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sn implements r21 {
    public static final sn a = new sn();
    public static final j32 b = new j32("kotlin.Boolean", d32.i);

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        return Boolean.valueOf(v60Var.d());
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        bVar.b(((Boolean) obj).booleanValue());
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
