package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xp implements r21 {
    public static final xp a = new xp();
    public static final j32 b = new j32("kotlin.Byte", d32.j);

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        return Byte.valueOf(v60Var.v());
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        bVar.c(((Number) obj).byteValue());
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
